package p149l;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.permission.PermissionRequestItemView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class wj60 extends AbstractC15503a<String> {

    /* JADX INFO: renamed from: e */
    public static final Map<String, Integer> f186612e;

    /* JADX INFO: renamed from: f */
    public static final Map<String, Integer> f186613f;

    /* JADX INFO: renamed from: c */
    public final LayoutInflater f186614c;

    /* JADX INFO: renamed from: d */
    public final List<String> f186615d;

    static {
        HashMap map = new HashMap();
        f186612e = map;
        map.put("android.permission-group.STORAGE", Integer.valueOf(w2c0.f184189n0));
        map.put("android.permission-group.MICROPHONE", Integer.valueOf(w2c0.f184185l0));
        map.put("android.permission-group.LOCATION", Integer.valueOf(w2c0.f184183k0));
        map.put("android.permission-group.CONTACTS", Integer.valueOf(w2c0.f184181j0));
        map.put("android.permission-group.PHONE", Integer.valueOf(w2c0.f184187m0));
        map.put("android.permission-group.CAMERA", Integer.valueOf(w2c0.f184179i0));
        map.put("android.permission-group.PHONE_CALLS", Integer.valueOf(w2c0.f184187m0));
        map.put("android.permission-group.SOCIAL_INFO", Integer.valueOf(w2c0.f184181j0));
        map.put("android.permission.READ_PHONE_STATE", Integer.valueOf(w2c0.f184181j0));
        map.put("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(w2c0.f184183k0));
        map.put("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(w2c0.f184183k0));
        map.put("android.permission.CAMERA", Integer.valueOf(w2c0.f184179i0));
        map.put("android.permission.READ_CONTACTS", Integer.valueOf(w2c0.f184181j0));
        map.put("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(w2c0.f184189n0));
        map.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(w2c0.f184189n0));
        map.put("android.permission.RECORD_AUDIO", Integer.valueOf(w2c0.f184185l0));
        HashMap map2 = new HashMap();
        f186613f = map2;
        map2.put("android.permission-group.STORAGE", Integer.valueOf(R$string.f17427e1));
        map2.put("android.permission-group.MICROPHONE", Integer.valueOf(R$string.f17417c1));
        map2.put("android.permission-group.LOCATION", Integer.valueOf(R$string.f17407a1));
        map2.put("android.permission-group.CONTACTS", Integer.valueOf(R$string.f17402Z0));
        map2.put("android.permission-group.PHONE", Integer.valueOf(R$string.f17422d1));
        map2.put("android.permission-group.CAMERA", Integer.valueOf(R$string.f17398Y0));
        map2.put("android.permission-group.PHONE_CALLS", Integer.valueOf(R$string.f17422d1));
        map2.put("android.permission-group.SOCIAL_INFO", Integer.valueOf(R$string.f17402Z0));
        map2.put("android.permission.READ_PHONE_STATE", Integer.valueOf(R$string.f17422d1));
        map2.put("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(R$string.f17407a1));
        map2.put("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(R$string.f17412b1));
        map2.put("android.permission.CAMERA", Integer.valueOf(R$string.f17398Y0));
        map2.put("android.permission.READ_CONTACTS", Integer.valueOf(R$string.f17402Z0));
        map2.put("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(R$string.f17427e1));
        map2.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(R$string.f17427e1));
        map2.put("android.permission.RECORD_AUDIO", Integer.valueOf(R$string.f17417c1));
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            map2.put("android.permission.BLUETOOTH_CONNECT", Integer.valueOf(R$string.f17306B0));
        }
        if (i >= 33) {
            map.put("android.permission.POST_NOTIFICATIONS", Integer.valueOf(w2c0.f184189n0));
            map2.put("android.permission.POST_NOTIFICATIONS", Integer.valueOf(R$string.f17446i0));
        }
        if (i >= 33) {
            map2.put("android.permission.READ_MEDIA_AUDIO", Integer.valueOf(R$string.f17432f1));
        }
    }

    public wj60(Context context, Set<String> set) {
        this.f186614c = LayoutInflater.from(context);
        ArrayList arrayList = new ArrayList();
        this.f186615d = arrayList;
        arrayList.addAll(set);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m203409t(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (!m203410w(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m203410w(String str) {
        return f186612e.containsKey(str) && f186613f.containsKey(str);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return this.f186614c.inflate(e6c0.f89528J, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<String> mo20404p() {
        return this.f186615d;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, String str, int i, int i2) {
        Map<String, Integer> map = f186612e;
        int iIntValue = map.get(str) == null ? w2c0.f184189n0 : map.get(str).intValue();
        CharSequence charSequenceM79880a = PermissionHelper.m79880a(str);
        Map<String, Integer> map2 = f186613f;
        ((PermissionRequestItemView) view).m79935b(iIntValue, charSequenceM79880a, map2.get(str) == null ? R$string.f17427e1 : map2.get(str).intValue());
    }
}
