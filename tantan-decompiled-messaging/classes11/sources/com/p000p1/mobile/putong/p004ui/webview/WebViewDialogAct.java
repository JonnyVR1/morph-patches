package com.p000p1.mobile.putong.p004ui.webview;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.webview.WebViewDialogAct;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.roj0;
import l.v9j;
import l.w9j;
import p009l.vjf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WebViewDialogAct extends WebViewAct {

    /* JADX INFO: renamed from: f */
    public c4g0 f8367f = null;

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m10510l2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$4(c cVar) {
        if (cVar == c.k) {
            if (vjf0.m23406e().m23418n() || !ConnectivityReceiver.g()) {
                return;
            }
            m10513n2(this.f8367f);
            act().finish();
            vjf0.m23406e().m23430z().onNext(roj0.a);
            return;
        }
        if (cVar == c.m) {
            vjf0.m23406e().m23425u(false);
            if (vjf0.m23406e().m23412f()) {
                vjf0.m23406e().m23430z().onNext(roj0.a);
            }
        }
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m10511m2(Context context, String str, String str2, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) WebViewDialogAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("transparent_webview", true);
        intent.putExtra("disable_keybord_back", z2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public /* synthetic */ void m10512p2(Boolean bool) {
        m10513n2(this.f8367f);
        act().finish();
    }

    @Override // com.p000p1.mobile.putong.p004ui.webview.WebViewAct
    public void initSubscription() {
        super.initSubscription();
        this.f8364c.m15880a0();
        vjf0.m23406e().m23425u(true);
        vjf0.m23406e().m23424t(true);
        vjf0.m23406e().m23421q(true);
        act().duringCreated(new v9j() { // from class: l.pkp0
            public final Object call() {
                return ConnectivityReceiver.m();
            }
        }, false).filter(new w9j() { // from class: l.qkp0
            public final Object call(Object obj) {
                return Boolean.valueOf(!ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.rkp0
            public final void call(Object obj) {
                this.f19898a.m10514o2((NetworkInfo) obj);
            }
        }, new e30() { // from class: l.skp0
            public final void call(Object obj) {
                WebViewDialogAct.m10510l2((Throwable) obj);
            }
        }));
        this.f8367f = lifecycle().subscribe(mkd0.G(new e30() { // from class: l.tkp0
            public final void call(Object obj) {
                this.f20761a.lambda$initSubscription$4((c) obj);
            }
        }));
        act().duringCreated(vjf0.m23406e().m23428x(), false).subscribe(mkd0.G(new e30() { // from class: l.ukp0
            public final void call(Object obj) {
                this.f21235a.m10512p2((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n2 */
    public final void m10513n2(c4g0 c4g0Var) {
        if (!NullChecker.a(c4g0Var) || c4g0Var.isUnsubscribed()) {
            return;
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m10514o2(NetworkInfo networkInfo) {
        if (vjf0.m23406e().m23410c()) {
            vjf0.m23406e().m23424t(false);
            act().finish();
        }
    }

    @Override // com.p000p1.mobile.putong.p004ui.webview.WebViewAct
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (this.f8365d.m19965m() && i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
