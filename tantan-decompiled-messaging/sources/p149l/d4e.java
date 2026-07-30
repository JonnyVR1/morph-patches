package p149l;

import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import kotlin.Metadata;
import kotlinx.coroutines.C15488q;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\u0005\u0010\u0007R \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\u0007R \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0015"}, m87232d2 = {"Ll/d4e;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault$annotations", LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default, "b", "getUnconfined", "getUnconfined$annotations", "Unconfined", "c", "getIO$annotations", "IO", "Ll/hpw;", "()Ll/hpw;", "getMain$annotations", "Main", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class d4e {

    @NotNull
    public static final d4e INSTANCE = new d4e();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineDispatcher Default = oqd.INSTANCE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineDispatcher Unconfined = C15488q.INSTANCE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineDispatcher IO = nod.INSTANCE;

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CoroutineDispatcher m109980a() {
        return Default;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final CoroutineDispatcher m109981b() {
        return IO;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final hpw m109982c() {
        return ipw.dispatcher;
    }
}
