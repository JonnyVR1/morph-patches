package p149l;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C1577c;
import com.facebook.internal.C1657e;
import com.facebook.internal.GamingAction;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \u00152\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m87232d2 = {"Ll/ayb;", "", "", "action", "Landroid/os/Bundle;", "parameters", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Landroid/app/Activity;", "activity", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "a", "(Landroid/app/Activity;Ljava/lang/String;)Z", "Landroid/net/Uri;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "b", "(Landroid/net/Uri;)V", "uri", "Companion", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public class ayb {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Uri uri;

    public ayb(@NotNull String str, @Nullable Bundle bundle) {
        Uri uriM99540a;
        str.getClass();
        bundle = bundle == null ? new Bundle() : bundle;
        GamingAction[] gamingActionArrValuesCustom = GamingAction.valuesCustom();
        ArrayList arrayList = new ArrayList(gamingActionArrValuesCustom.length);
        for (GamingAction gamingAction : gamingActionArrValuesCustom) {
            arrayList.add(gamingAction.getRawValue());
        }
        if (arrayList.contains(str)) {
            C1657e c1657e = C1657e.INSTANCE;
            uriM99540a = C1657e.m8838g(fje0.m121586g(), Intrinsics.m87496l("/dialog/", str), bundle);
        } else {
            uriM99540a = INSTANCE.m99540a(str, bundle);
        }
        this.uri = uriM99540a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m99538a(@NotNull Activity activity, @Nullable String packageName) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            activity.getClass();
            hyb hybVarM133505a = new hyb.C17431a(dyb.INSTANCE.m114050b()).m133505a();
            hybVarM133505a.f110043a.setPackage(packageName);
            try {
                hybVarM133505a.m133504a(activity, this.uri);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m99539b(@NotNull Uri uri) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            uri.getClass();
            this.uri = uri;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: l.ayb$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/ayb$a;", "", "<init>", "()V", "", "action", "Landroid/os/Bundle;", "parameters", "Landroid/net/Uri;", "a", "(Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public Uri m99540a(@NotNull String action, @Nullable Bundle parameters) {
            action.getClass();
            C1657e c1657e = C1657e.INSTANCE;
            return C1657e.m8838g(fje0.m121581b(), C1577c.m8059x() + "/dialog/" + action, parameters);
        }

        public Companion() {
        }
    }
}
