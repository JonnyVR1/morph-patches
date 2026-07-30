package com.p000p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.p1.mobile.putong.core.CoreModule;
import l.j760;
import l.s7m;
import l.vwb;
import l.xma;
import p009l.yep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlTribeMeetFrag extends PutongMvpFrag<IntlTribeMeetFragPresenter, yep> {
    /* JADX INFO: renamed from: B4 */
    public boolean m3508B4() {
        return false;
    }

    /* JADX INFO: renamed from: O4 */
    public void m3511O4() {
        if (!((IntlTribeMeetFragPresenter) ((PutongMvpFrag) this).z).getSkipDefaultTab()) {
            ((yep) ((PutongMvpFrag) this).A).m25319s();
        }
        ((IntlTribeMeetFragPresenter) ((PutongMvpFrag) this).z).m3532s0(false);
    }

    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public IntlTribeMeetFragPresenter m3509M4() {
        return new IntlTribeMeetFragPresenter(this);
    }

    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public yep m3510N4() {
        return new yep(this);
    }

    /* JADX INFO: renamed from: d4 */
    public void m3514d4() {
        super.d4();
        CoreModule.c.E1.G3();
        ((PutongFrag) this).pageHelper.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(xma.C3()))});
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((yep) ((PutongMvpFrag) this).A).inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (((IntlTribeMeetFragPresenter) ((PutongMvpFrag) this).z).m3530q0(i, i2, intent)) {
            return;
        }
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        s7m s7mVar = ((PutongMvpFrag) this).A;
        if (z) {
            ((yep) s7mVar).m25324x1();
        } else {
            ((yep) s7mVar).m25306D1();
        }
        ((IntlTribeMeetFragPresenter) ((PutongMvpFrag) this).z).m3531r0(z);
    }

    public String pageId() {
        return "p_intl_meet_view";
    }
}
