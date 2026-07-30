package com.clevertap.android.sdk.inapp.media;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.ComponentDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.media.InAppStreamMediaHandler;
import com.clevertap.android.sdk.video.VideoLibraryIntegrated;
import com.p051p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aaf;
import p153l.brm;
import p153l.crm;
import p153l.jl50;
import p153l.ker;
import p153l.kx3;
import p153l.osm;
import p153l.psm;
import p153l.rpx;
import p153l.svm;
import p153l.xel0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u00011\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ+\u0010\u0019\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010$R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/media/InAppStreamMediaHandler;", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "media", "", "isTablet", "Lkotlin/Function0;", "", "onActionClick", "<init>", "(Landroidx/fragment/app/Fragment;Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;ZLkotlin/jvm/functions/Function0;)V", "prepareMedia", "()V", "playMedia", "addViewsForStreamMedia", "closeFullscreenDialog", "openFullscreenDialog", "Landroid/widget/RelativeLayout;", "relativeLayout", "Ll/brm;", Constants.KEY_CONFIG, "Landroid/view/View$OnClickListener;", "clickListener", "setup", "(Landroid/widget/RelativeLayout;Ll/brm;Landroid/view/View$OnClickListener;)V", "Ll/ker;", Owner.TYPE, "onResume", "(Ll/ker;)V", "onPause", "onStop", "cleanup", "Landroidx/fragment/app/Fragment;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Z", "Lkotlin/jvm/functions/Function0;", "Ll/psm;", "handle", "Ll/psm;", "Landroid/widget/FrameLayout;", "videoFrameLayout", "Landroid/widget/FrameLayout;", "Landroidx/activity/ComponentDialog;", "fullScreenDialog", "Landroidx/activity/ComponentDialog;", "videoFrameInDialog", "exoPlayerFullscreen", "com/clevertap/android/sdk/inapp/media/InAppStreamMediaHandler$a", "onBackPressedCallback", "Lcom/clevertap/android/sdk/inapp/media/InAppStreamMediaHandler$a;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class InAppStreamMediaHandler implements InAppMediaHandler {
    private boolean exoPlayerFullscreen;

    @NotNull
    private final Fragment fragment;

    @Nullable
    private ComponentDialog fullScreenDialog;

    @Nullable
    private psm handle;
    private final boolean isTablet;

    @NotNull
    private final CTInAppNotificationMedia media;

    @Nullable
    private final Function0<Unit> onActionClick;

    @NotNull
    private final C1286a onBackPressedCallback;

    @Nullable
    private FrameLayout videoFrameInDialog;

    @Nullable
    private FrameLayout videoFrameLayout;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.media.InAppStreamMediaHandler$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/clevertap/android/sdk/inapp/media/InAppStreamMediaHandler$a", "Ll/jl50;", "", "handleOnBackPressed", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1286a extends jl50 {
        public C1286a() {
            super(false);
        }

        @Override // p153l.jl50
        public void handleOnBackPressed() {
            if (InAppStreamMediaHandler.this.exoPlayerFullscreen) {
                InAppStreamMediaHandler.this.closeFullscreenDialog();
                setEnabled(false);
            }
        }
    }

    public InAppStreamMediaHandler(@NotNull Fragment fragment, @NotNull CTInAppNotificationMedia cTInAppNotificationMedia, boolean z, @Nullable Function0<Unit> function0) {
        fragment.getClass();
        cTInAppNotificationMedia.getClass();
        this.fragment = fragment;
        this.media = cTInAppNotificationMedia;
        this.isTablet = z;
        this.onActionClick = function0;
        this.onBackPressedCallback = new C1286a();
        psm psmVarM169054a = osm.INSTANCE.m169054a();
        this.handle = psmVarM169054a == null ? xel0.mediaLibType == VideoLibraryIntegrated.MEDIA3 ? new rpx() : new aaf() : psmVarM169054a;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m6575a(Function0 function0) {
        function0.getClass();
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void addViewsForStreamMedia() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.videoFrameLayout;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        psm psmVar = this.handle;
        if (psmVar == null) {
            return;
        }
        View viewMo96635a = psmVar.mo96635a();
        viewMo96635a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (viewMo96635a.getParent() != null || (frameLayout = this.videoFrameLayout) == null) {
            return;
        }
        frameLayout.addView(viewMo96635a);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6576b(svm svmVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        svmVar.getClass();
        marginLayoutParams.getClass();
        marginLayoutParams.leftMargin = svmVar.f170857a;
        marginLayoutParams.topMargin = svmVar.f170858b;
        marginLayoutParams.rightMargin = svmVar.f170859c;
        marginLayoutParams.bottomMargin = svmVar.f170860d;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m6577c(InAppStreamMediaHandler inAppStreamMediaHandler, boolean z) {
        inAppStreamMediaHandler.getClass();
        if (inAppStreamMediaHandler.exoPlayerFullscreen) {
            inAppStreamMediaHandler.closeFullscreenDialog();
            inAppStreamMediaHandler.onBackPressedCallback.setEnabled(false);
        } else {
            inAppStreamMediaHandler.onBackPressedCallback.setEnabled(true);
            inAppStreamMediaHandler.openFullscreenDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeFullscreenDialog() {
        psm psmVar = this.handle;
        if (psmVar == null) {
            return;
        }
        View viewMo96635a = psmVar.mo96635a();
        psmVar.mo96640f(false);
        FrameLayout frameLayout = this.videoFrameInDialog;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.videoFrameLayout;
        if (frameLayout2 != null) {
            frameLayout2.addView(viewMo96635a);
        }
        this.exoPlayerFullscreen = false;
        ComponentDialog componentDialog = this.fullScreenDialog;
        if (componentDialog != null) {
            componentDialog.dismiss();
        }
    }

    private final void openFullscreenDialog() {
        psm psmVar = this.handle;
        if (psmVar == null) {
            return;
        }
        View viewMo96635a = psmVar.mo96635a();
        psmVar.mo96640f(true);
        FrameLayout frameLayout = this.videoFrameLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (this.fullScreenDialog == null) {
            Context contextRequireContext = this.fragment.requireContext();
            contextRequireContext.getClass();
            ComponentDialog componentDialog = new ComponentDialog(contextRequireContext, R.style.Theme.Black.NoTitleBar.Fullscreen);
            this.fullScreenDialog = componentDialog;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
            this.videoFrameInDialog = frameLayout2;
            componentDialog.addContentView(frameLayout2, layoutParams);
            kx3.m151782c(frameLayout2, new Function2() { // from class: l.lsm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InAppStreamMediaHandler.m6576b((svm) obj, (ViewGroup.MarginLayoutParams) obj2);
                }
            });
            FragmentActivity activity = this.fragment.getActivity();
            if (activity != null) {
                componentDialog.getOnBackPressedDispatcher().m196a(activity, this.onBackPressedCallback);
            }
        }
        FrameLayout frameLayout3 = this.videoFrameInDialog;
        if (frameLayout3 != null) {
            frameLayout3.addView(viewMo96635a);
        }
        this.exoPlayerFullscreen = true;
        ComponentDialog componentDialog2 = this.fullScreenDialog;
        if (componentDialog2 != null) {
            componentDialog2.show();
        }
    }

    private final void playMedia() {
        psm psmVar = this.handle;
        if (psmVar != null) {
            psmVar.play();
        }
    }

    private final void prepareMedia() {
        psm psmVar = this.handle;
        if (psmVar == null) {
            return;
        }
        Context contextRequireContext = this.fragment.requireContext();
        contextRequireContext.getClass();
        psmVar.mo96643i(contextRequireContext, this.isTablet);
        psmVar.mo96642h(new Function1() { // from class: l.msm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InAppStreamMediaHandler.m6577c(this.f138497a, ((Boolean) obj).booleanValue());
            }
        });
        psmVar.mo96641g();
        final Function0<Unit> function0 = this.onActionClick;
        if (function0 != null) {
            psmVar.mo96637c(new Function0() { // from class: l.nsm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InAppStreamMediaHandler.m6575a(function0);
                }
            });
        }
        addViewsForStreamMedia();
        Context contextRequireContext2 = this.fragment.requireContext();
        contextRequireContext2.getClass();
        psmVar.mo96639e(contextRequireContext2, this.media.getMediaUrl());
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void cleanup() {
        psm psmVar = this.handle;
        if (psmVar != null) {
            psmVar.pause();
        }
        osm.INSTANCE.m169056c();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull ker owner) {
        owner.getClass();
        FragmentActivity activity = this.fragment.getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            psm psmVar = this.handle;
            if (psmVar != null) {
                psmVar.mo96636b();
                return;
            }
            return;
        }
        boolean z = this.exoPlayerFullscreen;
        if (z) {
            closeFullscreenDialog();
            this.onBackPressedCallback.setEnabled(false);
        }
        psm psmVar2 = this.handle;
        if (psmVar2 == null) {
            return;
        }
        psmVar2.mo96638d();
        osm.INSTANCE.m169057d(psmVar2, z);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull ker owner) {
        owner.getClass();
        prepareMedia();
        playMedia();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull ker owner) {
        psm psmVar;
        owner.getClass();
        FragmentActivity activity = this.fragment.getActivity();
        if ((activity == null || !activity.isChangingConfigurations()) && (psmVar = this.handle) != null) {
            psmVar.mo96636b();
        }
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void setup(@Nullable RelativeLayout relativeLayout, @NotNull brm config, @Nullable View.OnClickListener clickListener) {
        ImageView imageView;
        config.getClass();
        if (config.getVideoFrameId() != 0) {
            this.videoFrameLayout = relativeLayout != null ? (FrameLayout) relativeLayout.findViewById(config.getVideoFrameId()) : null;
        }
        if (relativeLayout != null && (imageView = (ImageView) relativeLayout.findViewById(config.getImageViewId())) != null) {
            imageView.setVisibility(8);
        }
        prepareMedia();
        playMedia();
        if (osm.INSTANCE.m169055b()) {
            this.onBackPressedCallback.setEnabled(true);
            openFullscreenDialog();
        }
        FrameLayout frameLayout = this.videoFrameLayout;
        if (frameLayout != null) {
            crm.m112083a(frameLayout, this.media.getContentDescription());
        }
    }

    public /* synthetic */ InAppStreamMediaHandler(Fragment fragment, CTInAppNotificationMedia cTInAppNotificationMedia, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, cTInAppNotificationMedia, z, (i & 8) != 0 ? null : function0);
    }
}
