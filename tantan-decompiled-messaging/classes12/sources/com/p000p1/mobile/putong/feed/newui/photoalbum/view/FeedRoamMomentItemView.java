package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedRoamMomentItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.t100;
import l.xdl0;
import p007l.axh;
import p007l.o6c0;
import p007l.p6j0;
import p007l.ywh;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedRoamMomentItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedRoamMomentItemView f3942a;

    /* JADX INFO: renamed from: b */
    public VLinear f3943b;

    /* JADX INFO: renamed from: c */
    public View f3944c;

    /* JADX INFO: renamed from: d */
    public C2124a f3945d;

    /* JADX INFO: renamed from: e */
    public Act f3946e;

    /* JADX INFO: renamed from: f */
    public Moment f3947f;

    /* JADX INFO: renamed from: g */
    public FeedRoamGuideView f3948g;

    public FeedRoamMomentItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6299a(Act act, View view) {
        p6j0.m12913c("e_roam_banner", "p_discover_dating", new j760[0]);
        ywh.m17196c(act, "p_discover_dating,e_roam_banner,click");
    }

    /* JADX INFO: renamed from: b */
    public final void m6300b(View view) {
        axh.m8621a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m6301c(MomentItem momentItem, int i) {
        int iM4946U = this.f3945d.m4946U(momentItem);
        View viewM4940D = this.f3945d.m4940D(this.f3943b, iM4946U);
        this.f3943b.addView(viewM4940D, new LinearLayout.LayoutParams(-1, -2));
        this.f3945d.mo4938A(viewM4940D, momentItem, iM4946U, i);
    }

    /* JADX INFO: renamed from: d */
    public void m6302d(final Act act, C2124a c2124a, MomentItem momentItem, RawFeed rawFeed, int i) {
        if (NullChecker.a(this.f3947f) && ((DbObject) this.f3947f).id.equals(((DbObject) momentItem.f2812d).id)) {
            if (NullChecker.a(this.f3948g)) {
                this.f3948g.m6291d();
                return;
            }
            return;
        }
        this.f3946e = act;
        this.f3945d = c2124a;
        this.f3947f = momentItem.f2812d;
        this.f3943b.removeAllViews();
        MomentItem momentItem2 = new MomentItem(momentItem.f2812d, 0, 0, 0, momentItem.f2809a);
        MomentItem momentItem3 = new MomentItem(momentItem.f2812d, 0, 0, 1, momentItem.f2809a);
        m6301c(momentItem2, i);
        m6301c(momentItem3, i);
        this.f3948g = (FeedRoamGuideView) act.inflater().inflate(o6c0.f11175a3, (ViewGroup) this.f3943b, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = t100.h;
        layoutParams.bottomMargin = t100.d(11.0f);
        this.f3943b.addView(this.f3948g, layoutParams);
        this.f3948g.m6297j(this.f3947f, rawFeed);
        xdl0.E0(this.f3944c, new View.OnClickListener() { // from class: l.zwh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedRoamMomentItemView.m6299a(act, view);
            }
        });
        p6j0.m12915e("e_roam_banner", "p_discover_dating", new j760[0]);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6300b(this);
    }

    public FeedRoamMomentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedRoamMomentItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
