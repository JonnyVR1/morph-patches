package com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.aqg;
import p007l.b5c0;
import p007l.hx60;
import p007l.o6c0;
import p007l.p6j0;
import p007l.yih;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedBottomAttitudeView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f3240a;

    /* JADX INFO: renamed from: b */
    public VText f3241b;

    /* JADX INFO: renamed from: c */
    public VLinear f3242c;

    /* JADX INFO: renamed from: d */
    public String f3243d;

    /* JADX INFO: renamed from: e */
    public hx60 f3244e;

    /* JADX INFO: renamed from: f */
    public Moment f3245f;

    public FeedBottomAttitudeView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: r */
    private void m5653r() {
        ArrayList<AttitudeConfigs> arrayListM17140f = yih.m17138l().m17140f();
        boolean zJ = vwb.J(arrayListM17140f);
        VLinear vLinear = this.f3240a;
        if (zJ) {
            xdl0.M(vLinear, false);
            return;
        }
        xdl0.M(vLinear, true);
        this.f3242c.removeAllViews();
        int iM5660z = m5660z(arrayListM17140f);
        for (int i = 0; i < arrayListM17140f.size(); i++) {
            final AttitudeConfigs attitudeConfigs = arrayListM17140f.get(i);
            View view = (VLinear) act().inflater().inflate(o6c0.f11099O, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i > 0) {
                layoutParams.leftMargin = iM5660z;
            }
            view.setLayoutParams(layoutParams);
            VDraweeView vDraweeViewFindViewById = view.findViewById(b5c0.f6042f);
            VText vTextFindViewById = view.findViewById(b5c0.f6040e1);
            qib0.G.L0(vDraweeViewFindViewById, attitudeConfigs.url);
            vTextFindViewById.setText(attitudeConfigs.name);
            this.f3242c.addView(view);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.xpg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f15064a.m5656B(attitudeConfigs, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5655u(Envelope envelope) {
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m5656B(AttitudeConfigs attitudeConfigs, View view) {
        m5659w(attitudeConfigs.f676id);
        this.f3244e.m10747t(this.f3245f, attitudeConfigs.f676id).subscribe(mkd0.H(new e30() { // from class: l.ypg
            public final void call(Object obj) {
                FeedBottomAttitudeView.m5655u((Envelope) obj);
            }
        }, new e30() { // from class: l.zpg
            public final void call(Object obj) {
                t2h.m14427g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public void m5657C(String str, hx60 hx60Var, Moment moment) {
        this.f3243d = str;
        this.f3244e = hx60Var;
        this.f3245f = moment;
        m5653r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5658v(this);
        this.f3241b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: v */
    public final void m5658v(View view) {
        aqg.m8589a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public void m5659w(int i) {
        p6j0.m12913c("e_attitude_guide", this.f3243d, j760.a("attitude", Integer.valueOf(i)), j760.a("moment_id", NullChecker.a(this.f3245f) ? ((DbObject) this.f3245f).id : ""));
    }

    /* JADX INFO: renamed from: z */
    public final int m5660z(List<AttitudeConfigs> list) {
        int iY0 = (int) ((((xdl0.y0() - t100.d(21.0f)) - this.f3241b.getPaint().measureText("我觉得")) - t100.d(16.0f)) - t100.d(64.0f));
        int iD = 0;
        for (int i = 0; i < list.size(); i++) {
            iD = (int) (iD + t100.d(24.0f) + t100.d(4.0f) + this.f3241b.getPaint().measureText(list.get(i).name));
        }
        return (iY0 - iD) / 3;
    }

    public FeedBottomAttitudeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedBottomAttitudeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
