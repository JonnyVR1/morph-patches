package com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.aqg;
import p149l.b5c0;
import p149l.e30;
import p149l.hx60;
import p149l.j760;
import p149l.mkd0;
import p149l.o6c0;
import p149l.p6j0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.yih;

/* JADX INFO: loaded from: classes12.dex */
public class FeedBottomAttitudeView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f41779a;

    /* JADX INFO: renamed from: b */
    public VText f41780b;

    /* JADX INFO: renamed from: c */
    public VLinear f41781c;

    /* JADX INFO: renamed from: d */
    public String f41782d;

    /* JADX INFO: renamed from: e */
    public hx60 f41783e;

    /* JADX INFO: renamed from: f */
    public Moment f41784f;

    public FeedBottomAttitudeView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: r */
    private void m64559r() {
        ArrayList<AttitudeConfigs> arrayListM214911f = yih.m214909l().m214911f();
        boolean zM200296J = vwb.m200296J(arrayListM214911f);
        VLinear vLinear = this.f41779a;
        if (zM200296J) {
            xdl0.m208344M(vLinear, false);
            return;
        }
        xdl0.m208344M(vLinear, true);
        this.f41781c.removeAllViews();
        int iM64566z = m64566z(arrayListM214911f);
        for (int i = 0; i < arrayListM214911f.size(); i++) {
            final AttitudeConfigs attitudeConfigs = arrayListM214911f.get(i);
            View view = (VLinear) act().inflater().inflate(o6c0.f142080O, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i > 0) {
                layoutParams.leftMargin = iM64566z;
            }
            view.setLayoutParams(layoutParams);
            VDraweeView vDraweeView = (VDraweeView) view.findViewById(b5c0.f73561f);
            VText vText = (VText) view.findViewById(b5c0.f73559e1);
            qib0.f154691G.m102331L0(vDraweeView, attitudeConfigs.url);
            vText.setText(attitudeConfigs.name);
            this.f41781c.addView(view);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.xpg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f193914a.m64562B(attitudeConfigs, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m64561u(Envelope envelope) {
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m64562B(AttitudeConfigs attitudeConfigs, View view) {
        m64565w(attitudeConfigs.f39215id);
        this.f41783e.m133312t(this.f41784f, attitudeConfigs.f39215id).subscribe(mkd0.m154956H(new e30() { // from class: l.ypg
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedBottomAttitudeView.m64561u((Envelope) obj);
            }
        }, new e30() { // from class: l.zpg
            @Override // p149l.e30
            public final void call(Object obj) {
                t2h.m186976g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public void m64563C(String str, hx60 hx60Var, Moment moment) {
        this.f41782d = str;
        this.f41783e = hx60Var;
        this.f41784f = moment;
        m64559r();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64564v(this);
        this.f41780b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: v */
    public final void m64564v(View view) {
        aqg.m98289a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public void m64565w(int i) {
        p6j0.m167669c("e_attitude_guide", this.f41782d, j760.m140076a("attitude", Integer.valueOf(i)), j760.m140076a("moment_id", NullChecker.m81303a(this.f41784f) ? this.f41784f.f56011id : ""));
    }

    /* JADX INFO: renamed from: z */
    public final int m64566z(List<AttitudeConfigs> list) {
        int iM208412y0 = (int) ((((xdl0.m208412y0() - t100.m186890d(21.0f)) - this.f41780b.getPaint().measureText("我觉得")) - t100.m186890d(16.0f)) - t100.m186890d(64.0f));
        int iM186890d = 0;
        for (int i = 0; i < list.size(); i++) {
            iM186890d = (int) (iM186890d + t100.m186890d(24.0f) + t100.m186890d(4.0f) + this.f41780b.getPaint().measureText(list.get(i).name));
        }
        return (iM208412y0 - iM186890d) / 3;
    }

    public FeedBottomAttitudeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedBottomAttitudeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
