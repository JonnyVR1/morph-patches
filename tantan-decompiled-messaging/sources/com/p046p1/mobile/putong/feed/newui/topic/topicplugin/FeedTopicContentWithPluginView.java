package com.p046p1.mobile.putong.feed.newui.topic.topicplugin;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p147v.VLinear;
import p149l.cwf0;
import p149l.djh;
import p149l.k7i;
import p149l.nkg;
import p149l.oe40;

/* JADX INFO: loaded from: classes12.dex */
public class FeedTopicContentWithPluginView extends VLinear {

    /* JADX INFO: renamed from: u */
    public static int f43234u;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f43235c;

    /* JADX INFO: renamed from: d */
    public FeedAggregationTabLayout f43236d;

    /* JADX INFO: renamed from: e */
    public DiscoveryPager f43237e;

    /* JADX INFO: renamed from: f */
    public cwf0 f43238f;

    /* JADX INFO: renamed from: g */
    public cwf0 f43239g;

    /* JADX INFO: renamed from: h */
    public cwf0 f43240h;

    /* JADX INFO: renamed from: i */
    public int f43241i;

    /* JADX INFO: renamed from: j */
    public FeedTopicMomentFragment f43242j;

    /* JADX INFO: renamed from: k */
    public FeedTopicMomentFragment f43243k;

    /* JADX INFO: renamed from: l */
    public C11375b f43244l;

    /* JADX INFO: renamed from: m */
    public List<Fragment> f43245m;

    /* JADX INFO: renamed from: n */
    public String f43246n;

    /* JADX INFO: renamed from: o */
    public String f43247o;

    /* JADX INFO: renamed from: p */
    public String f43248p;

    /* JADX INFO: renamed from: q */
    public PutongFrag f43249q;

    /* JADX INFO: renamed from: r */
    public boolean f43250r;

    /* JADX INFO: renamed from: s */
    public Moment f43251s;

    /* JADX INFO: renamed from: t */
    public String f43252t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView$a */
    public class C11374a implements TabLayout.OnTabSelectedListener {
        public C11374a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            FeedTopicContentWithPluginView.this.m66145q0(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            ((TextView) ((ViewGroup) ((ViewGroup) FeedTopicContentWithPluginView.this.f43236d.getChildAt(0)).getChildAt(tab.getPosition())).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView$b */
    public class C11375b extends FragmentPagerAdapter implements ViewPager.InterfaceC0716j {
        public C11375b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // p149l.w660
        public int getCount() {
            return FeedTopicContentWithPluginView.this.f43245m.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NonNull
        public Fragment getItem(int i) {
            return (Fragment) FeedTopicContentWithPluginView.this.f43245m.get(i);
        }

        @Override // p149l.w660
        @Nullable
        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                return FeedTopicContentWithPluginView.this.f43252t;
            }
            if (i != 1) {
                return i != 2 ? "" : "聊天室";
            }
            return "最新";
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            FeedTopicContentWithPluginView.f43234u = i;
            boolean zEquals = FeedTopicContentWithPluginView.this.f43252t.equals(FeedTopicContentWithPluginView.this.f43244l.getPageTitle(i));
            FeedTopicContentWithPluginView feedTopicContentWithPluginView = FeedTopicContentWithPluginView.this;
            if (zEquals) {
                feedTopicContentWithPluginView.f43240h = feedTopicContentWithPluginView.f43239g;
            } else if ("最新".equals(feedTopicContentWithPluginView.f43244l.getPageTitle(i))) {
                FeedTopicContentWithPluginView feedTopicContentWithPluginView2 = FeedTopicContentWithPluginView.this;
                feedTopicContentWithPluginView2.f43240h = feedTopicContentWithPluginView2.f43238f;
            }
            boolean zEquals2 = "最新".equals(FeedTopicContentWithPluginView.this.f43244l.getPageTitle(FeedTopicContentWithPluginView.this.f43241i));
            FeedTopicContentWithPluginView feedTopicContentWithPluginView3 = FeedTopicContentWithPluginView.this;
            if (zEquals2) {
                feedTopicContentWithPluginView3.f43238f.m109031g();
            } else if (feedTopicContentWithPluginView3.f43252t.equals(FeedTopicContentWithPluginView.this.f43244l.getPageTitle(FeedTopicContentWithPluginView.this.f43241i))) {
                FeedTopicContentWithPluginView.this.f43239g.m109031g();
            }
            FeedTopicContentWithPluginView.this.f43240h.m109042r();
            FeedTopicContentWithPluginView.this.f43241i = i;
        }
    }

    public FeedTopicContentWithPluginView(Context context) {
        super(context);
        this.f43238f = new cwf0("p_topic_latest", FeedTopicMomentFragment.class.getName());
        this.f43239g = new cwf0("p_topic_recommend", FeedTopicMomentFragment.class.getName());
        this.f43241i = 0;
        this.f43252t = "热门";
        m66142e0(context);
    }

    /* JADX INFO: renamed from: e0 */
    private void m66142e0(Context context) {
        addView(m66146a0(LayoutInflater.from(context), this));
        this.f43245m = new ArrayList();
        if (djh.m112037b()) {
            this.f43252t = FeedModule.f38852a.getString(R$string.f38886E0);
        } else {
            this.f43252t = "热门";
        }
    }

    private String getNewFragmentFrom() {
        return this.f43250r ? "qa_latest" : "topic_latest";
    }

    private JSONObject getPageExtras() {
        boolean z = this.f43249q.act() instanceof QATopicAggregationActivity;
        PutongFrag putongFrag = this.f43249q;
        return z ? ((QATopicAggregationActivity) putongFrag.act()).m65977Y1() : ((TopicAggregationAct) putongFrag.act()).m66083Y1();
    }

    private int getPageType() {
        return this.f43250r ? 8 : 7;
    }

    private String getRecommendFragmentFrom() {
        return this.f43250r ? "qa_recommend" : "topic_recommend";
    }

    /* JADX INFO: renamed from: h0 */
    private void m66143h0() {
        m66145q0(0);
        this.f43236d.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C11374a());
    }

