package com.alibaba.sdk.android.oss.internal;

import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.CaseInsensitiveHashMap;
import com.alibaba.sdk.android.oss.model.OSSResult;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.util.zip.CheckedInputStream;
import p153l.e0l;
import p153l.i5d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractResponseParser<T extends OSSResult> implements ResponseParser {
    private CaseInsensitiveHashMap<String, String> parseResponseHeader(i5d0 i5d0Var) {
        CaseInsensitiveHashMap<String, String> caseInsensitiveHashMap = new CaseInsensitiveHashMap<>();
        e0l e0lVarM138659F = i5d0Var.m138659F();
        for (int i = 0; i < e0lVarM138659F.m118878k(); i++) {
            caseInsensitiveHashMap.put(e0lVarM138659F.m118875f(i), e0lVarM138659F.m118880m(i));
        }
        return caseInsensitiveHashMap;
    }

    public static void safeCloseResponse(ResponseMessage responseMessage) {
        try {
            responseMessage.close();
        } catch (Exception unused) {
        }
    }

    public boolean needCloseResponse() {
        return true;
    }

    @Override // com.alibaba.sdk.android.oss.internal.ResponseParser
    public T parse(ResponseMessage responseMessage) throws IOException {
        try {
            try {
                T t = (T) ((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
                if (t != null) {
                    t.setRequestId((String) responseMessage.getHeaders().get(OSSHeaders.OSS_HEADER_REQUEST_ID));
                    t.setStatusCode(responseMessage.getStatusCode());
                    t.setResponseHeader(parseResponseHeader(responseMessage.getResponse()));
                    setCRC(t, responseMessage);
                    t = (T) parseData(responseMessage, t);
                }
                if (needCloseResponse()) {
                    safeCloseResponse(responseMessage);
                }
                return t;
            } catch (Exception e) {
                IOException iOException = new IOException(e.getMessage(), e);
                e.printStackTrace();
                OSSLog.logThrowable2Local(e);
                throw iOException;
            }
        } catch (Throwable th) {
            if (needCloseResponse()) {
                safeCloseResponse(responseMessage);
            }
            throw th;
        }
    }

    public abstract T parseData(ResponseMessage responseMessage, T t) throws Exception;

    public <Result extends OSSResult> void setCRC(Result result, ResponseMessage responseMessage) {
        InputStream content = responseMessage.getRequest().getContent();
        if (content != null && (content instanceof CheckedInputStream)) {
            result.setClientCRC(Long.valueOf(((CheckedInputStream) content).getChecksum().getValue()));
        }
        String str = (String) responseMessage.getHeaders().get(OSSHeaders.OSS_HASH_CRC64_ECMA);
        if (str != null) {
            result.setServerCRC(Long.valueOf(new BigInteger(str).longValue()));
        }
    }
}
