package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ker;
import p153l.nbr;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "defaultLifecycleObserver", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/LifecycleEventObserver;)V", "Ll/ker;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Ll/ker;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class DefaultLifecycleObserverAdapter implements LifecycleEventObserver {

    @NotNull
    private final DefaultLifecycleObserver defaultLifecycleObserver;

    @Nullable
    private final LifecycleEventObserver lifecycleEventObserver;

    /* JADX INFO: renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C0449a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2260a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f2260a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(@NotNull DefaultLifecycleObserver defaultLifecycleObserver, @Nullable LifecycleEventObserver lifecycleEventObserver) {
        defaultLifecycleObserver.getClass();
        this.defaultLifecycleObserver = defaultLifecycleObserver;
        this.lifecycleEventObserver = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull ker source, @NotNull Lifecycle.Event event) {
        source.getClass();
        event.getClass();
        switch (C0449a.f2260a[event.ordinal()]) {
            case 1:
                this.defaultLifecycleObserver.onCreate(source);
                break;
            case 2:
                this.defaultLifecycleObserver.onStart(source);
                break;
            case 3:
                this.defaultLifecycleObserver.onResume(source);
                break;
            case 4:
                this.defaultLifecycleObserver.onPause(source);
                break;
            case 5:
                this.defaultLifecycleObserver.onStop(source);
                break;
            case 6:
                this.defaultLifecycleObserver.onDestroy(source);
                break;
            case 7:
                wg3.m206174a("ON_ANY must not been send by anybody");
                return;
            default:
                nbr.m162172a();
                return;
        }
        LifecycleEventObserver lifecycleEventObserver = this.lifecycleEventObserver;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.onStateChanged(source, event);
        }
    }
}
