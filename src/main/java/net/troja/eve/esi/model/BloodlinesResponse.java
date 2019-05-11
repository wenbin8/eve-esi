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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class BloodlinesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SHIP_TYPE_ID = "ship_type_id";
    @SerializedName(SERIALIZED_NAME_SHIP_TYPE_ID)
    private Integer shipTypeId;

    public static final String SERIALIZED_NAME_CORPORATION_ID = "corporation_id";
    @SerializedName(SERIALIZED_NAME_CORPORATION_ID)
    private Integer corporationId;

    public static final String SERIALIZED_NAME_MEMORY = "memory";
    @SerializedName(SERIALIZED_NAME_MEMORY)
    private Integer memory;

    public static final String SERIALIZED_NAME_WILLPOWER = "willpower";
    @SerializedName(SERIALIZED_NAME_WILLPOWER)
    private Integer willpower;

    public static final String SERIALIZED_NAME_RACE_ID = "race_id";
    @SerializedName(SERIALIZED_NAME_RACE_ID)
    private Integer raceId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_BLOODLINE_ID = "bloodline_id";
    @SerializedName(SERIALIZED_NAME_BLOODLINE_ID)
    private Integer bloodlineId;

    public static final String SERIALIZED_NAME_CHARISMA = "charisma";
    @SerializedName(SERIALIZED_NAME_CHARISMA)
    private Integer charisma;

    public static final String SERIALIZED_NAME_INTELLIGENCE = "intelligence";
    @SerializedName(SERIALIZED_NAME_INTELLIGENCE)
    private Integer intelligence;

    public static final String SERIALIZED_NAME_PERCEPTION = "perception";
    @SerializedName(SERIALIZED_NAME_PERCEPTION)
    private Integer perception;

    public BloodlinesResponse shipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
        return this;
    }

    /**
     * ship_type_id integer
     * 
     * @return shipTypeId
     **/
    @ApiModelProperty(required = true, value = "ship_type_id integer")
    public Integer getShipTypeId() {
        return shipTypeId;
    }

    public void setShipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
    }

    public BloodlinesResponse corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * corporation_id integer
     * 
     * @return corporationId
     **/
    @ApiModelProperty(required = true, value = "corporation_id integer")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public BloodlinesResponse memory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * memory integer
     * 
     * @return memory
     **/
    @ApiModelProperty(required = true, value = "memory integer")
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public BloodlinesResponse willpower(Integer willpower) {
        this.willpower = willpower;
        return this;
    }

    /**
     * willpower integer
     * 
     * @return willpower
     **/
    @ApiModelProperty(required = true, value = "willpower integer")
    public Integer getWillpower() {
        return willpower;
    }

    public void setWillpower(Integer willpower) {
        this.willpower = willpower;
    }

    public BloodlinesResponse raceId(Integer raceId) {
        this.raceId = raceId;
        return this;
    }

    /**
     * race_id integer
     * 
     * @return raceId
     **/
    @ApiModelProperty(required = true, value = "race_id integer")
    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public BloodlinesResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BloodlinesResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(required = true, value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BloodlinesResponse bloodlineId(Integer bloodlineId) {
        this.bloodlineId = bloodlineId;
        return this;
    }

    /**
     * bloodline_id integer
     * 
     * @return bloodlineId
     **/
    @ApiModelProperty(required = true, value = "bloodline_id integer")
    public Integer getBloodlineId() {
        return bloodlineId;
    }

    public void setBloodlineId(Integer bloodlineId) {
        this.bloodlineId = bloodlineId;
    }

    public BloodlinesResponse charisma(Integer charisma) {
        this.charisma = charisma;
        return this;
    }

    /**
     * charisma integer
     * 
     * @return charisma
     **/
    @ApiModelProperty(required = true, value = "charisma integer")
    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public BloodlinesResponse intelligence(Integer intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    /**
     * intelligence integer
     * 
     * @return intelligence
     **/
    @ApiModelProperty(required = true, value = "intelligence integer")
    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public BloodlinesResponse perception(Integer perception) {
        this.perception = perception;
        return this;
    }

    /**
     * perception integer
     * 
     * @return perception
     **/
    @ApiModelProperty(required = true, value = "perception integer")
    public Integer getPerception() {
        return perception;
    }

    public void setPerception(Integer perception) {
        this.perception = perception;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BloodlinesResponse bloodlinesResponse = (BloodlinesResponse) o;
        return Objects.equals(this.shipTypeId, bloodlinesResponse.shipTypeId)
                && Objects.equals(this.corporationId, bloodlinesResponse.corporationId)
                && Objects.equals(this.memory, bloodlinesResponse.memory)
                && Objects.equals(this.willpower, bloodlinesResponse.willpower)
                && Objects.equals(this.raceId, bloodlinesResponse.raceId)
                && Objects.equals(this.name, bloodlinesResponse.name)
                && Objects.equals(this.description, bloodlinesResponse.description)
                && Objects.equals(this.bloodlineId, bloodlinesResponse.bloodlineId)
                && Objects.equals(this.charisma, bloodlinesResponse.charisma)
                && Objects.equals(this.intelligence, bloodlinesResponse.intelligence)
                && Objects.equals(this.perception, bloodlinesResponse.perception);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipTypeId, corporationId, memory, willpower, raceId, name, description, bloodlineId,
                charisma, intelligence, perception);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BloodlinesResponse {\n");
        sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    willpower: ").append(toIndentedString(willpower)).append("\n");
        sb.append("    raceId: ").append(toIndentedString(raceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bloodlineId: ").append(toIndentedString(bloodlineId)).append("\n");
        sb.append("    charisma: ").append(toIndentedString(charisma)).append("\n");
        sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
        sb.append("    perception: ").append(toIndentedString(perception)).append("\n");
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
