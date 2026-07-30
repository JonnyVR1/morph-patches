package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.mqi0;
import l.xdl0;
import p007l.v4i;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSvipLimitedMomentItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedSvipLimitedMomentItemView f4007a;

    /* JADX INFO: renamed from: b */
    public VLinear f4008b;

    /* JADX INFO: renamed from: c */
    public View f4009c;

    /* JADX INFO: renamed from: d */
    public Button f4010d;

    /* JADX INFO: renamed from: e */
    public C2124a f4011e;

    /* JADX INFO: renamed from: f */
    public Act f4012f;

    /* JADX INFO: renamed from: g */
    public Moment f4013g;

    /* JADX INFO: renamed from: h */
    public long f4014h;

    public FeedSvipLimitedMomentItemView(Context context) {
        super(context);
        this.f4014h = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m6352b(View view) {
        v4i.m15342a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m6353c(MomentItem momentItem, int i) {
        int iM4946U = this.f4011e.m4946U(momentItem);
        View viewM4940D = this.f4011e.m4940D(this.f4008b, iM4946U);
        this.f4008b.addView(viewM4940D, new LinearLayout.LayoutParams(-1, -2));
        this.f4011e.mo4938A(viewM4940D, momentItem, iM4946U, i);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m6354d(View view) {
        m6356f();
    }

    /* JADX INFO: renamed from: e */
    public void m6355e(Act act, C2124a c2124a, MomentItem momentItem, int i) {
        if (NullChecker.a(this.f4013g) && ((DbObject) this.f4013g).id.equals(((DbObject) momentItem.f2812d).id)) {
            return;
        }
        this.f4012f = act;
        this.f4011e = c2124a;
        this.f4013g = momentItem.f2812d;
        this.f4008b.removeAllViews();
        MomentItem momentItem2 = new MomentItem(momentItem.f2812d, 0, 0, 0, momentItem.f2809a);
        MomentItem momentItem3 = new MomentItem(momentItem.f2812d, 0, 0, 1, momentItem.f2809a);
        MomentItem momentItem4 = new MomentItem(momentItem.f2812d, 0, 0, 2, momentItem.f2809a);
        m6353c(momentItem2, i);
        m6353c(momentItem3, i);
        m6353c(momentItem4, i);
        xdl0.E0(this.f4010d, new View.OnClickListener() { // from class: l.u4i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13539a.m6354d(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m6356f() {
        if (this.f4012f != null && mqi0.o() - this.f4014h >= 1000) {
            this.f4014h = mqi0.o();
            FeedModule.m1140H().Rb(this.f4012f, "p_like,e_moment_unlock,click");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6352b(this);
    }

    public FeedSvipLimitedMomentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4014h = 0L;
    }

    public FeedSvipLimitedMomentItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4014h = 0L;
    }
}
