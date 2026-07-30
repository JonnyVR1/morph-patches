package p153l;

import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, m88121d2 = {"Ll/d7d0;", "", "<init>", "()V", "", "e", "()Z", "c", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class d7d0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public static volatile d7d0 f85505a;

    public /* synthetic */ d7d0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final d7d0 m114719d() {
        return INSTANCE.m114723a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m114720f() {
        INSTANCE.m114724b();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m114721c() {
        String strM80485F = RemoteConfig.m80481x().m80485F("meet_greeting_enable");
        strM80485F.getClass();
        if (jyb.m147481L(strM80485F)) {
            return false;
        }
        try {
            return new JSONObject(strM80485F).getBoolean("female");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m114722e() {
        String strM80485F = RemoteConfig.m80481x().m80485F("meet_greeting_enable");
        strM80485F.getClass();
        if (jyb.m147481L(strM80485F)) {
            return false;
        }
        try {
            return new JSONObject(strM80485F).getBoolean("male");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.d7d0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/d7d0$a;", "", "<init>", "()V", "Ll/d7d0;", "a", "()Ll/d7d0;", "", "b", "instance", "Ll/d7d0;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final d7d0 m114723a() {
            d7d0 d7d0Var;
            d7d0 d7d0Var2 = d7d0.f85505a;
            if (d7d0Var2 != null) {
                return d7d0Var2;
            }
            synchronized (this) {
                d7d0Var = d7d0.f85505a;
                if (d7d0Var == null) {
                    d7d0Var = new d7d0(null);
                    d7d0.f85505a = d7d0Var;
                }
            }
            return d7d0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m114724b() {
            d7d0.f85505a = null;
        }

        public Companion() {
        }
    }

    public d7d0() {
    }
}
