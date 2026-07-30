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
import p149l.f300;
import p149l.k4c0;
import p149l.n2c0;
import p149l.rcm;
import p149l.x5c0;
import p149l.z500;

/* JADX INFO: loaded from: classes7.dex */
public class CardPreviewWidget extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private ImageView f12644a;

    /* JADX INFO: renamed from: b */
    private ImageView f12645b;

    /* JADX INFO: renamed from: c */
    int f12646c;

    /* JADX INFO: renamed from: d */
    private final float f12647d;

    public CardPreviewWidget(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12647d = 0.64285713f;
        View viewInflate = LayoutInflater.from(context).inflate(x5c0.f191125m, this);
        this.f12644a = (ImageView) viewInflate.findViewById(k4c0.f121001Q0);
        this.f12645b = (ImageView) viewInflate.findViewById(k4c0.f120999P0);
        this.f12644a.setVisibility(8);
        this.f12645b.setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    public void m18045a(ImageView imageView, @Nullable Bitmap bitmap, int i, int i2) {
        Bitmap bitmapM119246b;
        String string = !TextUtils.isEmpty(rcm.f158788c) ? rcm.f158788c : getResources().getString(R$string.f11997V);
        if (imageView != null) {
            imageView.getWidth();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            imageView.setLayoutParams(layoutParams);
            if (bitmap == null || (bitmapM119246b = f300.m119246b(string, bitmap.getWidth(), bitmap.getHeight(), (int) getResources().getDimension(n2c0.f136785c), -1, 204)) == null) {
                return;
            }
            Bitmap bitmapM119247c = f300.m119247c(bitmap, bitmapM119246b);
            int i3 = layoutParams.width;
            Bitmap bitmapM119245a = bitmapM119247c != null ? f300.m119245a(bitmapM119247c, i3, layoutParams.height, 10) : f300.m119245a(bitmap, i3, layoutParams.height, 10);
            if (bitmapM119245a != null) {
                imageView.setImageBitmap(bitmapM119245a);
            }
            if (bitmapM119246b.isRecycled()) {
                return;
            }
            bitmapM119246b.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m18046b(@Nullable Bitmap bitmap, int i, int i2) {
        m18045a(this.f12645b, bitmap, i, i2);
        this.f12645b.setVisibility(0);
    }

    /* JADX INFO: renamed from: c */
    public void m18047c(@Nullable Bitmap bitmap, int i, int i2) {
        this.f12644a.setVisibility(0);
        m18045a(this.f12644a, bitmap, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public void m18048d(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2) {
        int iM217269a = (this.f12646c - z500.m217269a(getContext(), 30.0f)) / 2;
        int height = (int) ((bitmap2.getHeight() / bitmap2.getWidth()) * iM217269a);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12644a.getLayoutParams();
        layoutParams.height = height;
        this.f12644a.setLayoutParams(layoutParams);
        layoutParams.leftMargin = z500.m217269a(getContext(), 10.0f);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f12645b.getLayoutParams();
        layoutParams2.height = height;
        this.f12645b.setLayoutParams(layoutParams2);
        layoutParams2.leftMargin = z500.m217269a(getContext(), 10.0f);
        layoutParams2.rightMargin = z500.m217269a(getContext(), 10.0f);
        m18047c(bitmap, iM217269a, height);
        m18046b(bitmap2, iM217269a, height);
        setMeasuredDimension(getWidth(), height);
    }

    /* JADX INFO: renamed from: e */
    public void m18049e(@Nullable Bitmap bitmap) {
        int iM217269a = this.f12646c - z500.m217269a(getContext(), 20.0f);
        m18047c(bitmap, iM217269a, z500.m217269a(getContext(), 200.0f));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12644a.getLayoutParams();
        layoutParams.height = z500.m217269a(getContext(), 200.0f);
        layoutParams.width = iM217269a;
        layoutParams.leftMargin = z500.m217269a(getContext(), 10.0f);
        layoutParams.rightMargin = z500.m217269a(getContext(), 10.0f);
        this.f12644a.setLayoutParams(layoutParams);
        this.f12644a.setVisibility(0);
    }

    public void setBackCard(@Nullable Bitmap bitmap) {
        m18046b(bitmap, this.f12646c / 2, z500.m217269a(getContext(), 200.0f));
    }

    public void setFrontCard(@Nullable Bitmap bitmap) {
        m18047c(bitmap, this.f12646c / 2, z500.m217269a(getContext(), 200.0f));
    }

    public CardPreviewWidget(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f12646c = context.getResources().getDisplayMetrics().widthPixels;
    }

    public CardPreviewWidget(Context context) {
        this(context, null);
    }
}
