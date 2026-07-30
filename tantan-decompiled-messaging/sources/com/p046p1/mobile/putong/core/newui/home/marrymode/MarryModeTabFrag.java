package com.p046p1.mobile.putong.core.newui.home.marrymode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag;
import p149l.e30;
import p149l.g1x;
import p149l.mkd0;

/* JADX INFO: loaded from: classes11.dex */
public class MarryModeTabFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public g1x f23271B;

    /* JADX INFO: renamed from: C */
    public C8030a f23272C;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ void m38768W4(Boolean bool) {
        if (bool.booleanValue()) {
            mo29638J4().m109036l();
        } else {
            mo29638J4().m109035k();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        CoreModule.f17545c.f19639e0.f149433n4.put(Boolean.TRUE);
        this.f23271B = new g1x(this);
        C8030a c8030a = new C8030a(act(), this);
        this.f23272C = c8030a;
        c8030a.mo21065i1(this.f23271B);
        this.f23271B.mo51532C(this.f23272C);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f23271B.mo39470a0();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.w0x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183960a.m38768W4((Boolean) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f23272C.m38785r();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f23272C.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f23272C.m38782n();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        this.f23272C.m38783p();
        super.onStop();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_marriage_home";
    }
}
