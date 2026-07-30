package p153l;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class b950 {

    /* JADX INFO: renamed from: a */
    protected static Logger f75508a = Logger.getLogger(b950.class.getName());

    /* JADX INFO: renamed from: b */
    protected static Map<Integer, Map<Integer, Class<? extends cj2>>> f75509b = new HashMap();

    static {
        HashSet<Class<? extends cj2>> hashSet = new HashSet();
        hashSet.add(oid.class);
        hashSet.add(ctd0.class);
        hashSet.add(cj2.class);
        hashSet.add(nqf.class);
        hashSet.add(a950.class);
        hashSet.add(r0a0.class);
        hashSet.add(od1.class);
        hashSet.add(tqf.class);
        hashSet.add(ake.class);
        hashSet.add(iid.class);
        for (Class<? extends cj2> cls : hashSet) {
            svd svdVar = (svd) cls.getAnnotation(svd.class);
            int[] iArrTags = svdVar.tags();
            int iObjectTypeIndication = svdVar.objectTypeIndication();
            Map<Integer, Class<? extends cj2>> map = f75509b.get(Integer.valueOf(iObjectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i : iArrTags) {
                map.put(Integer.valueOf(i), cls);
            }
            f75509b.put(Integer.valueOf(iObjectTypeIndication), map);
        }
    }

    /* JADX INFO: renamed from: a */
    public static cj2 m103053a(int i, ByteBuffer byteBuffer) throws IOException {
        cj2 cyj0Var;
        int iM213898n = y0q.m213898n(byteBuffer);
        Map<Integer, Class<? extends cj2>> map = f75509b.get(Integer.valueOf(i));
        if (map == null) {
            map = f75509b.get(-1);
        }
        Class<? extends cj2> cls = map.get(Integer.valueOf(iM213898n));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            f75508a.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(iM213898n) + " found: " + cls);
            cyj0Var = new cyj0();
        } else {
            try {
                cyj0Var = cls.newInstance();
            } catch (Exception e) {
                f75508a.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + iM213898n, (Throwable) e);
                iig0.m140070a(e);
                return null;
            }
        }
        cyj0Var.m110050d(iM213898n, byteBuffer);
        return cyj0Var;
    }
}
