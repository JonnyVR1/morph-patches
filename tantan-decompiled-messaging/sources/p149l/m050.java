package p149l;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class m050 {

    /* JADX INFO: renamed from: a */
    protected static Logger f130711a = Logger.getLogger(m050.class.getName());

    /* JADX INFO: renamed from: b */
    protected static Map<Integer, Map<Integer, Class<? extends vi2>>> f130712b = new HashMap();

    static {
        HashSet<Class<? extends vi2>> hashSet = new HashSet();
        hashSet.add(ihd.class);
        hashSet.add(zkd0.class);
        hashSet.add(vi2.class);
        hashSet.add(gpf.class);
        hashSet.add(l050.class);
        hashSet.add(ns90.class);
        hashSet.add(hd1.class);
        hashSet.add(mpf.class);
        hashSet.add(wie.class);
        hashSet.add(chd.class);
        for (Class<? extends vi2> cls : hashSet) {
            eud eudVar = (eud) cls.getAnnotation(eud.class);
            int[] iArrTags = eudVar.tags();
            int iObjectTypeIndication = eudVar.objectTypeIndication();
            Map<Integer, Class<? extends vi2>> map = f130712b.get(Integer.valueOf(iObjectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i : iArrTags) {
                map.put(Integer.valueOf(i), cls);
            }
            f130712b.put(Integer.valueOf(iObjectTypeIndication), map);
        }
    }

    /* JADX INFO: renamed from: a */
    public static vi2 m152502a(int i, ByteBuffer byteBuffer) throws IOException {
        vi2 zoj0Var;
        int iM216561n = yyp.m216561n(byteBuffer);
        Map<Integer, Class<? extends vi2>> map = f130712b.get(Integer.valueOf(i));
        if (map == null) {
            map = f130712b.get(-1);
        }
        Class<? extends vi2> cls = map.get(Integer.valueOf(iM216561n));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            f130711a.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(iM216561n) + " found: " + cls);
            zoj0Var = new zoj0();
        } else {
            try {
                zoj0Var = cls.newInstance();
            } catch (Exception e) {
                f130711a.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + iM216561n, (Throwable) e);
                aag0.m95543a(e);
                return null;
            }
        }
        zoj0Var.m198494d(iM216561n, byteBuffer);
        return zoj0Var;
    }
}
