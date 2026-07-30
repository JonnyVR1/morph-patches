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
import com.p046p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.apm;
import p149l.cd50;
import p149l.jcr;
import p149l.lw3;
import p149l.mqm;
import p149l.nqm;
import p149l.rtm;
import p149l.t5l0;
import p149l.tgx;
import p149l.u8f;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u00011\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ+\u0010\u0019\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010$R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/media/InAppStreamMediaHandler;", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "media", "", "isTablet", "Lkotlin/Function0;", "", "onActionClick", "<init>", "(Landroidx/fragment/app/Fragment;Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;ZLkotlin/jvm/functions/Function0;)V", "prepareMedia", "()V", "playMedia", "addViewsForStreamMedia", "closeFullscreenDialog", "openFullscreenDialog", "Landroid/widget/RelativeLayout;", "relativeLayout", "Ll/zom;", Constants.KEY_CONFIG, "Landroid/view/View$OnClickListener;", "clickListener", "setup", "(Landroid/widget/RelativeLayout;Ll/zom;Landroid/view/View$OnClickListener;)V", "Ll/jcr;", Owner.TYPE, "onResume", "(Ll/jcr;)V", "onPause", "onStop", "cleanup", "Landroidx/fragment/app/Fragment;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Z", "Lkotlin/jvm/functions/Function0;", "Ll/nqm;", "handle", "Ll/nqm;", "Landroid/widget/FrameLayout;", "videoFrameLayout", "Landroid/widget/FrameLayout;", "Landroidx/activity/ComponentDialog;", "fullScreenDialog", "Landroidx/activity/ComponentDialog;", "videoFrameInDialog", "exoPlayerFullscreen", "com/clevertap/android/sdk/inapp/media/InAppStreamMediaHandler$a", "onBackPressedCallback", "Lcom/clevertap/android/sdk/inapp/media/InAppStreamMediaHandler$a;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class InAppStreamMediaHandler implements InAppMediaHandler {
    private boolean exoPlayerFullscreen;

    @NotNull
    private final Fragment fragment;

    @Nullable
    private ComponentDialog fullScreenDialog;

    @Nullable
    private nqm handle;
    private final boolean isTablet;

    @NotNull
    private final CTInAppNotificationMedia media;

    @Nullable
    private final Function0<Unit> onActionClick;

    @NotNull
    private final C1263a onBackPressedCallback;

    @Nullable
    private FrameLayout videoFrameInDialog;

    @Nullable
    private FrameLayout videoFrameLayout;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.media.InAppStreamMediaHandler$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/inapp/media/InAppStreamMediaHandler$a", "Ll/cd50;", "", "handleOnBackPressed", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1263a extends cd50 {
        public C1263a() {
            super(false);
        }

        @Override // p149l.cd50
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
        this.onBackPressedCallback = new C1263a();
        nqm nqmVarM155958a = mqm.INSTANCE.m155958a();
        this.handle = nqmVarM155958a == null ? t5l0.mediaLibType == VideoLibraryIntegrated.MEDIA3 ? new tgx() : new u8f() : nqmVarM155958a;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m6521a(Function0 function0) {
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
        nqm nqmVar = this.handle;
        if (nqmVar == null) {
            return;
        }
        View viewMo160625a = nqmVar.mo160625a();
        viewMo160625a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (viewMo160625a.getParent() != null || (frameLayout = this.videoFrameLayout) == null) {
            return;
        }
        frameLayout.addView(viewMo160625a);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6522b(rtm rtmVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        rtmVar.getClass();
        marginLayoutParams.getClass();
        marginLayoutParams.leftMargin = rtmVar.f160972a;
        marginLayoutParams.topMargin = rtmVar.f160973b;
        marginLayoutParams.rightMargin = rtmVar.f160974c;
        marginLayoutParams.bottomMargin = rtmVar.f160975d;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m6523c(InAppStreamMediaHandler inAppStreamMediaHandler, boolean z) {
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
        nqm nqmVar = this.handle;
        if (nqmVar == null) {
            return;
        }
        View viewMo160625a = nqmVar.mo160625a();
        nqmVar.mo160630f(false);
        FrameLayout frameLayout = this.videoFrameInDialog;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.videoFrameLayout;
        if (frameLayout2 != null) {
            frameLayout2.addView(viewMo160625a);
        }
        this.exoPlayerFullscreen = false;
        ComponentDialog componentDialog = this.fullScreenDialog;
        if (componentDialog != null) {
            componentDialog.dismiss();
        }
    }

    private final void openFullscreenDialog() {
        nqm nqmVar = this.handle;
        if (nqmVar == null) {
            return;
        }
        View viewMo160625a = nqmVar.mo160625a();
        nqmVar.mo160630f(true);
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
            lw3.m151933c(frameLayout2, new Function2() { // from class: l.jqm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InAppStreamMediaHandler.m6522b((rtm) obj, (ViewGroup.MarginLayoutParams) obj2);
                }
            });
            FragmentActivity activity = this.fragment.getActivity();
            if (activity != null) {
                componentDialog.getOnBackPressedDispatcher().m195a(activity, this.onBackPressedCallback);
            }
        }
        FrameLayout frameLayout3 = this.videoFrameInDialog;
        if (frameLayout3 != null) {
            frameLayout3.addView(viewMo160625a);
        }
        this.exoPlayerFullscreen = true;
        ComponentDialog componentDialog2 = this.fullScreenDialog;
        if (componentDialog2 != null) {
            componentDialog2.show();
        }
    }

    private final void playMedia() {
        nqm nqmVar = this.handle;
        if (nqmVar != null) {
            nqmVar.play();
        }
    }

    private final void prepareMedia() {
        nqm nqmVar = this.handle;
        if (nqmVar == null) {
            return;
        }
        Context contextRequireContext = this.fragment.requireContext();
        contextRequireContext.getClass();
        nqmVar.mo160633i(contextRequireContext, this.isTablet);
        nqmVar.mo160632h(new Function1() { // from class: l.kqm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InAppStreamMediaHandler.m6523c(this.f124280a, ((Boolean) obj).booleanValue());
            }
        });
        nqmVar.mo160631g();
        final Function0<Unit> function0 = this.onActionClick;
        if (function0 != null) {
            nqmVar.mo160627c(new Function0() { // from class: l.lqm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InAppStreamMediaHandler.m6521a(function0);
                }
            });
        }
        addViewsForStreamMedia();
        Context contextRequireContext2 = this.fragment.requireContext();
        contextRequireContext2.getClass();
        nqmVar.mo160629e(contextRequireContext2, this.media.getMediaUrl());
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void cleanup() {
        nqm nqmVar = this.handle;
        if (nqmVar != null) {
            nqmVar.pause();
        }
        mqm.INSTANCE.m155960c();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull jcr owner) {
        owner.getClass();
        FragmentActivity activity = this.fragment.getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            nqm nqmVar = this.handle;
            if (nqmVar != null) {
                nqmVar.mo160626b();
                return;
            }
            return;
        }
        boolean z = this.exoPlayerFullscreen;
        if (z) {
            closeFullscreenDialog();
            this.onBackPressedCallback.setEnabled(false);
        }
        nqm nqmVar2 = this.handle;
        if (nqmVar2 == null) {
            return;
        }
        nqmVar2.mo160628d();
        mqm.INSTANCE.m155961d(nqmVar2, z);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull jcr owner) {
        owner.getClass();
        prepareMedia();
        playMedia();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull jcr owner) {
        nqm nqmVar;
        owner.getClass();
        FragmentActivity activity = this.fragment.getActivity();
        if ((activity == null || !activity.isChangingConfigurations()) && (nqmVar = this.handle) != null) {
            nqmVar.mo160626b();
        }
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void setup(@Nullable RelativeLayout relativeLayout, @NotNull zom config, @Nullable View.OnClickListener clickListener) {
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
        if (mqm.INSTANCE.m155959b()) {
            this.onBackPressedCallback.setEnabled(true);
            openFullscreenDialog();
        }
        FrameLayout frameLayout = this.videoFrameLayout;
        if (frameLayout != null) {
            apm.m98143a(frameLayout, this.media.getContentDescription());
        }
    }

    public /* synthetic */ InAppStreamMediaHandler(Fragment fragment, CTInAppNotificationMedia cTInAppNotificationMedia, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, cTInAppNotificationMedia, z, (i & 8) != 0 ? null : function0);
    }
}
