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
import p149l.pkq0;
import p149l.upk0;

/* JADX INFO: renamed from: com.vivo.push.util.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14633b {

    /* JADX INFO: renamed from: a */
    protected Context f61099a;

    /* JADX INFO: renamed from: b */
    private String f61100b;

    /* JADX INFO: renamed from: c */
    private volatile SharedPreferences f61101c;

    /* JADX INFO: renamed from: d */
    private HashMap<String, String> f61102d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    private HashMap<String, Long> f61103e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    private HashMap<String, Integer> f61104f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    private HashMap<String, Boolean> f61105g = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private List<String> m84960c(String str) {
        String[] strArrSplit;
        if (this.f61099a == null) {
            C14647p.m85019c("BaseSharePreference", " parsLocalIv error mContext is null ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Context context = this.f61099a;
            Object objM85055a = C14657z.m85055a(context, context.getPackageName(), str);
            if (objM85055a == null) {
                return null;
            }
            String str2 = new String(Base64.decode(objM85055a.toString(), 2));
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
            C14647p.m85019c("BaseSharePreference", " parsLocalIv error e =" + e.getMessage());
            e.printStackTrace();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84963a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            upk0.m194883a("sharedFileName can't be null");
            return;
        }
        this.f61100b = str;
        this.f61101c = context.getSharedPreferences(str, 0);
        this.f61099a = context;
        List<String> listM84960c = m84960c("local_iv");
        if (listM84960c == null || listM84960c.size() < 4) {
            C14647p.m85008a("BaseSharePreference", " initSecureCode error list is null ");
            return;
        }
        HashMap map = new HashMap();
        map.put("com.vivo.push.secure_sub_iv", listM84960c.get(1));
        map.put("com.vivo.push.secure_sub_key", listM84960c.get(2));
        map.put("com.vivo.push.secure_cache_iv", listM84960c.get(3));
        map.put("com.vivo.push.secure_cache_key", listM84960c.get(0));
        m84958a(map);
    }

    /* JADX INFO: renamed from: b */
    public final long m84967b(String str, long j) {
        Long lValueOf = this.f61103e.get(str);
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        m84959b();
        if (this.f61101c != null) {
            lValueOf = Long.valueOf(this.f61101c.getLong(str, j));
            if (!lValueOf.equals(Long.valueOf(j))) {
                this.f61103e.put(str, lValueOf);
            }
        }
        return lValueOf.longValue();
    }

    /* JADX INFO: renamed from: b */
    public final String m84968b(String str, String str2) {
        String string = this.f61102d.get(str);
        if (string != null) {
            return string;
        }
        m84959b();
        if (this.f61101c != null) {
            string = this.f61101c.getString(str, str2);
            if (!TextUtils.isEmpty(string) && !string.equals(str2)) {
                this.f61102d.put(str, string);
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final void m84969b(String str) {
        this.f61103e.remove(str);
        this.f61104f.remove(str);
        this.f61105g.remove(str);
        this.f61102d.remove(str);
        m84959b();
        if (this.f61101c != null) {
            SharedPreferences.Editor editorEdit = this.f61101c.edit();
            if (this.f61101c.contains(str)) {
                editorEdit.remove(str);
                m84957a(editorEdit);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m84959b() {
        if (this.f61101c == null) {
            Context context = this.f61099a;
            if (context != null) {
                this.f61101c = context.getSharedPreferences(this.f61100b, 0);
            } else {
                pkq0.m170054a("SharedPreferences is not init", new Throwable());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84966a(String str, String str2) {
        this.f61102d.put(str, str2);
        m84959b();
        if (this.f61101c != null) {
            SharedPreferences.Editor editorEdit = this.f61101c.edit();
            editorEdit.putString(str, str2);
            m84957a(editorEdit);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84958a(Map<String, String> map) {
        if (map.size() > 0) {
            m84959b();
            if (this.f61101c != null) {
                SharedPreferences.Editor editorEdit = this.f61101c.edit();
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    this.f61102d.put(str, str2);
                    editorEdit.putString(str, str2);
                }
                m84957a(editorEdit);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84964a(String str, int i) {
        this.f61104f.put(str, Integer.valueOf(i));
        m84959b();
        if (this.f61101c != null) {
            SharedPreferences.Editor editorEdit = this.f61101c.edit();
            editorEdit.putInt(str, i);
            m84957a(editorEdit);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84965a(String str, long j) {
        this.f61103e.put(str, Long.valueOf(j));
        m84959b();
        if (this.f61101c != null) {
            SharedPreferences.Editor editorEdit = this.f61101c.edit();
            editorEdit.putLong(str, j);
            m84957a(editorEdit);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m84961a(String str) {
        Integer numValueOf = this.f61104f.get(str);
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        m84959b();
        if (this.f61101c != null) {
            numValueOf = Integer.valueOf(this.f61101c.getInt(str, 0));
            if (!numValueOf.equals(0)) {
                this.f61104f.put(str, numValueOf);
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: a */
    public static void m84957a(SharedPreferences.Editor editor) {
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
    public final void m84962a() {
        this.f61103e.clear();
        this.f61104f.clear();
        this.f61105g.clear();
        this.f61102d.clear();
        m84959b();
        if (this.f61101c != null) {
            SharedPreferences.Editor editorEdit = this.f61101c.edit();
            editorEdit.clear();
            m84957a(editorEdit);
        }
    }
}
