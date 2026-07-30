package p006l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.app.web.WebViewX;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.data.IdBoxed;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkChannel;
import com.p1.mobile.putong.ui.share.ShareHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Random;
import l.aoq;
import l.e30;
import l.e51;
import l.gkp0;
import l.ib;
import l.mkd0;
import l.olp0;
import l.roj0;
import l.sw3;
import l.vwb;
import l.w9j;
import l.yij0;
import p006l.o9k0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class u9k0<P extends o9k0> extends ib<o9k0> {

    /* JADX INFO: renamed from: I */
    public static final String[] f23445I = {"和你讲一个我的故事，只告诉你一个人哦！", "偷偷和你分享一个我的故事", "一定要看！我的一个小故事！", "刚刚写了一个我的故事，想看吗？", "我的一个小故事，分享给爱八卦的你", "偷偷和你说一个我的小故事，分享给爱八卦的你", "和你说一个我的故事，认识我这么久你肯定不知道！", "认识我这么久，想听听我的故事吗？", "和你分享一个我的故事，想听吗？"};

    /* JADX INFO: renamed from: H */
    public String f23446H;

    /* JADX INFO: renamed from: l.u9k0$a */
    public class C1336a implements sw3.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sw3.a f23447a;

        public C1336a(sw3.a aVar) {
            this.f23447a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m25132a(String str) {
            u9k0.this.f23446H = str;
            if (NullChecker.b(this.f23447a)) {
                this.f23447a.a(str);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m25133b(String str) {
            if (NullChecker.b(this.f23447a)) {
                this.f23447a.b(str);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m25134c(int i, String str, String str2) {
            if (i == -2) {
                ((olp0) u9k0.this).f.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: l.u9k0$b */
    public class C1337b extends aoq {
        public C1337b(PutongAct putongAct, String str, WebViewX webViewX) {
            super(putongAct, str, webViewX);
        }

        @JavascriptInterface
        public void pickPicture() {
            u9k0.this.f().pickImagesWithPicker(1, false, false, true);
        }
    }

    public u9k0(PutongAct putongAct) {
        super(putongAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ Boolean m25119F(String str) {
        if (!str.startsWith("tantan:") || !str.contains("shareAction") || TextUtils.isEmpty(this.f23446H)) {
            return Boolean.FALSE;
        }
        final String str2 = (String) gkp0.d(str).get("imgurl");
        if (TextUtils.isEmpty(str2)) {
            e51.G(new Runnable() { // from class: l.r9k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20424a.m25128l0();
                }
            });
        } else {
            e51.G(new Runnable() { // from class: l.q9k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19685a.m25127k0(str2);
                }
            });
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m25124i0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: U */
    public aoq m25126U(PutongAct putongAct, String str, WebViewX webViewX) {
        return new C1337b(putongAct, str, webViewX);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m25127k0(String str) {
        try {
            m25129m0(this.f23446H, URLDecoder.decode(str, "UTF-8"), "h5");
        } catch (UnsupportedEncodingException e) {
            CrashHelper.c(e);
            m25129m0(this.f23446H, null, "h5");
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m25128l0() {
        m25129m0(this.f23446H, null, "h5");
    }

    /* JADX INFO: renamed from: m0 */
    public final void m25129m0(String str, @Nullable String str2, @Nullable String str3) {
        HashMap map;
        Random random = new Random();
        if (NullChecker.a(str2)) {
            str2 = str2.endsWith(".jpg") ? str2.concat("?format=180x180") : str2.concat(".jpg?format=180x180");
        }
        String str4 = str2;
        String[] strArr = f23445I;
        int iNextInt = random.nextInt(strArr.length);
        Link link = new Link();
        link.href = str;
        link.resources = vwb.f0(new IdBoxed[]{new IdBoxed(CoreModule.m1850H().userId(), "user")});
        if (NullChecker.a(str3)) {
            map = new HashMap(1);
            map.put("share_from", str3);
        } else {
            map = null;
        }
        new ShareHelper(link, map).x0(f(), f().getString(R$string.f2726ml), strArr[iNextInt], vwb.f0(new LinkChannel[]{LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session")}), true, str4).subscribe(mkd0.H(new e30() { // from class: l.s9k0
            public final void call(Object obj) {
                u9k0.m25124i0((roj0) obj);
            }
        }, new e30() { // from class: l.t9k0
            public final void call(Object obj) {
                yij0.D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public w9j<String, Boolean> m25130u() {
        return new w9j() { // from class: l.p9k0
            public final Object call(Object obj) {
                return this.f18641a.m25119F((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: v */
    public sw3.a m25131v() {
        return new C1336a(super.v());
    }
}
