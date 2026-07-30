package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceMemberLeaderView;

/* JADX INFO: loaded from: classes10.dex */
public class t7o0 implements iam<z7o0> {

    /* JADX INFO: renamed from: a */
    public final VoiceMemberLeaderView f172459a;

    public t7o0(Act act, final z7o0 z7o0Var) {
        VoiceMemberLeaderView voiceMemberLeaderViewM79803c = VoiceMemberLeaderView.m79803c(act.inflater());
        this.f172459a = voiceMemberLeaderViewM79803c;
        voiceMemberLeaderViewM79803c.setOnJumpClickListener(new View.OnClickListener() { // from class: l.s7o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t7o0.m189624a(z7o0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m189624a(z7o0 z7o0Var, View view) {
        if (z7o0Var != null) {
            z7o0Var.m213811F2().MemberEvent.dismiss().m199277p();
            kny.m150554b(z7o0Var);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f172459a.getContext();
    }

    /* JADX INFO: renamed from: c */
    public VoiceMemberLeaderView m189626c() {
        return this.f172459a;
    }

    /* JADX INFO: renamed from: d */
    public void m189627d(jic0 jic0Var) {
        this.f172459a.f54543b.setAdapter(jic0Var);
    }

    /* JADX INFO: renamed from: e */
    public void m189628e(boolean z) {
        bnl0.m105524M(this.f172459a.f54544c, z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(z7o0 z7o0Var) {
    }
}
