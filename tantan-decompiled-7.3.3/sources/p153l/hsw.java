package p153l;

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
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, m88121d2 = {"Ll/hsw;", "", "<init>", "()V", "Ll/gsw;", "a", "()Ll/gsw;", "Ll/gsw;", "dispatcher", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class hsw {

    @NotNull
    public static final hsw INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final gsw dispatcher;

    static {
        hsw hswVar = new hsw();
        INSTANCE = hswVar;
        bqh0.m105939f("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = hswVar.m137041a();
    }

    /* JADX INFO: renamed from: a */
    public final gsw m137041a() throws Throwable {
        Object next;
        gsw gswVarM141995e;
        try {
            List listM94193V = SequencesKt___SequencesKt.m94193V(SequencesKt__SequencesKt.m94158g(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator it = listM94193V.iterator();
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
            if (mainDispatcherFactory != null && (gswVarM141995e = isw.m141995e(mainDispatcherFactory, listM94193V)) != null) {
                return gswVarM141995e;
            }
            isw.m141992b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            isw.m141992b(th, null, 2, null);
            return null;
        }
    }
}
