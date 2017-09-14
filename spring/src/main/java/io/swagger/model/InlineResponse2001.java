package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-14T02:48:30.681Z")

public class InlineResponse2001   {
  @JsonProperty("shift-state")
  private String shiftState = null;

  @JsonProperty("speed")
  private Double speed = null;

  @JsonProperty("latitude")
  private Double latitude = null;

  @JsonProperty("longitude")
  private Double longitude = null;

  @JsonProperty("heading")
  private Integer heading = null;

  public InlineResponse2001 shiftState(String shiftState) {
    this.shiftState = shiftState;
    return this;
  }

   /**
   * Get shiftState
   * @return shiftState
  **/
  @ApiModelProperty(example = "sport", value = "")
  public String getShiftState() {
    return shiftState;
  }

  public void setShiftState(String shiftState) {
    this.shiftState = shiftState;
  }

  public InlineResponse2001 speed(Double speed) {
    this.speed = speed;
    return this;
  }

   /**
   * Get speed
   * @return speed
  **/
  @ApiModelProperty(example = "94.5", value = "")
  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public InlineResponse2001 latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * degree north of equator
   * @return latitude
  **/
  @ApiModelProperty(example = "37.4292", value = "degree north of equator")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public InlineResponse2001 longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * degree west of the prime meridian
   * @return longitude
  **/
  @ApiModelProperty(example = "122.1381", value = "degree west of the prime meridian")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public InlineResponse2001 heading(Integer heading) {
    this.heading = heading;
    return this;
  }

   /**
   * integer compass heading
   * minimum: 0
   * maximum: 359
   * @return heading
  **/
  @ApiModelProperty(example = "6", value = "integer compass heading")
  public Integer getHeading() {
    return heading;
  }

  public void setHeading(Integer heading) {
    this.heading = heading;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.shiftState, inlineResponse2001.shiftState) &&
        Objects.equals(this.speed, inlineResponse2001.speed) &&
        Objects.equals(this.latitude, inlineResponse2001.latitude) &&
        Objects.equals(this.longitude, inlineResponse2001.longitude) &&
        Objects.equals(this.heading, inlineResponse2001.heading);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shiftState, speed, latitude, longitude, heading);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    shiftState: ").append(toIndentedString(shiftState)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
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

