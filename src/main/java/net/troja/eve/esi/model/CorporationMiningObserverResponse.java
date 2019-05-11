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
import java.time.LocalDate;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationMiningObserverResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
    @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
    private LocalDate lastUpdated;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";
    @SerializedName(SERIALIZED_NAME_QUANTITY)
    private Long quantity;

    public static final String SERIALIZED_NAME_RECORDED_CORPORATION_ID = "recorded_corporation_id";
    @SerializedName(SERIALIZED_NAME_RECORDED_CORPORATION_ID)
    private Integer recordedCorporationId;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public static final String SERIALIZED_NAME_CHARACTER_ID = "character_id";
    @SerializedName(SERIALIZED_NAME_CHARACTER_ID)
    private Integer characterId;

    public CorporationMiningObserverResponse lastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * last_updated string
     * 
     * @return lastUpdated
     **/
    @ApiModelProperty(required = true, value = "last_updated string")
    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public CorporationMiningObserverResponse quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * quantity integer
     * 
     * @return quantity
     **/
    @ApiModelProperty(required = true, value = "quantity integer")
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public CorporationMiningObserverResponse recordedCorporationId(Integer recordedCorporationId) {
        this.recordedCorporationId = recordedCorporationId;
        return this;
    }

    /**
     * The corporation id of the character at the time data was recorded.
     * 
     * @return recordedCorporationId
     **/
    @ApiModelProperty(required = true, value = "The corporation id of the character at the time data was recorded. ")
    public Integer getRecordedCorporationId() {
        return recordedCorporationId;
    }

    public void setRecordedCorporationId(Integer recordedCorporationId) {
        this.recordedCorporationId = recordedCorporationId;
    }

    public CorporationMiningObserverResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public CorporationMiningObserverResponse characterId(Integer characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * The character that did the mining
     * 
     * @return characterId
     **/
    @ApiModelProperty(required = true, value = "The character that did the mining ")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationMiningObserverResponse corporationMiningObserverResponse = (CorporationMiningObserverResponse) o;
        return Objects.equals(this.lastUpdated, corporationMiningObserverResponse.lastUpdated)
                && Objects.equals(this.quantity, corporationMiningObserverResponse.quantity)
                && Objects.equals(this.recordedCorporationId, corporationMiningObserverResponse.recordedCorporationId)
                && Objects.equals(this.typeId, corporationMiningObserverResponse.typeId)
                && Objects.equals(this.characterId, corporationMiningObserverResponse.characterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdated, quantity, recordedCorporationId, typeId, characterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationMiningObserverResponse {\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    recordedCorporationId: ").append(toIndentedString(recordedCorporationId)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
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
