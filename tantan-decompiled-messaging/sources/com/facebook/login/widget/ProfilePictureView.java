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
import com.facebook.internal.C1657e;
import p149l.him;
import p149l.ig3;
import p149l.jim;
import p149l.k2c0;
import p149l.lsb;
import p149l.s3c0;
import p149l.s8c0;
import p149l.ufm;
import p149l.uxv;

/* JADX INFO: loaded from: classes6.dex */
public class ProfilePictureView extends FrameLayout {

    /* JADX INFO: renamed from: k */
    public static final String f6812k = "ProfilePictureView";

    /* JADX INFO: renamed from: a */
    public String f6813a;

    /* JADX INFO: renamed from: b */
    public int f6814b;

    /* JADX INFO: renamed from: c */
    public int f6815c;

    /* JADX INFO: renamed from: d */
    public boolean f6816d;

    /* JADX INFO: renamed from: e */
    public Bitmap f6817e;

    /* JADX INFO: renamed from: f */
    public ImageView f6818f;

    /* JADX INFO: renamed from: g */
    public int f6819g;

    /* JADX INFO: renamed from: h */
    public him f6820h;

    /* JADX INFO: renamed from: i */
    public Bitmap f6821i;

    /* JADX INFO: renamed from: j */
    public ProfileTracker f6822j;

    /* JADX INFO: renamed from: com.facebook.login.widget.ProfilePictureView$a */
    public class C1706a extends ProfileTracker {
        public C1706a() {
        }

