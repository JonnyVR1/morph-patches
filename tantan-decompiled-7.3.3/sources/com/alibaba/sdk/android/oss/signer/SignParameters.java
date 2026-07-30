package com.alibaba.sdk.android.oss.signer;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SignParameters {
    public static final String AUTHORIZATION_PREFIX = "OSS ";
    public static final String NEW_LINE = "\n";
    public static final List<String> SIGNED_PARAMTERS = Arrays.asList(RequestParameters.SUBRESOURCE_BUCKETINFO, RequestParameters.SUBRESOURCE_ACL, RequestParameters.SUBRESOURCE_UPLOADS, "location", RequestParameters.SUBRESOURCE_CORS, RequestParameters.SUBRESOURCE_LOGGING, RequestParameters.SUBRESOURCE_WEBSITE, RequestParameters.SUBRESOURCE_REFERER, RequestParameters.SUBRESOURCE_LIFECYCLE, RequestParameters.SUBRESOURCE_DELETE, RequestParameters.SUBRESOURCE_APPEND, RequestParameters.UPLOAD_ID, RequestParameters.PART_NUMBER, RequestParameters.SECURITY_TOKEN, "position", RequestParameters.RESPONSE_HEADER_CACHE_CONTROL, RequestParameters.RESPONSE_HEADER_CONTENT_DISPOSITION, RequestParameters.RESPONSE_HEADER_CONTENT_ENCODING, RequestParameters.RESPONSE_HEADER_CONTENT_LANGUAGE, RequestParameters.RESPONSE_HEADER_CONTENT_TYPE, RequestParameters.RESPONSE_HEADER_EXPIRES, RequestParameters.X_OSS_PROCESS, RequestParameters.SUBRESOURCE_SEQUENTIAL, RequestParameters.X_OSS_SYMLINK, RequestParameters.X_OSS_RESTORE, RequestParameters.X_OSS_TAGGING, RequestParameters.SUBRESOURCE_OBJECT_META);
}
