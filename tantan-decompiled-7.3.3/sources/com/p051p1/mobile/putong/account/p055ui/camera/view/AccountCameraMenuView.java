package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gt0;
import p153l.h1e0;
import p153l.ihc0;
import p153l.qa00;
import p153l.wlj;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Drawable f17483a;

    /* JADX INFO: renamed from: b */
    public Drawable f17484b;

    /* JADX INFO: renamed from: c */
    public TextView f17485c;

    /* JADX INFO: renamed from: d */
    public ImageView f17486d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f17487e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f17488f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f17489g;

    /* JADX INFO: renamed from: h */
    public float f17490h;

    public AccountCameraMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ihc0.f114890E, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(ihc0.f114895J);
        this.f17484b = typedArrayObtainStyledAttributes.getDrawable(ihc0.f114893H);
        this.f17483a = typedArrayObtainStyledAttributes.getDrawable(ihc0.f114894I);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ihc0.f114891F, 20);
        this.f17490h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ihc0.f114892G, qa00.m175859d(2.0f));
        typedArrayObtainStyledAttributes.recycle();
        m29927c(string, this.f17484b, dimensionPixelOffset);
    }

    /* JADX INFO: renamed from: b */
    public final void m29926b() {
        View view = this.f17486d;
        if (bnl0.m105529O0(this.f17489g)) {
            view = this.f17489g;
        }
        View view2 = view;
        gt0.m132173s(gt0.m132166l(view2, gt0.f106354i, 30L, 50L, new LinearInterpolator(), 1.0f, 1.2f), gt0.m132166l(view2, gt0.f106354i, 0L, 50L, new LinearInterpolator(), 1.2f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: c */
    public final void m29927c(String str, Drawable drawable, int i) {
        setOrientation(1);
        setClipChildren(false);
        this.f17486d = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        this.f17486d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.f17486d, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f17489g = frameLayout;
        frameLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 17;
        this.f17489g.setLayoutParams(layoutParams2);
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f17488f = vDraweeView;
        vDraweeView.setVisibility(8);
        wlj hierarchy = this.f17488f.getHierarchy();
        h1e0 h1e0Var = h1e0.f107444a;
        hierarchy.m207062w(h1e0Var);
        this.f17488f.getHierarchy().m207045H(RoundingParams.m8301a());
        this.f17489g.addView(this.f17488f, layoutParams2);
        VDraweeView vDraweeView2 = new VDraweeView(getContext());
        this.f17487e = vDraweeView2;
        vDraweeView2.setVisibility(8);
        this.f17487e.getHierarchy().m207062w(h1e0Var);
        this.f17487e.getHierarchy().m207045H(RoundingParams.m8301a());
        this.f17489g.addView(this.f17487e, layoutParams2);
        addView(this.f17489g, layoutParams);
        this.f17485c = new TextView(getContext());
        int i2 = bnl0.f77545f;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 17;
        layoutParams3.topMargin = (int) this.f17490h;
        this.f17485c.setShadowLayer(2.0f, 0.0f, 2.0f, Color.parseColor("#34000000"));
        this.f17485c.setTextSize(10.0f);
        this.f17485c.setTextColor(-1);
        this.f17485c.setGravity(17);
        addView(this.f17485c, layoutParams3);
        if (!TextUtils.isEmpty(str)) {
            this.f17485c.setText(str);
        }
        if (NullChecker.m82486a(drawable)) {
            this.f17486d.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m29928d(View.OnClickListener onClickListener, View view) {
        m29926b();
        if (NullChecker.m82486a(onClickListener)) {
            onClickListener.onClick(view);
        }
    }

    public FrameLayout getDraweeLayout() {
        this.f17486d.setVisibility(8);
        this.f17489g.setVisibility(0);
        return this.f17489g;
    }

    public VDraweeView getDraweeView() {
        this.f17486d.setVisibility(8);
        this.f17489g.setVisibility(0);
        this.f17487e.setVisibility(0);
        return this.f17487e;
    }

    public void setImageResource(int i) {
        this.f17486d.setImageResource(i);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: l.oi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147502a.m29928d(onClickListener, view);
            }
        });
    }

    public void setText(String str) {
        this.f17485c.setText(str);
    }

    public void setThemeType(int i) {
        if (i == 1) {
            this.f17486d.setImageDrawable(this.f17484b);
            this.f17485c.setTextColor(-1);
        } else if (i == 2) {
            this.f17486d.setImageDrawable(this.f17483a);
            this.f17485c.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    public AccountCameraMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountCameraMenuView(Context context) {
        this(context, null);
    }
}
