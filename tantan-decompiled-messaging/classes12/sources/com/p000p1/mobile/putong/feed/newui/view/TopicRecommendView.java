package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.CategoryTopic;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.topic.VBannerPager;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.eb2;
import l.j760;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p007l.f3c0;
import p007l.l80;
import p007l.nkg;
import p007l.o6c0;
import p007l.p6j0;
import p007l.s1j0;
import p007l.vqg;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicRecommendView extends VRelative {

    /* JADX INFO: renamed from: d */
    public TopicRecommendView f4959d;

    /* JADX INFO: renamed from: e */
    public TextView f4960e;

    /* JADX INFO: renamed from: f */
    public TextView f4961f;

    /* JADX INFO: renamed from: g */
    public VBannerPager f4962g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f4963h;

    /* JADX INFO: renamed from: i */
    public int f4964i;

    /* JADX INFO: renamed from: j */
    public int f4965j;

    /* JADX INFO: renamed from: k */
    public List<ImageView> f4966k;

    /* JADX INFO: renamed from: l */
    public C2235b f4967l;

    /* JADX INFO: renamed from: m */
    public int f4968m;

    /* JADX INFO: renamed from: n */
    public int f4969n;

    /* JADX INFO: renamed from: o */
    public int f4970o;

    /* JADX INFO: renamed from: p */
    public int f4971p;

    /* JADX INFO: renamed from: q */
    public boolean f4972q;

    /* JADX INFO: renamed from: r */
    public l80 f4973r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.TopicRecommendView$a */
    public class C2234a extends l80<TopicMoment> {
        public C2234a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2866j(final TopicMoment topicMoment, int i) {
            String str = "";
            for (CategoryTopic categoryTopic : TopicRecommendView.this.f4967l.f4976f) {
                if (vwb.m(categoryTopic.topicIds, new w9j() { // from class: l.r1j0
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((String) obj).equals(topicMoment.f708id));
                    }
                })) {
                    str = categoryTopic.name;
                }
            }
            TopicRecommendView.this.m7615c0(topicMoment, str);
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo2867l(TopicMoment topicMoment, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.TopicRecommendView$b */
    public class C2235b extends eb2 implements ViewPager.j {

        /* JADX INFO: renamed from: e */
        public List<TopicMoment> f4975e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public List<CategoryTopic> f4976f = new ArrayList();

        public C2235b() {
        }

        public int getCount() {
            return TopicRecommendView.this.f4965j;
        }

        public int getItemPosition(@NonNull Object obj) {
            return -2;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m7619o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                TopicRecommendView.this.f4973r.m11597o();
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            TopicRecommendView.this.f4971p = i;
            TopicRecommendView.this.f4969n = i + 1;
            TopicRecommendView topicRecommendView = TopicRecommendView.this;
            topicRecommendView.m7614b0(topicRecommendView.getPageId());
            TopicRecommendView.this.m7612Z(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.p1.mobile.putong.feed.newui.view.TopicBannerItemView, java.lang.Object] */
        /* JADX INFO: renamed from: p */
        public Object m7620p(ViewGroup viewGroup, int i) {
            ?? r1 = (TopicBannerItemView) TopicRecommendView.this.act().inflater().inflate(o6c0.f11024B3, (ViewGroup) null);
            r1.m7593S(m7621q(i), m7622r(i), this.f4975e, TopicRecommendView.this.f4968m, i + 1, TopicRecommendView.this.f4973r);
            viewGroup.addView(r1);
            return r1;
        }

        /* JADX INFO: renamed from: q */
        public final CategoryTopic m7621q(int i) {
            if (!vwb.J(this.f4976f) && TopicRecommendView.this.f4964i * i < this.f4976f.size()) {
                return this.f4976f.get(TopicRecommendView.this.f4964i * i);
            }
            return null;
        }

        /* JADX INFO: renamed from: r */
        public final CategoryTopic m7622r(int i) {
            if (!vwb.J(this.f4976f) && (TopicRecommendView.this.f4964i * i) + 1 < this.f4976f.size()) {
                return this.f4976f.get((TopicRecommendView.this.f4964i * i) + 1);
            }
            return null;
        }

        /* JADX INFO: renamed from: s */
        public void m7623s(List<CategoryTopic> list, List<TopicMoment> list2) {
            this.f4976f.clear();
            this.f4976f.addAll(list);
            this.f4975e.clear();
            this.f4975e.addAll(list2);
            notifyDataSetChanged();
        }
    }

    public TopicRecommendView(Context context) {
        super(context);
        this.f4964i = 2;
        this.f4966k = new ArrayList();
        this.f4969n = 1;
        this.f4971p = 0;
        this.f4973r = new C2234a();
    }

    /* JADX INFO: renamed from: V */
    private void m7603V() {
        vqg.m15484J0(act());
        m7610T(getPageId());
        FeedModule.f316d.m16752vd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m7604W(View view) {
        m7603V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    private void m7605X(List<CategoryTopic> list, List<TopicMoment> list2) {
        setVisibility(0);
        if (list.size() % this.f4964i == 0) {
            this.f4965j = list.size() / this.f4964i;
        } else {
            this.f4965j = (list.size() / this.f4964i) + 1;
        }
        this.f4966k.clear();
        this.f4963h.removeAllViews();
        if (this.f4965j > 1) {
            for (int i = 0; i < this.f4965j; i++) {
                ImageView imageView = new ImageView(act());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.d(8.0f), -2);
                layoutParams.rightMargin = t100.d(9.0f) / 2;
                layoutParams.gravity = 21;
                imageView.setLayoutParams(layoutParams);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(f3c0.f7921u5);
                this.f4963h.addView(imageView);
                this.f4966k.add(imageView);
            }
        } else {
            xdl0.C0(this.f4959d, t100.d(225.0f));
        }
        this.f4967l.m7623s(list, list2);
        this.f4962g.setCurrentItem(this.f4971p);
        m7612Z(this.f4971p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        if (!nkg.m12263s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f4968m;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    private List<j760<String, String>> getTopicBannerTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("below_moment_position", String.valueOf(this.f4970o)));
        arrayList.add(j760.a("topic_page_seq", String.valueOf(this.f4969n)));
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public final void m7609S(View view) {
        s1j0.m13983a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public void m7610T(String str) {
        p6j0.m12913c("e_discover_topic_list", str, (j760[]) getTopicBannerTrackingParis().toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: Y */
    public void m7611Y(j760<List<CategoryTopic>, List<TopicMoment>> j760Var, String str, int i, int i2) {
        this.f4970o = i;
        this.f4968m = i2;
        this.f4960e.setText(str);
        m7605X((List) j760Var.a, (List) j760Var.b);
    }

    /* JADX INFO: renamed from: Z */
    public final void m7612Z(int i) {
        if (this.f4965j > 1) {
            for (int i2 = 0; i2 < this.f4965j; i2++) {
                List<ImageView> list = this.f4966k;
                if (i2 == i) {
                    list.get(i2).setSelected(true);
                } else {
                    list.get(i2).setSelected(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m7613a0() {
        this.f4972q = true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m7614b0(String str) {
        zvf0.w("e_discover_topic_list", str, (j760[]) getTopicBannerTrackingParis().toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m7615c0(TopicMoment topicMoment, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("topic_page_seq", String.valueOf(this.f4969n)));
        arrayList.add(j760.a("topic_id", topicMoment.f708id));
        arrayList.add(j760.a("topic_colume_name", str));
        p6j0.m12915e("e_discover_topic_item", getPageId(), (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7609S(this);
        C2235b c2235b = new C2235b();
        this.f4967l = c2235b;
        this.f4962g.setAdapter(c2235b);
        this.f4962g.setPageMargin(t100.d(12.0f));
        this.f4962g.setOnPageChangeListener(this.f4967l);
        xdl0.E0(this.f4961f, new View.OnClickListener() { // from class: l.q1j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12049a.m7604W(view);
            }
        });
    }

    public TopicRecommendView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4964i = 2;
        this.f4966k = new ArrayList();
        this.f4969n = 1;
        this.f4971p = 0;
        this.f4973r = new C2234a();
    }

    public TopicRecommendView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4964i = 2;
        this.f4966k = new ArrayList();
        this.f4969n = 1;
        this.f4971p = 0;
        this.f4973r = new C2234a();
    }
}
