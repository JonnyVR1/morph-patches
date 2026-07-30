package p003l;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class jjd0 {
    private static final jjd0 INSTANCE = new jjd0();

    /* JADX INFO: renamed from: f */
    public static final djd0 f4673f = new C0353a();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<djd0> f4674a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<fjd0> f4675b = new AtomicReference<>();

    /* JADX INFO: renamed from: c */
    public final AtomicReference<ljd0> f4676c = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public final AtomicReference<cjd0> f4677d = new AtomicReference<>();

    /* JADX INFO: renamed from: e */
    public final AtomicReference<kjd0> f4678e = new AtomicReference<>();

    /* JADX INFO: renamed from: l.jjd0$a */
    public static class C0353a extends djd0 {
    }

    /* JADX INFO: renamed from: l.jjd0$b */
    public class C0354b extends cjd0 {
        public C0354b() {
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static jjd0 m5345c() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Object m5346e(Class<?> cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            for (Map.Entry entry : properties2.entrySet()) {
                String string = entry.getKey().toString();
                if (string.startsWith("rxjava.plugin.") && string.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String str = "rxjava.plugin." + string.substring(0, string.length() - 6).substring(14) + ".impl";
                    String property2 = properties2.getProperty(str);
                    if (property2 != null) {
                        property = property2;
                        break;
                    }
                    hjd0.m4968a("Implementing class declaration for ", simpleName, " missing: ", str);
                    return null;
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e) {
            throw new IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + property, e);
        } catch (ClassNotFoundException e2) {
            ijd0.m5132a(simpleName, " implementation class not found: ", property, e2);
            return null;
        } catch (IllegalAccessException e3) {
            ijd0.m5132a(simpleName, " implementation not able to be accessed: ", property, e3);
            return null;
        } catch (InstantiationException e4) {
            ijd0.m5132a(simpleName, " implementation not able to be instantiated: ", property, e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public cjd0 m5347a() {
        if (this.f4677d.get() == null) {
            Object objM5346e = m5346e(cjd0.class, System.getProperties());
            AtomicReference<cjd0> atomicReference = this.f4677d;
            if (objM5346e == null) {
                f31.a(atomicReference, (Object) null, new C0354b());
            } else {
                f31.a(atomicReference, (Object) null, (cjd0) objM5346e);
            }
        }
        return this.f4677d.get();
    }

    /* JADX INFO: renamed from: b */
    public djd0 m5348b() {
        if (this.f4674a.get() == null) {
            Object objM5346e = m5346e(djd0.class, System.getProperties());
            AtomicReference<djd0> atomicReference = this.f4674a;
            if (objM5346e == null) {
                f31.a(atomicReference, (Object) null, f4673f);
            } else {
                f31.a(atomicReference, (Object) null, (djd0) objM5346e);
            }
        }
        return this.f4674a.get();
    }

    /* JADX INFO: renamed from: d */
    public fjd0 m5349d() {
        if (this.f4675b.get() == null) {
            Object objM5346e = m5346e(fjd0.class, System.getProperties());
            AtomicReference<fjd0> atomicReference = this.f4675b;
            if (objM5346e == null) {
                f31.a(atomicReference, (Object) null, gjd0.m4553f());
            } else {
                f31.a(atomicReference, (Object) null, (fjd0) objM5346e);
            }
        }
        return this.f4675b.get();
    }

    /* JADX INFO: renamed from: f */
    public kjd0 m5350f() {
        if (this.f4678e.get() == null) {
            Object objM5346e = m5346e(kjd0.class, System.getProperties());
            AtomicReference<kjd0> atomicReference = this.f4678e;
            if (objM5346e == null) {
                f31.a(atomicReference, (Object) null, kjd0.m5691h());
            } else {
                f31.a(atomicReference, (Object) null, (kjd0) objM5346e);
            }
        }
        return this.f4678e.get();
    }

    /* JADX INFO: renamed from: g */
    public ljd0 m5351g() {
        if (this.f4676c.get() == null) {
            Object objM5346e = m5346e(ljd0.class, System.getProperties());
            AtomicReference<ljd0> atomicReference = this.f4676c;
            if (objM5346e == null) {
                f31.a(atomicReference, (Object) null, mjd0.m6404f());
            } else {
                f31.a(atomicReference, (Object) null, (ljd0) objM5346e);
            }
        }
        return this.f4676c.get();
    }
}
