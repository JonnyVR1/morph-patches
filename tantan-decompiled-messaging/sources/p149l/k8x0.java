package p149l;

import com.google.android.gms.internal.ads.AbstractC2214o5;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k8x0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f121876a = Logger.getLogger(AbstractC2214o5.class.getName());

    /* JADX INFO: renamed from: b */
    public static final String f121877b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* JADX INFO: renamed from: b */
    public static d8x0 m144980b(Class cls) {
        String str;
        ClassLoader classLoader = k8x0.class.getClassLoader();
        if (cls.equals(d8x0.class)) {
            str = f121877b;
        } else {
            if (!cls.getPackage().equals(k8x0.class.getPackage())) {
                ig3.m135964a(cls.getName());
                return null;
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (d8x0) cls.cast(((k8x0) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).m144981a());
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(k8x0.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((d8x0) cls.cast(((k8x0) it.next()).m144981a()));
                } catch (ServiceConfigurationError e5) {
                    f121876a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", TrackLoadSettingsAtom.TYPE, "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (d8x0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (d8x0) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                phg0.m168968a(e6);
                return null;
            } catch (NoSuchMethodException e7) {
                phg0.m168968a(e7);
                return null;
            } catch (InvocationTargetException e8) {
                phg0.m168968a(e8);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract d8x0 m144981a();
}
