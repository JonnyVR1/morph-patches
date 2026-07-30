package p153l;

import android.view.View;
import android.view.ViewParent;
import com.immomo.molive.apm.fps.jankstats.StateInfo;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
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
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0003\r\u0014\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0003R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m88121d2 = {"Ll/lr60;", "", "<init>", "()V", "", "frameStartTime", "frameEndTime", "", "Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "frameStates", "Ll/lr60$c;", "activeStates", "", "a", "(JJLjava/util/List;Ljava/util/List;)V", StudentVerRejectedReason.startTime, "endTime", "", "c", "(JJ)Ljava/util/List;", "b", "Ljava/util/List;", "states", "singleFrameStates", "Companion", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class lr60 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List<C18446c> states;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<C18446c> singleFrameStates;

    /* JADX INFO: renamed from: l.lr60$b */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m88121d2 = {"Ll/lr60$b;", "", "<init>", "()V", "Ll/lr60;", "<set-?>", "a", "Ll/lr60;", "()Ll/lr60;", "b", "(Ll/lr60;)V", "state", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C18445b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private lr60 state;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final lr60 getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: b */
        public final void m155589b(@Nullable lr60 lr60Var) {
            this.state = lr60Var;
        }
    }

    /* JADX INFO: renamed from: l.lr60$c */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/lr60$c;", "", "", "a", "J", "b", "()J", "setTimeAdded", "(J)V", "timeAdded", "c", "setTimeRemoved", "timeRemoved", "Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "()Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "setState", "(Lcom/immomo/molive/apm/fps/jankstats/StateInfo;)V", "state", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C18446c {

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

    private lr60() {
        this.states = new ArrayList();
        this.singleFrameStates = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    private final void m155582a(long frameStartTime, long frameEndTime, List<StateInfo> frameStates, List<C18446c> activeStates) {
        int size = activeStates.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C18446c c18446c = activeStates.get(size);
            if (c18446c.getTimeRemoved() > 0 && c18446c.getTimeRemoved() < frameStartTime) {
                activeStates.remove(size);
            } else if (c18446c.getTimeAdded() < frameEndTime && !frameStates.contains(c18446c.getState())) {
                frameStates.add(c18446c.getState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m155583b() {
        synchronized (this.singleFrameStates) {
            this.singleFrameStates.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<StateInfo> m155584c(long startTime, long endTime) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.singleFrameStates) {
            ?? arrayList = new ArrayList(this.states.size() + this.singleFrameStates.size());
            objectRef.element = arrayList;
            m155582a(startTime, endTime, (List) arrayList, this.states);
            m155582a(startTime, endTime, (List) objectRef.element, this.singleFrameStates);
            Unit unit = Unit.INSTANCE;
        }
        return (List) objectRef.element;
    }

    /* JADX INFO: renamed from: l.lr60$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/lr60$a;", "", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "Ll/lr60$b;", "b", "(Landroid/view/View;)Ll/lr60$b;", "a", "c", "(Landroid/view/View;)Landroid/view/View;", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C18445b m155585a(@NotNull View view) {
            view.getClass();
            C18445b c18445bM155586b = m155586b(view);
            if (c18445bM155586b.getState() == null) {
                c18445bM155586b.m155589b(new lr60(null));
            }
            return c18445bM155586b;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final C18445b m155586b(@NotNull View view) {
            view.getClass();
            View viewM155587c = m155587c(view);
            Object tag = viewM155587c.getTag(tcc0.f173228b);
            if (tag == null) {
                tag = new C18445b();
                viewM155587c.setTag(tcc0.f173228b, tag);
            }
            return (C18445b) tag;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final View m155587c(@NotNull View view) {
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

    public /* synthetic */ lr60(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
