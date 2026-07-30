package p006l;

import android.graphics.Color;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import l.vwb;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class eyb0 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<xaj0<Integer, Integer, Integer>> f11503a = vwb.f0(new xaj0[]{xaj0.a(Integer.valueOf(x2c0.f26811jo), Integer.valueOf(x2c0.f26717go), Integer.valueOf(Color.parseColor("#ffda82"))), xaj0.a(Integer.valueOf(x2c0.f26843ko), Integer.valueOf(x2c0.f26749ho), Integer.valueOf(Color.parseColor("#ffc8a6"))), xaj0.a(Integer.valueOf(x2c0.f26875lo), Integer.valueOf(x2c0.f26780io), Integer.valueOf(Color.parseColor("#ffb1ac")))});

    /* JADX INFO: renamed from: b */
    public static final ArrayList<xaj0<Integer, Integer, Integer>> f11504b = vwb.f0(new xaj0[]{xaj0.a(Integer.valueOf(x2c0.f26685fo), Integer.valueOf(x2c0.f26907mo), Integer.valueOf(Color.parseColor("#C2D4FF")))});

    /* JADX INFO: renamed from: c */
    public static final HashMap<Long, xaj0<Integer, Integer, Integer>> f11505c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public static int f11506d = -1;

    /* JADX INFO: renamed from: a */
    public static xaj0<Integer, Integer, Integer> m14925a(long j) {
        HashMap<Long, xaj0<Integer, Integer, Integer>> map = f11505c;
        xaj0<Integer, Integer, Integer> xaj0Var = map.get(Long.valueOf(j));
        if (NullChecker.a(xaj0Var)) {
            return xaj0Var;
        }
        ArrayList<xaj0<Integer, Integer, Integer>> arrayList = f11503a;
        int size = arrayList.size();
        int iNextInt = new Random().nextInt(size);
        int i = f11506d;
        if (i >= 0 && i == iNextInt) {
            iNextInt = (iNextInt + 1) % size;
        }
        f11506d = iNextInt;
        xaj0<Integer, Integer, Integer> xaj0Var2 = arrayList.get(iNextInt);
        map.put(Long.valueOf(j), xaj0Var2);
        return xaj0Var2;
    }

    /* JADX INFO: renamed from: b */
    public static xaj0<Integer, Integer, Integer> m14926b(long j) {
        return f11504b.get(0);
    }
}
