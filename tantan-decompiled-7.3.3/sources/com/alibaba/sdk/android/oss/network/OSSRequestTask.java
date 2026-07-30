package com.alibaba.sdk.android.oss.network;

import android.os.ParcelFileDescriptor;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.common.HttpMethod;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.CRC64;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.internal.OSSRetryHandler;
import com.alibaba.sdk.android.oss.internal.OSSRetryType;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import com.alibaba.sdk.android.oss.internal.ResponseMessage;
import com.alibaba.sdk.android.oss.internal.ResponseParser;
import com.alibaba.sdk.android.oss.internal.ResponseParsers;
import com.alibaba.sdk.android.oss.model.GetObjectRequest;
import com.alibaba.sdk.android.oss.model.ListBucketsRequest;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.OSSResult;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.CheckedInputStream;
import org.eclipse.jetty.http.HttpMethods;
import p153l.e0l;
import p153l.e7y;
import p153l.i5d0;
import p153l.rg50;
import p153l.ry3;
import p153l.x1d0;
import p153l.z1d0;

/* JADX INFO: loaded from: classes.dex */
public class OSSRequestTask<T extends OSSResult> implements Callable<T> {
    private rg50 client;
    private ExecutionContext context;
    private int currentRetryCount = 0;
    private RequestMessage message;
    private ResponseParser<T> responseParser;
    private OSSRetryHandler retryHandler;

