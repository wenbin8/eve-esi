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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class PublicContractsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_REWARD = "reward";
    @SerializedName(SERIALIZED_NAME_REWARD)
    private Double reward;

    public static final String SERIALIZED_NAME_END_LOCATION_ID = "end_location_id";
    @SerializedName(SERIALIZED_NAME_END_LOCATION_ID)
    private Long endLocationId;

    public static final String SERIALIZED_NAME_ISSUER_CORPORATION_ID = "issuer_corporation_id";
    @SerializedName(SERIALIZED_NAME_ISSUER_CORPORATION_ID)
    private Integer issuerCorporationId;

    public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
    @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
    private Integer contractId;

    public static final String SERIALIZED_NAME_DAYS_TO_COMPLETE = "days_to_complete";
    @SerializedName(SERIALIZED_NAME_DAYS_TO_COMPLETE)
    private Integer daysToComplete;

    public static final String SERIALIZED_NAME_BUYOUT = "buyout";
    @SerializedName(SERIALIZED_NAME_BUYOUT)
    private Double buyout;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    /**
     * Type of the contract
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        UNKNOWN("unknown"),

        ITEM_EXCHANGE("item_exchange"),

        AUCTION("auction"),

        COURIER("courier"),

        LOAN("loan");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private TypeEnum type;

    public static final String SERIALIZED_NAME_DATE_EXPIRED = "date_expired";
    @SerializedName(SERIALIZED_NAME_DATE_EXPIRED)
    private OffsetDateTime dateExpired;

    public static final String SERIALIZED_NAME_START_LOCATION_ID = "start_location_id";
    @SerializedName(SERIALIZED_NAME_START_LOCATION_ID)
    private Long startLocationId;

    public static final String SERIALIZED_NAME_VOLUME = "volume";
    @SerializedName(SERIALIZED_NAME_VOLUME)
    private Double volume;

    public static final String SERIALIZED_NAME_ISSUER_ID = "issuer_id";
    @SerializedName(SERIALIZED_NAME_ISSUER_ID)
    private Integer issuerId;

    public static final String SERIALIZED_NAME_DATE_ISSUED = "date_issued";
    @SerializedName(SERIALIZED_NAME_DATE_ISSUED)
    private OffsetDateTime dateIssued;

    public static final String SERIALIZED_NAME_PRICE = "price";
    @SerializedName(SERIALIZED_NAME_PRICE)
    private Double price;

    public static final String SERIALIZED_NAME_FOR_CORPORATION = "for_corporation";
    @SerializedName(SERIALIZED_NAME_FOR_CORPORATION)
    private Boolean forCorporation;

    public static final String SERIALIZED_NAME_COLLATERAL = "collateral";
    @SerializedName(SERIALIZED_NAME_COLLATERAL)
    private Double collateral;

    public PublicContractsResponse reward(Double reward) {
        this.reward = reward;
        return this;
    }

    /**
     * Remuneration for contract (for Couriers only)
     * 
     * @return reward
     **/
    @ApiModelProperty(value = "Remuneration for contract (for Couriers only)")
    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    public PublicContractsResponse endLocationId(Long endLocationId) {
        this.endLocationId = endLocationId;
        return this;
    }

    /**
     * End location ID (for Couriers contract)
     * 
     * @return endLocationId
     **/
    @ApiModelProperty(value = "End location ID (for Couriers contract)")
    public Long getEndLocationId() {
        return endLocationId;
    }

    public void setEndLocationId(Long endLocationId) {
        this.endLocationId = endLocationId;
    }

    public PublicContractsResponse issuerCorporationId(Integer issuerCorporationId) {
        this.issuerCorporationId = issuerCorporationId;
        return this;
    }

    /**
     * Character&#39;s corporation ID for the issuer
     * 
     * @return issuerCorporationId
     **/
    @ApiModelProperty(required = true, value = "Character's corporation ID for the issuer")
    public Integer getIssuerCorporationId() {
        return issuerCorporationId;
    }

    public void setIssuerCorporationId(Integer issuerCorporationId) {
        this.issuerCorporationId = issuerCorporationId;
    }

    public PublicContractsResponse contractId(Integer contractId) {
        this.contractId = contractId;
        return this;
    }

    /**
     * contract_id integer
     * 
     * @return contractId
     **/
    @ApiModelProperty(required = true, value = "contract_id integer")
    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public PublicContractsResponse daysToComplete(Integer daysToComplete) {
        this.daysToComplete = daysToComplete;
        return this;
    }

    /**
     * Number of days to perform the contract
     * 
     * @return daysToComplete
     **/
    @ApiModelProperty(value = "Number of days to perform the contract")
    public Integer getDaysToComplete() {
        return daysToComplete;
    }

    public void setDaysToComplete(Integer daysToComplete) {
        this.daysToComplete = daysToComplete;
    }

    public PublicContractsResponse buyout(Double buyout) {
        this.buyout = buyout;
        return this;
    }

    /**
     * Buyout price (for Auctions only)
     * 
     * @return buyout
     **/
    @ApiModelProperty(value = "Buyout price (for Auctions only)")
    public Double getBuyout() {
        return buyout;
    }

    public void setBuyout(Double buyout) {
        this.buyout = buyout;
    }

    public PublicContractsResponse title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Title of the contract
     * 
     * @return title
     **/
    @ApiModelProperty(value = "Title of the contract")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PublicContractsResponse type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the contract
     * 
     * @return type
     **/
    @ApiModelProperty(required = true, value = "Type of the contract")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PublicContractsResponse dateExpired(OffsetDateTime dateExpired) {
        this.dateExpired = dateExpired;
        return this;
    }

    /**
     * Expiration date of the contract
     * 
     * @return dateExpired
     **/
    @ApiModelProperty(required = true, value = "Expiration date of the contract")
    public OffsetDateTime getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(OffsetDateTime dateExpired) {
        this.dateExpired = dateExpired;
    }

    public PublicContractsResponse startLocationId(Long startLocationId) {
        this.startLocationId = startLocationId;
        return this;
    }

    /**
     * Start location ID (for Couriers contract)
     * 
     * @return startLocationId
     **/
    @ApiModelProperty(value = "Start location ID (for Couriers contract)")
    public Long getStartLocationId() {
        return startLocationId;
    }

    public void setStartLocationId(Long startLocationId) {
        this.startLocationId = startLocationId;
    }

    public PublicContractsResponse volume(Double volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Volume of items in the contract
     * 
     * @return volume
     **/
    @ApiModelProperty(value = "Volume of items in the contract")
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public PublicContractsResponse issuerId(Integer issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * Character ID for the issuer
     * 
     * @return issuerId
     **/
    @ApiModelProperty(required = true, value = "Character ID for the issuer")
    public Integer getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Integer issuerId) {
        this.issuerId = issuerId;
    }

    public PublicContractsResponse dateIssued(OffsetDateTime dateIssued) {
        this.dateIssued = dateIssued;
        return this;
    }

    /**
     * Сreation date of the contract
     * 
     * @return dateIssued
     **/
    @ApiModelProperty(required = true, value = "Сreation date of the contract")
    public OffsetDateTime getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(OffsetDateTime dateIssued) {
        this.dateIssued = dateIssued;
    }

    public PublicContractsResponse price(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Price of contract (for ItemsExchange and Auctions)
     * 
     * @return price
     **/
    @ApiModelProperty(value = "Price of contract (for ItemsExchange and Auctions)")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PublicContractsResponse forCorporation(Boolean forCorporation) {
        this.forCorporation = forCorporation;
        return this;
    }

    /**
     * true if the contract was issued on behalf of the issuer&#39;s corporation
     * 
     * @return forCorporation
     **/
    @ApiModelProperty(value = "true if the contract was issued on behalf of the issuer's corporation")
    public Boolean getForCorporation() {
        return forCorporation;
    }

    public void setForCorporation(Boolean forCorporation) {
        this.forCorporation = forCorporation;
    }

    public PublicContractsResponse collateral(Double collateral) {
        this.collateral = collateral;
        return this;
    }

    /**
     * Collateral price (for Couriers only)
     * 
     * @return collateral
     **/
    @ApiModelProperty(value = "Collateral price (for Couriers only)")
    public Double getCollateral() {
        return collateral;
    }

    public void setCollateral(Double collateral) {
        this.collateral = collateral;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicContractsResponse publicContractsResponse = (PublicContractsResponse) o;
        return Objects.equals(this.reward, publicContractsResponse.reward)
                && Objects.equals(this.endLocationId, publicContractsResponse.endLocationId)
                && Objects.equals(this.issuerCorporationId, publicContractsResponse.issuerCorporationId)
                && Objects.equals(this.contractId, publicContractsResponse.contractId)
                && Objects.equals(this.daysToComplete, publicContractsResponse.daysToComplete)
                && Objects.equals(this.buyout, publicContractsResponse.buyout)
                && Objects.equals(this.title, publicContractsResponse.title)
                && Objects.equals(this.type, publicContractsResponse.type)
                && Objects.equals(this.dateExpired, publicContractsResponse.dateExpired)
                && Objects.equals(this.startLocationId, publicContractsResponse.startLocationId)
                && Objects.equals(this.volume, publicContractsResponse.volume)
                && Objects.equals(this.issuerId, publicContractsResponse.issuerId)
                && Objects.equals(this.dateIssued, publicContractsResponse.dateIssued)
                && Objects.equals(this.price, publicContractsResponse.price)
                && Objects.equals(this.forCorporation, publicContractsResponse.forCorporation)
                && Objects.equals(this.collateral, publicContractsResponse.collateral);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reward, endLocationId, issuerCorporationId, contractId, daysToComplete, buyout, title,
                type, dateExpired, startLocationId, volume, issuerId, dateIssued, price, forCorporation, collateral);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicContractsResponse {\n");
        sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
        sb.append("    endLocationId: ").append(toIndentedString(endLocationId)).append("\n");
        sb.append("    issuerCorporationId: ").append(toIndentedString(issuerCorporationId)).append("\n");
        sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
        sb.append("    daysToComplete: ").append(toIndentedString(daysToComplete)).append("\n");
        sb.append("    buyout: ").append(toIndentedString(buyout)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dateExpired: ").append(toIndentedString(dateExpired)).append("\n");
        sb.append("    startLocationId: ").append(toIndentedString(startLocationId)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    forCorporation: ").append(toIndentedString(forCorporation)).append("\n");
        sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
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
