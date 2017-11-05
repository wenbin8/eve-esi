/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.Aggressor;
import net.troja.eve.esi.model.Defender;
import net.troja.eve.esi.model.WarAlly;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class WarResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("declared")
    private OffsetDateTime declared = null;

    @JsonProperty("started")
    private OffsetDateTime started = null;

    @JsonProperty("retracted")
    private OffsetDateTime retracted = null;

    @JsonProperty("finished")
    private OffsetDateTime finished = null;

    @JsonProperty("mutual")
    private Boolean mutual = null;

    @JsonProperty("open_for_allies")
    private Boolean openForAllies = null;

    @JsonProperty("aggressor")
    private Aggressor aggressor = null;

    @JsonProperty("defender")
    private Defender defender = null;

    @JsonProperty("allies")
    private List<WarAlly> allies = new ArrayList<WarAlly>();

    public WarResponse id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the specified war
     * 
     * @return id
     **/
    @ApiModelProperty(example = "null", required = true, value = "ID of the specified war")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WarResponse declared(OffsetDateTime declared) {
        this.declared = declared;
        return this;
    }

    /**
     * Time that the war was declared
     * 
     * @return declared
     **/
    @ApiModelProperty(example = "null", required = true, value = "Time that the war was declared")
    public OffsetDateTime getDeclared() {
        return declared;
    }

    public void setDeclared(OffsetDateTime declared) {
        this.declared = declared;
    }

    public WarResponse started(OffsetDateTime started) {
        this.started = started;
        return this;
    }

    /**
     * Time when the war started and both sides could shoot each other
     * 
     * @return started
     **/
    @ApiModelProperty(example = "null", value = "Time when the war started and both sides could shoot each other")
    public OffsetDateTime getStarted() {
        return started;
    }

    public void setStarted(OffsetDateTime started) {
        this.started = started;
    }

    public WarResponse retracted(OffsetDateTime retracted) {
        this.retracted = retracted;
        return this;
    }

    /**
     * Time the war was retracted but both sides could still shoot each other
     * 
     * @return retracted
     **/
    @ApiModelProperty(example = "null", value = "Time the war was retracted but both sides could still shoot each other")
    public OffsetDateTime getRetracted() {
        return retracted;
    }

    public void setRetracted(OffsetDateTime retracted) {
        this.retracted = retracted;
    }

    public WarResponse finished(OffsetDateTime finished) {
        this.finished = finished;
        return this;
    }

    /**
     * Time the war ended and shooting was no longer allowed
     * 
     * @return finished
     **/
    @ApiModelProperty(example = "null", value = "Time the war ended and shooting was no longer allowed")
    public OffsetDateTime getFinished() {
        return finished;
    }

    public void setFinished(OffsetDateTime finished) {
        this.finished = finished;
    }

    public WarResponse mutual(Boolean mutual) {
        this.mutual = mutual;
        return this;
    }

    /**
     * Was the war declared mutual by both parties
     * 
     * @return mutual
     **/
    @ApiModelProperty(example = "null", required = true, value = "Was the war declared mutual by both parties")
    public Boolean getMutual() {
        return mutual;
    }

    public void setMutual(Boolean mutual) {
        this.mutual = mutual;
    }

    public WarResponse openForAllies(Boolean openForAllies) {
        this.openForAllies = openForAllies;
        return this;
    }

    /**
     * Is the war currently open for allies or not
     * 
     * @return openForAllies
     **/
    @ApiModelProperty(example = "null", required = true, value = "Is the war currently open for allies or not")
    public Boolean getOpenForAllies() {
        return openForAllies;
    }

    public void setOpenForAllies(Boolean openForAllies) {
        this.openForAllies = openForAllies;
    }

    public WarResponse aggressor(Aggressor aggressor) {
        this.aggressor = aggressor;
        return this;
    }

    /**
     * Get aggressor
     * 
     * @return aggressor
     **/
    @ApiModelProperty(example = "null", value = "")
    public Aggressor getAggressor() {
        return aggressor;
    }

    public void setAggressor(Aggressor aggressor) {
        this.aggressor = aggressor;
    }

    public WarResponse defender(Defender defender) {
        this.defender = defender;
        return this;
    }

    /**
     * Get defender
     * 
     * @return defender
     **/
    @ApiModelProperty(example = "null", value = "")
    public Defender getDefender() {
        return defender;
    }

    public void setDefender(Defender defender) {
        this.defender = defender;
    }

    public WarResponse allies(List<WarAlly> allies) {
        this.allies = allies;
        return this;
    }

    public WarResponse addAlliesItem(WarAlly alliesItem) {
        this.allies.add(alliesItem);
        return this;
    }

    /**
     * allied corporations or alliances, each object contains either
     * corporation_id or alliance_id
     * 
     * @return allies
     **/
    @ApiModelProperty(example = "null", value = "allied corporations or alliances, each object contains either corporation_id or alliance_id")
    public List<WarAlly> getAllies() {
        return allies;
    }

    public void setAllies(List<WarAlly> allies) {
        this.allies = allies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WarResponse warResponse = (WarResponse) o;
        return Objects.equals(this.id, warResponse.id) && Objects.equals(this.declared, warResponse.declared)
                && Objects.equals(this.started, warResponse.started)
                && Objects.equals(this.retracted, warResponse.retracted)
                && Objects.equals(this.finished, warResponse.finished)
                && Objects.equals(this.mutual, warResponse.mutual)
                && Objects.equals(this.openForAllies, warResponse.openForAllies)
                && Objects.equals(this.aggressor, warResponse.aggressor)
                && Objects.equals(this.defender, warResponse.defender)
                && Objects.equals(this.allies, warResponse.allies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, declared, started, retracted, finished, mutual, openForAllies, aggressor, defender,
                allies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarResponse {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    declared: ").append(toIndentedString(declared)).append("\n");
        sb.append("    started: ").append(toIndentedString(started)).append("\n");
        sb.append("    retracted: ").append(toIndentedString(retracted)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    mutual: ").append(toIndentedString(mutual)).append("\n");
        sb.append("    openForAllies: ").append(toIndentedString(openForAllies)).append("\n");
        sb.append("    aggressor: ").append(toIndentedString(aggressor)).append("\n");
        sb.append("    defender: ").append(toIndentedString(defender)).append("\n");
        sb.append("    allies: ").append(toIndentedString(allies)).append("\n");
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
