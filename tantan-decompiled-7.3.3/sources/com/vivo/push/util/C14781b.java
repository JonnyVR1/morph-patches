package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.azk0;
import p153l.vtq0;

/* JADX INFO: renamed from: com.vivo.push.util.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14781b {

    /* JADX INFO: renamed from: a */
    protected Context f61946a;

    /* JADX INFO: renamed from: b */
    private String f61947b;

    /* JADX INFO: renamed from: c */
    private volatile SharedPreferences f61948c;

    /* JADX INFO: renamed from: d */
    private HashMap<String, String> f61949d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    private HashMap<String, Long> f61950e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    private HashMap<String, Integer> f61951f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    private HashMap<String, Boolean> f61952g = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private List<String> m86131c(String str) {
        String[] strArrSplit;
        if (this.f61946a == null) {
            C14795p.m86190c("BaseSharePreference", " parsLocalIv error mContext is null ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Context context = this.f61946a;
            Object objM86226a = C14805z.m86226a(context, context.getPackageName(), str);
            if (objM86226a == null) {
                return null;
            }
            String str2 = new String(Base64.decode(objM86226a.toString(), 2));
            if (!TextUtils.isEmpty(str2) && (strArrSplit = str2.split(",#@")) != null && strArrSplit.length >= 4) {
                for (String str3 : strArrSplit) {
                    arrayList.add(str3.replace(",#@", ""));
                }
                if (arrayList.size() < 4) {
                    return null;
                }
                return arrayList;
            }
            return null;
        } catch (Exception e) {
            C14795p.m86190c("BaseSharePreference", " parsLocalIv error e =" + e.getMessage());
            e.printStackTrace();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m86134a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            azk0.m101074a("sharedFileName can't be null");
            return;
        }
        this.f61947b = str;
        this.f61948c = context.getSharedPreferences(str, 0);
        this.f61946a = context;
        List<String> listM86131c = m86131c("local_iv");
        if (listM86131c == null || listM86131c.size() < 4) {
            C14795p.m86179a("BaseSharePreference", " initSecureCode error list is null ");
            return;
        }
        HashMap map = new HashMap();
        map.put("com.vivo.push.secure_sub_iv", listM86131c.get(1));
        map.put("com.vivo.push.secure_sub_key", listM86131c.get(2));
        map.put("com.vivo.push.secure_cache_iv", listM86131c.get(3));
        map.put("com.vivo.push.secure_cache_key", listM86131c.get(0));
        m86129a(map);
    }

    /* JADX INFO: renamed from: b */
    public final long m86138b(String str, long j) {
        Long lValueOf = this.f61950e.get(str);
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        m86130b();
        if (this.f61948c != null) {
            lValueOf = Long.valueOf(this.f61948c.getLong(str, j));
            if (!lValueOf.equals(Long.valueOf(j))) {
                this.f61950e.put(str, lValueOf);
            }
        }
        return lValueOf.longValue();
    }

    /* JADX INFO: renamed from: b */
    public final String m86139b(String str, String str2) {
        String string = this.f61949d.get(str);
        if (string != null) {
            return string;
        }
        m86130b();
        if (this.f61948c != null) {
            string = this.f61948c.getString(str, str2);
            if (!TextUtils.isEmpty(string) && !string.equals(str2)) {
                this.f61949d.put(str, string);
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final void m86140b(String str) {
        this.f61950e.remove(str);
        this.f61951f.remove(str);
        this.f61952g.remove(str);
        this.f61949d.remove(str);
        m86130b();
        if (this.f61948c != null) {
            SharedPreferences.Editor editorEdit = this.f61948c.edit();
            if (this.f61948c.contains(str)) {
                editorEdit.remove(str);
                m86128a(editorEdit);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m86130b() {
        if (this.f61948c == null) {
            Context context = this.f61946a;
            if (context != null) {
                this.f61948c = context.getSharedPreferences(this.f61947b, 0);
            } else {
                vtq0.m202761a("SharedPreferences is not init", new Throwable());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m86137a(String str, String str2) {
        this.f61949d.put(str, str2);
        m86130b();
        if (this.f61948c != null) {
            SharedPreferences.Editor editorEdit = this.f61948c.edit();
            editorEdit.putString(str, str2);
            m86128a(editorEdit);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m86129a(Map<String, String> map) {
        if (map.size() > 0) {
            m86130b();
            if (this.f61948c != null) {
                SharedPreferences.Editor editorEdit = this.f61948c.edit();
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    this.f61949d.put(str, str2);
                    editorEdit.putString(str, str2);
                }
                m86128a(editorEdit);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m86135a(String str, int i) {
        this.f61951f.put(str, Integer.valueOf(i));
        m86130b();
        if (this.f61948c != null) {
            SharedPreferences.Editor editorEdit = this.f61948c.edit();
            editorEdit.putInt(str, i);
            m86128a(editorEdit);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m86136a(String str, long j) {
        this.f61950e.put(str, Long.valueOf(j));
        m86130b();
        if (this.f61948c != null) {
            SharedPreferences.Editor editorEdit = this.f61948c.edit();
            editorEdit.putLong(str, j);
            m86128a(editorEdit);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m86132a(String str) {
        Integer numValueOf = this.f61951f.get(str);
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        m86130b();
        if (this.f61948c != null) {
            numValueOf = Integer.valueOf(this.f61948c.getInt(str, 0));
            if (!numValueOf.equals(0)) {
                this.f61951f.put(str, numValueOf);
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: a */
    public static void m86128a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m86133a() {
        this.f61950e.clear();
        this.f61951f.clear();
        this.f61952g.clear();
        this.f61949d.clear();
        m86130b();
        if (this.f61948c != null) {
            SharedPreferences.Editor editorEdit = this.f61948c.edit();
            editorEdit.clear();
            m86128a(editorEdit);
        }
    }
}
