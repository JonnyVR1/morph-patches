package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VPager;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes12.dex */
public class to00 implements s7m<ro00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f171304a;

    /* JADX INFO: renamed from: b */
    public VPager f171305b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f171306c;

    /* JADX INFO: renamed from: d */
    public ro00 f171307d;

    /* JADX INFO: renamed from: e */
    public MomentsFeedPreviewAct f171308e;

    /* JADX INFO: renamed from: f */
    public String f171309f;

    /* JADX INFO: renamed from: g */
    public mo00 f171310g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Media> f171311h;

    public to00(MomentsFeedPreviewAct momentsFeedPreviewAct) {
        this.f171308e = momentsFeedPreviewAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f171308e;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f171308e;
    }

    /* JADX INFO: renamed from: b */
    public View m189831b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uo00.m194541b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ro00 ro00Var) {
        this.f171307d = ro00Var;
    }

    /* JADX INFO: renamed from: e */
    public final PlayerView m189834e(View view) {
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
        return childAt instanceof PlayerView ? (PlayerView) childAt : m189834e(childAt);
    }

    /* JADX INFO: renamed from: f */
    public View m189835f() {
        return this.f171305b.findViewWithTag(Integer.valueOf(this.f171307d.f160343b));
    }

    /* JADX INFO: renamed from: i */
    public mo00 m189836i() {
        mo00 mo00Var = new mo00(this.f171308e, this.f171311h);
        mo00Var.m155578D(new l2h(this.f171308e));
        return mo00Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m189832c(m189831b(layoutInflater, viewGroup), layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m189837j(int i, boolean z) {
        this.f171310g = m189836i();
        xdl0.m208364a0(this.f171305b);
        this.f171305b.setAdapter(this.f171310g);
        this.f171306c.m223143c(this.f171305b, i);
        this.f171305b.setPageMargin(t100.m186890d(8.0f));
        this.f171306c.setOnPageChangeListener(this.f171310g);
        xdl0.m208345M0(this.f171306c, this.f171311h.size() != 1);
        if (i >= 0) {
            this.f171305b.setCurrentItem(i);
            this.f171310g.onPageSelected(i);
        }
        this.f171305b.post(new Runnable() { // from class: l.so00
            @Override // java.lang.Runnable
            public final void run() {
                this.f165534a.m189838k();
            }
        });
        if (NullChecker.m81303a(this.f171308e.getSupportActionBar())) {
            this.f171308e.getSupportActionBar().mo134126m();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m189838k() {
        int currentItem;
        if (this.f171308e.lifecycle_() != C4319c.f15548i || (currentItem = this.f171305b.getCurrentItem()) < 0 || currentItem >= this.f171311h.size() || !(this.f171311h.get(currentItem) instanceof Video)) {
            return;
        }
        PlayerView playerViewM189834e = m189834e(this.f171305b.findViewWithTag(Integer.valueOf(currentItem)));
        if (NullChecker.m81303a(playerViewM189834e)) {
            m189839l(playerViewM189834e);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m189840m(ArrayList<Media> arrayList) {
        this.f171311h = arrayList;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l */
    public void m189839l(PlayerView playerView) {
    }

    /* JADX INFO: renamed from: c */
    public View m189832c(View view, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return view;
    }
}
