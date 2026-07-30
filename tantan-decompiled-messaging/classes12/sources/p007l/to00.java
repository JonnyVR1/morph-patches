package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedPreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VPager;
import v.VPagerCircleIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class to00 implements s7m<ro00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f13358a;

    /* JADX INFO: renamed from: b */
    public VPager f13359b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f13360c;

    /* JADX INFO: renamed from: d */
    public ro00 f13361d;

    /* JADX INFO: renamed from: e */
    public MomentsFeedPreviewAct f13362e;

    /* JADX INFO: renamed from: f */
    public String f13363f;

    /* JADX INFO: renamed from: g */
    public mo00 f13364g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Media> f13365h;

    public to00(MomentsFeedPreviewAct momentsFeedPreviewAct) {
        this.f13362e = momentsFeedPreviewAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14584C0() {
        return this.f13362e;
    }

    @Nullable
    public Act act() {
        return this.f13362e;
    }

    /* JADX INFO: renamed from: b */
    public View m14585b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uo00.m15123b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m14591i1(ro00 ro00Var) {
        this.f13361d = ro00Var;
    }

    /* JADX INFO: renamed from: e */
    public final PlayerView m14588e(View view) {
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
        return childAt instanceof PlayerView ? (PlayerView) childAt : m14588e(childAt);
    }

    /* JADX INFO: renamed from: f */
    public View m14589f() {
        return this.f13359b.findViewWithTag(Integer.valueOf(this.f13361d.f12702b));
    }

    /* JADX INFO: renamed from: i */
    public mo00 m14590i() {
        mo00 mo00Var = new mo00(this.f13362e, this.f13365h);
        mo00Var.m11981D(new l2h(this.f13362e));
        return mo00Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m14586c(m14585b(layoutInflater, viewGroup), layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m14592j(int i, boolean z) {
        this.f13364g = m14590i();
        xdl0.a0(this.f13359b);
        this.f13359b.setAdapter(this.f13364g);
        this.f13360c.c(this.f13359b, i);
        this.f13359b.setPageMargin(t100.d(8.0f));
        this.f13360c.setOnPageChangeListener(this.f13364g);
        xdl0.M0(this.f13360c, this.f13365h.size() != 1);
        if (i >= 0) {
            this.f13359b.setCurrentItem(i);
            this.f13364g.onPageSelected(i);
        }
        this.f13359b.post(new Runnable() { // from class: l.so00
            @Override // java.lang.Runnable
            public final void run() {
                this.f13019a.m14593k();
            }
        });
        if (NullChecker.a(this.f13362e.getSupportActionBar())) {
            this.f13362e.getSupportActionBar().m();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m14593k() {
        int currentItem;
        if (this.f13362e.lifecycle_() != c.i || (currentItem = this.f13359b.getCurrentItem()) < 0 || currentItem >= this.f13365h.size() || !(this.f13365h.get(currentItem) instanceof Video)) {
            return;
        }
        PlayerView playerViewM14588e = m14588e(this.f13359b.findViewWithTag(Integer.valueOf(currentItem)));
        if (NullChecker.a(playerViewM14588e)) {
            m14594l(playerViewM14588e);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m14595m(ArrayList<Media> arrayList) {
        this.f13365h = arrayList;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l */
    public void m14594l(PlayerView playerView) {
    }

    /* JADX INFO: renamed from: c */
    public View m14586c(View view, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return view;
    }
}
