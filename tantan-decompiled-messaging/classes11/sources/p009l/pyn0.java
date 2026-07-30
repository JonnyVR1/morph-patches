package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceMemberLeaderView;
import com.p1.mobile.android.app.Act;
import l.dac0;
import l.ney;
import l.s7m;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pyn0 implements s7m<vyn0> {

    /* JADX INFO: renamed from: a */
    public final VoiceMemberLeaderView f18970a;

    public pyn0(Act act, final vyn0 vyn0Var) {
        VoiceMemberLeaderView voiceMemberLeaderViewM8836c = VoiceMemberLeaderView.m8836c(act.inflater());
        this.f18970a = voiceMemberLeaderViewM8836c;
        voiceMemberLeaderViewM8836c.setOnJumpClickListener(new View.OnClickListener() { // from class: l.oyn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pyn0.m20784a(vyn0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20784a(vyn0 vyn0Var, View view) {
        if (vyn0Var != null) {
            vyn0Var.F2().MemberEvent.dismiss().p();
            ney.b(vyn0Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20785C0() {
        return this.f18970a.getContext();
    }

    /* JADX INFO: renamed from: c */
    public VoiceMemberLeaderView m20787c() {
        return this.f18970a;
    }

    /* JADX INFO: renamed from: d */
    public void m20788d(dac0 dac0Var) {
        this.f18970a.f7301b.setAdapter(dac0Var);
    }

    /* JADX INFO: renamed from: e */
    public void m20789e(boolean z) {
        xdl0.M(this.f18970a.f7302c, z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m20790i1(vyn0 vyn0Var) {
    }

    public void destroy() {
    }
}
