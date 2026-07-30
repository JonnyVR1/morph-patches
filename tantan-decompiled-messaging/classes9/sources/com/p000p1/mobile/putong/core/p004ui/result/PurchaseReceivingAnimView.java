package com.p000p1.mobile.putong.core.p004ui.result;

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
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PrivilegeDetail;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.bt0;
import l.d30;
import l.d3c0;
import l.j760;
import l.o8b0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p006l.qib0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PurchaseReceivingAnimView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PurchaseReceivingAnimView f5372a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f5373b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5374c;

    /* JADX INFO: renamed from: d */
    public TextView f5375d;

    /* JADX INFO: renamed from: e */
    public TextView f5376e;

    /* JADX INFO: renamed from: f */
    public ImageView f5377f;

    /* JADX INFO: renamed from: g */
    public final LinearInterpolator f5378g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f5379h;

    /* JADX INFO: renamed from: i */
    public Animator f5380i;

    /* JADX INFO: renamed from: j */
    public Animator f5381j;

    /* JADX INFO: renamed from: k */
    public d30 f5382k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.PurchaseReceivingAnimView$a */
    public class C0268a extends bt0.j {
        public C0268a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            PurchaseReceivingAnimView.this.f5381j = null;
            PurchaseReceivingAnimView.this.f5382k.call();
        }
    }

    public PurchaseReceivingAnimView(@NonNull Context context) {
        super(context);
        this.f5378g = new LinearInterpolator();
    }

    /* JADX INFO: renamed from: d */
    public final void m8083d(View view) {
        o8b0.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m8084e() {
        Animator animator = this.f5380i;
        if (animator != null) {
            animator.cancel();
            this.f5380i = null;
        }
        ObjectAnimator objectAnimator = this.f5379h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f5379h = null;
        }
        Animator animator2 = this.f5381j;
        if (animator2 != null) {
            animator2.cancel();
            this.f5381j = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m8085f(String str, View view) {
        zvf0.u("e_pay_gift_get", "p_pay_result", new j760[]{vwb.Y("pageproducttype", str)});
        m8088i();
    }

    /* JADX INFO: renamed from: g */
    public void m8086g(ProductCategory productCategory, PrivilegeDetail privilegeDetail) {
        String string;
        int color;
        final String str;
        String string2 = CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? CoreModule.f1533b.getString(R.string.N) : CoreModule.f1533b.getString(R.string.O);
        if (TEnum.equals(productCategory, "boost")) {
            this.f5377f.setImageDrawable(getResources().getDrawable(d3c0.x7));
            qib0.f19782G.m12738I0(this.f5374c, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjNSS0NZTUhNTFBZMzJYSTJSQldXUjdENVdGRERGUTE0IiwidyI6NzA1LCJoIjo3MDUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjQwMTQ3NDExMTIyOTQ1Nn0.webp", t100.d(234.0f), t100.d(234.0f));
            string = CoreModule.f1533b.getString(R.string.i0);
            string2 = string2 + "\n" + CoreModule.f1533b.getString(R.string.U);
            color = Color.parseColor("#f258d8");
            str = "see";
        } else if (TEnum.equals(productCategory, "superLike")) {
            this.f5377f.setImageDrawable(getResources().getDrawable(d3c0.z7));
            qib0.f19782G.m12738I0(this.f5374c, "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc2NUVPQlNPRlFUNjZEQzdZUVRXNTY0VFpRMkMyTDE0IiwidyI6NzA1LCJoIjo3MDUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjQwMTYxMTU0OTEzNDM1Mn0.webp", t100.d(234.0f), t100.d(234.0f));
            string = CoreModule.f1533b.getString(R.string.j0);
            string2 = string2 + "\n" + CoreModule.f1533b.getString(R.string.T);
            color = Color.parseColor("#3cc8fd");
            str = "vip";
        } else if (TEnum.equals(productCategory, "quickchatNumber")) {
            this.f5377f.setImageDrawable(getResources().getDrawable(d3c0.y7));
            qib0.f19782G.m12738I0(this.f5374c, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IllRS1pTU05XR09ENElYQldFNVNHWlpIVEE0RFFGMzE0IiwidyI6NzA1LCJoIjo3MDUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDE0OTY3NDI5NzU0NDIwOH0.webp", t100.d(234.0f), t100.d(234.0f));
            string = CoreModule.f1533b.getString(R.string.a0);
            string2 = string2 + "\n" + CoreModule.f1533b.getString(R.string.S);
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
        this.f5375d.setText(spannableString);
        xdl0.E0(this.f5376e, new View.OnClickListener() { // from class: l.n8b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17533a.m8085f(str, view);
            }
        });
        zvf0.A("e_pay_gift_get", "p_pay_result", new j760[]{vwb.Y("pageproducttype", str)});
    }

    /* JADX INFO: renamed from: h */
    public void m8087h() {
        Animator animatorZ = bt0.z(new Animator[]{bt0.p(this.f5373b, "alpha", 0L, 300L, this.f5378g, new float[]{0.0f, 1.0f}), bt0.p(this.f5377f, "alpha", 0L, 300L, this.f5378g, new float[]{0.0f, 1.0f}), bt0.l(this.f5373b, bt0.i, 0L, 300L, this.f5378g, new float[]{0.3f, 1.0f}), bt0.l(this.f5377f, bt0.i, 0L, 300L, this.f5378g, new float[]{0.3f, 1.0f})});
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f5374c, "rotation", 0.0f, 360.0f);
        this.f5379h = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(3000L);
        this.f5379h.setInterpolator(this.f5378g);
        this.f5379h.setRepeatCount(-1);
        Animator animatorZ2 = bt0.z(new Animator[]{animatorZ, this.f5379h});
        this.f5380i = animatorZ2;
        animatorZ2.start();
    }

    /* JADX INFO: renamed from: i */
    public void m8088i() {
        m8084e();
        float bottom = this.f5377f.getBottom();
        float fW0 = xdl0.w0();
        FrameLayout frameLayout = this.f5373b;
        Animator animatorP = bt0.p(frameLayout, "alpha", 0L, 300L, this.f5378g, new float[]{frameLayout.getAlpha(), 0.0f});
        Animator animatorP2 = bt0.p(this.f5377f, "translationY", 0L, 400L, this.f5378g, new float[]{fW0 - bottom});
        ImageView imageView = this.f5377f;
        Animator animatorP3 = bt0.p(imageView, "alpha", 0L, 400L, this.f5378g, new float[]{imageView.getAlpha(), 0.1f});
        ImageView imageView2 = this.f5377f;
        Animator animatorZ = bt0.z(new Animator[]{animatorP, animatorP2, animatorP3, bt0.l(imageView2, bt0.i, 0L, 400L, this.f5378g, new float[]{imageView2.getScaleX(), 0.3f})});
        this.f5381j = animatorZ;
        if (this.f5382k != null) {
            animatorZ.addListener(new C0268a());
        }
        this.f5381j.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8084e();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8083d(this);
        this.f5372a.setClickable(true);
        this.f5376e.setText(R.string.L);
    }

    public void setExitAction(d30 d30Var) {
        this.f5382k = d30Var;
    }

    public PurchaseReceivingAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5378g = new LinearInterpolator();
    }

    public PurchaseReceivingAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5378g = new LinearInterpolator();
    }
}
