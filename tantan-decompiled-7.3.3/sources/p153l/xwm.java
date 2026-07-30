package p153l;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C1600c;
import com.facebook.internal.C1680e;
import com.facebook.login.CustomTabLoginMethodHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m88121d2 = {"Ll/xwm;", "Ll/ozb;", "", "action", "Landroid/os/Bundle;", "parameters", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Companion", "a", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class xwm extends ozb {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwm(@NotNull String str, @Nullable Bundle bundle) {
        super(str, bundle);
        str.getClass();
        m169918b(INSTANCE.m213365a(str, bundle == null ? new Bundle() : bundle));
    }

    /* JADX INFO: renamed from: l.xwm$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/xwm$a;", "", "<init>", "()V", "", "action", "Landroid/os/Bundle;", "parameters", "Landroid/net/Uri;", "a", "(Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Uri m213365a(@NotNull String action, @Nullable Bundle parameters) {
            action.getClass();
            if (Intrinsics.m88377d(action, CustomTabLoginMethodHandler.OAUTH_DIALOG)) {
                C1680e c1680e = C1680e.INSTANCE;
                return C1680e.m8892g(kre0.m151041k(), "oauth/authorize", parameters);
            }
            C1680e c1680e2 = C1680e.INSTANCE;
            return C1680e.m8892g(kre0.m151041k(), C1600c.m8113x() + "/dialog/" + action, parameters);
        }

        public Companion() {
        }
    }
}
