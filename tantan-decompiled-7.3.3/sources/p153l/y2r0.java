package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.service.C15003az;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class y2r0 {
    /* JADX INFO: renamed from: a */
    private static HashMap<String, ArrayList<C14892gj>> m214096a(Context context, List<C14892gj> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<C14892gj>> map = new HashMap<>();
        for (C14892gj c14892gj : list) {
            m214097b(context, c14892gj);
            ArrayList<C14892gj> arrayList = map.get(c14892gj.m86800c());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(c14892gj.m86800c(), arrayList);
            }
            arrayList.add(c14892gj);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    private static void m214097b(Context context, C14892gj c14892gj) {
        if (c14892gj.f62729a) {
            c14892gj.m86784a("push_sdk_channel");
        }
        if (TextUtils.isEmpty(c14892gj.m86804d())) {
            c14892gj.m86809f(C15003az.m87770a());
        }
        c14892gj.m86794b(System.currentTimeMillis());
        if (TextUtils.isEmpty(c14892gj.m86807e())) {
            c14892gj.m86806e(context.getPackageName());
        }
        if (TextUtils.isEmpty(c14892gj.m86800c())) {
            c14892gj.m86806e(c14892gj.m86807e());
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m214098c(Context context, a3r0 a3r0Var, HashMap<String, ArrayList<C14892gj>> map) {
        for (Map.Entry<String, ArrayList<C14892gj>> entry : map.entrySet()) {
            try {
                ArrayList<C14892gj> value = entry.getValue();
                if (value != null && value.size() != 0) {
                    a3r0Var.mo87928a(value, value.get(0).m86807e(), entry.getKey());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m214099d(Context context, a3r0 a3r0Var, List<C14892gj> list) {
        HashMap<String, ArrayList<C14892gj>> mapM214096a = m214096a(context, list);
        if (mapM214096a != null && mapM214096a.size() != 0) {
            m214098c(context, a3r0Var, mapM214096a);
            return;
        }
        ouq0.m169393m("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
    }
}
