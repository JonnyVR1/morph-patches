package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.i0e;
import l.mqi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xck0;
import l.xdl0;
import p007l.e1c0;
import p007l.gg00;
import p007l.kjb0;
import v.VDraweeView;
import v.VImage;
import v.VLinear_FillerMeasure;
import v.VText;
import v.VText_Expandable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentHeaderLargeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VLinear_FillerMeasure f5216d;

    /* JADX INFO: renamed from: e */
    public VText f5217e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f5218f;

    /* JADX INFO: renamed from: g */
    public VImage f5219g;

    /* JADX INFO: renamed from: h */
    public VText f5220h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f5221i;

    /* JADX INFO: renamed from: j */
    public ImageView f5222j;

    /* JADX INFO: renamed from: k */
    public VText_Expandable f5223k;

    /* JADX INFO: renamed from: l */
    public Moment f5224l;

    /* JADX INFO: renamed from: m */
    public boolean f5225m;

    public MomentHeaderLargeView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m7902n0(View view) {
        m7904m0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7903l0(View view) {
        gg00.m10490a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public void m7904m0() {
        act().startActivity(kjb0.m11458j(act(), act().getResources().getString(R$string.f553k4), this.f5224l.landingPage));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean m7905o0(View view) {
        i0e.b(act(), this.f5224l.value);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7903l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m7906p0(TextView textView, boolean z) {
        this.f5225m = z;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m7907q0(View view) {
        m7904m0();
    }

    /* JADX INFO: renamed from: r0 */
    public void m7908r0(Moment moment) {
        Picture picture;
        if (moment.media.isEmpty()) {
            return;
        }
        Media media = moment.media.get(0);
        if (media instanceof Video) {
            picture = ((Video) media).cover;
        } else {
            picture = media instanceof Picture ? (Picture) media : null;
        }
        VDraweeView childAt = this.f5221i.getChildAt(0);
        if (!NullChecker.b(picture)) {
            qib0.G.o(childAt);
            childAt.setVisibility(8);
        } else {
            int iY0 = xdl0.y0() - t100.d(28.0f);
            Dimension dimension = picture.size;
            qib0.G.Q0(childAt, picture.calculatedWidth(xck0.b(iY0, new Point(dimension.width, dimension.height)).x));
            childAt.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m7909s0() {
        m7910t0(true);
    }

    /* JADX INFO: renamed from: t0 */
    public void m7910t0(boolean z) {
        this.f5225m = z;
        this.f5223k.setOnClickListener(new View.OnClickListener() { // from class: l.cg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6620a.m7902n0(view);
            }
        });
        this.f5223k.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.dg00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f6923a.m7905o0(view);
            }
        });
        this.f5223k.setOnExpandStateChangeListener(new VText_Expandable.c() { // from class: l.eg00
            /* JADX INFO: renamed from: a */
            public final void m9814a(TextView textView, boolean z2) {
                this.f7348a.m7906p0(textView, z2);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public void m7911u0(Moment moment) {
        this.f5224l = moment;
        this.f5223k.o(moment.value, this.f5225m);
        this.f5220h.setText(mqi0.G(moment.createdTime));
        if (!NullChecker.b(moment.media) || moment.media.size() == 0) {
            this.f5221i.setVisibility(8);
        } else {
            m7908r0(moment);
            this.f5221i.setBackgroundColor(0);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m7912v0(User user) {
        this.f5217e.setText(user.name);
        if (FeedModule.m1140H().a().d() && user.isVIP()) {
            this.f5217e.setTextColor(act().color(e1c0.f7149k0));
        } else {
            this.f5217e.setTextColor(act().color(e1c0.f7151l0));
        }
        kjb0.m11473y(act(), user, this.f5219g, true, false);
        this.f5221i.setOnClickListener(new View.OnClickListener() { // from class: l.fg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8088a.m7907q0(view);
            }
        });
        boolean zJ = vwb.J(user.profile.extensions.interest.emoji);
        VDraweeView vDraweeView = this.f5218f;
        if (zJ) {
            xdl0.M(vDraweeView, false);
            return;
        }
        xdl0.M(vDraweeView, true);
        qib0.G.L0(this.f5218f, qib0.X.n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    public MomentHeaderLargeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentHeaderLargeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
