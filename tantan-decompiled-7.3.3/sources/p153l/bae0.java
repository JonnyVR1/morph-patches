package p153l;

import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class bae0 extends fk2 {

    /* JADX INFO: renamed from: c */
    public final int f75678c;

    /* JADX INFO: renamed from: d */
    public final String f75679d;

    /* JADX INFO: renamed from: e */
    public final C15954b f75680e;

    /* JADX INFO: renamed from: l.bae0$a */
    public static class C15953a extends gk2 {

        /* JADX INFO: renamed from: c */
        public String f75681c;

        /* JADX INFO: renamed from: d */
        public C15954b f75682d;

        public C15953a(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: c */
        public bae0 m103152c() {
            return new bae0(this);
        }

        /* JADX INFO: renamed from: d */
        public C15953a m103153d(C15954b c15954b) {
            this.f75682d = c15954b;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C15953a m103154e(String str) {
            this.f75681c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.bae0$b */
    public static class C15954b {

        /* JADX INFO: renamed from: a */
        public jjs f75683a;

        /* JADX INFO: renamed from: b */
        public LiveGiftItemView f75684b;

        /* JADX INFO: renamed from: c */
        public Map<String, Object> f75685c = new HashMap();

        /* JADX INFO: renamed from: a */
        public void m103155a(String str, Object obj) {
            this.f75685c.put(str, obj);
        }

        /* JADX INFO: renamed from: b */
        public void m103156b(LiveGiftItemView liveGiftItemView) {
            this.f75684b = liveGiftItemView;
        }

        /* JADX INFO: renamed from: c */
        public void m103157c(jjs jjsVar) {
            this.f75683a = jjsVar;
        }
    }

    public bae0(C15953a c15953a) {
        super(c15953a);
        this.f75678c = 1;
        this.f75679d = c15953a.f75681c;
        this.f75680e = c15953a.f75682d;
    }

    /* JADX INFO: renamed from: b */
    public static bae0 m103149b(int i, String str) {
        return new C15953a(i).m103154e(str).m103152c();
    }
}
