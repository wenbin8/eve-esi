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
public class NewContactNotificationsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SEND_DATE = "send_date";
    @SerializedName(SERIALIZED_NAME_SEND_DATE)
    private OffsetDateTime sendDate;

    public static final String SERIALIZED_NAME_SENDER_CHARACTER_ID = "sender_character_id";
    @SerializedName(SERIALIZED_NAME_SENDER_CHARACTER_ID)
    private Integer senderCharacterId;

    public static final String SERIALIZED_NAME_STANDING_LEVEL = "standing_level";
    @SerializedName(SERIALIZED_NAME_STANDING_LEVEL)
    private Float standingLevel;

    public static final String SERIALIZED_NAME_NOTIFICATION_ID = "notification_id";
    @SerializedName(SERIALIZED_NAME_NOTIFICATION_ID)
    private Integer notificationId;

    public static final String SERIALIZED_NAME_MESSAGE = "message";
    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public NewContactNotificationsResponse sendDate(OffsetDateTime sendDate) {
        this.sendDate = sendDate;
        return this;
    }

    /**
     * send_date string
     * 
     * @return sendDate
     **/
    @ApiModelProperty(required = true, value = "send_date string")
    public OffsetDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(OffsetDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public NewContactNotificationsResponse senderCharacterId(Integer senderCharacterId) {
        this.senderCharacterId = senderCharacterId;
        return this;
    }

    /**
     * sender_character_id integer
     * 
     * @return senderCharacterId
     **/
    @ApiModelProperty(required = true, value = "sender_character_id integer")
    public Integer getSenderCharacterId() {
        return senderCharacterId;
    }

    public void setSenderCharacterId(Integer senderCharacterId) {
        this.senderCharacterId = senderCharacterId;
    }

    public NewContactNotificationsResponse standingLevel(Float standingLevel) {
        this.standingLevel = standingLevel;
        return this;
    }

    /**
     * A number representing the standing level the receiver has been added at
     * by the sender. The standing levels are as follows: -10 -&gt; Terrible |
     * -5 -&gt; Bad | 0 -&gt; Neutral | 5 -&gt; Good | 10 -&gt; Excellent
     * 
     * @return standingLevel
     **/
    @ApiModelProperty(required = true, value = "A number representing the standing level the receiver has been added at by the sender. The standing levels are as follows: -10 -> Terrible | -5 -> Bad |  0 -> Neutral |  5 -> Good |  10 -> Excellent")
    public Float getStandingLevel() {
        return standingLevel;
    }

    public void setStandingLevel(Float standingLevel) {
        this.standingLevel = standingLevel;
    }

    public NewContactNotificationsResponse notificationId(Integer notificationId) {
        this.notificationId = notificationId;
        return this;
    }

    /**
     * notification_id integer
     * 
     * @return notificationId
     **/
    @ApiModelProperty(required = true, value = "notification_id integer")
    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public NewContactNotificationsResponse message(String message) {
        this.message = message;
        return this;
    }

    /**
     * message string
     * 
     * @return message
     **/
    @ApiModelProperty(required = true, value = "message string")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewContactNotificationsResponse newContactNotificationsResponse = (NewContactNotificationsResponse) o;
        return Objects.equals(this.sendDate, newContactNotificationsResponse.sendDate)
                && Objects.equals(this.senderCharacterId, newContactNotificationsResponse.senderCharacterId)
                && Objects.equals(this.standingLevel, newContactNotificationsResponse.standingLevel)
                && Objects.equals(this.notificationId, newContactNotificationsResponse.notificationId)
                && Objects.equals(this.message, newContactNotificationsResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendDate, senderCharacterId, standingLevel, notificationId, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewContactNotificationsResponse {\n");
        sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
        sb.append("    senderCharacterId: ").append(toIndentedString(senderCharacterId)).append("\n");
        sb.append("    standingLevel: ").append(toIndentedString(standingLevel)).append("\n");
        sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
