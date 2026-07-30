package com.p000p1.mobile.putong.feed.newui.topic.topicplugin;

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
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import org.json.JSONObject;
import p007l.djh;
import p007l.k7i;
import p007l.nkg;
import p007l.oe40;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedTopicContentWithPluginView extends VLinear {

    /* JADX INFO: renamed from: u */
    public static int f4695u;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f4696c;

    /* JADX INFO: renamed from: d */
    public FeedAggregationTabLayout f4697d;

    /* JADX INFO: renamed from: e */
    public DiscoveryPager f4698e;

    /* JADX INFO: renamed from: f */
    public cwf0 f4699f;

    /* JADX INFO: renamed from: g */
    public cwf0 f4700g;

    /* JADX INFO: renamed from: h */
    public cwf0 f4701h;

    /* JADX INFO: renamed from: i */
    public int f4702i;

    /* JADX INFO: renamed from: j */
    public FeedTopicMomentFragment f4703j;

    /* JADX INFO: renamed from: k */
    public FeedTopicMomentFragment f4704k;

    /* JADX INFO: renamed from: l */
    public C2219b f4705l;

    /* JADX INFO: renamed from: m */
    public List<Fragment> f4706m;

    /* JADX INFO: renamed from: n */
    public String f4707n;

    /* JADX INFO: renamed from: o */
    public String f4708o;

    /* JADX INFO: renamed from: p */
    public String f4709p;

    /* JADX INFO: renamed from: q */
    public PutongFrag f4710q;

    /* JADX INFO: renamed from: r */
    public boolean f4711r;

    /* JADX INFO: renamed from: s */
    public Moment f4712s;

    /* JADX INFO: renamed from: t */
    public String f4713t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView$a */
    public class C2218a implements TabLayout.OnTabSelectedListener {
        public C2218a() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            FeedTopicContentWithPluginView.this.m7297q0(tab.getPosition());
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            ((TextView) ((ViewGroup) ((ViewGroup) FeedTopicContentWithPluginView.this.f4697d.getChildAt(0)).getChildAt(tab.getPosition())).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView$b */
    public class C2219b extends FragmentPagerAdapter implements ViewPager.j {
        public C2219b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public int getCount() {
            return FeedTopicContentWithPluginView.this.f4706m.size();
        }

        @NonNull
        public Fragment getItem(int i) {
            return (Fragment) FeedTopicContentWithPluginView.this.f4706m.get(i);
        }

        @Nullable
        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                return FeedTopicContentWithPluginView.this.f4713t;
            }
            if (i != 1) {
                return i != 2 ? "" : "聊天室";
            }
            return "最新";
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            FeedTopicContentWithPluginView.f4695u = i;
            boolean zEquals = FeedTopicContentWithPluginView.this.f4713t.equals(FeedTopicContentWithPluginView.this.f4705l.getPageTitle(i));
            FeedTopicContentWithPluginView feedTopicContentWithPluginView = FeedTopicContentWithPluginView.this;
            if (zEquals) {
                feedTopicContentWithPluginView.f4701h = feedTopicContentWithPluginView.f4700g;
            } else if ("最新".equals(feedTopicContentWithPluginView.f4705l.getPageTitle(i))) {
                FeedTopicContentWithPluginView feedTopicContentWithPluginView2 = FeedTopicContentWithPluginView.this;
                feedTopicContentWithPluginView2.f4701h = feedTopicContentWithPluginView2.f4699f;
            }
            boolean zEquals2 = "最新".equals(FeedTopicContentWithPluginView.this.f4705l.getPageTitle(FeedTopicContentWithPluginView.this.f4702i));
            FeedTopicContentWithPluginView feedTopicContentWithPluginView3 = FeedTopicContentWithPluginView.this;
            if (zEquals2) {
                feedTopicContentWithPluginView3.f4699f.g();
            } else if (feedTopicContentWithPluginView3.f4713t.equals(FeedTopicContentWithPluginView.this.f4705l.getPageTitle(FeedTopicContentWithPluginView.this.f4702i))) {
                FeedTopicContentWithPluginView.this.f4700g.g();
            }
            FeedTopicContentWithPluginView.this.f4701h.r();
            FeedTopicContentWithPluginView.this.f4702i = i;
        }
    }

    public FeedTopicContentWithPluginView(Context context) {
        super(context);
        this.f4699f = new cwf0("p_topic_latest", FeedTopicMomentFragment.class.getName());
        this.f4700g = new cwf0("p_topic_recommend", FeedTopicMomentFragment.class.getName());
        this.f4702i = 0;
        this.f4713t = "热门";
        m7294e0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    private void m7294e0(Context context) {
        addView(m7298a0(LayoutInflater.from(context), this));
        this.f4706m = new ArrayList();
        if (djh.m9420b()) {
            this.f4713t = FeedModule.f313a.getString(R$string.f347E0);
        } else {
            this.f4713t = "热门";
        }
    }

    private String getNewFragmentFrom() {
        return this.f4711r ? "qa_latest" : "topic_latest";
    }

    private JSONObject getPageExtras() {
        boolean z = this.f4710q.act() instanceof QATopicAggregationActivity;
        PutongFrag putongFrag = this.f4710q;
        return z ? putongFrag.act().m7129Y1() : putongFrag.act().m7235Y1();
    }

    private int getPageType() {
        return this.f4711r ? 8 : 7;
    }

    private String getRecommendFragmentFrom() {
        return this.f4711r ? "qa_recommend" : "topic_recommend";
    }

    /* JADX INFO: renamed from: h0 */
    private void m7295h0() {
        m7297q0(0);
        this.f4697d.addOnTabSelectedListener(new C2218a());
    }

    /* JADX INFO: renamed from: i0 */
    private void m7296i0() {
        C2219b c2219b = new C2219b(this.f4710q.getChildFragmentManager());
        this.f4705l = c2219b;
        this.f4698e.setOnPageChangeListener(c2219b);
        this.f4698e.setAdapter(this.f4705l);
        this.f4697d.setupWithViewPager(this.f4698e);
        this.f4698e.setCurrentItem(0);
        m7310p0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public void m7297q0(int i) {
        ((TextView) ((ViewGroup) ((ViewGroup) this.f4697d.getChildAt(0)).getChildAt(i)).getChildAt(1)).setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: a0 */
    public View m7298a0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k7i.m11395b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m7299b0() {
        this.f4706m.add(this.f4703j);
        this.f4705l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c0 */
    public void m7300c0(String str, String str2, String str3, PutongFrag putongFrag, Moment moment) {
        this.f4707n = str;
        this.f4708o = str2;
        this.f4709p = str3;
        this.f4710q = putongFrag;
        this.f4711r = putongFrag.act() instanceof QATopicAggregationActivity;
        this.f4712s = moment;
        this.f4699f.o(getPageExtras());
        this.f4700g.o(getPageExtras());
        m7296i0();
        m7303g0();
        m7299b0();
        m7302f0();
        m7295h0();
    }

    /* JADX INFO: renamed from: d0 */
    public void m7301d0(Moment moment) {
        this.f4704k.f4716A.m12453i0().f12011b.mo10739k(moment);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m7302f0() {
        Fragment fragmentM7311N4 = FeedTopicMomentFragment.m7311N4(this.f4708o, this.f4709p, getNewFragmentFrom(), getPageType());
        this.f4704k = fragmentM7311N4;
        this.f4706m.add(fragmentM7311N4);
        this.f4705l.notifyDataSetChanged();
        this.f4697d.setVisibility(0);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m7303g0() {
        this.f4703j = FeedTopicMomentFragment.m7312O4(this.f4708o, this.f4709p, getRecommendFragmentFrom(), getPageType(), this.f4712s);
    }

    public int getCurrentPosition() {
        return this.f4698e.getCurrentItem();
    }

    public String getCurrentShowPageId() {
        cwf0 cwf0Var = this.f4701h;
        if (cwf0Var == this.f4699f) {
            return "p_topic_latest";
        }
        return cwf0Var == this.f4700g ? "p_topic_recommend" : "";
    }

    public FeedTopicMomentFragment getFeedNewTopicMomentFragment() {
        return this.f4704k;
    }

    public FeedTopicMomentFragment getFeedRecommendTopicMomentFragment() {
        return this.f4703j;
    }

    /* JADX INFO: renamed from: j0 */
    public void m7304j0() {
        this.f4699f.i();
        this.f4700g.i();
    }

    /* JADX INFO: renamed from: k0 */
    public void m7305k0() {
        if ("最新".equals(this.f4705l.getPageTitle(this.f4702i))) {
            this.f4699f.g();
        } else if (this.f4713t.equals(this.f4705l.getPageTitle(this.f4702i))) {
            this.f4700g.g();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public cwf0 m7306l0() {
        if (NullChecker.a(this.f4701h)) {
            return this.f4701h;
        }
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m7307m0() {
        List<Fragment> list;
        if (this.f4698e == null || this.f4705l == null || this.f4704k == null || (list = this.f4706m) == null || list.size() < 2) {
            return false;
        }
        this.f4698e.setCurrentItem(1);
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    public void m7308n0(Moment moment) {
        oe40.m12558W(moment, true, false, false, nkg.m12252m0(), null);
        if (NullChecker.a(this.f4704k.f4717z)) {
            this.f4704k.f4717z.m12935d().scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m7309o0() {
        if (NullChecker.a(this.f4703j) && NullChecker.a(this.f4703j.f4717z)) {
            this.f4703j.f4717z.m12938j();
        }
        if (NullChecker.a(this.f4704k) && NullChecker.a(this.f4703j.f4717z)) {
            this.f4704k.f4717z.m12938j();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m7310p0(int i) {
        if (this.f4713t.equals(this.f4705l.getPageTitle(i))) {
            this.f4701h = this.f4700g;
        } else if ("最新".equals(this.f4705l.getPageTitle(i))) {
            this.f4701h = this.f4699f;
        }
        this.f4701h.r();
    }

    public FeedTopicContentWithPluginView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4699f = new cwf0("p_topic_latest", FeedTopicMomentFragment.class.getName());
        this.f4700g = new cwf0("p_topic_recommend", FeedTopicMomentFragment.class.getName());
        this.f4702i = 0;
        this.f4713t = "热门";
        m7294e0(context);
    }

    public FeedTopicContentWithPluginView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4699f = new cwf0("p_topic_latest", FeedTopicMomentFragment.class.getName());
        this.f4700g = new cwf0("p_topic_recommend", FeedTopicMomentFragment.class.getName());
        this.f4702i = 0;
        this.f4713t = "热门";
        m7294e0(context);
    }
}
