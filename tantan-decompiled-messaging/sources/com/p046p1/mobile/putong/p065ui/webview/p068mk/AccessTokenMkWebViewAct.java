package com.p046p1.mobile.putong.p065ui.webview.p068mk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.UIBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.AccessTokenMkWebViewAct;
import java.util.Arrays;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.C20393ua;
import p149l.C20603va;
import p149l.C21650za;
import p149l.a500;
import p149l.aow;
import p149l.d30;
import p149l.e30;
import p149l.mkd0;
import p149l.qib0;
import p149l.roj0;
import p149l.s300;
import p149l.u400;
import p149l.vwb;
import p149l.w2c0;

/* JADX INFO: loaded from: classes11.dex */
public class AccessTokenMkWebViewAct extends MkWebViewAct implements UIBridgeImplementation.InterfaceC13126f {

    /* JADX INFO: renamed from: g */
    public C22393b<String> f54762g = C22393b.m221521b();

    /* JADX INFO: renamed from: h */
    public String[] f54763h = new String[0];

    /* JADX INFO: renamed from: i */
    public boolean f54764i;

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m80178n2(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m80180p2(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return m80181q2(context, str, str2, z, z2, z3, false);
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m80181q2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m80182r2(context, str, str2, z, z2, z3, z4, false);
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m80182r2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m80184u2(context, str, str2, true, z, true, z5, z2, z4, z3, null);
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m80183s2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ResultReceiver resultReceiver) {
        return m80184u2(context, str, str2, z, z2, z3, z4, z5, false, false, resultReceiver);
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m80184u2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ResultReceiver resultReceiver) {
        Intent intent = new Intent(context, (Class<?>) AccessTokenMkWebViewAct.class);
        intent.putExtra("title", str);
        String strM182089a = s300.m182089a(str2);
        intent.putExtra("url", strM182089a);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("hideNavigationBar", z2);
        intent.putExtra("ARG_RESULT_RECEIVER", resultReceiver);
        intent.putExtra("swipeBack", z3);
        intent.putExtra("needParseUrl", z4);
        intent.putExtra("isOpenUploadLog", z5);
        intent.putExtra("transparent_status_bar", z6);
        intent.putExtra("hardwareAccelerated", z7);
        aow.m97995j(intent, strM182089a);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m80185y2(String str) {
        if (str == null) {
            this.f54763h = new String[0];
        } else {
            this.f54763h = str.split(",\\s*");
        }
        ((C20603va) this.f54801e).m197609a0();
    }

    /* JADX INFO: renamed from: A2 */
    public void m80186A2() {
        qib0.f154714c0.mo97523r(act());
    }

    @Override // com.p046p1.mobile.putong.p065ui.jsbridge.implement.UIBridgeImplementation.InterfaceC13126f
    /* JADX INFO: renamed from: R */
    public C22306c<String> mo79863R(@Nullable final String str) {
        return this.f54762g.doOnSubscribe(new d30() { // from class: l.ra
            @Override // p149l.d30
            public final void call() {
                this.f158463a.m80185y2(str);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct
    /* JADX INFO: renamed from: h2 */
    public u400 mo80187h2() {
        return new C20393ua(this);
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct
    /* JADX INFO: renamed from: i2 */
    public a500 mo80188i2() {
        return new C20603va(this);
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getIntent().getBooleanExtra("isOpenUploadLog", false);
        this.f54764i = false;
    }

    /* JADX INFO: renamed from: v2 */
    public boolean m80189v2() {
        return vwb.m200337m(Arrays.asList(this.f54763h), new C21650za("share")) || ((C20603va) this.f54801e).m197610b0();
    }

    /* JADX INFO: renamed from: w2 */
    public boolean m80190w2() {
        return this.f54764i;
    }

    /* JADX INFO: renamed from: z2 */
    public void m80191z2() {
        if (!((C20603va) this.f54801e).m197610b0()) {
            this.f54762g.onNext("share");
            return;
        }
        Link link = new Link();
        link.href = this.f54801e.m95000y();
        new ShareHelper(link).m80018v0(this.act, null, ((C20603va) this.f54801e).m197608Z(), this.f54801e.m95000y(), vwb.m200324f0(LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session")), false, ShareHelper.m79954U(w2c0.f184177h0)).subscribe(mkd0.m154956H(new e30() { // from class: l.sa
            @Override // p149l.e30
            public final void call(Object obj) {
                AccessTokenMkWebViewAct.m80178n2((roj0) obj);
            }
        }, new e30() { // from class: l.ta
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151580j("未安装微信");
            }
        }));
    }
}
