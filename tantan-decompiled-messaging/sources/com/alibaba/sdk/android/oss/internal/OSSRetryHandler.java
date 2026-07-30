package com.alibaba.sdk.android.oss.internal;

import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class OSSRetryHandler {
    private int maxRetryCount = 2;

    /* JADX INFO: renamed from: com.alibaba.sdk.android.oss.internal.OSSRetryHandler$1 */
    public static /* synthetic */ class C08561 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$sdk$android$oss$internal$OSSRetryType;

        static {
            int[] iArr = new int[OSSRetryType.values().length];
            $SwitchMap$com$alibaba$sdk$android$oss$internal$OSSRetryType = iArr;
            try {
                iArr[OSSRetryType.OSSRetryTypeShouldRetry.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public OSSRetryHandler(int i) {
        setMaxRetryCount(i);
    }

    public void setMaxRetryCount(int i) {
        this.maxRetryCount = i;
    }

    public OSSRetryType shouldRetry(Exception exc, int i) {
        if (i >= this.maxRetryCount) {
            return OSSRetryType.OSSRetryTypeShouldNotRetry;
        }
        if (exc instanceof ClientException) {
            if (((ClientException) exc).isCanceledException().booleanValue()) {
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            Exception exc2 = (Exception) exc.getCause();
            if ((exc2 instanceof InterruptedIOException) && !(exc2 instanceof SocketTimeoutException)) {
                OSSLog.logError("[shouldRetry] - is interrupted!");
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            if (exc2 instanceof IllegalArgumentException) {
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            OSSLog.logDebug("shouldRetry - " + exc.toString());
            exc.getCause().printStackTrace();
            return OSSRetryType.OSSRetryTypeShouldRetry;
        }
        if (!(exc instanceof ServiceException)) {
            return OSSRetryType.OSSRetryTypeShouldNotRetry;
        }
        ServiceException serviceException = (ServiceException) exc;
        if (serviceException.getErrorCode() != null && serviceException.getErrorCode().equalsIgnoreCase("RequestTimeTooSkewed")) {
            return OSSRetryType.OSSRetryTypeShouldFixedTimeSkewedAndRetry;
        }
        if (serviceException.getErrorCode() == null || serviceException.getMessage() == null || !serviceException.getErrorCode().equalsIgnoreCase("InvalidArgument") || !serviceException.getMessage().equalsIgnoreCase("Invalid signing date in Authorization header.")) {
            return serviceException.getStatusCode() >= 500 ? OSSRetryType.OSSRetryTypeShouldRetry : OSSRetryType.OSSRetryTypeShouldNotRetry;
        }
        try {
            String date = serviceException.getDate();
            if (date == null) {
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            long fixedSkewedTimeMillis = DateUtil.getFixedSkewedTimeMillis() - DateUtil.parseRfc822Date(date).getTime();
            if (fixedSkewedTimeMillis <= 900000 && fixedSkewedTimeMillis >= -900000) {
                return OSSRetryType.OSSRetryTypeShouldNotRetry;
            }
            return OSSRetryType.OSSRetryTypeShouldFixedTimeSkewedAndRetry;
        } catch (ParseException e) {
            OSSLog.logThrowable2Local(e);
            return OSSRetryType.OSSRetryTypeShouldNotRetry;
        }
    }

    public long timeInterval(int i, OSSRetryType oSSRetryType) {
        if (C08561.$SwitchMap$com$alibaba$sdk$android$oss$internal$OSSRetryType[oSSRetryType.ordinal()] != 1) {
            return 0L;
        }
        return ((long) Math.pow(2.0d, i)) * 200;
    }
}
