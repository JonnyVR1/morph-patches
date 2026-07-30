package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;
import p149l.exr0;
import p149l.i2t0;
import p149l.s050;
import p149l.x2t0;
import p149l.xas0;
import p149l.zas0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzbix extends RelativeLayout {

    /* JADX INFO: renamed from: b */
    public static final float[] f10112b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* JADX INFO: renamed from: a */
    @Nullable
    public AnimationDrawable f10113a;

    public zzbix(Context context, xas0 xas0Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(xas0Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f10112b, null, null));
        shapeDrawable.getPaint().setColor(xas0Var.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(xas0Var.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(xas0Var.zzg());
            textView.setTextColor(xas0Var.zze());
            textView.setTextSize(xas0Var.m207668p8());
            exr0.m118703b();
            int iM134096z = i2t0.m134096z(context, 4);
            exr0.m118703b();
            textView.setPadding(iM134096z, 0, i2t0.m134096z(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listM207669q8 = xas0Var.m207669q8();
        if (listM207669q8 != null && listM207669q8.size() > 1) {
            this.f10113a = new AnimationDrawable();
            Iterator it = listM207669q8.iterator();
            while (it.hasNext()) {
                try {
                    this.f10113a.addFrame((Drawable) s050.m181847P2(((zas0) it.next()).zzf()), xas0Var.zzb());
                } catch (Exception e) {
                    x2t0.m206867e("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.f10113a);
        } else if (listM207669q8.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) s050.m181847P2(((zas0) listM207669q8.get(0)).zzf()));
            } catch (Exception e2) {
                x2t0.m206867e("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f10113a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
