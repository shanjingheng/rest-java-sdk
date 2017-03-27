/**
 * Easemob REST APIs
 * Easemob Server REST API Swagger is designated to provide better documentation and thorough interfaces for testing. For more details about server implementation, request rate limitation, etc, please visit [Easemob Server Integration](http://docs.easemob.com/im/100serverintegration/10intro).    **Note:**  `org_ID` is the unique ID of the organization created when you first registered [Easemob console](https://console.easemob.com/).                          `app_name` is the unique app ID created when you new application in [Easemob console](https://console.easemob.com/).            `Authorization token` is required for most API requests as part of requesting header in the format `Bearer ${token}`. You can obtain the token via [/{org_name}/{app_name}/token](https://docs.hyphenate.io/docs/server-overview#section-request-authentication-token).                                             
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserName;


/**
 * Chatroom
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-22T17:09:55.999+08:00")
public class Chatroom   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("maxusers")
  private Integer maxusers = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("members")
  private UserName members = null;

  public Chatroom name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Chatroom description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Chatroom maxusers(Integer maxusers) {
    this.maxusers = maxusers;
    return this;
  }

   /**
   * Get maxusers
   * @return maxusers
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxusers() {
    return maxusers;
  }

  public void setMaxusers(Integer maxusers) {
    this.maxusers = maxusers;
  }

  public Chatroom owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Chatroom members(UserName members) {
    this.members = members;
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserName getMembers() {
    return members;
  }

  public void setMembers(UserName members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chatroom chatroom = (Chatroom) o;
    return Objects.equals(this.name, chatroom.name) &&
        Objects.equals(this.description, chatroom.description) &&
        Objects.equals(this.maxusers, chatroom.maxusers) &&
        Objects.equals(this.owner, chatroom.owner) &&
        Objects.equals(this.members, chatroom.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, maxusers, owner, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chatroom {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    maxusers: ").append(toIndentedString(maxusers)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

