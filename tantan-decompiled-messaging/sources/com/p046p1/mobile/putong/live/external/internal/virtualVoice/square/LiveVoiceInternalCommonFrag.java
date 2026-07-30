package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import com.tantanapp.common.utils.CrashHelper;
import p149l.cwf0;
import p149l.i5v;
import p149l.mss;
import p149l.n5v;
import p149l.v4u;
import p149l.v9j;
import p149l.vwb;
import p149l.x4s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceInternalCommonFrag extends LiveVPagerBaseFrag {

    /* JADX INFO: renamed from: A */
    public String f45498A;

    /* JADX INFO: renamed from: B */
    public mss f45499B;

    /* JADX INFO: renamed from: C */
    public i5v f45500C;

    /* JADX INFO: renamed from: D */
    public n5v f45501D;

    /* JADX INFO: renamed from: E */
    public v9j<mss> f45502E;

    /* JADX INFO: renamed from: z */
    public String f45503z;

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: O4 */
    public boolean mo69865O4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        this.f45500C.m134559R2(z, i, j);
        this.f45501D.m158011n(z, i, j);
        m69868Z4(z);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m69866X4() {
        if (this.f45499B == null) {
            Fragment fragmentM2557i0 = act().fragmentManager().m2557i0("voice_internal_square_page");
            if (fragmentM2557i0 instanceof LiveVoiceInternalSquareFrag) {
                this.f45499B = ((LiveVoiceInternalSquareFrag) fragmentM2557i0).m69871M4();
                return;
            }
            if (fragmentM2557i0 instanceof LiveVoiceInternalSquareFragNew) {
                this.f45499B = ((LiveVoiceInternalSquareFragNew) fragmentM2557i0).m69873k5();
                return;
            }
            mss mssVarCall = this.f45502E.call();
            this.f45499B = mssVarCall;
            if (mssVarCall == null) {
                CrashHelper.m81296c(new IllegalStateException("getHomeInfo null"));
                this.f45499B = new mss(new LiveHomeEventBus(), this);
            }
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void m69867Y4(v9j<mss> v9jVar) {
        this.f45502E = v9jVar;
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m69868Z4(boolean z) {
        this.pageHelper.m109040p(vwb.m200311Y("audio_tab_id", this.f45503z), vwb.m200311Y("source", this.f45498A));
        cwf0 cwf0Var = this.pageHelper;
        if (z) {
            v4u.m197063b(cwf0Var);
        } else {
            v4u.m197062a(cwf0Var);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m69866X4();
        m70825W4(6);
        this.f45498A = x4s.f191057e;
        this.f45503z = "0";
        if (getArguments() != null) {
            this.f45503z = getArguments().getString("tab_id_extra", "0");
            this.f45498A = getArguments().getString("source_extra", x4s.f191057e);
        }
        this.f45500C = new i5v(this, this.f45499B, this.f45503z, this.f45498A);
        n5v n5vVar = new n5v(this);
        this.f45501D = n5vVar;
        this.f45500C.mo51532C(n5vVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f45500C.m134554F2();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f45501D.m158014r();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45501D.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_audio_explore_recommend";
    }

    /* JADX INFO: renamed from: q */
    public void m69869q() {
        this.f45500C.m134560S2();
    }
}
