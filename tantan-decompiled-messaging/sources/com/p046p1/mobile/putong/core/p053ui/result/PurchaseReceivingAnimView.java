package com.p046p1.mobile.putong.core.p053ui.result;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PrivilegeDetail;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.d30;
import p149l.d3c0;
import p149l.o8b0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class PurchaseReceivingAnimView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PurchaseReceivingAnimView f35591a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f35592b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f35593c;

    /* JADX INFO: renamed from: d */
    public TextView f35594d;

    /* JADX INFO: renamed from: e */
    public TextView f35595e;

    /* JADX INFO: renamed from: f */
    public ImageView f35596f;

    /* JADX INFO: renamed from: g */
    public final LinearInterpolator f35597g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f35598h;

    /* JADX INFO: renamed from: i */
    public Animator f35599i;

    /* JADX INFO: renamed from: j */
    public Animator f35600j;

    /* JADX INFO: renamed from: k */
    public d30 f35601k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.PurchaseReceivingAnimView$a */
    public class C8832a extends bt0.C15966j {
        public C8832a() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            PurchaseReceivingAnimView.this.f35600j = null;
            PurchaseReceivingAnimView.this.f35601k.call();
        }
    }

    public PurchaseReceivingAnimView(@NonNull Context context) {
        super(context);
        this.f35597g = new LinearInterpolator();
    }

    /* JADX INFO: renamed from: d */
    public final void m54726d(View view) {
        o8b0.m163110a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m54727e() {
        Animator animator = this.f35599i;
        if (animator != null) {
            animator.cancel();
            this.f35599i = null;
        }
        ObjectAnimator objectAnimator = this.f35598h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f35598h = null;
        }
        Animator animator2 = this.f35600j;
        if (animator2 != null) {
            animator2.cancel();
            this.f35600j = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m54728f(String str, View view) {
        zvf0.m220399u("e_pay_gift_get", "p_pay_result", vwb.m200311Y("pageproducttype", str));
        m54731i();
    }

    /* JADX INFO: renamed from: g */
    public void m54729g(ProductCategory productCategory, PrivilegeDetail privilegeDetail) {
        String string;
        int color;
        final String str;
        String string2 = CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? CoreModule.f17544b.getString(R$string.f27233N) : CoreModule.f17544b.getString(R$string.f27244O);
        if (TEnum.equals(productCategory, "boost")) {
            this.f35596f.setImageDrawable(getResources().getDrawable(d3c0.f84171x7));
            qib0.f154691G.m102325I0(this.f35593c, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjNSS0NZTUhNTFBZMzJYSTJSQldXUjdENVdGRERGUTE0IiwidyI6NzA1LCJoIjo3MDUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjQwMTQ3NDExMTIyOTQ1Nn0.webp", t100.m186890d(234.0f), t100.m186890d(234.0f));
            string = CoreModule.f17544b.getString(R$string.f27473i0);
            string2 = string2 + SignParameters.NEW_LINE + CoreModule.f17544b.getString(R$string.f27310U);
            color = Color.parseColor("#f258d8");
            str = "see";
        } else if (TEnum.equals(productCategory, "superLike")) {
            this.f35596f.setImageDrawable(getResources().getDrawable(d3c0.f84199z7));
            qib0.f154691G.m102325I0(this.f35593c, "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc2NUVPQlNPRlFUNjZEQzdZUVRXNTY0VFpRMkMyTDE0IiwidyI6NzA1LCJoIjo3MDUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjQwMTYxMTU0OTEzNDM1Mn0.webp", t100.m186890d(234.0f), t100.m186890d(234.0f));
            string = CoreModule.f17544b.getString(R$string.f27485j0);
            string2 = string2 + SignParameters.NEW_LINE + CoreModule.f17544b.getString(R$string.f27299T);
            color = Color.parseColor("#3cc8fd");
            str = "vip";
        } else if (TEnum.equals(productCategory, "quickchatNumber")) {
            this.f35596f.setImageDrawable(getResources().getDrawable(d3c0.f84185y7));
            qib0.f154691G.m102325I0(this.f35593c, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IllRS1pTU05XR09ENElYQldFNVNHWlpIVEE0RFFGMzE0IiwidyI6NzA1LCJoIjo3MDUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDE0OTY3NDI5NzU0NDIwOH0.webp", t100.m186890d(234.0f), t100.m186890d(234.0f));
            string = CoreModule.f17544b.getString(R$string.f27377a0);
            string2 = string2 + SignParameters.NEW_LINE + CoreModule.f17544b.getString(R$string.f27288S);
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
        this.f35594d.setText(spannableString);
        xdl0.m208329E0(this.f35595e, new View.OnClickListener() { // from class: l.n8b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137610a.m54728f(str, view);
            }
        });
        zvf0.m220368A("e_pay_gift_get", "p_pay_result", vwb.m200311Y("pageproducttype", str));
    }

    /* JADX INFO: renamed from: h */
    public void m54730h() {
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(this.f35592b, "alpha", 0L, 300L, this.f35597g, 0.0f, 1.0f), bt0.m103743p(this.f35596f, "alpha", 0L, 300L, this.f35597g, 0.0f, 1.0f), bt0.m103739l(this.f35592b, bt0.f77162i, 0L, 300L, this.f35597g, 0.3f, 1.0f), bt0.m103739l(this.f35596f, bt0.f77162i, 0L, 300L, this.f35597g, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35593c, BLiveGiftItem.TYPE_ROTATION, 0.0f, 360.0f);
        this.f35598h = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(3000L);
        this.f35598h.setInterpolator(this.f35597g);
        this.f35598h.setRepeatCount(-1);
        Animator animatorM103753z2 = bt0.m103753z(animatorM103753z, this.f35598h);
        this.f35599i = animatorM103753z2;
        animatorM103753z2.start();
    }

    /* JADX INFO: renamed from: i */
    public void m54731i() {
        m54727e();
        float bottom = this.f35596f.getBottom();
        float fM208408w0 = xdl0.m208408w0();
        FrameLayout frameLayout = this.f35592b;
        Animator animatorM103743p = bt0.m103743p(frameLayout, "alpha", 0L, 300L, this.f35597g, frameLayout.getAlpha(), 0.0f);
        Animator animatorM103743p2 = bt0.m103743p(this.f35596f, "translationY", 0L, 400L, this.f35597g, fM208408w0 - bottom);
        ImageView imageView = this.f35596f;
        Animator animatorM103743p3 = bt0.m103743p(imageView, "alpha", 0L, 400L, this.f35597g, imageView.getAlpha(), 0.1f);
        ImageView imageView2 = this.f35596f;
        Animator animatorM103753z = bt0.m103753z(animatorM103743p, animatorM103743p2, animatorM103743p3, bt0.m103739l(imageView2, bt0.f77162i, 0L, 400L, this.f35597g, imageView2.getScaleX(), 0.3f));
        this.f35600j = animatorM103753z;
        if (this.f35601k != null) {
            animatorM103753z.addListener(new C8832a());
        }
        this.f35600j.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54727e();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54726d(this);
        this.f35591a.setClickable(true);
        this.f35595e.setText(R$string.f27211L);
    }

    public void setExitAction(d30 d30Var) {
        this.f35601k = d30Var;
    }

    public PurchaseReceivingAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35597g = new LinearInterpolator();
    }

    public PurchaseReceivingAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35597g = new LinearInterpolator();
    }
}
