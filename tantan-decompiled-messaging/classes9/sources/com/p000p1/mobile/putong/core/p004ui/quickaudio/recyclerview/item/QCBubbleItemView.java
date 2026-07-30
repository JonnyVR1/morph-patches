package com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p1.mobile.putong.ui.square.AbsBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.t100;
import l.vcl0;
import l.xaj0;
import l.xdl0;
import l.xmb0;
import p006l.eyb0;
import p006l.nn50;
import p006l.qib0;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class QCBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f5237d;

    /* JADX INFO: renamed from: e */
    public VRelative f5238e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f5239f;

    /* JADX INFO: renamed from: g */
    public VLinear f5240g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f5241h;

    /* JADX INFO: renamed from: i */
    public TextView f5242i;

    /* JADX INFO: renamed from: j */
    public TextView f5243j;

    /* JADX INFO: renamed from: k */
    public TextView f5244k;

    /* JADX INFO: renamed from: l */
    public Space f5245l;

    /* JADX INFO: renamed from: m */
    public View f5246m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f5247n;

    /* JADX INFO: renamed from: o */
    public VFrame f5248o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f5249p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f5250q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f5251r;

    /* JADX INFO: renamed from: s */
    public View f5252s;

    public QCBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m7929k(e30 e30Var, View view) {
        if (this.f5237d.getScaleY() >= 0.5f && NullChecker.a(e30Var)) {
            e30Var.call(this);
        }
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f5240g.setAlpha(f.floatValue());
        this.f5243j.setAlpha(f.floatValue());
        this.f5244k.setAlpha(f.floatValue());
        this.f5247n.setAlpha(f.floatValue());
    }

    /* JADX INFO: renamed from: c */
    public void m7930c(boolean z) {
        if (m7897h(this.f5242i)) {
            xdl0.M0(this.f5242i, z);
        }
        xdl0.M0(this.f5245l, z);
        xdl0.M0(this.f5246m, z);
        xdl0.M0(this.f5247n, z);
        if (m7897h(this.f5240g)) {
            xdl0.M0(this.f5240g, z);
        }
        if (m7897h(this.f5241h)) {
            xdl0.M0(this.f5241h, z);
        }
        if (m7897h(this.f5244k)) {
            xdl0.M0(this.f5244k, z);
        }
        if (m7897h(this.f5243j)) {
            xdl0.M0(this.f5243j, z);
        }
        xdl0.M0(this.f5252s, z);
    }

    /* JADX INFO: renamed from: e */
    public void m7931e(float f) {
        ConstraintLayout constraintLayout = this.f5237d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f5237d.setPivotY(0.0f);
        this.f5237d.setScaleX(f);
        this.f5237d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = t100.L;
        vcl0.b(this.f5238e, i - ((int) ((i - t100.t) * f)));
    }

    public View getAnimLayout() {
        return this.f5237d;
    }

    /* JADX INFO: renamed from: j */
    public final void m7932j(View view) {
        xmb0.a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m7933l(final e30<BaseBubbleItemView> e30Var, int i) {
        if (((AbsBubbleItemView) this).a == null) {
            return;
        }
        xdl0.M(this.f5239f, false);
        xdl0.M(this.f5248o, false);
        m7934m(i);
        xdl0.E0(this.f5237d, new View.OnClickListener() { // from class: l.wmb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25233a.m7929k(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m7934m(int i) {
        xdl0.M(this.f5243j, true);
        xdl0.M(this.f5242i, false);
        this.f5244k.setMaxLines(1);
        if (NullChecker.a(((AbsBubbleItemView) this).a.g)) {
            this.f5243j.setText(nn50.m20163b(((AbsBubbleItemView) this).a.g));
            this.f5244k.setText(nn50.m20162a(((AbsBubbleItemView) this).a.g.user));
            qib0.f19782G.m12749O(this.f5247n, ((AbsBubbleItemView) this).a.g.avatarUrl, 4, 8);
            xaj0<Integer, Integer, Integer> xaj0VarM14925a = eyb0.m14925a(i);
            this.f5238e.setBackgroundResource(((Integer) xaj0VarM14925a.b).intValue());
            vcl0.b(this.f5238e, t100.t);
            this.f5252s.setBackgroundColor(((Integer) xaj0VarM14925a.c).intValue());
            vcl0.b(this.f5252s, t100.h);
            this.f5246m.setBackgroundColor(((Integer) xaj0VarM14925a.c).intValue());
            vcl0.b(this.f5246m, t100.s);
            this.f5240g.setBackgroundColor(((Integer) xaj0VarM14925a.c).intValue());
            vcl0.b(this.f5240g, t100.r);
            xdl0.M(this.f5241h, true);
            xdl0.M(this.f5240g, true);
            VDraweeView vDraweeView = this.f5241h;
            int i2 = t100.f;
            vDraweeView.setPadding(i2, i2, i2, i2);
            this.f5241h.setImageResource(((Integer) xaj0VarM14925a.a).intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7932j(this);
    }

    public QCBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QCBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
