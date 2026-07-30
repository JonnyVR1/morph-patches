package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ActionBridgeImplementation;
import com.tantanapp.common.utils.NullChecker;
import p153l.aqq;
import p153l.kcg0;
import p153l.lf2;
import p153l.lkq;
import p153l.psd0;
import p153l.qcj;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class ActionBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: a */
    public kcg0 f55384a;

    /* JADX INFO: renamed from: b */
    public kcg0 f55385b;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m80898d(aqq aqqVar, String str, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        aqqVar.mo99544d().mo97003a(str);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m80900f(aqq aqqVar, String str, Boolean bool) {
        if (bool.booleanValue()) {
            aqqVar.mo99544d().mo97003a(str);
        }
    }

    @Override // p153l.lf2
    /* JADX INFO: renamed from: a */
    public synchronized void mo47711a() {
        try {
            if (NullChecker.m82486a(this.f55384a)) {
                this.f55384a.unsubscribe();
                this.f55384a = null;
            }
            if (NullChecker.m82486a(this.f55385b)) {
                this.f55385b.unsubscribe();
                this.f55385b = null;
            }
            super.mo47711a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @lkq(key = "subscribe")
    public void subscribe(@NonNull final aqq aqqVar, String str, final String str2, String str3, String str4) {
        if (str.equals("onAppEnterBackground")) {
            if (this.f55385b == null) {
                this.f55385b = Act.foreground().map(new qcj() { // from class: l.g30
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m82486a((Act.C4450r) obj));
                    }
                }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.h30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ActionBridgeImplementation.m80898d(aqqVar, str2, (Boolean) obj);
                    }
                }));
                aqqVar.mo99544d().mo97003a(str3);
                return;
            }
            return;
        }
        if (str.equals("onAppEnterForeground") && this.f55384a == null) {
            this.f55384a = Act.foreground().map(new qcj() { // from class: l.i30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a((Act.C4450r) obj));
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.j30
                @Override // p153l.y20
                public final void call(Object obj) {
                    ActionBridgeImplementation.m80900f(aqqVar, str2, (Boolean) obj);
                }
            }));
            aqqVar.mo99544d().mo97003a(str3);
        }
    }
}
