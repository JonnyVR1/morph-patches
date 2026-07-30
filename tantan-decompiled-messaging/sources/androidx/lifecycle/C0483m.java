package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.vivo.push.PushClientConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import p149l.aag0;
import p149l.icr;

/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0004\u0012\u00020\u00150\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006!"}, m87232d2 = {"Landroidx/lifecycle/m;", "", "<init>", "()V", "object", "Landroidx/lifecycle/LifecycleEventObserver;", "f", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleEventObserver;", "", PushClientConstants.TAG_CLASS_NAME, "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/d;", "constructor", "a", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/d;", "Ljava/lang/Class;", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/Class;)I", "g", "", "e", "(Ljava/lang/Class;)Z", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class C0483m {

    @NotNull
    public static final C0483m INSTANCE = new C0483m();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<Class<?>, Integer> callbackCache = new HashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<Class<?>, List<Constructor<? extends InterfaceC0474d>>> classToAdapters = new HashMap();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m3039c(@NotNull String className) {
        className.getClass();
        return C15386d.m93479F(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final LifecycleEventObserver m3040f(@NotNull Object object) {
        object.getClass();
        boolean z = object instanceof LifecycleEventObserver;
        boolean z2 = object instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        C0483m c0483m = INSTANCE;
        if (c0483m.m3043d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends InterfaceC0474d>> list = classToAdapters.get(cls);
        list.getClass();
        List<Constructor<? extends InterfaceC0474d>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(c0483m.m3041a(list2.get(0), object));
        }
        int size = list2.size();
        InterfaceC0474d[] interfaceC0474dArr = new InterfaceC0474d[size];
        for (int i = 0; i < size; i++) {
            interfaceC0474dArr[i] = INSTANCE.m3041a(list2.get(i), object);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0474dArr);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0474d m3041a(Constructor<? extends InterfaceC0474d> constructor, Object object) {
        try {
            InterfaceC0474d interfaceC0474dNewInstance = constructor.newInstance(object);
            interfaceC0474dNewInstance.getClass();
            return interfaceC0474dNewInstance;
        } catch (IllegalAccessException e) {
            aag0.m95543a(e);
            return null;
        } catch (InstantiationException e2) {
            aag0.m95543a(e2);
            return null;
        } catch (InvocationTargetException e3) {
            aag0.m95543a(e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Constructor<? extends InterfaceC0474d> m3042b(Class<?> klass) {
        try {
            Package r0 = klass.getPackage();
            String canonicalName = klass.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            name.getClass();
            if (name.length() != 0) {
                canonicalName.getClass();
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            canonicalName.getClass();
            String strM3039c = m3039c(canonicalName);
            if (name.length() != 0) {
                strM3039c = name + '.' + strM3039c;
            }
            Constructor declaredConstructor = Class.forName(strM3039c).getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m3043d(Class<?> klass) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iM3045g = m3045g(klass);
        map.put(klass, Integer.valueOf(iM3045g));
        return iM3045g;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3044e(Class<?> klass) {
        return klass != null && icr.class.isAssignableFrom(klass);
    }

    /* JADX INFO: renamed from: g */
    public final int m3045g(Class<?> klass) {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0474d> constructorM3042b = m3042b(klass);
        if (constructorM3042b != null) {
            classToAdapters.put(klass, CollectionsKt.listOf(constructorM3042b));
            return 2;
        }
        if (C0471a.f2285c.m3014d(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (m3044e(superclass)) {
            superclass.getClass();
            if (m3043d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC0474d>> list = classToAdapters.get(superclass);
            list.getClass();
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Iterator itM87456a = ArrayIteratorKt.m87456a(klass.getInterfaces());
        while (itM87456a.hasNext()) {
            Class<?> cls = (Class) itM87456a.next();
            if (m3044e(cls)) {
                cls.getClass();
                if (m3043d(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC0474d>> list2 = classToAdapters.get(cls);
                list2.getClass();
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }
}
