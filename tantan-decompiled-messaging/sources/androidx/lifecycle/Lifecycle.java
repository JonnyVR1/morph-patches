package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.g31;
import p149l.icr;
import p149l.l9r;
import p149l.ock0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\bR:\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m87232d2 = {"Landroidx/lifecycle/Lifecycle;", "", "<init>", "()V", "Ll/icr;", "observer", "", "a", "(Ll/icr;)V", Constants.INAPP_DATA_TAG, "Ll/g31;", "value", "Ll/g31;", "c", "()Ll/g31;", "setInternalScopeRef", "(Ll/g31;)V", "internalScopeRef", "Landroidx/lifecycle/Lifecycle$State;", "b", "()Landroidx/lifecycle/Lifecycle$State;", "currentState", "Event", "State", "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class Lifecycle {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public g31<Object> internalScopeRef = new g31<>(null);

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m87232d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "targetState", "Companion", "a", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$Event$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, m87232d2 = {"Landroidx/lifecycle/Lifecycle$Event$a;", "", "<init>", "()V", "Landroidx/lifecycle/Lifecycle$State;", "state", "Landroidx/lifecycle/Lifecycle$Event;", "a", "(Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;", "b", "c", Constants.INAPP_DATA_TAG, "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$Event$a$a */
            @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f2267a;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f2267a = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @Nullable
            /* JADX INFO: renamed from: a */
            public final Event m2970a(@NotNull State state) {
                state.getClass();
                int i = a.f2267a[state.ordinal()];
                if (i == 1) {
                    return Event.ON_DESTROY;
                }
                if (i == 2) {
                    return Event.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            @JvmStatic
            @Nullable
            /* JADX INFO: renamed from: b */
            public final Event m2971b(@NotNull State state) {
                state.getClass();
                int i = a.f2267a[state.ordinal()];
                if (i == 1) {
                    return Event.ON_STOP;
                }
                if (i == 2) {
                    return Event.ON_PAUSE;
                }
                if (i != 4) {
                    return null;
                }
                return Event.ON_DESTROY;
            }

            @JvmStatic
            @Nullable
            /* JADX INFO: renamed from: c */
            public final Event m2972c(@NotNull State state) {
                state.getClass();
                int i = a.f2267a[state.ordinal()];
                if (i == 1) {
                    return Event.ON_START;
                }
                if (i == 2) {
                    return Event.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            @JvmStatic
            @Nullable
            /* JADX INFO: renamed from: d */
            public final Event m2973d(@NotNull State state) {
                state.getClass();
                int i = a.f2267a[state.ordinal()];
                if (i == 1) {
                    return Event.ON_CREATE;
                }
                if (i == 2) {
                    return Event.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }

            public Companion() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$Event$b */
        @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
        public /* synthetic */ class C0456b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f2268a;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f2268a = iArr;
            }
        }

        @JvmStatic
        @Nullable
        public static final Event downFrom(@NotNull State state) {
            return INSTANCE.m2970a(state);
        }

        @JvmStatic
        @Nullable
        public static final Event downTo(@NotNull State state) {
            return INSTANCE.m2971b(state);
        }

        @NotNull
        public static EnumEntries<Event> getEntries() {
            return $ENTRIES;
        }

        @JvmStatic
        @Nullable
        public static final Event upFrom(@NotNull State state) {
            return INSTANCE.m2972c(state);
        }

        @JvmStatic
        @Nullable
        public static final Event upTo(@NotNull State state) {
            return INSTANCE.m2973d(state);
        }

        @NotNull
        public final State getTargetState() {
            switch (C0456b.f2268a[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                case 7:
                    ock0.m163533a(this, " has no target state");
                    return null;
                default:
                    l9r.m149037a();
                    return null;
            }
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\f"}, m87232d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "<init>", "(Ljava/lang/String;I)V", "DESTROYED", "INITIALIZED", "CREATED", AbstractLifeCycle.STARTED, "RESUMED", "isAtLeast", "", "state", "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public final boolean isAtLeast(@NotNull State state) {
            state.getClass();
            return compareTo(state) >= 0;
        }
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public abstract void mo2966a(@NotNull icr observer);

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract State mo2967b();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: c */
    public final g31<Object> m2968c() {
        return this.internalScopeRef;
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public abstract void mo2969d(@NotNull icr observer);
}
