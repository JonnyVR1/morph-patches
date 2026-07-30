package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VPager;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes13.dex */
public class cx00 implements iam<ax00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f84158a;

    /* JADX INFO: renamed from: b */
    public VPager f84159b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f84160c;

    /* JADX INFO: renamed from: d */
    public ax00 f84161d;

    /* JADX INFO: renamed from: e */
    public MomentsFeedPreviewAct f84162e;

    /* JADX INFO: renamed from: f */
    public String f84163f;

    /* JADX INFO: renamed from: g */
    public vw00 f84164g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Media> f84165h;

    public cx00(MomentsFeedPreviewAct momentsFeedPreviewAct) {
        this.f84162e = momentsFeedPreviewAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f84162e;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f84162e;
    }

    /* JADX INFO: renamed from: b */
    public View m112949b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dx00.m118437b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ax00 ax00Var) {
        this.f84161d = ax00Var;
    }

    /* JADX INFO: renamed from: e */
    public final PlayerView m112952e(View view) {
        if (view instanceof PlayerView) {
            return (PlayerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        return childAt instanceof PlayerView ? (PlayerView) childAt : m112952e(childAt);
    }

    /* JADX INFO: renamed from: f */
    public View m112953f() {
        return this.f84159b.findViewWithTag(Integer.valueOf(this.f84161d.f73809b));
    }

    /* JADX INFO: renamed from: i */
    public vw00 m112954i() {
        vw00 vw00Var = new vw00(this.f84162e, this.f84165h);
        vw00Var.m203047D(new a4h(this.f84162e));
        return vw00Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m112950c(m112949b(layoutInflater, viewGroup), layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m112955j(int i, boolean z) {
        this.f84164g = m112954i();
        bnl0.m105544a0(this.f84159b);
        this.f84159b.setAdapter(this.f84164g);
        this.f84160c.m224389c(this.f84159b, i);
        this.f84159b.setPageMargin(qa00.m175859d(8.0f));
        this.f84160c.setOnPageChangeListener(this.f84164g);
        bnl0.m105525M0(this.f84160c, this.f84165h.size() != 1);
        if (i >= 0) {
            this.f84159b.setCurrentItem(i);
            this.f84164g.onPageSelected(i);
        }
        this.f84159b.post(new Runnable() { // from class: l.bx00
            @Override // java.lang.Runnable
            public final void run() {
                this.f78803a.m112956k();
            }
        });
        if (NullChecker.m82486a(this.f84162e.getSupportActionBar())) {
            this.f84162e.getSupportActionBar().mo102186m();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m112956k() {
        int currentItem;
        if (this.f84162e.lifecycle_() != C4470c.f16267i || (currentItem = this.f84159b.getCurrentItem()) < 0 || currentItem >= this.f84165h.size() || !(this.f84165h.get(currentItem) instanceof Video)) {
            return;
        }
        PlayerView playerViewM112952e = m112952e(this.f84159b.findViewWithTag(Integer.valueOf(currentItem)));
        if (NullChecker.m82486a(playerViewM112952e)) {
            m112957l(playerViewM112952e);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m112958m(ArrayList<Media> arrayList) {
        this.f84165h = arrayList;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l */
    public void m112957l(PlayerView playerView) {
    }

    /* JADX INFO: renamed from: c */
    public View m112950c(View view, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return view;
    }
}
