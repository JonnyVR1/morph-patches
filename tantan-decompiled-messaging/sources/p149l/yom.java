package p149l;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000f\u0010\u000eJ=\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/yom;", "", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "button", "Landroid/content/Context;", "activityContext", "Landroid/os/Bundle;", "U", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;Landroid/content/Context;)Landroid/os/Bundle;", "formData", "", "J", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Landroid/os/Bundle;)V", "s0", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "action", "", "callToAction", "additionalData", "y0", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Context;)Landroid/os/Bundle;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface yom {
    /* JADX INFO: renamed from: J */
    void mo5854J(@NotNull CTInAppNotification inAppNotification, @Nullable Bundle formData);

    @Nullable
    /* JADX INFO: renamed from: U */
    Bundle mo5860U(@NotNull CTInAppNotification inAppNotification, @NotNull CTInAppNotificationButton button, @Nullable Context activityContext);

    /* JADX INFO: renamed from: s0 */
    void mo5863s0(@NotNull CTInAppNotification inAppNotification, @Nullable Bundle formData);

    @Nullable
    /* JADX INFO: renamed from: y0 */
    Bundle mo5864y0(@NotNull CTInAppNotification inAppNotification, @NotNull CTInAppAction action, @NotNull String callToAction, @Nullable Bundle additionalData, @Nullable Context activityContext);
}
