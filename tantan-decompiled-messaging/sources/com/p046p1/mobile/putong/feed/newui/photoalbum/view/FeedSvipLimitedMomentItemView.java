package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p149l.mqi0;
import p149l.v4i;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSvipLimitedMomentItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedSvipLimitedMomentItemView f42546a;

    /* JADX INFO: renamed from: b */
    public VLinear f42547b;

    /* JADX INFO: renamed from: c */
    public View f42548c;

    /* JADX INFO: renamed from: d */
    public Button f42549d;

    /* JADX INFO: renamed from: e */
    public C11280a f42550e;

    /* JADX INFO: renamed from: f */
    public Act f42551f;

    /* JADX INFO: renamed from: g */
    public Moment f42552g;

    /* JADX INFO: renamed from: h */
    public long f42553h;

    public FeedSvipLimitedMomentItemView(Context context) {
        super(context);
        this.f42553h = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m65251b(View view) {
        v4i.m196990a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m65252c(MomentItem momentItem, int i) {
        int iM63909U = this.f42550e.m63909U(momentItem);
        View viewMo28825D = this.f42550e.mo28825D(this.f42547b, iM63909U);
        this.f42547b.addView(viewMo28825D, new LinearLayout.LayoutParams(-1, -2));
        this.f42550e.mo28823A(viewMo28825D, momentItem, iM63909U, i);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m65253d(View view) {
        m65255f();
    }

    /* JADX INFO: renamed from: e */
    public void m65254e(Act act, C11280a c11280a, MomentItem momentItem, int i) {
        if (NullChecker.m81303a(this.f42552g) && this.f42552g.f56011id.equals(momentItem.f41351d.f56011id)) {
            return;
        }
        this.f42551f = act;
        this.f42550e = c11280a;
        this.f42552g = momentItem.f41351d;
        this.f42547b.removeAllViews();
        MomentItem momentItem2 = new MomentItem(momentItem.f41351d, 0, 0, 0, momentItem.f41348a);
        MomentItem momentItem3 = new MomentItem(momentItem.f41351d, 0, 0, 1, momentItem.f41348a);
        MomentItem momentItem4 = new MomentItem(momentItem.f41351d, 0, 0, 2, momentItem.f41348a);
        m65252c(momentItem2, i);
        m65252c(momentItem3, i);
        m65252c(momentItem4, i);
        xdl0.m208329E0(this.f42549d, new View.OnClickListener() { // from class: l.u4i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174600a.m65253d(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m65255f() {
        if (this.f42551f != null && mqi0.m155944o() - this.f42553h >= 1000) {
            this.f42553h = mqi0.m155944o();
            FeedModule.m60222H().mo30723Rb(this.f42551f, "p_like,e_moment_unlock,click");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65251b(this);
    }

    public FeedSvipLimitedMomentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42553h = 0L;
    }

    public FeedSvipLimitedMomentItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42553h = 0L;
    }
}
