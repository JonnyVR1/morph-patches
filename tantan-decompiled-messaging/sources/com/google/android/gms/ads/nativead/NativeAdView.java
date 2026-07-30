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
import p149l.d1s0;
import p149l.e520;
import p149l.exr0;
import p149l.fbv0;
import p149l.gjx;
import p149l.hxs0;
import p149l.lzr0;
import p149l.m7s0;
import p149l.s050;
import p149l.uyl;
import p149l.x2t0;
import p149l.ybs0;

/* JADX INFO: loaded from: classes6.dex */
public final class NativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    @NotOnlyInitialized
    public final FrameLayout f9739a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @NotOnlyInitialized
    public final ybs0 f9740b;

    public NativeAdView(@NonNull Context context) {
        super(context);
        this.f9739a = m12352d(context);
        this.f9740b = m12353e();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final View m12349a(@NonNull String str) {
        ybs0 ybs0Var = this.f9740b;
        if (ybs0Var != null) {
            try {
                uyl uylVarZzb = ybs0Var.zzb(str);
                if (uylVarZzb != null) {
                    return (View) s050.m181847P2(uylVarZzb);
                }
            } catch (RemoteException e) {
                x2t0.m206867e("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f9739a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m12350b(gjx gjxVar) {
        ybs0 ybs0Var = this.f9740b;
        if (ybs0Var == null) {
            return;
        }
        try {
            if (gjxVar instanceof fbv0) {
                ybs0Var.mo145687d1(((fbv0) gjxVar).m120412d());
            } else if (gjxVar == null) {
                ybs0Var.mo145687d1(null);
            } else {
                x2t0.m206864b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            x2t0.m206867e("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@NonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f9739a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m12351c(ImageView.ScaleType scaleType) {
        ybs0 ybs0Var = this.f9740b;
        if (ybs0Var == null || scaleType == null) {
            return;
        }
        try {
            ybs0Var.mo145684I6(s050.m181848Y2(scaleType));
        } catch (RemoteException e) {
            x2t0.m206867e("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final FrameLayout m12352d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        if (this.f9740b != null) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132095Ua)).booleanValue()) {
                try {
                    this.f9740b.mo145691x(s050.m181848Y2(motionEvent));
                } catch (RemoteException e) {
                    x2t0.m206867e("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    @RequiresNonNull({"overlayFrame"})
    /* JADX INFO: renamed from: e */
    public final ybs0 m12353e() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f9739a;
        return exr0.m118702a().m156445h(frameLayout.getContext(), this, frameLayout);
    }

    /* JADX INFO: renamed from: f */
    public final void m12354f(String str, @Nullable View view) {
        ybs0 ybs0Var = this.f9740b;
        if (ybs0Var == null) {
            return;
        }
        try {
            ybs0Var.mo145683B7(str, s050.m181848Y2(view));
        } catch (RemoteException e) {
            x2t0.m206867e("Unable to call setAssetView on delegate", e);
        }
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View viewM12349a = m12349a("3011");
        if (viewM12349a instanceof AdChoicesView) {
            return (AdChoicesView) viewM12349a;
        }
        return null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return m12349a("3005");
    }

    @Nullable
    public final View getBodyView() {
        return m12349a("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return m12349a("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return m12349a("3001");
    }

    @Nullable
    public final View getIconView() {
        return m12349a("3003");
    }

    @Nullable
    public final View getImageView() {
        return m12349a("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View viewM12349a = m12349a("3010");
        if (viewM12349a instanceof MediaView) {
            return (MediaView) viewM12349a;
        }
        if (viewM12349a == null) {
            return null;
        }
        x2t0.m206864b("View is not an instance of MediaView");
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return m12349a("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return m12349a("3009");
    }

    @Nullable
    public final View getStoreView() {
        return m12349a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        ybs0 ybs0Var = this.f9740b;
        if (ybs0Var == null) {
            return;
        }
        try {
            ybs0Var.mo145686b7(s050.m181848Y2(view), i);
        } catch (RemoteException e) {
            x2t0.m206867e("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f9739a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NonNull View view) {
        if (this.f9739a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView) {
        m12354f("3011", adChoicesView);
    }

    public final void setAdvertiserView(@Nullable View view) {
        m12354f("3005", view);
    }

    public final void setBodyView(@Nullable View view) {
        m12354f("3004", view);
    }

    public final void setCallToActionView(@Nullable View view) {
        m12354f("3002", view);
    }

    public final void setClickConfirmingView(@Nullable View view) {
        ybs0 ybs0Var = this.f9740b;
        if (ybs0Var == null) {
            return;
        }
        try {
            ybs0Var.mo145688i7(s050.m181848Y2(view));
        } catch (RemoteException e) {
            x2t0.m206867e("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(@Nullable View view) {
        m12354f("3001", view);
    }

    public final void setIconView(@Nullable View view) {
        m12354f("3003", view);
    }

    public final void setImageView(@Nullable View view) {
        m12354f("3008", view);
    }

    public final void setMediaView(@Nullable MediaView mediaView) {
        m12354f("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.m12347a(new lzr0(this));
        mediaView.m12348b(new hxs0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, l.uyl] */
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
    public void setNativeAd(@NonNull e520 e520Var) {
        ybs0 ybs0Var = this.f9740b;
        if (ybs0Var == 0) {
            return;
        }
        try {
            ybs0Var.mo145685R7(e520Var.mo98610h());
        } catch (RemoteException e) {
            x2t0.m206867e("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(@Nullable View view) {
        m12354f("3007", view);
    }

    public final void setStarRatingView(@Nullable View view) {
        m12354f("3009", view);
    }

    public final void setStoreView(@Nullable View view) {
        m12354f("3006", view);
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9739a = m12352d(context);
        this.f9740b = m12353e();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9739a = m12352d(context);
        this.f9740b = m12353e();
    }

    @TargetApi(21)
    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9739a = m12352d(context);
        this.f9740b = m12353e();
    }
}
