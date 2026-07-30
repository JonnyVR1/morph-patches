package com.p000p1.mobile.putong.p004ui.webview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.UIBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.share.ShareHelper;
import com.p000p1.mobile.putong.p004ui.webview.AccessTokenWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkChannel;
import java.util.Arrays;
import l.d30;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.vwb;
import l.w2c0;
import p009l.C0803cb;
import p009l.C0952ib;
import p009l.C1347za;
import p009l.hlp0;
import p009l.olp0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AccessTokenWebViewAct extends WebViewAct implements UIBridgeImplementation.InterfaceC0528f {

    /* JADX INFO: renamed from: f */
    public b<String> f8361f = b.b();

    /* JADX INFO: renamed from: g */
    public String[] f8362g = new String[0];

    /* JADX INFO: renamed from: h */
    public boolean f8363h;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m10482Z1(Context context, String str, String str2) {
        return m10486i2(context, str, str2, false, false, false);
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m10485h2(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m10486i2(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return m10487k2(context, str, str2, z, z2, z3, false);
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m10487k2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(context, (Class<?>) AccessTokenWebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        intent.putExtra("hideNavigationBar", z);
        intent.putExtra("isOpenUploadLog", z2);
        intent.putExtra("hardwareAccelerated", z3);
        intent.putExtra("transparent_status_bar", z4);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.p004ui.jsbridge.implement.UIBridgeImplementation.InterfaceC0528f
    /* JADX INFO: renamed from: R */
    public c<String> mo10188R(@Nullable final String str) {
        return this.f8361f.doOnSubscribe(new d30() { // from class: l.wa
            public final void call() {
                this.f21958a.m10492n2(str);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.p004ui.webview.WebViewAct
    /* JADX INFO: renamed from: b2 */
    public hlp0 mo10488b2() {
        return new C0803cb(this);
    }

    @Override // com.p000p1.mobile.putong.p004ui.webview.WebViewAct
    /* JADX INFO: renamed from: c2 */
    public olp0 mo10489c2() {
        return new C0952ib(this);
    }

    @Override // com.p000p1.mobile.putong.p004ui.webview.WebViewAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((C0952ib) this.f8365d).m16296W();
    }

    /* JADX INFO: renamed from: l2 */
    public boolean m10490l2() {
        return vwb.m(Arrays.asList(this.f8362g), new C1347za("share")) || ((C0952ib) this.f8365d).m16298Y();
    }

    /* JADX INFO: renamed from: m2 */
    public boolean m10491m2() {
        return this.f8363h;
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m10492n2(String str) {
        if (str == null) {
            this.f8362g = new String[0];
        } else {
            this.f8362g = str.split(",\\s*");
        }
        ((C0952ib) this.f8365d).m16297X();
    }

    /* JADX INFO: renamed from: o2 */
    public void m10493o2() {
        if (!((C0952ib) this.f8365d).m16298Y()) {
            this.f8361f.onNext("share");
            return;
        }
        Link link = new Link();
        link.href = this.f8365d.m19968q();
        new ShareHelper(link).m10347v0(((Act) this).act, null, ((C0952ib) this.f8365d).m16295V(), this.f8365d.m19968q(), vwb.f0(new LinkChannel[]{LinkChannel.get("wechat-moments"), LinkChannel.get("wechat-session")}), false, ShareHelper.m10283U(w2c0.h0)).subscribe(mkd0.H(new e30() { // from class: l.xa
            public final void call(Object obj) {
                AccessTokenWebViewAct.m10485h2((roj0) obj);
            }
        }, new e30() { // from class: l.ya
            public final void call(Object obj) {
                lsi0.j("未安装微信");
            }
        }));
    }

    /* JADX INFO: renamed from: p2 */
    public void m10494p2() {
        qib0.c0.r(act());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.p004ui.webview.WebViewAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getIntent().getBooleanExtra("isOpenUploadLog", false);
        this.f8363h = false;
    }
}
