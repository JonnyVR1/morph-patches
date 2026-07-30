package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, m87232d2 = {"Ll/vua0;", "", "", "a", "()V", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface vua0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f183051a;

    /* JADX INFO: renamed from: l.vua0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, m87232d2 = {"Ll/vua0$a;", "", "<init>", "()V", "Ll/vua0;", "holder", "", "a", "(Ll/vua0;)V", "c", "b", "", "Ljava/util/Set;", "activeHolders", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f183051a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final Set<vua0> activeHolders = new LinkedHashSet();

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m200065a(@NotNull vua0 holder) {
            holder.getClass();
            activeHolders.add(holder);
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m200066b() {
            Iterator it = new ArrayList(activeHolders).iterator();
            while (it.hasNext()) {
                ((vua0) it.next()).mo98106a();
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m200067c(@NotNull vua0 holder) {
            holder.getClass();
            activeHolders.remove(holder);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo98106a();
}
