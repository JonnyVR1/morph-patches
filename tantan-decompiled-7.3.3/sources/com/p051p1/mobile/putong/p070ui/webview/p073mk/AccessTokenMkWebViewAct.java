package com.p051p1.mobile.putong.p070ui.webview.p073mk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.UIBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.AccessTokenMkWebViewAct;
import java.util.Arrays;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.C19327pa;
import p153l.C19541qa;
import p153l.C20531ua;
import p153l.cbc0;
import p153l.jd00;
import p153l.jyb;
import p153l.pc00;
import p153l.pd00;
import p153l.psd0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;
import p153l.zqw;

/* JADX INFO: loaded from: classes10.dex */
public class AccessTokenMkWebViewAct extends MkWebViewAct implements UIBridgeImplementation.InterfaceC13289f {

    /* JADX INFO: renamed from: g */
    public C22508b<String> f55610g = C22508b.m222767b();

    /* JADX INFO: renamed from: h */
    public String[] f55611h = new String[0];

    /* JADX INFO: renamed from: i */
    public boolean f55612i;

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m81361o2(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m81363q2(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return m81364r2(context, str, str2, z, z2, z3, false);
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m81364r2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m81365s2(context, str, str2, z, z2, z3, z4, false);
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m81365s2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m81367v2(context, str, str2, true, z, true, z5, z2, z4, z3, null);
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m81366u2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ResultReceiver resultReceiver) {
        return m81367v2(context, str, str2, z, z2, z3, z4, z5, false, false, resultReceiver);
    }

    /* JADX INFO: renamed from: v2 */
    public static Intent m81367v2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ResultReceiver resultReceiver) {
        Intent intent = new Intent(context, (Class<?>) AccessTokenMkWebViewAct.class);
        intent.putExtra("title", str);
        String strM171605a = pc00.m171605a(str2);
        intent.putExtra("url", strM171605a);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("hideNavigationBar", z2);
        intent.putExtra("ARG_RESULT_RECEIVER", resultReceiver);
        intent.putExtra("swipeBack", z3);
        intent.putExtra("needParseUrl", z4);
        intent.putExtra("isOpenUploadLog", z5);
        intent.putExtra("transparent_status_bar", z6);
        intent.putExtra("hardwareAccelerated", z7);
        zqw.m221059k(intent, strM171605a);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m81368z2(String str) {
        if (str == null) {
            this.f55611h = new String[0];
        } else {
            this.f55611h = str.split(",\\s*");
        }
        ((C19541qa) this.f55649e).m175854a0();
    }

    /* JADX INFO: renamed from: A2 */
    public void m81369A2() {
        if (!((C19541qa) this.f55649e).m175855b0()) {
            this.f55610g.onNext("share");
            return;
        }
        Link link = new Link();
        link.href = this.f55649e.m171745y();
        new ShareHelper(link).m81201v0(this.act, null, ((C19541qa) this.f55649e).m175853Z(), this.f55649e.m171745y(), jyb.m147507f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session")), false, ShareHelper.m81137U(cbc0.f80773h0)).subscribe(psd0.m173597H(new y20() { // from class: l.na
            @Override // p153l.y20
            public final void call(Object obj) {
                AccessTokenMkWebViewAct.m81361o2((uxj0) obj);
            }
        }, new y20() { // from class: l.oa
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165636j("未安装微信");
            }
        }));
    }

    /* JADX INFO: renamed from: B2 */
    public void m81370B2() {
        uqb0.f180397c0.mo105312r(act());
    }

    @Override // com.p051p1.mobile.putong.p070ui.jsbridge.implement.UIBridgeImplementation.InterfaceC13289f
    /* JADX INFO: renamed from: S */
    public C22421c<String> mo81046S(@Nullable final String str) {
        return this.f55610g.doOnSubscribe(new x20() { // from class: l.ma
            @Override // p153l.x20
            public final void call() {
                this.f135450a.m81368z2(str);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct
    /* JADX INFO: renamed from: i2 */
    public jd00 mo81371i2() {
        return new C19327pa(this);
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct
    /* JADX INFO: renamed from: k2 */
    public pd00 mo81372k2() {
        return new C19541qa(this);
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getIntent().getBooleanExtra("isOpenUploadLog", false);
        this.f55612i = false;
    }

    /* JADX INFO: renamed from: w2 */
    public boolean m81373w2() {
        return jyb.m147520m(Arrays.asList(this.f55611h), new C20531ua("share")) || ((C19541qa) this.f55649e).m175855b0();
    }

    /* JADX INFO: renamed from: y2 */
    public boolean m81374y2() {
        return this.f55612i;
    }
}
