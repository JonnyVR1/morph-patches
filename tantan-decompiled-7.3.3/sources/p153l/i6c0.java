package p153l;

import android.graphics.Color;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes12.dex */
public class i6c0 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<bkj0<Integer, Integer, Integer>> f113156a = jyb.m147507f0(bkj0.m104818a(Integer.valueOf(dbc0.f86737Xo), Integer.valueOf(dbc0.f86641Uo), Integer.valueOf(Color.parseColor("#ffda82"))), bkj0.m104818a(Integer.valueOf(dbc0.f86769Yo), Integer.valueOf(dbc0.f86673Vo), Integer.valueOf(Color.parseColor("#ffc8a6"))), bkj0.m104818a(Integer.valueOf(dbc0.f86801Zo), Integer.valueOf(dbc0.f86705Wo), Integer.valueOf(Color.parseColor("#ffb1ac"))));

    /* JADX INFO: renamed from: b */
    public static final ArrayList<bkj0<Integer, Integer, Integer>> f113157b = jyb.m147507f0(bkj0.m104818a(Integer.valueOf(dbc0.f86609To), Integer.valueOf(dbc0.f86834ap), Integer.valueOf(Color.parseColor("#C2D4FF"))));

    /* JADX INFO: renamed from: c */
    public static final HashMap<Long, bkj0<Integer, Integer, Integer>> f113158c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public static int f113159d = -1;

    /* JADX INFO: renamed from: a */
    public static bkj0<Integer, Integer, Integer> m138802a(long j) {
        HashMap<Long, bkj0<Integer, Integer, Integer>> map = f113158c;
        bkj0<Integer, Integer, Integer> bkj0Var = map.get(Long.valueOf(j));
        if (NullChecker.m82486a(bkj0Var)) {
            return bkj0Var;
        }
        ArrayList<bkj0<Integer, Integer, Integer>> arrayList = f113156a;
        int size = arrayList.size();
        int iNextInt = new Random().nextInt(size);
        int i = f113159d;
        if (i >= 0 && i == iNextInt) {
            iNextInt = (iNextInt + 1) % size;
        }
        f113159d = iNextInt;
        bkj0<Integer, Integer, Integer> bkj0Var2 = arrayList.get(iNextInt);
        map.put(Long.valueOf(j), bkj0Var2);
        return bkj0Var2;
    }

    /* JADX INFO: renamed from: b */
    public static bkj0<Integer, Integer, Integer> m138803b(long j) {
        return f113157b.get(0);
    }
}
