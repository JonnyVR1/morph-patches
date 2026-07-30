package com.p051p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import p153l.ojo;
import p153l.psd0;
import p153l.qjo;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetTribeFrag extends PutongMvpFrag<ojo, qjo> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m40445R4(Boolean bool) {
        if (bool.booleanValue()) {
            mo30636J4().m152777l();
        } else {
            mo30636J4().m152776k();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public ojo mo30639M4() {
        return new ojo(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public qjo mo30640N4() {
        return new qjo(this);
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m40448S4(int i, int i2, Intent intent) {
        return ((ojo) this.f17894z).m167890I0(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.ajo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71842a.m40445R4((Boolean) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((qjo) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        ((ojo) this.f17894z).m167891J0(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_intl_tribe_view";
    }
}
