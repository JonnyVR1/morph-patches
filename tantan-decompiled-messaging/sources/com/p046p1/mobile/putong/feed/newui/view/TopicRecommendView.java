package com.p046p1.mobile.putong.feed.newui.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.CategoryTopic;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.topic.VBannerPager;
import java.util.ArrayList;
import java.util.List;
import p147v.VRelative;
import p149l.eb2;
import p149l.f3c0;
import p149l.j760;
import p149l.l80;
import p149l.nkg;
import p149l.o6c0;
import p149l.p6j0;
import p149l.s1j0;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicRecommendView extends VRelative {

    /* JADX INFO: renamed from: d */
    public TopicRecommendView f43498d;

    /* JADX INFO: renamed from: e */
    public TextView f43499e;

    /* JADX INFO: renamed from: f */
    public TextView f43500f;

    /* JADX INFO: renamed from: g */
    public VBannerPager f43501g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f43502h;

    /* JADX INFO: renamed from: i */
    public int f43503i;

    /* JADX INFO: renamed from: j */
    public int f43504j;

    /* JADX INFO: renamed from: k */
    public List<ImageView> f43505k;

    /* JADX INFO: renamed from: l */
    public C11391b f43506l;

    /* JADX INFO: renamed from: m */
    public int f43507m;

    /* JADX INFO: renamed from: n */
    public int f43508n;

    /* JADX INFO: renamed from: o */
    public int f43509o;

    /* JADX INFO: renamed from: p */
    public int f43510p;

    /* JADX INFO: renamed from: q */
    public boolean f43511q;

    /* JADX INFO: renamed from: r */
    public l80 f43512r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.TopicRecommendView$a */
    public class C11390a extends l80<TopicMoment> {
        public C11390a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo55695j(final TopicMoment topicMoment, int i) {
            String str = "";
            for (CategoryTopic categoryTopic : TopicRecommendView.this.f43506l.f43515f) {
                if (vwb.m200337m(categoryTopic.topicIds, new w9j() { // from class: l.r1j0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((String) obj).equals(topicMoment.f39247id));
                    }
                })) {
                    str = categoryTopic.name;
                }
            }
            TopicRecommendView.this.m66450c0(topicMoment, str);
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo57958l(TopicMoment topicMoment, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.TopicRecommendView$b */
    public class C11391b extends eb2 implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: e */
        public List<TopicMoment> f43514e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public List<CategoryTopic> f43515f = new ArrayList();

        public C11391b() {
        }

        @Override // p149l.w660
        public int getCount() {
            return TopicRecommendView.this.f43504j;
        }

        @Override // p149l.w660
        public int getItemPosition(@NonNull Object obj) {
            return -2;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                TopicRecommendView.this.f43512r.m148842o();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            TopicRecommendView.this.f43510p = i;
            TopicRecommendView.this.f43508n = i + 1;
            TopicRecommendView topicRecommendView = TopicRecommendView.this;
            topicRecommendView.m66449b0(topicRecommendView.getPageId());
            TopicRecommendView.this.m66447Z(i);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            TopicBannerItemView topicBannerItemView = (TopicBannerItemView) TopicRecommendView.this.act().inflater().inflate(o6c0.f142005B3, (ViewGroup) null);
            topicBannerItemView.m66428S(m66454q(i), m66455r(i), this.f43514e, TopicRecommendView.this.f43507m, i + 1, TopicRecommendView.this.f43512r);
            viewGroup.addView(topicBannerItemView);
            return topicBannerItemView;
        }

        /* JADX INFO: renamed from: q */
        public final CategoryTopic m66454q(int i) {
            if (!vwb.m200296J(this.f43515f) && TopicRecommendView.this.f43503i * i < this.f43515f.size()) {
                return this.f43515f.get(TopicRecommendView.this.f43503i * i);
            }
            return null;
        }

        /* JADX INFO: renamed from: r */
        public final CategoryTopic m66455r(int i) {
            if (!vwb.m200296J(this.f43515f) && (TopicRecommendView.this.f43503i * i) + 1 < this.f43515f.size()) {
                return this.f43515f.get((TopicRecommendView.this.f43503i * i) + 1);
            }
            return null;
        }

        /* JADX INFO: renamed from: s */
        public void m66456s(List<CategoryTopic> list, List<TopicMoment> list2) {
            this.f43515f.clear();
            this.f43515f.addAll(list);
            this.f43514e.clear();
            this.f43514e.addAll(list2);
            notifyDataSetChanged();
        }
    }

    public TopicRecommendView(Context context) {
        super(context);
        this.f43503i = 2;
        this.f43505k = new ArrayList();
        this.f43508n = 1;
        this.f43510p = 0;
        this.f43512r = new C11390a();
    }

    /* JADX INFO: renamed from: V */
    private void m66438V() {
        vqg.m199514J0(act());
        m66445T(getPageId());
        FeedModule.f38855d.m209571vd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m66439W(View view) {
        m66438V();
    }

    /* JADX INFO: renamed from: X */
    private void m66440X(List<CategoryTopic> list, List<TopicMoment> list2) {
        setVisibility(0);
        if (list.size() % this.f43503i == 0) {
            this.f43504j = list.size() / this.f43503i;
        } else {
            this.f43504j = (list.size() / this.f43503i) + 1;
        }
        this.f43505k.clear();
        this.f43502h.removeAllViews();
        if (this.f43504j > 1) {
            for (int i = 0; i < this.f43504j; i++) {
                ImageView imageView = new ImageView(act());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(8.0f), -2);
                layoutParams.rightMargin = t100.m186890d(9.0f) / 2;
                layoutParams.gravity = 21;
                imageView.setLayoutParams(layoutParams);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(f3c0.f94638u5);
                this.f43502h.addView(imageView);
                this.f43505k.add(imageView);
            }
        } else {
            xdl0.m208325C0(this.f43498d, t100.m186890d(225.0f));
        }
        this.f43506l.m66456s(list, list2);
        this.f43501g.setCurrentItem(this.f43510p);
        m66447Z(this.f43510p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        if (!nkg.m159904s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f43507m;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    private List<j760<String, String>> getTopicBannerTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("below_moment_position", String.valueOf(this.f43509o)));
        arrayList.add(j760.m140076a("topic_page_seq", String.valueOf(this.f43508n)));
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public final void m66444S(View view) {
        s1j0.m181967a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public void m66445T(String str) {
        p6j0.m167669c("e_discover_topic_list", str, (j760[]) getTopicBannerTrackingParis().toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: Y */
    public void m66446Y(j760<List<CategoryTopic>, List<TopicMoment>> j760Var, String str, int i, int i2) {
        this.f43509o = i;
        this.f43507m = i2;
        this.f43499e.setText(str);
        m66440X(j760Var.f116564a, j760Var.f116565b);
    }

    /* JADX INFO: renamed from: Z */
    public final void m66447Z(int i) {
        if (this.f43504j > 1) {
            for (int i2 = 0; i2 < this.f43504j; i2++) {
                List<ImageView> list = this.f43505k;
                if (i2 == i) {
                    list.get(i2).setSelected(true);
                } else {
                    list.get(i2).setSelected(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m66448a0() {
        this.f43511q = true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m66449b0(String str) {
        zvf0.m220401w("e_discover_topic_list", str, (j760[]) getTopicBannerTrackingParis().toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m66450c0(TopicMoment topicMoment, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("topic_page_seq", String.valueOf(this.f43508n)));
        arrayList.add(j760.m140076a("topic_id", topicMoment.f39247id));
        arrayList.add(j760.m140076a("topic_colume_name", str));
        p6j0.m167671e("e_discover_topic_item", getPageId(), (j760[]) arrayList.toArray(new j760[0]));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66444S(this);
        C11391b c11391b = new C11391b();
        this.f43506l = c11391b;
        this.f43501g.setAdapter(c11391b);
        this.f43501g.setPageMargin(t100.m186890d(12.0f));
        this.f43501g.setOnPageChangeListener(this.f43506l);
        xdl0.m208329E0(this.f43500f, new View.OnClickListener() { // from class: l.q1j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152135a.m66439W(view);
            }
        });
    }

    public TopicRecommendView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43503i = 2;
        this.f43505k = new ArrayList();
        this.f43508n = 1;
        this.f43510p = 0;
        this.f43512r = new C11390a();
    }

    public TopicRecommendView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43503i = 2;
        this.f43505k = new ArrayList();
        this.f43508n = 1;
        this.f43510p = 0;
        this.f43512r = new C11390a();
    }
}
