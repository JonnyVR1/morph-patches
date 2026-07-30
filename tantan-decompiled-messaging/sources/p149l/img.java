package p149l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupFragment;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class img implements s7m<hmg>, df50 {

    /* JADX INFO: renamed from: a */
    public VFrame f113918a;

    /* JADX INFO: renamed from: b */
    public VPullDownRefreshLayout f113919b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f113920c;

    /* JADX INFO: renamed from: d */
    public VLinear f113921d;

    /* JADX INFO: renamed from: e */
    public VImage f113922e;

    /* JADX INFO: renamed from: f */
    public VText f113923f;

    /* JADX INFO: renamed from: g */
    public hmg f113924g;

    /* JADX INFO: renamed from: h */
    public dmg f113925h;

    /* JADX INFO: renamed from: i */
    public Act f113926i;

    public img(FeedAllGroupFragment feedAllGroupFragment) {
        this.f113926i = feedAllGroupFragment.act();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f113926i;
    }

    /* JADX INFO: renamed from: a */
    public View m137070a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jmg.m142180b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m137071b() {
        jmg.m142181c(this);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hmg hmgVar) {
        this.f113924g = hmgVar;
    }

    /* JADX INFO: renamed from: d */
    public void m137073d(Bundle bundle) {
        this.f113919b.mo223159O(this);
        this.f113919b.m223767l();
        dmg dmgVar = new dmg(this.f113926i, this.f113924g.f108422a);
        this.f113925h = dmgVar;
        this.f113920c.setAdapter(dmgVar);
    }

    /* JADX INFO: renamed from: e */
    public void m137074e(List<Group> list) {
        if (!vwb.m200296J(list)) {
            this.f113925h.m112473J(list);
        } else if (this.f113924g.f108422a == 0) {
            this.f113921d.setVisibility(0);
            this.f113919b.setVisibility(8);
            this.f113923f.setText("左滑发现更多圈子");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m137075f() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f113919b;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m223778w(true);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m137070a(layoutInflater, viewGroup);
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull @NotNull hnc0 hnc0Var) {
        this.f113924g.m131732m0();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
