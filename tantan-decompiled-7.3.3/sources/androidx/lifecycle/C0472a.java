package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.iig0;
import p153l.ker;
import p153l.vtq0;
import p153l.wg3;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0472a {

    /* JADX INFO: renamed from: c */
    public static C0472a f2285c = new C0472a();

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, a> f2286a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, Boolean> f2287b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.a$a */
    @Deprecated
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Map<Lifecycle.Event, List<b>> f2288a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Map<b, Lifecycle.Event> f2289b;

        public a(Map<b, Lifecycle.Event> map) {
            this.f2289b = map;
            for (Map.Entry<b, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<b> arrayList = this.f2288a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f2288a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m3017b(List<b> list, ker kerVar, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m3019a(kerVar, event, obj);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3018a(ker kerVar, Lifecycle.Event event, Object obj) {
            m3017b(this.f2288a.get(event), kerVar, event, obj);
            m3017b(this.f2288a.get(Lifecycle.Event.ON_ANY), kerVar, event, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a$b */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f2290a;

        /* JADX INFO: renamed from: b */
        public final Method f2291b;

        public b(int i, Method method) {
            this.f2290a = i;
            this.f2291b = method;
            method.setAccessible(true);
        }

        /* JADX INFO: renamed from: a */
        public void m3019a(ker kerVar, Lifecycle.Event event, Object obj) {
            try {
                int i = this.f2290a;
                if (i == 0) {
                    this.f2291b.invoke(obj, null);
                } else if (i == 1) {
                    this.f2291b.invoke(obj, kerVar);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.f2291b.invoke(obj, kerVar, event);
                }
            } catch (IllegalAccessException e) {
                iig0.m140070a(e);
            } catch (InvocationTargetException e2) {
                vtq0.m202761a("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2290a == bVar.f2290a && this.f2291b.getName().equals(bVar.f2291b.getName());
        }

        public int hashCode() {
            return (this.f2290a * 31) + this.f2291b.getName().hashCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m3012a(Class<?> cls, Method[] methodArr) {
        int i;
        a aVarM3014c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM3014c = m3014c(superclass)) != null) {
            map.putAll(aVarM3014c.f2289b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, Lifecycle.Event> entry : m3014c(cls2).f2289b.entrySet()) {
                m3016e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m3013b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0485n interfaceC0485n = (InterfaceC0485n) method.getAnnotation(InterfaceC0485n.class);
            if (interfaceC0485n != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ker.class.isAssignableFrom(parameterTypes[0])) {
                        wg3.m206174a("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                Lifecycle.Event eventValue = interfaceC0485n.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        wg3.m206174a("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        wg3.m206174a("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    wg3.m206174a("cannot have more than 2 params");
                    return null;
                }
                m3016e(map, new b(i, method), eventValue, cls);
                z = true;
            }
        }
        a aVar = new a(map);
        this.f2286a.put(cls, aVar);
        this.f2287b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public final Method[] m3013b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public a m3014c(Class<?> cls) {
        a aVar = this.f2286a.get(cls);
        return aVar != null ? aVar : m3012a(cls, null);
    }

    /* JADX INFO: renamed from: d */
    public boolean m3015d(Class<?> cls) {
        Boolean bool = this.f2287b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrM3013b = m3013b(cls);
        for (Method method : methodArrM3013b) {
            if (((InterfaceC0485n) method.getAnnotation(InterfaceC0485n.class)) != null) {
                m3012a(cls, methodArrM3013b);
                return true;
            }
        }
        this.f2287b.put(cls, Boolean.FALSE);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m3016e(Map<b, Lifecycle.Event> map, b bVar, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(bVar);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(bVar, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f2291b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }
}
