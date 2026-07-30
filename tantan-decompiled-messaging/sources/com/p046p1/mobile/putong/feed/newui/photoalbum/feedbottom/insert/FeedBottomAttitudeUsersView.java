package com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Moment;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.i0g0;
import p149l.j760;
import p149l.p6j0;
import p149l.q31;
import p149l.qib0;
import p149l.t100;
import p149l.upg;
import p149l.wpg;
import p149l.xdl0;
import p149l.yih;

/* JADX INFO: loaded from: classes12.dex */
public class FeedBottomAttitudeUsersView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f41774a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f41775b;

    /* JADX INFO: renamed from: c */
    public VText f41776c;

    /* JADX INFO: renamed from: d */
    public String f41777d;

    /* JADX INFO: renamed from: e */
    public Moment f41778e;

    public FeedBottomAttitudeUsersView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: r */
    private void m64552r() {
        String strM214912g = yih.m214909l().m214912g();
        if (!TextUtils.isEmpty(strM214912g)) {
            qib0.f154691G.m102331L0(this.f41775b, strM214912g);
        }
        this.f41776c.setText(i0g0.m133867h0(this.f41778e.attitudes.count) + "人发表了态度");
        setOnClickListener(new View.OnClickListener() { // from class: l.vpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182472a.m64553v(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m64553v(View view) {
        m64556u();
        if (this.f41778e.attitudeId > 0) {
            q31.m172733a(act(), this.f41777d, this.f41778e, yih.m214909l().m214911f());
        } else {
            m64554z();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m64554z() {
        int[] iArr = new int[2];
        this.f41775b.getLocationOnScreen(iArr);
        Point point = new Point();
        int iM186890d = iArr[1] - t100.m186890d(92.0f);
        if (iM186890d < xdl0.m208331F0() + t100.m186890d(44.0f) + t100.m186890d(12.0f)) {
            iM186890d = iArr[1] + t100.m186890d(24.0f);
        }
        point.y = iM186890d;
        point.x = t100.m186890d(40.0f);
        new upg(act(), point, this.f41778e, this.f41777d).m194876a(this.f41775b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64555s(this);
        this.f41776c.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: s */
    public final void m64555s(View view) {
        wpg.m204909a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public void m64556u() {
        p6j0.m167669c("e_attitude", this.f41777d, new j760[0]);
    }

    /* JADX INFO: renamed from: w */
    public void m64557w(String str, Moment moment) {
        this.f41777d = str;
        this.f41778e = moment;
        m64552r();
    }

    public FeedBottomAttitudeUsersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedBottomAttitudeUsersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
