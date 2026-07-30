package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jat0 {

    /* JADX INFO: renamed from: a */
    public final Context f117118a;

    /* JADX INFO: renamed from: b */
    public final Map f117119b = new HashMap();

    public jat0(Context context) {
        this.f117118a = context;
    }

    /* JADX INFO: renamed from: b */
    public final void m140711b() {
        Iterator it = this.f117119b.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).apply();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m140712c(String str, @Nullable Object obj) {
        c9t0 c9t0VarM145322a = kbt0.m145322a(this.f117118a, str);
        if (c9t0VarM145322a == null) {
            return false;
        }
        SharedPreferences.Editor editorM140713d = m140713d(c9t0VarM145322a.f79969a);
        if (obj instanceof Integer) {
            editorM140713d.putInt(c9t0VarM145322a.f79970b, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Long) {
            editorM140713d.putLong(c9t0VarM145322a.f79970b, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            editorM140713d.putFloat(c9t0VarM145322a.f79970b, ((Double) obj).floatValue());
            return true;
        }
        if (obj instanceof Float) {
            editorM140713d.putFloat(c9t0VarM145322a.f79970b, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Boolean) {
            editorM140713d.putBoolean(c9t0VarM145322a.f79970b, ((Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        editorM140713d.putString(c9t0VarM145322a.f79970b, (String) obj);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final SharedPreferences.Editor m140713d(String str) {
        if (!this.f117119b.containsKey(str)) {
            this.f117119b.put(str, this.f117118a.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) this.f117119b.get(str);
    }
}
