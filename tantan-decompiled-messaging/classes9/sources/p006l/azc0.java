package p006l;

import com.p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Ll/azc0;", "", "<init>", "()V", "", "e", "()Z", "c", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class azc0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public static volatile azc0 f8624a;

    public /* synthetic */ azc0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final azc0 m12352d() {
        return INSTANCE.m12356a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m12353f() {
        INSTANCE.m12357b();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12354c() {
        String strF = RemoteConfig.x().F("meet_greeting_enable");
        strF.getClass();
        if (vwb.L(strF)) {
            return false;
        }
        try {
            return new JSONObject(strF).getBoolean("female");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12355e() {
        String strF = RemoteConfig.x().F("meet_greeting_enable");
        strF.getClass();
        if (vwb.L(strF)) {
            return false;
        }
        try {
            return new JSONObject(strF).getBoolean("male");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.azc0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll/azc0$a;", "", "<init>", "()V", "Ll/azc0;", "a", "()Ll/azc0;", "", "b", "instance", "Ll/azc0;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final azc0 m12356a() {
            azc0 azc0Var;
            azc0 azc0Var2 = azc0.f8624a;
            if (azc0Var2 != null) {
                return azc0Var2;
            }
            synchronized (this) {
                azc0Var = azc0.f8624a;
                if (azc0Var == null) {
                    azc0Var = new azc0(null);
                    azc0.f8624a = azc0Var;
                }
            }
            return azc0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m12357b() {
            azc0.f8624a = null;
        }

        public Companion() {
        }
    }

    public azc0() {
    }
}
