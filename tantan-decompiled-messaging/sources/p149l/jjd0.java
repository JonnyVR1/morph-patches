package p149l;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class jjd0 {
    private static final jjd0 INSTANCE = new jjd0();

    /* JADX INFO: renamed from: f */
    public static final djd0 f118276f = new C17799a();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<djd0> f118277a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<fjd0> f118278b = new AtomicReference<>();

    /* JADX INFO: renamed from: c */
    public final AtomicReference<ljd0> f118279c = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public final AtomicReference<cjd0> f118280d = new AtomicReference<>();

    /* JADX INFO: renamed from: e */
    public final AtomicReference<kjd0> f118281e = new AtomicReference<>();

    /* JADX INFO: renamed from: l.jjd0$a */
    public static class C17799a extends djd0 {
    }

    /* JADX INFO: renamed from: l.jjd0$b */
    public class C17800b extends cjd0 {
        public C17800b() {
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static jjd0 m141790c() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Object m141791e(Class<?> cls, Properties properties) {
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
                    hjd0.m131368a("Implementing class declaration for ", simpleName, " missing: ", str);
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
            ijd0.m136593a(simpleName, " implementation class not found: ", property, e2);
            return null;
        } catch (IllegalAccessException e3) {
            ijd0.m136593a(simpleName, " implementation not able to be accessed: ", property, e3);
            return null;
        } catch (InstantiationException e4) {
            ijd0.m136593a(simpleName, " implementation not able to be instantiated: ", property, e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public cjd0 m141792a() {
        if (this.f118280d.get() == null) {
            Object objM141791e = m141791e(cjd0.class, System.getProperties());
            AtomicReference<cjd0> atomicReference = this.f118280d;
            if (objM141791e == null) {
                f31.m119248a(atomicReference, null, new C17800b());
            } else {
                f31.m119248a(atomicReference, null, (cjd0) objM141791e);
            }
        }
        return this.f118280d.get();
    }

    /* JADX INFO: renamed from: b */
    public djd0 m141793b() {
        if (this.f118277a.get() == null) {
            Object objM141791e = m141791e(djd0.class, System.getProperties());
            AtomicReference<djd0> atomicReference = this.f118277a;
            if (objM141791e == null) {
                f31.m119248a(atomicReference, null, f118276f);
            } else {
                f31.m119248a(atomicReference, null, (djd0) objM141791e);
            }
        }
        return this.f118277a.get();
    }

    /* JADX INFO: renamed from: d */
    public fjd0 m141794d() {
        if (this.f118278b.get() == null) {
            Object objM141791e = m141791e(fjd0.class, System.getProperties());
            AtomicReference<fjd0> atomicReference = this.f118278b;
            if (objM141791e == null) {
                f31.m119248a(atomicReference, null, gjd0.m126468f());
            } else {
                f31.m119248a(atomicReference, null, (fjd0) objM141791e);
            }
        }
        return this.f118278b.get();
    }

    /* JADX INFO: renamed from: f */
    public kjd0 m141795f() {
        if (this.f118281e.get() == null) {
            Object objM141791e = m141791e(kjd0.class, System.getProperties());
            AtomicReference<kjd0> atomicReference = this.f118281e;
            if (objM141791e == null) {
                f31.m119248a(atomicReference, null, kjd0.m146223h());
            } else {
                f31.m119248a(atomicReference, null, (kjd0) objM141791e);
            }
        }
        return this.f118281e.get();
    }

    /* JADX INFO: renamed from: g */
    public ljd0 m141796g() {
        if (this.f118279c.get() == null) {
            Object objM141791e = m141791e(ljd0.class, System.getProperties());
            AtomicReference<ljd0> atomicReference = this.f118279c;
            if (objM141791e == null) {
                f31.m119248a(atomicReference, null, mjd0.m154788f());
            } else {
                f31.m119248a(atomicReference, null, (ljd0) objM141791e);
            }
        }
        return this.f118279c.get();
    }
}
