package p149l;

import android.graphics.Color;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
public class eyb0 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<xaj0<Integer, Integer, Integer>> f93736a = vwb.m200324f0(xaj0.m207578a(Integer.valueOf(x2c0.f190275jo), Integer.valueOf(x2c0.f190181go), Integer.valueOf(Color.parseColor("#ffda82"))), xaj0.m207578a(Integer.valueOf(x2c0.f190307ko), Integer.valueOf(x2c0.f190213ho), Integer.valueOf(Color.parseColor("#ffc8a6"))), xaj0.m207578a(Integer.valueOf(x2c0.f190339lo), Integer.valueOf(x2c0.f190244io), Integer.valueOf(Color.parseColor("#ffb1ac"))));

    /* JADX INFO: renamed from: b */
    public static final ArrayList<xaj0<Integer, Integer, Integer>> f93737b = vwb.m200324f0(xaj0.m207578a(Integer.valueOf(x2c0.f190149fo), Integer.valueOf(x2c0.f190371mo), Integer.valueOf(Color.parseColor("#C2D4FF"))));

    /* JADX INFO: renamed from: c */
    public static final HashMap<Long, xaj0<Integer, Integer, Integer>> f93738c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public static int f93739d = -1;

    /* JADX INFO: renamed from: a */
    public static xaj0<Integer, Integer, Integer> m118750a(long j) {
        HashMap<Long, xaj0<Integer, Integer, Integer>> map = f93738c;
        xaj0<Integer, Integer, Integer> xaj0Var = map.get(Long.valueOf(j));
        if (NullChecker.m81303a(xaj0Var)) {
            return xaj0Var;
        }
        ArrayList<xaj0<Integer, Integer, Integer>> arrayList = f93736a;
        int size = arrayList.size();
        int iNextInt = new Random().nextInt(size);
        int i = f93739d;
        if (i >= 0 && i == iNextInt) {
            iNextInt = (iNextInt + 1) % size;
        }
        f93739d = iNextInt;
        xaj0<Integer, Integer, Integer> xaj0Var2 = arrayList.get(iNextInt);
        map.put(Long.valueOf(j), xaj0Var2);
        return xaj0Var2;
    }

    /* JADX INFO: renamed from: b */
    public static xaj0<Integer, Integer, Integer> m118751b(long j) {
        return f93737b.get(0);
    }
}
