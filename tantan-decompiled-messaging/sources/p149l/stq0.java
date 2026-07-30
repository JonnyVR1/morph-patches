package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.service.C14855az;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class stq0 {
    /* JADX INFO: renamed from: a */
    private static HashMap<String, ArrayList<C14744gj>> m185964a(Context context, List<C14744gj> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<C14744gj>> map = new HashMap<>();
        for (C14744gj c14744gj : list) {
            m185965b(context, c14744gj);
            ArrayList<C14744gj> arrayList = map.get(c14744gj.m85629c());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(c14744gj.m85629c(), arrayList);
            }
            arrayList.add(c14744gj);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    private static void m185965b(Context context, C14744gj c14744gj) {
        if (c14744gj.f61882a) {
            c14744gj.m85613a("push_sdk_channel");
        }
        if (TextUtils.isEmpty(c14744gj.m85633d())) {
            c14744gj.m85638f(C14855az.m86599a());
        }
        c14744gj.m85623b(System.currentTimeMillis());
        if (TextUtils.isEmpty(c14744gj.m85636e())) {
            c14744gj.m85635e(context.getPackageName());
        }
        if (TextUtils.isEmpty(c14744gj.m85629c())) {
            c14744gj.m85635e(c14744gj.m85636e());
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m185966c(Context context, utq0 utq0Var, HashMap<String, ArrayList<C14744gj>> map) {
        for (Map.Entry<String, ArrayList<C14744gj>> entry : map.entrySet()) {
            try {
                ArrayList<C14744gj> value = entry.getValue();
                if (value != null && value.size() != 0) {
                    utq0Var.mo86757a(value, value.get(0).m85636e(), entry.getKey());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m185967d(Context context, utq0 utq0Var, List<C14744gj> list) {
        HashMap<String, ArrayList<C14744gj>> mapM185964a = m185964a(context, list);
        if (mapM185964a != null && mapM185964a.size() != 0) {
            m185966c(context, utq0Var, mapM185964a);
            return;
        }
        ilq0.m137040m("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
    }
}
