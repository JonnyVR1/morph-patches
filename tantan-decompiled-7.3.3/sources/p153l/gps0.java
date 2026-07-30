package p153l;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class gps0 implements bqs0 {
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        try {
            JSONObject jSONObject = new JSONObject((String) map.get("args"));
            Iterator<String> itKeys = jSONObject.keys();
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(wit0Var.getContext()).edit();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj2 = jSONObject.get(next);
                if (obj2 instanceof Integer) {
                    editorEdit.putInt(next, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    editorEdit.putLong(next, ((Long) obj2).longValue());
                } else if (obj2 instanceof Double) {
                    editorEdit.putFloat(next, ((Double) obj2).floatValue());
                } else if (obj2 instanceof Float) {
                    editorEdit.putFloat(next, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Boolean) {
                    editorEdit.putBoolean(next, ((Boolean) obj2).booleanValue());
                } else if (obj2 instanceof String) {
                    editorEdit.putString(next, (String) obj2);
                }
            }
            editorEdit.apply();
        } catch (JSONException e) {
            bxy0.m106933q().m120275w(e, "GMSG write local storage KV pairs handler");
        }
    }
}
