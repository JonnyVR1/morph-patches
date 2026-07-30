package com.clevertap.android.sdk.inapp.fragment;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.AbstractC0428k;
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
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
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
import p153l.arm;
import p153l.c4s;
import p153l.d4k0;
import p153l.n2e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 o2\u00020\u0001:\u0002pqB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H$¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0010H$¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ!\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b/\u0010\u001cJ\u0017\u00100\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b0\u0010\u001cJ\u000f\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u000201¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u0002072\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u000207¢\u0006\u0004\b<\u0010=J\r\u0010?\u001a\u00020>¢\u0006\u0004\b?\u0010@R\"\u0010$\u001a\u00020#8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010&\u001a\u00020%8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010R\u001a\u0002078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010=R$\u0010Z\u001a\u0004\u0018\u00010S8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010`\u001a\u0004\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010-R\"\u0010f\u001a\u00020\u00138\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010\u0015\"\u0004\bd\u0010eR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006r"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "button", "Landroid/os/Bundle;", "X3", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;)Landroid/os/Bundle;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "action", "", "callToAction", "additionalData", "k4", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "", "V3", "a4", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/View;", OMSTemplateModeType.view, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "n4", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "t4", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;)V", "url", "l4", "(Ljava/lang/String;)V", "data", "Y3", "Z3", "Ll/arm;", "g4", "()Ll/arm;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "r4", "(Ll/arm;)V", "", "raw", "i4", "(I)I", FirebaseAnalytics.Param.INDEX, "j4", "(I)V", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "m4", "()Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", BaseSei.f14626Z, "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "f4", "()Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "q4", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "A", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "d4", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p4", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "B", "I", "e4", "()I", "setCurrentOrientation", "currentOrientation", "Lcom/clevertap/android/sdk/customviews/CloseImageView;", c4s.C_ZONE, "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "c4", "()Lcom/clevertap/android/sdk/customviews/CloseImageView;", "o4", "(Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "closeImageView", "D", "Ljava/lang/String;", "b4", "()Ljava/lang/String;", "setActiveMediaUrl", "activeMediaUrl", "E", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "h4", "s4", "(Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;)V", "mediaHandler", "Ljava/lang/ref/WeakReference;", "F", "Ljava/lang/ref/WeakReference;", "listenerWeakReference", "Ll/n2e;", "G", "Ll/n2e;", "didClickForHardPermissionListener", "Companion", "b", "a", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
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
    private WeakReference<arm> listenerWeakReference;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private n2e didClickForHardPermissionListener;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    protected CTInAppNotification inAppNotification;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment$a */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment$a;", "Landroid/view/View$OnClickListener;", "<init>", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "onClick", "(Landroid/view/View;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public final class ViewOnClickListenerC1264a implements View.OnClickListener {
        public ViewOnClickListenerC1264a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            view.getClass();
            Object tag = view.getTag();
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num != null) {
                CTInAppBaseFragment.this.m6452j4(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment$b;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "inAppFragment", "Landroid/app/Activity;", "activity", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "", "logTag", "", "a", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;Landroid/app/Activity;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/lang/String;)Z", "KEY_ACTIVE_MEDIA_URL", "Ljava/lang/String;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6462a(@NotNull CTInAppBaseFragment inAppFragment, @NotNull Activity activity, @NotNull CTInAppNotification inAppNotification, @NotNull CleverTapInstanceConfig config, @NotNull String logTag) {
            inAppFragment.getClass();
            activity.getClass();
            inAppNotification.getClass();
            config.getClass();
            logTag.getClass();
            try {
                AbstractC0428k abstractC0428kM2568m = ((FragmentActivity) activity).getSupportFragmentManager().m2568m();
                abstractC0428kM2568m.getClass();
                inAppFragment.m6455n4(inAppNotification, config);
                abstractC0428kM2568m.m2814u(R.animator.fade_in, R.animator.fade_out);
                abstractC0428kM2568m.m2805c(R.id.content, inAppFragment, inAppNotification.getType());
                Logger.m5928v(logTag, "calling InAppFragment " + inAppNotification.getCampaignId());
                abstractC0428kM2568m.mo2710k();
                return true;
            } catch (ClassCastException e) {
                Logger.m5929v(logTag, "Fragment not able to render, please ensure your Activity is an instance of AppCompatActivity", e);
                return false;
            } catch (Throwable th) {
                Logger.m5929v(logTag, "Fragment not able to render", th);
                return false;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: X3 */
    private final Bundle m6437X3(CTInAppNotificationButton button) {
        CTInAppAction cTInAppActionM6184a = button.action;
        if (cTInAppActionM6184a == null) {
            cTInAppActionM6184a = CTInAppAction.INSTANCE.m6184a();
        }
        return m6438k4(cTInAppActionM6184a, button.getText(), null);
    }

    /* JADX INFO: renamed from: k4 */
    private final Bundle m6438k4(CTInAppAction action, String callToAction, Bundle additionalData) {
        arm armVarM6449g4 = m6449g4();
        if (armVarM6449g4 != null) {
            return armVarM6449g4.mo5906A0(m6448f4(), action, callToAction, additionalData, getActivity());
        }
        return null;
    }

    /* JADX INFO: renamed from: V3 */
    public abstract void mo6439V3();

    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6440W3() {
        return NoOpMediaHandler.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m6441Y3(@Nullable Bundle data) {
        mo6439V3();
        arm armVarM6449g4 = m6449g4();
        if (armVarM6449g4 != null) {
            armVarM6449g4.mo5909K(m6448f4(), data);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m6442Z3(@Nullable Bundle data) {
        arm armVarM6449g4 = m6449g4();
        if (armVarM6449g4 != null) {
            armVarM6449g4.mo5918t0(m6448f4(), data);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public abstract void mo6443a4();

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
    public final CleverTapInstanceConfig m6446d4() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.config;
        if (cleverTapInstanceConfig != null) {
            return cleverTapInstanceConfig;
        }
        Intrinsics.m88391r(Constants.KEY_CONFIG);
        return null;
    }

    /* JADX INFO: renamed from: e4, reason: from getter */
    public final int getCurrentOrientation() {
        return this.currentOrientation;
    }

    @NotNull
    /* JADX INFO: renamed from: f4 */
    public final CTInAppNotification m6448f4() {
        CTInAppNotification cTInAppNotification = this.inAppNotification;
        if (cTInAppNotification != null) {
            return cTInAppNotification;
        }
        Intrinsics.m88391r("inAppNotification");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g4 */
    public final arm m6449g4() {
        WeakReference<arm> weakReference = this.listenerWeakReference;
        arm armVar = weakReference != null ? weakReference.get() : null;
        if (armVar == null) {
            m6446d4().getLogger().verbose(m6446d4().getAccountId(), "InAppListener is null for notification: " + m6448f4().m6229s());
        }
        return armVar;
    }

    @NotNull
    /* JADX INFO: renamed from: h4 */
    public final InAppMediaHandler m6450h4() {
        InAppMediaHandler inAppMediaHandler = this.mediaHandler;
        if (inAppMediaHandler != null) {
            return inAppMediaHandler;
        }
        Intrinsics.m88391r("mediaHandler");
        return null;
    }

    /* JADX INFO: renamed from: i4 */
    public final int m6451i4(int raw) {
        return (int) TypedValue.applyDimension(1, raw, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: j4 */
    public final void m6452j4(int index) {
        n2e n2eVar;
        n2e n2eVar2;
        try {
            CTInAppNotificationButton cTInAppNotificationButton = m6448f4().m6217f().get(index);
            Bundle bundleM6437X3 = m6437X3(cTInAppNotificationButton);
            if (m6448f4().getIsLocalInApp() && (n2eVar2 = this.didClickForHardPermissionListener) != null) {
                if (index == 0) {
                    if (n2eVar2 != null) {
                        n2eVar2.mo5913Q(m6448f4().getFallBackToNotificationSettings());
                        return;
                    }
                    return;
                } else if (index == 1 && n2eVar2 != null) {
                    n2eVar2.mo5908I();
                }
            }
            CTInAppAction cTInAppAction = cTInAppNotificationButton.action;
            if (cTInAppAction == null || InAppActionType.REQUEST_FOR_PERMISSIONS != cTInAppAction.getType() || (n2eVar = this.didClickForHardPermissionListener) == null) {
                m6441Y3(bundleM6437X3);
            } else if (n2eVar != null) {
                n2eVar.mo5913Q(cTInAppAction.getShouldFallbackToSettings());
            }
        } catch (Throwable th) {
            m6446d4().getLogger().debug("Error handling notification button click", th);
            m6441Y3(null);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m6453l4(@NotNull String url) throws UnsupportedEncodingException {
        url.getClass();
        m6461t4(CTInAppAction.INSTANCE.m6187d(url), null, null);
    }

    @NotNull
    /* JADX INFO: renamed from: m4 */
    public final FileResourceProvider m6454m4() {
        FileResourceProvider.Companion c1279a = FileResourceProvider.INSTANCE;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return c1279a.m6556a(contextRequireContext, m6446d4().getLogger());
    }

    /* JADX INFO: renamed from: n4 */
    public final void m6455n4(@NotNull CTInAppNotification inAppNotification, @NotNull CleverTapInstanceConfig config) {
        inAppNotification.getClass();
        config.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("inApp", inAppNotification);
        bundle.putParcelable(Constants.KEY_CONFIG, config);
        setArguments(bundle);
    }

    /* JADX INFO: renamed from: o4 */
    public final void m6456o4(@Nullable CloseImageView closeImageView) {
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
            m6458q4((CTInAppNotification) parcelable);
            Parcelable parcelable2 = arguments.getParcelable(Constants.KEY_CONFIG);
            parcelable2.getClass();
            m6457p4((CleverTapInstanceConfig) parcelable2);
            this.currentOrientation = getResources().getConfiguration().orientation;
            mo6443a4();
            if (context instanceof n2e) {
                this.didClickForHardPermissionListener = (n2e) context;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String strM6572c;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null || (strM6572c = savedInstanceState.getString("ct_active_media_url")) == null) {
            strM6572c = InAppMediaHandler.INSTANCE.m6572c(m6448f4(), this.currentOrientation);
        }
        this.activeMediaUrl = strM6572c;
        m6460s4(mo6440W3());
        getLifecycle().mo2967a(m6450h4());
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
        m6442Z3(null);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m6457p4(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig) {
        cleverTapInstanceConfig.getClass();
        this.config = cleverTapInstanceConfig;
    }

    /* JADX INFO: renamed from: q4 */
    public final void m6458q4(@NotNull CTInAppNotification cTInAppNotification) {
        cTInAppNotification.getClass();
        this.inAppNotification = cTInAppNotification;
    }

    /* JADX INFO: renamed from: r4 */
    public final void m6459r4(@NotNull arm listener) {
        listener.getClass();
        this.listenerWeakReference = new WeakReference<>(listener);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m6460s4(@NotNull InAppMediaHandler inAppMediaHandler) {
        inAppMediaHandler.getClass();
        this.mediaHandler = inAppMediaHandler;
    }

    /* JADX INFO: renamed from: t4 */
    public final void m6461t4(@NotNull CTInAppAction action, @Nullable String callToAction, @Nullable Bundle additionalData) throws UnsupportedEncodingException {
        action.getClass();
        if (action.getType() == InAppActionType.OPEN_URL) {
            Bundle bundleM114206a = d4k0.m114206a(action.getActionUrl(), false);
            String string = bundleM114206a.getString(Constants.KEY_C2A);
            bundleM114206a.remove(Constants.KEY_C2A);
            if (additionalData != null) {
                bundleM114206a.putAll(additionalData);
            }
            if (string != null) {
                List listSplit$default = StringsKt.split$default(string, new String[]{Constants.URL_PARAM_DL_SEPARATOR}, false, 0, 6, null);
                if (listSplit$default.size() == 2) {
                    try {
                        string = URLDecoder.decode((String) listSplit$default.get(0), "UTF-8");
                    } catch (Exception e) {
                        m6446d4().getLogger().debug("Error parsing c2a param", e);
                    }
                    action = CTInAppAction.INSTANCE.m6187d((String) listSplit$default.get(1));
                }
            }
            additionalData = bundleM114206a;
            if (callToAction == null) {
                callToAction = string;
            }
        }
        if (callToAction == null) {
            callToAction = "";
        }
        m6441Y3(m6438k4(action, callToAction, additionalData));
    }
}
