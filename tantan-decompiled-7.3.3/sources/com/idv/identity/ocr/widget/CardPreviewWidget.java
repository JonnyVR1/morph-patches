package com.idv.identity.ocr.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.idv.identity.base.R$string;
import p153l.cc00;
import p153l.dec0;
import p153l.hfm;
import p153l.je00;
import p153l.rcc0;
import p153l.vac0;

/* JADX INFO: loaded from: classes7.dex */
public class CardPreviewWidget extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private ImageView f13385a;

    /* JADX INFO: renamed from: b */
    private ImageView f13386b;

    /* JADX INFO: renamed from: c */
    int f13387c;

    /* JADX INFO: renamed from: d */
    private final float f13388d;

    public CardPreviewWidget(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13388d = 0.64285713f;
        View viewInflate = LayoutInflater.from(context).inflate(dec0.f88009m, this);
        this.f13385a = (ImageView) viewInflate.findViewById(rcc0.f162120Q0);
        this.f13386b = (ImageView) viewInflate.findViewById(rcc0.f162118P0);
        this.f13385a.setVisibility(8);
        this.f13386b.setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    public void m19122a(ImageView imageView, @Nullable Bitmap bitmap, int i, int i2) {
        Bitmap bitmapM108699b;
        String string = !TextUtils.isEmpty(hfm.f109318c) ? hfm.f109318c : getResources().getString(R$string.f12738V);
        if (imageView != null) {
            imageView.getWidth();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            imageView.setLayoutParams(layoutParams);
            if (bitmap == null || (bitmapM108699b = cc00.m108699b(string, bitmap.getWidth(), bitmap.getHeight(), (int) getResources().getDimension(vac0.f183080c), -1, 204)) == null) {
                return;
            }
            Bitmap bitmapM108700c = cc00.m108700c(bitmap, bitmapM108699b);
            int i3 = layoutParams.width;
            Bitmap bitmapM108698a = bitmapM108700c != null ? cc00.m108698a(bitmapM108700c, i3, layoutParams.height, 10) : cc00.m108698a(bitmap, i3, layoutParams.height, 10);
            if (bitmapM108698a != null) {
                imageView.setImageBitmap(bitmapM108698a);
            }
            if (bitmapM108699b.isRecycled()) {
                return;
            }
            bitmapM108699b.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19123b(@Nullable Bitmap bitmap, int i, int i2) {
        m19122a(this.f13386b, bitmap, i, i2);
        this.f13386b.setVisibility(0);
    }

    /* JADX INFO: renamed from: c */
    public void m19124c(@Nullable Bitmap bitmap, int i, int i2) {
        this.f13385a.setVisibility(0);
        m19122a(this.f13385a, bitmap, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public void m19125d(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2) {
        int iM144505a = (this.f13387c - je00.m144505a(getContext(), 30.0f)) / 2;
        int height = (int) ((bitmap2.getHeight() / bitmap2.getWidth()) * iM144505a);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13385a.getLayoutParams();
        layoutParams.height = height;
        this.f13385a.setLayoutParams(layoutParams);
        layoutParams.leftMargin = je00.m144505a(getContext(), 10.0f);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f13386b.getLayoutParams();
        layoutParams2.height = height;
        this.f13386b.setLayoutParams(layoutParams2);
        layoutParams2.leftMargin = je00.m144505a(getContext(), 10.0f);
        layoutParams2.rightMargin = je00.m144505a(getContext(), 10.0f);
        m19124c(bitmap, iM144505a, height);
        m19123b(bitmap2, iM144505a, height);
        setMeasuredDimension(getWidth(), height);
    }

    /* JADX INFO: renamed from: e */
    public void m19126e(@Nullable Bitmap bitmap) {
        int iM144505a = this.f13387c - je00.m144505a(getContext(), 20.0f);
        m19124c(bitmap, iM144505a, je00.m144505a(getContext(), 200.0f));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13385a.getLayoutParams();
        layoutParams.height = je00.m144505a(getContext(), 200.0f);
        layoutParams.width = iM144505a;
        layoutParams.leftMargin = je00.m144505a(getContext(), 10.0f);
        layoutParams.rightMargin = je00.m144505a(getContext(), 10.0f);
        this.f13385a.setLayoutParams(layoutParams);
        this.f13385a.setVisibility(0);
    }

    public void setBackCard(@Nullable Bitmap bitmap) {
        m19123b(bitmap, this.f13387c / 2, je00.m144505a(getContext(), 200.0f));
    }

    public void setFrontCard(@Nullable Bitmap bitmap) {
        m19124c(bitmap, this.f13387c / 2, je00.m144505a(getContext(), 200.0f));
    }

    public CardPreviewWidget(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f13387c = context.getResources().getDisplayMetrics().widthPixels;
    }

    public CardPreviewWidget(Context context) {
        this(context, null);
    }
}
