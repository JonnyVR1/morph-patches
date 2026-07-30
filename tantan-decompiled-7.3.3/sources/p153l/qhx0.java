package p153l;

import com.google.android.gms.internal.ads.AbstractC2237o5;
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
public abstract class qhx0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f157774a = Logger.getLogger(AbstractC2237o5.class.getName());

    /* JADX INFO: renamed from: b */
    public static final String f157775b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* JADX INFO: renamed from: b */
    public static jhx0 m176622b(Class cls) {
        String str;
        ClassLoader classLoader = qhx0.class.getClassLoader();
        if (cls.equals(jhx0.class)) {
            str = f157775b;
        } else {
            if (!cls.getPackage().equals(qhx0.class.getPackage())) {
                wg3.m206174a(cls.getName());
                return null;
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (jhx0) cls.cast(((qhx0) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).m176623a());
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
            Iterator it = ServiceLoader.load(qhx0.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((jhx0) cls.cast(((qhx0) it.next()).m176623a()));
                } catch (ServiceConfigurationError e5) {
                    f157774a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", TrackLoadSettingsAtom.TYPE, "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (jhx0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (jhx0) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                xpg0.m212648a(e6);
                return null;
            } catch (NoSuchMethodException e7) {
                xpg0.m212648a(e7);
                return null;
            } catch (InvocationTargetException e8) {
                xpg0.m212648a(e8);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract jhx0 m176623a();
}
