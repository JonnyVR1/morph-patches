package com.p046p1.mobile.putong.live.external.intl.livesquare.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.intl.livesquare.home.IntlLiveSquareHomeFrag;
import com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p149l.a7j0;
import p149l.b4o;
import p149l.d30;
import p149l.d4o;
import p149l.e30;
import p149l.e4o;
import p149l.hu20;
import p149l.mss;
import p149l.s2u;
import p149l.s9s;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareHomeFrag extends LiveSquareHomeFrag implements a7j0 {

    /* JADX INFO: renamed from: A */
    public d4o f45687A;

    /* JADX INFO: renamed from: B */
    public final LiveHomeEventBus f45688B = new LiveHomeEventBus();

    /* JADX INFO: renamed from: C */
    public boolean f45689C = false;

    /* JADX INFO: renamed from: z */
    public e4o f45690z;

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ void m70182Q4(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        this.f45687A.m196514Q2();
        hu20.m132970p("context_square");
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag
    /* JADX INFO: renamed from: M4 */
    public String mo68943M4() {
        return this.f45687A.m109993U2();
    }

    @Override // com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag
    /* JADX INFO: renamed from: N4 */
    public LiveHomeEventBus mo68944N4() {
        return this.f45688B;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f45687A = new d4o(this, s2u.m182077i().map(new w9j() { // from class: l.y3o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }), new mss(this.f45688B, this));
        e4o e4oVar = new e4o();
        this.f45690z = e4oVar;
        this.f45687A.mo51532C(e4oVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.z3o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveSquareHomeFrag.m70182Q4((Bundle) obj);
            }
        }, new d30() { // from class: l.a4o
            @Override // p149l.d30
            public final void call() {
                this.f67550a.destroy();
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f45690z.m114701c(act());
        b4o.m100275a(this.f45687A, this.f45690z, act());
        this.f45687A.m196516S2();
        this.f45687A.m196515R2();
        if (isHidden()) {
            return;
        }
        onHiddenChanged(false);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45690z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        if (bundle != null) {
            s2u.m182081m(true);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.f45687A.m109994V2(z);
        if (z || this.f45689C) {
            return;
        }
        s9s.m182765p();
        this.f45689C = true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_live_recommend";
    }

    @Override // com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag, p149l.a7j0
    /* JADX INFO: renamed from: v */
    public String mo68945v() {
        return mo68943M4();
    }
}
