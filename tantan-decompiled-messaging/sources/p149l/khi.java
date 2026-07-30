package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class khi {

    /* JADX INFO: renamed from: d */
    private static khi f123154d = new khi();

    /* JADX INFO: renamed from: a */
    private ArrayList<C18015c> f123155a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private AtomicInteger f123156b = new AtomicInteger(1000);

    /* JADX INFO: renamed from: c */
    private final Object f123157c = new Object();

    /* JADX INFO: renamed from: l.khi$a */
    public class C18013a implements py50.InterfaceC19368d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC18016d f123158a;

        public C18013a(InterfaceC18016d interfaceC18016d) {
            this.f123158a = interfaceC18016d;
        }

        @Override // p149l.py50.InterfaceC19368d
        /* JADX INFO: renamed from: a */
        public boolean mo145969a(int i, String str, String str2, String str3) {
            InterfaceC18016d interfaceC18016d = this.f123158a;
            if (interfaceC18016d == null) {
                return false;
            }
            interfaceC18016d.mo17695a(i, str, str2, str3);
            return false;
        }

        @Override // p149l.py50.InterfaceC19368d
        /* JADX INFO: renamed from: b */
        public boolean mo145970b(int i, String str, String str2) {
            InterfaceC18016d interfaceC18016d = this.f123158a;
            if (interfaceC18016d == null) {
                return false;
            }
            interfaceC18016d.mo17696b(i, str, str2);
            return false;
        }

        @Override // p149l.py50.InterfaceC19368d
        /* JADX INFO: renamed from: c */
        public void mo145971c(int i, int i2) {
            InterfaceC18016d interfaceC18016d = this.f123158a;
            if (interfaceC18016d != null) {
                interfaceC18016d.mo17697c(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: l.khi$b */
    public class RunnableC18014b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC18016d f123160a;

        /* JADX INFO: renamed from: l.khi$b$a */
        public class a implements InterfaceC18132l1<Map<String, Object>> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Map f123162a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C18015c f123163b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Object f123164c;

            public a(Map map, C18015c c18015c, Object obj) {
                this.f123162a = map;
                this.f123163b = c18015c;
                this.f123164c = obj;
            }

            @Override // p149l.InterfaceC18132l1
            /* JADX INFO: renamed from: a */
            public void mo145972a(String str, String str2, String str3) {
                this.f123162a.put(LovePlanetStage.result, Boolean.FALSE);
                this.f123162a.put("ossConfig", this.f123163b.f123170e);
                if (!TextUtils.isEmpty(str2)) {
                    this.f123162a.put("msg", str2);
                }
                m145973b();
            }

            /* JADX INFO: renamed from: b */
            public void m145973b() {
                synchronized (this.f123164c) {
                    try {
                        this.f123164c.notifyAll();
                    } catch (Throwable unused) {
                    }
                }
            }

            @Override // p149l.InterfaceC18132l1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Map<String, Object> map) {
                this.f123162a.put(LovePlanetStage.result, Boolean.TRUE);
                m145973b();
            }
        }

        public RunnableC18014b(InterfaceC18016d interfaceC18016d) {
            this.f123160a = interfaceC18016d;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = new Object();
            HashMap map = new HashMap();
            int i = 0;
            boolean zMo17695a = false;
            for (C18015c c18015c : khi.this.f123155a) {
                map.clear();
                map.put(LovePlanetStage.result, Boolean.FALSE);
                HashMap map2 = new HashMap();
                map2.put("fileName", c18015c.f123168c);
                map2.put("fileContent", c18015c.f123169d);
                map2.put("ossConfig", c18015c.f123170e);
                map2.put("callback", new a(map, c18015c, obj));
                d33.m109851c().mo109852a(map2, (InterfaceC18132l1) map2.get("callback"));
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
                    InterfaceC18016d interfaceC18016d = this.f123160a;
                    if (interfaceC18016d != null) {
                        zMo17695a = interfaceC18016d.mo17695a(c18015c.f123166a, c18015c.f123167b, c18015c.f123168c, (String) map.get("msg"));
                    }
                    map.get("ossConfig");
                    break;
                }
                i++;
                InterfaceC18016d interfaceC18016d2 = this.f123160a;
                if (interfaceC18016d2 != null) {
                    zMo17695a = interfaceC18016d2.mo17696b(c18015c.f123166a, c18015c.f123167b, c18015c.f123168c);
                }
            }
            InterfaceC18016d interfaceC18016d3 = this.f123160a;
            if (interfaceC18016d3 == null || zMo17695a) {
                return;
            }
            interfaceC18016d3.mo17697c(khi.this.f123155a.size(), i);
        }
    }

    /* JADX INFO: renamed from: l.khi$c */
    public static class C18015c {

        /* JADX INFO: renamed from: a */
        public int f123166a;

        /* JADX INFO: renamed from: b */
        public String f123167b;

        /* JADX INFO: renamed from: c */
        public String f123168c;

        /* JADX INFO: renamed from: d */
        public byte[] f123169d;

        /* JADX INFO: renamed from: e */
        public OSSConfig f123170e;

        public C18015c(int i, String str, String str2, byte[] bArr, OSSConfig oSSConfig) {
            this.f123166a = i;
            this.f123167b = str;
            this.f123168c = str2;
            this.f123169d = bArr;
            this.f123170e = oSSConfig;
        }
    }

    /* JADX INFO: renamed from: l.khi$d */
    public interface InterfaceC18016d {
        /* JADX INFO: renamed from: a */
        boolean mo17695a(int i, String str, String str2, String str3);

        /* JADX INFO: renamed from: b */
        boolean mo17696b(int i, String str, String str2);

        /* JADX INFO: renamed from: c */
        void mo17697c(int i, int i2);
    }

    /* JADX INFO: renamed from: d */
    public static khi m145962d() {
        return f123154d;
    }

    /* JADX INFO: renamed from: b */
    public void m145963b(int i, String str, String str2, byte[] bArr, OSSConfig oSSConfig) {
        if (kcm.m145452H().m145538e0()) {
            py50.m172002d().m172003b(i, str, str2, bArr);
            return;
        }
        if (i == 3) {
            ksf0.m147071e(ksf0.C18071a.f124469g, null);
        }
        if (bArr == null || str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "addUploadFile", NotificationCompat.CATEGORY_STATUS, "error", "fileIdx", String.valueOf(i), "bucketName", str, "fileName", str2, "errMsg", "fileContent is null");
            return;
        }
        synchronized (this.f123157c) {
            this.f123155a.add(new C18015c(i, str, str2, bArr, oSSConfig));
        }
        if (i > this.f123156b.get()) {
            this.f123156b.set(i + 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m145964c() {
        return kcm.m145452H().m145538e0() ? py50.m172002d().m172004c() : this.f123156b.incrementAndGet();
    }

    /* JADX INFO: renamed from: e */
    public String m145965e(int i) {
        if (kcm.m145452H().m145538e0()) {
            return py50.m172002d().m172005e(i);
        }
        synchronized (this.f123157c) {
            try {
                for (C18015c c18015c : this.f123155a) {
                    if (c18015c.f123166a == i) {
                        return c18015c.f123168c;
                    }
                }
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m145966f() {
        if (kcm.m145452H().m145538e0()) {
            py50.m172002d().m172006f();
            return;
        }
        synchronized (this.f123157c) {
            this.f123155a = new ArrayList<>();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m145967g() {
        if (kcm.m145452H().m145538e0()) {
            py50.m172002d().m172008h();
        } else {
            m145966f();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m145968h(Context context, InterfaceC18016d interfaceC18016d) {
        if (kcm.m145452H().m145538e0()) {
            OSSConfig oSSConfigM145535d0 = kcm.m145452H().m145535d0();
            py50.m172002d().m172009i(context, oSSConfigM145535d0.OssEndPoint, oSSConfigM145535d0.AccessKeyId, oSSConfigM145535d0.AccessKeySecret, oSSConfigM145535d0.SecurityToken, new C18013a(interfaceC18016d));
        } else {
            ksf0.m147071e(ksf0.C18071a.f124470h, null);
            synchronized (this.f123157c) {
                ioi0.m137342h(new RunnableC18014b(interfaceC18016d));
            }
        }
    }
}
