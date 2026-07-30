package p009l;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.p004ui.permission.PermissionRequestItemView;
import com.p1.mobile.putong.common.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.a;
import l.e6c0;
import l.w2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wj60 extends a<String> {

    /* JADX INFO: renamed from: e */
    public static final Map<String, Integer> f22156e;

    /* JADX INFO: renamed from: f */
    public static final Map<String, Integer> f22157f;

    /* JADX INFO: renamed from: c */
    public final LayoutInflater f22158c;

    /* JADX INFO: renamed from: d */
    public final List<String> f22159d;

    static {
        HashMap map = new HashMap();
        f22156e = map;
        map.put("android.permission-group.STORAGE", Integer.valueOf(w2c0.n0));
        map.put("android.permission-group.MICROPHONE", Integer.valueOf(w2c0.l0));
        map.put("android.permission-group.LOCATION", Integer.valueOf(w2c0.k0));
        map.put("android.permission-group.CONTACTS", Integer.valueOf(w2c0.j0));
        map.put("android.permission-group.PHONE", Integer.valueOf(w2c0.m0));
        map.put("android.permission-group.CAMERA", Integer.valueOf(w2c0.i0));
        map.put("android.permission-group.PHONE_CALLS", Integer.valueOf(w2c0.m0));
        map.put("android.permission-group.SOCIAL_INFO", Integer.valueOf(w2c0.j0));
        map.put("android.permission.READ_PHONE_STATE", Integer.valueOf(w2c0.j0));
        map.put("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(w2c0.k0));
        map.put("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(w2c0.k0));
        map.put("android.permission.CAMERA", Integer.valueOf(w2c0.i0));
        map.put("android.permission.READ_CONTACTS", Integer.valueOf(w2c0.j0));
        map.put("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(w2c0.n0));
        map.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(w2c0.n0));
        map.put("android.permission.RECORD_AUDIO", Integer.valueOf(w2c0.l0));
        HashMap map2 = new HashMap();
        f22157f = map2;
        map2.put("android.permission-group.STORAGE", Integer.valueOf(R.string.e1));
        map2.put("android.permission-group.MICROPHONE", Integer.valueOf(R.string.c1));
        map2.put("android.permission-group.LOCATION", Integer.valueOf(R.string.a1));
        map2.put("android.permission-group.CONTACTS", Integer.valueOf(R.string.Z0));
        map2.put("android.permission-group.PHONE", Integer.valueOf(R.string.d1));
        map2.put("android.permission-group.CAMERA", Integer.valueOf(R.string.Y0));
        map2.put("android.permission-group.PHONE_CALLS", Integer.valueOf(R.string.d1));
        map2.put("android.permission-group.SOCIAL_INFO", Integer.valueOf(R.string.Z0));
        map2.put("android.permission.READ_PHONE_STATE", Integer.valueOf(R.string.d1));
        map2.put("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(R.string.a1));
        map2.put("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(R.string.b1));
        map2.put("android.permission.CAMERA", Integer.valueOf(R.string.Y0));
        map2.put("android.permission.READ_CONTACTS", Integer.valueOf(R.string.Z0));
        map2.put("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(R.string.e1));
        map2.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(R.string.e1));
        map2.put("android.permission.RECORD_AUDIO", Integer.valueOf(R.string.c1));
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            map2.put("android.permission.BLUETOOTH_CONNECT", Integer.valueOf(R.string.B0));
        }
        if (i >= 33) {
            map.put("android.permission.POST_NOTIFICATIONS", Integer.valueOf(w2c0.n0));
            map2.put("android.permission.POST_NOTIFICATIONS", Integer.valueOf(R.string.i0));
        }
        if (i >= 33) {
            map2.put("android.permission.READ_MEDIA_AUDIO", Integer.valueOf(R.string.f1));
        }
    }

    public wj60(Context context, Set<String> set) {
        this.f22158c = LayoutInflater.from(context);
        ArrayList arrayList = new ArrayList();
        this.f22159d = arrayList;
        arrayList.addAll(set);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m24262t(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (!m24263w(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m24263w(String str) {
        return f22156e.containsKey(str) && f22157f.containsKey(str);
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public boolean isEnabled(int i) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public View m24265m(ViewGroup viewGroup, int i) {
        return this.f22158c.inflate(e6c0.J, viewGroup, false);
    }

    /* JADX INFO: renamed from: p */
    public List<String> m24266p() {
        return this.f22159d;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m24264j(View view, String str, int i, int i2) {
        Map<String, Integer> map = f22156e;
        int iIntValue = map.get(str) == null ? w2c0.n0 : map.get(str).intValue();
        CharSequence charSequenceM10209a = PermissionHelper.m10209a(str);
        Map<String, Integer> map2 = f22157f;
        ((PermissionRequestItemView) view).m10264b(iIntValue, charSequenceM10209a, map2.get(str) == null ? R.string.e1 : map2.get(str).intValue());
    }
}
