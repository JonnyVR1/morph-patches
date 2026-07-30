package p149l;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, m87232d2 = {"Ll/ipw;", "", "<init>", "()V", "Ll/hpw;", "a", "()Ll/hpw;", "Ll/hpw;", "dispatcher", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ipw {

    @NotNull
    public static final ipw INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final hpw dispatcher;

    static {
        ipw ipwVar = new ipw();
        INSTANCE = ipwVar;
        uhh0.m193720f("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = ipwVar.m137605a();
    }

    /* JADX INFO: renamed from: a */
    public final hpw m137605a() throws Throwable {
        Object next;
        hpw hpwVarM142765e;
        try {
            List listM93302V = SequencesKt___SequencesKt.m93302V(SequencesKt__SequencesKt.m93267g(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator it = listM93302V.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            if (mainDispatcherFactory != null && (hpwVarM142765e = jpw.m142765e(mainDispatcherFactory, listM93302V)) != null) {
                return hpwVarM142765e;
            }
            jpw.m142762b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            jpw.m142762b(th, null, 2, null);
            return null;
        }
    }
}
