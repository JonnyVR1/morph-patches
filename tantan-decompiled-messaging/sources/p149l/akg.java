package p149l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/akg;", "Ll/hyl;", "Lcom/google/firebase/messaging/RemoteMessage;", "Landroid/os/Bundle;", "messageBundle", "<init>", "(Landroid/os/Bundle;)V", "message", "a", "(Lcom/google/firebase/messaging/RemoteMessage;)Ll/hyl;", "build", "()Landroid/os/Bundle;", "Landroid/os/Bundle;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class akg implements hyl<RemoteMessage> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Bundle messageBundle;

    public akg(@NotNull Bundle bundle) {
        bundle.getClass();
        this.messageBundle = bundle;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public hyl<RemoteMessage> m97146a(@NotNull RemoteMessage message) {
        String str;
        message.getClass();
        if (message.getOriginalPriority() != message.getPriority()) {
            int priority = message.getPriority();
            if (priority == 0) {
                str = Constants.PRIORITY_UNKNOWN;
            } else if (priority != 1) {
                str = priority != 2 ? "" : "normal";
            } else {
                str = Constants.PRIORITY_HIGH;
            }
            this.messageBundle.putString(Constants.WZRK_PN_PRT, str);
        }
        return this;
    }

    @Override // p149l.hyl
    @NotNull
    /* JADX INFO: renamed from: build, reason: from getter */
    public Bundle getMessageBundle() {
        return this.messageBundle;
    }
}
