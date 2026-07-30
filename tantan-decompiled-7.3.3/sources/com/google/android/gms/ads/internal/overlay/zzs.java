package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import p153l.acc0;
import p153l.bxy0;
import p153l.dct0;
import p153l.igr0;
import p153l.jas0;
import p153l.k6s0;
import p153l.obt0;
import p153l.sgs0;
import p153l.xsy0;
import p153l.yqy0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzs extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final ImageButton f9744a;

    /* JADX INFO: renamed from: b */
    public final igr0 f9745b;

    public zzs(Context context, xsy0 xsy0Var, @Nullable igr0 igr0Var) {
        super(context);
        this.f9745b = igr0Var;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f9744a = imageButton;
        m12337c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        k6s0.m148569b();
        int iM167049z = obt0.m167049z(context, xsy0Var.f196147a);
        k6s0.m148569b();
        int iM167049z2 = obt0.m167049z(context, 0);
        k6s0.m148569b();
        int iM167049z3 = obt0.m167049z(context, xsy0Var.f196148b);
        k6s0.m148569b();
        imageButton.setPadding(iM167049z, iM167049z2, iM167049z3, obt0.m167049z(context, xsy0Var.f196149c));
        imageButton.setContentDescription("Interstitial close button");
        k6s0.m148569b();
        int iM167049z4 = obt0.m167049z(context, xsy0Var.f196150d + xsy0Var.f196147a + xsy0Var.f196148b);
        k6s0.m148569b();
        addView(imageButton, new FrameLayout.LayoutParams(iM167049z4, obt0.m167049z(context, xsy0Var.f196150d + xsy0Var.f196149c), 17));
        long jLongValue = ((Long) jas0.m144075c().m176505a(sgs0.f168255c1)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        yqy0 yqy0Var = ((Boolean) jas0.m144075c().m176505a(sgs0.f168268d1)).booleanValue() ? new yqy0(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(yqy0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m12336b(boolean z) {
        ImageButton imageButton = this.f9744a;
        if (!z) {
            imageButton.setVisibility(0);
            return;
        }
        imageButton.setVisibility(8);
        if (((Long) jas0.m144075c().m176505a(sgs0.f168255c1)).longValue() > 0) {
            this.f9744a.animate().cancel();
            this.f9744a.clearAnimation();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12337c() {
        String str = (String) jas0.m144075c().m176505a(sgs0.f168242b1);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f9744a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesM120261e = bxy0.m106933q().m120261e();
        if (resourcesM120261e == null) {
            this.f9744a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesM120261e.getDrawable(acc0.f69696b);
            } else if ("black".equals(str)) {
                drawable = resourcesM120261e.getDrawable(acc0.f69695a);
            }
        } catch (Resources.NotFoundException unused) {
            dct0.m115293b("Close button resource not found, falling back to default.");
        }
        ImageButton imageButton = this.f9744a;
        if (drawable == null) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            imageButton.setImageDrawable(drawable);
            this.f9744a.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        igr0 igr0Var = this.f9745b;
        if (igr0Var != null) {
            igr0Var.zzj();
        }
    }
}
