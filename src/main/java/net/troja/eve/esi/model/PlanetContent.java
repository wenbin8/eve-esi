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
 * content object
 */
@ApiModel(description = "content object")
public class PlanetContent implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private Long amount;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public PlanetContent amount(Long amount) {
        this.amount = amount;
        return this;
    }

    /**
     * amount integer
     * 
     * @return amount
     **/
    @ApiModelProperty(required = true, value = "amount integer")
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public PlanetContent typeId(Integer typeId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetContent planetContent = (PlanetContent) o;
        return Objects.equals(this.amount, planetContent.amount) && Objects.equals(this.typeId, planetContent.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetContent {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
