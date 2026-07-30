package p007l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupFragment;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.df50;
import l.hnc0;
import l.s7m;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VPullDownRefreshLayout;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class img implements s7m<hmg>, df50 {

    /* JADX INFO: renamed from: a */
    public VFrame f9091a;

    /* JADX INFO: renamed from: b */
    public VPullDownRefreshLayout f9092b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f9093c;

    /* JADX INFO: renamed from: d */
    public VLinear f9094d;

    /* JADX INFO: renamed from: e */
    public VImage f9095e;

    /* JADX INFO: renamed from: f */
    public VText f9096f;

    /* JADX INFO: renamed from: g */
    public hmg f9097g;

    /* JADX INFO: renamed from: h */
    public dmg f9098h;

    /* JADX INFO: renamed from: i */
    public Act f9099i;

    public img(FeedAllGroupFragment feedAllGroupFragment) {
        this.f9099i = feedAllGroupFragment.act();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10982C0() {
        return this.f9099i;
    }

    /* JADX INFO: renamed from: a */
    public View m10983a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jmg.m11200b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m10984b() {
        jmg.m11201c(this);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m10989i1(hmg hmgVar) {
        this.f9097g = hmgVar;
    }

    /* JADX INFO: renamed from: d */
    public void m10986d(Bundle bundle) {
        this.f9092b.O(this);
        this.f9092b.l();
        dmg dmgVar = new dmg(this.f9099i, this.f9097g.f8773a);
        this.f9098h = dmgVar;
        this.f9093c.setAdapter(dmgVar);
    }

    /* JADX INFO: renamed from: e */
    public void m10987e(List<Group> list) {
        if (!vwb.J(list)) {
            this.f9098h.m9480J(list);
        } else if (this.f9097g.f8773a == 0) {
            this.f9094d.setVisibility(0);
            this.f9092b.setVisibility(8);
            this.f9096f.setText("左滑发现更多圈子");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m10988f() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f9092b;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.w(true);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m10983a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w2 */
    public void m10990w2(@NonNull @NotNull hnc0 hnc0Var) {
        this.f9097g.m10679m0();
    }

    public void destroy() {
    }
}
