package androidx.savedstate;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import com.p051p1.mobile.putong.data.Owner;
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
import p153l.gig0;
import p153l.ker;
import p153l.kyd0;
import p153l.ryd0;
import p153l.tyd0;
import p153l.u1d0;
import p153l.wtq0;
import p153l.yi3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0015"}, m88121d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "Ll/ryd0;", Owner.TYPE, "<init>", "(Ll/ryd0;)V", "", PushClientConstants.TAG_CLASS_NAME, "", "reflectiveNew", "(Ljava/lang/String;)V", "Ll/ker;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "onStateChanged", "(Ll/ker;Landroidx/lifecycle/Lifecycle$Event;)V", "Ll/ryd0;", "Companion", "b", "a", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class Recreator implements LifecycleEventObserver {

    @NotNull
    public static final String CLASSES_KEY = "classes_to_restore";

    @NotNull
    public static final String COMPONENT_KEY = "androidx.savedstate.Restarter";

    @NotNull
    private final ryd0 owner;

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$b */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/a$b;", "Landroidx/savedstate/a;", "registry", "<init>", "(Landroidx/savedstate/a;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "", PushClientConstants.TAG_CLASS_NAME, "", "b", "(Ljava/lang/String;)V", "", "Ljava/util/Set;", "classes", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C0678b implements C0679a.b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Set<String> classes;

        public C0678b(@NotNull C0679a c0679a) {
            c0679a.getClass();
            this.classes = new LinkedHashSet();
            c0679a.m4025c(Recreator.COMPONENT_KEY, this);
        }

        @Override // androidx.savedstate.C0679a.b
        @NotNull
        /* JADX INFO: renamed from: a */
        public Bundle mo2469a() {
            Pair[] pairArr;
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
            tyd0.m193570d(tyd0.m193567a(bundleM216006a), Recreator.CLASSES_KEY, CollectionsKt.toList(this.classes));
            return bundleM216006a;
        }

        /* JADX INFO: renamed from: b */
        public final void m4022b(@NotNull String className) {
            className.getClass();
            this.classes.add(className);
        }
    }

    public Recreator(@NotNull ryd0 ryd0Var) {
        ryd0Var.getClass();
        this.owner = ryd0Var;
    }

    private final void reflectiveNew(String className) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(className, false, Recreator.class.getClassLoader()).asSubclass(C0679a.a.class);
            clsAsSubclass.getClass();
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    objNewInstance.getClass();
                    ((C0679a.a) objNewInstance).mo2966a(this.owner);
                } catch (Exception e) {
                    u1d0.m193953a("Failed to instantiate ", className, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + className + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull ker source, @NotNull Lifecycle.Event event) {
        source.getClass();
        event.getClass();
        if (event != Lifecycle.Event.ON_CREATE) {
            gig0.m130323a("Next event must be ON_CREATE");
            return;
        }
        source.getLifecycle().mo2970d(this);
        Bundle bundleM4023a = this.owner.getSavedStateRegistry().m4023a(COMPONENT_KEY);
        if (bundleM4023a == null) {
            return;
        }
        List<String> listM151956d = kyd0.m151956d(kyd0.m151953a(bundleM4023a), CLASSES_KEY);
        if (listM151956d == null) {
            wtq0.m207906a("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        Iterator<String> it = listM151956d.iterator();
        while (it.hasNext()) {
            reflectiveNew(it.next());
        }
    }
}
