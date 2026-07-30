package com.alibaba.sdk.android.oss.internal;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.ClientConfiguration;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.common.HttpMethod;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider;
import com.alibaba.sdk.android.oss.common.utils.HttpUtil;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.model.GeneratePresignedUrlRequest;
import com.alibaba.sdk.android.oss.signer.OSSSignerBase;
import com.alibaba.sdk.android.oss.signer.OSSSignerParams;
import com.alibaba.sdk.android.oss.signer.RequestPresigner;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ObjectURLPresigner {
    private String cloudBoxId;
    private ClientConfiguration conf;
    private OSSCredentialProvider credentialProvider;
    private URI endpoint;
    private String product = "oss";
    private String region;

    public ObjectURLPresigner(URI uri, OSSCredentialProvider oSSCredentialProvider, ClientConfiguration clientConfiguration) {
        this.endpoint = uri;
        this.credentialProvider = oSSCredentialProvider;
        this.conf = clientConfiguration;
    }

    private String buildCanonicalHost(URI uri, String str, ClientConfiguration clientConfiguration) {
        String str2;
        String host = uri.getHost();
        String path = uri.getPath();
        int port = uri.getPort();
        String strValueOf = port != -1 ? String.valueOf(port) : null;
        if (TextUtils.isEmpty(strValueOf)) {
            str2 = host;
        } else {
            str2 = host + ":" + strValueOf;
        }
        boolean zIsValidateIP = false;
        if (!TextUtils.isEmpty(str)) {
            if (OSSUtils.isOssOriginHost(host)) {
                str2 = str + "." + host;
            } else if (!OSSUtils.isInCustomCnameExcludeList(host, clientConfiguration.getCustomCnameExcludeList())) {
                try {
                    zIsValidateIP = OSSUtils.isValidateIP(host);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (clientConfiguration.isPathStyleAccessEnable()) {
                zIsValidateIP = true;
            } else {
                str2 = str + "." + host;
            }
        }
        if (clientConfiguration.isCustomPathPrefixEnable() && path != null) {
            str2 = str2 + path;
        }
        if (!zIsValidateIP) {
            return str2;
        }
        return str2 + "/" + str;
    }

    private RequestPresigner createSigner(String str, String str2, OSSCredentialProvider oSSCredentialProvider, ClientConfiguration clientConfiguration, GeneratePresignedUrlRequest generatePresignedUrlRequest) {
        StringBuilder sb = new StringBuilder("/");
        sb.append(str != null ? str.concat("/") : "");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        OSSSignerParams oSSSignerParams = new OSSSignerParams(sb.toString(), oSSCredentialProvider);
        oSSSignerParams.setProduct(this.product);
        oSSSignerParams.setRegion(this.region);
        oSSSignerParams.setCloudBoxId(this.cloudBoxId);
        oSSSignerParams.setExpiration(generatePresignedUrlRequest.getExpiration());
        oSSSignerParams.setAdditionalHeaderNames(generatePresignedUrlRequest.getAdditionalHeaderNames());
        return OSSSignerBase.createRequestPresigner(clientConfiguration.getSignVersion(), oSSSignerParams);
    }

    public String getCloudBoxId() {
        return this.cloudBoxId;
    }

    public String getProduct() {
        return this.product;
    }

    public String getRegion() {
        return this.region;
    }

    public String presignConstrainedURL(GeneratePresignedUrlRequest generatePresignedUrlRequest) throws ClientException {
        String bucketName = generatePresignedUrlRequest.getBucketName();
        String key = generatePresignedUrlRequest.getKey();
        HttpMethod method = generatePresignedUrlRequest.getMethod() != null ? generatePresignedUrlRequest.getMethod() : HttpMethod.GET;
        RequestMessage requestMessage = new RequestMessage();
        requestMessage.setEndpoint(this.endpoint);
        requestMessage.setMethod(method);
        requestMessage.setBucketName(bucketName);
        requestMessage.setObjectKey(key);
        requestMessage.setHeaders(generatePresignedUrlRequest.getHeaders());
        if (generatePresignedUrlRequest.getContentType() != null && !generatePresignedUrlRequest.getContentType().trim().equals("")) {
            requestMessage.getHeaders().put("Content-Type", generatePresignedUrlRequest.getContentType());
        }
        if (generatePresignedUrlRequest.getContentMD5() != null && !generatePresignedUrlRequest.getContentMD5().trim().equals("")) {
            requestMessage.getHeaders().put("Content-MD5", generatePresignedUrlRequest.getContentMD5());
        }
        if (generatePresignedUrlRequest.getQueryParameter() != null && generatePresignedUrlRequest.getQueryParameter().size() > 0) {
            for (Map.Entry<String, String> entry : generatePresignedUrlRequest.getQueryParameter().entrySet()) {
                requestMessage.getParameters().put(entry.getKey(), entry.getValue());
            }
        }
        if (generatePresignedUrlRequest.getProcess() != null && !generatePresignedUrlRequest.getProcess().trim().equals("")) {
            requestMessage.getParameters().put(RequestParameters.X_OSS_PROCESS, generatePresignedUrlRequest.getProcess());
        }
        requestMessage.setUseUrlSignature(true);
        try {
            createSigner(bucketName, key, this.credentialProvider, this.conf, generatePresignedUrlRequest).presign(requestMessage);
            String strBuildCanonicalHost = buildCanonicalHost(this.endpoint, bucketName, this.conf);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(requestMessage.getParameters());
            return this.endpoint.getScheme() + "://" + strBuildCanonicalHost + "/" + HttpUtil.urlEncode(key, "utf-8") + "?" + HttpUtil.paramToQueryString(linkedHashMap, "utf-8");
        } catch (Exception e) {
            throw new ClientException(e.getMessage(), e);
        }
    }

    public String presignPublicURL(String str, String str2) {
        return this.endpoint.getScheme() + "://" + buildCanonicalHost(this.endpoint, str, this.conf) + "/" + HttpUtil.urlEncode(str2, "utf-8");
    }

    public void setCloudBoxId(String str) {
        this.cloudBoxId = str;
    }

    public void setProduct(String str) {
        this.product = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public String presignConstrainedURL(String str, String str2, long j) throws ClientException {
        GeneratePresignedUrlRequest generatePresignedUrlRequest = new GeneratePresignedUrlRequest(str, str2);
        generatePresignedUrlRequest.setExpiration(j);
        return presignConstrainedURL(generatePresignedUrlRequest);
    }
}
