package p153l;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.permission.PermissionRequestItemView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class cs60 extends AbstractC15610a<String> {

    /* JADX INFO: renamed from: e */
    public static final Map<String, Integer> f83419e;

    /* JADX INFO: renamed from: f */
    public static final Map<String, Integer> f83420f;

    /* JADX INFO: renamed from: c */
    public final LayoutInflater f83421c;

    /* JADX INFO: renamed from: d */
    public final List<String> f83422d;

    static {
        HashMap map = new HashMap();
        f83419e = map;
        map.put("android.permission-group.STORAGE", Integer.valueOf(cbc0.f80785n0));
        map.put("android.permission-group.MICROPHONE", Integer.valueOf(cbc0.f80781l0));
        map.put("android.permission-group.LOCATION", Integer.valueOf(cbc0.f80779k0));
        map.put("android.permission-group.CONTACTS", Integer.valueOf(cbc0.f80777j0));
        map.put("android.permission-group.PHONE", Integer.valueOf(cbc0.f80783m0));
        map.put("android.permission-group.CAMERA", Integer.valueOf(cbc0.f80775i0));
        map.put("android.permission-group.PHONE_CALLS", Integer.valueOf(cbc0.f80783m0));
        map.put("android.permission-group.SOCIAL_INFO", Integer.valueOf(cbc0.f80777j0));
        map.put("android.permission.READ_PHONE_STATE", Integer.valueOf(cbc0.f80777j0));
        map.put("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(cbc0.f80779k0));
        map.put("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(cbc0.f80779k0));
        map.put("android.permission.CAMERA", Integer.valueOf(cbc0.f80775i0));
        map.put("android.permission.READ_CONTACTS", Integer.valueOf(cbc0.f80777j0));
        map.put("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(cbc0.f80785n0));
        map.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(cbc0.f80785n0));
        map.put("android.permission.RECORD_AUDIO", Integer.valueOf(cbc0.f80781l0));
        HashMap map2 = new HashMap();
        f83420f = map2;
        map2.put("android.permission-group.STORAGE", Integer.valueOf(R$string.f18146e1));
        map2.put("android.permission-group.MICROPHONE", Integer.valueOf(R$string.f18136c1));
        map2.put("android.permission-group.LOCATION", Integer.valueOf(R$string.f18126a1));
        map2.put("android.permission-group.CONTACTS", Integer.valueOf(R$string.f18121Z0));
        map2.put("android.permission-group.PHONE", Integer.valueOf(R$string.f18141d1));
        map2.put("android.permission-group.CAMERA", Integer.valueOf(R$string.f18117Y0));
        map2.put("android.permission-group.PHONE_CALLS", Integer.valueOf(R$string.f18141d1));
        map2.put("android.permission-group.SOCIAL_INFO", Integer.valueOf(R$string.f18121Z0));
        map2.put("android.permission.READ_PHONE_STATE", Integer.valueOf(R$string.f18141d1));
        map2.put("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(R$string.f18126a1));
        map2.put("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(R$string.f18131b1));
        map2.put("android.permission.CAMERA", Integer.valueOf(R$string.f18117Y0));
        map2.put("android.permission.READ_CONTACTS", Integer.valueOf(R$string.f18121Z0));
        map2.put("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(R$string.f18146e1));
        map2.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(R$string.f18146e1));
        map2.put("android.permission.RECORD_AUDIO", Integer.valueOf(R$string.f18136c1));
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            map2.put("android.permission.BLUETOOTH_CONNECT", Integer.valueOf(R$string.f18025B0));
        }
        if (i >= 33) {
            map.put("android.permission.POST_NOTIFICATIONS", Integer.valueOf(cbc0.f80785n0));
            map2.put("android.permission.POST_NOTIFICATIONS", Integer.valueOf(R$string.f18165i0));
        }
        if (i >= 33) {
            map2.put("android.permission.READ_MEDIA_AUDIO", Integer.valueOf(R$string.f18151f1));
        }
    }

    public cs60(Context context, Set<String> set) {
        this.f83421c = LayoutInflater.from(context);
        ArrayList arrayList = new ArrayList();
        this.f83422d = arrayList;
        arrayList.addAll(set);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m112152t(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (!m112153w(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m112153w(String str) {
        return f83419e.containsKey(str) && f83420f.containsKey(str);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return this.f83421c.inflate(jec0.f120441J, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<String> mo21403p() {
        return this.f83422d;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, String str, int i, int i2) {
        Map<String, Integer> map = f83419e;
        int iIntValue = map.get(str) == null ? cbc0.f80785n0 : map.get(str).intValue();
        CharSequence charSequenceM81063a = PermissionHelper.m81063a(str);
        Map<String, Integer> map2 = f83420f;
        ((PermissionRequestItemView) view).m81118b(iIntValue, charSequenceM81063a, map2.get(str) == null ? R$string.f18146e1 : map2.get(str).intValue());
    }
}
