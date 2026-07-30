package p153l;

import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.pipsdk.C1288a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u000eR$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, m88121d2 = {"Ll/i3y;", "", "Landroid/view/ViewGroup;", "container", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "Ll/dc60;", "session", "", "g", "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/dc60;)V", "a", "(Landroid/view/ViewGroup;Ll/dc60;)V", "release", "()V", "h", "f", "c", "Lkotlin/Function0;", "getOnMediaReady", "()Lkotlin/jvm/functions/Function0;", Constants.INAPP_DATA_TAG, "(Lkotlin/jvm/functions/Function0;)V", "onMediaReady", "getOnAllMediaFailed", "e", "onAllMediaFailed", "", "b", "()Z", "isMuted", "isPlaying", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface i3y {
    /* JADX INFO: renamed from: a */
    void mo138352a(@NotNull ViewGroup container, @NotNull dc60 session);

    /* JADX INFO: renamed from: b */
    boolean mo138353b();

    /* JADX INFO: renamed from: c */
    void mo138354c();

    /* JADX INFO: renamed from: d */
    void mo138355d(@Nullable Function0<Unit> function0);

    /* JADX INFO: renamed from: e */
    void mo138356e(@Nullable Function0<Unit> function0);

    /* JADX INFO: renamed from: f */
    void mo138357f();

    /* JADX INFO: renamed from: g */
    void mo138358g(@NotNull ViewGroup container, @NotNull C1288a config, @NotNull dc60 session);

    /* JADX INFO: renamed from: h */
    void mo138359h();

    boolean isPlaying();

    void release();

    /* JADX INFO: renamed from: l.i3y$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C17632a {
        /* JADX INFO: renamed from: a */
        public static void m138360a(@NotNull i3y i3yVar) {
        }
    }
}
