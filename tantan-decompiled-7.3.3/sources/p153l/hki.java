package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class hki {

    /* JADX INFO: renamed from: d */
    private static hki f110417d = new hki();

    /* JADX INFO: renamed from: a */
    private ArrayList<C17489c> f110418a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private AtomicInteger f110419b = new AtomicInteger(1000);

    /* JADX INFO: renamed from: c */
    private final Object f110420c = new Object();

    /* JADX INFO: renamed from: l.hki$a */
    public class C17487a implements u660.InterfaceC20500d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC17490d f110421a;

        public C17487a(InterfaceC17490d interfaceC17490d) {
            this.f110421a = interfaceC17490d;
        }

        @Override // p153l.u660.InterfaceC20500d
        /* JADX INFO: renamed from: a */
        public boolean mo135632a(int i, String str, String str2, String str3) {
            InterfaceC17490d interfaceC17490d = this.f110421a;
            if (interfaceC17490d == null) {
                return false;
            }
            interfaceC17490d.mo18772a(i, str, str2, str3);
            return false;
        }

        @Override // p153l.u660.InterfaceC20500d
        /* JADX INFO: renamed from: b */
        public boolean mo135633b(int i, String str, String str2) {
            InterfaceC17490d interfaceC17490d = this.f110421a;
            if (interfaceC17490d == null) {
                return false;
            }
            interfaceC17490d.mo18773b(i, str, str2);
            return false;
        }

        @Override // p153l.u660.InterfaceC20500d
        /* JADX INFO: renamed from: c */
        public void mo135634c(int i, int i2) {
            InterfaceC17490d interfaceC17490d = this.f110421a;
            if (interfaceC17490d != null) {
                interfaceC17490d.mo18774c(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: l.hki$b */
    public class RunnableC17488b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC17490d f110423a;

        /* JADX INFO: renamed from: l.hki$b$a */
        public class a implements InterfaceC18331l1<Map<String, Object>> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Map f110425a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C17489c f110426b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Object f110427c;

            public a(Map map, C17489c c17489c, Object obj) {
                this.f110425a = map;
                this.f110426b = c17489c;
                this.f110427c = obj;
            }

            @Override // p153l.InterfaceC18331l1
            /* JADX INFO: renamed from: a */
            public void mo135635a(String str, String str2, String str3) {
                this.f110425a.put(LovePlanetStage.result, Boolean.FALSE);
                this.f110425a.put("ossConfig", this.f110426b.f110433e);
                if (!TextUtils.isEmpty(str2)) {
                    this.f110425a.put("msg", str2);
                }
                m135636b();
            }

            /* JADX INFO: renamed from: b */
            public void m135636b() {
                synchronized (this.f110427c) {
                    try {
                        this.f110427c.notifyAll();
                    } catch (Throwable unused) {
                    }
                }
            }

            @Override // p153l.InterfaceC18331l1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Map<String, Object> map) {
                this.f110425a.put(LovePlanetStage.result, Boolean.TRUE);
                m135636b();
            }
        }

        public RunnableC17488b(InterfaceC17490d interfaceC17490d) {
            this.f110423a = interfaceC17490d;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = new Object();
            HashMap map = new HashMap();
            int i = 0;
            boolean zMo18772a = false;
            for (C17489c c17489c : hki.this.f110418a) {
                map.clear();
                map.put(LovePlanetStage.result, Boolean.FALSE);
                HashMap map2 = new HashMap();
                map2.put("fileName", c17489c.f110431c);
                map2.put("fileContent", c17489c.f110432d);
                map2.put("ossConfig", c17489c.f110433e);
                map2.put("callback", new a(map, c17489c, obj));
                t33.m189069c().mo99940a(map2, (InterfaceC18331l1) map2.get("callback"));
                synchronized (obj) {
                    if (map.size() == 0) {
                        try {
                            obj.wait(20000L);
                        } catch (Throwable unused) {
                        }
                    }
                }
                Object obj2 = map.get(LovePlanetStage.result);
                if (obj2 == null || !(obj2 instanceof Boolean) || !((Boolean) obj2).booleanValue()) {
                    InterfaceC17490d interfaceC17490d = this.f110423a;
                    if (interfaceC17490d != null) {
                        zMo18772a = interfaceC17490d.mo18772a(c17489c.f110429a, c17489c.f110430b, c17489c.f110431c, (String) map.get("msg"));
                    }
                    map.get("ossConfig");
                    break;
                }
                i++;
                InterfaceC17490d interfaceC17490d2 = this.f110423a;
                if (interfaceC17490d2 != null) {
                    zMo18772a = interfaceC17490d2.mo18773b(c17489c.f110429a, c17489c.f110430b, c17489c.f110431c);
                }
            }
            InterfaceC17490d interfaceC17490d3 = this.f110423a;
            if (interfaceC17490d3 == null || zMo18772a) {
                return;
            }
            interfaceC17490d3.mo18774c(hki.this.f110418a.size(), i);
        }
    }

    /* JADX INFO: renamed from: l.hki$c */
    public static class C17489c {

        /* JADX INFO: renamed from: a */
        public int f110429a;

        /* JADX INFO: renamed from: b */
        public String f110430b;

        /* JADX INFO: renamed from: c */
        public String f110431c;

        /* JADX INFO: renamed from: d */
        public byte[] f110432d;

        /* JADX INFO: renamed from: e */
        public OSSConfig f110433e;

        public C17489c(int i, String str, String str2, byte[] bArr, OSSConfig oSSConfig) {
            this.f110429a = i;
            this.f110430b = str;
            this.f110431c = str2;
            this.f110432d = bArr;
            this.f110433e = oSSConfig;
        }
    }

    /* JADX INFO: renamed from: l.hki$d */
    public interface InterfaceC17490d {
        /* JADX INFO: renamed from: a */
        boolean mo18772a(int i, String str, String str2, String str3);

        /* JADX INFO: renamed from: b */
        boolean mo18773b(int i, String str, String str2);

        /* JADX INFO: renamed from: c */
        void mo18774c(int i, int i2);
    }

    /* JADX INFO: renamed from: d */
    public static hki m135625d() {
        return f110417d;
    }

    /* JADX INFO: renamed from: b */
    public void m135626b(int i, String str, String str2, byte[] bArr, OSSConfig oSSConfig) {
        if (afm.m97360H().m97446e0()) {
            u660.m194649d().m194650b(i, str, str2, bArr);
            return;
        }
        if (i == 3) {
            t0g0.m188742e(t0g0.C20202a.f171519g, null);
        }
        if (bArr == null || str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "addUploadFile", NotificationCompat.CATEGORY_STATUS, "error", "fileIdx", String.valueOf(i), "bucketName", str, "fileName", str2, "errMsg", "fileContent is null");
            return;
        }
        synchronized (this.f110420c) {
            this.f110418a.add(new C17489c(i, str, str2, bArr, oSSConfig));
        }
        if (i > this.f110419b.get()) {
            this.f110419b.set(i + 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m135627c() {
        return afm.m97360H().m97446e0() ? u660.m194649d().m194651c() : this.f110419b.incrementAndGet();
    }

    /* JADX INFO: renamed from: e */
    public String m135628e(int i) {
        if (afm.m97360H().m97446e0()) {
            return u660.m194649d().m194652e(i);
        }
        synchronized (this.f110420c) {
            try {
                for (C17489c c17489c : this.f110418a) {
                    if (c17489c.f110429a == i) {
                        return c17489c.f110431c;
                    }
                }
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m135629f() {
        if (afm.m97360H().m97446e0()) {
            u660.m194649d().m194653f();
            return;
        }
        synchronized (this.f110420c) {
            this.f110418a = new ArrayList<>();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m135630g() {
        if (afm.m97360H().m97446e0()) {
            u660.m194649d().m194655h();
        } else {
            m135629f();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m135631h(Context context, InterfaceC17490d interfaceC17490d) {
        if (afm.m97360H().m97446e0()) {
            OSSConfig oSSConfigM97443d0 = afm.m97360H().m97443d0();
            u660.m194649d().m194656i(context, oSSConfigM97443d0.OssEndPoint, oSSConfigM97443d0.AccessKeyId, oSSConfigM97443d0.AccessKeySecret, oSSConfigM97443d0.SecurityToken, new C17487a(interfaceC17490d));
        } else {
            t0g0.m188742e(t0g0.C20202a.f171520h, null);
            synchronized (this.f110420c) {
                jxi0.m147353h(new RunnableC17488b(interfaceC17490d));
            }
        }
    }
}
