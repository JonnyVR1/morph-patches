package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.LoggingBehavior;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.internal.C1680e;
import p153l.kkm;
import p153l.mkm;
import p153l.rac0;
import p153l.rzv;
import p153l.wg3;
import p153l.xgc0;
import p153l.xhm;
import p153l.ybc0;
import p153l.ztb;

/* JADX INFO: loaded from: classes6.dex */
public class ProfilePictureView extends FrameLayout {

    /* JADX INFO: renamed from: k */
    public static final String f6849k = "ProfilePictureView";

    /* JADX INFO: renamed from: a */
    public String f6850a;

    /* JADX INFO: renamed from: b */
    public int f6851b;

    /* JADX INFO: renamed from: c */
    public int f6852c;

    /* JADX INFO: renamed from: d */
    public boolean f6853d;

    /* JADX INFO: renamed from: e */
    public Bitmap f6854e;

    /* JADX INFO: renamed from: f */
    public ImageView f6855f;

    /* JADX INFO: renamed from: g */
    public int f6856g;

    /* JADX INFO: renamed from: h */
    public kkm f6857h;

    /* JADX INFO: renamed from: i */
    public Bitmap f6858i;

    /* JADX INFO: renamed from: j */
    public ProfileTracker f6859j;

    /* JADX INFO: renamed from: com.facebook.login.widget.ProfilePictureView$a */
    public class C1729a extends ProfileTracker {
        public C1729a() {
        }

