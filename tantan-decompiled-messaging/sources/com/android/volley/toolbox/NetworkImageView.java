package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.android.volley.C0918d;
import com.android.volley.VolleyError;

/* JADX INFO: loaded from: classes.dex */
public class NetworkImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private String f4184a;

    /* JADX INFO: renamed from: b */
    private int f4185b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private Drawable f4186c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private Bitmap f4187d;

    /* JADX INFO: renamed from: e */
    private int f4188e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private Drawable f4189f;

    /* JADX INFO: renamed from: g */
    @Nullable
    private Bitmap f4190g;

    /* JADX INFO: renamed from: com.android.volley.toolbox.NetworkImageView$a */
    public class C0921a implements C0918d.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f4191a;

        public C0921a(boolean z) {
            this.f4191a = z;
        }

        @Override // com.android.volley.C0918d.a
        public void onErrorResponse(VolleyError volleyError) {
            int i = NetworkImageView.this.f4188e;
            NetworkImageView networkImageView = NetworkImageView.this;
            if (i != 0) {
                networkImageView.setImageResource(networkImageView.f4188e);
                return;
            }
            Drawable drawable = networkImageView.f4189f;
            NetworkImageView networkImageView2 = NetworkImageView.this;
            if (drawable != null) {
                networkImageView2.setImageDrawable(networkImageView2.f4189f);
            } else if (networkImageView2.f4190g != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.f4190g);
            }
        }
    }

    public NetworkImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    private void m5111e() {
        int i = this.f4185b;
        if (i != 0) {
            setImageResource(i);
            return;
        }
        Drawable drawable = this.f4186c;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f4187d;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5112d(boolean z) {
        boolean z2;
        boolean z3;
        int width = getWidth();
        int height = getHeight();
        getScaleType();
        if (getLayoutParams() != null) {
            z2 = getLayoutParams().width == -2;
            z3 = getLayoutParams().height == -2;
        } else {
            z2 = false;
            z3 = false;
        }
        boolean z4 = z2 && z3;
        if (width == 0 && height == 0 && !z4) {
            return;
        }
        if (TextUtils.isEmpty(this.f4184a)) {
            m5111e();
        } else {
            new C0921a(z);
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m5112d(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f4185b = 0;
        this.f4186c = null;
        this.f4187d = bitmap;
    }

    public void setDefaultImageDrawable(@Nullable Drawable drawable) {
        this.f4185b = 0;
        this.f4187d = null;
        this.f4186c = drawable;
    }

    public void setDefaultImageResId(int i) {
        this.f4187d = null;
        this.f4186c = null;
        this.f4185b = i;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.f4188e = 0;
        this.f4189f = null;
        this.f4190g = bitmap;
    }

    public void setErrorImageDrawable(@Nullable Drawable drawable) {
        this.f4188e = 0;
        this.f4190g = null;
        this.f4189f = drawable;
    }

    public void setErrorImageResId(int i) {
        this.f4190g = null;
        this.f4189f = null;
        this.f4188e = i;
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
