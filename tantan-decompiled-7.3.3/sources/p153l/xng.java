package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupFragment;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class xng implements iam<wng>, jn50 {

    /* JADX INFO: renamed from: a */
    public VFrame f195382a;

    /* JADX INFO: renamed from: b */
    public VPullDownRefreshLayout f195383b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f195384c;

    /* JADX INFO: renamed from: d */
    public VLinear f195385d;

    /* JADX INFO: renamed from: e */
    public VImage f195386e;

    /* JADX INFO: renamed from: f */
    public VText f195387f;

    /* JADX INFO: renamed from: g */
    public wng f195388g;

    /* JADX INFO: renamed from: h */
    public sng f195389h;

    /* JADX INFO: renamed from: i */
    public Act f195390i;

    public xng(FeedAllGroupFragment feedAllGroupFragment) {
        this.f195390i = feedAllGroupFragment.act();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f195390i;
    }

    /* JADX INFO: renamed from: a */
    public View m212203a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yng.m216835b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m212204b() {
        yng.m216836c(this);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wng wngVar) {
        this.f195388g = wngVar;
    }

    /* JADX INFO: renamed from: d */
    public void m212206d(Bundle bundle) {
        this.f195383b.mo224405O(this);
        this.f195383b.m225013l();
        sng sngVar = new sng(this.f195390i, this.f195388g.f189905a);
        this.f195389h = sngVar;
        this.f195384c.setAdapter(sngVar);
    }

    /* JADX INFO: renamed from: e */
    public void m212207e(List<Group> list) {
        if (!jyb.m147479J(list)) {
            this.f195389h.m186921J(list);
        } else if (this.f195388g.f189905a == 0) {
            this.f195385d.setVisibility(0);
            this.f195383b.setVisibility(8);
            this.f195387f.setText("左滑发现更多圈子");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m212208f() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f195383b;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m225024w(true);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m212203a(layoutInflater, viewGroup);
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull @NotNull mvc0 mvc0Var) {
        this.f195388g.m207207m0();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
