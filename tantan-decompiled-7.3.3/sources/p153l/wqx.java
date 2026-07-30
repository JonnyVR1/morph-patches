package p153l;

import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class wqx extends q0m {

    /* JADX INFO: renamed from: c */
    public final v120 f190442c;

    /* JADX INFO: renamed from: d */
    public final boolean f190443d;

    public wqx(v120 v120Var, C22421c<Pair<Boolean, Boolean>> c22421c, g8t g8tVar) {
        super(c22421c, g8tVar);
        this.f190442c = v120Var;
        this.f190443d = v120Var instanceof msf0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m207523h(Boolean bool) {
        this.f190442c.mo174618a(true);
        if (this.f190443d) {
            ((msf0) this.f190442c).mo159783c(false);
        }
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: f */
    public void mo108623f() {
        m174727c(Act.mediaCapture()).subscribe(dhw.m115825d(new y20() { // from class: l.vqx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185408a.m207523h((Boolean) obj);
            }
        }));
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: b */
    public void mo108622b() {
    }
}
