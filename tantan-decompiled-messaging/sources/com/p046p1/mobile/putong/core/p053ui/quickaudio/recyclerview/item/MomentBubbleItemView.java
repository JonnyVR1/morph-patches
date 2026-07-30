package com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.SquareDataWrapper;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p149l.bkb0;
import p149l.d900;
import p149l.e30;
import p149l.qib0;
import p149l.t100;
import p149l.vbe;
import p149l.vcl0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class MomentBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f35440d;

    /* JADX INFO: renamed from: e */
    public VRelative f35441e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f35442f;

    /* JADX INFO: renamed from: g */
    public VLinear f35443g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f35444h;

    /* JADX INFO: renamed from: i */
    public TextView f35445i;

    /* JADX INFO: renamed from: j */
    public TextView f35446j;

    /* JADX INFO: renamed from: k */
    public TextView f35447k;

    /* JADX INFO: renamed from: l */
    public Space f35448l;

    /* JADX INFO: renamed from: m */
    public View f35449m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f35450n;

    /* JADX INFO: renamed from: o */
    public VFrame f35451o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f35452p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f35453q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f35454r;

    /* JADX INFO: renamed from: s */
    public View f35455s;

    public MomentBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m54577k(e30 e30Var, View view) {
        if (this.f35440d.getScaleY() >= 0.5f && NullChecker.m81303a(e30Var)) {
            e30Var.call(this);
        }
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f35443g.setAlpha(f.floatValue());
        this.f35446j.setAlpha(f.floatValue());
        this.f35447k.setAlpha(f.floatValue());
        this.f35450n.setAlpha(f.floatValue());
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: c */
    public void mo54563c(boolean z) {
        if (m54554h(this.f35445i)) {
            xdl0.m208345M0(this.f35445i, z);
        }
        xdl0.m208345M0(this.f35448l, z);
        xdl0.m208345M0(this.f35449m, z);
        xdl0.m208345M0(this.f35450n, z);
        if (m54554h(this.f35443g)) {
            xdl0.m208345M0(this.f35443g, z);
        }
        if (m54554h(this.f35444h)) {
            xdl0.m208345M0(this.f35444h, z);
        }
        if (m54554h(this.f35447k)) {
            xdl0.m208345M0(this.f35447k, z);
        }
        if (m54554h(this.f35446j)) {
            xdl0.m208345M0(this.f35446j, z);
        }
        xdl0.m208345M0(this.f35455s, z);
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: e */
    public void mo54564e(float f) {
        ConstraintLayout constraintLayout = this.f35440d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f35440d.setPivotY(0.0f);
        this.f35440d.setScaleX(f);
        this.f35440d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = t100.f167237L;
        vcl0.m197906b(this.f35441e, i - ((int) ((i - t100.f167271t) * f)));
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    public View getAnimLayout() {
        return this.f35440d;
    }

    /* JADX INFO: renamed from: j */
    public final void m54578j(View view) {
        d900.m110410a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m54579l(String str, final e30<BaseBubbleItemView> e30Var) {
        if (this.f54738a == 0) {
            return;
        }
        xdl0.m208344M(this.f35442f, false);
        xdl0.m208344M(this.f35451o, false);
        m54580m(str);
        xdl0.m208329E0(this.f35440d, new View.OnClickListener() { // from class: l.c900
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79848a.m54577k(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m54580m(String str) {
        if (NullChecker.m81303a(((SquareDataWrapper) this.f54738a).f102323a)) {
            if (NullChecker.m81304b(((SquareDataWrapper) this.f54738a).f102323a.textTheme)) {
                if (vwb.m200296J(((SquareDataWrapper) this.f54738a).f102323a.textTheme.backgroundColor) || vwb.m200296J(((SquareDataWrapper) this.f54738a).f102323a.textTheme.iconColor)) {
                    CrashHelper.m81302i(new Exception("bubbleInfo backgroundColor isEmpty"), "core_onlinematch", CrashHelper.ReportLevel.p5, 100);
                } else {
                    String str2 = ((SquareDataWrapper) this.f54738a).f102323a.textTheme.backgroundColor.get(0);
                    String str3 = ((SquareDataWrapper) this.f54738a).f102323a.textTheme.iconColor.get(0);
                    boolean zEquals = TextUtils.equals(str, "p_state_explore");
                    VRelative vRelative = this.f35441e;
                    if (zEquals) {
                        vRelative.setBackgroundDrawable(vbe.m197707a(((SquareDataWrapper) this.f54738a).f102323a.textTheme.backgroundColor));
                        xdl0.m208344M(this.f35446j, false);
                        this.f35447k.setMaxLines(2);
                    } else {
                        vRelative.setBackgroundColor(Color.parseColor(str2));
                        vcl0.m197906b(this.f35441e, t100.f167271t);
                    }
                    this.f35443g.setBackgroundColor(Color.parseColor(str3));
                    vcl0.m197906b(this.f35443g, t100.f167269r);
                    this.f35455s.setBackgroundColor(Color.parseColor(str2));
                    vcl0.m197906b(this.f35455s, t100.f167259h);
                    this.f35449m.setBackgroundColor(Color.parseColor(str2));
                    vcl0.m197906b(this.f35449m, t100.f167270s);
                }
            }
            if (NullChecker.m81304b(((SquareDataWrapper) this.f54738a).f102323a.emotion)) {
                boolean zIsEmpty = TextUtils.isEmpty(((SquareDataWrapper) this.f54738a).f102323a.emotion.emojiUrl);
                VDraweeView vDraweeView = this.f35444h;
                if (zIsEmpty) {
                    xdl0.m208344M(vDraweeView, false);
                } else {
                    xdl0.m208344M(vDraweeView, true);
                    bkb0 bkb0Var = qib0.f154691G;
                    VDraweeView vDraweeView2 = this.f35444h;
                    String str4 = ((SquareDataWrapper) this.f54738a).f102323a.emotion.emojiUrl;
                    int i = t100.f167276y;
                    bkb0Var.m102325I0(vDraweeView2, str4, i, i);
                }
                boolean zIsEmpty2 = TextUtils.isEmpty(((SquareDataWrapper) this.f54738a).f102323a.emotion.text);
                TextView textView = this.f35445i;
                if (zIsEmpty2) {
                    xdl0.m208344M(textView, false);
                } else {
                    textView.setText(((SquareDataWrapper) this.f54738a).f102323a.emotion.text);
                    xdl0.m208344M(this.f35445i, true);
                }
                xdl0.m208344M(this.f35443g, (TextUtils.isEmpty(((SquareDataWrapper) this.f54738a).f102323a.emotion.emojiUrl) && TextUtils.isEmpty(((SquareDataWrapper) this.f54738a).f102323a.emotion.text)) ? false : true);
            } else {
                xdl0.m208344M(this.f35444h, false);
                xdl0.m208344M(this.f35445i, false);
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(((SquareDataWrapper) this.f54738a).f102323a.value);
            TextView textView2 = this.f35447k;
            if (zIsEmpty3) {
                xdl0.m208344M(textView2, false);
            } else {
                textView2.setText(((SquareDataWrapper) this.f54738a).f102323a.value);
                xdl0.m208344M(this.f35447k, true);
            }
            if (TextUtils.equals(str, "p_state_explore")) {
                this.f35447k.setTextColor(Color.parseColor(Constants.BLACK));
                this.f35445i.setTextColor(Color.parseColor(Constants.BLACK));
            }
            if (!TextUtils.isEmpty(((SquareDataWrapper) this.f54738a).f32661f.photoURL)) {
                if (((SquareDataWrapper) this.f54738a).f32661f.userID.equals(CoreModule.m29931H().userId())) {
                    bkb0 bkb0Var2 = qib0.f154691G;
                    VDraweeView vDraweeView3 = this.f35450n;
                    String str5 = ((SquareDataWrapper) this.f54738a).f32661f.photoURL;
                    int i2 = t100.f167270s;
                    bkb0Var2.m102325I0(vDraweeView3, str5, i2, i2);
                } else if (TextUtils.equals(str, "p_state_explore")) {
                    bkb0 bkb0Var3 = qib0.f154691G;
                    VDraweeView vDraweeView4 = this.f35450n;
                    String str6 = ((SquareDataWrapper) this.f54738a).f32661f.photoURL;
                    int i3 = t100.f167270s;
                    bkb0Var3.m102325I0(vDraweeView4, str6, i3, i3);
                } else {
                    qib0.f154691G.m102336O(this.f35450n, ((SquareDataWrapper) this.f54738a).f32661f.photoURL, 4, 8);
                }
            }
            xdl0.m208344M(this.f35451o, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54578j(this);
    }

    public MomentBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
