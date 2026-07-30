package p153l;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.ClientConfiguration;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.model.ObjectMetadata;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.alibaba.sdk.android.oss.model.PutObjectResult;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class u660 {

    /* JADX INFO: renamed from: e */
    private static u660 f177710e = new u660();

    /* JADX INFO: renamed from: a */
    public AtomicInteger f177711a = new AtomicInteger(1000);

    /* JADX INFO: renamed from: b */
    private ExecutorService f177712b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c */
    private ArrayList<C20499c> f177713c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    private final Object f177714d = new Object();

    /* JADX INFO: renamed from: l.u660$a */
    public class RunnableC20497a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f177715a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f177716b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f177717c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f177718d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f177719e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC20500d f177720f;

        public RunnableC20497a(Context context, String str, String str2, String str3, String str4, InterfaceC20500d interfaceC20500d) {
            this.f177715a = context;
            this.f177716b = str;
            this.f177717c = str2;
            this.f177718d = str3;
            this.f177719e = str4;
            this.f177720f = interfaceC20500d;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            for (C20499c c20499c : u660.this.f177713c) {
                boolean zM194654g = u660.this.m194654g(this.f177715a, this.f177716b, this.f177717c, this.f177718d, this.f177719e, c20499c.f177727b, c20499c.f177728c, c20499c.f177729d);
                InterfaceC20500d interfaceC20500d = this.f177720f;
                if (!zM194654g) {
                    if (interfaceC20500d != null && !interfaceC20500d.mo135632a(c20499c.f177726a, c20499c.f177727b, c20499c.f177728c, "")) {
                        break;
                    }
                } else {
                    i++;
                    if (interfaceC20500d != null) {
                        interfaceC20500d.mo135633b(c20499c.f177726a, c20499c.f177727b, c20499c.f177728c);
                    }
                }
            }
            InterfaceC20500d interfaceC20500d2 = this.f177720f;
            if (interfaceC20500d2 != null) {
                interfaceC20500d2.mo135634c(u660.this.f177713c.size(), i);
            }
        }
    }

    /* JADX INFO: renamed from: l.u660$b */
    public class C20498b implements OSSCompletedCallback<PutObjectRequest, PutObjectResult> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f177722a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f177723b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C20501e f177724c;

        public C20498b(String str, String str2, C20501e c20501e) {
            this.f177722a = str;
            this.f177723b = str2;
            this.f177724c = c20501e;
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFailure(PutObjectRequest putObjectRequest, ClientException clientException, ServiceException serviceException) {
            if (clientException != null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ossUploadClientError", "bucketName", this.f177722a, "fileName", this.f177723b, "error", clientException.getMessage());
                clientException.printStackTrace();
            }
            if (serviceException != null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ossUploadServerError", "bucketName", this.f177722a, "fileName", this.f177723b, "error", serviceException.getMessage(), "requestId", serviceException.getRequestId(), "statusCode", "" + serviceException.getStatusCode());
            }
            this.f177724c.f177730a = false;
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(PutObjectRequest putObjectRequest, PutObjectResult putObjectResult) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ossUploadSuccess", "bucketName", this.f177722a, "fileName", this.f177723b, "requestId", putObjectResult != null ? putObjectResult.getRequestId() : "");
            this.f177724c.f177730a = true;
        }
    }

    /* JADX INFO: renamed from: l.u660$c */
    public static class C20499c {

        /* JADX INFO: renamed from: a */
        public int f177726a;

        /* JADX INFO: renamed from: b */
        public String f177727b;

        /* JADX INFO: renamed from: c */
        public String f177728c;

        /* JADX INFO: renamed from: d */
        public byte[] f177729d;

        public C20499c(int i, String str, String str2, byte[] bArr) {
            this.f177726a = i;
            this.f177727b = str;
            this.f177728c = str2;
            this.f177729d = bArr;
        }
    }

    /* JADX INFO: renamed from: l.u660$d */
    public interface InterfaceC20500d {
        /* JADX INFO: renamed from: a */
        boolean mo135632a(int i, String str, String str2, String str3);

        /* JADX INFO: renamed from: b */
        boolean mo135633b(int i, String str, String str2);

        /* JADX INFO: renamed from: c */
        void mo135634c(int i, int i2);
    }

    /* JADX INFO: renamed from: d */
    public static u660 m194649d() {
        return f177710e;
    }

    /* JADX INFO: renamed from: b */
    public void m194650b(int i, String str, String str2, byte[] bArr) {
        if (i == 3) {
            t0g0.m188742e(t0g0.C20202a.f171519g, null);
        }
        if (bArr == null || str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "addUploadFile", NotificationCompat.CATEGORY_STATUS, "error", "fileIdx", String.valueOf(i), "bucketName", str, "fileName", str2, "errMsg", "fileContent is null");
            return;
        }
        synchronized (this.f177714d) {
            this.f177713c.add(new C20499c(i, str, str2, bArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public int m194651c() {
        return this.f177711a.incrementAndGet();
    }

    /* JADX INFO: renamed from: e */
    public String m194652e(int i) {
        synchronized (this.f177714d) {
            try {
                for (C20499c c20499c : this.f177713c) {
                    if (c20499c.f177726a == i) {
                        return c20499c.f177728c;
                    }
                }
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m194653f() {
        synchronized (this.f177714d) {
            this.f177713c = new ArrayList<>();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m194654g(Context context, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        OSSStsTokenCredentialProvider oSSStsTokenCredentialProvider = new OSSStsTokenCredentialProvider(str2, str3, str4);
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setConnectionTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
        clientConfiguration.setSocketTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
        clientConfiguration.setMaxConcurrentRequest(5);
        clientConfiguration.setMaxErrorRetry(3);
        OSSClient oSSClient = new OSSClient(context, str, oSSStsTokenCredentialProvider, clientConfiguration);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentMD5(BinaryUtil.toBase64String(BinaryUtil.calculateMd5(bArr)));
        PutObjectRequest putObjectRequest = new PutObjectRequest(str5, str6, bArr, objectMetadata);
        C20501e c20501e = new C20501e(null);
        oSSClient.asyncPutObject(putObjectRequest, new C20498b(str5, str6, c20501e)).waitUntilFinished();
        return c20501e.f177730a;
    }

    /* JADX INFO: renamed from: h */
    public void m194655h() {
        m194653f();
    }

    /* JADX INFO: renamed from: i */
    public void m194656i(Context context, String str, String str2, String str3, String str4, InterfaceC20500d interfaceC20500d) {
        t0g0.m188742e(t0g0.C20202a.f171520h, null);
        synchronized (this.f177714d) {
            this.f177712b.execute(new RunnableC20497a(context, str, str2, str3, str4, interfaceC20500d));
        }
    }

    /* JADX INFO: renamed from: l.u660$e */
    public static class C20501e {

        /* JADX INFO: renamed from: a */
        public boolean f177730a;

        private C20501e() {
            this.f177730a = false;
        }

        public /* synthetic */ C20501e(RunnableC20497a runnableC20497a) {
            this();
        }
    }
}
