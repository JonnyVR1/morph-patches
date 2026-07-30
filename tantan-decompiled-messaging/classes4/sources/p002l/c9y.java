package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.member.view.MemberLeaderView;
import com.p1.mobile.android.app.Act;
import l.dac0;
import l.s7m;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c9y implements s7m<o9y> {

    /* JADX INFO: renamed from: a */
    public final MemberLeaderView f8567a;

    public c9y(Act act, final o9y o9yVar) {
        MemberLeaderView memberLeaderViewM6614c = MemberLeaderView.m6614c(act.inflater());
        this.f8567a = memberLeaderViewM6614c;
        memberLeaderViewM6614c.setOnJumpClickListener(new View.OnClickListener() { // from class: l.b9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c9y.m10910a(o9yVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10910a(o9y o9yVar, View view) {
        if (o9yVar != null) {
            o9yVar.m25548F2().MemberEvent.dismiss().p();
            ney.m18699b(o9yVar);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10911C0() {
        return this.f8567a.getContext();
    }

    /* JADX INFO: renamed from: c */
    public MemberLeaderView m10913c() {
        return this.f8567a;
    }

    /* JADX INFO: renamed from: d */
    public void m10914d(dac0 dac0Var) {
        this.f8567a.f5279b.setAdapter(dac0Var);
    }

    /* JADX INFO: renamed from: e */
    public void m10915e(boolean z) {
        xdl0.M(this.f8567a.f5280c, z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m10916i1(o9y o9yVar) {
    }
}
