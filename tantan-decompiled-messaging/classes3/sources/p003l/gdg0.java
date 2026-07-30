package p003l;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import l.bdg0;
import l.bkg0;
import l.mmg0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class gdg0 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f3847a;

    public gdg0(Context context) {
        this.f3847a = context.getSharedPreferences("sudrt_sp_game_package", 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m4528a(mmg0 mmg0Var, mmg0 mmg0Var2) {
        long j = mmg0Var.f - mmg0Var2.f;
        if (0 == j) {
            return 0;
        }
        return j > 0 ? 1 : -1;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m4529b() {
        ArrayList arrayList = new ArrayList(0);
        for (String str : this.f3847a.getString("sudrt_package_game_id_list", "").split(";")) {
            mmg0 mmg0VarM5314a = jdg0.m5314a(this.f3847a.getString(str, ""));
            if (mmg0VarM5314a != null) {
                arrayList.add(mmg0VarM5314a);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.cag0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gdg0.m4528a((mmg0) obj, (mmg0) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final void m4530c(long j) {
        SharedPreferences.Editor editorEdit = this.f3847a.edit();
        editorEdit.remove(String.valueOf(j));
        String str = "";
        String[] strArrSplit = this.f3847a.getString("sudrt_package_game_id_list", "").split(";");
        String strValueOf = String.valueOf(j);
        for (String str2 : strArrSplit) {
            if (!strValueOf.equals(str2)) {
                str = str.isEmpty() ? str2 : str + ";" + str2;
            }
        }
        editorEdit.putString("sudrt_package_game_id_list", str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: d */
    public final void m4531d(bdg0 bdg0Var) {
        SharedPreferences.Editor editorEdit = this.f3847a.edit();
        editorEdit.remove("sudrt_game_ut_core_info");
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: e */
    public final void m4532e(bkg0 bkg0Var) {
        SharedPreferences.Editor editorEdit = this.f3847a.edit();
        editorEdit.remove("sudrt_game_core_info");
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: f */
    public final void m4533f(hkg0 hkg0Var) {
        String string;
        String str = "ut_embbed_" + String.valueOf(hkg0Var.f4221a);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mgId", hkg0Var.f4221a);
            jSONObject.put("fGamePackageMd5", hkg0Var.f4222b);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        SharedPreferences.Editor editorEdit = this.f3847a.edit();
        if (string == null || string.isEmpty()) {
            editorEdit.remove(str);
        } else {
            editorEdit.putString(str, string);
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: g */
    public final void m4534g(mmg0 mmg0Var) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mgId", mmg0Var.a);
            jSONObject.put("version", mmg0Var.b);
            jSONObject.put("url", mmg0Var.c);
            jSONObject.put("fNameMd5", mmg0Var.d);
            jSONObject.put("fTotalSize", mmg0Var.e);
            jSONObject.put("lastUseTimestamp", mmg0Var.f);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        SharedPreferences.Editor editorEdit = this.f3847a.edit();
        if (string == null || string.isEmpty()) {
            editorEdit.remove(String.valueOf(mmg0Var.a));
        } else {
            editorEdit.putString(String.valueOf(mmg0Var.a), string);
        }
        editorEdit.apply();
        long j = mmg0Var.a;
        SharedPreferences.Editor editorEdit2 = this.f3847a.edit();
        String[] strArrSplit = this.f3847a.getString("sudrt_package_game_id_list", "").split(";");
        String strValueOf = String.valueOf(j);
        for (String str : strArrSplit) {
            if (strValueOf.equals(str)) {
                editorEdit2.apply();
            }
        }
        for (String str2 : strArrSplit) {
            strValueOf = strValueOf + ";" + str2;
        }
        editorEdit2.putString("sudrt_package_game_id_list", strValueOf);
        editorEdit2.apply();
    }
}
