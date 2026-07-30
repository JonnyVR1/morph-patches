package com.p051p1.mobile.putong.core.newui.intlmeet.likers;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import p153l.joa;
import p153l.jyb;
import p153l.pio;
import p153l.psd0;
import p153l.uho;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetLikersFrag extends PutongMvpFrag<uho, pio> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m40381S4(Boolean bool) {
        if (bool.booleanValue()) {
            mo30636J4().m152777l();
            ((pio) this.f17893A).m172447m0();
        } else {
            mo30636J4().m152776k();
        }
        ((pio) this.f17893A).m172448n0(bool.booleanValue());
        ((uho) this.f17894z).m196110W0(bool.booleanValue());
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public uho mo30639M4() {
        return new uho(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public pio mo30640N4() {
        return new pio(this);
    }

    /* JADX INFO: renamed from: R4 */
    public boolean m40384R4() {
        return (act() == null || (act() instanceof IntlSeeAct)) ? false : true;
    }

    /* JADX INFO: renamed from: T4 */
    public boolean m40385T4(int i, int i2, Intent intent) {
        return ((uho) this.f17894z).m196104P0(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        if (m40384R4()) {
            this.pageHelper.m152781p(jyb.m147494Y("is_privileged", Boolean.valueOf(!joa.m146392i4())));
        } else {
            this.pageHelper.m152781p(jyb.m147494Y("see_entrance", (act() == null || act().getIntent() == null) ? null : act().getIntent().getStringExtra("from")));
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.ugo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178920a.m40381S4((Boolean) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((pio) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        p p;
        super.onHiddenChanged(z);
        v v2 = this.f17893A;
        if (v2 != 0) {
            ((pio) v2).m172446l0(Boolean.valueOf(z));
        }
        p p2 = this.f17894z;
        if (p2 != 0) {
            ((uho) p2).m196106R0(Boolean.valueOf(z));
        }
        if (z || !m40384R4() || (p = this.f17894z) == 0) {
            return;
        }
        ((uho) p).m196103O0(null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return m40384R4() ? "p_intl_meet_view" : "p_intl_plm";
    }
}