        @Override // com.facebook.ProfileTracker
        /* JADX INFO: renamed from: c */
        public void mo7682c(Profile profile, Profile profile2) {
            ProfilePictureView.this.setProfileId(profile2 != null ? profile2.getId() : null);
            ProfilePictureView.this.m9255h(true);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ProfilePictureView$b */
    public class C1730b implements kkm.InterfaceC18196b {
        public C1730b() {
        }

        @Override // p153l.kkm.InterfaceC18196b
        /* JADX INFO: renamed from: a */
        public void mo9259a(mkm mkmVar) {
            ProfilePictureView.this.m9254g(mkmVar);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ProfilePictureView$c */
    public interface InterfaceC1731c {
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6851b = 0;
        this.f6852c = 0;
        this.f6853d = true;
        this.f6856g = -1;
        this.f6858i = null;
        m9251d(context);
        m9253f(attributeSet);
    }

    private void setImageBitmap(Bitmap bitmap) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            ImageView imageView = this.f6855f;
            if (imageView == null || bitmap == null) {
                return;
            }
            this.f6854e = bitmap;
            imageView.setImageBitmap(bitmap);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m9250c(boolean z) {
        int i;
        if (ztb.m221490d(this)) {
            return 0;
        }
        try {
            int i2 = this.f6856g;
            if (i2 == -4) {
                i = rac0.f161921a;
            } else if (i2 == -3) {
                i = rac0.f161922b;
            } else if (i2 == -2) {
                i = rac0.f161923c;
            } else {
                if (i2 != -1 || !z) {
                    return 0;
                }
                i = rac0.f161922b;
            }
            return getResources().getDimensionPixelSize(i);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9251d(Context context) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            removeAllViews();
            this.f6855f = new ImageView(context);
            this.f6855f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f6855f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.f6855f);
            this.f6859j = new C1729a();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9252e() {
        return this.f6853d;
    }

    /* JADX INFO: renamed from: f */
    public final void m9253f(AttributeSet attributeSet) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, xgc0.f194177h);
            setPresetSize(typedArrayObtainStyledAttributes.getInt(xgc0.f194179j, -1));
            this.f6853d = typedArrayObtainStyledAttributes.getBoolean(xgc0.f194178i, true);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9254g(mkm mkmVar) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (mkmVar.getCom.tencent.open.SocialConstants.TYPE_REQUEST java.lang.String() == this.f6857h) {
                this.f6857h = null;
                Bitmap bitmap = mkmVar.getBitmap();
                Exception error = mkmVar.getError();
                if (error != null) {
                    rzv.m183840f(LoggingBehavior.REQUESTS, 6, f6849k, error.toString());
                } else if (bitmap != null) {
                    setImageBitmap(bitmap);
                    if (mkmVar.getIsCachedRedirect()) {
                        m9256i(false);
                    }
                }
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public final InterfaceC1731c getOnErrorListener() {
        return null;
    }

    public final int getPresetSize() {
        return this.f6856g;
    }

    public final String getProfileId() {
        return this.f6850a;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        return this.f6859j.getIsTracking();
    }

    /* JADX INFO: renamed from: h */
    public final void m9255h(boolean z) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            boolean zM9258k = m9258k();
            String str = this.f6850a;
            if (str != null && str.length() != 0 && (this.f6852c != 0 || this.f6851b != 0)) {
                if (!zM9258k && !z) {
                    return;
                }
                m9256i(true);
                return;
            }
            m9257j();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9256i(boolean z) {
        Uri uriM7671e;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Uri uriM150260d = kkm.m150260d(this.f6850a, this.f6852c, this.f6851b, AccessToken.m7463p() ? AccessToken.m7462d().getToken() : "");
            Profile profileM7668b = Profile.m7668b();
            if (AccessToken.m7464s() && profileM7668b != null && (uriM7671e = profileM7668b.m7671e(this.f6852c, this.f6851b)) != null) {
                uriM150260d = uriM7671e;
            }
            kkm kkmVarM150265a = new kkm.C18195a(getContext(), uriM150260d).m150266b(z).m150268d(this).m150267c(new C1730b()).m150265a();
            kkm kkmVar = this.f6857h;
            if (kkmVar != null) {
                xhm.m211054d(kkmVar);
            }
            this.f6857h = kkmVarM150265a;
            xhm.m211055f(kkmVarM150265a);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9257j() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            kkm kkmVar = this.f6857h;
            if (kkmVar != null) {
                xhm.m211054d(kkmVar);
            }
            if (this.f6858i == null) {
                setImageBitmap(BitmapFactory.decodeResource(getResources(), m9252e() ? ybc0.f198292b : ybc0.f198291a));
            } else {
                m9258k();
                setImageBitmap(Bitmap.createScaledBitmap(this.f6858i, this.f6852c, this.f6851b, false));
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9258k() {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z = true;
            if (width >= 1 && height >= 1) {
                int iM9250c = m9250c(false);
                if (iM9250c != 0) {
                    height = iM9250c;
                    width = height;
                }
                if (width <= height) {
                    height = m9252e() ? width : 0;
                } else {
                    width = m9252e() ? height : 0;
                }
                if (width == this.f6852c && height == this.f6851b) {
                    z = false;
                }
                this.f6852c = width;
                this.f6851b = height;
                return z;
            }
            return false;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6857h = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m9255h(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i2) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = m9250c(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824 || layoutParams.width != -2) {
            z2 = z;
        } else {
            size2 = m9250c(true);
            i = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (!z2) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.f6850a = bundle.getString("ProfilePictureView_profileId");
        this.f6856g = bundle.getInt("ProfilePictureView_presetSize");
        this.f6853d = bundle.getBoolean("ProfilePictureView_isCropped");
        this.f6852c = bundle.getInt("ProfilePictureView_width");
        this.f6851b = bundle.getInt("ProfilePictureView_height");
        m9255h(true);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", parcelableOnSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.f6850a);
        bundle.putInt("ProfilePictureView_presetSize", this.f6856g);
        bundle.putBoolean("ProfilePictureView_isCropped", this.f6853d);
        bundle.putInt("ProfilePictureView_width", this.f6852c);
        bundle.putInt("ProfilePictureView_height", this.f6851b);
        bundle.putBoolean("ProfilePictureView_refresh", this.f6857h != null);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.f6853d = z;
        m9255h(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.f6858i = bitmap;
    }

    public final void setOnErrorListener(InterfaceC1731c interfaceC1731c) {
    }

    public final void setPresetSize(int i) {
        if (i != -4 && i != -3 && i != -2 && i != -1) {
            wg3.m206174a("Must use a predefined preset size");
        } else {
            this.f6856g = i;
            requestLayout();
        }
    }

    public final void setProfileId(@Nullable String str) {
        boolean z;
        if (C1680e.m8886c0(this.f6850a) || !this.f6850a.equalsIgnoreCase(str)) {
            m9257j();
            z = true;
        } else {
            z = false;
        }
        this.f6850a = str;
        m9255h(z);
    }

    public final void setShouldUpdateOnProfileChange(boolean z) {
        ProfileTracker profileTracker = this.f6859j;
        if (z) {
            profileTracker.m7683d();
        } else {
            profileTracker.m7684e();
        }
    }

    public ProfilePictureView(Context context) {
        super(context);
        this.f6851b = 0;
        this.f6852c = 0;
        this.f6853d = true;
        this.f6856g = -1;
        this.f6858i = null;
        m9251d(context);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6851b = 0;
        this.f6852c = 0;
        this.f6853d = true;
        this.f6856g = -1;
        this.f6858i = null;
        m9251d(context);
        m9253f(attributeSet);
    }
}
