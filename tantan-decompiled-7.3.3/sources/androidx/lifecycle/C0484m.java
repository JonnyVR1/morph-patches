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
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p153l.iig0;
import p153l.jer;

/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0004\u0012\u00020\u00150\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006!"}, m88121d2 = {"Landroidx/lifecycle/m;", "", "<init>", "()V", "object", "Landroidx/lifecycle/LifecycleEventObserver;", "f", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleEventObserver;", "", PushClientConstants.TAG_CLASS_NAME, "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/d;", "constructor", "a", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/d;", "Ljava/lang/Class;", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/Class;)I", "g", "", "e", "(Ljava/lang/Class;)Z", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class C0484m {

    @NotNull
    public static final C0484m INSTANCE = new C0484m();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<Class<?>, Integer> callbackCache = new HashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<Class<?>, List<Constructor<? extends InterfaceC0475d>>> classToAdapters = new HashMap();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m3040c(@NotNull String className) {
        className.getClass();
        return C15493d.m94370F(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final LifecycleEventObserver m3041f(@NotNull Object object) {
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
        C0484m c0484m = INSTANCE;
        if (c0484m.m3044d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends InterfaceC0475d>> list = classToAdapters.get(cls);
        list.getClass();
        List<Constructor<? extends InterfaceC0475d>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(c0484m.m3042a(list2.get(0), object));
        }
        int size = list2.size();
        InterfaceC0475d[] interfaceC0475dArr = new InterfaceC0475d[size];
        for (int i = 0; i < size; i++) {
            interfaceC0475dArr[i] = INSTANCE.m3042a(list2.get(i), object);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0475dArr);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0475d m3042a(Constructor<? extends InterfaceC0475d> constructor, Object object) {
        try {
            InterfaceC0475d interfaceC0475dNewInstance = constructor.newInstance(object);
            interfaceC0475dNewInstance.getClass();
            return interfaceC0475dNewInstance;
        } catch (IllegalAccessException e) {
            iig0.m140070a(e);
            return null;
        } catch (InstantiationException e2) {
            iig0.m140070a(e2);
            return null;
        } catch (InvocationTargetException e3) {
            iig0.m140070a(e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Constructor<? extends InterfaceC0475d> m3043b(Class<?> klass) {
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
            String strM3040c = m3040c(canonicalName);
            if (name.length() != 0) {
                strM3040c = name + '.' + strM3040c;
            }
            Constructor declaredConstructor = Class.forName(strM3040c).getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m3044d(Class<?> klass) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iM3046g = m3046g(klass);
        map.put(klass, Integer.valueOf(iM3046g));
        return iM3046g;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3045e(Class<?> klass) {
        return klass != null && jer.class.isAssignableFrom(klass);
    }

    /* JADX INFO: renamed from: g */
    public final int m3046g(Class<?> klass) {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0475d> constructorM3043b = m3043b(klass);
        if (constructorM3043b != null) {
            classToAdapters.put(klass, CollectionsKt.listOf(constructorM3043b));
            return 2;
        }
        if (C0472a.f2285c.m3015d(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (m3045e(superclass)) {
            superclass.getClass();
            if (m3044d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC0475d>> list = classToAdapters.get(superclass);
            list.getClass();
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Iterator itM88345a = ArrayIteratorKt.m88345a(klass.getInterfaces());
        while (itM88345a.hasNext()) {
            Class<?> cls = (Class) itM88345a.next();
            if (m3045e(cls)) {
                cls.getClass();
                if (m3044d(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC0475d>> list2 = classToAdapters.get(cls);
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
