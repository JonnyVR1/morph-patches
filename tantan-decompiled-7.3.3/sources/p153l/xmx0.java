package p153l;

import com.google.android.gms.internal.play_billing.AbstractC2395a0;
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
public abstract class xmx0 {
    /* JADX INFO: renamed from: b */
    public static dex0 m212070b(Class cls) {
        String str;
        ClassLoader classLoader = xmx0.class.getClassLoader();
        if (cls.equals(dex0.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(xmx0.class.getPackage())) {
                wg3.m206174a(cls.getName());
                return null;
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (dex0) cls.cast(((xmx0) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).m212071a());
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
            Iterator it = ServiceLoader.load(xmx0.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((dex0) cls.cast(((xmx0) it.next()).m212071a()));
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(AbstractC2395a0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", TrackLoadSettingsAtom.TYPE, "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (dex0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (dex0) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
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
    public abstract dex0 m212071a();
}
