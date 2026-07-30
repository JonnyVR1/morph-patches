package com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.SquareDataWrapper;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p149l.e30;
import p149l.eyb0;
import p149l.nn50;
import p149l.qib0;
import p149l.t100;
import p149l.vcl0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xmb0;

/* JADX INFO: loaded from: classes9.dex */
public class QCBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f35456d;

    /* JADX INFO: renamed from: e */
    public VRelative f35457e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f35458f;

    /* JADX INFO: renamed from: g */
    public VLinear f35459g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f35460h;

    /* JADX INFO: renamed from: i */
    public TextView f35461i;

    /* JADX INFO: renamed from: j */
    public TextView f35462j;

    /* JADX INFO: renamed from: k */
    public TextView f35463k;

    /* JADX INFO: renamed from: l */
    public Space f35464l;

    /* JADX INFO: renamed from: m */
    public View f35465m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f35466n;

    /* JADX INFO: renamed from: o */
    public VFrame f35467o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f35468p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f35469q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f35470r;

    /* JADX INFO: renamed from: s */
    public View f35471s;

    public QCBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m54582k(e30 e30Var, View view) {
        if (this.f35456d.getScaleY() >= 0.5f && NullChecker.m81303a(e30Var)) {
            e30Var.call(this);
        }
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f35459g.setAlpha(f.floatValue());
        this.f35462j.setAlpha(f.floatValue());
        this.f35463k.setAlpha(f.floatValue());
        this.f35466n.setAlpha(f.floatValue());
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: c */
    public void mo54563c(boolean z) {
        if (m54554h(this.f35461i)) {
            xdl0.m208345M0(this.f35461i, z);
        }
        xdl0.m208345M0(this.f35464l, z);
        xdl0.m208345M0(this.f35465m, z);
        xdl0.m208345M0(this.f35466n, z);
        if (m54554h(this.f35459g)) {
            xdl0.m208345M0(this.f35459g, z);
        }
        if (m54554h(this.f35460h)) {
            xdl0.m208345M0(this.f35460h, z);
        }
        if (m54554h(this.f35463k)) {
            xdl0.m208345M0(this.f35463k, z);
        }
        if (m54554h(this.f35462j)) {
            xdl0.m208345M0(this.f35462j, z);
        }
        xdl0.m208345M0(this.f35471s, z);
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: e */
    public void mo54564e(float f) {
        ConstraintLayout constraintLayout = this.f35456d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f35456d.setPivotY(0.0f);
        this.f35456d.setScaleX(f);
        this.f35456d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = t100.f167237L;
        vcl0.m197906b(this.f35457e, i - ((int) ((i - t100.f167271t) * f)));
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    public View getAnimLayout() {
        return this.f35456d;
    }

    /* JADX INFO: renamed from: j */
    public final void m54583j(View view) {
        xmb0.m210119a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m54584l(final e30<BaseBubbleItemView> e30Var, int i) {
        if (this.f54738a == 0) {
            return;
        }
        xdl0.m208344M(this.f35458f, false);
        xdl0.m208344M(this.f35467o, false);
        m54585m(i);
        xdl0.m208329E0(this.f35456d, new View.OnClickListener() { // from class: l.wmb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187059a.m54582k(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m54585m(int i) {
        xdl0.m208344M(this.f35462j, true);
        xdl0.m208344M(this.f35461i, false);
        this.f35463k.setMaxLines(1);
        if (NullChecker.m81303a(((SquareDataWrapper) this.f54738a).f32662g)) {
            this.f35462j.setText(nn50.m160193b(((SquareDataWrapper) this.f54738a).f32662g));
            this.f35463k.setText(nn50.m160192a(((SquareDataWrapper) this.f54738a).f32662g.user));
            qib0.f154691G.m102336O(this.f35466n, ((SquareDataWrapper) this.f54738a).f32662g.avatarUrl, 4, 8);
            xaj0<Integer, Integer, Integer> xaj0VarM118750a = eyb0.m118750a(i);
            this.f35457e.setBackgroundResource(xaj0VarM118750a.f191752b.intValue());
            vcl0.m197906b(this.f35457e, t100.f167271t);
            this.f35471s.setBackgroundColor(xaj0VarM118750a.f191753c.intValue());
            vcl0.m197906b(this.f35471s, t100.f167259h);
            this.f35465m.setBackgroundColor(xaj0VarM118750a.f191753c.intValue());
            vcl0.m197906b(this.f35465m, t100.f167270s);
            this.f35459g.setBackgroundColor(xaj0VarM118750a.f191753c.intValue());
            vcl0.m197906b(this.f35459g, t100.f167269r);
            xdl0.m208344M(this.f35460h, true);
            xdl0.m208344M(this.f35459g, true);
            VDraweeView vDraweeView = this.f35460h;
            int i2 = t100.f167257f;
            vDraweeView.setPadding(i2, i2, i2, i2);
            this.f35460h.setImageResource(xaj0VarM118750a.f191751a.intValue());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54583j(this);
    }

    public QCBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QCBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
