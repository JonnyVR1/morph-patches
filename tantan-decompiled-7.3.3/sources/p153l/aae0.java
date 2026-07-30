package p153l;

import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class aae0 extends fk2 {

    /* JADX INFO: renamed from: c */
    public final int f69124c;

    /* JADX INFO: renamed from: d */
    public final String f69125d;

    /* JADX INFO: renamed from: e */
    public final C15677b f69126e;

    /* JADX INFO: renamed from: l.aae0$a */
    public static class C15676a extends gk2 {

        /* JADX INFO: renamed from: c */
        public String f69127c;

        /* JADX INFO: renamed from: d */
        public C15677b f69128d;

        public C15676a(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: c */
        public aae0 m96626c() {
            return new aae0(this);
        }

        /* JADX INFO: renamed from: d */
        public C15676a m96627d(C15677b c15677b) {
            this.f69128d = c15677b;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C15676a m96628e(String str) {
            this.f69127c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.aae0$b */
    public static class C15677b {

        /* JADX INFO: renamed from: a */
        public jjs f69129a;

        /* JADX INFO: renamed from: b */
        public LiveVChatGiftItemView f69130b;

        /* JADX INFO: renamed from: c */
        public Map<String, Object> f69131c = new HashMap();

        /* JADX INFO: renamed from: a */
        public void m96629a(LiveVChatGiftItemView liveVChatGiftItemView) {
            this.f69130b = liveVChatGiftItemView;
        }

        /* JADX INFO: renamed from: b */
        public void m96630b(jjs jjsVar) {
            this.f69129a = jjsVar;
        }
    }

    public aae0(C15676a c15676a) {
        super(c15676a);
        this.f69124c = 1;
        this.f69125d = c15676a.f69127c;
        this.f69126e = c15676a.f69128d;
    }
}
