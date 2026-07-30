package p153l;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class mrd0 {
    private static final mrd0 INSTANCE = new mrd0();

    /* JADX INFO: renamed from: f */
    public static final grd0 f138318f = new C18685a();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<grd0> f138319a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<ird0> f138320b = new AtomicReference<>();

    /* JADX INFO: renamed from: c */
    public final AtomicReference<ord0> f138321c = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public final AtomicReference<frd0> f138322d = new AtomicReference<>();

    /* JADX INFO: renamed from: e */
    public final AtomicReference<nrd0> f138323e = new AtomicReference<>();

    /* JADX INFO: renamed from: l.mrd0$a */
    public static class C18685a extends grd0 {
    }

    /* JADX INFO: renamed from: l.mrd0$b */
    public class C18686b extends frd0 {
        public C18686b() {
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static mrd0 m159674c() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Object m159675e(Class<?> cls, Properties properties) {
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
                    krd0.m151025a("Implementing class declaration for ", simpleName, " missing: ", str);
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
            lrd0.m155613a(simpleName, " implementation class not found: ", property, e2);
            return null;
        } catch (IllegalAccessException e3) {
            lrd0.m155613a(simpleName, " implementation not able to be accessed: ", property, e3);
            return null;
        } catch (InstantiationException e4) {
            lrd0.m155613a(simpleName, " implementation not able to be instantiated: ", property, e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public frd0 m159676a() {
        if (this.f138322d.get() == null) {
            Object objM159675e = m159675e(frd0.class, System.getProperties());
            AtomicReference<frd0> atomicReference = this.f138322d;
            if (objM159675e == null) {
                m31.m156916a(atomicReference, null, new C18686b());
            } else {
                m31.m156916a(atomicReference, null, (frd0) objM159675e);
            }
        }
        return this.f138322d.get();
    }

    /* JADX INFO: renamed from: b */
    public grd0 m159677b() {
        if (this.f138319a.get() == null) {
            Object objM159675e = m159675e(grd0.class, System.getProperties());
            AtomicReference<grd0> atomicReference = this.f138319a;
            if (objM159675e == null) {
                m31.m156916a(atomicReference, null, f138318f);
            } else {
                m31.m156916a(atomicReference, null, (grd0) objM159675e);
            }
        }
        return this.f138319a.get();
    }

    /* JADX INFO: renamed from: d */
    public ird0 m159678d() {
        if (this.f138320b.get() == null) {
            Object objM159675e = m159675e(ird0.class, System.getProperties());
            AtomicReference<ird0> atomicReference = this.f138320b;
            if (objM159675e == null) {
                m31.m156916a(atomicReference, null, jrd0.m146710f());
            } else {
                m31.m156916a(atomicReference, null, (ird0) objM159675e);
            }
        }
        return this.f138320b.get();
    }

    /* JADX INFO: renamed from: f */
    public nrd0 m159679f() {
        if (this.f138323e.get() == null) {
            Object objM159675e = m159675e(nrd0.class, System.getProperties());
            AtomicReference<nrd0> atomicReference = this.f138323e;
            if (objM159675e == null) {
                m31.m156916a(atomicReference, null, nrd0.m164476h());
            } else {
                m31.m156916a(atomicReference, null, (nrd0) objM159675e);
            }
        }
        return this.f138323e.get();
    }

    /* JADX INFO: renamed from: g */
    public ord0 m159680g() {
        if (this.f138321c.get() == null) {
            Object objM159675e = m159675e(ord0.class, System.getProperties());
            AtomicReference<ord0> atomicReference = this.f138321c;
            if (objM159675e == null) {
                m31.m156916a(atomicReference, null, prd0.m173454f());
            } else {
                m31.m156916a(atomicReference, null, (ord0) objM159675e);
            }
        }
        return this.f138321c.get();
    }
}
