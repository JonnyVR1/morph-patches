package com.p046p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.vwb;
import p149l.xma;
import p149l.yep;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeMeetFrag extends PutongMvpFrag<IntlTribeMeetFragPresenter, yep> {
    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    /* JADX INFO: renamed from: O4 */
    public void m39454O4() {
        if (!((IntlTribeMeetFragPresenter) this.f17175z).getSkipDefaultTab()) {
            ((yep) this.f17174A).m214369s();
        }
        ((IntlTribeMeetFragPresenter) this.f17175z).m39474s0(false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public IntlTribeMeetFragPresenter mo29641M4() {
        return new IntlTribeMeetFragPresenter(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public yep mo29642N4() {
        return new yep(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        CoreModule.f17545c.f19562E1.m187832G3();
        this.pageHelper.m109040p(vwb.m200311Y("is_privileged", Boolean.valueOf(xma.m210040C3())));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((yep) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (((IntlTribeMeetFragPresenter) this.f17175z).m39472q0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        v v2 = this.f17174A;
        if (z) {
            ((yep) v2).m214374x1();
        } else {
            ((yep) v2).m214357D1();
        }
        ((IntlTribeMeetFragPresenter) this.f17175z).m39473r0(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_intl_meet_view";
    }
}
