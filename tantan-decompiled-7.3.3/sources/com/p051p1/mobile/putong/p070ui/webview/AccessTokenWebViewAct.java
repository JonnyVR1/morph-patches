package com.p051p1.mobile.putong.p070ui.webview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.UIBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import java.util.Arrays;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.C16494db;
import p153l.C20531ua;
import p153l.C21270xa;
import p153l.cbc0;
import p153l.jyb;
import p153l.lup0;
import p153l.psd0;
import p153l.sup0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class AccessTokenWebViewAct extends WebViewAct implements UIBridgeImplementation.InterfaceC13289f {

    /* JADX INFO: renamed from: f */
    public C22508b<String> f55603f = C22508b.m222767b();

    /* JADX INFO: renamed from: g */
    public String[] f55604g = new String[0];

    /* JADX INFO: renamed from: h */
    public boolean f55605h;

    /* JADX INFO: renamed from: a2 */
    public static Intent m81333a2(Context context, String str, String str2) {
        return m81337k2(context, str, str2, false, false, false);
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ void m81336i2(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m81337k2(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return m81338l2(context, str, str2, z, z2, z3, false);
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m81338l2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(context, (Class<?>) AccessTokenWebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        intent.putExtra("hideNavigationBar", z);
        intent.putExtra("isOpenUploadLog", z2);
        intent.putExtra("hardwareAccelerated", z3);
        intent.putExtra("transparent_status_bar", z4);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.p070ui.jsbridge.implement.UIBridgeImplementation.InterfaceC13289f
    /* JADX INFO: renamed from: S */
    public C22421c<String> mo81046S(@Nullable final String str) {
        return this.f55603f.doOnSubscribe(new x20() { // from class: l.ra
            @Override // p153l.x20
            public final void call() {
                this.f161880a.m81341o2(str);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct
    /* JADX INFO: renamed from: c2 */
    public lup0 mo30698c2() {
        return new C21270xa(this);
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct
    /* JADX INFO: renamed from: d2 */
    public sup0 mo30699d2() {
        return new C16494db(this);
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((C16494db) this.f55607d).m115147W();
    }

    /* JADX INFO: renamed from: m2 */
    public boolean m81339m2() {
        return jyb.m147520m(Arrays.asList(this.f55604g), new C20531ua("share")) || ((C16494db) this.f55607d).m115149Y();
    }

    /* JADX INFO: renamed from: n2 */
    public boolean m81340n2() {
        return this.f55605h;
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m81341o2(String str) {
        if (str == null) {
            this.f55604g = new String[0];
        } else {
            this.f55604g = str.split(",\\s*");
        }
        ((C16494db) this.f55607d).m115148X();
    }

    /* JADX INFO: renamed from: p2 */
    public void m81342p2() {
        if (!((C16494db) this.f55607d).m115149Y()) {
            this.f55603f.onNext("share");
            return;
        }
        Link link = new Link();
        link.href = this.f55607d.m188067q();
        new ShareHelper(link).m81201v0(this.act, null, ((C16494db) this.f55607d).m115146V(), this.f55607d.m188067q(), jyb.m147507f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session")), false, ShareHelper.m81137U(cbc0.f80773h0)).subscribe(psd0.m173597H(new y20() { // from class: l.sa
            @Override // p153l.y20
            public final void call(Object obj) {
                AccessTokenWebViewAct.m81336i2((uxj0) obj);
            }
        }, new y20() { // from class: l.ta
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165636j("未安装微信");
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getIntent().getBooleanExtra("isOpenUploadLog", false);
        this.f55605h = false;
    }

    /* JADX INFO: renamed from: q2 */
    public void m81343q2() {
        uqb0.f180397c0.mo105312r(act());
    }
}
