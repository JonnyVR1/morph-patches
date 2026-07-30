package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p153l.dct0;
import p153l.dsx;
import p153l.els0;
import p153l.h950;
import p153l.jas0;
import p153l.k6s0;
import p153l.lkv0;
import p153l.md20;
import p153l.n6t0;
import p153l.p1m;
import p153l.r8s0;
import p153l.sgs0;

/* JADX INFO: loaded from: classes6.dex */
public final class NativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    @NotOnlyInitialized
    public final FrameLayout f9776a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @NotOnlyInitialized
    public final els0 f9777b;

    public NativeAdView(@NonNull Context context) {
        super(context);
        this.f9776a = m12406d(context);
        this.f9777b = m12407e();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final View m12403a(@NonNull String str) {
        els0 els0Var = this.f9777b;
        if (els0Var != null) {
            try {
                p1m p1mVarZzb = els0Var.zzb(str);
                if (p1mVarZzb != null) {
                    return (View) h950.m134037P2(p1mVarZzb);
                }
            } catch (RemoteException e) {
                dct0.m115296e("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f9776a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m12404b(dsx dsxVar) {
        els0 els0Var = this.f9777b;
        if (els0Var == null) {
            return;
        }
        try {
            if (dsxVar instanceof lkv0) {
                els0Var.mo110702d1(((lkv0) dsxVar).m154657d());
            } else if (dsxVar == null) {
                els0Var.mo110702d1(null);
            } else {
                dct0.m115293b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            dct0.m115296e("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@NonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f9776a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m12405c(ImageView.ScaleType scaleType) {
        els0 els0Var = this.f9777b;
        if (els0Var == null || scaleType == null) {
            return;
        }
        try {
            els0Var.mo110699I6(h950.m134038Y2(scaleType));
        } catch (RemoteException e) {
            dct0.m115296e("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final FrameLayout m12406d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        if (this.f9777b != null) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168166Ua)).booleanValue()) {
                try {
                    this.f9777b.mo110704x(h950.m134038Y2(motionEvent));
                } catch (RemoteException e) {
                    dct0.m115296e("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    @RequiresNonNull({"overlayFrame"})
    /* JADX INFO: renamed from: e */
    public final els0 m12407e() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f9776a;
        return k6s0.m148568a().m184301h(frameLayout.getContext(), this, frameLayout);
    }

    /* JADX INFO: renamed from: f */
    public final void m12408f(String str, @Nullable View view) {
        els0 els0Var = this.f9777b;
        if (els0Var == null) {
            return;
        }
        try {
            els0Var.mo110698B7(str, h950.m134038Y2(view));
        } catch (RemoteException e) {
            dct0.m115296e("Unable to call setAssetView on delegate", e);
        }
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View viewM12403a = m12403a("3011");
        if (viewM12403a instanceof AdChoicesView) {
            return (AdChoicesView) viewM12403a;
        }
        return null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return m12403a("3005");
    }

    @Nullable
    public final View getBodyView() {
        return m12403a("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return m12403a("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return m12403a("3001");
    }

    @Nullable
    public final View getIconView() {
        return m12403a("3003");
    }

    @Nullable
    public final View getImageView() {
        return m12403a("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View viewM12403a = m12403a("3010");
        if (viewM12403a instanceof MediaView) {
            return (MediaView) viewM12403a;
        }
        if (viewM12403a == null) {
            return null;
        }
        dct0.m115293b("View is not an instance of MediaView");
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return m12403a("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return m12403a("3009");
    }

    @Nullable
    public final View getStoreView() {
        return m12403a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        els0 els0Var = this.f9777b;
        if (els0Var == null) {
            return;
        }
        try {
            els0Var.mo110701b7(h950.m134038Y2(view), i);
        } catch (RemoteException e) {
            dct0.m115296e("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f9776a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NonNull View view) {
        if (this.f9776a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView) {
        m12408f("3011", adChoicesView);
    }

    public final void setAdvertiserView(@Nullable View view) {
        m12408f("3005", view);
    }

    public final void setBodyView(@Nullable View view) {
        m12408f("3004", view);
    }

    public final void setCallToActionView(@Nullable View view) {
        m12408f("3002", view);
    }

    public final void setClickConfirmingView(@Nullable View view) {
        els0 els0Var = this.f9777b;
        if (els0Var == null) {
            return;
        }
        try {
            els0Var.mo110703i7(h950.m134038Y2(view));
        } catch (RemoteException e) {
            dct0.m115296e("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(@Nullable View view) {
        m12408f("3001", view);
    }

    public final void setIconView(@Nullable View view) {
        m12408f("3003", view);
    }

    public final void setImageView(@Nullable View view) {
        m12408f("3008", view);
    }

    public final void setMediaView(@Nullable MediaView mediaView) {
        m12408f("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.m12401a(new r8s0(this));
        mediaView.m12402b(new n6t0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, l.p1m] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setNativeAd(@NonNull md20 md20Var) {
        els0 els0Var = this.f9777b;
        if (els0Var == 0) {
            return;
        }
        try {
            els0Var.mo110700R7(md20Var.mo128562h());
        } catch (RemoteException e) {
            dct0.m115296e("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(@Nullable View view) {
        m12408f("3007", view);
    }

    public final void setStarRatingView(@Nullable View view) {
        m12408f("3009", view);
    }

    public final void setStoreView(@Nullable View view) {
        m12408f("3006", view);
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9776a = m12406d(context);
        this.f9777b = m12407e();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9776a = m12406d(context);
        this.f9777b = m12407e();
    }

    @TargetApi(21)
    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9776a = m12406d(context);
        this.f9777b = m12407e();
    }
}
