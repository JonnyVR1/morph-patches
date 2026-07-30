package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.EnumC14746gl;
import java.util.HashSet;
import java.util.List;
import p149l.ilq0;
import p149l.jkq0;
import p149l.kxq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ah */
/* JADX INFO: loaded from: classes2.dex */
public class C14837ah {

    /* JADX INFO: renamed from: a */
    private static volatile C14837ah f62868a;

    /* JADX INFO: renamed from: a */
    protected SharedPreferences f62869a;

    /* JADX INFO: renamed from: a */
    private HashSet<a> f62870a = new HashSet<>();

    /* JADX INFO: renamed from: b */
    protected SharedPreferences f62871b;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ah$a */
    public static abstract class a implements Runnable {
        private String mDescription;
        private int mId;

        public a(int i, String str) {
            this.mId = i;
            this.mDescription = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.mId == ((a) obj).mId;
        }

        public int hashCode() {
            return this.mId;
        }

        public abstract void onCallback();

        @Override // java.lang.Runnable
        public final void run() {
            onCallback();
        }
    }

    private C14837ah(Context context) {
        this.f62869a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.f62871b = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    /* JADX INFO: renamed from: a */
    public void m86488a(List<Pair<EnumC14746gl, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (kxq0.m147805a(list) || kxq0.m147805a(list2)) {
            ilq0.m137040m("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor editorEdit = this.f62869a.edit();
        editorEdit.clear();
        for (Pair<EnumC14746gl, Integer> pair : list) {
            Object obj = pair.first;
            if (obj != null && pair.second != null) {
                editorEdit.putInt(m86479a((EnumC14746gl) obj), ((Integer) pair.second).intValue());
            }
        }
        for (Pair<Integer, Object> pair2 : list2) {
            Object obj2 = pair2.first;
            if (obj2 != null && pair2.second != null) {
                m86480a(editorEdit, pair2, m86478a(((Integer) obj2).intValue()));
            }
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: b */
    public void m86490b() {
        ilq0.m137053z("OC_Callback : receive new oc data");
        HashSet<a> hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f62870a);
        }
        for (a aVar : hashSet) {
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86485a() {
        this.f62870a.clear();
    }

    /* JADX INFO: renamed from: a */
    public static C14837ah m86477a(Context context) {
        if (f62868a == null) {
            synchronized (C14837ah.class) {
                try {
                    if (f62868a == null) {
                        f62868a = new C14837ah(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f62868a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86486a(a aVar) {
        if (!this.f62870a.contains(aVar)) {
            this.f62870a.add(aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86487a(List<Pair<Integer, Object>> list) {
        if (kxq0.m147805a(list)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f62871b.edit();
        for (Pair<Integer, Object> pair : list) {
            Object obj = pair.first;
            if (obj != null) {
                String strM86478a = m86478a(((Integer) obj).intValue());
                if (pair.second == null) {
                    editorEdit.remove(strM86478a);
                } else {
                    m86480a(editorEdit, pair, strM86478a);
                }
            }
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    private void m86480a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str.equals(m86478a(EnumC14745gk.AppIsInstalledList.m85646a()))) {
                editor.putString(str, jkq0.m141907a(str2));
                return;
            } else {
                editor.putString(str, str2);
                return;
            }
        }
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public int m86481a(int i, int i2) {
        try {
            String strM86478a = m86478a(i);
            if (this.f62871b.contains(strM86478a)) {
                return this.f62871b.getInt(strM86478a, 0);
            }
            return this.f62869a.contains(strM86478a) ? this.f62869a.getInt(strM86478a, 0) : i2;
        } catch (Exception e) {
            ilq0.m137040m(i + " oc int error " + e);
            return i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public long m86483a(int i, long j) {
        try {
            String strM86478a = m86478a(i);
            if (this.f62871b.contains(strM86478a)) {
                return this.f62871b.getLong(strM86478a, 0L);
            }
            return this.f62869a.contains(strM86478a) ? this.f62869a.getLong(strM86478a, 0L) : j;
        } catch (Exception e) {
            ilq0.m137040m(i + " oc long error " + e);
            return j;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m86484a(int i, String str) {
        try {
            String strM86478a = m86478a(i);
            if (this.f62871b.contains(strM86478a)) {
                return this.f62871b.getString(strM86478a, null);
            }
            return this.f62869a.contains(strM86478a) ? this.f62869a.getString(strM86478a, null) : str;
        } catch (Exception e) {
            ilq0.m137040m(i + " oc string error " + e);
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m86489a(int i, boolean z) {
        try {
            String strM86478a = m86478a(i);
            if (this.f62871b.contains(strM86478a)) {
                return this.f62871b.getBoolean(strM86478a, false);
            }
            return this.f62869a.contains(strM86478a) ? this.f62869a.getBoolean(strM86478a, false) : z;
        } catch (Exception e) {
            ilq0.m137040m(i + " oc boolean error " + e);
            return z;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m86482a(EnumC14746gl enumC14746gl, int i) {
        try {
            return this.f62869a.getInt(m86479a(enumC14746gl), i);
        } catch (Exception e) {
            ilq0.m137040m(enumC14746gl + " version error " + e);
            return i;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m86478a(int i) {
        return "oc_" + i;
    }

    /* JADX INFO: renamed from: a */
    private String m86479a(EnumC14746gl enumC14746gl) {
        return "oc_version_" + enumC14746gl.m85648a();
    }
}
