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


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UploadAndDownloadFilesApi {
    private ApiClient apiClient;

    public UploadAndDownloadFilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UploadAndDownloadFilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for orgNameAppNameChatfilesFilestreamGet */
    private com.squareup.okhttp.Call orgNameAppNameChatfilesFilestreamGetCall(String orgName, String appName, String authorization, String filestream, String shareSecret, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'orgName' is set
        if (orgName == null) {
            throw new ApiException("Missing the required parameter 'orgName' when calling orgNameAppNameChatfilesFilestreamGet(Async)");
        }
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new ApiException("Missing the required parameter 'appName' when calling orgNameAppNameChatfilesFilestreamGet(Async)");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling orgNameAppNameChatfilesFilestreamGet(Async)");
        }
        
        // verify the required parameter 'filestream' is set
        if (filestream == null) {
            throw new ApiException("Missing the required parameter 'filestream' when calling orgNameAppNameChatfilesFilestreamGet(Async)");
        }
        
        // verify the required parameter 'shareSecret' is set
        if (shareSecret == null) {
            throw new ApiException("Missing the required parameter 'shareSecret' when calling orgNameAppNameChatfilesFilestreamGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{org_name}/{app_name}/chatfiles/{filestream}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "org_name" + "\\}", apiClient.escapeString(orgName.toString()))
        .replaceAll("\\{" + "app_name" + "\\}", apiClient.escapeString(appName.toString()))
        .replaceAll("\\{" + "filestream" + "\\}", apiClient.escapeString(filestream.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (shareSecret != null)
        localVarHeaderParams.put("share-secret", apiClient.parameterToString(shareSecret));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Download the voice / image file
     * It should be noted that the need to bring in the HTTP header to return the share-secret and the current login user&#39;s token can be downloaded, and pay attention to the implementation of the header accept value needs to be set to application / octet-stream.
     * @param orgName Organization ID (required)
     * @param appName Application name (required)
     * @param authorization Bearer ${token} (required)
     * @param filestream uuid from previous successful uploading response (required)
     * @param shareSecret share-secret from previous successful uploading response (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File orgNameAppNameChatfilesFilestreamGet(String orgName, String appName, String authorization, String filestream, String shareSecret) throws ApiException {
        ApiResponse<File> resp = orgNameAppNameChatfilesFilestreamGetWithHttpInfo(orgName, appName, authorization, filestream, shareSecret);
        return resp.getData();
    }

    /**
     * Download the voice / image file
     * It should be noted that the need to bring in the HTTP header to return the share-secret and the current login user&#39;s token can be downloaded, and pay attention to the implementation of the header accept value needs to be set to application / octet-stream.
     * @param orgName Organization ID (required)
     * @param appName Application name (required)
     * @param authorization Bearer ${token} (required)
     * @param filestream uuid from previous successful uploading response (required)
     * @param shareSecret share-secret from previous successful uploading response (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> orgNameAppNameChatfilesFilestreamGetWithHttpInfo(String orgName, String appName, String authorization, String filestream, String shareSecret) throws ApiException {
        com.squareup.okhttp.Call call = orgNameAppNameChatfilesFilestreamGetCall(orgName, appName, authorization, filestream, shareSecret, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download the voice / image file (asynchronously)
     * It should be noted that the need to bring in the HTTP header to return the share-secret and the current login user&#39;s token can be downloaded, and pay attention to the implementation of the header accept value needs to be set to application / octet-stream.
     * @param orgName Organization ID (required)
     * @param appName Application name (required)
     * @param authorization Bearer ${token} (required)
     * @param filestream uuid from previous successful uploading response (required)
     * @param shareSecret share-secret from previous successful uploading response (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orgNameAppNameChatfilesFilestreamGetAsync(String orgName, String appName, String authorization, String filestream, String shareSecret, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = orgNameAppNameChatfilesFilestreamGetCall(orgName, appName, authorization, filestream, shareSecret, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for orgNameAppNameChatfilesPost */
    private com.squareup.okhttp.Call orgNameAppNameChatfilesPostCall(String orgName, String appName, String authorization, File file, Boolean restrictAccess, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'orgName' is set
        if (orgName == null) {
            throw new ApiException("Missing the required parameter 'orgName' when calling orgNameAppNameChatfilesPost(Async)");
        }
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new ApiException("Missing the required parameter 'appName' when calling orgNameAppNameChatfilesPost(Async)");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling orgNameAppNameChatfilesPost(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling orgNameAppNameChatfilesPost(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{org_name}/{app_name}/chatfiles".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "org_name" + "\\}", apiClient.escapeString(orgName.toString()))
        .replaceAll("\\{" + "app_name" + "\\}", apiClient.escapeString(appName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (restrictAccess != null)
        localVarHeaderParams.put("restrict-access", apiClient.parameterToString(restrictAccess));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null)
        localVarFormParams.put("file", file);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Upload a File
     * Warning: File cannot be over 10MB, otherwise will fail. Important: Be sure keep the \&quot;uuid\&quot; and \&quot;share-secret\&quot;, which are requirement when downloading particular file.
     * @param orgName Organization ID (required)
     * @param appName Application name (required)
     * @param authorization Bearer ${token} (required)
     * @param file  (required)
     * @param restrictAccess \&quot;restrict-access\&quot; determines whether later the file require \&quot;share-secret\&quot; for access or allow public access.  (optional, default to )
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String orgNameAppNameChatfilesPost(String orgName, String appName, String authorization, File file, Boolean restrictAccess) throws ApiException {
        ApiResponse<String> resp = orgNameAppNameChatfilesPostWithHttpInfo(orgName, appName, authorization, file, restrictAccess);
        return resp.getData();
    }

    /**
     * Upload a File
     * Warning: File cannot be over 10MB, otherwise will fail. Important: Be sure keep the \&quot;uuid\&quot; and \&quot;share-secret\&quot;, which are requirement when downloading particular file.
     * @param orgName Organization ID (required)
     * @param appName Application name (required)
     * @param authorization Bearer ${token} (required)
     * @param file  (required)
     * @param restrictAccess \&quot;restrict-access\&quot; determines whether later the file require \&quot;share-secret\&quot; for access or allow public access.  (optional, default to )
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> orgNameAppNameChatfilesPostWithHttpInfo(String orgName, String appName, String authorization, File file, Boolean restrictAccess) throws ApiException {
        com.squareup.okhttp.Call call = orgNameAppNameChatfilesPostCall(orgName, appName, authorization, file, restrictAccess, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload a File (asynchronously)
     * Warning: File cannot be over 10MB, otherwise will fail. Important: Be sure keep the \&quot;uuid\&quot; and \&quot;share-secret\&quot;, which are requirement when downloading particular file.
     * @param orgName Organization ID (required)
     * @param appName Application name (required)
     * @param authorization Bearer ${token} (required)
     * @param file  (required)
     * @param restrictAccess \&quot;restrict-access\&quot; determines whether later the file require \&quot;share-secret\&quot; for access or allow public access.  (optional, default to )
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orgNameAppNameChatfilesPostAsync(String orgName, String appName, String authorization, File file, Boolean restrictAccess, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = orgNameAppNameChatfilesPostCall(orgName, appName, authorization, file, restrictAccess, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for orgNameAppNameChatfilesUuidGet */
    private com.squareup.okhttp.Call orgNameAppNameChatfilesUuidGetCall(String orgName, String appName, String authorization, String uuid, String shareSecret, Boolean thumbnail, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'orgName' is set
        if (orgName == null) {
            throw new ApiException("Missing the required parameter 'orgName' when calling orgNameAppNameChatfilesUuidGet(Async)");
        }
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new ApiException("Missing the required parameter 'appName' when calling orgNameAppNameChatfilesUuidGet(Async)");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling orgNameAppNameChatfilesUuidGet(Async)");
        }
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling orgNameAppNameChatfilesUuidGet(Async)");
        }
        
        // verify the required parameter 'shareSecret' is set
        if (shareSecret == null) {
            throw new ApiException("Missing the required parameter 'shareSecret' when calling orgNameAppNameChatfilesUuidGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{org_name}/{app_name}/chatfiles/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "org_name" + "\\}", apiClient.escapeString(orgName.toString()))
        .replaceAll("\\{" + "app_name" + "\\}", apiClient.escapeString(appName.toString()))
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (shareSecret != null)
        localVarHeaderParams.put("share-secret", apiClient.parameterToString(shareSecret));
        if (thumbnail != null)
        localVarHeaderParams.put("thumbnail", apiClient.parameterToString(thumbnail));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Download a File
     * Important: 1. Include the share-secret from HTTP header  2. Include uuid from the response of a successful file uploading, which is the file identifier 
     * @param orgName Organization ID (required)
     * @param appName Application name (required)
     * @param authorization Bearer ${token} (required)
     * @param uuid uuid, the file identifier, from previous successful uploading reponse (required)
     * @param shareSecret share-secret from previous successful uploading response (required)
     * @param thumbnail The request will return thumbnail if the tag of “thumbnail: true” is explicitly put in the header (optional, default to )
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File orgNameAppNameChatfilesUuidGet(String orgName, String appName, String authorization, String uuid, String shareSecret, Boolean thumbnail) throws ApiException {
        ApiResponse<File> resp = orgNameAppNameChatfilesUuidGetWithHttpInfo(orgName, appName, authorization, uuid, shareSecret, thumbnail);
        return resp.getData();
    }

    /**
     * Download a File
     * Important: 1. Include the share-secret from HTTP header  2. Include uuid from the response of a successful file uploading, which is the file identifier 
     * @param orgName Organization ID (required)
     * @param appName Application name (required)
     * @param authorization Bearer ${token} (required)
     * @param uuid uuid, the file identifier, from previous successful uploading reponse (required)
     * @param shareSecret share-secret from previous successful uploading response (required)
     * @param thumbnail The request will return thumbnail if the tag of “thumbnail: true” is explicitly put in the header (optional, default to )
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> orgNameAppNameChatfilesUuidGetWithHttpInfo(String orgName, String appName, String authorization, String uuid, String shareSecret, Boolean thumbnail) throws ApiException {
        com.squareup.okhttp.Call call = orgNameAppNameChatfilesUuidGetCall(orgName, appName, authorization, uuid, shareSecret, thumbnail, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download a File (asynchronously)
     * Important: 1. Include the share-secret from HTTP header  2. Include uuid from the response of a successful file uploading, which is the file identifier 
     * @param orgName Organization ID (required)
     * @param appName Application name (required)
     * @param authorization Bearer ${token} (required)
     * @param uuid uuid, the file identifier, from previous successful uploading reponse (required)
     * @param shareSecret share-secret from previous successful uploading response (required)
     * @param thumbnail The request will return thumbnail if the tag of “thumbnail: true” is explicitly put in the header (optional, default to )
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orgNameAppNameChatfilesUuidGetAsync(String orgName, String appName, String authorization, String uuid, String shareSecret, Boolean thumbnail, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = orgNameAppNameChatfilesUuidGetCall(orgName, appName, authorization, uuid, shareSecret, thumbnail, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
