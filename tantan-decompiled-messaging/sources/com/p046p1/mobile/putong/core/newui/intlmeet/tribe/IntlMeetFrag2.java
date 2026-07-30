package com.p046p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import p149l.cdo;
import p149l.vwb;
import p149l.xma;
import p149l.yco;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetFrag2 extends PutongMvpFrag<yco, cdo> {
    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public yco mo29641M4() {
        return new yco(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public cdo mo29642N4() {
        return new cdo(this);
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m39435Q4(int i, int i2, Intent intent) {
        return ((yco) this.f17175z).m214180m0(i, i2, intent);
    }

    /* JADX INFO: renamed from: R4 */
    public void m39436R4() {
        ((cdo) this.f17174A).m106276x();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.pageHelper.m109040p(vwb.m200311Y("is_privileged", Boolean.valueOf(xma.m210040C3())));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((cdo) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        v v2 = this.f17174A;
        if (z) {
            ((cdo) v2).m106277x1();
        } else {
            ((cdo) v2).m106264D1();
        }
        ((yco) this.f17175z).m214181n0(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_intl_meet_view";
    }
}
