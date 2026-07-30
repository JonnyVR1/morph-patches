package com.p051p1.mobile.putong.live.external.internal.virtualVoice.square;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import com.tantanapp.common.utils.CrashHelper;
import p153l.j7v;
import p153l.jyb;
import p153l.l4g0;
import p153l.nus;
import p153l.o7v;
import p153l.pcj;
import p153l.w6u;
import p153l.y6s;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceInternalCommonFrag extends LiveVPagerBaseFrag {

    /* JADX INFO: renamed from: A */
    public String f46346A;

    /* JADX INFO: renamed from: B */
    public nus f46347B;

    /* JADX INFO: renamed from: C */
    public j7v f46348C;

    /* JADX INFO: renamed from: D */
    public o7v f46349D;

    /* JADX INFO: renamed from: E */
    public pcj<nus> f46350E;

    /* JADX INFO: renamed from: z */
    public String f46351z;

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: O4 */
    public boolean mo71048O4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        this.f46348C.m143813R2(z, i, j);
        this.f46349D.m166380n(z, i, j);
        m71051Z4(z);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m71049X4() {
        if (this.f46347B == null) {
            Fragment fragmentM2558i0 = act().fragmentManager().m2558i0("voice_internal_square_page");
            if (fragmentM2558i0 instanceof LiveVoiceInternalSquareFrag) {
                this.f46347B = ((LiveVoiceInternalSquareFrag) fragmentM2558i0).m71054M4();
                return;
            }
            if (fragmentM2558i0 instanceof LiveVoiceInternalSquareFragNew) {
                this.f46347B = ((LiveVoiceInternalSquareFragNew) fragmentM2558i0).m71056k5();
                return;
            }
            nus nusVarCall = this.f46350E.call();
            this.f46347B = nusVarCall;
            if (nusVarCall == null) {
                CrashHelper.m82479c(new IllegalStateException("getHomeInfo null"));
                this.f46347B = new nus(new LiveHomeEventBus(), this);
            }
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void m71050Y4(pcj<nus> pcjVar) {
        this.f46350E = pcjVar;
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m71051Z4(boolean z) {
        this.pageHelper.m152781p(jyb.m147494Y("audio_tab_id", this.f46351z), jyb.m147494Y("source", this.f46346A));
        l4g0 l4g0Var = this.pageHelper;
        if (z) {
            w6u.m205197b(l4g0Var);
        } else {
            w6u.m205196a(l4g0Var);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m71049X4();
        m72008W4(6);
        this.f46346A = y6s.f197712e;
        this.f46351z = "0";
        if (getArguments() != null) {
            this.f46351z = getArguments().getString("tab_id_extra", "0");
            this.f46346A = getArguments().getString("source_extra", y6s.f197712e);
        }
        this.f46348C = new j7v(this, this.f46347B, this.f46351z, this.f46346A);
        o7v o7vVar = new o7v(this);
        this.f46349D = o7vVar;
        this.f46348C.mo52715C(o7vVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f46348C.m143808F2();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46349D.m166383r();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46349D.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public void m71052p() {
        this.f46348C.m143814S2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_audio_explore_recommend";
    }
}
