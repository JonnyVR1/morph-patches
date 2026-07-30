package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.sharelib.workmanager.Data;
import java.util.Observable;
import java.util.Observer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, m88121d2 = {"Ll/r3f0;", "Ll/n3f0;", "<init>", "()V", "Lkotlin/Function0;", "", "a", "()Lkotlin/jvm/functions/Function0;", "Ll/eyl;", "g", "()Ll/eyl;", "Ll/sv5;", "h", "()Ll/sv5;", "Lcom/tantanapp/sharelib/workmanager/Data;", "p", "Lcom/tantanapp/sharelib/workmanager/Data;", "assetsReaderOutput", "Ljava/util/Observer;", "q", "Ljava/util/Observer;", "initializerObserver", "r", "loaderObserver", BLiveStormDanmakuGiftResourceType.f45294s, "innerObServer", "Companion", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class r3f0 extends n3f0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile r3f0 INSTANCE;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Data assetsReaderOutput = Data.INSTANCE.m82726a();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public Observer initializerObserver = new Observer() { // from class: l.o3f0
        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            r3f0.m179604b(observable, obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public Observer loaderObserver = new Observer() { // from class: l.p3f0
        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            r3f0.m179605c(observable, obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public Observer innerObServer = new Observer() { // from class: l.q3f0
        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            r3f0.m179606d(observable, obj);
        }
    };

    /* JADX INFO: renamed from: b */
    public static void m179604b(Observable observable, Object obj) {
    }

    /* JADX INFO: renamed from: c */
    public static void m179605c(Observable observable, Object obj) {
    }

    /* JADX INFO: renamed from: d */
    public static void m179606d(Observable observable, Object obj) {
    }

    @Override // p153l.n3f0
    @NotNull
    /* JADX INFO: renamed from: a */
    public Function0<Boolean> mo161287a() {
        Intrinsics.m88391r(Constants.KEY_CONFIG);
        throw null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final eyl m179609g() {
        Intrinsics.m88391r(Constants.KEY_CONFIG);
        throw null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final sv5 m179610h() {
        Intrinsics.m88391r(Constants.KEY_CONFIG);
        return null;
    }

    /* JADX INFO: renamed from: l.r3f0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m88121d2 = {"Ll/r3f0$a;", "", "<init>", "()V", "Ll/r3f0;", "a", "()Ll/r3f0;", "INSTANCE", "Ll/r3f0;", "", "SHARED_LIB_DIR", "Ljava/lang/String;", "TAG", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final r3f0 m179611a() {
            r3f0 r3f0Var;
            r3f0 r3f0Var2 = r3f0.INSTANCE;
            if (r3f0Var2 != null) {
                return r3f0Var2;
            }
            synchronized (this) {
                r3f0Var = r3f0.INSTANCE;
                if (r3f0Var == null) {
                    r3f0Var = new r3f0();
                    r3f0.INSTANCE = r3f0Var;
                }
            }
            return r3f0Var;
        }

        public Companion() {
        }
    }
}
