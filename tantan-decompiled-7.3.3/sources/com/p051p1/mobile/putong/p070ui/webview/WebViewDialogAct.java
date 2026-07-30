package com.p051p1.mobile.putong.p070ui.webview;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.p070ui.webview.WebViewDialogAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p153l.esf0;
import p153l.kcg0;
import p153l.pcj;
import p153l.psd0;
import p153l.qcj;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class WebViewDialogAct extends WebViewAct {

    /* JADX INFO: renamed from: f */
    public kcg0 f55609f = null;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$4(C4470c c4470c) {
        if (c4470c == C4470c.f16269k) {
            if (esf0.m122324e().m122336n() || !ConnectivityReceiver.m82467g()) {
                return;
            }
            m81358o2(this.f55609f);
            act().lambda$debugItems$19();
            esf0.m122324e().m122348z().onNext(uxj0.f181467a);
            return;
        }
        if (c4470c == C4470c.f16271m) {
            esf0.m122324e().m122343u(false);
            if (esf0.m122324e().m122330f()) {
                esf0.m122324e().m122348z().onNext(uxj0.f181467a);
            }
        }
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m81355m2(Throwable th) {
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m81356n2(Context context, String str, String str2, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) WebViewDialogAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("transparent_webview", true);
        intent.putExtra("disable_keybord_back", z2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m81357q2(Boolean bool) {
        m81358o2(this.f55609f);
        act().lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f55606c.mo40473a0();
        esf0.m122324e().m122343u(true);
        esf0.m122324e().m122342t(true);
        esf0.m122324e().m122339q(true);
        act().duringCreated(new pcj() { // from class: l.ttp0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ConnectivityReceiver.m82473m();
            }
        }, false).filter(new qcj() { // from class: l.utp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.vtp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185735a.m81359p2((NetworkInfo) obj);
            }
        }, new y20() { // from class: l.wtp0
            @Override // p153l.y20
            public final void call(Object obj) {
                WebViewDialogAct.m81355m2((Throwable) obj);
            }
        }));
        this.f55609f = lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.xtp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196239a.lambda$initSubscription$4((C4470c) obj);
            }
        }));
        act().duringCreated((C22421c) esf0.m122324e().m122346x(), false).subscribe(psd0.m173596G(new y20() { // from class: l.ytp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201531a.m81357q2((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o2 */
    public final void m81358o2(kcg0 kcg0Var) {
        if (!NullChecker.m82486a(kcg0Var) || kcg0Var.isUnsubscribed()) {
            return;
        }
        kcg0Var.unsubscribe();
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (this.f55607d.m188064m() && i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m81359p2(NetworkInfo networkInfo) {
        if (esf0.m122324e().m122328c()) {
            esf0.m122324e().m122342t(false);
            act().lambda$debugItems$19();
        }
    }
}
