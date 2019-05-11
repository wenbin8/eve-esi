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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.TypeDogmaAttribute;
import net.troja.eve.esi.model.TypeDogmaEffect;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class TypeResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public static final String SERIALIZED_NAME_MASS = "mass";
    @SerializedName(SERIALIZED_NAME_MASS)
    private Float mass;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_PUBLISHED = "published";
    @SerializedName(SERIALIZED_NAME_PUBLISHED)
    private Boolean published;

    public static final String SERIALIZED_NAME_ICON_ID = "icon_id";
    @SerializedName(SERIALIZED_NAME_ICON_ID)
    private Integer iconId;

    public static final String SERIALIZED_NAME_PACKAGED_VOLUME = "packaged_volume";
    @SerializedName(SERIALIZED_NAME_PACKAGED_VOLUME)
    private Float packagedVolume;

    public static final String SERIALIZED_NAME_GRAPHIC_ID = "graphic_id";
    @SerializedName(SERIALIZED_NAME_GRAPHIC_ID)
    private Integer graphicId;

    public static final String SERIALIZED_NAME_CAPACITY = "capacity";
    @SerializedName(SERIALIZED_NAME_CAPACITY)
    private Float capacity;

    public static final String SERIALIZED_NAME_VOLUME = "volume";
    @SerializedName(SERIALIZED_NAME_VOLUME)
    private Float volume;

    public static final String SERIALIZED_NAME_PORTION_SIZE = "portion_size";
    @SerializedName(SERIALIZED_NAME_PORTION_SIZE)
    private Integer portionSize;

    public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
    @SerializedName(SERIALIZED_NAME_GROUP_ID)
    private Integer groupId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_DOGMA_ATTRIBUTES = "dogma_attributes";
    @SerializedName(SERIALIZED_NAME_DOGMA_ATTRIBUTES)
    private List<TypeDogmaAttribute> dogmaAttributes = new ArrayList<>();

    public static final String SERIALIZED_NAME_MARKET_GROUP_ID = "market_group_id";
    @SerializedName(SERIALIZED_NAME_MARKET_GROUP_ID)
    private Integer marketGroupId;

    public static final String SERIALIZED_NAME_RADIUS = "radius";
    @SerializedName(SERIALIZED_NAME_RADIUS)
    private Float radius;

    public static final String SERIALIZED_NAME_DOGMA_EFFECTS = "dogma_effects";
    @SerializedName(SERIALIZED_NAME_DOGMA_EFFECTS)
    private List<TypeDogmaEffect> dogmaEffects = new ArrayList<>();

    public TypeResponse typeId(Integer typeId) {
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

    public TypeResponse mass(Float mass) {
        this.mass = mass;
        return this;
    }

    /**
     * mass number
     * 
     * @return mass
     **/
    @ApiModelProperty(value = "mass number")
    public Float getMass() {
        return mass;
    }

    public void setMass(Float mass) {
        this.mass = mass;
    }

    public TypeResponse description(String description) {
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

    public TypeResponse published(Boolean published) {
        this.published = published;
        return this;
    }

    /**
     * published boolean
     * 
     * @return published
     **/
    @ApiModelProperty(required = true, value = "published boolean")
    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public TypeResponse iconId(Integer iconId) {
        this.iconId = iconId;
        return this;
    }

    /**
     * icon_id integer
     * 
     * @return iconId
     **/
    @ApiModelProperty(value = "icon_id integer")
    public Integer getIconId() {
        return iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    public TypeResponse packagedVolume(Float packagedVolume) {
        this.packagedVolume = packagedVolume;
        return this;
    }

    /**
     * packaged_volume number
     * 
     * @return packagedVolume
     **/
    @ApiModelProperty(value = "packaged_volume number")
    public Float getPackagedVolume() {
        return packagedVolume;
    }

    public void setPackagedVolume(Float packagedVolume) {
        this.packagedVolume = packagedVolume;
    }

    public TypeResponse graphicId(Integer graphicId) {
        this.graphicId = graphicId;
        return this;
    }

    /**
     * graphic_id integer
     * 
     * @return graphicId
     **/
    @ApiModelProperty(value = "graphic_id integer")
    public Integer getGraphicId() {
        return graphicId;
    }

    public void setGraphicId(Integer graphicId) {
        this.graphicId = graphicId;
    }

    public TypeResponse capacity(Float capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * capacity number
     * 
     * @return capacity
     **/
    @ApiModelProperty(value = "capacity number")
    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public TypeResponse volume(Float volume) {
        this.volume = volume;
        return this;
    }

    /**
     * volume number
     * 
     * @return volume
     **/
    @ApiModelProperty(value = "volume number")
    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public TypeResponse portionSize(Integer portionSize) {
        this.portionSize = portionSize;
        return this;
    }

    /**
     * portion_size integer
     * 
     * @return portionSize
     **/
    @ApiModelProperty(value = "portion_size integer")
    public Integer getPortionSize() {
        return portionSize;
    }

    public void setPortionSize(Integer portionSize) {
        this.portionSize = portionSize;
    }

    public TypeResponse groupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * group_id integer
     * 
     * @return groupId
     **/
    @ApiModelProperty(required = true, value = "group_id integer")
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public TypeResponse name(String name) {
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

    public TypeResponse dogmaAttributes(List<TypeDogmaAttribute> dogmaAttributes) {
        this.dogmaAttributes = dogmaAttributes;
        return this;
    }

    public TypeResponse addDogmaAttributesItem(TypeDogmaAttribute dogmaAttributesItem) {
        if (this.dogmaAttributes == null) {
            this.dogmaAttributes = new ArrayList<>();
        }
        this.dogmaAttributes.add(dogmaAttributesItem);
        return this;
    }

    /**
     * dogma_attributes array
     * 
     * @return dogmaAttributes
     **/
    @ApiModelProperty(value = "dogma_attributes array")
    public List<TypeDogmaAttribute> getDogmaAttributes() {
        return dogmaAttributes;
    }

    public void setDogmaAttributes(List<TypeDogmaAttribute> dogmaAttributes) {
        this.dogmaAttributes = dogmaAttributes;
    }

    public TypeResponse marketGroupId(Integer marketGroupId) {
        this.marketGroupId = marketGroupId;
        return this;
    }

    /**
     * This only exists for types that can be put on the market
     * 
     * @return marketGroupId
     **/
    @ApiModelProperty(value = "This only exists for types that can be put on the market")
    public Integer getMarketGroupId() {
        return marketGroupId;
    }

    public void setMarketGroupId(Integer marketGroupId) {
        this.marketGroupId = marketGroupId;
    }

    public TypeResponse radius(Float radius) {
        this.radius = radius;
        return this;
    }

    /**
     * radius number
     * 
     * @return radius
     **/
    @ApiModelProperty(value = "radius number")
    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public TypeResponse dogmaEffects(List<TypeDogmaEffect> dogmaEffects) {
        this.dogmaEffects = dogmaEffects;
        return this;
    }

    public TypeResponse addDogmaEffectsItem(TypeDogmaEffect dogmaEffectsItem) {
        if (this.dogmaEffects == null) {
            this.dogmaEffects = new ArrayList<>();
        }
        this.dogmaEffects.add(dogmaEffectsItem);
        return this;
    }

    /**
     * dogma_effects array
     * 
     * @return dogmaEffects
     **/
    @ApiModelProperty(value = "dogma_effects array")
    public List<TypeDogmaEffect> getDogmaEffects() {
        return dogmaEffects;
    }

    public void setDogmaEffects(List<TypeDogmaEffect> dogmaEffects) {
        this.dogmaEffects = dogmaEffects;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TypeResponse typeResponse = (TypeResponse) o;
        return Objects.equals(this.typeId, typeResponse.typeId) && Objects.equals(this.mass, typeResponse.mass)
                && Objects.equals(this.description, typeResponse.description)
                && Objects.equals(this.published, typeResponse.published)
                && Objects.equals(this.iconId, typeResponse.iconId)
                && Objects.equals(this.packagedVolume, typeResponse.packagedVolume)
                && Objects.equals(this.graphicId, typeResponse.graphicId)
                && Objects.equals(this.capacity, typeResponse.capacity)
                && Objects.equals(this.volume, typeResponse.volume)
                && Objects.equals(this.portionSize, typeResponse.portionSize)
                && Objects.equals(this.groupId, typeResponse.groupId) && Objects.equals(this.name, typeResponse.name)
                && Objects.equals(this.dogmaAttributes, typeResponse.dogmaAttributes)
                && Objects.equals(this.marketGroupId, typeResponse.marketGroupId)
                && Objects.equals(this.radius, typeResponse.radius)
                && Objects.equals(this.dogmaEffects, typeResponse.dogmaEffects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, mass, description, published, iconId, packagedVolume, graphicId, capacity, volume,
                portionSize, groupId, name, dogmaAttributes, marketGroupId, radius, dogmaEffects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeResponse {\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    mass: ").append(toIndentedString(mass)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    published: ").append(toIndentedString(published)).append("\n");
        sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
        sb.append("    packagedVolume: ").append(toIndentedString(packagedVolume)).append("\n");
        sb.append("    graphicId: ").append(toIndentedString(graphicId)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    portionSize: ").append(toIndentedString(portionSize)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dogmaAttributes: ").append(toIndentedString(dogmaAttributes)).append("\n");
        sb.append("    marketGroupId: ").append(toIndentedString(marketGroupId)).append("\n");
        sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
        sb.append("    dogmaEffects: ").append(toIndentedString(dogmaEffects)).append("\n");
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
