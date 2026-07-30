package com.p051p1.mobile.putong.live.external.intl.livesquare.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.intl.livesquare.home.IntlLiveSquareHomeFrag;
import com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p153l.b6o;
import p153l.d6o;
import p153l.e6o;
import p153l.egj0;
import p153l.nus;
import p153l.qcj;
import p153l.r230;
import p153l.t4u;
import p153l.tbs;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareHomeFrag extends LiveSquareHomeFrag implements egj0 {

    /* JADX INFO: renamed from: A */
    public d6o f46535A;

    /* JADX INFO: renamed from: B */
    public final LiveHomeEventBus f46536B = new LiveHomeEventBus();

    /* JADX INFO: renamed from: C */
    public boolean f46537C = false;

    /* JADX INFO: renamed from: z */
    public e6o f46538z;

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ void m71365Q4(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        this.f46535A.m204601Q2();
        r230.m179475p("context_square");
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag
    /* JADX INFO: renamed from: M4 */
    public String mo70126M4() {
        return this.f46535A.m114504U2();
    }

    @Override // com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag
    /* JADX INFO: renamed from: N4 */
    public LiveHomeEventBus mo70127N4() {
        return this.f46536B;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f46535A = new d6o(this, t4u.m189320i().map(new qcj() { // from class: l.y5o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }), new nus(this.f46536B, this));
        e6o e6oVar = new e6o();
        this.f46538z = e6oVar;
        this.f46535A.mo52715C(e6oVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.z5o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveSquareHomeFrag.m71365Q4((Bundle) obj);
            }
        }, new x20() { // from class: l.a6o
            @Override // p153l.x20
            public final void call() {
                this.f68743a.destroy();
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46538z.m119607c(act());
        b6o.m102791a(this.f46535A, this.f46538z, act());
        this.f46535A.m204603S2();
        this.f46535A.m204602R2();
        if (isHidden()) {
            return;
        }
        onHiddenChanged(false);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46538z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        if (bundle != null) {
            t4u.m189324m(true);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.f46535A.m114505V2(z);
        if (z || this.f46537C) {
            return;
        }
        tbs.m190079p();
        this.f46537C = true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_live_recommend";
    }

    @Override // com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag, p153l.egj0
    /* JADX INFO: renamed from: v */
    public String mo70128v() {
        return mo70126M4();
    }
}
