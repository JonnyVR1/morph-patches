package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedRoamMomentItemView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p149l.axh;
import p149l.j760;
import p149l.o6c0;
import p149l.p6j0;
import p149l.t100;
import p149l.xdl0;
import p149l.ywh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedRoamMomentItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedRoamMomentItemView f42481a;

    /* JADX INFO: renamed from: b */
    public VLinear f42482b;

    /* JADX INFO: renamed from: c */
    public View f42483c;

    /* JADX INFO: renamed from: d */
    public C11280a f42484d;

    /* JADX INFO: renamed from: e */
    public Act f42485e;

    /* JADX INFO: renamed from: f */
    public Moment f42486f;

    /* JADX INFO: renamed from: g */
    public FeedRoamGuideView f42487g;

    public FeedRoamMomentItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m65198a(Act act, View view) {
        p6j0.m167669c("e_roam_banner", "p_discover_dating", new j760[0]);
        ywh.m216394c(act, "p_discover_dating,e_roam_banner,click");
    }

    /* JADX INFO: renamed from: b */
    public final void m65199b(View view) {
        axh.m99426a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m65200c(MomentItem momentItem, int i) {
        int iM63909U = this.f42484d.m63909U(momentItem);
        View viewMo28825D = this.f42484d.mo28825D(this.f42482b, iM63909U);
        this.f42482b.addView(viewMo28825D, new LinearLayout.LayoutParams(-1, -2));
        this.f42484d.mo28823A(viewMo28825D, momentItem, iM63909U, i);
    }

    /* JADX INFO: renamed from: d */
    public void m65201d(final Act act, C11280a c11280a, MomentItem momentItem, RawFeed rawFeed, int i) {
        if (NullChecker.m81303a(this.f42486f) && this.f42486f.f56011id.equals(momentItem.f41351d.f56011id)) {
            if (NullChecker.m81303a(this.f42487g)) {
                this.f42487g.m65190d();
                return;
            }
            return;
        }
        this.f42485e = act;
        this.f42484d = c11280a;
        this.f42486f = momentItem.f41351d;
        this.f42482b.removeAllViews();
        MomentItem momentItem2 = new MomentItem(momentItem.f41351d, 0, 0, 0, momentItem.f41348a);
        MomentItem momentItem3 = new MomentItem(momentItem.f41351d, 0, 0, 1, momentItem.f41348a);
        m65200c(momentItem2, i);
        m65200c(momentItem3, i);
        this.f42487g = (FeedRoamGuideView) act.inflater().inflate(o6c0.f142156a3, (ViewGroup) this.f42482b, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = t100.f167259h;
        layoutParams.bottomMargin = t100.m186890d(11.0f);
        this.f42482b.addView(this.f42487g, layoutParams);
        this.f42487g.m65196j(this.f42486f, rawFeed);
        xdl0.m208329E0(this.f42483c, new View.OnClickListener() { // from class: l.zwh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedRoamMomentItemView.m65198a(act, view);
            }
        });
        p6j0.m167671e("e_roam_banner", "p_discover_dating", new j760[0]);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65199b(this);
    }

    public FeedRoamMomentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedRoamMomentItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
