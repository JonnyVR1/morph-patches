package com.p051p1.mobile.putong.feed.newui.view;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.CategoryTopic;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.topic.VBannerPager;
import java.util.ArrayList;
import java.util.List;
import p151v.VRelative;
import p153l.bnl0;
import p153l.cmg;
import p153l.h80;
import p153l.i4g0;
import p153l.jyb;
import p153l.ksg;
import p153l.lb2;
import p153l.lbc0;
import p153l.pf60;
import p153l.qa00;
import p153l.qcj;
import p153l.tec0;
import p153l.tfj0;
import p153l.waj0;

/* JADX INFO: loaded from: classes13.dex */
public class TopicRecommendView extends VRelative {

    /* JADX INFO: renamed from: d */
    public TopicRecommendView f44346d;

    /* JADX INFO: renamed from: e */
    public TextView f44347e;

    /* JADX INFO: renamed from: f */
    public TextView f44348f;

    /* JADX INFO: renamed from: g */
    public VBannerPager f44349g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f44350h;

    /* JADX INFO: renamed from: i */
    public int f44351i;

    /* JADX INFO: renamed from: j */
    public int f44352j;

    /* JADX INFO: renamed from: k */
    public List<ImageView> f44353k;

    /* JADX INFO: renamed from: l */
    public C11554b f44354l;

    /* JADX INFO: renamed from: m */
    public int f44355m;

    /* JADX INFO: renamed from: n */
    public int f44356n;

    /* JADX INFO: renamed from: o */
    public int f44357o;

    /* JADX INFO: renamed from: p */
    public int f44358p;

    /* JADX INFO: renamed from: q */
    public boolean f44359q;

    /* JADX INFO: renamed from: r */
    public h80 f44360r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.TopicRecommendView$a */
    public class C11553a extends h80<TopicMoment> {
        public C11553a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo56878j(final TopicMoment topicMoment, int i) {
            String str = "";
            for (CategoryTopic categoryTopic : TopicRecommendView.this.f44354l.f44363f) {
                if (jyb.m147520m(categoryTopic.topicIds, new qcj() { // from class: l.vaj0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((String) obj).equals(topicMoment.f40095id));
                    }
                })) {
                    str = categoryTopic.name;
                }
            }
            TopicRecommendView.this.m67633c0(topicMoment, str);
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo59141l(TopicMoment topicMoment, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.TopicRecommendView$b */
    public class C11554b extends lb2 implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: e */
        public List<TopicMoment> f44362e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public List<CategoryTopic> f44363f = new ArrayList();

        public C11554b() {
        }

        @Override // p153l.cf60
        public int getCount() {
            return TopicRecommendView.this.f44352j;
        }

        @Override // p153l.cf60
        public int getItemPosition(@NonNull Object obj) {
            return -2;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                TopicRecommendView.this.f44360r.m133884o();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            TopicRecommendView.this.f44358p = i;
            TopicRecommendView.this.f44356n = i + 1;
            TopicRecommendView topicRecommendView = TopicRecommendView.this;
            topicRecommendView.m67632b0(topicRecommendView.getPageId());
            TopicRecommendView.this.m67630Z(i);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            TopicBannerItemView topicBannerItemView = (TopicBannerItemView) TopicRecommendView.this.act().inflater().inflate(tec0.f173474B3, (ViewGroup) null);
            topicBannerItemView.m67611S(m67637q(i), m67638r(i), this.f44362e, TopicRecommendView.this.f44355m, i + 1, TopicRecommendView.this.f44360r);
            viewGroup.addView(topicBannerItemView);
            return topicBannerItemView;
        }

        /* JADX INFO: renamed from: q */
        public final CategoryTopic m67637q(int i) {
            if (!jyb.m147479J(this.f44363f) && TopicRecommendView.this.f44351i * i < this.f44363f.size()) {
                return this.f44363f.get(TopicRecommendView.this.f44351i * i);
            }
            return null;
        }

        /* JADX INFO: renamed from: r */
        public final CategoryTopic m67638r(int i) {
            if (!jyb.m147479J(this.f44363f) && (TopicRecommendView.this.f44351i * i) + 1 < this.f44363f.size()) {
                return this.f44363f.get((TopicRecommendView.this.f44351i * i) + 1);
            }
            return null;
        }

        /* JADX INFO: renamed from: s */
        public void m67639s(List<CategoryTopic> list, List<TopicMoment> list2) {
            this.f44363f.clear();
            this.f44363f.addAll(list);
            this.f44362e.clear();
            this.f44362e.addAll(list2);
            notifyDataSetChanged();
        }
    }

