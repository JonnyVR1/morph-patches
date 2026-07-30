package com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.SquareDataWrapper;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p153l.bkj0;
import p153l.bnl0;
import p153l.bvb0;
import p153l.i6c0;
import p153l.qa00;
import p153l.tv50;
import p153l.uqb0;
import p153l.y20;
import p153l.zll0;

/* JADX INFO: loaded from: classes12.dex */
public class QCBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f36304d;

    /* JADX INFO: renamed from: e */
    public VRelative f36305e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f36306f;

    /* JADX INFO: renamed from: g */
    public VLinear f36307g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f36308h;

    /* JADX INFO: renamed from: i */
    public TextView f36309i;

    /* JADX INFO: renamed from: j */
    public TextView f36310j;

    /* JADX INFO: renamed from: k */
    public TextView f36311k;

    /* JADX INFO: renamed from: l */
    public Space f36312l;

    /* JADX INFO: renamed from: m */
    public View f36313m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f36314n;

    /* JADX INFO: renamed from: o */
    public VFrame f36315o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f36316p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f36317q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f36318r;

    /* JADX INFO: renamed from: s */
    public View f36319s;

    public QCBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m55765k(y20 y20Var, View view) {
        if (this.f36304d.getScaleY() >= 0.5f && NullChecker.m82486a(y20Var)) {
            y20Var.call(this);
        }
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f36307g.setAlpha(f.floatValue());
        this.f36310j.setAlpha(f.floatValue());
        this.f36311k.setAlpha(f.floatValue());
        this.f36314n.setAlpha(f.floatValue());
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: c */
    public void mo55746c(boolean z) {
        if (m55737h(this.f36309i)) {
            bnl0.m105525M0(this.f36309i, z);
        }
        bnl0.m105525M0(this.f36312l, z);
        bnl0.m105525M0(this.f36313m, z);
        bnl0.m105525M0(this.f36314n, z);
        if (m55737h(this.f36307g)) {
            bnl0.m105525M0(this.f36307g, z);
        }
        if (m55737h(this.f36308h)) {
            bnl0.m105525M0(this.f36308h, z);
        }
        if (m55737h(this.f36311k)) {
            bnl0.m105525M0(this.f36311k, z);
        }
        if (m55737h(this.f36310j)) {
            bnl0.m105525M0(this.f36310j, z);
        }
        bnl0.m105525M0(this.f36319s, z);
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: e */
    public void mo55747e(float f) {
        ConstraintLayout constraintLayout = this.f36304d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f36304d.setPivotY(0.0f);
        this.f36304d.setScaleX(f);
        this.f36304d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = qa00.f156299L;
        zll0.m220293b(this.f36305e, i - ((int) ((i - qa00.f156333t) * f)));
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    public View getAnimLayout() {
        return this.f36304d;
    }

    /* JADX INFO: renamed from: j */
    public final void m55766j(View view) {
        bvb0.m106558a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m55767l(final y20<BaseBubbleItemView> y20Var, int i) {
        if (this.f55586a == 0) {
            return;
        }
        bnl0.m105524M(this.f36306f, false);
        bnl0.m105524M(this.f36315o, false);
        m55768m(i);
        bnl0.m105509E0(this.f36304d, new View.OnClickListener() { // from class: l.avb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73603a.m55765k(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m55768m(int i) {
        bnl0.m105524M(this.f36310j, true);
        bnl0.m105524M(this.f36309i, false);
        this.f36311k.setMaxLines(1);
        if (NullChecker.m82486a(((SquareDataWrapper) this.f55586a).f33510g)) {
            this.f36310j.setText(tv50.m192775b(((SquareDataWrapper) this.f55586a).f33510g));
            this.f36311k.setText(tv50.m192774a(((SquareDataWrapper) this.f55586a).f33510g.user));
            uqb0.f180374G.m127120O(this.f36314n, ((SquareDataWrapper) this.f55586a).f33510g.avatarUrl, 4, 8);
            bkj0<Integer, Integer, Integer> bkj0VarM138802a = i6c0.m138802a(i);
            this.f36305e.setBackgroundResource(bkj0VarM138802a.f77082b.intValue());
            zll0.m220293b(this.f36305e, qa00.f156333t);
            this.f36319s.setBackgroundColor(bkj0VarM138802a.f77083c.intValue());
            zll0.m220293b(this.f36319s, qa00.f156321h);
            this.f36313m.setBackgroundColor(bkj0VarM138802a.f77083c.intValue());
            zll0.m220293b(this.f36313m, qa00.f156332s);
            this.f36307g.setBackgroundColor(bkj0VarM138802a.f77083c.intValue());
            zll0.m220293b(this.f36307g, qa00.f156331r);
            bnl0.m105524M(this.f36308h, true);
            bnl0.m105524M(this.f36307g, true);
            VDraweeView vDraweeView = this.f36308h;
            int i2 = qa00.f156319f;
            vDraweeView.setPadding(i2, i2, i2, i2);
            this.f36308h.setImageResource(bkj0VarM138802a.f77081a.intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55766j(this);
    }

    public QCBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QCBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
