package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedRoamMomentItemView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p153l.bnl0;
import p153l.nyh;
import p153l.pf60;
import p153l.pyh;
import p153l.qa00;
import p153l.tec0;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedRoamMomentItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedRoamMomentItemView f43329a;

    /* JADX INFO: renamed from: b */
    public VLinear f43330b;

    /* JADX INFO: renamed from: c */
    public View f43331c;

    /* JADX INFO: renamed from: d */
    public C11443a f43332d;

    /* JADX INFO: renamed from: e */
    public Act f43333e;

    /* JADX INFO: renamed from: f */
    public Moment f43334f;

    /* JADX INFO: renamed from: g */
    public FeedRoamGuideView f43335g;

    public FeedRoamMomentItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m66381a(Act act, View view) {
        tfj0.m190940c("e_roam_banner", "p_discover_dating", new pf60[0]);
        nyh.m165325c(act, "p_discover_dating,e_roam_banner,click");
    }

    /* JADX INFO: renamed from: b */
    public final void m66382b(View view) {
        pyh.m174285a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m66383c(MomentItem momentItem, int i) {
        int iM65092U = this.f43332d.m65092U(momentItem);
        View viewMo29824D = this.f43332d.mo29824D(this.f43330b, iM65092U);
        this.f43330b.addView(viewMo29824D, new LinearLayout.LayoutParams(-1, -2));
        this.f43332d.mo29822A(viewMo29824D, momentItem, iM65092U, i);
    }

    /* JADX INFO: renamed from: d */
    public void m66384d(final Act act, C11443a c11443a, MomentItem momentItem, RawFeed rawFeed, int i) {
        if (NullChecker.m82486a(this.f43334f) && this.f43334f.f56859id.equals(momentItem.f42199d.f56859id)) {
            if (NullChecker.m82486a(this.f43335g)) {
                this.f43335g.m66373d();
                return;
            }
            return;
        }
        this.f43333e = act;
        this.f43332d = c11443a;
        this.f43334f = momentItem.f42199d;
        this.f43330b.removeAllViews();
        MomentItem momentItem2 = new MomentItem(momentItem.f42199d, 0, 0, 0, momentItem.f42196a);
        MomentItem momentItem3 = new MomentItem(momentItem.f42199d, 0, 0, 1, momentItem.f42196a);
        m66383c(momentItem2, i);
        m66383c(momentItem3, i);
        this.f43335g = (FeedRoamGuideView) act.inflater().inflate(tec0.f173625a3, (ViewGroup) this.f43330b, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = qa00.f156321h;
        layoutParams.bottomMargin = qa00.m175859d(11.0f);
        this.f43330b.addView(this.f43335g, layoutParams);
        this.f43335g.m66379j(this.f43334f, rawFeed);
        bnl0.m105509E0(this.f43331c, new View.OnClickListener() { // from class: l.oyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedRoamMomentItemView.m66381a(act, view);
            }
        });
        tfj0.m190942e("e_roam_banner", "p_discover_dating", new pf60[0]);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66382b(this);
    }

    public FeedRoamMomentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedRoamMomentItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
