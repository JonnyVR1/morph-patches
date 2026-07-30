package p149l;

import com.google.android.gms.internal.play_billing.AbstractC2372a0;
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
public abstract class rdx0 {
    /* JADX INFO: renamed from: b */
    public static x4x0 m179019b(Class cls) {
        String str;
        ClassLoader classLoader = rdx0.class.getClassLoader();
        if (cls.equals(x4x0.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(rdx0.class.getPackage())) {
                ig3.m135964a(cls.getName());
                return null;
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (x4x0) cls.cast(((rdx0) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).m179020a());
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
            Iterator it = ServiceLoader.load(rdx0.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((x4x0) cls.cast(((rdx0) it.next()).m179020a()));
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(AbstractC2372a0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", TrackLoadSettingsAtom.TYPE, "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (x4x0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (x4x0) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
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
    public abstract x4x0 m179020a();
}
