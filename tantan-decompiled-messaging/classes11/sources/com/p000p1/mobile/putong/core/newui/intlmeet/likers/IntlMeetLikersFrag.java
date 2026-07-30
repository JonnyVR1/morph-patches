package com.p000p1.mobile.putong.core.newui.intlmeet.likers;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.app.PutongMvpFrag;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.s7m;
import l.vwb;
import l.xma;
import p009l.pgo;
import p009l.ufo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlMeetLikersFrag extends PutongMvpFrag<ufo, pgo> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m3421S4(Boolean bool) {
        if (bool.booleanValue()) {
            J4().l();
            ((pgo) ((PutongMvpFrag) this).A).m20246m0();
        } else {
            J4().k();
        }
        ((pgo) ((PutongMvpFrag) this).A).m20247n0(bool.booleanValue());
        ((ufo) ((PutongMvpFrag) this).z).m22846V0(bool.booleanValue());
    }

    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public ufo m3422M4() {
        return new ufo(this);
    }

    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public pgo m3423N4() {
        return new pgo(this);
    }

    /* JADX INFO: renamed from: R4 */
    public boolean m3426R4() {
        return (act() == null || (act() instanceof IntlSeeAct)) ? false : true;
    }

    /* JADX INFO: renamed from: T4 */
    public boolean m3427T4(int i, int i2, Intent intent) {
        return ((ufo) ((PutongMvpFrag) this).z).m22840O0(i, i2, intent);
    }

    /* JADX INFO: renamed from: d4 */
    public void m3428d4() {
        super.d4();
        if (m3426R4()) {
            ((PutongFrag) this).pageHelper.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(!xma.h4()))});
        } else {
            ((PutongFrag) this).pageHelper.p(new j760[]{vwb.Y("see_entrance", (act() == null || act().getIntent() == null) ? null : act().getIntent().getStringExtra("from"))});
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m3429f4() {
        super.f4();
        L4().subscribe(mkd0.G(new e30() { // from class: l.ueo
            public final void call(Object obj) {
                this.f21102a.m3421S4((Boolean) obj);
            }
        }));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((pgo) ((PutongMvpFrag) this).A).inflateView(layoutInflater, viewGroup);
    }

    public void onHiddenChanged(boolean z) {
        jq2 jq2Var;
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        s7m s7mVar = ((PutongMvpFrag) this).A;
        if (s7mVar != null) {
            ((pgo) s7mVar).m20245l0(Boolean.valueOf(z));
        }
        jq2 jq2Var2 = ((PutongMvpFrag) this).z;
        if (jq2Var2 != null) {
            ((ufo) jq2Var2).m22842Q0(Boolean.valueOf(z));
        }
        if (z || !m3426R4() || (jq2Var = ((PutongMvpFrag) this).z) == null) {
            return;
        }
        ((ufo) jq2Var).m22839N0(null);
    }

    public String pageId() {
        return m3426R4() ? "p_intl_meet_view" : "p_intl_plm";
    }
}