        @Override // com.facebook.ProfileTracker
        /* JADX INFO: renamed from: c */
        public void mo7628c(Profile profile, Profile profile2) {
            ProfilePictureView.this.setProfileId(profile2 != null ? profile2.getId() : null);
            ProfilePictureView.this.m9201h(true);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ProfilePictureView$b */
    public class C1707b implements him.InterfaceC17326b {
        public C1707b() {
        }

        @Override // p149l.him.InterfaceC17326b
        /* JADX INFO: renamed from: a */
        public void mo9205a(jim jimVar) {
            ProfilePictureView.this.m9200g(jimVar);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ProfilePictureView$c */
    public interface InterfaceC1708c {
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6814b = 0;
        this.f6815c = 0;
        this.f6816d = true;
        this.f6819g = -1;
        this.f6821i = null;
        m9197d(context);
        m9199f(attributeSet);
    }

    private void setImageBitmap(Bitmap bitmap) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            ImageView imageView = this.f6818f;
            if (imageView == null || bitmap == null) {
                return;
            }
            this.f6817e = bitmap;
            imageView.setImageBitmap(bitmap);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m9196c(boolean z) {
        int i;
        if (lsb.m151554d(this)) {
            return 0;
        }
        try {
            int i2 = this.f6819g;
            if (i2 == -4) {
                i = k2c0.f120707a;
            } else if (i2 == -3) {
                i = k2c0.f120708b;
            } else if (i2 == -2) {
                i = k2c0.f120709c;
            } else {
                if (i2 != -1 || !z) {
                    return 0;
                }
                i = k2c0.f120708b;
            }
            return getResources().getDimensionPixelSize(i);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9197d(Context context) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            removeAllViews();
            this.f6818f = new ImageView(context);
            this.f6818f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f6818f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.f6818f);
            this.f6822j = new C1706a();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9198e() {
        return this.f6816d;
    }

    /* JADX INFO: renamed from: f */
    public final void m9199f(AttributeSet attributeSet) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s8c0.f163036h);
            setPresetSize(typedArrayObtainStyledAttributes.getInt(s8c0.f163038j, -1));
            this.f6816d = typedArrayObtainStyledAttributes.getBoolean(s8c0.f163037i, true);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9200g(jim jimVar) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (jimVar.getCom.tencent.open.SocialConstants.TYPE_REQUEST java.lang.String() == this.f6820h) {
                this.f6820h = null;
                Bitmap bitmap = jimVar.getBitmap();
                Exception error = jimVar.getError();
                if (error != null) {
                    uxv.m196199f(LoggingBehavior.REQUESTS, 6, f6812k, error.toString());
                } else if (bitmap != null) {
                    setImageBitmap(bitmap);
                    if (jimVar.getIsCachedRedirect()) {
                        m9202i(false);
                    }
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    public final InterfaceC1708c getOnErrorListener() {
        return null;
    }

    public final int getPresetSize() {
        return this.f6819g;
    }

    public final String getProfileId() {
        return this.f6813a;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        return this.f6822j.getIsTracking();
    }

    /* JADX INFO: renamed from: h */
    public final void m9201h(boolean z) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            boolean zM9204k = m9204k();
            String str = this.f6813a;
            if (str != null && str.length() != 0 && (this.f6815c != 0 || this.f6814b != 0)) {
                if (!zM9204k && !z) {
                    return;
                }
                m9202i(true);
                return;
            }
            m9203j();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9202i(boolean z) {
        Uri uriM7617e;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            Uri uriM131282d = him.m131282d(this.f6813a, this.f6815c, this.f6814b, AccessToken.m7409p() ? AccessToken.m7408d().getToken() : "");
            Profile profileM7614b = Profile.m7614b();
            if (AccessToken.m7410s() && profileM7614b != null && (uriM7617e = profileM7614b.m7617e(this.f6815c, this.f6814b)) != null) {
                uriM131282d = uriM7617e;
            }
            him himVarM131287a = new him.C17325a(getContext(), uriM131282d).m131288b(z).m131290d(this).m131289c(new C1707b()).m131287a();
            him himVar = this.f6820h;
            if (himVar != null) {
                ufm.m193389d(himVar);
            }
            this.f6820h = himVarM131287a;
            ufm.m193390f(himVarM131287a);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9203j() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            him himVar = this.f6820h;
            if (himVar != null) {
                ufm.m193389d(himVar);
            }
            if (this.f6821i == null) {
                setImageBitmap(BitmapFactory.decodeResource(getResources(), m9198e() ? s3c0.f162097b : s3c0.f162096a));
            } else {
                m9204k();
                setImageBitmap(Bitmap.createScaledBitmap(this.f6821i, this.f6815c, this.f6814b, false));
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9204k() {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z = true;
            if (width >= 1 && height >= 1) {
                int iM9196c = m9196c(false);
                if (iM9196c != 0) {
                    height = iM9196c;
                    width = height;
                }
                if (width <= height) {
                    height = m9198e() ? width : 0;
                } else {
                    width = m9198e() ? height : 0;
                }
                if (width == this.f6815c && height == this.f6814b) {
                    z = false;
                }
                this.f6815c = width;
                this.f6814b = height;
                return z;
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6820h = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m9201h(false);
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
            size = m9196c(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824 || layoutParams.width != -2) {
            z2 = z;
        } else {
            size2 = m9196c(true);
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
        this.f6813a = bundle.getString("ProfilePictureView_profileId");
        this.f6819g = bundle.getInt("ProfilePictureView_presetSize");
        this.f6816d = bundle.getBoolean("ProfilePictureView_isCropped");
        this.f6815c = bundle.getInt("ProfilePictureView_width");
        this.f6814b = bundle.getInt("ProfilePictureView_height");
        m9201h(true);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", parcelableOnSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.f6813a);
        bundle.putInt("ProfilePictureView_presetSize", this.f6819g);
        bundle.putBoolean("ProfilePictureView_isCropped", this.f6816d);
        bundle.putInt("ProfilePictureView_width", this.f6815c);
        bundle.putInt("ProfilePictureView_height", this.f6814b);
        bundle.putBoolean("ProfilePictureView_refresh", this.f6820h != null);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.f6816d = z;
        m9201h(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.f6821i = bitmap;
    }

    public final void setOnErrorListener(InterfaceC1708c interfaceC1708c) {
    }

    public final void setPresetSize(int i) {
        if (i != -4 && i != -3 && i != -2 && i != -1) {
            ig3.m135964a("Must use a predefined preset size");
        } else {
            this.f6819g = i;
            requestLayout();
        }
    }

    public final void setProfileId(@Nullable String str) {
        boolean z;
        if (C1657e.m8832c0(this.f6813a) || !this.f6813a.equalsIgnoreCase(str)) {
            m9203j();
            z = true;
        } else {
            z = false;
        }
        this.f6813a = str;
        m9201h(z);
    }

    public final void setShouldUpdateOnProfileChange(boolean z) {
        ProfileTracker profileTracker = this.f6822j;
        if (z) {
            profileTracker.m7629d();
        } else {
            profileTracker.m7630e();
        }
    }

    public ProfilePictureView(Context context) {
        super(context);
        this.f6814b = 0;
        this.f6815c = 0;
        this.f6816d = true;
        this.f6819g = -1;
        this.f6821i = null;
        m9197d(context);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6814b = 0;
        this.f6815c = 0;
        this.f6816d = true;
        this.f6819g = -1;
        this.f6821i = null;
        m9197d(context);
        m9199f(attributeSet);
    }
}
