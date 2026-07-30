package com.p051p1.mobile.putong.core.p058ui.result;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PrivilegeDetail;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gt0;
import p153l.i4g0;
import p153l.jbc0;
import p153l.jyb;
import p153l.qa00;
import p153l.sgb0;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class PurchaseReceivingAnimView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PurchaseReceivingAnimView f36439a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f36440b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f36441c;

    /* JADX INFO: renamed from: d */
    public TextView f36442d;

    /* JADX INFO: renamed from: e */
    public TextView f36443e;

    /* JADX INFO: renamed from: f */
    public ImageView f36444f;

    /* JADX INFO: renamed from: g */
    public final LinearInterpolator f36445g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f36446h;

    /* JADX INFO: renamed from: i */
    public Animator f36447i;

    /* JADX INFO: renamed from: j */
    public Animator f36448j;

    /* JADX INFO: renamed from: k */
    public x20 f36449k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.PurchaseReceivingAnimView$a */
    public class C8995a extends gt0.C17308j {
        public C8995a() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            PurchaseReceivingAnimView.this.f36448j = null;
            PurchaseReceivingAnimView.this.f36449k.call();
        }
    }

    public PurchaseReceivingAnimView(@NonNull Context context) {
        super(context);
        this.f36445g = new LinearInterpolator();
    }

    /* JADX INFO: renamed from: d */
    public final void m55909d(View view) {
        sgb0.m185767a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m55910e() {
        Animator animator = this.f36447i;
        if (animator != null) {
            animator.cancel();
            this.f36447i = null;
        }
        ObjectAnimator objectAnimator = this.f36446h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f36446h = null;
        }
        Animator animator2 = this.f36448j;
        if (animator2 != null) {
            animator2.cancel();
            this.f36448j = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m55911f(String str, View view) {
        i4g0.m138523u("e_pay_gift_get", "p_pay_result", jyb.m147494Y("pageproducttype", str));
        m55914i();
    }

    /* JADX INFO: renamed from: g */
    public void m55912g(ProductCategory productCategory, PrivilegeDetail privilegeDetail) {
        String string;
        int color;
        final String str;
        String string2 = CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? CoreModule.f18263b.getString(R$string.f28081N) : CoreModule.f18263b.getString(R$string.f28092O);
        if (TEnum.equals(productCategory, "boost")) {
            this.f36444f.setImageDrawable(getResources().getDrawable(jbc0.f119826x7));
            uqb0.f180374G.m127109I0(this.f36441c, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjNSS0NZTUhNTFBZMzJYSTJSQldXUjdENVdGRERGUTE0IiwidyI6NzA1LCJoIjo3MDUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjQwMTQ3NDExMTIyOTQ1Nn0.webp", qa00.m175859d(234.0f), qa00.m175859d(234.0f));
            string = CoreModule.f18263b.getString(R$string.f28321i0);
            string2 = string2 + SignParameters.NEW_LINE + CoreModule.f18263b.getString(R$string.f28158U);
            color = Color.parseColor("#f258d8");
            str = "see";
        } else if (TEnum.equals(productCategory, "superLike")) {
            this.f36444f.setImageDrawable(getResources().getDrawable(jbc0.f119854z7));
            uqb0.f180374G.m127109I0(this.f36441c, "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc2NUVPQlNPRlFUNjZEQzdZUVRXNTY0VFpRMkMyTDE0IiwidyI6NzA1LCJoIjo3MDUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjQwMTYxMTU0OTEzNDM1Mn0.webp", qa00.m175859d(234.0f), qa00.m175859d(234.0f));
            string = CoreModule.f18263b.getString(R$string.f28333j0);
            string2 = string2 + SignParameters.NEW_LINE + CoreModule.f18263b.getString(R$string.f28147T);
            color = Color.parseColor("#3cc8fd");
            str = "vip";
        } else if (TEnum.equals(productCategory, "quickchatNumber")) {
            this.f36444f.setImageDrawable(getResources().getDrawable(jbc0.f119840y7));
            uqb0.f180374G.m127109I0(this.f36441c, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IllRS1pTU05XR09ENElYQldFNVNHWlpIVEE0RFFGMzE0IiwidyI6NzA1LCJoIjo3MDUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDE0OTY3NDI5NzU0NDIwOH0.webp", qa00.m175859d(234.0f), qa00.m175859d(234.0f));
            string = CoreModule.f18263b.getString(R$string.f28225a0);
            string2 = string2 + SignParameters.NEW_LINE + CoreModule.f18263b.getString(R$string.f28136S);
            color = Color.parseColor("#ff846b");
            str = "quickchat";
        } else {
            string = "";
            color = 0;
            str = "";
        }
        String str2 = String.format(string2, Long.valueOf(privilegeDetail.count));
        int iIndexOf = str2.indexOf(string);
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ForegroundColorSpan(color), iIndexOf, string.length() + iIndexOf, 33);
        this.f36442d.setText(spannableString);
        bnl0.m105509E0(this.f36443e, new View.OnClickListener() { // from class: l.rgb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162989a.m55911f(str, view);
            }
        });
        i4g0.m138492A("e_pay_gift_get", "p_pay_result", jyb.m147494Y("pageproducttype", str));
    }

    /* JADX INFO: renamed from: h */
    public void m55913h() {
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(this.f36440b, "alpha", 0L, 300L, this.f36445g, 0.0f, 1.0f), gt0.m132170p(this.f36444f, "alpha", 0L, 300L, this.f36445g, 0.0f, 1.0f), gt0.m132166l(this.f36440b, gt0.f106354i, 0L, 300L, this.f36445g, 0.3f, 1.0f), gt0.m132166l(this.f36444f, gt0.f106354i, 0L, 300L, this.f36445g, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f36441c, BLiveGiftItem.TYPE_ROTATION, 0.0f, 360.0f);
        this.f36446h = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(3000L);
        this.f36446h.setInterpolator(this.f36445g);
        this.f36446h.setRepeatCount(-1);
        Animator animatorM132180z2 = gt0.m132180z(animatorM132180z, this.f36446h);
        this.f36447i = animatorM132180z2;
        animatorM132180z2.start();
    }

    /* JADX INFO: renamed from: i */
    public void m55914i() {
        m55910e();
        float bottom = this.f36444f.getBottom();
        float fM105588w0 = bnl0.m105588w0();
        FrameLayout frameLayout = this.f36440b;
        Animator animatorM132170p = gt0.m132170p(frameLayout, "alpha", 0L, 300L, this.f36445g, frameLayout.getAlpha(), 0.0f);
        Animator animatorM132170p2 = gt0.m132170p(this.f36444f, "translationY", 0L, 400L, this.f36445g, fM105588w0 - bottom);
        ImageView imageView = this.f36444f;
        Animator animatorM132170p3 = gt0.m132170p(imageView, "alpha", 0L, 400L, this.f36445g, imageView.getAlpha(), 0.1f);
        ImageView imageView2 = this.f36444f;
        Animator animatorM132180z = gt0.m132180z(animatorM132170p, animatorM132170p2, animatorM132170p3, gt0.m132166l(imageView2, gt0.f106354i, 0L, 400L, this.f36445g, imageView2.getScaleX(), 0.3f));
        this.f36448j = animatorM132180z;
        if (this.f36449k != null) {
            animatorM132180z.addListener(new C8995a());
        }
        this.f36448j.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m55910e();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55909d(this);
        this.f36439a.setClickable(true);
        this.f36443e.setText(R$string.f28059L);
    }

    public void setExitAction(x20 x20Var) {
        this.f36449k = x20Var;
    }

    public PurchaseReceivingAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36445g = new LinearInterpolator();
    }

    public PurchaseReceivingAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36445g = new LinearInterpolator();
    }
}
