package com.p000p1.mobile.putong.p004ui.webview.p007mk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.UIBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.share.ShareHelper;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.AccessTokenMkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkChannel;
import java.util.Arrays;
import l.aow;
import l.d30;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.vwb;
import l.w2c0;
import p009l.C1216ua;
import p009l.C1228va;
import p009l.C1347za;
import p009l.a500;
import p009l.s300;
import p009l.u400;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AccessTokenMkWebViewAct extends MkWebViewAct implements UIBridgeImplementation.InterfaceC0528f {

    /* JADX INFO: renamed from: g */
    public b<String> f8368g = b.b();

    /* JADX INFO: renamed from: h */
    public String[] f8369h = new String[0];

    /* JADX INFO: renamed from: i */
    public boolean f8370i;

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m10516n2(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m10518p2(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return m10519q2(context, str, str2, z, z2, z3, false);
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m10519q2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m10520r2(context, str, str2, z, z2, z3, z4, false);
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m10520r2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m10522u2(context, str, str2, true, z, true, z5, z2, z4, z3, null);
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m10521s2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ResultReceiver resultReceiver) {
        return m10522u2(context, str, str2, z, z2, z3, z4, z5, false, false, resultReceiver);
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m10522u2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ResultReceiver resultReceiver) {
        Intent intent = new Intent(context, (Class<?>) AccessTokenMkWebViewAct.class);
        intent.putExtra("title", str);
        String strM21983a = s300.m21983a(str2);
        intent.putExtra("url", strM21983a);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("hideNavigationBar", z2);
        intent.putExtra("ARG_RESULT_RECEIVER", resultReceiver);
        intent.putExtra("swipeBack", z3);
        intent.putExtra("needParseUrl", z4);
        intent.putExtra("isOpenUploadLog", z5);
        intent.putExtra("transparent_status_bar", z6);
        intent.putExtra("hardwareAccelerated", z7);
        aow.j(intent, strM21983a);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m10523y2(String str) {
        if (str == null) {
            this.f8369h = new String[0];
        } else {
            this.f8369h = str.split(",\\s*");
        }
        ((C1228va) this.f8407e).m23324a0();
    }

    /* JADX INFO: renamed from: A2 */
    public void m10524A2() {
        qib0.c0.r(act());
    }

    @Override // com.p000p1.mobile.putong.p004ui.jsbridge.implement.UIBridgeImplementation.InterfaceC0528f
    /* JADX INFO: renamed from: R */
    public c<String> mo10188R(@Nullable final String str) {
        return this.f8368g.doOnSubscribe(new d30() { // from class: l.ra
            public final void call() {
                this.f19702a.m10523y2(str);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct
    /* JADX INFO: renamed from: h2 */
    public u400 mo10525h2() {
        return new C1216ua(this);
    }

    @Override // com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct
    /* JADX INFO: renamed from: i2 */
    public a500 mo10526i2() {
        return new C1228va(this);
    }

    @Override // com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getIntent().getBooleanExtra("isOpenUploadLog", false);
        this.f8370i = false;
    }

    /* JADX INFO: renamed from: v2 */
    public boolean m10527v2() {
        return vwb.m(Arrays.asList(this.f8369h), new C1347za("share")) || ((C1228va) this.f8407e).m23325b0();
    }

    /* JADX INFO: renamed from: w2 */
    public boolean m10528w2() {
        return this.f8370i;
    }

    /* JADX INFO: renamed from: z2 */
    public void m10529z2() {
        if (!((C1228va) this.f8407e).m23325b0()) {
            this.f8368g.onNext("share");
            return;
        }
        Link link = new Link();
        link.href = this.f8407e.m11235y();
        new ShareHelper(link).m10347v0(((Act) this).act, null, ((C1228va) this.f8407e).m23323Z(), this.f8407e.m11235y(), vwb.f0(new LinkChannel[]{LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session")}), false, ShareHelper.m10283U(w2c0.h0)).subscribe(mkd0.H(new e30() { // from class: l.sa
            public final void call(Object obj) {
                AccessTokenMkWebViewAct.m10516n2((roj0) obj);
            }
        }, new e30() { // from class: l.ta
            public final void call(Object obj) {
                lsi0.j("未安装微信");
            }
        }));
    }
}
