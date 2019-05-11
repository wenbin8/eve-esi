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
public class AllianceContactsLabelsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LABEL_NAME = "label_name";
    @SerializedName(SERIALIZED_NAME_LABEL_NAME)
    private String labelName;

    public static final String SERIALIZED_NAME_LABEL_ID = "label_id";
    @SerializedName(SERIALIZED_NAME_LABEL_ID)
    private Long labelId;

    public AllianceContactsLabelsResponse labelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * label_name string
     * 
     * @return labelName
     **/
    @ApiModelProperty(required = true, value = "label_name string")
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public AllianceContactsLabelsResponse labelId(Long labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * label_id integer
     * 
     * @return labelId
     **/
    @ApiModelProperty(required = true, value = "label_id integer")
    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllianceContactsLabelsResponse allianceContactsLabelsResponse = (AllianceContactsLabelsResponse) o;
        return Objects.equals(this.labelName, allianceContactsLabelsResponse.labelName)
                && Objects.equals(this.labelId, allianceContactsLabelsResponse.labelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelName, labelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllianceContactsLabelsResponse {\n");
        sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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
