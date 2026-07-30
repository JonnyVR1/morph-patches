package p153l;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.savedstate.C0679a;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Owner;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 42\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u00052\n\u0010\u001a\u001a\u00060\u000bj\u0002`\fH\u0001¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010-\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010,R$\u0010/\u001a\u00020(2\u0006\u0010.\u001a\u00020(8G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b/\u00100R\"\u00103\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010*\u001a\u0004\b)\u00100\"\u0004\b1\u00102¨\u00065"}, m88121d2 = {"Ll/qyd0;", "", "Ll/ryd0;", Owner.TYPE, "Lkotlin/Function0;", "", "onAttach", "<init>", "(Ll/ryd0;Lkotlin/jvm/functions/Function0;)V", "", Constants.KEY_KEY, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/a$b;", "provider", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Landroidx/savedstate/a$b;)V", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Landroidx/savedstate/a$b;", "f", "()V", "savedState", "g", "(Landroid/os/Bundle;)V", "outBundle", "h", "a", "Ll/ryd0;", "b", "Lkotlin/jvm/functions/Function0;", "getOnAttach$savedstate_release", "()Lkotlin/jvm/functions/Function0;", "Ll/noh0;", "Ll/noh0;", JoinPoint.SYNCHRONIZATION_LOCK, "", "Ljava/util/Map;", "keyToProviders", "", "e", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "value", "isRestored", "()Z", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "Companion", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class qyd0 {

    @NotNull
    private static final C19691a Companion = new C19691a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ryd0 owner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onAttach;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final noh0 lock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, C0679a.b> keyToProviders;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean attached;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Bundle restoredState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isRestored;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isAllowingSavingState;

    public qyd0(@NotNull ryd0 ryd0Var, @NotNull Function0<Unit> function0) {
        ryd0Var.getClass();
        function0.getClass();
        this.owner = ryd0Var;
        this.onAttach = function0;
        this.lock = new noh0();
        this.keyToProviders = new LinkedHashMap();
        this.isAllowingSavingState = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m178631a(qyd0 qyd0Var, ker kerVar, Lifecycle.Event event) {
        kerVar.getClass();
        event.getClass();
        if (event == Lifecycle.Event.ON_START) {
            qyd0Var.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            qyd0Var.isAllowingSavingState = false;
        }
    }

    @MainThread
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Bundle m178633c(@NotNull String key) {
        key.getClass();
        if (!this.isRestored) {
            wtq0.m207906a("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM151953a = kyd0.m151953a(bundle);
        Bundle bundleM151955c = kyd0.m151954b(bundleM151953a, key) ? kyd0.m151955c(bundleM151953a, key) : null;
        tyd0.m193571e(tyd0.m193567a(bundle), key);
        if (kyd0.m151957e(kyd0.m151953a(bundle))) {
            this.restoredState = null;
        }
        return bundleM151955c;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final C0679a.b m178634d(@NotNull String key) {
        C0679a.b bVar;
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
                C0679a.b bVar2 = (C0679a.b) entry.getValue();
                if (Intrinsics.m88377d(str, key)) {
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
    public final void m178636f() {
        if (this.owner.getLifecycle().getState() != Lifecycle.State.INITIALIZED) {
            wtq0.m207906a("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.attached) {
                wtq0.m207906a("SavedStateRegistry was already attached.");
                return;
            }
            this.onAttach.invoke();
            this.owner.getLifecycle().mo2967a(new LifecycleEventObserver() { // from class: l.pyd0
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(ker kerVar, Lifecycle.Event event) {
                    qyd0.m178631a(this.f154629a, kerVar, event);
                }
            });
            this.attached = true;
        }
    }

    @MainThread
    /* JADX INFO: renamed from: g */
    public final void m178637g(@Nullable Bundle savedState) {
        if (!this.attached) {
            m178636f();
        }
        if (this.owner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            jmk0.m146166a("performRestore cannot be called when owner is ", this.owner.getLifecycle().getState());
            return;
        }
        if (this.isRestored) {
            wtq0.m207906a("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM151955c = null;
        if (savedState != null) {
            Bundle bundleM151953a = kyd0.m151953a(savedState);
            if (kyd0.m151954b(bundleM151953a, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleM151955c = kyd0.m151955c(bundleM151953a, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.restoredState = bundleM151955c;
        this.isRestored = true;
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public final void m178638h(@NotNull Bundle outBundle) {
        Pair[] pairArr;
        outBundle.getClass();
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.m88129a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM216006a = yi3.m216006a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM193567a = tyd0.m193567a(bundleM216006a);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            tyd0.m193568b(bundleM193567a, bundle);
        }
        synchronized (this.lock) {
            try {
                for (Map.Entry entry2 : this.keyToProviders.entrySet()) {
                    tyd0.m193569c(bundleM193567a, (String) entry2.getKey(), ((C0679a.b) entry2.getValue()).mo2469a());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kyd0.m151957e(kyd0.m151953a(bundleM216006a))) {
            return;
        }
        tyd0.m193569c(tyd0.m193567a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM216006a);
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public final void m178639i(@NotNull String key, @NotNull C0679a.b provider) {
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

    /* JADX INFO: renamed from: l.qyd0$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/qyd0$a;", "", "<init>", "()V", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C19691a {
        public /* synthetic */ C19691a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C19691a() {
        }
    }
}
