package com.p051p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import p153l.cfo;
import p153l.joa;
import p153l.jyb;
import p153l.yeo;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetFrag2 extends PutongMvpFrag<yeo, cfo> {
    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public yeo mo30639M4() {
        return new yeo(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public cfo mo30640N4() {
        return new cfo(this);
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m40438Q4(int i, int i2, Intent intent) {
        return ((yeo) this.f17894z).m215432m0(i, i2, intent);
    }

    /* JADX INFO: renamed from: R4 */
    public void m40439R4() {
        ((cfo) this.f17893A).m109570x();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.pageHelper.m152781p(jyb.m147494Y("is_privileged", Boolean.valueOf(joa.m146354D3())));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((cfo) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        v v2 = this.f17893A;
        if (z) {
            ((cfo) v2).m109571x1();
        } else {
            ((cfo) v2).m109558D1();
        }
        ((yeo) this.f17894z).m215433n0(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_intl_meet_view";
    }
}
