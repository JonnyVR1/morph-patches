package com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.SquareDataWrapper;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p153l.bnl0;
import p153l.fsb0;
import p153l.jyb;
import p153l.mh00;
import p153l.qa00;
import p153l.uqb0;
import p153l.y20;
import p153l.zce;
import p153l.zll0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f36288d;

    /* JADX INFO: renamed from: e */
    public VRelative f36289e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f36290f;

    /* JADX INFO: renamed from: g */
    public VLinear f36291g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f36292h;

    /* JADX INFO: renamed from: i */
    public TextView f36293i;

    /* JADX INFO: renamed from: j */
    public TextView f36294j;

    /* JADX INFO: renamed from: k */
    public TextView f36295k;

    /* JADX INFO: renamed from: l */
    public Space f36296l;

    /* JADX INFO: renamed from: m */
    public View f36297m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f36298n;

    /* JADX INFO: renamed from: o */
    public VFrame f36299o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f36300p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f36301q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f36302r;

    /* JADX INFO: renamed from: s */
    public View f36303s;

    public MomentBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m55760k(y20 y20Var, View view) {
        if (this.f36288d.getScaleY() >= 0.5f && NullChecker.m82486a(y20Var)) {
            y20Var.call(this);
        }
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f36291g.setAlpha(f.floatValue());
        this.f36294j.setAlpha(f.floatValue());
        this.f36295k.setAlpha(f.floatValue());
        this.f36298n.setAlpha(f.floatValue());
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: c */
    public void mo55746c(boolean z) {
        if (m55737h(this.f36293i)) {
            bnl0.m105525M0(this.f36293i, z);
        }
        bnl0.m105525M0(this.f36296l, z);
        bnl0.m105525M0(this.f36297m, z);
        bnl0.m105525M0(this.f36298n, z);
        if (m55737h(this.f36291g)) {
            bnl0.m105525M0(this.f36291g, z);
        }
        if (m55737h(this.f36292h)) {
            bnl0.m105525M0(this.f36292h, z);
        }
        if (m55737h(this.f36295k)) {
            bnl0.m105525M0(this.f36295k, z);
        }
        if (m55737h(this.f36294j)) {
            bnl0.m105525M0(this.f36294j, z);
        }
        bnl0.m105525M0(this.f36303s, z);
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: e */
    public void mo55747e(float f) {
        ConstraintLayout constraintLayout = this.f36288d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f36288d.setPivotY(0.0f);
        this.f36288d.setScaleX(f);
        this.f36288d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = qa00.f156299L;
        zll0.m220293b(this.f36289e, i - ((int) ((i - qa00.f156333t) * f)));
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    public View getAnimLayout() {
        return this.f36288d;
    }

    /* JADX INFO: renamed from: j */
    public final void m55761j(View view) {
        mh00.m158397a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m55762l(String str, final y20<BaseBubbleItemView> y20Var) {
        if (this.f55586a == 0) {
            return;
        }
        bnl0.m105524M(this.f36290f, false);
        bnl0.m105524M(this.f36299o, false);
        m55763m(str);
        bnl0.m105509E0(this.f36288d, new View.OnClickListener() { // from class: l.lh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132061a.m55760k(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m55763m(String str) {
        if (NullChecker.m82486a(((SquareDataWrapper) this.f55586a).f178729a)) {
            if (NullChecker.m82487b(((SquareDataWrapper) this.f55586a).f178729a.textTheme)) {
                if (jyb.m147479J(((SquareDataWrapper) this.f55586a).f178729a.textTheme.backgroundColor) || jyb.m147479J(((SquareDataWrapper) this.f55586a).f178729a.textTheme.iconColor)) {
                    CrashHelper.m82485i(new Exception("bubbleInfo backgroundColor isEmpty"), "core_onlinematch", CrashHelper.ReportLevel.p5, 100);
                } else {
                    String str2 = ((SquareDataWrapper) this.f55586a).f178729a.textTheme.backgroundColor.get(0);
                    String str3 = ((SquareDataWrapper) this.f55586a).f178729a.textTheme.iconColor.get(0);
                    boolean zEquals = TextUtils.equals(str, "p_state_explore");
                    VRelative vRelative = this.f36289e;
                    if (zEquals) {
                        vRelative.setBackgroundDrawable(zce.m219236a(((SquareDataWrapper) this.f55586a).f178729a.textTheme.backgroundColor));
                        bnl0.m105524M(this.f36294j, false);
                        this.f36295k.setMaxLines(2);
                    } else {
                        vRelative.setBackgroundColor(Color.parseColor(str2));
                        zll0.m220293b(this.f36289e, qa00.f156333t);
                    }
                    this.f36291g.setBackgroundColor(Color.parseColor(str3));
                    zll0.m220293b(this.f36291g, qa00.f156331r);
                    this.f36303s.setBackgroundColor(Color.parseColor(str2));
                    zll0.m220293b(this.f36303s, qa00.f156321h);
                    this.f36297m.setBackgroundColor(Color.parseColor(str2));
                    zll0.m220293b(this.f36297m, qa00.f156332s);
                }
            }
            if (NullChecker.m82487b(((SquareDataWrapper) this.f55586a).f178729a.emotion)) {
                boolean zIsEmpty = TextUtils.isEmpty(((SquareDataWrapper) this.f55586a).f178729a.emotion.emojiUrl);
                VDraweeView vDraweeView = this.f36292h;
                if (zIsEmpty) {
                    bnl0.m105524M(vDraweeView, false);
                } else {
                    bnl0.m105524M(vDraweeView, true);
                    fsb0 fsb0Var = uqb0.f180374G;
                    VDraweeView vDraweeView2 = this.f36292h;
                    String str4 = ((SquareDataWrapper) this.f55586a).f178729a.emotion.emojiUrl;
                    int i = qa00.f156338y;
                    fsb0Var.m127109I0(vDraweeView2, str4, i, i);
                }
                boolean zIsEmpty2 = TextUtils.isEmpty(((SquareDataWrapper) this.f55586a).f178729a.emotion.text);
                TextView textView = this.f36293i;
                if (zIsEmpty2) {
                    bnl0.m105524M(textView, false);
                } else {
                    textView.setText(((SquareDataWrapper) this.f55586a).f178729a.emotion.text);
                    bnl0.m105524M(this.f36293i, true);
                }
                bnl0.m105524M(this.f36291g, (TextUtils.isEmpty(((SquareDataWrapper) this.f55586a).f178729a.emotion.emojiUrl) && TextUtils.isEmpty(((SquareDataWrapper) this.f55586a).f178729a.emotion.text)) ? false : true);
            } else {
                bnl0.m105524M(this.f36292h, false);
                bnl0.m105524M(this.f36293i, false);
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(((SquareDataWrapper) this.f55586a).f178729a.value);
            TextView textView2 = this.f36295k;
            if (zIsEmpty3) {
                bnl0.m105524M(textView2, false);
            } else {
                textView2.setText(((SquareDataWrapper) this.f55586a).f178729a.value);
                bnl0.m105524M(this.f36295k, true);
            }
            if (TextUtils.equals(str, "p_state_explore")) {
                this.f36295k.setTextColor(Color.parseColor(Constants.BLACK));
                this.f36293i.setTextColor(Color.parseColor(Constants.BLACK));
            }
            if (!TextUtils.isEmpty(((SquareDataWrapper) this.f55586a).f33509f.photoURL)) {
                if (((SquareDataWrapper) this.f55586a).f33509f.userID.equals(CoreModule.m30929H().userId())) {
                    fsb0 fsb0Var2 = uqb0.f180374G;
                    VDraweeView vDraweeView3 = this.f36298n;
                    String str5 = ((SquareDataWrapper) this.f55586a).f33509f.photoURL;
                    int i2 = qa00.f156332s;
                    fsb0Var2.m127109I0(vDraweeView3, str5, i2, i2);
                } else if (TextUtils.equals(str, "p_state_explore")) {
                    fsb0 fsb0Var3 = uqb0.f180374G;
                    VDraweeView vDraweeView4 = this.f36298n;
                    String str6 = ((SquareDataWrapper) this.f55586a).f33509f.photoURL;
                    int i3 = qa00.f156332s;
                    fsb0Var3.m127109I0(vDraweeView4, str6, i3, i3);
                } else {
                    uqb0.f180374G.m127120O(this.f36298n, ((SquareDataWrapper) this.f55586a).f33509f.photoURL, 4, 8);
                }
            }
            bnl0.m105524M(this.f36299o, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55761j(this);
    }

    public MomentBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
