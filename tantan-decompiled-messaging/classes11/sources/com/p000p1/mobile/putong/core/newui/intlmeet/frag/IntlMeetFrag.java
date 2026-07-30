package com.p000p1.mobile.putong.core.newui.intlmeet.frag;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.app.PutongMvpFrag;
import l.j760;
import l.s7m;
import l.vwb;
import l.xma;
import p009l.ldo;
import p009l.rdo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlMeetFrag extends PutongMvpFrag<ldo, rdo> {
    /* JADX INFO: renamed from: B4 */
    public boolean m3392B4() {
        return false;
    }

    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public ldo m3393M4() {
        return new ldo(this);
    }

    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public rdo m3394N4() {
        return new rdo(this);
    }

    /* JADX INFO: renamed from: d4 */
    public void m3397d4() {
        super.d4();
        ((PutongFrag) this).pageHelper.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(xma.C3()))});
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((rdo) ((PutongMvpFrag) this).A).inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (((ldo) ((PutongMvpFrag) this).z).m17852m0(i, i2, intent)) {
            return;
        }
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        s7m s7mVar = ((PutongMvpFrag) this).A;
        if (z) {
            ((rdo) s7mVar).m21619x1();
        } else {
            ((rdo) s7mVar).m21604D1();
        }
        ((ldo) ((PutongMvpFrag) this).z).m17853n0(z);
    }

    public String pageId() {
        return "p_intl_meet_view";
    }
}
