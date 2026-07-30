package p149l;

import com.google.android.gms.internal.measurement.C2345s0;
import com.google.android.gms.internal.measurement.zzjc;
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
public abstract class msx0<T extends C2345s0> {

    /* JADX INFO: renamed from: a */
    public static String f135540a = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* JADX INFO: renamed from: b */
    public static <T extends C2345s0> T m156172b(Class<T> cls) {
        String str;
        ClassLoader classLoader = msx0.class.getClassLoader();
        if (cls.equals(C2345s0.class)) {
            str = f135540a;
        } else {
            if (!cls.getPackage().equals(msx0.class.getPackage())) {
                ig3.m135964a(cls.getName());
                return null;
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return cls.cast(((msx0) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).m156173a());
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
            Iterator it = ServiceLoader.load(msx0.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((msx0) it.next()).m156173a()));
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(zzjc.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", TrackLoadSettingsAtom.TYPE, "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
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
    public abstract T m156173a();
}
