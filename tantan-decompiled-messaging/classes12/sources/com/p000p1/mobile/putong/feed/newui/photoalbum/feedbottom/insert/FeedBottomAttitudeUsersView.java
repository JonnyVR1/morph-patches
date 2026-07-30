package com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import l.i0g0;
import l.j760;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.p6j0;
import p007l.q31;
import p007l.upg;
import p007l.wpg;
import p007l.yih;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedBottomAttitudeUsersView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f3235a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3236b;

    /* JADX INFO: renamed from: c */
    public VText f3237c;

    /* JADX INFO: renamed from: d */
    public String f3238d;

    /* JADX INFO: renamed from: e */
    public Moment f3239e;

    public FeedBottomAttitudeUsersView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: r */
    private void m5646r() {
        String strM17141g = yih.m17138l().m17141g();
        if (!TextUtils.isEmpty(strM17141g)) {
            qib0.G.L0(this.f3236b, strM17141g);
        }
        this.f3237c.setText(i0g0.h0(this.f3239e.attitudes.count) + "人发表了态度");
        setOnClickListener(new View.OnClickListener() { // from class: l.vpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14261a.m5647v(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m5647v(View view) {
        m5650u();
        if (this.f3239e.attitudeId > 0) {
            q31.m13372a(act(), this.f3238d, this.f3239e, yih.m17138l().m17140f());
        } else {
            m5648z();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m5648z() {
        int[] iArr = new int[2];
        this.f3236b.getLocationOnScreen(iArr);
        Point point = new Point();
        int iD = iArr[1] - t100.d(92.0f);
        if (iD < xdl0.F0() + t100.d(44.0f) + t100.d(12.0f)) {
            iD = iArr[1] + t100.d(24.0f);
        }
        point.y = iD;
        point.x = t100.d(40.0f);
        new upg(act(), point, this.f3239e, this.f3238d).m15128a(this.f3236b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5649s(this);
        this.f3237c.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: s */
    public final void m5649s(View view) {
        wpg.m15906a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public void m5650u() {
        p6j0.m12913c("e_attitude", this.f3238d, new j760[0]);
    }

    /* JADX INFO: renamed from: w */
    public void m5651w(String str, Moment moment) {
        this.f3238d = str;
        this.f3239e = moment;
        m5646r();
    }

    public FeedBottomAttitudeUsersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedBottomAttitudeUsersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
