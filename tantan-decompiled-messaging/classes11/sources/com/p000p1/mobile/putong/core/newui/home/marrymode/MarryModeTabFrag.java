package com.p000p1.mobile.putong.core.newui.home.marrymode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.mkd0;
import p009l.g1x;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MarryModeTabFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public g1x f2049B;

    /* JADX INFO: renamed from: C */
    public C0194a f2050C;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ void m2758W4(Boolean bool) {
        if (bool.booleanValue()) {
            J4().l();
        } else {
            J4().k();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m2759d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.d4();
        CoreModule.c.e0.n4.put(Boolean.TRUE);
        this.f2049B = new g1x(this);
        C0194a c0194a = new C0194a(act(), this);
        this.f2050C = c0194a;
        c0194a.m2773i1(this.f2049B);
        this.f2049B.C(this.f2050C);
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: f4 */
    public void m2760f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        this.f2049B.m14756a0();
        L4().subscribe(mkd0.G(new e30() { // from class: l.w0x
            public final void call(Object obj) {
                this.f21835a.m2758W4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m2761g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f2050C.m2781r();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f2050C.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m2762n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
    }

    public void onStart() {
        super/*com.p1.mobile.android.app.Frag*/.onStart();
        this.f2050C.m2778n();
    }

    public void onStop() {
        this.f2050C.m2779p();
        super/*com.p1.mobile.android.app.Frag*/.onStop();
    }

    public String pageId() {
        return "p_marriage_home";
    }
}
