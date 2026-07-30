package com.p000p1.mobile.putong.feed.newui.mediapicker.post.state;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bkb0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.fyh;
import p007l.o3i;
import p007l.p6j0;
import p007l.qfh;
import p007l.u2h;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMomentPostStatusView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VFrame f2268d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f2269e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f2270f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f2271g;

    /* JADX INFO: renamed from: h */
    public TextView f2272h;

    /* JADX INFO: renamed from: i */
    public List<fyh> f2273i;

    /* JADX INFO: renamed from: j */
    public Act f2274j;

    /* JADX INFO: renamed from: k */
    public BubbleInfo f2275k;

    public FeedMomentPostStatusView(Context context) {
        super(context);
        this.f2273i = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m4078k0(Act act, View view) {
        p6j0.m12912b("e_fast_state_post", "p_moment_post", new p6j0.C2456a[0]);
        act.startActivityForResult(FeedMomentPostSelectStatusAct.m4075p2(act, this.f2275k), 10040);
        act.overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public void m4079R(final Act act) {
        this.f2274j = act;
        addView(m4080i0(LayoutInflater.from(act), this));
        if (u2h.m14723h()) {
            this.f2272h.setTextColor(getResources().getColor(e1c0.f7140g));
        }
        this.f2272h.setText(FeedModule.m1140H().me_().name);
        qib0.G.J0(this.f2269e, FeedModule.m1140H().me_().m1042fp().profileSmall(), true);
        m4081j0();
        xdl0.E0(this, new View.OnClickListener() { // from class: l.pfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11826a.m4078k0(act, view);
            }
        });
        m4083m0();
    }

    /* JADX INFO: renamed from: i0 */
    public View m4080i0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qfh.m13548b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m4081j0() {
        xdl0.M(this.f2270f, false);
        qib0.G.Y0(this.f2271g, f3c0.f7736X1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m4082l0(BubbleInfo bubbleInfo) {
        this.f2275k = bubbleInfo;
        VDraweeView vDraweeView = this.f2270f;
        if (bubbleInfo == null) {
            xdl0.M(vDraweeView, false);
            qib0.G.Y0(this.f2271g, f3c0.f7736X1);
            return;
        }
        xdl0.M(vDraweeView, true);
        if (!NullChecker.a(bubbleInfo.emotion) || vwb.J(bubbleInfo.emotion.backgroundColor)) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(Color.parseColor("#000000"));
            this.f2270f.setBackground(shapeDrawable);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            try {
                shapeDrawable2.getPaint().setColor(Color.parseColor(bubbleInfo.emotion.backgroundColor.get(0)));
            } catch (IllegalArgumentException e) {
                shapeDrawable2.getPaint().setColor(Color.parseColor("#FFFFFF"));
                CrashHelper.c(e);
            }
            this.f2270f.setBackground(shapeDrawable2);
        }
        bkb0 bkb0Var = qib0.G;
        VDraweeView vDraweeView2 = this.f2271g;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = t100.n;
        bkb0Var.I0(vDraweeView2, str, i, i);
    }

    /* JADX INFO: renamed from: m0 */
    public void m4083m0() {
        String strM12436f = o3i.m12436f();
        if (!o3i.m12431a() || TextUtils.isEmpty(strM12436f)) {
            return;
        }
        VText vText = new VText(this.f2274j);
        int i = xdl0.e;
        vText.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        vText.setText(strM12436f);
        vText.setTextSize(13.0f);
        vText.setPadding(t100.d(10.0f), t100.d(12.0f), t100.d(10.0f), t100.d(10.0f));
        vText.setTextColor(-1);
        vText.getPaint().setFakeBoldText(true);
        a aVarX = new a(this.f2274j).s(vText).e(true).k(new int[]{this.f2274j.getResources().getColor(e1c0.f7154n)}).b(5000L).y(true).q(a.N | a.O).x(t100.d(10.0f));
        o3i.m12439i();
        d.l().t(aVarX, this.f2270f);
    }

    public FeedMomentPostStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2273i = new ArrayList();
    }

    public FeedMomentPostStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2273i = new ArrayList();
    }
}
