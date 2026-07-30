package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x1e0 extends xj2 {

    /* JADX INFO: renamed from: c */
    public final int f22076c;

    /* JADX INFO: renamed from: d */
    public final String f22077d;

    /* JADX INFO: renamed from: e */
    public final C0892b f22078e;

    /* JADX INFO: renamed from: l.x1e0$a */
    public static class C0891a extends yj2 {

        /* JADX INFO: renamed from: c */
        public String f22079c;

        /* JADX INFO: renamed from: d */
        public C0892b f22080d;

        public C0891a(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: c */
        public x1e0 m25608c() {
            return new x1e0(this);
        }

        /* JADX INFO: renamed from: d */
        public C0891a m25609d(C0892b c0892b) {
            this.f22080d = c0892b;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0891a m25610e(String str) {
            this.f22079c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.x1e0$b */
    public static class C0892b {

        /* JADX INFO: renamed from: a */
        public ihs f22081a;

        /* JADX INFO: renamed from: b */
        public LiveGiftItemView f22082b;

        /* JADX INFO: renamed from: c */
        public Map<String, Object> f22083c = new HashMap();

        /* JADX INFO: renamed from: a */
        public void m25611a(String str, Object obj) {
            this.f22083c.put(str, obj);
        }

        /* JADX INFO: renamed from: b */
        public void m25612b(LiveGiftItemView liveGiftItemView) {
            this.f22082b = liveGiftItemView;
        }

        /* JADX INFO: renamed from: c */
        public void m25613c(ihs ihsVar) {
            this.f22081a = ihsVar;
        }
    }

    public x1e0(C0891a c0891a) {
        super(c0891a);
        this.f22076c = 1;
        this.f22077d = c0891a.f22079c;
        this.f22078e = c0891a.f22080d;
    }

    /* JADX INFO: renamed from: b */
    public static x1e0 m25605b(int i, String str) {
        return new C0891a(i).m25610e(str).m25608c();
    }
}
