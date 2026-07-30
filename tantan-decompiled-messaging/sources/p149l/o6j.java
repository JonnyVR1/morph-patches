package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0013\u0007\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Ll/o6j;", "", "<init>", "()V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "a", "(Ljava/lang/String;)V", "b", "", Constants.INAPP_DATA_TAG, "()Z", "Ll/o6j$a;", "Ll/o6j$a;", "NO_OP_ARGS_BUILDER", "Ll/o6j$c;", "Ll/o6j$c;", "_instance", "c", "()Ll/o6j$c;", "instance", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class o6j {

    @NotNull
    public static final o6j INSTANCE = new o6j();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final InterfaceC18851a NO_OP_ARGS_BUILDER = new C18852b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC18853c _instance;

    /* JADX INFO: renamed from: l.o6j$a */
    @Metadata(m87231d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"Ll/o6j$a;", "", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public interface InterfaceC18851a {
    }

    /* JADX INFO: renamed from: l.o6j$b */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Ll/o6j$b;", "Ll/o6j$a;", "<init>", "()V", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C18852b implements InterfaceC18851a {
    }

    /* JADX INFO: renamed from: l.o6j$c */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/o6j$c;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "a", "(Ljava/lang/String;)V", "b", "()V", "", "c", "()Z", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public interface InterfaceC18853c {
        /* JADX INFO: renamed from: a */
        void mo162854a(@NotNull String name);

        /* JADX INFO: renamed from: b */
        void mo162855b();

        /* JADX INFO: renamed from: c */
        boolean mo162856c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m162850a(@NotNull String name) {
        name.getClass();
        INSTANCE.m162853c().mo162854a(name);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m162851b() {
        INSTANCE.m162853c().mo162855b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m162852d() {
        return INSTANCE.m162853c().mo162856c();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC18853c m162853c() {
        snd sndVar;
        InterfaceC18853c interfaceC18853c = _instance;
        if (interfaceC18853c != null) {
            return interfaceC18853c;
        }
        synchronized (o6j.class) {
            sndVar = new snd();
            _instance = sndVar;
        }
        return sndVar;
    }
}
