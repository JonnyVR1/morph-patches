package com.p000p1.mobile.putong.core.newui.intlmeet.tribe;

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
import p009l.cdo;
import p009l.yco;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlMeetFrag2 extends PutongMvpFrag<yco, cdo> {
    /* JADX INFO: renamed from: B4 */
    public boolean m3480B4() {
        return false;
    }

    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public yco m3481M4() {
        return new yco(this);
    }

    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public cdo m3482N4() {
        return new cdo(this);
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m3485Q4(int i, int i2, Intent intent) {
        return ((yco) ((PutongMvpFrag) this).z).m25297m0(i, i2, intent);
    }

    /* JADX INFO: renamed from: R4 */
    public void m3486R4() {
        ((cdo) ((PutongMvpFrag) this).A).m12536x();
    }

    /* JADX INFO: renamed from: d4 */
    public void m3487d4() {
        super.d4();
        ((PutongFrag) this).pageHelper.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(xma.C3()))});
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((cdo) ((PutongMvpFrag) this).A).inflateView(layoutInflater, viewGroup);
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        s7m s7mVar = ((PutongMvpFrag) this).A;
        if (z) {
            ((cdo) s7mVar).m12537x1();
        } else {
            ((cdo) s7mVar).m12523D1();
        }
        ((yco) ((PutongMvpFrag) this).z).m25298n0(z);
    }

    public String pageId() {
        return "p_intl_meet_view";
    }
}