    /* JADX INFO: renamed from: com.alibaba.sdk.android.oss.network.OSSRequestTask$1 */
    public static /* synthetic */ class C08661 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod = iArr;
            try {
                iArr[HttpMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.GET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.HEAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public OSSRequestTask(RequestMessage requestMessage, ResponseParser responseParser, ExecutionContext executionContext, int i) {
        this.responseParser = responseParser;
        this.message = requestMessage;
        this.context = executionContext;
        this.client = executionContext.getClient();
        this.retryHandler = new OSSRetryHandler(i);
    }

    private ResponseMessage buildResponseMessage(RequestMessage requestMessage, i5d0 i5d0Var) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setRequest(requestMessage);
        responseMessage.setResponse(i5d0Var);
        HashMap map = new HashMap();
        e0l e0lVarM138659F = i5d0Var.m138659F();
        for (int i = 0; i < e0lVarM138659F.m118878k(); i++) {
            map.put(e0lVarM138659F.m118875f(i), e0lVarM138659F.m118880m(i));
        }
        responseMessage.setHeaders(map);
        responseMessage.setStatusCode(i5d0Var.m138673q());
        responseMessage.setContentLength(i5d0Var.m138670k().contentLength());
        responseMessage.setContent(i5d0Var.m138670k().byteStream());
        return responseMessage;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x019c A[Catch: Exception -> 0x001a, TryCatch #3 {Exception -> 0x001a, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x001f, B:10:0x0046, B:13:0x0051, B:15:0x005a, B:16:0x006c, B:18:0x0072, B:19:0x0089, B:76:0x01ff, B:30:0x00d0, B:31:0x00d6, B:32:0x00dc, B:36:0x00e7, B:38:0x00f4, B:67:0x019c, B:69:0x01a4, B:70:0x01af, B:74:0x01d2, B:75:0x01ed, B:41:0x010b, B:43:0x0115, B:46:0x0131, B:47:0x0138, B:48:0x0139, B:50:0x0141, B:53:0x016f, B:59:0x0179, B:60:0x017c, B:61:0x017d, B:64:0x0187, B:65:0x0193, B:14:0x0056, B:94:0x02ca, B:95:0x02d1), top: B:159:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a4 A[Catch: Exception -> 0x001a, TryCatch #3 {Exception -> 0x001a, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x001f, B:10:0x0046, B:13:0x0051, B:15:0x005a, B:16:0x006c, B:18:0x0072, B:19:0x0089, B:76:0x01ff, B:30:0x00d0, B:31:0x00d6, B:32:0x00dc, B:36:0x00e7, B:38:0x00f4, B:67:0x019c, B:69:0x01a4, B:70:0x01af, B:74:0x01d2, B:75:0x01ed, B:41:0x010b, B:43:0x0115, B:46:0x0131, B:47:0x0138, B:48:0x0139, B:50:0x0141, B:53:0x016f, B:59:0x0179, B:60:0x017c, B:61:0x017d, B:64:0x0187, B:65:0x0193, B:14:0x0056, B:94:0x02ca, B:95:0x02d1), top: B:159:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d2 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #3 {Exception -> 0x001a, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x001f, B:10:0x0046, B:13:0x0051, B:15:0x005a, B:16:0x006c, B:18:0x0072, B:19:0x0089, B:76:0x01ff, B:30:0x00d0, B:31:0x00d6, B:32:0x00dc, B:36:0x00e7, B:38:0x00f4, B:67:0x019c, B:69:0x01a4, B:70:0x01af, B:74:0x01d2, B:75:0x01ed, B:41:0x010b, B:43:0x0115, B:46:0x0131, B:47:0x0138, B:48:0x0139, B:50:0x0141, B:53:0x016f, B:59:0x0179, B:60:0x017c, B:61:0x017d, B:64:0x0187, B:65:0x0193, B:14:0x0056, B:94:0x02ca, B:95:0x02d1), top: B:159:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01ed A[Catch: Exception -> 0x001a, TryCatch #3 {Exception -> 0x001a, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x001f, B:10:0x0046, B:13:0x0051, B:15:0x005a, B:16:0x006c, B:18:0x0072, B:19:0x0089, B:76:0x01ff, B:30:0x00d0, B:31:0x00d6, B:32:0x00dc, B:36:0x00e7, B:38:0x00f4, B:67:0x019c, B:69:0x01a4, B:70:0x01af, B:74:0x01d2, B:75:0x01ed, B:41:0x010b, B:43:0x0115, B:46:0x0131, B:47:0x0138, B:48:0x0139, B:50:0x0141, B:53:0x016f, B:59:0x0179, B:60:0x017c, B:61:0x017d, B:64:0x0187, B:65:0x0193, B:14:0x0056, B:94:0x02ca, B:95:0x02d1), top: B:159:0x0004 }] */
    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        ry3 ry3VarMo181341a;
        x1d0 x1d0VarM209028b;
        Exception clientException;
        ResponseMessage responseMessageBuildResponseMessage;
        long statSize;
        String stringBody;
        InputStream content;
        long contentLength;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        RequestMessage requestMessage;
        try {
            if (this.context.getApplicationContext() != null) {
                OSSLog.logInfo(OSSUtils.buildBaseLogInfo(this.context.getApplicationContext()));
            }
            OSSLog.logDebug("[call] - ");
            OSSRequest request = this.context.getRequest();
            OSSUtils.ensureRequestValid(request, this.message);
            this.message.getSigner().sign(this.message);
            if (this.context.getCancellationHandler().isCancelled()) {
                throw new InterruptedIOException("This task is cancelled!");
            }
            x1d0.C21228a c21228a = new x1d0.C21228a();
            boolean z = request instanceof ListBucketsRequest;
            RequestMessage requestMessage2 = this.message;
            x1d0.C21228a c21228aM209043q = c21228a.m209043q(z ? requestMessage2.buildOSSServiceURL() : requestMessage2.buildCanonicalURL());
            for (String str : this.message.getHeaders().keySet()) {
                c21228aM209043q = c21228aM209043q.m209027a(str, (String) this.message.getHeaders().get(str));
            }
            String str2 = (String) this.message.getHeaders().get("Content-Type");
            OSSLog.logDebug("request method = " + this.message.getMethod());
            int i = C08661.$SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[this.message.getMethod().ordinal()];
            if (i == 1 || i == 2) {
                OSSUtils.assertTrue(str2 != null, "Content type can't be null when upload!");
                if (this.message.getUploadData() != null) {
                    content = new ByteArrayInputStream(this.message.getUploadData());
                    contentLength = this.message.getUploadData().length;
                } else {
                    if (this.message.getUploadFilePath() != null) {
                        File file = new File(this.message.getUploadFilePath());
                        FileInputStream fileInputStream = new FileInputStream(file);
                        long length = file.length();
                        if (length <= 0) {
                            throw new ClientException("the length of file is 0!");
                        }
                        stringBody = null;
                        content = fileInputStream;
                        statSize = length;
                    } else if (this.message.getUploadUri() != null) {
                        content = this.context.getApplicationContext().getContentResolver().openInputStream(this.message.getUploadUri());
                        try {
                            parcelFileDescriptorOpenFileDescriptor = this.context.getApplicationContext().getContentResolver().openFileDescriptor(this.message.getUploadUri(), "r");
                            try {
                                statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                                parcelFileDescriptorOpenFileDescriptor.close();
                                stringBody = null;
                            } catch (Throwable th) {
                                th = th;
                                if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcelFileDescriptorOpenFileDescriptor = null;
                        }
                    } else {
                        InputStream content2 = this.message.getContent();
                        RequestMessage requestMessage3 = this.message;
                        if (content2 != null) {
                            content = requestMessage3.getContent();
                            contentLength = this.message.getContentLength();
                        } else {
                            statSize = 0;
                            stringBody = requestMessage3.getStringBody();
                            content = null;
                        }
                    }
                    if (content != null) {
                        if (this.message.isCheckCRC64()) {
                            content = new CheckedInputStream(content, new CRC64());
                        }
                        this.message.setContent(content);
                        this.message.setContentLength(statSize);
                        c21228aM209043q = c21228aM209043q.m209036j(this.message.getMethod().toString(), NetworkProgressHelper.addProgressRequestBody(content, statSize, str2, this.context));
                    } else {
                        requestMessage = this.message;
                        if (stringBody != null) {
                            c21228aM209043q = c21228aM209043q.m209036j(requestMessage.getMethod().toString(), z1d0.create(e7y.m119773d(str2), stringBody.getBytes("UTF-8")));
                        } else {
                            c21228aM209043q = c21228aM209043q.m209036j(requestMessage.getMethod().toString(), z1d0.create((e7y) null, new byte[0]));
                        }
                    }
                }
                statSize = contentLength;
                stringBody = null;
                if (content != null) {
                    if (this.message.isCheckCRC64()) {
                        content = new CheckedInputStream(content, new CRC64());
                    }
                    this.message.setContent(content);
                    this.message.setContentLength(statSize);
                    c21228aM209043q = c21228aM209043q.m209036j(this.message.getMethod().toString(), NetworkProgressHelper.addProgressRequestBody(content, statSize, str2, this.context));
                } else {
                    requestMessage = this.message;
                    if (stringBody != null) {
                        c21228aM209043q = c21228aM209043q.m209036j(requestMessage.getMethod().toString(), z1d0.create(e7y.m119773d(str2), stringBody.getBytes("UTF-8")));
                    } else {
                        c21228aM209043q = c21228aM209043q.m209036j(requestMessage.getMethod().toString(), z1d0.create((e7y) null, new byte[0]));
                    }
                }
            } else if (i == 3) {
                c21228aM209043q = c21228aM209043q.m209032f();
            } else if (i == 4) {
                c21228aM209043q = c21228aM209043q.m209033g();
            } else if (i == 5) {
                c21228aM209043q = c21228aM209043q.m209030d();
            }
            x1d0VarM209028b = c21228aM209043q.m209028b();
            try {
                if (request instanceof GetObjectRequest) {
                    this.client = NetworkProgressHelper.addProgressResponseListener(this.client, this.context);
                    OSSLog.logDebug("getObject");
                }
                ry3VarMo181341a = this.client.mo181341a(x1d0VarM209028b);
                try {
                    this.context.getCancellationHandler().setCall(ry3VarMo181341a);
                    i5d0 i5d0VarExecute = ry3VarMo181341a.execute();
                    if (OSSLog.isEnableLog()) {
                        Map<String, List<String>> mapM118879l = i5d0VarExecute.m138659F().m118879l();
                        StringBuilder sb = new StringBuilder();
                        sb.append("response:---------------------\n");
                        sb.append("response code: " + i5d0VarExecute.m138673q() + " for url: " + x1d0VarM209028b.m209026k() + SignParameters.NEW_LINE);
                        for (String str3 : mapM118879l.keySet()) {
                            sb.append("responseHeader [" + str3 + "]: ");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(mapM118879l.get(str3).get(0));
                            sb2.append(SignParameters.NEW_LINE);
                            sb.append(sb2.toString());
                        }
                        OSSLog.logDebug(sb.toString());
                    }
                    responseMessageBuildResponseMessage = buildResponseMessage(this.message, i5d0VarExecute);
                    clientException = null;
                } catch (Exception e) {
                    e = e;
                    OSSLog.logError("Encounter local execpiton: " + e.toString());
                    if (OSSLog.isEnableLog()) {
                        e.printStackTrace();
                    }
                    clientException = new ClientException(e.getMessage(), e);
                    responseMessageBuildResponseMessage = null;
                }
            } catch (Exception e2) {
                e = e2;
                ry3VarMo181341a = null;
            }
            if (clientException == null && (responseMessageBuildResponseMessage.getStatusCode() == 203 || responseMessageBuildResponseMessage.getStatusCode() >= 300)) {
                clientException = ResponseParsers.parseResponseErrorXML(responseMessageBuildResponseMessage, x1d0VarM209028b.m209022g().equals(HttpMethods.HEAD));
            } else if (clientException == null) {
                try {
                    T t = (T) this.responseParser.parse(responseMessageBuildResponseMessage);
                    if (this.context.getCompletedCallback() != null) {
                        this.context.getCompletedCallback().onSuccess(this.context.getRequest(), t);
                    }
                    return t;
                } catch (IOException e3) {
                    clientException = new ClientException(e3.getMessage(), e3);
                }
            }
            if ((ry3VarMo181341a != null && ry3VarMo181341a.isCanceled()) || this.context.getCancellationHandler().isCancelled()) {
                clientException = new ClientException("Task is cancelled!", clientException.getCause(), Boolean.TRUE);
            }
            OSSRetryType oSSRetryTypeShouldRetry = this.retryHandler.shouldRetry(clientException, this.currentRetryCount);
            OSSLog.logError("[run] - retry, retry type: " + oSSRetryTypeShouldRetry);
            if (oSSRetryTypeShouldRetry == OSSRetryType.OSSRetryTypeShouldRetry) {
                this.currentRetryCount++;
                if (this.context.getRetryCallback() != null) {
                    this.context.getRetryCallback().onRetryCallback();
                }
                try {
                    Thread.sleep(this.retryHandler.timeInterval(this.currentRetryCount, oSSRetryTypeShouldRetry));
                } catch (InterruptedException e4) {
                    Thread.currentThread().interrupt();
                    e4.printStackTrace();
                }
                return (T) call();
            }
            if (oSSRetryTypeShouldRetry == OSSRetryType.OSSRetryTypeShouldFixedTimeSkewedAndRetry) {
                if (responseMessageBuildResponseMessage != null) {
                    String str4 = (String) responseMessageBuildResponseMessage.getHeaders().get("Date");
                    try {
                        DateUtil.setCurrentServerTime(DateUtil.parseRfc822Date(str4).getTime());
                        this.message.getHeaders().put("Date", str4);
                    } catch (Exception unused) {
                        OSSLog.logError("[error] - synchronize time, reponseDate:" + str4);
                    }
                }
                this.currentRetryCount++;
                if (this.context.getRetryCallback() != null) {
                    this.context.getRetryCallback().onRetryCallback();
                }
                return (T) call();
            }
            boolean z2 = clientException instanceof ClientException;
            ExecutionContext executionContext = this.context;
            if (z2) {
                if (executionContext.getCompletedCallback() == null) {
                    throw clientException;
                }
                this.context.getCompletedCallback().onFailure(this.context.getRequest(), (ClientException) clientException, null);
                throw clientException;
            }
            if (executionContext.getCompletedCallback() == null) {
                throw clientException;
            }
            this.context.getCompletedCallback().onFailure(this.context.getRequest(), null, (ServiceException) clientException);
            throw clientException;
        } catch (Exception e5) {
            e = e5;
            ry3VarMo181341a = null;
            x1d0VarM209028b = null;
        }
    }
}
