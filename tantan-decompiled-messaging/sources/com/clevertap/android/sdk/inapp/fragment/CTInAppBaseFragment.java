package com.clevertap.android.sdk.inapp.fragment;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.InAppActionType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.media.InAppMediaHandler;
import com.clevertap.android.sdk.inapp.media.NoOpMediaHandler;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.avj0;
import p149l.b2s;
import p149l.yom;
import p149l.z0e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 o2\u00020\u0001:\u0002pqB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H$¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0010H$¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ!\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b/\u0010\u001cJ\u0017\u00100\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b0\u0010\u001cJ\u000f\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u000201¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u0002072\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u000207¢\u0006\u0004\b<\u0010=J\r\u0010?\u001a\u00020>¢\u0006\u0004\b?\u0010@R\"\u0010$\u001a\u00020#8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010&\u001a\u00020%8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010R\u001a\u0002078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010=R$\u0010Z\u001a\u0004\u0018\u00010S8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010`\u001a\u0004\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010-R\"\u0010f\u001a\u00020\u00138\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010\u0015\"\u0004\bd\u0010eR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006r"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "button", "Landroid/os/Bundle;", "X3", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;)Landroid/os/Bundle;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "action", "", "callToAction", "additionalData", "k4", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "", "V3", "a4", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/View;", OMSTemplateModeType.view, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "n4", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "t4", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;)V", "url", "l4", "(Ljava/lang/String;)V", "data", "Y3", "Z3", "Ll/yom;", "g4", "()Ll/yom;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "r4", "(Ll/yom;)V", "", "raw", "i4", "(I)I", FirebaseAnalytics.Param.INDEX, "j4", "(I)V", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "m4", "()Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", BaseSei.f13932Z, "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "f4", "()Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "q4", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "A", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "d4", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p4", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "B", "I", "e4", "()I", "setCurrentOrientation", "currentOrientation", "Lcom/clevertap/android/sdk/customviews/CloseImageView;", b2s.C_ZONE, "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "c4", "()Lcom/clevertap/android/sdk/customviews/CloseImageView;", "o4", "(Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "closeImageView", "D", "Ljava/lang/String;", "b4", "()Ljava/lang/String;", "setActiveMediaUrl", "activeMediaUrl", "E", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "h4", "s4", "(Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;)V", "mediaHandler", "Ljava/lang/ref/WeakReference;", "F", "Ljava/lang/ref/WeakReference;", "listenerWeakReference", "Ll/z0e;", "G", "Ll/z0e;", "didClickForHardPermissionListener", "Companion", "b", "a", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class CTInAppBaseFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    protected CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int currentOrientation;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private CloseImageView closeImageView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private String activeMediaUrl;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    protected InAppMediaHandler mediaHandler;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private WeakReference<yom> listenerWeakReference;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private z0e didClickForHardPermissionListener;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    protected CTInAppNotification inAppNotification;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment$a */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment$a;", "Landroid/view/View$OnClickListener;", "<init>", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "onClick", "(Landroid/view/View;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public final class ViewOnClickListenerC1241a implements View.OnClickListener {
        public ViewOnClickListenerC1241a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            view.getClass();
            Object tag = view.getTag();
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num != null) {
                CTInAppBaseFragment.this.m6398j4(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment$b;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "inAppFragment", "Landroid/app/Activity;", "activity", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "", "logTag", "", "a", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;Landroid/app/Activity;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/lang/String;)Z", "KEY_ACTIVE_MEDIA_URL", "Ljava/lang/String;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6408a(@NotNull CTInAppBaseFragment inAppFragment, @NotNull Activity activity, @NotNull CTInAppNotification inAppNotification, @NotNull CleverTapInstanceConfig config, @NotNull String logTag) {
            inAppFragment.getClass();
            activity.getClass();
            inAppNotification.getClass();
            config.getClass();
            logTag.getClass();
            try {
                AbstractC0427k abstractC0427kM2567m = ((FragmentActivity) activity).getSupportFragmentManager().m2567m();
                abstractC0427kM2567m.getClass();
                inAppFragment.m6401n4(inAppNotification, config);
                abstractC0427kM2567m.m2813u(R.animator.fade_in, R.animator.fade_out);
                abstractC0427kM2567m.m2804c(R.id.content, inAppFragment, inAppNotification.getType());
                Logger.m5874v(logTag, "calling InAppFragment " + inAppNotification.getCampaignId());
                abstractC0427kM2567m.mo2709k();
                return true;
            } catch (ClassCastException e) {
                Logger.m5875v(logTag, "Fragment not able to render, please ensure your Activity is an instance of AppCompatActivity", e);
                return false;
            } catch (Throwable th) {
                Logger.m5875v(logTag, "Fragment not able to render", th);
                return false;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: X3 */
    private final Bundle m6383X3(CTInAppNotificationButton button) {
        CTInAppAction cTInAppActionM6130a = button.action;
        if (cTInAppActionM6130a == null) {
            cTInAppActionM6130a = CTInAppAction.INSTANCE.m6130a();
        }
        return m6384k4(cTInAppActionM6130a, button.getText(), null);
    }

    /* JADX INFO: renamed from: k4 */
    private final Bundle m6384k4(CTInAppAction action, String callToAction, Bundle additionalData) {
        yom yomVarM6395g4 = m6395g4();
        if (yomVarM6395g4 != null) {
            return yomVarM6395g4.mo5864y0(m6394f4(), action, callToAction, additionalData, getActivity());
        }
        return null;
    }

    /* JADX INFO: renamed from: V3 */
    public abstract void mo6385V3();

    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6386W3() {
        return NoOpMediaHandler.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m6387Y3(@Nullable Bundle data) {
        mo6385V3();
        yom yomVarM6395g4 = m6395g4();
        if (yomVarM6395g4 != null) {
            yomVarM6395g4.mo5854J(m6394f4(), data);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m6388Z3(@Nullable Bundle data) {
        yom yomVarM6395g4 = m6395g4();
        if (yomVarM6395g4 != null) {
            yomVarM6395g4.mo5863s0(m6394f4(), data);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public abstract void mo6389a4();

    @Nullable
    /* JADX INFO: renamed from: b4, reason: from getter */
    public final String getActiveMediaUrl() {
        return this.activeMediaUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: c4, reason: from getter */
    public final CloseImageView getCloseImageView() {
        return this.closeImageView;
    }

    @NotNull
    /* JADX INFO: renamed from: d4 */
    public final CleverTapInstanceConfig m6392d4() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.config;
        if (cleverTapInstanceConfig != null) {
            return cleverTapInstanceConfig;
        }
        Intrinsics.m87502r(Constants.KEY_CONFIG);
        return null;
    }

    /* JADX INFO: renamed from: e4, reason: from getter */
    public final int getCurrentOrientation() {
        return this.currentOrientation;
    }

    @NotNull
    /* JADX INFO: renamed from: f4 */
    public final CTInAppNotification m6394f4() {
        CTInAppNotification cTInAppNotification = this.inAppNotification;
        if (cTInAppNotification != null) {
            return cTInAppNotification;
        }
        Intrinsics.m87502r("inAppNotification");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g4 */
    public final yom m6395g4() {
        WeakReference<yom> weakReference = this.listenerWeakReference;
        yom yomVar = weakReference != null ? weakReference.get() : null;
        if (yomVar == null) {
            m6392d4().getLogger().verbose(m6392d4().getAccountId(), "InAppListener is null for notification: " + m6394f4().m6175s());
        }
        return yomVar;
    }

    @NotNull
    /* JADX INFO: renamed from: h4 */
    public final InAppMediaHandler m6396h4() {
        InAppMediaHandler inAppMediaHandler = this.mediaHandler;
        if (inAppMediaHandler != null) {
            return inAppMediaHandler;
        }
        Intrinsics.m87502r("mediaHandler");
        return null;
    }

    /* JADX INFO: renamed from: i4 */
    public final int m6397i4(int raw) {
        return (int) TypedValue.applyDimension(1, raw, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: j4 */
    public final void m6398j4(int index) {
        z0e z0eVar;
        z0e z0eVar2;
        try {
            CTInAppNotificationButton cTInAppNotificationButton = m6394f4().m6163f().get(index);
            Bundle bundleM6383X3 = m6383X3(cTInAppNotificationButton);
            if (m6394f4().getIsLocalInApp() && (z0eVar2 = this.didClickForHardPermissionListener) != null) {
                if (index == 0) {
                    if (z0eVar2 != null) {
                        z0eVar2.mo5858P(m6394f4().getFallBackToNotificationSettings());
                        return;
                    }
                    return;
                } else if (index == 1 && z0eVar2 != null) {
                    z0eVar2.mo5853H();
                }
            }
            CTInAppAction cTInAppAction = cTInAppNotificationButton.action;
            if (cTInAppAction == null || InAppActionType.REQUEST_FOR_PERMISSIONS != cTInAppAction.getType() || (z0eVar = this.didClickForHardPermissionListener) == null) {
                m6387Y3(bundleM6383X3);
            } else if (z0eVar != null) {
                z0eVar.mo5858P(cTInAppAction.getShouldFallbackToSettings());
            }
        } catch (Throwable th) {
            m6392d4().getLogger().debug("Error handling notification button click", th);
            m6387Y3(null);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m6399l4(@NotNull String url) throws UnsupportedEncodingException {
        url.getClass();
        m6407t4(CTInAppAction.INSTANCE.m6133d(url), null, null);
    }

    @NotNull
    /* JADX INFO: renamed from: m4 */
    public final FileResourceProvider m6400m4() {
        FileResourceProvider.Companion c1256a = FileResourceProvider.INSTANCE;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return c1256a.m6502a(contextRequireContext, m6392d4().getLogger());
    }

    /* JADX INFO: renamed from: n4 */
    public final void m6401n4(@NotNull CTInAppNotification inAppNotification, @NotNull CleverTapInstanceConfig config) {
        inAppNotification.getClass();
        config.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("inApp", inAppNotification);
        bundle.putParcelable(Constants.KEY_CONFIG, config);
        setArguments(bundle);
    }

    /* JADX INFO: renamed from: o4 */
    public final void m6402o4(@Nullable CloseImageView closeImageView) {
        this.closeImageView = closeImageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        context.getClass();
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("inApp");
            parcelable.getClass();
            m6404q4((CTInAppNotification) parcelable);
            Parcelable parcelable2 = arguments.getParcelable(Constants.KEY_CONFIG);
            parcelable2.getClass();
            m6403p4((CleverTapInstanceConfig) parcelable2);
            this.currentOrientation = getResources().getConfiguration().orientation;
            mo6389a4();
            if (context instanceof z0e) {
                this.didClickForHardPermissionListener = (z0e) context;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String strM6518c;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null || (strM6518c = savedInstanceState.getString("ct_active_media_url")) == null) {
            strM6518c = InAppMediaHandler.INSTANCE.m6518c(m6394f4(), this.currentOrientation);
        }
        this.activeMediaUrl = strM6518c;
        m6406s4(mo6386W3());
        getLifecycle().mo2966a(m6396h4());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        super.onSaveInstanceState(outState);
        String str = this.activeMediaUrl;
        if (str != null) {
            outState.putString("ct_active_media_url", str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        m6388Z3(null);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m6403p4(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig) {
        cleverTapInstanceConfig.getClass();
        this.config = cleverTapInstanceConfig;
    }

    /* JADX INFO: renamed from: q4 */
    public final void m6404q4(@NotNull CTInAppNotification cTInAppNotification) {
        cTInAppNotification.getClass();
        this.inAppNotification = cTInAppNotification;
    }

    /* JADX INFO: renamed from: r4 */
    public final void m6405r4(@NotNull yom listener) {
        listener.getClass();
        this.listenerWeakReference = new WeakReference<>(listener);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m6406s4(@NotNull InAppMediaHandler inAppMediaHandler) {
        inAppMediaHandler.getClass();
        this.mediaHandler = inAppMediaHandler;
    }

    /* JADX INFO: renamed from: t4 */
    public final void m6407t4(@NotNull CTInAppAction action, @Nullable String callToAction, @Nullable Bundle additionalData) throws UnsupportedEncodingException {
        action.getClass();
        if (action.getType() == InAppActionType.OPEN_URL) {
            Bundle bundleM99193a = avj0.m99193a(action.getActionUrl(), false);
            String string = bundleM99193a.getString(Constants.KEY_C2A);
            bundleM99193a.remove(Constants.KEY_C2A);
            if (additionalData != null) {
                bundleM99193a.putAll(additionalData);
            }
            if (string != null) {
                List listSplit$default = StringsKt.split$default(string, new String[]{Constants.URL_PARAM_DL_SEPARATOR}, false, 0, 6, null);
                if (listSplit$default.size() == 2) {
                    try {
                        string = URLDecoder.decode((String) listSplit$default.get(0), "UTF-8");
                    } catch (Exception e) {
                        m6392d4().getLogger().debug("Error parsing c2a param", e);
                    }
                    action = CTInAppAction.INSTANCE.m6133d((String) listSplit$default.get(1));
                }
            }
            additionalData = bundleM99193a;
            if (callToAction == null) {
                callToAction = string;
            }
        }
        if (callToAction == null) {
            callToAction = "";
        }
        m6387Y3(m6384k4(action, callToAction, additionalData));
    }
}
