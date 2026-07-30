package com.alibaba.sdk.android.oss.signer;

import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSCustomSignerCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSFederationCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSFederationToken;
import com.alibaba.sdk.android.oss.common.auth.OSSPlainTextAKSKCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import com.alibaba.sdk.android.oss.common.utils.HttpUtil;
import com.alibaba.sdk.android.oss.common.utils.StringUtils;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import com.meituan.robust.Constants;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import p149l.rhg0;

/* JADX INFO: loaded from: classes.dex */
public class OSSV4Signer extends OSSSignerBase {
    private static final String CONTENT_ALGORITHM = "algorithm";
    private static final String CONTENT_DATE = "date";
    private static final String CONTENT_PRODUCT = "product";
    private static final String CONTENT_REGION = "region";
    private static final String CONTENT_STRING_TO_SIGN = "stringToSign";
    private static final List<String> DEFAULT_SIGNED_HEADERS = Arrays.asList("Content-Type".toLowerCase(), "Content-MD5".toLowerCase());
    private static final String ISO8601_DATETIME_FORMAT = "yyyyMMdd'T'HHmmss'Z'";
    private static final String ISO8601_DATE_FORMAT = "yyyyMMdd";
    private static final String OSS4_HMAC_SHA256 = "OSS4-HMAC-SHA256";
    private static final String SECRET_KEY_PREFIX = "aliyun_v4";
    private static final String SECURITY_TOKEN = "x-oss-security-token";
    private static final String SEPARATOR_BACKSLASH = "/";
    private static final String TERMINATOR = "aliyun_v4_request";
    Set<String> additionalSignedHeaders;
    private Date requestDateTime;

    public OSSV4Signer(OSSSignerParams oSSSignerParams) {
        super(oSSSignerParams);
    }

    private void addOSSContentSha256Header(RequestMessage requestMessage) {
        requestMessage.addHeader(OSSHeaders.OSS_CONTENT_SHA256, "UNSIGNED-PAYLOAD");
    }

    private void addSignedHeaderIfNeeded(RequestMessage requestMessage) {
        if (!this.additionalSignedHeaders.contains("Host".toLowerCase()) || requestMessage.getHeaders().containsKey("Host")) {
            return;
        }
        requestMessage.addHeader("Host", requestMessage.getEndpoint().getHost());
    }

    private String buildAuthorization(String str, OSSFederationToken oSSFederationToken) {
        String str2;
        String str3 = "Credential=" + oSSFederationToken.getTempAK() + "/" + buildScope();
        if (hasAdditionalSignedHeaders()) {
            str2 = ",AdditionalHeaders=" + StringUtils.join(Constants.PACKNAME_END, this.additionalSignedHeaders);
        } else {
            str2 = "";
        }
        return "OSS4-HMAC-SHA256 " + str3 + str2 + (",Signature=" + str);
    }

    private String buildCanonicalRequest(RequestMessage requestMessage) {
        String string = requestMessage.getMethod().toString();
        String resourcePath = this.signerParams.getResourcePath();
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(SignParameters.NEW_LINE);
        sb.append(HttpUtil.urlEncode(resourcePath, true));
        sb.append(SignParameters.NEW_LINE);
        Map<String, String> parameters = requestMessage.getParameters();
        TreeMap treeMap = new TreeMap();
        if (parameters != null) {
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                treeMap.put(HttpUtil.urlEncode(StringUtils.trim(entry.getKey()), false), HttpUtil.urlEncode(StringUtils.trim(entry.getValue()), false));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        for (Map.Entry entry2 : treeMap.entrySet()) {
            sb2.append(str);
            sb2.append((String) entry2.getKey());
            if (entry2.getValue() != null && !((String) entry2.getValue()).isEmpty()) {
                sb2.append("=");
                sb2.append((String) entry2.getValue());
            }
            str = "&";
        }
        sb.append((CharSequence) sb2);
        sb.append(SignParameters.NEW_LINE);
        TreeMap<String, String> treeMapBuildSortedHeadersMap = buildSortedHeadersMap(requestMessage.getHeaders());
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry3 : treeMapBuildSortedHeadersMap.entrySet()) {
            sb3.append(entry3.getKey());
            sb3.append(":");
            sb3.append(entry3.getValue().trim());
            sb3.append(SignParameters.NEW_LINE);
        }
        sb.append((CharSequence) sb3);
        sb.append(SignParameters.NEW_LINE);
        sb.append(StringUtils.join(Constants.PACKNAME_END, this.additionalSignedHeaders));
        sb.append(SignParameters.NEW_LINE);
        String str2 = (String) requestMessage.getHeaders().get(OSSHeaders.OSS_CONTENT_SHA256);
        if (StringUtils.isNullOrEmpty(str2)) {
            str2 = "UNSIGNED-PAYLOAD";
        }
        sb.append(str2);
        return sb.toString();
    }

