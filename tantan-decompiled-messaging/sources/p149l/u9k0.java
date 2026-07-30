package p149l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Random;
import p149l.o9k0;

/* JADX INFO: loaded from: classes9.dex */
public class u9k0<P extends o9k0> extends C17514ib<o9k0> {

    /* JADX INFO: renamed from: I */
    public static final String[] f175335I = {"和你讲一个我的故事，只告诉你一个人哦！", "偷偷和你分享一个我的故事", "一定要看！我的一个小故事！", "刚刚写了一个我的故事，想看吗？", "我的一个小故事，分享给爱八卦的你", "偷偷和你说一个我的小故事，分享给爱八卦的你", "和你说一个我的故事，认识我这么久你肯定不知道！", "认识我这么久，想听听我的故事吗？", "和你分享一个我的故事，想听吗？"};

    /* JADX INFO: renamed from: H */
    public String f175336H;

    /* JADX INFO: renamed from: l.u9k0$a */
    public class C20384a implements sw3.InterfaceC20043a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sw3.InterfaceC20043a f175337a;

        public C20384a(sw3.InterfaceC20043a interfaceC20043a) {
            this.f175337a = interfaceC20043a;
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            u9k0.this.f175336H = str;
            if (NullChecker.m81304b(this.f175337a)) {
                this.f175337a.mo36610a(str);
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
            if (NullChecker.m81304b(this.f175337a)) {
                this.f175337a.mo36611b(str);
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            if (i == -2) {
                u9k0.this.f144532f.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: l.u9k0$b */
    public class C20385b extends aoq {
        public C20385b(PutongAct putongAct, String str, WebViewX webViewX) {
            super(putongAct, str, webViewX);
        }

        @JavascriptInterface
        public void pickPicture() {
            u9k0.this.act().pickImagesWithPicker(1, false, false, true);
        }
    }

    public u9k0(PutongAct putongAct) {
        super(putongAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ Boolean m192333F(String str) {
        if (!str.startsWith("tantan:") || !str.contains("shareAction") || TextUtils.isEmpty(this.f175336H)) {
            return Boolean.FALSE;
        }
        final String str2 = gkp0.m126669d(str).get("imgurl");
        if (TextUtils.isEmpty(str2)) {
            e51.m114742G(new Runnable() { // from class: l.r9k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158383a.m192341l0();
                }
            });
        } else {
            e51.m114742G(new Runnable() { // from class: l.q9k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153444a.m192340k0(str2);
                }
            });
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m192338i0(roj0 roj0Var) {
    }

    @Override // p149l.C17514ib
    /* JADX INFO: renamed from: U */
    public aoq mo135220U(PutongAct putongAct, String str, WebViewX webViewX) {
        return new C20385b(putongAct, str, webViewX);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m192340k0(String str) {
        try {
            m192342m0(this.f175336H, URLDecoder.decode(str, "UTF-8"), BLiveOperationClickAction.f44417h5);
        } catch (UnsupportedEncodingException e) {
            CrashHelper.m81296c(e);
            m192342m0(this.f175336H, null, BLiveOperationClickAction.f44417h5);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m192341l0() {
        m192342m0(this.f175336H, null, BLiveOperationClickAction.f44417h5);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m192342m0(String str, @Nullable String str2, @Nullable String str3) {
        HashMap map;
        Random random = new Random();
        if (NullChecker.m81303a(str2)) {
            str2 = str2.endsWith(".jpg") ? str2.concat("?format=180x180") : str2.concat(".jpg?format=180x180");
        }
        String str4 = str2;
        String[] strArr = f175335I;
        int iNextInt = random.nextInt(strArr.length);
        Link link = new Link();
        link.href = str;
        link.resources = vwb.m200324f0(new IdBoxed(CoreModule.m29931H().userId(), "user"));
        if (NullChecker.m81303a(str3)) {
            map = new HashMap(1);
            map.put("share_from", str3);
        } else {
            map = null;
        }
        new ShareHelper(link, map).m80020x0(act(), act().getString(R$string.f18737ml), strArr[iNextInt], vwb.m200324f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session")), true, str4).subscribe(mkd0.m154956H(new e30() { // from class: l.s9k0
            @Override // p149l.e30
            public final void call(Object obj) {
                u9k0.m192338i0((roj0) obj);
            }
        }, new e30() { // from class: l.t9k0
            @Override // p149l.e30
            public final void call(Object obj) {
                yij0.m214926D((Throwable) obj);
            }
        }));
    }

    @Override // p149l.C17514ib, p149l.olp0
    /* JADX INFO: renamed from: u */
    public w9j<String, Boolean> mo135230u() {
        return new w9j() { // from class: l.p9k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f147772a.m192333F((String) obj);
            }
        };
    }

    @Override // p149l.C17514ib, p149l.olp0
    /* JADX INFO: renamed from: v */
    public sw3.InterfaceC20043a mo135231v() {
        return new C20384a(super.mo135231v());
    }
}
