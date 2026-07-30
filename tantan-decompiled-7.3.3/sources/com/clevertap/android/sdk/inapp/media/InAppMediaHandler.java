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
import p153l.brm;
import p153l.pr3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/widget/RelativeLayout;", "relativeLayout", "Ll/brm;", Constants.KEY_CONFIG, "Landroid/view/View$OnClickListener;", "clickListener", "", "setup", "(Landroid/widget/RelativeLayout;Ll/brm;Landroid/view/View$OnClickListener;)V", "cleanup", "()V", "Companion", "a", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface InAppMediaHandler extends DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5204a;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.media.InAppMediaHandler$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ]\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "", "currentOrientation", "", "c", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;I)Ljava/lang/String;", "Landroidx/fragment/app/Fragment;", "fragment", "", "isTablet", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "supportsStreamMedia", "Lkotlin/Function0;", "", "onActionClick", "lockedMediaUrl", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "a", "(Landroidx/fragment/app/Fragment;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;IZLcom/clevertap/android/sdk/inapp/images/FileResourceProvider;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f5204a = new Companion();

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0033  */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final InAppMediaHandler m6571a(@NotNull Fragment fragment, @NotNull CTInAppNotification inAppNotification, int currentOrientation, boolean isTablet, @NotNull FileResourceProvider resourceProvider, boolean supportsStreamMedia, @Nullable Function0<Unit> onActionClick, @Nullable String lockedMediaUrl) {
            CTInAppNotificationMedia cTInAppNotificationMediaM6227q;
            Object next;
            fragment.getClass();
            inAppNotification.getClass();
            resourceProvider.getClass();
            if (lockedMediaUrl != null) {
                Iterator<T> it = inAppNotification.m6231u().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.m88377d(((CTInAppNotificationMedia) next).getMediaUrl(), lockedMediaUrl));
                cTInAppNotificationMediaM6227q = (CTInAppNotificationMedia) next;
                if (cTInAppNotificationMediaM6227q == null) {
                    cTInAppNotificationMediaM6227q = inAppNotification.m6227q(currentOrientation);
                    if (cTInAppNotificationMediaM6227q == null && (cTInAppNotificationMediaM6227q = (CTInAppNotificationMedia) CollectionsKt.firstOrNull((List) inAppNotification.m6231u())) == null) {
                        return NoOpMediaHandler.INSTANCE;
                    }
                }
            } else {
                cTInAppNotificationMediaM6227q = inAppNotification.m6227q(currentOrientation);
                if (cTInAppNotificationMediaM6227q == null) {
                    return NoOpMediaHandler.INSTANCE;
                }
            }
            if (cTInAppNotificationMediaM6227q.m6254g()) {
                return new InAppImageHandler(cTInAppNotificationMediaM6227q, resourceProvider);
            }
            if (cTInAppNotificationMediaM6227q.m6253f()) {
                return new InAppGifHandler(cTInAppNotificationMediaM6227q, resourceProvider);
            }
            return ((cTInAppNotificationMediaM6227q.m6255h() || cTInAppNotificationMediaM6227q.m6252e()) && supportsStreamMedia) ? new InAppStreamMediaHandler(fragment, cTInAppNotificationMediaM6227q, isTablet, onActionClick) : NoOpMediaHandler.INSTANCE;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final String m6572c(@NotNull CTInAppNotification inAppNotification, int currentOrientation) {
            inAppNotification.getClass();
            CTInAppNotificationMedia cTInAppNotificationMediaM6227q = inAppNotification.m6227q(currentOrientation);
            if (cTInAppNotificationMediaM6227q == null) {
                cTInAppNotificationMediaM6227q = (CTInAppNotificationMedia) CollectionsKt.firstOrNull((List) inAppNotification.m6231u());
            }
            if (cTInAppNotificationMediaM6227q != null) {
                return cTInAppNotificationMediaM6227q.getMediaUrl();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.media.InAppMediaHandler$b */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1285b {
        /* JADX INFO: renamed from: a */
        public static void m6573a(@NotNull InAppMediaHandler inAppMediaHandler) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m6574b(InAppMediaHandler inAppMediaHandler, RelativeLayout relativeLayout, brm brmVar, View.OnClickListener onClickListener, int i, Object obj) {
            if (obj != null) {
                pr3.m173429a("Super calls with default arguments not supported in this target, function: setup");
                return;
            }
            if ((i & 4) != 0) {
                onClickListener = null;
            }
            inAppMediaHandler.setup(relativeLayout, brmVar, onClickListener);
        }
    }

    void cleanup();

    void setup(@Nullable RelativeLayout relativeLayout, @NotNull brm config, @Nullable View.OnClickListener clickListener);
}
