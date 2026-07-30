package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "factories", "Ll/gsw;", "e", "(Lkotlinx/coroutines/internal/MainDispatcherFactory;Ljava/util/List;)Ll/gsw;", "", "c", "(Ll/gsw;)Z", "", "cause", "", "errorHint", "Ll/ec00;", "a", "(Ljava/lang/Throwable;Ljava/lang/String;)Ll/ec00;", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/Void;", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class isw {
    /* JADX INFO: renamed from: a */
    public static final ec00 m141991a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        m141994d();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ec00 m141992b(Throwable th, String str, int i, Object obj) throws Throwable {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        m141991a(th, str);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m141993c(@NotNull gsw gswVar) {
        gswVar.getImmediate();
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Void m141994d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final gsw m141995e(@NotNull MainDispatcherFactory mainDispatcherFactory, @NotNull List<? extends MainDispatcherFactory> list) throws Throwable {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            m141991a(th, mainDispatcherFactory.hintOnError());
            return null;
        }
    }
}
