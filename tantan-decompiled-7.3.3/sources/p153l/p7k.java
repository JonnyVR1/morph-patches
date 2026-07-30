package p153l;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.C1577f;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0014"}, m88121d2 = {"Ll/p7k;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "eventName", "Landroid/os/Bundle;", "parameters", "", "b", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "a", "(Ljava/lang/String;)Z", "Lcom/facebook/appevents/f;", "Lcom/facebook/appevents/f;", "internalAppEventsLogger", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class p7k {

    /* JADX INFO: renamed from: b */
    public static final boolean f150945b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C1577f internalAppEventsLogger;

    static {
        f150945b = Random.INSTANCE.nextDouble() <= 1.0E-4d;
    }

    public p7k(@NotNull Context context) {
        context.getClass();
        this.internalAppEventsLogger = new C1577f(context);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m171155a(String eventName) {
        if (eventName != null) {
            return StringsKt.m94303P(eventName, "gps", false, 2, null);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m171156b(@Nullable String eventName, @Nullable Bundle parameters) {
        if (f150945b && m171155a(eventName)) {
            this.internalAppEventsLogger.m7831g(eventName, parameters);
        }
    }
}
