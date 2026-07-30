package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ckg;
import p153l.jer;
import p153l.ker;
import p153l.kwd0;
import p153l.per;
import p153l.q3g0;
import p153l.qg50;
import p153l.u120;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.lifecycle.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 A2\u00020\u0001:\u0002%\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001b\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010&R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010&R&\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u001304j\b\u0012\u0004\u0012\u00020\u0013`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0013088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010>\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010<\"\u0004\b=\u0010\u0016R\u0014\u0010@\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010?¨\u0006B"}, m88121d2 = {"Landroidx/lifecycle/k;", "Landroidx/lifecycle/Lifecycle;", "Ll/ker;", "provider", "", "enforceMainThread", "<init>", "(Ll/ker;Z)V", "(Ll/ker;)V", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", RXScreenCaptureService.KEY_INDEX, "(Landroidx/lifecycle/Lifecycle$Event;)V", "Ll/jer;", "observer", "a", "(Ll/jer;)V", Constants.INAPP_DATA_TAG, "Landroidx/lifecycle/Lifecycle$State;", "next", "k", "(Landroidx/lifecycle/Lifecycle$State;)V", "f", "(Ll/jer;)Landroidx/lifecycle/Lifecycle$State;", BLiveStormDanmakuGiftResourceType.f45292l, "()V", "state", "m", "lifecycleOwner", "h", "e", "o", "", "methodName", "g", "(Ljava/lang/String;)V", "b", "Z", "Ll/ckg;", "Landroidx/lifecycle/k$b;", "c", "Ll/ckg;", "observerMap", "Landroidx/lifecycle/Lifecycle$State;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "Ll/u120;", "j", "Ll/u120;", "_currentStateFlow", "()Landroidx/lifecycle/Lifecycle$State;", "n", "currentState", "()Z", "isSynced", "Companion", "lifecycle-runtime_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public class C0482k extends Lifecycle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean enforceMainThread;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public ckg<jer, b> observerMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public Lifecycle.State state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<ker> lifecycleOwner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int addingObserverCounter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean handlingEvent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean newEventOccurred;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public ArrayList<Lifecycle.State> parentStates;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final u120<Lifecycle.State> _currentStateFlow;

    /* JADX INFO: renamed from: androidx.lifecycle.k$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Landroidx/lifecycle/k$a;", "", "<init>", "()V", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "a", "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Lifecycle.State m3036a(@NotNull Lifecycle.State state1, @Nullable Lifecycle.State state2) {
            state1.getClass();
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.k$b */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Landroidx/lifecycle/k$b;", "", "Ll/jer;", "observer", "Landroidx/lifecycle/Lifecycle$State;", "initialState", "<init>", "(Ll/jer;Landroidx/lifecycle/Lifecycle$State;)V", "Ll/ker;", Owner.TYPE, "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "a", "(Ll/ker;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/Lifecycle$State;", "b", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "state", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "lifecycleObserver", "lifecycle-runtime_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public Lifecycle.State state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public LifecycleEventObserver lifecycleObserver;

        public b(@Nullable jer jerVar, @NotNull Lifecycle.State state) {
            state.getClass();
            jerVar.getClass();
            this.lifecycleObserver = C0484m.m3041f(jerVar);
            this.state = state;
        }

        /* JADX INFO: renamed from: a */
        public final void m3037a(@Nullable ker owner, @NotNull Lifecycle.Event event) {
            event.getClass();
            Lifecycle.State targetState = event.getTargetState();
            this.state = C0482k.INSTANCE.m3036a(this.state, targetState);
            LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            owner.getClass();
            lifecycleEventObserver.onStateChanged(owner, event);
            this.state = targetState;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Lifecycle.State getState() {
            return this.state;
        }
    }

    public C0482k(ker kerVar, boolean z) {
        this.enforceMainThread = z;
        this.observerMap = new ckg<>();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(kerVar);
        this._currentStateFlow = q3g0.m175121a(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    @MainThread
    /* JADX INFO: renamed from: a */
    public void mo2967a(@NotNull jer observer) {
        ker kerVar;
        observer.getClass();
        m3027g("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        b bVar = new b(observer, state2);
        if (this.observerMap.mo110334i(observer, bVar) == null && (kerVar = this.lifecycleOwner.get()) != null) {
            boolean z = this.addingObserverCounter != 0 || this.handlingEvent;
            Lifecycle.State stateM3026f = m3026f(observer);
            this.addingObserverCounter++;
            while (bVar.getState().compareTo(stateM3026f) < 0 && this.observerMap.contains(observer)) {
                m3033m(bVar.getState());
                Lifecycle.Event eventM2973c = Lifecycle.Event.INSTANCE.m2973c(bVar.getState());
                if (eventM2973c == null) {
                    qg50.m176437a("no event up from ", bVar.getState());
                    return;
                } else {
                    bVar.m3037a(kerVar, eventM2973c);
                    m3032l();
                    stateM3026f = m3026f(observer);
                }
            }
            if (!z) {
                m3035o();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public Lifecycle.State getState() {
        return this.state;
    }

    @Override // androidx.lifecycle.Lifecycle
    @MainThread
    /* JADX INFO: renamed from: d */
    public void mo2970d(@NotNull jer observer) {
        observer.getClass();
        m3027g("removeObserver");
        this.observerMap.mo110335j(observer);
    }

    /* JADX INFO: renamed from: e */
    public final void m3025e(ker lifecycleOwner) {
        Iterator<Map.Entry<jer, b>> itDescendingIterator = this.observerMap.descendingIterator();
        itDescendingIterator.getClass();
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<jer, b> next = itDescendingIterator.next();
            next.getClass();
            jer key = next.getKey();
            b value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                Lifecycle.Event eventM2971a = Lifecycle.Event.INSTANCE.m2971a(value.getState());
                if (eventM2971a == null) {
                    qg50.m176437a("no event down from ", value.getState());
                    return;
                } else {
                    m3033m(eventM2971a.getTargetState());
                    value.m3037a(lifecycleOwner, eventM2971a);
                    m3032l();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Lifecycle.State m3026f(jer observer) {
        b value;
        Map.Entry<jer, b> entryM110336l = this.observerMap.m110336l(observer);
        Lifecycle.State state = null;
        Lifecycle.State state2 = (entryM110336l == null || (value = entryM110336l.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.parentStates;
            state = arrayList.get(arrayList.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.m3036a(companion.m3036a(this.state, state2), state);
    }

    /* JADX INFO: renamed from: g */
    public final void m3027g(String methodName) {
        if (!this.enforceMainThread || per.m172060a()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    /* JADX INFO: renamed from: h */
    public final void m3028h(ker lifecycleOwner) {
        kwd0<jer, b>.C18285d c18285dM151691f = this.observerMap.m151691f();
        c18285dM151691f.getClass();
        while (c18285dM151691f.hasNext() && !this.newEventOccurred) {
            Map.Entry next = c18285dM151691f.next();
            jer jerVar = (jer) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(jerVar)) {
                m3033m(bVar.getState());
                Lifecycle.Event eventM2973c = Lifecycle.Event.INSTANCE.m2973c(bVar.getState());
                if (eventM2973c == null) {
                    qg50.m176437a("no event up from ", bVar.getState());
                    return;
                } else {
                    bVar.m3037a(lifecycleOwner, eventM2973c);
                    m3032l();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m3029i(@NotNull Lifecycle.Event event) {
        event.getClass();
        m3027g("handleLifecycleEvent");
        m3031k(event.getTargetState());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3030j() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<jer, b> entryM151690a = this.observerMap.m151690a();
        entryM151690a.getClass();
        Lifecycle.State state = entryM151690a.getValue().getState();
        Map.Entry<jer, b> entryM151692g = this.observerMap.m151692g();
        entryM151692g.getClass();
        Lifecycle.State state2 = entryM151692g.getValue().getState();
        return state == state2 && this.state == state2;
    }

    /* JADX INFO: renamed from: k */
    public final void m3031k(Lifecycle.State next) {
        if (this.state == next) {
            return;
        }
        C0483l.m3039a(this.lifecycleOwner.get(), this.state, next);
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        m3035o();
        this.handlingEvent = false;
        if (this.state == Lifecycle.State.DESTROYED) {
            this.observerMap = new ckg<>();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3032l() {
        ArrayList<Lifecycle.State> arrayList = this.parentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: m */
    public final void m3033m(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    /* JADX INFO: renamed from: n */
    public void m3034n(@NotNull Lifecycle.State state) {
        state.getClass();
        m3027g("setCurrentState");
        m3031k(state);
    }

    /* JADX INFO: renamed from: o */
    public final void m3035o() {
        ker kerVar = this.lifecycleOwner.get();
        if (kerVar == null) {
            wtq0.m207906a("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (!m3030j()) {
            this.newEventOccurred = false;
            Lifecycle.State state = this.state;
            Map.Entry<jer, b> entryM151690a = this.observerMap.m151690a();
            entryM151690a.getClass();
            if (state.compareTo(entryM151690a.getValue().getState()) < 0) {
                m3025e(kerVar);
            }
            Map.Entry<jer, b> entryM151692g = this.observerMap.m151692g();
            if (!this.newEventOccurred && entryM151692g != null && this.state.compareTo(entryM151692g.getValue().getState()) > 0) {
                m3028h(kerVar);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0482k(@NotNull ker kerVar) {
        this(kerVar, true);
        kerVar.getClass();
    }
}
