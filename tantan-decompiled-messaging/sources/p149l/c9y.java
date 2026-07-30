package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.common.member.view.MemberLeaderView;

/* JADX INFO: loaded from: classes4.dex */
public class c9y implements s7m<o9y> {

    /* JADX INFO: renamed from: a */
    public final MemberLeaderView f79991a;

    public c9y(Act act, final o9y o9yVar) {
        MemberLeaderView memberLeaderViewM73088c = MemberLeaderView.m73088c(act.inflater());
        this.f79991a = memberLeaderViewM73088c;
        memberLeaderViewM73088c.setOnJumpClickListener(new View.OnClickListener() { // from class: l.b9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c9y.m105914a(o9yVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m105914a(o9y o9yVar, View view) {
        if (o9yVar != null) {
            o9yVar.m206028F2().MemberEvent.dismiss().m172467p();
            ney.m159135b(o9yVar);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f79991a.getContext();
    }

    /* JADX INFO: renamed from: c */
    public MemberLeaderView m105916c() {
        return this.f79991a;
    }

    /* JADX INFO: renamed from: d */
    public void m105917d(dac0 dac0Var) {
        this.f79991a.f49237b.setAdapter(dac0Var);
    }

    /* JADX INFO: renamed from: e */
    public void m105918e(boolean z) {
        xdl0.m208344M(this.f79991a.f49238c, z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(o9y o9yVar) {
    }
}
