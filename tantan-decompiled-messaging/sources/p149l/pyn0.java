package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceMemberLeaderView;

/* JADX INFO: loaded from: classes11.dex */
public class pyn0 implements s7m<vyn0> {

    /* JADX INFO: renamed from: a */
    public final VoiceMemberLeaderView f151866a;

    public pyn0(Act act, final vyn0 vyn0Var) {
        VoiceMemberLeaderView voiceMemberLeaderViewM78620c = VoiceMemberLeaderView.m78620c(act.inflater());
        this.f151866a = voiceMemberLeaderViewM78620c;
        voiceMemberLeaderViewM78620c.setOnJumpClickListener(new View.OnClickListener() { // from class: l.oyn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pyn0.m172143a(vyn0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m172143a(vyn0 vyn0Var, View view) {
        if (vyn0Var != null) {
            vyn0Var.m206028F2().MemberEvent.dismiss().m172467p();
            ney.m159135b(vyn0Var);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f151866a.getContext();
    }

    /* JADX INFO: renamed from: c */
    public VoiceMemberLeaderView m172145c() {
        return this.f151866a;
    }

    /* JADX INFO: renamed from: d */
    public void m172146d(dac0 dac0Var) {
        this.f151866a.f53695b.setAdapter(dac0Var);
    }

    /* JADX INFO: renamed from: e */
    public void m172147e(boolean z) {
        xdl0.m208344M(this.f151866a.f53696c, z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(vyn0 vyn0Var) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
