package com.p051p1.mobile.putong.core.newui.intlmeet.frag;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import p153l.joa;
import p153l.jyb;
import p153l.lfo;
import p153l.rfo;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetFrag extends PutongMvpFrag<lfo, rfo> {
    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public lfo mo30639M4() {
        return new lfo(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public rfo mo30640N4() {
        return new rfo(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.pageHelper.m152781p(jyb.m147494Y("is_privileged", Boolean.valueOf(joa.m146354D3())));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((rfo) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (((lfo) this.f17894z).m154028m0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        v v2 = this.f17893A;
        if (z) {
            ((rfo) v2).m181248x1();
        } else {
            ((rfo) v2).m181234D1();
        }
        ((lfo) this.f17894z).m154029n0(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_intl_meet_view";
    }
}