    /* JADX INFO: renamed from: i0 */
    private void m66144i0() {
        C11375b c11375b = new C11375b(this.f43249q.getChildFragmentManager());
        this.f43244l = c11375b;
        this.f43237e.setOnPageChangeListener(c11375b);
        this.f43237e.setAdapter(this.f43244l);
        this.f43236d.setupWithViewPager(this.f43237e);
        this.f43237e.setCurrentItem(0);
        m66158p0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public void m66145q0(int i) {
        ((TextView) ((ViewGroup) ((ViewGroup) this.f43236d.getChildAt(0)).getChildAt(i)).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: a0 */
    public View m66146a0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k7i.m144677b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m66147b0() {
        this.f43245m.add(this.f43242j);
        this.f43244l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c0 */
    public void m66148c0(String str, String str2, String str3, PutongFrag putongFrag, Moment moment) {
        this.f43246n = str;
        this.f43247o = str2;
        this.f43248p = str3;
        this.f43249q = putongFrag;
        this.f43250r = putongFrag.act() instanceof QATopicAggregationActivity;
        this.f43251s = moment;
        this.f43238f.m109039o(getPageExtras());
        this.f43239g.m109039o(getPageExtras());
        m66144i0();
        m66151g0();
        m66147b0();
        m66150f0();
        m66143h0();
    }

    /* JADX INFO: renamed from: d0 */
    public void m66149d0(Moment moment) {
        this.f43243k.f43255A.m162987i0().f151803b.mo133304k(moment);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m66150f0() {
        FeedTopicMomentFragment feedTopicMomentFragmentM66159N4 = FeedTopicMomentFragment.m66159N4(this.f43247o, this.f43248p, getNewFragmentFrom(), getPageType());
        this.f43243k = feedTopicMomentFragmentM66159N4;
        this.f43245m.add(feedTopicMomentFragmentM66159N4);
        this.f43244l.notifyDataSetChanged();
        this.f43236d.setVisibility(0);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m66151g0() {
        this.f43242j = FeedTopicMomentFragment.m66160O4(this.f43247o, this.f43248p, getRecommendFragmentFrom(), getPageType(), this.f43251s);
    }

    public int getCurrentPosition() {
        return this.f43237e.getCurrentItem();
    }

    public String getCurrentShowPageId() {
        cwf0 cwf0Var = this.f43240h;
        if (cwf0Var == this.f43238f) {
            return "p_topic_latest";
        }
        return cwf0Var == this.f43239g ? "p_topic_recommend" : "";
    }

    public FeedTopicMomentFragment getFeedNewTopicMomentFragment() {
        return this.f43243k;
    }

    public FeedTopicMomentFragment getFeedRecommendTopicMomentFragment() {
        return this.f43242j;
    }

    /* JADX INFO: renamed from: j0 */
    public void m66152j0() {
        this.f43238f.m109033i();
        this.f43239g.m109033i();
    }

    /* JADX INFO: renamed from: k0 */
    public void m66153k0() {
        if ("最新".equals(this.f43244l.getPageTitle(this.f43241i))) {
            this.f43238f.m109031g();
        } else if (this.f43252t.equals(this.f43244l.getPageTitle(this.f43241i))) {
            this.f43239g.m109031g();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public cwf0 m66154l0() {
        if (NullChecker.m81303a(this.f43240h)) {
            return this.f43240h;
        }
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m66155m0() {
        List<Fragment> list;
        if (this.f43237e == null || this.f43244l == null || this.f43243k == null || (list = this.f43245m) == null || list.size() < 2) {
            return false;
        }
        this.f43237e.setCurrentItem(1);
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    public void m66156n0(Moment moment) {
        oe40.m163821W(moment, true, false, false, nkg.m159893m0(), null);
        if (NullChecker.m81303a(this.f43243k.f43256z)) {
            this.f43243k.f43256z.m167756d().scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m66157o0() {
        if (NullChecker.m81303a(this.f43242j) && NullChecker.m81303a(this.f43242j.f43256z)) {
            this.f43242j.f43256z.m167758j();
        }
        if (NullChecker.m81303a(this.f43243k) && NullChecker.m81303a(this.f43242j.f43256z)) {
            this.f43243k.f43256z.m167758j();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m66158p0(int i) {
        if (this.f43252t.equals(this.f43244l.getPageTitle(i))) {
            this.f43240h = this.f43239g;
        } else if ("最新".equals(this.f43244l.getPageTitle(i))) {
            this.f43240h = this.f43238f;
        }
        this.f43240h.m109042r();
    }

    public FeedTopicContentWithPluginView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43238f = new cwf0("p_topic_latest", FeedTopicMomentFragment.class.getName());
        this.f43239g = new cwf0("p_topic_recommend", FeedTopicMomentFragment.class.getName());
        this.f43241i = 0;
        this.f43252t = "热门";
        m66142e0(context);
    }

    public FeedTopicContentWithPluginView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43238f = new cwf0("p_topic_latest", FeedTopicMomentFragment.class.getName());
        this.f43239g = new cwf0("p_topic_recommend", FeedTopicMomentFragment.class.getName());
        this.f43241i = 0;
        this.f43252t = "热门";
        m66142e0(context);
    }
}
