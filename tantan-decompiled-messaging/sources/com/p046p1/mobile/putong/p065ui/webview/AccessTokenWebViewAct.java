package com.p046p1.mobile.putong.p065ui.webview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.UIBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import java.util.Arrays;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.C16098cb;
import p149l.C17514ib;
import p149l.C21650za;
import p149l.d30;
import p149l.e30;
import p149l.hlp0;
import p149l.mkd0;
import p149l.olp0;
import p149l.qib0;
import p149l.roj0;
import p149l.vwb;
import p149l.w2c0;

/* JADX INFO: loaded from: classes11.dex */
public class AccessTokenWebViewAct extends WebViewAct implements UIBridgeImplementation.InterfaceC13126f {

    /* JADX INFO: renamed from: f */
    public C22393b<String> f54755f = C22393b.m221521b();

    /* JADX INFO: renamed from: g */
    public String[] f54756g = new String[0];

    /* JADX INFO: renamed from: h */
    public boolean f54757h;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m80150Z1(Context context, String str, String str2) {
        return m80154i2(context, str, str2, false, false, false);
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m80153h2(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m80154i2(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return m80155k2(context, str, str2, z, z2, z3, false);
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m80155k2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(context, (Class<?>) AccessTokenWebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        intent.putExtra("hideNavigationBar", z);
        intent.putExtra("isOpenUploadLog", z2);
        intent.putExtra("hardwareAccelerated", z3);
        intent.putExtra("transparent_status_bar", z4);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.p065ui.jsbridge.implement.UIBridgeImplementation.InterfaceC13126f
    /* JADX INFO: renamed from: R */
    public C22306c<String> mo79863R(@Nullable final String str) {
        return this.f54755f.doOnSubscribe(new d30() { // from class: l.wa
            @Override // p149l.d30
            public final void call() {
                this.f185415a.m80158n2(str);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct
    /* JADX INFO: renamed from: b2 */
    public hlp0 mo29700b2() {
        return new C16098cb(this);
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct
    /* JADX INFO: renamed from: c2 */
    public olp0 mo29701c2() {
        return new C17514ib(this);
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((C17514ib) this.f54759d).m135222W();
    }

    /* JADX INFO: renamed from: l2 */
    public boolean m80156l2() {
        return vwb.m200337m(Arrays.asList(this.f54756g), new C21650za("share")) || ((C17514ib) this.f54759d).m135224Y();
    }

    /* JADX INFO: renamed from: m2 */
    public boolean m80157m2() {
        return this.f54757h;
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m80158n2(String str) {
        if (str == null) {
            this.f54756g = new String[0];
        } else {
            this.f54756g = str.split(",\\s*");
        }
        ((C17514ib) this.f54759d).m135223X();
    }

    /* JADX INFO: renamed from: o2 */
    public void m80159o2() {
        if (!((C17514ib) this.f54759d).m135224Y()) {
            this.f54755f.onNext("share");
            return;
        }
        Link link = new Link();
        link.href = this.f54759d.m164980q();
        new ShareHelper(link).m80018v0(this.act, null, ((C17514ib) this.f54759d).m135221V(), this.f54759d.m164980q(), vwb.m200324f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session")), false, ShareHelper.m79954U(w2c0.f184177h0)).subscribe(mkd0.m154956H(new e30() { // from class: l.xa
            @Override // p149l.e30
            public final void call(Object obj) {
                AccessTokenWebViewAct.m80153h2((roj0) obj);
            }
        }, new e30() { // from class: l.ya
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151580j("未安装微信");
            }
        }));
    }

    /* JADX INFO: renamed from: p2 */
    public void m80160p2() {
        qib0.f154714c0.mo97523r(act());
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getIntent().getBooleanExtra("isOpenUploadLog", false);
        this.f54757h = false;
    }
}
