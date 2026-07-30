package com.p051p1.mobile.putong.feed.newui.topic.topicplugin;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p151v.VLinear;
import p153l.cmg;
import p153l.cn40;
import p153l.l4g0;
import p153l.skh;
import p153l.z8i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedTopicContentWithPluginView extends VLinear {

    /* JADX INFO: renamed from: u */
    public static int f44082u;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f44083c;

    /* JADX INFO: renamed from: d */
    public FeedAggregationTabLayout f44084d;

    /* JADX INFO: renamed from: e */
    public DiscoveryPager f44085e;

    /* JADX INFO: renamed from: f */
    public l4g0 f44086f;

    /* JADX INFO: renamed from: g */
    public l4g0 f44087g;

    /* JADX INFO: renamed from: h */
    public l4g0 f44088h;

    /* JADX INFO: renamed from: i */
    public int f44089i;

    /* JADX INFO: renamed from: j */
    public FeedTopicMomentFragment f44090j;

    /* JADX INFO: renamed from: k */
    public FeedTopicMomentFragment f44091k;

    /* JADX INFO: renamed from: l */
    public C11538b f44092l;

    /* JADX INFO: renamed from: m */
    public List<Fragment> f44093m;

    /* JADX INFO: renamed from: n */
    public String f44094n;

    /* JADX INFO: renamed from: o */
    public String f44095o;

    /* JADX INFO: renamed from: p */
    public String f44096p;

    /* JADX INFO: renamed from: q */
    public PutongFrag f44097q;

    /* JADX INFO: renamed from: r */
    public boolean f44098r;

    /* JADX INFO: renamed from: s */
    public Moment f44099s;

    /* JADX INFO: renamed from: t */
    public String f44100t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView$a */
    public class C11537a implements TabLayout.OnTabSelectedListener {
        public C11537a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            FeedTopicContentWithPluginView.this.m67328q0(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            ((TextView) ((ViewGroup) ((ViewGroup) FeedTopicContentWithPluginView.this.f44084d.getChildAt(0)).getChildAt(tab.getPosition())).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView$b */
    public class C11538b extends FragmentPagerAdapter implements ViewPager.InterfaceC0718j {
        public C11538b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // p153l.cf60
        public int getCount() {
            return FeedTopicContentWithPluginView.this.f44093m.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NonNull
        public Fragment getItem(int i) {
            return (Fragment) FeedTopicContentWithPluginView.this.f44093m.get(i);
        }

        @Override // p153l.cf60
        @Nullable
        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                return FeedTopicContentWithPluginView.this.f44100t;
            }
            if (i != 1) {
                return i != 2 ? "" : "聊天室";
            }
            return "最新";
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            FeedTopicContentWithPluginView.f44082u = i;
            boolean zEquals = FeedTopicContentWithPluginView.this.f44100t.equals(FeedTopicContentWithPluginView.this.f44092l.getPageTitle(i));
            FeedTopicContentWithPluginView feedTopicContentWithPluginView = FeedTopicContentWithPluginView.this;
            if (zEquals) {
                feedTopicContentWithPluginView.f44088h = feedTopicContentWithPluginView.f44087g;
            } else if ("最新".equals(feedTopicContentWithPluginView.f44092l.getPageTitle(i))) {
                FeedTopicContentWithPluginView feedTopicContentWithPluginView2 = FeedTopicContentWithPluginView.this;
                feedTopicContentWithPluginView2.f44088h = feedTopicContentWithPluginView2.f44086f;
            }
            boolean zEquals2 = "最新".equals(FeedTopicContentWithPluginView.this.f44092l.getPageTitle(FeedTopicContentWithPluginView.this.f44089i));
            FeedTopicContentWithPluginView feedTopicContentWithPluginView3 = FeedTopicContentWithPluginView.this;
            if (zEquals2) {
                feedTopicContentWithPluginView3.f44086f.m152772g();
            } else if (feedTopicContentWithPluginView3.f44100t.equals(FeedTopicContentWithPluginView.this.f44092l.getPageTitle(FeedTopicContentWithPluginView.this.f44089i))) {
                FeedTopicContentWithPluginView.this.f44087g.m152772g();
            }
            FeedTopicContentWithPluginView.this.f44088h.m152783r();
            FeedTopicContentWithPluginView.this.f44089i = i;
        }
    }

    public FeedTopicContentWithPluginView(Context context) {
        super(context);
        this.f44086f = new l4g0("p_topic_latest", FeedTopicMomentFragment.class.getName());
        this.f44087g = new l4g0("p_topic_recommend", FeedTopicMomentFragment.class.getName());
        this.f44089i = 0;
        this.f44100t = "热门";
        m67325e0(context);
    }

    /* JADX INFO: renamed from: e0 */
    private void m67325e0(Context context) {
        addView(m67329a0(LayoutInflater.from(context), this));
        this.f44093m = new ArrayList();
        if (skh.m186450b()) {
            this.f44100t = FeedModule.f39700a.getString(R$string.f39734E0);
        } else {
            this.f44100t = "热门";
        }
    }

    private String getNewFragmentFrom() {
        return this.f44098r ? "qa_latest" : "topic_latest";
    }

    private JSONObject getPageExtras() {
        boolean z = this.f44097q.act() instanceof QATopicAggregationActivity;
        PutongFrag putongFrag = this.f44097q;
        return z ? ((QATopicAggregationActivity) putongFrag.act()).m67160Z1() : ((TopicAggregationAct) putongFrag.act()).m67266Z1();
    }

    private int getPageType() {
        return this.f44098r ? 8 : 7;
    }

    private String getRecommendFragmentFrom() {
        return this.f44098r ? "qa_recommend" : "topic_recommend";
    }

    /* JADX INFO: renamed from: h0 */
    private void m67326h0() {
        m67328q0(0);
        this.f44084d.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C11537a());
    }

    /* JADX INFO: renamed from: i0 */
    private void m67327i0() {
        C11538b c11538b = new C11538b(this.f44097q.getChildFragmentManager());
        this.f44092l = c11538b;
        this.f44085e.setOnPageChangeListener(c11538b);
        this.f44085e.setAdapter(this.f44092l);
        this.f44084d.setupWithViewPager(this.f44085e);
        this.f44085e.setCurrentItem(0);
        m67341p0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public void m67328q0(int i) {
        ((TextView) ((ViewGroup) ((ViewGroup) this.f44084d.getChildAt(0)).getChildAt(i)).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: a0 */
    public View m67329a0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z8i.m218968b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m67330b0() {
        this.f44093m.add(this.f44090j);
        this.f44092l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c0 */
    public void m67331c0(String str, String str2, String str3, PutongFrag putongFrag, Moment moment) {
        this.f44094n = str;
        this.f44095o = str2;
        this.f44096p = str3;
        this.f44097q = putongFrag;
        this.f44098r = putongFrag.act() instanceof QATopicAggregationActivity;
        this.f44099s = moment;
        this.f44086f.m152780o(getPageExtras());
        this.f44087g.m152780o(getPageExtras());
        m67327i0();
        m67334g0();
        m67330b0();
        m67333f0();
        m67326h0();
    }

    /* JADX INFO: renamed from: d0 */
    public void m67332d0(Moment moment) {
        this.f44091k.f44103A.m115070i0().f182605b.mo137269k(moment);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m67333f0() {
        FeedTopicMomentFragment feedTopicMomentFragmentM67342N4 = FeedTopicMomentFragment.m67342N4(this.f44095o, this.f44096p, getNewFragmentFrom(), getPageType());
        this.f44091k = feedTopicMomentFragmentM67342N4;
        this.f44093m.add(feedTopicMomentFragmentM67342N4);
        this.f44092l.notifyDataSetChanged();
        this.f44084d.setVisibility(0);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m67334g0() {
        this.f44090j = FeedTopicMomentFragment.m67343O4(this.f44095o, this.f44096p, getRecommendFragmentFrom(), getPageType(), this.f44099s);
    }

    public int getCurrentPosition() {
        return this.f44085e.getCurrentItem();
    }

    public String getCurrentShowPageId() {
        l4g0 l4g0Var = this.f44088h;
        if (l4g0Var == this.f44086f) {
            return "p_topic_latest";
        }
        return l4g0Var == this.f44087g ? "p_topic_recommend" : "";
    }

    public FeedTopicMomentFragment getFeedNewTopicMomentFragment() {
        return this.f44091k;
    }

    public FeedTopicMomentFragment getFeedRecommendTopicMomentFragment() {
        return this.f44090j;
    }

    /* JADX INFO: renamed from: j0 */
    public void m67335j0() {
        this.f44086f.m152774i();
        this.f44087g.m152774i();
    }

    /* JADX INFO: renamed from: k0 */
    public void m67336k0() {
        if ("最新".equals(this.f44092l.getPageTitle(this.f44089i))) {
            this.f44086f.m152772g();
        } else if (this.f44100t.equals(this.f44092l.getPageTitle(this.f44089i))) {
            this.f44087g.m152772g();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public l4g0 m67337l0() {
        if (NullChecker.m82486a(this.f44088h)) {
            return this.f44088h;
        }
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m67338m0() {
        List<Fragment> list;
        if (this.f44085e == null || this.f44092l == null || this.f44091k == null || (list = this.f44093m) == null || list.size() < 2) {
            return false;
        }
        this.f44085e.setCurrentItem(1);
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    public void m67339n0(Moment moment) {
        cn40.m111371W(moment, true, false, false, cmg.m111222m0(), null);
        if (NullChecker.m82486a(this.f44091k.f44104z)) {
            this.f44091k.f44104z.m119891d().scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m67340o0() {
        if (NullChecker.m82486a(this.f44090j) && NullChecker.m82486a(this.f44090j.f44104z)) {
            this.f44090j.f44104z.m119893j();
        }
        if (NullChecker.m82486a(this.f44091k) && NullChecker.m82486a(this.f44090j.f44104z)) {
            this.f44091k.f44104z.m119893j();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m67341p0(int i) {
        if (this.f44100t.equals(this.f44092l.getPageTitle(i))) {
            this.f44088h = this.f44087g;
        } else if ("最新".equals(this.f44092l.getPageTitle(i))) {
            this.f44088h = this.f44086f;
        }
        this.f44088h.m152783r();
    }

    public FeedTopicContentWithPluginView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44086f = new l4g0("p_topic_latest", FeedTopicMomentFragment.class.getName());
        this.f44087g = new l4g0("p_topic_recommend", FeedTopicMomentFragment.class.getName());
        this.f44089i = 0;
        this.f44100t = "热门";
        m67325e0(context);
    }

    public FeedTopicContentWithPluginView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44086f = new l4g0("p_topic_latest", FeedTopicMomentFragment.class.getName());
        this.f44087g = new l4g0("p_topic_recommend", FeedTopicMomentFragment.class.getName());
        this.f44089i = 0;
        this.f44100t = "热门";
        m67325e0(context);
    }
}
