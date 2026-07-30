package com.facebook;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.Constants;
import com.facebook.FacebookButtonBase;
import com.facebook.appevents.C1577f;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.d60;
import p153l.j26;
import p153l.ogc0;
import p153l.t9c0;
import p153l.z5j;
import p153l.ztb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B;\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010 J\u0019\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b#\u0010$J1\u0010%\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010'H\u0014¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b+\u0010\u0018J\u0019\u0010,\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b.\u0010-J1\u0010/\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010&J1\u00100\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b0\u0010&J1\u00101\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010&J1\u00102\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010&J\u000f\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b3\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u000b\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u00105\u001a\u0004\b8\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00109R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010=R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010?R\u0016\u0010A\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010CR\u001a\u0010F\u001a\u00020\u00068\u0014X\u0094D¢\u0006\f\n\u0004\b1\u0010?\u001a\u0004\bE\u0010 R\u0014\u0010H\u001a\u00020\u00068$X¤\u0004¢\u0006\u0006\u001a\u0004\bG\u0010 R\u0013\u0010K\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010Q\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010 R\u0014\u0010W\u001a\u00020T8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, m88121d2 = {"Lcom/facebook/FacebookButtonBase;", "Landroid/widget/Button;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "analyticsButtonCreatedEventName", "analyticsButtonTappedEventName", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/lang/String;Ljava/lang/String;)V", "Landroid/app/Fragment;", "fragment", "", "setFragment", "(Landroid/app/Fragment;)V", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "Landroid/view/View$OnClickListener;", BLiveStormDanmakuGiftResourceType.f45292l, "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "onAttachedToWindow", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "getCompoundPaddingLeft", "()I", "getCompoundPaddingRight", "text", "f", "(Ljava/lang/String;)I", "c", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", ResourceDirection.f39656v, "b", "(Landroid/view/View;)V", "setInternalOnClickListener", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)V", "e", "g", "h", RXScreenCaptureService.KEY_INDEX, "j", "k", "a", "Ljava/lang/String;", "getAnalyticsButtonCreatedEventName", "()Ljava/lang/String;", "getAnalyticsButtonTappedEventName", "Landroid/view/View$OnClickListener;", "externalOnClickListener", "internalOnClickListener", "", "Z", "overrideCompoundPadding", "I", "overrideCompoundPaddingLeft", "overrideCompoundPaddingRight", "Ll/z5j;", "Ll/z5j;", "parentFragment", "getDefaultStyleResource", "defaultStyleResource", "getDefaultRequestCode", "defaultRequestCode", "getNativeFragment", "()Landroid/app/Fragment;", "nativeFragment", "getFragment", "()Landroidx/fragment/app/Fragment;", "Ll/d60;", "getAndroidxActivityResultRegistryOwner", "()Ll/d60;", "androidxActivityResultRegistryOwner", "getRequestCode", "requestCode", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
@SuppressLint({"ResourceType"})
public abstract class FacebookButtonBase extends Button {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String analyticsButtonCreatedEventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String analyticsButtonTappedEventName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public View.OnClickListener externalOnClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public View.OnClickListener internalOnClickListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean overrideCompoundPadding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int overrideCompoundPaddingLeft;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int overrideCompoundPaddingRight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public z5j parentFragment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int defaultStyleResource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookButtonBase(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2, @NotNull String str, @NotNull String str2) {
        super(context, attributeSet, 0);
        context.getClass();
        str.getClass();
        str2.getClass();
        i2 = i2 == 0 ? getDefaultStyleResource() : i2;
        mo7537c(context, attributeSet, i, i2 == 0 ? ogc0.f147211c : i2);
        this.analyticsButtonCreatedEventName = str;
        this.analyticsButtonTappedEventName = str2;
        setClickable(true);
        setFocusable(true);
    }

