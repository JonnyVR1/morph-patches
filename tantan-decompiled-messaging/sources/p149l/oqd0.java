package p149l;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.savedstate.C0677a;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Owner;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 42\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u00052\n\u0010\u001a\u001a\u00060\u000bj\u0002`\fH\u0001¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010-\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010,R$\u0010/\u001a\u00020(2\u0006\u0010.\u001a\u00020(8G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b/\u00100R\"\u00103\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010*\u001a\u0004\b)\u00100\"\u0004\b1\u00102¨\u00065"}, m87232d2 = {"Ll/oqd0;", "", "Ll/pqd0;", Owner.TYPE, "Lkotlin/Function0;", "", "onAttach", "<init>", "(Ll/pqd0;Lkotlin/jvm/functions/Function0;)V", "", Constants.KEY_KEY, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/a$b;", "provider", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Landroidx/savedstate/a$b;)V", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Landroidx/savedstate/a$b;", "f", "()V", "savedState", "g", "(Landroid/os/Bundle;)V", "outBundle", "h", "a", "Ll/pqd0;", "b", "Lkotlin/jvm/functions/Function0;", "getOnAttach$savedstate_release", "()Lkotlin/jvm/functions/Function0;", "Ll/ggh0;", "Ll/ggh0;", JoinPoint.SYNCHRONIZATION_LOCK, "", "Ljava/util/Map;", "keyToProviders", "", "e", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "value", "isRestored", "()Z", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "Companion", "savedstate_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class oqd0 {

    @NotNull
    private static final C19000a Companion = new C19000a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final pqd0 owner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onAttach;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ggh0 lock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, C0677a.b> keyToProviders;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean attached;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Bundle restoredState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isRestored;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isAllowingSavingState;

    public oqd0(@NotNull pqd0 pqd0Var, @NotNull Function0<Unit> function0) {
        pqd0Var.getClass();
        function0.getClass();
        this.owner = pqd0Var;
        this.onAttach = function0;
        this.lock = new ggh0();
        this.keyToProviders = new LinkedHashMap();
        this.isAllowingSavingState = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m165410a(oqd0 oqd0Var, jcr jcrVar, Lifecycle.Event event) {
        jcrVar.getClass();
        event.getClass();
        if (event == Lifecycle.Event.ON_START) {
            oqd0Var.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            oqd0Var.isAllowingSavingState = false;
        }
    }

    @MainThread
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Bundle m165412c(@NotNull String key) {
        key.getClass();
        if (!this.isRestored) {
            qkq0.m175383a("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM137734a = iqd0.m137734a(bundle);
        Bundle bundleM137736c = iqd0.m137735b(bundleM137734a, key) ? iqd0.m137736c(bundleM137734a, key) : null;
        rqd0.m180441e(rqd0.m180437a(bundle), key);
        if (iqd0.m137738e(iqd0.m137734a(bundle))) {
            this.restoredState = null;
        }
        return bundleM137736c;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final C0677a.b m165413d(@NotNull String key) {
        C0677a.b bVar;
        key.getClass();
        synchronized (this.lock) {
            Iterator it = this.keyToProviders.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                C0677a.b bVar2 = (C0677a.b) entry.getValue();
                if (Intrinsics.m87488d(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsAllowingSavingState() {
        return this.isAllowingSavingState;
    }

    @MainThread
    /* JADX INFO: renamed from: f */
    public final void m165415f() {
        if (this.owner.getLifecycle().getState() != Lifecycle.State.INITIALIZED) {
            qkq0.m175383a("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.attached) {
                qkq0.m175383a("SavedStateRegistry was already attached.");
                return;
            }
            this.onAttach.invoke();
            this.owner.getLifecycle().mo2966a(new LifecycleEventObserver() { // from class: l.nqd0
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(jcr jcrVar, Lifecycle.Event event) {
                    oqd0.m165410a(this.f140058a, jcrVar, event);
                }
            });
            this.attached = true;
        }
    }

    @MainThread
    /* JADX INFO: renamed from: g */
    public final void m165416g(@Nullable Bundle savedState) {
        if (!this.attached) {
            m165415f();
        }
        if (this.owner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            ddk0.m111027a("performRestore cannot be called when owner is ", this.owner.getLifecycle().getState());
            return;
        }
        if (this.isRestored) {
            qkq0.m175383a("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM137736c = null;
        if (savedState != null) {
            Bundle bundleM137734a = iqd0.m137734a(savedState);
            if (iqd0.m137735b(bundleM137734a, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleM137736c = iqd0.m137736c(bundleM137734a, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.restoredState = bundleM137736c;
        this.isRestored = true;
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public final void m165417h(@NotNull Bundle outBundle) {
        Pair[] pairArr;
        outBundle.getClass();
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.m87240a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM146052a = ki3.m146052a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM180437a = rqd0.m180437a(bundleM146052a);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            rqd0.m180438b(bundleM180437a, bundle);
        }
        synchronized (this.lock) {
            try {
                for (Map.Entry entry2 : this.keyToProviders.entrySet()) {
                    rqd0.m180439c(bundleM180437a, (String) entry2.getKey(), ((C0677a.b) entry2.getValue()).mo2468a());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iqd0.m137738e(iqd0.m137734a(bundleM146052a))) {
            return;
        }
        rqd0.m180439c(rqd0.m180437a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM146052a);
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public final void m165418i(@NotNull String key, @NotNull C0677a.b provider) {
        key.getClass();
        provider.getClass();
        synchronized (this.lock) {
            if (this.keyToProviders.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.keyToProviders.put(key, provider);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: l.oqd0$a */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/oqd0$a;", "", "<init>", "()V", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C19000a {
        public /* synthetic */ C19000a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C19000a() {
        }
    }
}