    public TopicRecommendView(Context context) {
        super(context);
        this.f44351i = 2;
        this.f44353k = new ArrayList();
        this.f44356n = 1;
        this.f44358p = 0;
        this.f44360r = new C11553a();
    }

    /* JADX INFO: renamed from: V */
    private void m67621V() {
        ksg.m151173J0(act());
        m67628T(getPageId());
        FeedModule.f39703d.m145812vd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m67622W(View view) {
        m67621V();
    }

    /* JADX INFO: renamed from: X */
    private void m67623X(List<CategoryTopic> list, List<TopicMoment> list2) {
        setVisibility(0);
        if (list.size() % this.f44351i == 0) {
            this.f44352j = list.size() / this.f44351i;
        } else {
            this.f44352j = (list.size() / this.f44351i) + 1;
        }
        this.f44353k.clear();
        this.f44350h.removeAllViews();
        if (this.f44352j > 1) {
            for (int i = 0; i < this.f44352j; i++) {
                ImageView imageView = new ImageView(act());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(8.0f), -2);
                layoutParams.rightMargin = qa00.m175859d(9.0f) / 2;
                layoutParams.gravity = 21;
                imageView.setLayoutParams(layoutParams);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(lbc0.f131156u5);
                this.f44350h.addView(imageView);
                this.f44353k.add(imageView);
            }
        } else {
            bnl0.m105505C0(this.f44346d, qa00.m175859d(225.0f));
        }
        this.f44354l.m67639s(list, list2);
        this.f44349g.setCurrentItem(this.f44358p);
        m67630Z(this.f44358p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        if (!cmg.m111233s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f44355m;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    private List<pf60<String, String>> getTopicBannerTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("below_moment_position", String.valueOf(this.f44357o)));
        arrayList.add(pf60.m172085a("topic_page_seq", String.valueOf(this.f44356n)));
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public final void m67627S(View view) {
        waj0.m205658a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public void m67628T(String str) {
        tfj0.m190940c("e_discover_topic_list", str, (pf60[]) getTopicBannerTrackingParis().toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: Y */
    public void m67629Y(pf60<List<CategoryTopic>, List<TopicMoment>> pf60Var, String str, int i, int i2) {
        this.f44357o = i;
        this.f44355m = i2;
        this.f44347e.setText(str);
        m67623X(pf60Var.f152156a, pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: Z */
    public final void m67630Z(int i) {
        if (this.f44352j > 1) {
            for (int i2 = 0; i2 < this.f44352j; i2++) {
                List<ImageView> list = this.f44353k;
                if (i2 == i) {
                    list.get(i2).setSelected(true);
                } else {
                    list.get(i2).setSelected(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m67631a0() {
        this.f44359q = true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m67632b0(String str) {
        i4g0.m138525w("e_discover_topic_list", str, (pf60[]) getTopicBannerTrackingParis().toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m67633c0(TopicMoment topicMoment, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("topic_page_seq", String.valueOf(this.f44356n)));
        arrayList.add(pf60.m172085a("topic_id", topicMoment.f40095id));
        arrayList.add(pf60.m172085a("topic_colume_name", str));
        tfj0.m190942e("e_discover_topic_item", getPageId(), (pf60[]) arrayList.toArray(new pf60[0]));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67627S(this);
        C11554b c11554b = new C11554b();
        this.f44354l = c11554b;
        this.f44349g.setAdapter(c11554b);
        this.f44349g.setPageMargin(qa00.m175859d(12.0f));
        this.f44349g.setOnPageChangeListener(this.f44354l);
        bnl0.m105509E0(this.f44348f, new View.OnClickListener() { // from class: l.uaj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178215a.m67622W(view);
            }
        });
    }

    public TopicRecommendView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44351i = 2;
        this.f44353k = new ArrayList();
        this.f44356n = 1;
        this.f44358p = 0;
        this.f44360r = new C11553a();
    }

    public TopicRecommendView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44351i = 2;
        this.f44353k = new ArrayList();
        this.f44356n = 1;
        this.f44358p = 0;
        this.f44360r = new C11553a();
    }
}
