package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.EnumC14894gl;
import java.util.HashSet;
import java.util.List;
import p153l.ouq0;
import p153l.ptq0;
import p153l.q6r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ah */
/* JADX INFO: loaded from: classes2.dex */
public class C14985ah {

    /* JADX INFO: renamed from: a */
    private static volatile C14985ah f63715a;

    /* JADX INFO: renamed from: a */
    protected SharedPreferences f63716a;

    /* JADX INFO: renamed from: a */
    private HashSet<a> f63717a = new HashSet<>();

    /* JADX INFO: renamed from: b */
    protected SharedPreferences f63718b;

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

    private C14985ah(Context context) {
        this.f63716a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.f63718b = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    /* JADX INFO: renamed from: a */
    public void m87659a(List<Pair<EnumC14894gl, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (q6r0.m175606a(list) || q6r0.m175606a(list2)) {
            ouq0.m169393m("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor editorEdit = this.f63716a.edit();
        editorEdit.clear();
        for (Pair<EnumC14894gl, Integer> pair : list) {
            Object obj = pair.first;
            if (obj != null && pair.second != null) {
                editorEdit.putInt(m87650a((EnumC14894gl) obj), ((Integer) pair.second).intValue());
            }
        }
        for (Pair<Integer, Object> pair2 : list2) {
            Object obj2 = pair2.first;
            if (obj2 != null && pair2.second != null) {
                m87651a(editorEdit, pair2, m87649a(((Integer) obj2).intValue()));
            }
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: b */
    public void m87661b() {
        ouq0.m169406z("OC_Callback : receive new oc data");
        HashSet<a> hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f63717a);
        }
        for (a aVar : hashSet) {
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87656a() {
        this.f63717a.clear();
    }

    /* JADX INFO: renamed from: a */
    public static C14985ah m87648a(Context context) {
        if (f63715a == null) {
            synchronized (C14985ah.class) {
                try {
                    if (f63715a == null) {
                        f63715a = new C14985ah(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f63715a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87657a(a aVar) {
        if (!this.f63717a.contains(aVar)) {
            this.f63717a.add(aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87658a(List<Pair<Integer, Object>> list) {
        if (q6r0.m175606a(list)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f63718b.edit();
        for (Pair<Integer, Object> pair : list) {
            Object obj = pair.first;
            if (obj != null) {
                String strM87649a = m87649a(((Integer) obj).intValue());
                if (pair.second == null) {
                    editorEdit.remove(strM87649a);
                } else {
                    m87651a(editorEdit, pair, strM87649a);
                }
            }
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    private void m87651a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
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
            if (str.equals(m87649a(EnumC14893gk.AppIsInstalledList.m86817a()))) {
                editor.putString(str, ptq0.m173773a(str2));
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
    public int m87652a(int i, int i2) {
        try {
            String strM87649a = m87649a(i);
            if (this.f63718b.contains(strM87649a)) {
                return this.f63718b.getInt(strM87649a, 0);
            }
            return this.f63716a.contains(strM87649a) ? this.f63716a.getInt(strM87649a, 0) : i2;
        } catch (Exception e) {
            ouq0.m169393m(i + " oc int error " + e);
            return i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public long m87654a(int i, long j) {
        try {
            String strM87649a = m87649a(i);
            if (this.f63718b.contains(strM87649a)) {
                return this.f63718b.getLong(strM87649a, 0L);
            }
            return this.f63716a.contains(strM87649a) ? this.f63716a.getLong(strM87649a, 0L) : j;
        } catch (Exception e) {
            ouq0.m169393m(i + " oc long error " + e);
            return j;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m87655a(int i, String str) {
        try {
            String strM87649a = m87649a(i);
            if (this.f63718b.contains(strM87649a)) {
                return this.f63718b.getString(strM87649a, null);
            }
            return this.f63716a.contains(strM87649a) ? this.f63716a.getString(strM87649a, null) : str;
        } catch (Exception e) {
            ouq0.m169393m(i + " oc string error " + e);
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m87660a(int i, boolean z) {
        try {
            String strM87649a = m87649a(i);
            if (this.f63718b.contains(strM87649a)) {
                return this.f63718b.getBoolean(strM87649a, false);
            }
            return this.f63716a.contains(strM87649a) ? this.f63716a.getBoolean(strM87649a, false) : z;
        } catch (Exception e) {
            ouq0.m169393m(i + " oc boolean error " + e);
            return z;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m87653a(EnumC14894gl enumC14894gl, int i) {
        try {
            return this.f63716a.getInt(m87650a(enumC14894gl), i);
        } catch (Exception e) {
            ouq0.m169393m(enumC14894gl + " version error " + e);
            return i;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m87649a(int i) {
        return "oc_" + i;
    }

    /* JADX INFO: renamed from: a */
    private String m87650a(EnumC14894gl enumC14894gl) {
        return "oc_version_" + enumC14894gl.m86819a();
    }
}
