package com.p051p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.joa;
import p153l.jyb;
import p153l.ygp;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeMeetFrag extends PutongMvpFrag<IntlTribeMeetFragPresenter, ygp> {
    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    /* JADX INFO: renamed from: O4 */
    public void m40457O4() {
        if (!((IntlTribeMeetFragPresenter) this.f17894z).getSkipDefaultTab()) {
            ((ygp) this.f17893A).m215866s();
        }
        ((IntlTribeMeetFragPresenter) this.f17894z).m40477s0(false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public IntlTribeMeetFragPresenter mo30639M4() {
        return new IntlTribeMeetFragPresenter(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public ygp mo30640N4() {
        return new ygp(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        CoreModule.f18264c.f20304E1.m109151G3();
        this.pageHelper.m152781p(jyb.m147494Y("is_privileged", Boolean.valueOf(joa.m146354D3())));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((ygp) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (((IntlTribeMeetFragPresenter) this.f17894z).m40475q0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        v v2 = this.f17893A;
        if (z) {
            ((ygp) v2).m215871x1();
        } else {
            ((ygp) v2).m215854D1();
        }
        ((IntlTribeMeetFragPresenter) this.f17894z).m40476r0(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_intl_meet_view";
    }
}
