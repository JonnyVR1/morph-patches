package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p153l.bnl0;
import p153l.k6i;
import p153l.pzi0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSvipLimitedMomentItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedSvipLimitedMomentItemView f43394a;

    /* JADX INFO: renamed from: b */
    public VLinear f43395b;

    /* JADX INFO: renamed from: c */
    public View f43396c;

    /* JADX INFO: renamed from: d */
    public Button f43397d;

    /* JADX INFO: renamed from: e */
    public C11443a f43398e;

    /* JADX INFO: renamed from: f */
    public Act f43399f;

    /* JADX INFO: renamed from: g */
    public Moment f43400g;

    /* JADX INFO: renamed from: h */
    public long f43401h;

    public FeedSvipLimitedMomentItemView(Context context) {
        super(context);
        this.f43401h = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m66434b(View view) {
        k6i.m148516a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m66435c(MomentItem momentItem, int i) {
        int iM65092U = this.f43398e.m65092U(momentItem);
        View viewMo29824D = this.f43398e.mo29824D(this.f43395b, iM65092U);
        this.f43395b.addView(viewMo29824D, new LinearLayout.LayoutParams(-1, -2));
        this.f43398e.mo29822A(viewMo29824D, momentItem, iM65092U, i);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m66436d(View view) {
        m66438f();
    }

    /* JADX INFO: renamed from: e */
    public void m66437e(Act act, C11443a c11443a, MomentItem momentItem, int i) {
        if (NullChecker.m82486a(this.f43400g) && this.f43400g.f56859id.equals(momentItem.f42199d.f56859id)) {
            return;
        }
        this.f43399f = act;
        this.f43398e = c11443a;
        this.f43400g = momentItem.f42199d;
        this.f43395b.removeAllViews();
        MomentItem momentItem2 = new MomentItem(momentItem.f42199d, 0, 0, 0, momentItem.f42196a);
        MomentItem momentItem3 = new MomentItem(momentItem.f42199d, 0, 0, 1, momentItem.f42196a);
        MomentItem momentItem4 = new MomentItem(momentItem.f42199d, 0, 0, 2, momentItem.f42196a);
        m66435c(momentItem2, i);
        m66435c(momentItem3, i);
        m66435c(momentItem4, i);
        bnl0.m105509E0(this.f43397d, new View.OnClickListener() { // from class: l.j6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118564a.m66436d(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m66438f() {
        if (this.f43399f != null && pzi0.m174454o() - this.f43401h >= 1000) {
            this.f43401h = pzi0.m174454o();
            FeedModule.m61406H().mo31726Rb(this.f43399f, "p_like,e_moment_unlock,click");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66434b(this);
    }

    public FeedSvipLimitedMomentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43401h = 0L;
    }

    public FeedSvipLimitedMomentItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43401h = 0L;
    }
}
