package kotlin.reflect.jvm.internal.impl.utils;

import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
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
        public boolean mo87633a(N n) {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: b */
        public void mo91994b(N n) {
        }
    }

    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final C f66437a;

        public CollectingNodeHandler(@NotNull C c) {
            if (c == null) {
                m93190c(0);
            }
            this.f66437a = c;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m93190c(int i) {
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
            C c = this.f66437a;
            if (c == null) {
                m93190c(1);
            }
            return c;
        }
    }

    public interface Neighbors<N> {
        @NotNull
        /* JADX INFO: renamed from: a */
        Iterable<? extends N> mo93192a(N n);
    }

    public interface NodeHandler<N, R> {
        /* JADX INFO: renamed from: a */
        boolean mo87633a(N n);

        /* JADX INFO: renamed from: b */
        void mo91994b(N n);

        R result();
    }

    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
        public NodeHandlerWithListResult() {
            super(new LinkedList());
        }
    }

    public interface Visited<N> {
        /* JADX INFO: renamed from: a */
        boolean mo93193a(N n);
    }

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.DFS$a */
    public static class C15358a<N> extends AbstractNodeHandler<N, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1 f66439a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean[] f66440b;

        public C15358a(Function1 function1, boolean[] zArr) {
            this.f66439a = function1;
            this.f66440b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: a */
        public boolean mo87633a(N n) {
            if (((Boolean) this.f66439a.invoke(n)).booleanValue()) {
                this.f66440b[0] = true;
            }
            return !this.f66440b[0];
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean result() {
            return Boolean.valueOf(this.f66440b[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m93185a(int i) {
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
    public static <N, R> R m93186b(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            m93185a(4);
        }
        if (neighbors == null) {
            m93185a(5);
        }
        if (nodeHandler == null) {
            m93185a(6);
        }
        return (R) m93187c(collection, neighbors, new VisitedWithSet(), nodeHandler);
    }

    /* JADX INFO: renamed from: c */
    public static <N, R> R m93187c(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            m93185a(0);
        }
        if (neighbors == null) {
            m93185a(1);
        }
        if (visited == null) {
            m93185a(2);
        }
        if (nodeHandler == null) {
            m93185a(3);
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            m93188d(it.next(), neighbors, visited, nodeHandler);
        }
        return nodeHandler.result();
    }

    /* JADX INFO: renamed from: d */
    public static <N> void m93188d(@NotNull N n, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, ?> nodeHandler) {
        if (n == null) {
            m93185a(22);
        }
        if (neighbors == null) {
            m93185a(23);
        }
        if (visited == null) {
            m93185a(24);
        }
        if (nodeHandler == null) {
            m93185a(25);
        }
        if (visited.mo93193a(n) && nodeHandler.mo87633a(n)) {
            Iterator<? extends N> it = neighbors.mo93192a(n).iterator();
            while (it.hasNext()) {
                m93188d(it.next(), neighbors, visited, nodeHandler);
            }
            nodeHandler.mo91994b(n);
        }
    }

    /* JADX INFO: renamed from: e */
    public static <N> Boolean m93189e(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull Function1<N, Boolean> function1) {
        if (collection == null) {
            m93185a(7);
        }
        if (neighbors == null) {
            m93185a(8);
        }
        if (function1 == null) {
            m93185a(9);
        }
        return (Boolean) m93186b(collection, neighbors, new C15358a(function1, new boolean[1]));
    }

    public static class VisitedWithSet<N> implements Visited<N> {

        /* JADX INFO: renamed from: a */
        public final Set<N> f66438a;

        public VisitedWithSet(@NotNull Set<N> set) {
            if (set == null) {
                m93194b(0);
            }
            this.f66438a = set;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m93194b(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Visited
        /* JADX INFO: renamed from: a */
        public boolean mo93193a(N n) {
            return this.f66438a.add(n);
        }

        public VisitedWithSet() {
            this(new HashSet());
        }
    }
}
