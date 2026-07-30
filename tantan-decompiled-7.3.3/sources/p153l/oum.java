package p153l;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, m88121d2 = {"Ll/oum;", "E", "", "holder", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "element", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@JvmInline
@SourceDebugExtension
public final class oum<E> {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m169320b(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m169319a(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Object m169321c(Object obj, E e) {
        if (obj == null) {
            return m169319a(e);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return m169319a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m169319a(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static <E> Object m169319a(@Nullable Object obj) {
        return obj;
    }
}
