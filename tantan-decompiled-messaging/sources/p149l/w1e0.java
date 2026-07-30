package p149l;

import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class w1e0 extends xj2 {

    /* JADX INFO: renamed from: c */
    public final int f183992c;

    /* JADX INFO: renamed from: d */
    public final String f183993d;

    /* JADX INFO: renamed from: e */
    public final C20785b f183994e;

    /* JADX INFO: renamed from: l.w1e0$a */
    public static class C20784a extends yj2 {

        /* JADX INFO: renamed from: c */
        public String f183995c;

        /* JADX INFO: renamed from: d */
        public C20785b f183996d;

        public C20784a(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: c */
        public w1e0 m200922c() {
            return new w1e0(this);
        }

        /* JADX INFO: renamed from: d */
        public C20784a m200923d(C20785b c20785b) {
            this.f183996d = c20785b;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20784a m200924e(String str) {
            this.f183995c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.w1e0$b */
    public static class C20785b {

        /* JADX INFO: renamed from: a */
        public ihs f183997a;

        /* JADX INFO: renamed from: b */
        public LiveVChatGiftItemView f183998b;

        /* JADX INFO: renamed from: c */
        public Map<String, Object> f183999c = new HashMap();

        /* JADX INFO: renamed from: a */
        public void m200925a(LiveVChatGiftItemView liveVChatGiftItemView) {
            this.f183998b = liveVChatGiftItemView;
        }

        /* JADX INFO: renamed from: b */
        public void m200926b(ihs ihsVar) {
            this.f183997a = ihsVar;
        }
    }

    public w1e0(C20784a c20784a) {
        super(c20784a);
        this.f183992c = 1;
        this.f183993d = c20784a.f183995c;
        this.f183994e = c20784a.f183996d;
    }
}
