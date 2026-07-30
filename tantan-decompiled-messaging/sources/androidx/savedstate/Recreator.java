package androidx.savedstate;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import com.p046p1.mobile.putong.data.Owner;
import com.vivo.push.PushClientConstants;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.iqd0;
import p149l.jcr;
import p149l.ki3;
import p149l.pqd0;
import p149l.ptc0;
import p149l.qkq0;
import p149l.rqd0;
import p149l.y9g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0015"}, m87232d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "Ll/pqd0;", Owner.TYPE, "<init>", "(Ll/pqd0;)V", "", PushClientConstants.TAG_CLASS_NAME, "", "reflectiveNew", "(Ljava/lang/String;)V", "Ll/jcr;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "onStateChanged", "(Ll/jcr;Landroidx/lifecycle/Lifecycle$Event;)V", "Ll/pqd0;", "Companion", "b", "a", "savedstate_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class Recreator implements LifecycleEventObserver {

    @NotNull
    public static final String CLASSES_KEY = "classes_to_restore";

    @NotNull
    public static final String COMPONENT_KEY = "androidx.savedstate.Restarter";

    @NotNull
    private final pqd0 owner;

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$b */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, m87232d2 = {"Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/a$b;", "Landroidx/savedstate/a;", "registry", "<init>", "(Landroidx/savedstate/a;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "", PushClientConstants.TAG_CLASS_NAME, "", "b", "(Ljava/lang/String;)V", "", "Ljava/util/Set;", "classes", "savedstate_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C0676b implements C0677a.b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Set<String> classes;

        public C0676b(@NotNull C0677a c0677a) {
            c0677a.getClass();
            this.classes = new LinkedHashSet();
            c0677a.m4023c(Recreator.COMPONENT_KEY, this);
        }

        @Override // androidx.savedstate.C0677a.b
        @NotNull
        /* JADX INFO: renamed from: a */
        public Bundle mo2468a() {
            Pair[] pairArr;
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
            rqd0.m180440d(rqd0.m180437a(bundleM146052a), Recreator.CLASSES_KEY, CollectionsKt.toList(this.classes));
            return bundleM146052a;
        }

        /* JADX INFO: renamed from: b */
        public final void m4020b(@NotNull String className) {
            className.getClass();
            this.classes.add(className);
        }
    }

    public Recreator(@NotNull pqd0 pqd0Var) {
        pqd0Var.getClass();
        this.owner = pqd0Var;
    }

    private final void reflectiveNew(String className) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(className, false, Recreator.class.getClassLoader()).asSubclass(C0677a.a.class);
            clsAsSubclass.getClass();
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    objNewInstance.getClass();
                    ((C0677a.a) objNewInstance).mo2965a(this.owner);
                } catch (Exception e) {
                    ptc0.m171306a("Failed to instantiate ", className, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + className + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull jcr source, @NotNull Lifecycle.Event event) {
        source.getClass();
        event.getClass();
        if (event != Lifecycle.Event.ON_CREATE) {
            y9g0.m213537a("Next event must be ON_CREATE");
            return;
        }
        source.getLifecycle().mo2969d(this);
        Bundle bundleM4021a = this.owner.getSavedStateRegistry().m4021a(COMPONENT_KEY);
        if (bundleM4021a == null) {
            return;
        }
        List<String> listM137737d = iqd0.m137737d(iqd0.m137734a(bundleM4021a), CLASSES_KEY);
        if (listM137737d == null) {
            qkq0.m175383a("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        Iterator<String> it = listM137737d.iterator();
        while (it.hasNext()) {
            reflectiveNew(it.next());
        }
    }
}
