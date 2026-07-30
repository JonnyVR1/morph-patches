package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class pjt0 {

    /* JADX INFO: renamed from: a */
    public final Context f152741a;

    /* JADX INFO: renamed from: b */
    public final Map f152742b = new HashMap();

    public pjt0(Context context) {
        this.f152741a = context;
    }

    /* JADX INFO: renamed from: b */
    public final void m172524b() {
        Iterator it = this.f152742b.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).apply();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m172525c(String str, @Nullable Object obj) {
        iit0 iit0VarM176969a = qkt0.m176969a(this.f152741a, str);
        if (iit0VarM176969a == null) {
            return false;
        }
        SharedPreferences.Editor editorM172526d = m172526d(iit0VarM176969a.f115136a);
        if (obj instanceof Integer) {
            editorM172526d.putInt(iit0VarM176969a.f115137b, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Long) {
            editorM172526d.putLong(iit0VarM176969a.f115137b, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            editorM172526d.putFloat(iit0VarM176969a.f115137b, ((Double) obj).floatValue());
            return true;
        }
        if (obj instanceof Float) {
            editorM172526d.putFloat(iit0VarM176969a.f115137b, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Boolean) {
            editorM172526d.putBoolean(iit0VarM176969a.f115137b, ((Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        editorM172526d.putString(iit0VarM176969a.f115137b, (String) obj);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final SharedPreferences.Editor m172526d(String str) {
        if (!this.f152742b.containsKey(str)) {
            this.f152742b.put(str, this.f152741a.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) this.f152742b.get(str);
    }
}
