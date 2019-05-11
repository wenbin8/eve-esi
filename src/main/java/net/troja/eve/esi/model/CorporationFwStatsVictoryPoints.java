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
 * Summary of victory points gained by the given corporation for the enlisted
 * faction
 */
@ApiModel(description = "Summary of victory points gained by the given corporation for the enlisted faction")
public class CorporationFwStatsVictoryPoints implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_YESTERDAY = "yesterday";
    @SerializedName(SERIALIZED_NAME_YESTERDAY)
    private Integer yesterday;

    public static final String SERIALIZED_NAME_TOTAL = "total";
    @SerializedName(SERIALIZED_NAME_TOTAL)
    private Integer total;

    public static final String SERIALIZED_NAME_LAST_WEEK = "last_week";
    @SerializedName(SERIALIZED_NAME_LAST_WEEK)
    private Integer lastWeek;

    public CorporationFwStatsVictoryPoints yesterday(Integer yesterday) {
        this.yesterday = yesterday;
        return this;
    }

    /**
     * Yesterday&#39;s victory points gained by members of the given corporation
     * 
     * @return yesterday
     **/
    @ApiModelProperty(required = true, value = "Yesterday's victory points gained by members of the given corporation")
    public Integer getYesterday() {
        return yesterday;
    }

    public void setYesterday(Integer yesterday) {
        this.yesterday = yesterday;
    }

    public CorporationFwStatsVictoryPoints total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Total victory points gained since the given corporation enlisted
     * 
     * @return total
     **/
    @ApiModelProperty(required = true, value = "Total victory points gained since the given corporation enlisted")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public CorporationFwStatsVictoryPoints lastWeek(Integer lastWeek) {
        this.lastWeek = lastWeek;
        return this;
    }

    /**
     * Last week&#39;s victory points gained by members of the given corporation
     * 
     * @return lastWeek
     **/
    @ApiModelProperty(required = true, value = "Last week's victory points gained by members of the given corporation")
    public Integer getLastWeek() {
        return lastWeek;
    }

    public void setLastWeek(Integer lastWeek) {
        this.lastWeek = lastWeek;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationFwStatsVictoryPoints corporationFwStatsVictoryPoints = (CorporationFwStatsVictoryPoints) o;
        return Objects.equals(this.yesterday, corporationFwStatsVictoryPoints.yesterday)
                && Objects.equals(this.total, corporationFwStatsVictoryPoints.total)
                && Objects.equals(this.lastWeek, corporationFwStatsVictoryPoints.lastWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yesterday, total, lastWeek);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationFwStatsVictoryPoints {\n");
        sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
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
