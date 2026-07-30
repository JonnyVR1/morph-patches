package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0013\u0007\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Ll/i9j;", "", "<init>", "()V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "a", "(Ljava/lang/String;)V", "b", "", Constants.INAPP_DATA_TAG, "()Z", "Ll/i9j$a;", "Ll/i9j$a;", "NO_OP_ARGS_BUILDER", "Ll/i9j$c;", "Ll/i9j$c;", "_instance", "c", "()Ll/i9j$c;", "instance", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class i9j {

    @NotNull
    public static final i9j INSTANCE = new i9j();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final InterfaceC17671a NO_OP_ARGS_BUILDER = new C17672b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC17673c _instance;

    /* JADX INFO: renamed from: l.i9j$a */
    @Metadata(m88120d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"Ll/i9j$a;", "", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface InterfaceC17671a {
    }

    /* JADX INFO: renamed from: l.i9j$b */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"Ll/i9j$b;", "Ll/i9j$a;", "<init>", "()V", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C17672b implements InterfaceC17671a {
    }

    /* JADX INFO: renamed from: l.i9j$c */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/i9j$c;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "a", "(Ljava/lang/String;)V", "b", "()V", "", "c", "()Z", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface InterfaceC17673c {
        /* JADX INFO: renamed from: a */
        void mo139101a(@NotNull String name);

        /* JADX INFO: renamed from: b */
        void mo139102b();

        /* JADX INFO: renamed from: c */
        boolean mo139103c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m139097a(@NotNull String name) {
        name.getClass();
        INSTANCE.m139100c().mo139101a(name);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m139098b() {
        INSTANCE.m139100c().mo139102b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m139099d() {
        return INSTANCE.m139100c().mo139103c();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC17673c m139100c() {
        xod xodVar;
        InterfaceC17673c interfaceC17673c = _instance;
        if (interfaceC17673c != null) {
            return interfaceC17673c;
        }
        synchronized (i9j.class) {
            xodVar = new xod();
            _instance = xodVar;
        }
        return xodVar;
    }
}
