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
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public abstract class OSSSignerBase implements RequestSigner, RequestPresigner {
    protected final OSSSignerParams signerParams;

    public OSSSignerBase(OSSSignerParams oSSSignerParams) {
        this.signerParams = oSSSignerParams;
    }

    public static RequestPresigner createRequestPresigner(SignVersion signVersion, OSSSignerParams oSSSignerParams) {
        return SignVersion.V4.equals(signVersion) ? new OSSV4Signer(oSSSignerParams) : new OSSV1Signer(oSSSignerParams);
    }

    public static RequestSigner createRequestSigner(SignVersion signVersion, OSSSignerParams oSSSignerParams) {
        return SignVersion.V4.equals(signVersion) ? new OSSV4Signer(oSSSignerParams) : new OSSV1Signer(oSSSignerParams);
    }

    public abstract void addAuthorizationHeader(RequestMessage requestMessage, OSSFederationToken oSSFederationToken);

    public void addDateHeaderIfNeeded(RequestMessage requestMessage) {
        Date date = new Date();
        long fixedSkewedTimeMillis = DateUtil.getFixedSkewedTimeMillis();
        if (fixedSkewedTimeMillis != 0) {
            date.setTime(fixedSkewedTimeMillis);
        }
        requestMessage.getHeaders().put("Date", DateUtil.formatRfc822Date(date));
    }

    public void addSecurityTokenHeaderIfNeeded(RequestMessage requestMessage, OSSFederationToken oSSFederationToken) {
        if (!oSSFederationToken.useSecurityToken() || requestMessage.isUseUrlSignature()) {
            return;
        }
        requestMessage.addHeader(OSSHeaders.OSS_SECURITY_TOKEN, oSSFederationToken.getSecurityToken());
    }

    public abstract String buildStringToSign(RequestMessage requestMessage);

    @Override // com.alibaba.sdk.android.oss.signer.RequestSigner
    public void sign(RequestMessage requestMessage) throws Exception {
        OSSFederationToken oSSFederationToken;
        if (requestMessage.isAuthorizationRequired()) {
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
            addDateHeaderIfNeeded(requestMessage);
            if (credentialProvider instanceof OSSCustomSignerCredentialProvider) {
                try {
                    requestMessage.addHeader("Authorization", ((OSSCustomSignerCredentialProvider) credentialProvider).signContent(buildStringToSign(requestMessage)));
                } catch (Exception e) {
                    throw new ClientException(e.getMessage(), e);
                }
            } else {
                if (oSSFederationToken == null) {
                    OSSLog.logError("Can't get a federation token");
                    throw new ClientException("Can't get a federation token");
                }
                addSecurityTokenHeaderIfNeeded(requestMessage, oSSFederationToken);
                addAuthorizationHeader(requestMessage, oSSFederationToken);
            }
        }
    }
}
