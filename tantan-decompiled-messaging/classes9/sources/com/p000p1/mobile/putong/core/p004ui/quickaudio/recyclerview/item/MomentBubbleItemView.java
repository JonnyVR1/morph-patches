package com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p1.mobile.putong.ui.square.AbsBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.d900;
import l.e30;
import l.gf3;
import l.t100;
import l.vbe;
import l.vcl0;
import l.vwb;
import l.xdl0;
import p006l.bkb0;
import p006l.qib0;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MomentBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f5221d;

    /* JADX INFO: renamed from: e */
    public VRelative f5222e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f5223f;

    /* JADX INFO: renamed from: g */
    public VLinear f5224g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f5225h;

    /* JADX INFO: renamed from: i */
    public TextView f5226i;

    /* JADX INFO: renamed from: j */
    public TextView f5227j;

    /* JADX INFO: renamed from: k */
    public TextView f5228k;

    /* JADX INFO: renamed from: l */
    public Space f5229l;

    /* JADX INFO: renamed from: m */
    public View f5230m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f5231n;

    /* JADX INFO: renamed from: o */
    public VFrame f5232o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f5233p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f5234q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f5235r;

    /* JADX INFO: renamed from: s */
    public View f5236s;

    public MomentBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m7922k(e30 e30Var, View view) {
        if (this.f5221d.getScaleY() >= 0.5f && NullChecker.a(e30Var)) {
            e30Var.call(this);
        }
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f5224g.setAlpha(f.floatValue());
        this.f5227j.setAlpha(f.floatValue());
        this.f5228k.setAlpha(f.floatValue());
        this.f5231n.setAlpha(f.floatValue());
    }

    /* JADX INFO: renamed from: c */
    public void m7923c(boolean z) {
        if (m7897h(this.f5226i)) {
            xdl0.M0(this.f5226i, z);
        }
        xdl0.M0(this.f5229l, z);
        xdl0.M0(this.f5230m, z);
        xdl0.M0(this.f5231n, z);
        if (m7897h(this.f5224g)) {
            xdl0.M0(this.f5224g, z);
        }
        if (m7897h(this.f5225h)) {
            xdl0.M0(this.f5225h, z);
        }
        if (m7897h(this.f5228k)) {
            xdl0.M0(this.f5228k, z);
        }
        if (m7897h(this.f5227j)) {
            xdl0.M0(this.f5227j, z);
        }
        xdl0.M0(this.f5236s, z);
    }

    /* JADX INFO: renamed from: e */
    public void m7924e(float f) {
        ConstraintLayout constraintLayout = this.f5221d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f5221d.setPivotY(0.0f);
        this.f5221d.setScaleX(f);
        this.f5221d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = t100.L;
        vcl0.b(this.f5222e, i - ((int) ((i - t100.t) * f)));
    }

    public View getAnimLayout() {
        return this.f5221d;
    }

    /* JADX INFO: renamed from: j */
    public final void m7925j(View view) {
        d900.a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m7926l(String str, final e30<BaseBubbleItemView> e30Var) {
        if (((AbsBubbleItemView) this).a == null) {
            return;
        }
        xdl0.M(this.f5223f, false);
        xdl0.M(this.f5232o, false);
        m7927m(str);
        xdl0.E0(this.f5221d, new View.OnClickListener() { // from class: l.c900
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9496a.m7922k(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m7927m(String str) {
        if (NullChecker.a(((gf3) ((AbsBubbleItemView) this).a).a)) {
            if (NullChecker.b(((gf3) ((AbsBubbleItemView) this).a).a.textTheme)) {
                if (vwb.J(((gf3) ((AbsBubbleItemView) this).a).a.textTheme.backgroundColor) || vwb.J(((gf3) ((AbsBubbleItemView) this).a).a.textTheme.iconColor)) {
                    CrashHelper.i(new Exception("bubbleInfo backgroundColor isEmpty"), "core_onlinematch", CrashHelper.ReportLevel.p5, 100);
                } else {
                    String str2 = (String) ((gf3) ((AbsBubbleItemView) this).a).a.textTheme.backgroundColor.get(0);
                    String str3 = (String) ((gf3) ((AbsBubbleItemView) this).a).a.textTheme.iconColor.get(0);
                    boolean zEquals = TextUtils.equals(str, "p_state_explore");
                    VRelative vRelative = this.f5222e;
                    if (zEquals) {
                        vRelative.setBackgroundDrawable(vbe.a(((gf3) ((AbsBubbleItemView) this).a).a.textTheme.backgroundColor));
                        xdl0.M(this.f5227j, false);
                        this.f5228k.setMaxLines(2);
                    } else {
                        vRelative.setBackgroundColor(Color.parseColor(str2));
                        vcl0.b(this.f5222e, t100.t);
                    }
                    this.f5224g.setBackgroundColor(Color.parseColor(str3));
                    vcl0.b(this.f5224g, t100.r);
                    this.f5236s.setBackgroundColor(Color.parseColor(str2));
                    vcl0.b(this.f5236s, t100.h);
                    this.f5230m.setBackgroundColor(Color.parseColor(str2));
                    vcl0.b(this.f5230m, t100.s);
                }
            }
            if (NullChecker.b(((gf3) ((AbsBubbleItemView) this).a).a.emotion)) {
                boolean zIsEmpty = TextUtils.isEmpty(((gf3) ((AbsBubbleItemView) this).a).a.emotion.emojiUrl);
                VDraweeView vDraweeView = this.f5225h;
                if (zIsEmpty) {
                    xdl0.M(vDraweeView, false);
                } else {
                    xdl0.M(vDraweeView, true);
                    bkb0 bkb0Var = qib0.f19782G;
                    VDraweeView vDraweeView2 = this.f5225h;
                    String str4 = ((gf3) ((AbsBubbleItemView) this).a).a.emotion.emojiUrl;
                    int i = t100.y;
                    bkb0Var.m12738I0(vDraweeView2, str4, i, i);
                }
                boolean zIsEmpty2 = TextUtils.isEmpty(((gf3) ((AbsBubbleItemView) this).a).a.emotion.text);
                TextView textView = this.f5226i;
                if (zIsEmpty2) {
                    xdl0.M(textView, false);
                } else {
                    textView.setText(((gf3) ((AbsBubbleItemView) this).a).a.emotion.text);
                    xdl0.M(this.f5226i, true);
                }
                xdl0.M(this.f5224g, (TextUtils.isEmpty(((gf3) ((AbsBubbleItemView) this).a).a.emotion.emojiUrl) && TextUtils.isEmpty(((gf3) ((AbsBubbleItemView) this).a).a.emotion.text)) ? false : true);
            } else {
                xdl0.M(this.f5225h, false);
                xdl0.M(this.f5226i, false);
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(((gf3) ((AbsBubbleItemView) this).a).a.value);
            TextView textView2 = this.f5228k;
            if (zIsEmpty3) {
                xdl0.M(textView2, false);
            } else {
                textView2.setText(((gf3) ((AbsBubbleItemView) this).a).a.value);
                xdl0.M(this.f5228k, true);
            }
            if (TextUtils.equals(str, "p_state_explore")) {
                this.f5228k.setTextColor(Color.parseColor("#000000"));
                this.f5226i.setTextColor(Color.parseColor("#000000"));
            }
            if (!TextUtils.isEmpty(((AbsBubbleItemView) this).a.f.photoURL)) {
                if (((AbsBubbleItemView) this).a.f.userID.equals(CoreModule.m1850H().userId())) {
                    bkb0 bkb0Var2 = qib0.f19782G;
                    VDraweeView vDraweeView3 = this.f5231n;
                    String str5 = ((AbsBubbleItemView) this).a.f.photoURL;
                    int i2 = t100.s;
                    bkb0Var2.m12738I0(vDraweeView3, str5, i2, i2);
                } else if (TextUtils.equals(str, "p_state_explore")) {
                    bkb0 bkb0Var3 = qib0.f19782G;
                    VDraweeView vDraweeView4 = this.f5231n;
                    String str6 = ((AbsBubbleItemView) this).a.f.photoURL;
                    int i3 = t100.s;
                    bkb0Var3.m12738I0(vDraweeView4, str6, i3, i3);
                } else {
                    qib0.f19782G.m12749O(this.f5231n, ((AbsBubbleItemView) this).a.f.photoURL, 4, 8);
                }
            }
            xdl0.M(this.f5232o, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7925j(this);
    }

    public MomentBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
