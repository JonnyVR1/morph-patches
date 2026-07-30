package com.alibaba.sdk.android.oss.signer;

import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSCustomSignerCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSFederationCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSFederationToken;
import com.alibaba.sdk.android.oss.common.auth.OSSPlainTextAKSKCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import com.alibaba.sdk.android.oss.common.utils.SignUtils;
import com.alibaba.sdk.android.oss.internal.RequestMessage;

/* JADX INFO: loaded from: classes.dex */
public class OSSV1Signer extends OSSSignerBase {
    public OSSV1Signer(OSSSignerParams oSSSignerParams) {
        super(oSSSignerParams);
    }

    @Override // com.alibaba.sdk.android.oss.signer.OSSSignerBase
    public void addAuthorizationHeader(RequestMessage requestMessage, OSSFederationToken oSSFederationToken) {
        requestMessage.addHeader("Authorization", SignUtils.composeRequestAuthorization(oSSFederationToken.getTempAK(), ServiceSignature.create().computeSignature(oSSFederationToken.getTempSK(), buildStringToSign(requestMessage))));
    }

    @Override // com.alibaba.sdk.android.oss.signer.OSSSignerBase
    public String buildStringToSign(RequestMessage requestMessage) {
        return SignUtils.buildCanonicalString(requestMessage.getMethod().toString(), this.signerParams.getResourcePath(), requestMessage, null);
    }

    @Override // com.alibaba.sdk.android.oss.signer.RequestPresigner
    public void presign(RequestMessage requestMessage) throws Exception {
        OSSFederationToken oSSFederationToken;
        String strSubstring;
        String str;
        OSSCredentialProvider credentialProvider = this.signerParams.getCredentialProvider();
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
        String resourcePath = this.signerParams.getResourcePath();
        String strValueOf = String.valueOf((DateUtil.getFixedSkewedTimeMillis() / 1000) + this.signerParams.getExpiration());
        requestMessage.addHeader("Date", strValueOf);
        if (oSSFederationToken != null && oSSFederationToken.useSecurityToken()) {
            requestMessage.addParameter(RequestParameters.SECURITY_TOKEN, oSSFederationToken.getSecurityToken());
        }
        String strBuildCanonicalString = SignUtils.buildCanonicalString(requestMessage.getMethod().toString(), resourcePath, requestMessage, strValueOf);
        if (credentialProvider instanceof OSSCustomSignerCredentialProvider) {
            try {
                String strSignContent = ((OSSCustomSignerCredentialProvider) credentialProvider).signContent(strBuildCanonicalString);
                strSubstring = strSignContent.split(":")[0].substring(4);
                str = strSignContent.split(":")[1];
            } catch (Exception e) {
                throw new ClientException(e.getMessage(), e);
            }
        } else {
            String tempAK = oSSFederationToken.getTempAK();
            String strComputeSignature = ServiceSignature.create().computeSignature(oSSFederationToken.getTempSK(), strBuildCanonicalString);
            strSubstring = tempAK;
            str = strComputeSignature;
        }
        requestMessage.addParameter("Expires", strValueOf);
        requestMessage.addParameter(RequestParameters.SIGNATURE, str);
        requestMessage.addParameter(RequestParameters.OSS_ACCESS_KEY_ID, strSubstring);
    }
}
