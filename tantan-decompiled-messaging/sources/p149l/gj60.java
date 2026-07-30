package p149l;

import android.view.View;
import android.view.ViewParent;
import com.immomo.molive.apm.fps.jankstats.StateInfo;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0003\r\u0014\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0003R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m87232d2 = {"Ll/gj60;", "", "<init>", "()V", "", "frameStartTime", "frameEndTime", "", "Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "frameStates", "Ll/gj60$c;", "activeStates", "", "a", "(JJLjava/util/List;Ljava/util/List;)V", StudentVerRejectedReason.startTime, "endTime", "", "c", "(JJ)Ljava/util/List;", "b", "Ljava/util/List;", "states", "singleFrameStates", "Companion", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class gj60 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List<C17090c> states;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<C17090c> singleFrameStates;

    /* JADX INFO: renamed from: l.gj60$b */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/gj60$b;", "", "<init>", "()V", "Ll/gj60;", "<set-?>", "a", "Ll/gj60;", "()Ll/gj60;", "b", "(Ll/gj60;)V", "state", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class C17089b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private gj60 state;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final gj60 getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: b */
        public final void m126464b(@Nullable gj60 gj60Var) {
            this.state = gj60Var;
        }
    }

    /* JADX INFO: renamed from: l.gj60$c */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Ll/gj60$c;", "", "", "a", "J", "b", "()J", "setTimeAdded", "(J)V", "timeAdded", "c", "setTimeRemoved", "timeRemoved", "Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "()Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "setState", "(Lcom/immomo/molive/apm/fps/jankstats/StateInfo;)V", "state", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class C17090c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long timeAdded;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private long timeRemoved;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private StateInfo state;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final StateInfo getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimeAdded() {
            return this.timeAdded;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getTimeRemoved() {
            return this.timeRemoved;
        }
    }

    private gj60() {
        this.states = new ArrayList();
        this.singleFrameStates = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    private final void m126457a(long frameStartTime, long frameEndTime, List<StateInfo> frameStates, List<C17090c> activeStates) {
        int size = activeStates.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C17090c c17090c = activeStates.get(size);
            if (c17090c.getTimeRemoved() > 0 && c17090c.getTimeRemoved() < frameStartTime) {
                activeStates.remove(size);
            } else if (c17090c.getTimeAdded() < frameEndTime && !frameStates.contains(c17090c.getState())) {
                frameStates.add(c17090c.getState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m126458b() {
        synchronized (this.singleFrameStates) {
            this.singleFrameStates.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<StateInfo> m126459c(long startTime, long endTime) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.singleFrameStates) {
            ?? arrayList = new ArrayList(this.states.size() + this.singleFrameStates.size());
            objectRef.element = arrayList;
            m126457a(startTime, endTime, (List) arrayList, this.states);
            m126457a(startTime, endTime, (List) objectRef.element, this.singleFrameStates);
            Unit unit = Unit.INSTANCE;
        }
        return (List) objectRef.element;
    }

    /* JADX INFO: renamed from: l.gj60$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/gj60$a;", "", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "Ll/gj60$b;", "b", "(Landroid/view/View;)Ll/gj60$b;", "a", "c", "(Landroid/view/View;)Landroid/view/View;", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C17089b m126460a(@NotNull View view) {
            view.getClass();
            C17089b c17089bM126461b = m126461b(view);
            if (c17089bM126461b.getState() == null) {
                c17089bM126461b.m126464b(new gj60(null));
            }
            return c17089bM126461b;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final C17089b m126461b(@NotNull View view) {
            view.getClass();
            View viewM126462c = m126462c(view);
            Object tag = viewM126462c.getTag(n4c0.f137090b);
            if (tag == null) {
                tag = new C17089b();
                viewM126462c.setTag(n4c0.f137090b, tag);
            }
            return (C17089b) tag;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final View m126462c(@NotNull View view) {
            view.getClass();
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                view = parent;
                parent = view.getParent();
            }
            return view;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ gj60(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
