package com.clevertap.android.sdk.inapp.media;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qq3;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/widget/RelativeLayout;", "relativeLayout", "Ll/zom;", Constants.KEY_CONFIG, "Landroid/view/View$OnClickListener;", "clickListener", "", "setup", "(Landroid/widget/RelativeLayout;Ll/zom;Landroid/view/View$OnClickListener;)V", "cleanup", "()V", "Companion", "a", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface InAppMediaHandler extends DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5167a;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.media.InAppMediaHandler$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ]\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "", "currentOrientation", "", "c", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;I)Ljava/lang/String;", "Landroidx/fragment/app/Fragment;", "fragment", "", "isTablet", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "supportsStreamMedia", "Lkotlin/Function0;", "", "onActionClick", "lockedMediaUrl", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "a", "(Landroidx/fragment/app/Fragment;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;IZLcom/clevertap/android/sdk/inapp/images/FileResourceProvider;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f5167a = new Companion();

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0033  */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final InAppMediaHandler m6517a(@NotNull Fragment fragment, @NotNull CTInAppNotification inAppNotification, int currentOrientation, boolean isTablet, @NotNull FileResourceProvider resourceProvider, boolean supportsStreamMedia, @Nullable Function0<Unit> onActionClick, @Nullable String lockedMediaUrl) {
            CTInAppNotificationMedia cTInAppNotificationMediaM6173q;
            Object next;
            fragment.getClass();
            inAppNotification.getClass();
            resourceProvider.getClass();
            if (lockedMediaUrl != null) {
                Iterator<T> it = inAppNotification.m6177u().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.m87488d(((CTInAppNotificationMedia) next).getMediaUrl(), lockedMediaUrl));
                cTInAppNotificationMediaM6173q = (CTInAppNotificationMedia) next;
                if (cTInAppNotificationMediaM6173q == null) {
                    cTInAppNotificationMediaM6173q = inAppNotification.m6173q(currentOrientation);
                    if (cTInAppNotificationMediaM6173q == null && (cTInAppNotificationMediaM6173q = (CTInAppNotificationMedia) CollectionsKt.firstOrNull((List) inAppNotification.m6177u())) == null) {
                        return NoOpMediaHandler.INSTANCE;
                    }
                }
            } else {
                cTInAppNotificationMediaM6173q = inAppNotification.m6173q(currentOrientation);
                if (cTInAppNotificationMediaM6173q == null) {
                    return NoOpMediaHandler.INSTANCE;
                }
            }
            if (cTInAppNotificationMediaM6173q.m6200g()) {
                return new InAppImageHandler(cTInAppNotificationMediaM6173q, resourceProvider);
            }
            if (cTInAppNotificationMediaM6173q.m6199f()) {
                return new InAppGifHandler(cTInAppNotificationMediaM6173q, resourceProvider);
            }
            return ((cTInAppNotificationMediaM6173q.m6201h() || cTInAppNotificationMediaM6173q.m6198e()) && supportsStreamMedia) ? new InAppStreamMediaHandler(fragment, cTInAppNotificationMediaM6173q, isTablet, onActionClick) : NoOpMediaHandler.INSTANCE;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final String m6518c(@NotNull CTInAppNotification inAppNotification, int currentOrientation) {
            inAppNotification.getClass();
            CTInAppNotificationMedia cTInAppNotificationMediaM6173q = inAppNotification.m6173q(currentOrientation);
            if (cTInAppNotificationMediaM6173q == null) {
                cTInAppNotificationMediaM6173q = (CTInAppNotificationMedia) CollectionsKt.firstOrNull((List) inAppNotification.m6177u());
            }
            if (cTInAppNotificationMediaM6173q != null) {
                return cTInAppNotificationMediaM6173q.getMediaUrl();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.media.InAppMediaHandler$b */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1262b {
        /* JADX INFO: renamed from: a */
        public static void m6519a(@NotNull InAppMediaHandler inAppMediaHandler) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m6520b(InAppMediaHandler inAppMediaHandler, RelativeLayout relativeLayout, zom zomVar, View.OnClickListener onClickListener, int i, Object obj) {
            if (obj != null) {
                qq3.m175877a("Super calls with default arguments not supported in this target, function: setup");
                return;
            }
            if ((i & 4) != 0) {
                onClickListener = null;
            }
            inAppMediaHandler.setup(relativeLayout, zomVar, onClickListener);
        }
    }

    void cleanup();

    void setup(@Nullable RelativeLayout relativeLayout, @NotNull zom config, @Nullable View.OnClickListener clickListener);
}
