package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/ot10;", "", Owner.TYPE, "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)V", "", "a", "()Z", "isLocked", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface ot10 {

    /* JADX INFO: renamed from: l.ot10$a */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C19030a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m165924a(ot10 ot10Var, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                qq3.m175877a("Super calls with default arguments not supported in this target, function: unlock");
                return;
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            ot10Var.mo94355d(obj);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo94353a();

    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo94354c(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: d */
    void mo94355d(@Nullable Object owner);
}
