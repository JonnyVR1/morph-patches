package kotlin.reflect.jvm.internal.impl.utils;

import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class DFS {

    public static abstract class AbstractNodeHandler<N, R> implements NodeHandler<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: a */
        public boolean mo88524a(N n) {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: b */
        public void mo92885b(N n) {
        }
    }

    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final C f67111a;

        public CollectingNodeHandler(@NotNull C c) {
            if (c == null) {
                m94081c(0);
            }
            this.f67111a = c;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m94081c(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = LovePlanetStage.result;
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            } else {
                objArr[1] = LovePlanetStage.result;
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C result() {
            C c = this.f67111a;
            if (c == null) {
                m94081c(1);
            }
            return c;
        }
    }

    public interface Neighbors<N> {
        @NotNull
        /* JADX INFO: renamed from: a */
        Iterable<? extends N> mo94083a(N n);
    }

    public interface NodeHandler<N, R> {
        /* JADX INFO: renamed from: a */
        boolean mo88524a(N n);

        /* JADX INFO: renamed from: b */
        void mo92885b(N n);

        R result();
    }

    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
        public NodeHandlerWithListResult() {
            super(new LinkedList());
        }
    }

    public interface Visited<N> {
        /* JADX INFO: renamed from: a */
        boolean mo94084a(N n);
    }

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.DFS$a */
    public static class C15465a<N> extends AbstractNodeHandler<N, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1 f67113a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean[] f67114b;

        public C15465a(Function1 function1, boolean[] zArr) {
            this.f67113a = function1;
            this.f67114b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: a */
        public boolean mo88524a(N n) {
            if (((Boolean) this.f67113a.invoke(n)).booleanValue()) {
                this.f67114b[0] = true;
            }
            return !this.f67114b[0];
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean result() {
            return Boolean.valueOf(this.f67114b[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m94076a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: b */
    public static <N, R> R m94077b(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            m94076a(4);
        }
        if (neighbors == null) {
            m94076a(5);
        }
        if (nodeHandler == null) {
            m94076a(6);
        }
        return (R) m94078c(collection, neighbors, new VisitedWithSet(), nodeHandler);
    }

    /* JADX INFO: renamed from: c */
    public static <N, R> R m94078c(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            m94076a(0);
        }
        if (neighbors == null) {
            m94076a(1);
        }
        if (visited == null) {
            m94076a(2);
        }
        if (nodeHandler == null) {
            m94076a(3);
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            m94079d(it.next(), neighbors, visited, nodeHandler);
        }
        return nodeHandler.result();
    }

    /* JADX INFO: renamed from: d */
    public static <N> void m94079d(@NotNull N n, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, ?> nodeHandler) {
        if (n == null) {
            m94076a(22);
        }
        if (neighbors == null) {
            m94076a(23);
        }
        if (visited == null) {
            m94076a(24);
        }
        if (nodeHandler == null) {
            m94076a(25);
        }
        if (visited.mo94084a(n) && nodeHandler.mo88524a(n)) {
            Iterator<? extends N> it = neighbors.mo94083a(n).iterator();
            while (it.hasNext()) {
                m94079d(it.next(), neighbors, visited, nodeHandler);
            }
            nodeHandler.mo92885b(n);
        }
    }

    /* JADX INFO: renamed from: e */
    public static <N> Boolean m94080e(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull Function1<N, Boolean> function1) {
        if (collection == null) {
            m94076a(7);
        }
        if (neighbors == null) {
            m94076a(8);
        }
        if (function1 == null) {
            m94076a(9);
        }
        return (Boolean) m94077b(collection, neighbors, new C15465a(function1, new boolean[1]));
    }

    public static class VisitedWithSet<N> implements Visited<N> {

        /* JADX INFO: renamed from: a */
        public final Set<N> f67112a;

        public VisitedWithSet(@NotNull Set<N> set) {
            if (set == null) {
                m94085b(0);
            }
            this.f67112a = set;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m94085b(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Visited
        /* JADX INFO: renamed from: a */
        public boolean mo94084a(N n) {
            return this.f67112a.add(n);
        }

        public VisitedWithSet() {
            this(new HashSet());
        }
    }
}
