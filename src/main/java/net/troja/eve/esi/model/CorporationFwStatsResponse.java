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
import java.time.OffsetDateTime;
import net.troja.eve.esi.model.CorporationFwStatsKills;
import net.troja.eve.esi.model.CorporationFwStatsVictoryPoints;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationFwStatsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_KILLS = "kills";
    @SerializedName(SERIALIZED_NAME_KILLS)
    private CorporationFwStatsKills kills = null;

    public static final String SERIALIZED_NAME_PILOTS = "pilots";
    @SerializedName(SERIALIZED_NAME_PILOTS)
    private Integer pilots;

    public static final String SERIALIZED_NAME_ENLISTED_ON = "enlisted_on";
    @SerializedName(SERIALIZED_NAME_ENLISTED_ON)
    private OffsetDateTime enlistedOn;

    public static final String SERIALIZED_NAME_VICTORY_POINTS = "victory_points";
    @SerializedName(SERIALIZED_NAME_VICTORY_POINTS)
    private CorporationFwStatsVictoryPoints victoryPoints = null;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    public CorporationFwStatsResponse kills(CorporationFwStatsKills kills) {
        this.kills = kills;
        return this;
    }

    /**
     * Get kills
     * 
     * @return kills
     **/
    @ApiModelProperty(required = true, value = "")
    public CorporationFwStatsKills getKills() {
        return kills;
    }

    public void setKills(CorporationFwStatsKills kills) {
        this.kills = kills;
    }

    public CorporationFwStatsResponse pilots(Integer pilots) {
        this.pilots = pilots;
        return this;
    }

    /**
     * How many pilots the enlisted corporation has. Will not be included if
     * corporation is not enlisted in faction warfare
     * 
     * @return pilots
     **/
    @ApiModelProperty(value = "How many pilots the enlisted corporation has. Will not be included if corporation is not enlisted in faction warfare")
    public Integer getPilots() {
        return pilots;
    }

    public void setPilots(Integer pilots) {
        this.pilots = pilots;
    }

    public CorporationFwStatsResponse enlistedOn(OffsetDateTime enlistedOn) {
        this.enlistedOn = enlistedOn;
        return this;
    }

    /**
     * The enlistment date of the given corporation into faction warfare. Will
     * not be included if corporation is not enlisted in faction warfare
     * 
     * @return enlistedOn
     **/
    @ApiModelProperty(value = "The enlistment date of the given corporation into faction warfare. Will not be included if corporation is not enlisted in faction warfare")
    public OffsetDateTime getEnlistedOn() {
        return enlistedOn;
    }

    public void setEnlistedOn(OffsetDateTime enlistedOn) {
        this.enlistedOn = enlistedOn;
    }

    public CorporationFwStatsResponse victoryPoints(CorporationFwStatsVictoryPoints victoryPoints) {
        this.victoryPoints = victoryPoints;
        return this;
    }

    /**
     * Get victoryPoints
     * 
     * @return victoryPoints
     **/
    @ApiModelProperty(required = true, value = "")
    public CorporationFwStatsVictoryPoints getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(CorporationFwStatsVictoryPoints victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public CorporationFwStatsResponse factionId(Integer factionId) {
        this.factionId = factionId;
        return this;
    }

    /**
     * The faction the given corporation is enlisted to fight for. Will not be
     * included if corporation is not enlisted in faction warfare
     * 
     * @return factionId
     **/
    @ApiModelProperty(value = "The faction the given corporation is enlisted to fight for. Will not be included if corporation is not enlisted in faction warfare")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationFwStatsResponse corporationFwStatsResponse = (CorporationFwStatsResponse) o;
        return Objects.equals(this.kills, corporationFwStatsResponse.kills)
                && Objects.equals(this.pilots, corporationFwStatsResponse.pilots)
                && Objects.equals(this.enlistedOn, corporationFwStatsResponse.enlistedOn)
                && Objects.equals(this.victoryPoints, corporationFwStatsResponse.victoryPoints)
                && Objects.equals(this.factionId, corporationFwStatsResponse.factionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kills, pilots, enlistedOn, victoryPoints, factionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationFwStatsResponse {\n");
        sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
        sb.append("    pilots: ").append(toIndentedString(pilots)).append("\n");
        sb.append("    enlistedOn: ").append(toIndentedString(enlistedOn)).append("\n");
        sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
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
