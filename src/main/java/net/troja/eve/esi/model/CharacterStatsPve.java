/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * pve object
 */
@ApiModel(description = "pve object")
public class CharacterStatsPve implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_MISSIONS_SUCCEEDED = "missions_succeeded";
    @SerializedName(SERIALIZED_NAME_MISSIONS_SUCCEEDED)
    private Long missionsSucceeded;

    public static final String SERIALIZED_NAME_DUNGEONS_COMPLETED_AGENT = "dungeons_completed_agent";
    @SerializedName(SERIALIZED_NAME_DUNGEONS_COMPLETED_AGENT)
    private Long dungeonsCompletedAgent;

    public static final String SERIALIZED_NAME_DUNGEONS_COMPLETED_DISTRIBUTION = "dungeons_completed_distribution";
    @SerializedName(SERIALIZED_NAME_DUNGEONS_COMPLETED_DISTRIBUTION)
    private Long dungeonsCompletedDistribution;

    public static final String SERIALIZED_NAME_MISSIONS_SUCCEEDED_EPIC_ARC = "missions_succeeded_epic_arc";
    @SerializedName(SERIALIZED_NAME_MISSIONS_SUCCEEDED_EPIC_ARC)
    private Long missionsSucceededEpicArc;

    public CharacterStatsPve missionsSucceeded(Long missionsSucceeded) {
        this.missionsSucceeded = missionsSucceeded;
        return this;
    }

    /**
     * missions_succeeded integer
     * 
     * @return missionsSucceeded
     **/
    @ApiModelProperty(value = "missions_succeeded integer")
    public Long getMissionsSucceeded() {
        return missionsSucceeded;
    }

    public void setMissionsSucceeded(Long missionsSucceeded) {
        this.missionsSucceeded = missionsSucceeded;
    }

    public CharacterStatsPve dungeonsCompletedAgent(Long dungeonsCompletedAgent) {
        this.dungeonsCompletedAgent = dungeonsCompletedAgent;
        return this;
    }

    /**
     * dungeons_completed_agent integer
     * 
     * @return dungeonsCompletedAgent
     **/
    @ApiModelProperty(value = "dungeons_completed_agent integer")
    public Long getDungeonsCompletedAgent() {
        return dungeonsCompletedAgent;
    }

    public void setDungeonsCompletedAgent(Long dungeonsCompletedAgent) {
        this.dungeonsCompletedAgent = dungeonsCompletedAgent;
    }

    public CharacterStatsPve dungeonsCompletedDistribution(Long dungeonsCompletedDistribution) {
        this.dungeonsCompletedDistribution = dungeonsCompletedDistribution;
        return this;
    }

    /**
     * dungeons_completed_distribution integer
     * 
     * @return dungeonsCompletedDistribution
     **/
    @ApiModelProperty(value = "dungeons_completed_distribution integer")
    public Long getDungeonsCompletedDistribution() {
        return dungeonsCompletedDistribution;
    }

    public void setDungeonsCompletedDistribution(Long dungeonsCompletedDistribution) {
        this.dungeonsCompletedDistribution = dungeonsCompletedDistribution;
    }

    public CharacterStatsPve missionsSucceededEpicArc(Long missionsSucceededEpicArc) {
        this.missionsSucceededEpicArc = missionsSucceededEpicArc;
        return this;
    }

    /**
     * missions_succeeded_epic_arc integer
     * 
     * @return missionsSucceededEpicArc
     **/
    @ApiModelProperty(value = "missions_succeeded_epic_arc integer")
    public Long getMissionsSucceededEpicArc() {
        return missionsSucceededEpicArc;
    }

    public void setMissionsSucceededEpicArc(Long missionsSucceededEpicArc) {
        this.missionsSucceededEpicArc = missionsSucceededEpicArc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStatsPve characterStatsPve = (CharacterStatsPve) o;
        return Objects.equals(this.missionsSucceeded, characterStatsPve.missionsSucceeded)
                && Objects.equals(this.dungeonsCompletedAgent, characterStatsPve.dungeonsCompletedAgent)
                && Objects.equals(this.dungeonsCompletedDistribution, characterStatsPve.dungeonsCompletedDistribution)
                && Objects.equals(this.missionsSucceededEpicArc, characterStatsPve.missionsSucceededEpicArc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(missionsSucceeded, dungeonsCompletedAgent, dungeonsCompletedDistribution,
                missionsSucceededEpicArc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStatsPve {\n");
        sb.append("    missionsSucceeded: ").append(toIndentedString(missionsSucceeded)).append("\n");
        sb.append("    dungeonsCompletedAgent: ").append(toIndentedString(dungeonsCompletedAgent)).append("\n");
        sb.append("    dungeonsCompletedDistribution: ").append(toIndentedString(dungeonsCompletedDistribution))
                .append("\n");
        sb.append("    missionsSucceededEpicArc: ").append(toIndentedString(missionsSucceededEpicArc)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
