package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.game;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import p153l.nus;
import p153l.rjn;
import p153l.sjn;

/* JADX INFO: loaded from: classes9.dex */
public class IntlGameTabFrag extends LiveSquareBaseFrag {

    /* JADX INFO: renamed from: A */
    public sjn f46514A;

    /* JADX INFO: renamed from: z */
    public rjn f46515z;

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        if (z) {
            this.f46515z.m181742v2();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f46515z = new rjn(this, new nus(m71996Z4(), this));
        sjn sjnVar = new sjn(this);
        this.f46514A = sjnVar;
        this.f46515z.mo52715C(sjnVar);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46514A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_intl_entertaiment_tab_game";
    }
}
