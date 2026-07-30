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
import p153l.dct0;
import p153l.dks0;
import p153l.fks0;
import p153l.h950;
import p153l.k6s0;
import p153l.obt0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzbix extends RelativeLayout {

    /* JADX INFO: renamed from: b */
    public static final float[] f10149b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* JADX INFO: renamed from: a */
    @Nullable
    public AnimationDrawable f10150a;

    public zzbix(Context context, dks0 dks0Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(dks0Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f10149b, null, null));
        shapeDrawable.getPaint().setColor(dks0Var.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(dks0Var.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(dks0Var.zzg());
            textView.setTextColor(dks0Var.zze());
            textView.setTextSize(dks0Var.m116673p8());
            k6s0.m148569b();
            int iM167049z = obt0.m167049z(context, 4);
            k6s0.m148569b();
            textView.setPadding(iM167049z, 0, obt0.m167049z(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listM116674q8 = dks0Var.m116674q8();
        if (listM116674q8 != null && listM116674q8.size() > 1) {
            this.f10150a = new AnimationDrawable();
            Iterator it = listM116674q8.iterator();
            while (it.hasNext()) {
                try {
                    this.f10150a.addFrame((Drawable) h950.m134037P2(((fks0) it.next()).zzf()), dks0Var.zzb());
                } catch (Exception e) {
                    dct0.m115296e("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.f10150a);
        } else if (listM116674q8.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) h950.m134037P2(((fks0) listM116674q8.get(0)).zzf()));
            } catch (Exception e2) {
                dct0.m115296e("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f10150a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
