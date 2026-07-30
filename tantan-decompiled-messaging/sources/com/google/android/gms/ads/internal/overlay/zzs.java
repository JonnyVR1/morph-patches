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
import p149l.c7r0;
import p149l.d1s0;
import p149l.exr0;
import p149l.i2t0;
import p149l.m7s0;
import p149l.rjy0;
import p149l.shy0;
import p149l.u3c0;
import p149l.vny0;
import p149l.x2t0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzs extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final ImageButton f9707a;

    /* JADX INFO: renamed from: b */
    public final c7r0 f9708b;

    public zzs(Context context, rjy0 rjy0Var, @Nullable c7r0 c7r0Var) {
        super(context);
        this.f9708b = c7r0Var;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f9707a = imageButton;
        m12283c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        exr0.m118703b();
        int iM134096z = i2t0.m134096z(context, rjy0Var.f159760a);
        exr0.m118703b();
        int iM134096z2 = i2t0.m134096z(context, 0);
        exr0.m118703b();
        int iM134096z3 = i2t0.m134096z(context, rjy0Var.f159761b);
        exr0.m118703b();
        imageButton.setPadding(iM134096z, iM134096z2, iM134096z3, i2t0.m134096z(context, rjy0Var.f159762c));
        imageButton.setContentDescription("Interstitial close button");
        exr0.m118703b();
        int iM134096z4 = i2t0.m134096z(context, rjy0Var.f159763d + rjy0Var.f159760a + rjy0Var.f159761b);
        exr0.m118703b();
        addView(imageButton, new FrameLayout.LayoutParams(iM134096z4, i2t0.m134096z(context, rjy0Var.f159763d + rjy0Var.f159762c), 17));
        long jLongValue = ((Long) d1s0.m109677c().m144697a(m7s0.f132184c1)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        shy0 shy0Var = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132197d1)).booleanValue() ? new shy0(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(shy0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m12282b(boolean z) {
        ImageButton imageButton = this.f9707a;
        if (!z) {
            imageButton.setVisibility(0);
            return;
        }
        imageButton.setVisibility(8);
        if (((Long) d1s0.m109677c().m144697a(m7s0.f132184c1)).longValue() > 0) {
            this.f9707a.animate().cancel();
            this.f9707a.clearAnimation();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12283c() {
        String str = (String) d1s0.m109677c().m144697a(m7s0.f132171b1);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f9707a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesM212276e = vny0.m199079q().m212276e();
        if (resourcesM212276e == null) {
            this.f9707a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesM212276e.getDrawable(u3c0.f173592b);
            } else if ("black".equals(str)) {
                drawable = resourcesM212276e.getDrawable(u3c0.f173591a);
            }
        } catch (Resources.NotFoundException unused) {
            x2t0.m206864b("Close button resource not found, falling back to default.");
        }
        ImageButton imageButton = this.f9707a;
        if (drawable == null) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            imageButton.setImageDrawable(drawable);
            this.f9707a.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c7r0 c7r0Var = this.f9708b;
        if (c7r0Var != null) {
            c7r0Var.zzj();
        }
    }
}