    private String buildScope() {
        return getDate() + "/" + getRegion() + "/" + getProduct() + "/aliyun_v4_request";
    }

    private String buildSignature(byte[] bArr, String str) {
        return BinaryUtil.toHex(ServiceSignature.create("HmacSHA256").computeHash(bArr, str.getBytes(StringUtils.UTF8)));
    }

    private byte[] buildSigningKey(OSSFederationToken oSSFederationToken) {
        ServiceSignature serviceSignatureCreate = ServiceSignature.create("HmacSHA256");
        String str = SECRET_KEY_PREFIX + oSSFederationToken.getTempSK();
        Charset charset = StringUtils.UTF8;
        return serviceSignatureCreate.computeHash(serviceSignatureCreate.computeHash(serviceSignatureCreate.computeHash(serviceSignatureCreate.computeHash(str.getBytes(charset), getDate().getBytes(charset)), getRegion().getBytes(charset)), getProduct().getBytes(charset)), TERMINATOR.getBytes(charset));
    }

    private TreeMap<String, String> buildSortedHeadersMap(Map<String, String> map) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String lowerCase = entry.getKey().toLowerCase();
                if (hasSignedHeaders(lowerCase)) {
                    treeMap.put(lowerCase, entry.getValue());
                }
            }
        }
        return treeMap;
    }

    private String buildStringToSign(String str) {
        return "OSS4-HMAC-SHA256\n" + getDateTime() + SignParameters.NEW_LINE + buildScope() + SignParameters.NEW_LINE + BinaryUtil.toHex(BinaryUtil.calculateSha256(str.getBytes(StringUtils.UTF8)));
    }

    private String getDate() {
        return getIso8601DateFormat().format(this.requestDateTime);
    }

    private String getDateTime() {
        return getIso8601DateTimeFormat().format(this.requestDateTime);
    }

    private static DateFormat getIso8601DateFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO8601_DATE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
        return simpleDateFormat;
    }

    private static DateFormat getIso8601DateTimeFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO8601_DATETIME_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
        return simpleDateFormat;
    }

    private String getProduct() {
        return this.signerParams.getProduct();
    }

    private String getRegion() {
        String cloudBoxId = this.signerParams.getCloudBoxId();
        OSSSignerParams oSSSignerParams = this.signerParams;
        return cloudBoxId != null ? oSSSignerParams.getCloudBoxId() : oSSSignerParams.getRegion();
    }

    private boolean hasAdditionalSignedHeaders() {
        Set<String> set = this.additionalSignedHeaders;
        return (set == null || set.isEmpty()) ? false : true;
    }

    private boolean hasDefaultSignedHeaders(String str) {
        if (DEFAULT_SIGNED_HEADERS.contains(str)) {
            return true;
        }
        return str.startsWith(OSSHeaders.OSS_PREFIX);
    }

    private boolean hasSignedHeaders(String str) {
        if (hasDefaultSignedHeaders(str)) {
            return true;
        }
        return this.additionalSignedHeaders.contains(str);
    }

    private void initRequestDateTime() {
        Date date = new Date();
        long fixedSkewedTimeMillis = DateUtil.getFixedSkewedTimeMillis();
        if (fixedSkewedTimeMillis != 0) {
            date.setTime(fixedSkewedTimeMillis);
        }
        this.requestDateTime = date;
    }

    private void resolveAdditionalSignedHeaders(RequestMessage requestMessage, Set<String> set) {
        TreeSet treeSet = new TreeSet();
        if (set != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String lowerCase = it.next().toLowerCase();
                Iterator it2 = requestMessage.getHeaders().entrySet().iterator();
                while (it2.hasNext()) {
                    if (((String) ((Map.Entry) it2.next()).getKey()).toLowerCase().equals(lowerCase) && !hasDefaultSignedHeaders(lowerCase)) {
                        treeSet.add(lowerCase);
                    }
                }
            }
        }
        this.additionalSignedHeaders = treeSet;
    }

    @Override // com.alibaba.sdk.android.oss.signer.OSSSignerBase
    public void addAuthorizationHeader(RequestMessage requestMessage, OSSFederationToken oSSFederationToken) {
        requestMessage.addHeader("Authorization", buildAuthorization(buildSignature(buildSigningKey(oSSFederationToken), buildStringToSign(requestMessage)), oSSFederationToken));
    }

    @Override // com.alibaba.sdk.android.oss.signer.OSSSignerBase
    public void addDateHeaderIfNeeded(RequestMessage requestMessage) {
        initRequestDateTime();
        requestMessage.getHeaders().put("Date", getDateTime());
    }

    @Override // com.alibaba.sdk.android.oss.signer.RequestPresigner
    public void presign(RequestMessage requestMessage) throws Exception {
        OSSFederationToken oSSFederationToken;
        if (getRegion() == null) {
            throw new ClientException("Region haven't been set!");
        }
        OSSCredentialProvider credentialProvider = this.signerParams.getCredentialProvider();
        if (credentialProvider instanceof OSSCustomSignerCredentialProvider) {
            rhg0.m179353a("V4 signature does not support OSSCustomSignerCredentialProvider");
            return;
        }
        if (credentialProvider instanceof OSSFederationCredentialProvider) {
            oSSFederationToken = ((OSSFederationCredentialProvider) credentialProvider).getValidFederationToken();
        } else if (credentialProvider instanceof OSSStsTokenCredentialProvider) {
            oSSFederationToken = credentialProvider.getFederationToken();
        } else if (credentialProvider instanceof OSSPlainTextAKSKCredentialProvider) {
            OSSPlainTextAKSKCredentialProvider oSSPlainTextAKSKCredentialProvider = (OSSPlainTextAKSKCredentialProvider) credentialProvider;
            oSSFederationToken = new OSSFederationToken(oSSPlainTextAKSKCredentialProvider.getAccessKeyId(), oSSPlainTextAKSKCredentialProvider.getAccessKeySecret(), (String) null, 0L);
        } else {
            oSSFederationToken = null;
        }
        initRequestDateTime();
        String strValueOf = String.valueOf(this.signerParams.getExpiration());
        requestMessage.addParameter("x-oss-date", getIso8601DateTimeFormat().format(this.requestDateTime));
        requestMessage.addParameter("x-oss-expires", strValueOf);
        resolveAdditionalSignedHeaders(requestMessage, this.signerParams.getAdditionalHeaderNames());
        addSignedHeaderIfNeeded(requestMessage);
        if (hasAdditionalSignedHeaders()) {
            requestMessage.addParameter("x-oss-additional-headers", StringUtils.join(Constants.PACKNAME_END, this.additionalSignedHeaders));
        }
        requestMessage.addParameter("x-oss-signature-version", OSS4_HMAC_SHA256);
        if (oSSFederationToken.useSecurityToken()) {
            requestMessage.addParameter("x-oss-security-token", oSSFederationToken.getSecurityToken());
        }
        requestMessage.addParameter("x-oss-credential", oSSFederationToken.getTempAK() + "/" + buildScope());
        requestMessage.addParameter("x-oss-signature", buildSignature(buildSigningKey(oSSFederationToken), buildStringToSign(requestMessage)));
    }

    @Override // com.alibaba.sdk.android.oss.signer.OSSSignerBase, com.alibaba.sdk.android.oss.signer.RequestSigner
    public void sign(RequestMessage requestMessage) throws Exception {
        OSSFederationToken oSSFederationToken;
        if (requestMessage.isAuthorizationRequired()) {
            if (getRegion() == null) {
                throw new ClientException("Region haven't been set!");
            }
            OSSCredentialProvider credentialProvider = this.signerParams.getCredentialProvider();
            if (credentialProvider instanceof OSSCustomSignerCredentialProvider) {
                rhg0.m179353a("V4 signature does not support OSSCustomSignerCredentialProvider");
                return;
            }
            if (credentialProvider instanceof OSSFederationCredentialProvider) {
                oSSFederationToken = ((OSSFederationCredentialProvider) credentialProvider).getValidFederationToken();
            } else if (credentialProvider instanceof OSSStsTokenCredentialProvider) {
                oSSFederationToken = credentialProvider.getFederationToken();
            } else if (credentialProvider instanceof OSSPlainTextAKSKCredentialProvider) {
                OSSPlainTextAKSKCredentialProvider oSSPlainTextAKSKCredentialProvider = (OSSPlainTextAKSKCredentialProvider) credentialProvider;
                oSSFederationToken = new OSSFederationToken(oSSPlainTextAKSKCredentialProvider.getAccessKeyId(), oSSPlainTextAKSKCredentialProvider.getAccessKeySecret(), (String) null, 0L);
            } else {
                oSSFederationToken = null;
            }
            addDateHeaderIfNeeded(requestMessage);
            if (oSSFederationToken == null) {
                OSSLog.logError("Can't get a federation token");
                throw new ClientException("Can't get a federation token");
            }
            resolveAdditionalSignedHeaders(requestMessage, requestMessage.getAdditionalHeaderNames());
            addSignedHeaderIfNeeded(requestMessage);
            addSecurityTokenHeaderIfNeeded(requestMessage, oSSFederationToken);
            addOSSContentSha256Header(requestMessage);
            addAuthorizationHeader(requestMessage, oSSFederationToken);
        }
    }

    @Override // com.alibaba.sdk.android.oss.signer.OSSSignerBase
    public String buildStringToSign(RequestMessage requestMessage) {
        String strBuildCanonicalRequest = buildCanonicalRequest(requestMessage);
        OSSLog.logInfo(strBuildCanonicalRequest);
        return buildStringToSign(strBuildCanonicalRequest);
    }
}
