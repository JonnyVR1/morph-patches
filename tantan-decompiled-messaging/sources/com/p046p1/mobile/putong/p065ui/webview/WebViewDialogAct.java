package com.p046p1.mobile.putong.p065ui.webview;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.p065ui.webview.WebViewDialogAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.e30;
import p149l.mkd0;
import p149l.roj0;
import p149l.v9j;
import p149l.vjf0;
import p149l.w9j;

/* JADX INFO: loaded from: classes11.dex */
public class WebViewDialogAct extends WebViewAct {

    /* JADX INFO: renamed from: f */
    public c4g0 f54761f = null;

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m80172l2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$4(C4319c c4319c) {
        if (c4319c == C4319c.f15550k) {
            if (vjf0.m198623e().m198635n() || !ConnectivityReceiver.m81284g()) {
                return;
            }
            m80175n2(this.f54761f);
            act().lambda$debugItems$19();
            vjf0.m198623e().m198647z().onNext(roj0.f160388a);
            return;
        }
        if (c4319c == C4319c.f15552m) {
            vjf0.m198623e().m198642u(false);
            if (vjf0.m198623e().m198629f()) {
                vjf0.m198623e().m198647z().onNext(roj0.f160388a);
            }
        }
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m80173m2(Context context, String str, String str2, boolean z, boolean z2) {
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
    public /* synthetic */ void m80174p2(Boolean bool) {
        m80175n2(this.f54761f);
        act().lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f54758c.mo39470a0();
        vjf0.m198623e().m198642u(true);
        vjf0.m198623e().m198641t(true);
        vjf0.m198623e().m198638q(true);
        act().duringCreated(new v9j() { // from class: l.pkp0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ConnectivityReceiver.m81290m();
            }
        }, false).filter(new w9j() { // from class: l.qkp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.rkp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159878a.m80176o2((NetworkInfo) obj);
            }
        }, new e30() { // from class: l.skp0
            @Override // p149l.e30
            public final void call(Object obj) {
                WebViewDialogAct.m80172l2((Throwable) obj);
            }
        }));
        this.f54761f = lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.tkp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170907a.lambda$initSubscription$4((C4319c) obj);
            }
        }));
        act().duringCreated((C22306c) vjf0.m198623e().m198645x(), false).subscribe(mkd0.m154955G(new e30() { // from class: l.ukp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176951a.m80174p2((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n2 */
    public final void m80175n2(c4g0 c4g0Var) {
        if (!NullChecker.m81303a(c4g0Var) || c4g0Var.isUnsubscribed()) {
            return;
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m80176o2(NetworkInfo networkInfo) {
        if (vjf0.m198623e().m198627c()) {
            vjf0.m198623e().m198641t(false);
            act().lambda$debugItems$19();
        }
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (this.f54759d.m164977m() && i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
