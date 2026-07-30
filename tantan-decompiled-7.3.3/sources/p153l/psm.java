package p153l;

import android.content.Context;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \"2\u00020\u0001:\u0001\u001eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0017\u001a\u00020\u00062!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\u0013H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\u000eJ\u001d\u0010\u001b\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u000e¨\u0006#"}, m88121d2 = {"Ll/psm;", "", "Landroid/content/Context;", "context", "", "url", "", "e", "(Landroid/content/Context;Ljava/lang/String;)V", "", "isTablet", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;Z)V", "play", "()V", "pause", "isFullScreen", "f", "(Z)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "onClick", "h", "(Lkotlin/jvm/functions/Function1;)V", "g", "Lkotlin/Function0;", "c", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "a", "()Landroid/view/View;", Constants.INAPP_DATA_TAG, "b", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface psm {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f153945a;

    /* JADX INFO: renamed from: l.psm$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"Ll/psm$a;", "", "<init>", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f153945a = new Companion();

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    View mo96635a();

    /* JADX INFO: renamed from: b */
    void mo96636b();

    /* JADX INFO: renamed from: c */
    void mo96637c(@NotNull Function0<Unit> onClick);

    /* JADX INFO: renamed from: d */
    void mo96638d();

    /* JADX INFO: renamed from: e */
    void mo96639e(@NotNull Context context, @NotNull String url);

    /* JADX INFO: renamed from: f */
    void mo96640f(boolean isFullScreen);

    /* JADX INFO: renamed from: g */
    void mo96641g();

    /* JADX INFO: renamed from: h */
    void mo96642h(@NotNull Function1<? super Boolean, Unit> onClick);

    /* JADX INFO: renamed from: i */
    void mo96643i(@NotNull Context context, boolean isTablet);

    void pause();

    void play();
}
