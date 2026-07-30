package p149l;

import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class x1e0 extends xj2 {

    /* JADX INFO: renamed from: c */
    public final int f189061c;

    /* JADX INFO: renamed from: d */
    public final String f189062d;

    /* JADX INFO: renamed from: e */
    public final C21019b f189063e;

    /* JADX INFO: renamed from: l.x1e0$a */
    public static class C21018a extends yj2 {

        /* JADX INFO: renamed from: c */
        public String f189064c;

        /* JADX INFO: renamed from: d */
        public C21019b f189065d;

        public C21018a(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: c */
        public x1e0 m206699c() {
            return new x1e0(this);
        }

        /* JADX INFO: renamed from: d */
        public C21018a m206700d(C21019b c21019b) {
            this.f189065d = c21019b;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C21018a m206701e(String str) {
            this.f189064c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.x1e0$b */
    public static class C21019b {

        /* JADX INFO: renamed from: a */
        public ihs f189066a;

        /* JADX INFO: renamed from: b */
        public LiveGiftItemView f189067b;

        /* JADX INFO: renamed from: c */
        public Map<String, Object> f189068c = new HashMap();

        /* JADX INFO: renamed from: a */
        public void m206702a(String str, Object obj) {
            this.f189068c.put(str, obj);
        }

        /* JADX INFO: renamed from: b */
        public void m206703b(LiveGiftItemView liveGiftItemView) {
            this.f189067b = liveGiftItemView;
        }

        /* JADX INFO: renamed from: c */
        public void m206704c(ihs ihsVar) {
            this.f189066a = ihsVar;
        }
    }

    public x1e0(C21018a c21018a) {
        super(c21018a);
        this.f189061c = 1;
        this.f189062d = c21018a.f189064c;
        this.f189063e = c21018a.f189065d;
    }

    /* JADX INFO: renamed from: b */
    public static x1e0 m206696b(int i, String str) {
        return new C21018a(i).m206701e(str).m206699c();
    }
}
