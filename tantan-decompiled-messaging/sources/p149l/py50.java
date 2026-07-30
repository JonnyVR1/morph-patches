package p149l;

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
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class py50 {

    /* JADX INFO: renamed from: e */
    private static py50 f151779e = new py50();

    /* JADX INFO: renamed from: a */
    public AtomicInteger f151780a = new AtomicInteger(1000);

    /* JADX INFO: renamed from: b */
    private ExecutorService f151781b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c */
    private ArrayList<C19367c> f151782c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    private final Object f151783d = new Object();

    /* JADX INFO: renamed from: l.py50$a */
    public class RunnableC19365a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f151784a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f151785b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f151786c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f151787d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f151788e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC19368d f151789f;

        public RunnableC19365a(Context context, String str, String str2, String str3, String str4, InterfaceC19368d interfaceC19368d) {
            this.f151784a = context;
            this.f151785b = str;
            this.f151786c = str2;
            this.f151787d = str3;
            this.f151788e = str4;
            this.f151789f = interfaceC19368d;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            for (C19367c c19367c : py50.this.f151782c) {
                boolean zM172007g = py50.this.m172007g(this.f151784a, this.f151785b, this.f151786c, this.f151787d, this.f151788e, c19367c.f151796b, c19367c.f151797c, c19367c.f151798d);
                InterfaceC19368d interfaceC19368d = this.f151789f;
                if (!zM172007g) {
                    if (interfaceC19368d != null && !interfaceC19368d.mo145969a(c19367c.f151795a, c19367c.f151796b, c19367c.f151797c, "")) {
                        break;
                    }
                } else {
                    i++;
                    if (interfaceC19368d != null) {
                        interfaceC19368d.mo145970b(c19367c.f151795a, c19367c.f151796b, c19367c.f151797c);
                    }
                }
            }
            InterfaceC19368d interfaceC19368d2 = this.f151789f;
            if (interfaceC19368d2 != null) {
                interfaceC19368d2.mo145971c(py50.this.f151782c.size(), i);
            }
        }
    }

    /* JADX INFO: renamed from: l.py50$b */
    public class C19366b implements OSSCompletedCallback<PutObjectRequest, PutObjectResult> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f151791a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f151792b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C19369e f151793c;

        public C19366b(String str, String str2, C19369e c19369e) {
            this.f151791a = str;
            this.f151792b = str2;
            this.f151793c = c19369e;
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFailure(PutObjectRequest putObjectRequest, ClientException clientException, ServiceException serviceException) {
            if (clientException != null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ossUploadClientError", "bucketName", this.f151791a, "fileName", this.f151792b, "error", clientException.getMessage());
                clientException.printStackTrace();
            }
            if (serviceException != null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ossUploadServerError", "bucketName", this.f151791a, "fileName", this.f151792b, "error", serviceException.getMessage(), "requestId", serviceException.getRequestId(), "statusCode", "" + serviceException.getStatusCode());
            }
            this.f151793c.f151799a = false;
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(PutObjectRequest putObjectRequest, PutObjectResult putObjectResult) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ossUploadSuccess", "bucketName", this.f151791a, "fileName", this.f151792b, "requestId", putObjectResult != null ? putObjectResult.getRequestId() : "");
            this.f151793c.f151799a = true;
        }
    }

    /* JADX INFO: renamed from: l.py50$c */
    public static class C19367c {

        /* JADX INFO: renamed from: a */
        public int f151795a;

        /* JADX INFO: renamed from: b */
        public String f151796b;

        /* JADX INFO: renamed from: c */
        public String f151797c;

        /* JADX INFO: renamed from: d */
        public byte[] f151798d;

        public C19367c(int i, String str, String str2, byte[] bArr) {
            this.f151795a = i;
            this.f151796b = str;
            this.f151797c = str2;
            this.f151798d = bArr;
        }
    }

    /* JADX INFO: renamed from: l.py50$d */
    public interface InterfaceC19368d {
        /* JADX INFO: renamed from: a */
        boolean mo145969a(int i, String str, String str2, String str3);

        /* JADX INFO: renamed from: b */
        boolean mo145970b(int i, String str, String str2);

        /* JADX INFO: renamed from: c */
        void mo145971c(int i, int i2);
    }

    /* JADX INFO: renamed from: d */
    public static py50 m172002d() {
        return f151779e;
    }

    /* JADX INFO: renamed from: b */
    public void m172003b(int i, String str, String str2, byte[] bArr) {
        if (i == 3) {
            ksf0.m147071e(ksf0.C18071a.f124469g, null);
        }
        if (bArr == null || str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "addUploadFile", NotificationCompat.CATEGORY_STATUS, "error", "fileIdx", String.valueOf(i), "bucketName", str, "fileName", str2, "errMsg", "fileContent is null");
            return;
        }
        synchronized (this.f151783d) {
            this.f151782c.add(new C19367c(i, str, str2, bArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public int m172004c() {
        return this.f151780a.incrementAndGet();
    }

    /* JADX INFO: renamed from: e */
    public String m172005e(int i) {
        synchronized (this.f151783d) {
            try {
                for (C19367c c19367c : this.f151782c) {
                    if (c19367c.f151795a == i) {
                        return c19367c.f151797c;
                    }
                }
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m172006f() {
        synchronized (this.f151783d) {
            this.f151782c = new ArrayList<>();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m172007g(Context context, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
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
        C19369e c19369e = new C19369e(null);
        oSSClient.asyncPutObject(putObjectRequest, new C19366b(str5, str6, c19369e)).waitUntilFinished();
        return c19369e.f151799a;
    }

    /* JADX INFO: renamed from: h */
    public void m172008h() {
        m172006f();
    }

    /* JADX INFO: renamed from: i */
    public void m172009i(Context context, String str, String str2, String str3, String str4, InterfaceC19368d interfaceC19368d) {
        ksf0.m147071e(ksf0.C18071a.f124470h, null);
        synchronized (this.f151783d) {
            this.f151781b.execute(new RunnableC19365a(context, str, str2, str3, str4, interfaceC19368d));
        }
    }

    /* JADX INFO: renamed from: l.py50$e */
    public static class C19369e {

        /* JADX INFO: renamed from: a */
        public boolean f151799a;

        private C19369e() {
            this.f151799a = false;
        }

        public /* synthetic */ C19369e(RunnableC19365a runnableC19365a) {
            this();
        }
    }
}
