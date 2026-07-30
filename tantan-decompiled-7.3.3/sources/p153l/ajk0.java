package p153l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Random;
import p153l.uik0;

/* JADX INFO: loaded from: classes12.dex */
public class ajk0<P extends uik0> extends C16494db<uik0> {

    /* JADX INFO: renamed from: I */
    public static final String[] f71833I = {"和你讲一个我的故事，只告诉你一个人哦！", "偷偷和你分享一个我的故事", "一定要看！我的一个小故事！", "刚刚写了一个我的故事，想看吗？", "我的一个小故事，分享给爱八卦的你", "偷偷和你说一个我的小故事，分享给爱八卦的你", "和你说一个我的故事，认识我这么久你肯定不知道！", "认识我这么久，想听听我的故事吗？", "和你分享一个我的故事，想听吗？"};

    /* JADX INFO: renamed from: H */
    public String f71834H;

    /* JADX INFO: renamed from: l.ajk0$a */
    public class C15725a implements rx3.InterfaceC19928a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rx3.InterfaceC19928a f71835a;

        public C15725a(rx3.InterfaceC19928a interfaceC19928a) {
            this.f71835a = interfaceC19928a;
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            ajk0.this.f71834H = str;
            if (NullChecker.m82487b(this.f71835a)) {
                this.f71835a.mo37613a(str);
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
            if (NullChecker.m82487b(this.f71835a)) {
                this.f71835a.mo37614b(str);
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            if (i == -2) {
                ajk0.this.f170717f.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: l.ajk0$b */
    public class C15726b extends zpq {
        public C15726b(PutongAct putongAct, String str, WebViewX webViewX) {
            super(putongAct, str, webViewX);
        }

        @JavascriptInterface
        public void pickPicture() {
            ajk0.this.act().pickImagesWithPicker(1, false, false, true);
        }
    }

    public ajk0(PutongAct putongAct) {
        super(putongAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ Boolean m98390F(String str) {
        if (!str.startsWith("tantan:") || !str.contains("shareAction") || TextUtils.isEmpty(this.f71834H)) {
            return Boolean.FALSE;
        }
        final String str2 = ktp0.m151393d(str).get("imgurl");
        if (TextUtils.isEmpty(str2)) {
            l51.m152887G(new Runnable() { // from class: l.xik0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194466a.m98399l0();
                }
            });
        } else {
            l51.m152887G(new Runnable() { // from class: l.wik0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189369a.m98398k0(str2);
                }
            });
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m98395i0(uxj0 uxj0Var) {
    }

    @Override // p153l.C16494db
    /* JADX INFO: renamed from: U */
    public zpq mo98397U(PutongAct putongAct, String str, WebViewX webViewX) {
        return new C15726b(putongAct, str, webViewX);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m98398k0(String str) {
        try {
            m98400m0(this.f71834H, URLDecoder.decode(str, "UTF-8"), BLiveOperationClickAction.f45265h5);
        } catch (UnsupportedEncodingException e) {
            CrashHelper.m82479c(e);
            m98400m0(this.f71834H, null, BLiveOperationClickAction.f45265h5);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m98399l0() {
        m98400m0(this.f71834H, null, BLiveOperationClickAction.f45265h5);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m98400m0(String str, @Nullable String str2, @Nullable String str3) {
        HashMap map;
        Random random = new Random();
        if (NullChecker.m82486a(str2)) {
            str2 = str2.endsWith(".jpg") ? str2.concat("?format=180x180") : str2.concat(".jpg?format=180x180");
        }
        String str4 = str2;
        String[] strArr = f71833I;
        int iNextInt = random.nextInt(strArr.length);
        Link link = new Link();
        link.href = str;
        link.resources = jyb.m147507f0(new IdBoxed(CoreModule.m30929H().userId(), "user"));
        if (NullChecker.m82486a(str3)) {
            map = new HashMap(1);
            map.put("share_from", str3);
        } else {
            map = null;
        }
        new ShareHelper(link, map).m81203x0(act(), act().getString(R$string.f18555Il), strArr[iNextInt], jyb.m147507f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session")), true, str4).subscribe(psd0.m173597H(new y20() { // from class: l.yik0
            @Override // p153l.y20
            public final void call(Object obj) {
                ajk0.m98395i0((uxj0) obj);
            }
        }, new y20() { // from class: l.zik0
            @Override // p153l.y20
            public final void call(Object obj) {
                bsj0.m106246D((Throwable) obj);
            }
        }));
    }

    @Override // p153l.C16494db, p153l.sup0
    /* JADX INFO: renamed from: u */
    public qcj<String, Boolean> mo98401u() {
        return new qcj() { // from class: l.vik0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184253a.m98390F((String) obj);
            }
        };
    }

    @Override // p153l.C16494db, p153l.sup0
    /* JADX INFO: renamed from: v */
    public rx3.InterfaceC19928a mo98402v() {
        return new C15725a(super.mo98402v());
    }
}
