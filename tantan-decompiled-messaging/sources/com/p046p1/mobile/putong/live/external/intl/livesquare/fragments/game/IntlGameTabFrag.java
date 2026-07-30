package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.game;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import p149l.mss;
import p149l.rhn;
import p149l.shn;

/* JADX INFO: loaded from: classes13.dex */
public class IntlGameTabFrag extends LiveSquareBaseFrag {

    /* JADX INFO: renamed from: A */
    public shn f45666A;

    /* JADX INFO: renamed from: z */
    public rhn f45667z;

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        if (z) {
            this.f45667z.m179432v2();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f45667z = new rhn(this, new mss(m70813Z4(), this));
        shn shnVar = new shn(this);
        this.f45666A = shnVar;
        this.f45667z.mo51532C(shnVar);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45666A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_intl_entertaiment_tab_game";
    }
}