    /* JADX INFO: renamed from: l */
    public static final void m7535l(FacebookButtonBase facebookButtonBase, View view) {
        if (ztb.m221490d(FacebookButtonBase.class)) {
            return;
        }
        try {
            facebookButtonBase.getClass();
            facebookButtonBase.m7539e(facebookButtonBase.getContext());
            View.OnClickListener onClickListener = facebookButtonBase.internalOnClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            View.OnClickListener onClickListener2 = facebookButtonBase.externalOnClickListener;
            if (onClickListener2 == null) {
                return;
            }
            onClickListener2.onClick(view);
        } catch (Throwable th) {
            ztb.m221488b(th, FacebookButtonBase.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m7536b(@Nullable View v2) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.externalOnClickListener;
            if (onClickListener == null) {
                return;
            }
            onClickListener.onClick(v2);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo7537c(@NotNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            context.getClass();
            m7541g(context, attrs, defStyleAttr, defStyleRes);
            m7542h(context, attrs, defStyleAttr, defStyleRes);
            m7543i(context, attrs, defStyleAttr, defStyleRes);
            m7544j(context, attrs, defStyleAttr, defStyleRes);
            m7545k();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m7538d(@Nullable Context context) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            C1577f.INSTANCE.m7835a(context, null).m7830f(this.analyticsButtonCreatedEventName);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m7539e(@Nullable Context context) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            C1577f.INSTANCE.m7835a(context, null).m7830f(this.analyticsButtonTappedEventName);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: f */
    public int m7540f(@Nullable String text) {
        if (ztb.m221490d(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(text));
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7541g(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, new int[]{R.attr.background}, defStyleAttr, defStyleRes);
            typedArrayObtainStyledAttributes.getClass();
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(j26.m143190c(context, t9c0.f172630a));
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @NotNull
    public Activity getActivity() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @NotNull
    public final String getAnalyticsButtonCreatedEventName() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return this.analyticsButtonCreatedEventName;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @NotNull
    public final String getAnalyticsButtonTappedEventName() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return this.analyticsButtonTappedEventName;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @Nullable
    public final d60 getAndroidxActivityResultRegistryOwner() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof d60) {
                return (d60) activity;
            }
            return null;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (ztb.m221490d(this)) {
            return 0;
        }
        try {
            return this.overrideCompoundPadding ? this.overrideCompoundPaddingLeft : super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (ztb.m221490d(this)) {
            return 0;
        }
        try {
            return this.overrideCompoundPadding ? this.overrideCompoundPaddingRight : super.getCompoundPaddingRight();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return 0;
        }
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        if (ztb.m221490d(this)) {
            return 0;
        }
        try {
            return this.defaultStyleResource;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return 0;
        }
    }

    @Nullable
    public final Fragment getFragment() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            z5j z5jVar = this.parentFragment;
            if (z5jVar == null) {
                return null;
            }
            return z5jVar.getSupportFragment();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @Nullable
    public final android.app.Fragment getNativeFragment() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            z5j z5jVar = this.parentFragment;
            if (z5jVar == null) {
                return null;
            }
            return z5jVar.getNativeFragment();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (ztb.m221490d(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return 0;
        }
    }

    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: h */
    public final void m7542h(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, new int[]{R.attr.drawableLeft, R.attr.drawableTop, R.attr.drawableRight, R.attr.drawableBottom, R.attr.drawablePadding}, defStyleAttr, defStyleRes);
            typedArrayObtainStyledAttributes.getClass();
            try {
                setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0), typedArrayObtainStyledAttributes.getResourceId(2, 0), typedArrayObtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                typedArrayObtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            ztb.m221488b(th2, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7543i(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, new int[]{R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom}, defStyleAttr, defStyleRes);
            typedArrayObtainStyledAttributes.getClass();
            try {
                setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7544j(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, new int[]{R.attr.textColor}, defStyleAttr, defStyleRes);
            typedArrayObtainStyledAttributes.getClass();
            try {
                setTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attrs, new int[]{R.attr.gravity}, defStyleAttr, defStyleRes);
                typedArrayObtainStyledAttributes2.getClass();
                try {
                    int i = typedArrayObtainStyledAttributes2.getInt(0, 17);
                    typedArrayObtainStyledAttributes2.recycle();
                    setGravity(i);
                    TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attrs, new int[]{R.attr.textSize, R.attr.textStyle, R.attr.text}, defStyleAttr, defStyleRes);
                    typedArrayObtainStyledAttributes3.getClass();
                    try {
                        setTextSize(0, typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String string = typedArrayObtainStyledAttributes3.getString(2);
                        typedArrayObtainStyledAttributes3.recycle();
                        setText(string);
                    } catch (Throwable th) {
                        typedArrayObtainStyledAttributes3.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        } catch (Throwable th4) {
            ztb.m221488b(th4, this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m7545k() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            super.setOnClickListener(new View.OnClickListener() { // from class: l.svf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FacebookButtonBase.m7535l(this.f170836a, view);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (isInEditMode()) {
                return;
            }
            m7538d(getContext());
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            canvas.getClass();
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int iMin = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - m7540f(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.overrideCompoundPaddingLeft = compoundPaddingLeft - iMin;
                this.overrideCompoundPaddingRight = compoundPaddingRight + iMin;
                this.overrideCompoundPadding = true;
            }
            super.onDraw(canvas);
            this.overrideCompoundPadding = false;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public final void setFragment(@NotNull android.app.Fragment fragment) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            fragment.getClass();
            this.parentFragment = new z5j(fragment);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public void setInternalOnClickListener(@Nullable View.OnClickListener l2) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            this.internalOnClickListener = l2;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener l2) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            this.externalOnClickListener = l2;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public final void setFragment(@NotNull Fragment fragment) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            fragment.getClass();
            this.parentFragment = new z5j(fragment);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}
