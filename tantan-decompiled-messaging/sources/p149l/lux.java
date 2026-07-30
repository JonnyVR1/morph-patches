package p149l;

import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.pipsdk.C1265a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u000eR$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, m87232d2 = {"Ll/lux;", "", "Landroid/view/ViewGroup;", "container", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "Ll/y360;", "session", "", "g", "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/y360;)V", "a", "(Landroid/view/ViewGroup;Ll/y360;)V", "release", "()V", "h", "f", "c", "Lkotlin/Function0;", "getOnMediaReady", "()Lkotlin/jvm/functions/Function0;", Constants.INAPP_DATA_TAG, "(Lkotlin/jvm/functions/Function0;)V", "onMediaReady", "getOnAllMediaFailed", "e", "onAllMediaFailed", "", "b", "()Z", "isMuted", "isPlaying", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface lux {
    /* JADX INFO: renamed from: a */
    void mo107483a(@NotNull ViewGroup container, @NotNull y360 session);

    /* JADX INFO: renamed from: b */
    boolean mo107484b();

    /* JADX INFO: renamed from: c */
    void mo107485c();

    /* JADX INFO: renamed from: d */
    void mo107486d(@Nullable Function0<Unit> function0);

    /* JADX INFO: renamed from: e */
    void mo107487e(@Nullable Function0<Unit> function0);

    /* JADX INFO: renamed from: f */
    void mo107488f();

    /* JADX INFO: renamed from: g */
    void mo107489g(@NotNull ViewGroup container, @NotNull C1265a config, @NotNull y360 session);

    /* JADX INFO: renamed from: h */
    void mo107490h();

    boolean isPlaying();

    void release();

    /* JADX INFO: renamed from: l.lux$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C18319a {
        /* JADX INFO: renamed from: a */
        public static void m151826a(@NotNull lux luxVar) {
        }
    }
}
