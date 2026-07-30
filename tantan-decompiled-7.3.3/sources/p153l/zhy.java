package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.common.member.view.MemberLeaderView;

/* JADX INFO: loaded from: classes4.dex */
public class zhy implements iam<liy> {

    /* JADX INFO: renamed from: a */
    public final MemberLeaderView f204470a;

    public zhy(Act act, final liy liyVar) {
        MemberLeaderView memberLeaderViewM74271c = MemberLeaderView.m74271c(act.inflater());
        this.f204470a = memberLeaderViewM74271c;
        memberLeaderViewM74271c.setOnJumpClickListener(new View.OnClickListener() { // from class: l.yhy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zhy.m219703a(liyVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m219703a(liy liyVar, View view) {
        if (liyVar != null) {
            liyVar.m213811F2().MemberEvent.dismiss().m199277p();
            kny.m150554b(liyVar);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f204470a.getContext();
    }

    /* JADX INFO: renamed from: c */
    public MemberLeaderView m219705c() {
        return this.f204470a;
    }

    /* JADX INFO: renamed from: d */
    public void m219706d(jic0 jic0Var) {
        this.f204470a.f50085b.setAdapter(jic0Var);
    }

    /* JADX INFO: renamed from: e */
    public void m219707e(boolean z) {
        bnl0.m105524M(this.f204470a.f50086c, z);
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
    public void mo22064i1(liy liyVar) {
    }
}
