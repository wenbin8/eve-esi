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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class PublicContractsItemsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("is_blueprint_copy")
    private Boolean isBlueprintCopy = null;

    @JsonProperty("is_included")
    private Boolean isIncluded = null;

    @JsonProperty("item_id")
    private Long itemId = null;

    @JsonProperty("material_efficiency")
    private Integer materialEfficiency = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("record_id")
    private Long recordId = null;

    @JsonProperty("runs")
    private Integer runs = null;

    @JsonProperty("time_efficiency")
    private Integer timeEfficiency = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    public PublicContractsItemsResponse isBlueprintCopy(Boolean isBlueprintCopy) {
        this.isBlueprintCopy = isBlueprintCopy;
        return this;
    }

    /**
     * is_blueprint_copy boolean
     * 
     * @return isBlueprintCopy
     **/
    @ApiModelProperty(example = "null", value = "is_blueprint_copy boolean")
    public Boolean getIsBlueprintCopy() {
        return isBlueprintCopy;
    }

    public void setIsBlueprintCopy(Boolean isBlueprintCopy) {
        this.isBlueprintCopy = isBlueprintCopy;
    }

    public PublicContractsItemsResponse isIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
        return this;
    }

    /**
     * true if the contract issuer has submitted this item with the contract,
     * false if the isser is asking for this item in the contract
     * 
     * @return isIncluded
     **/
    @ApiModelProperty(example = "null", required = true, value = "true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract")
    public Boolean getIsIncluded() {
        return isIncluded;
    }

    public void setIsIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
    }

    public PublicContractsItemsResponse itemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * Unique ID for the item being sold. Not present if item is being requested
     * by contract rather than sold with contract
     * 
     * @return itemId
     **/
    @ApiModelProperty(example = "null", value = "Unique ID for the item being sold. Not present if item is being requested by contract rather than sold with contract")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public PublicContractsItemsResponse materialEfficiency(Integer materialEfficiency) {
        this.materialEfficiency = materialEfficiency;
        return this;
    }

    /**
     * Material Efficiency Level of the blueprint minimum: 0 maximum: 25
     * 
     * @return materialEfficiency
     **/
    @ApiModelProperty(example = "null", value = "Material Efficiency Level of the blueprint")
    public Integer getMaterialEfficiency() {
        return materialEfficiency;
    }

    public void setMaterialEfficiency(Integer materialEfficiency) {
        this.materialEfficiency = materialEfficiency;
    }

    public PublicContractsItemsResponse quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Number of items in the stack
     * 
     * @return quantity
     **/
    @ApiModelProperty(example = "null", required = true, value = "Number of items in the stack")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public PublicContractsItemsResponse recordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * Unique ID for the item, used by the contract system
     * 
     * @return recordId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Unique ID for the item, used by the contract system")
    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public PublicContractsItemsResponse runs(Integer runs) {
        this.runs = runs;
        return this;
    }

    /**
     * Number of runs remaining if the blueprint is a copy, -1 if it is an
     * original minimum: -1
     * 
     * @return runs
     **/
    @ApiModelProperty(example = "null", value = "Number of runs remaining if the blueprint is a copy, -1 if it is an original")
    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public PublicContractsItemsResponse timeEfficiency(Integer timeEfficiency) {
        this.timeEfficiency = timeEfficiency;
        return this;
    }

    /**
     * Time Efficiency Level of the blueprint minimum: 0 maximum: 20
     * 
     * @return timeEfficiency
     **/
    @ApiModelProperty(example = "null", value = "Time Efficiency Level of the blueprint")
    public Integer getTimeEfficiency() {
        return timeEfficiency;
    }

    public void setTimeEfficiency(Integer timeEfficiency) {
        this.timeEfficiency = timeEfficiency;
    }

    public PublicContractsItemsResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * Type ID for item
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Type ID for item")
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
        PublicContractsItemsResponse publicContractsItemsResponse = (PublicContractsItemsResponse) o;
        return Objects.equals(this.isBlueprintCopy, publicContractsItemsResponse.isBlueprintCopy)
                && Objects.equals(this.isIncluded, publicContractsItemsResponse.isIncluded)
                && Objects.equals(this.itemId, publicContractsItemsResponse.itemId)
                && Objects.equals(this.materialEfficiency, publicContractsItemsResponse.materialEfficiency)
                && Objects.equals(this.quantity, publicContractsItemsResponse.quantity)
                && Objects.equals(this.recordId, publicContractsItemsResponse.recordId)
                && Objects.equals(this.runs, publicContractsItemsResponse.runs)
                && Objects.equals(this.timeEfficiency, publicContractsItemsResponse.timeEfficiency)
                && Objects.equals(this.typeId, publicContractsItemsResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBlueprintCopy, isIncluded, itemId, materialEfficiency, quantity, recordId, runs,
                timeEfficiency, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicContractsItemsResponse {\n");

        sb.append("    isBlueprintCopy: ").append(toIndentedString(isBlueprintCopy)).append("\n");
        sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    materialEfficiency: ").append(toIndentedString(materialEfficiency)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
        sb.append("    timeEfficiency: ").append(toIndentedString(timeEfficiency)).append("\n");
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
