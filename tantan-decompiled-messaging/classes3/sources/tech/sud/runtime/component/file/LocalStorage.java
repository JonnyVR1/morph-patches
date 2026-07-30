package tech.sud.runtime.component.file;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tech.sud.runtime.core.C1236b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class LocalStorage {

    /* JADX INFO: renamed from: a */
    SharedPreferences f11369a;

    public LocalStorage(String str) {
        this.f11369a = null;
        Context contextM10405b = C1236b.m10405b();
        if (contextM10405b == null) {
            return;
        }
        this.f11369a = contextM10405b.getSharedPreferences(str, 0);
    }

    public void clear() {
        SharedPreferences sharedPreferences = this.f11369a;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public String getItem(String str) {
        SharedPreferences sharedPreferences = this.f11369a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(str, null);
    }

    public String getItemKeyList() {
        SharedPreferences sharedPreferences = this.f11369a;
        if (sharedPreferences == null) {
            return "";
        }
        try {
            Map<String, ?> all = sharedPreferences.getAll();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("limitSize", 10000);
            jSONObject.put("currentSize", all.size() * 10);
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = all.keySet().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("keys", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void removeItem(String str) {
        SharedPreferences sharedPreferences = this.f11369a;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public void setItem(String str, String str2) {
        SharedPreferences sharedPreferences = this.f11369a;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
