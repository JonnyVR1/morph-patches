package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.Constants;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class gdg0 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f102111a;

    public gdg0(Context context) {
        this.f102111a = context.getSharedPreferences("sudrt_sp_game_package", 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m125548a(mmg0 mmg0Var, mmg0 mmg0Var2) {
        long j = mmg0Var.f134668f - mmg0Var2.f134668f;
        if (0 == j) {
            return 0;
        }
        return j > 0 ? 1 : -1;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m125549b() {
        ArrayList arrayList = new ArrayList(0);
        for (String str : this.f102111a.getString("sudrt_package_game_id_list", "").split(Constants.PACKNAME_END)) {
            mmg0 mmg0VarM141028a = jdg0.m141028a(this.f102111a.getString(str, ""));
            if (mmg0VarM141028a != null) {
                arrayList.add(mmg0VarM141028a);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.cag0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gdg0.m125548a((mmg0) obj, (mmg0) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final void m125550c(long j) {
        SharedPreferences.Editor editorEdit = this.f102111a.edit();
        editorEdit.remove(String.valueOf(j));
        String str = "";
        String[] strArrSplit = this.f102111a.getString("sudrt_package_game_id_list", "").split(Constants.PACKNAME_END);
        String strValueOf = String.valueOf(j);
        for (String str2 : strArrSplit) {
            if (!strValueOf.equals(str2)) {
                str = str.isEmpty() ? str2 : str + Constants.PACKNAME_END + str2;
            }
        }
        editorEdit.putString("sudrt_package_game_id_list", str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: d */
    public final void m125551d(bdg0 bdg0Var) {
        SharedPreferences.Editor editorEdit = this.f102111a.edit();
        editorEdit.remove("sudrt_game_ut_core_info");
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: e */
    public final void m125552e(bkg0 bkg0Var) {
        SharedPreferences.Editor editorEdit = this.f102111a.edit();
        editorEdit.remove("sudrt_game_core_info");
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: f */
    public final void m125553f(hkg0 hkg0Var) {
        String string;
        String str = "ut_embbed_" + String.valueOf(hkg0Var.f108192a);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mgId", hkg0Var.f108192a);
            jSONObject.put("fGamePackageMd5", hkg0Var.f108193b);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        SharedPreferences.Editor editorEdit = this.f102111a.edit();
        if (string == null || string.isEmpty()) {
            editorEdit.remove(str);
        } else {
            editorEdit.putString(str, string);
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: g */
    public final void m125554g(mmg0 mmg0Var) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mgId", mmg0Var.f134663a);
            jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, mmg0Var.f134664b);
            jSONObject.put("url", mmg0Var.f134665c);
            jSONObject.put("fNameMd5", mmg0Var.f134666d);
            jSONObject.put("fTotalSize", mmg0Var.f134667e);
            jSONObject.put("lastUseTimestamp", mmg0Var.f134668f);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        SharedPreferences.Editor editorEdit = this.f102111a.edit();
        if (string == null || string.isEmpty()) {
            editorEdit.remove(String.valueOf(mmg0Var.f134663a));
        } else {
            editorEdit.putString(String.valueOf(mmg0Var.f134663a), string);
        }
        editorEdit.apply();
        long j = mmg0Var.f134663a;
        SharedPreferences.Editor editorEdit2 = this.f102111a.edit();
        String[] strArrSplit = this.f102111a.getString("sudrt_package_game_id_list", "").split(Constants.PACKNAME_END);
        String strValueOf = String.valueOf(j);
        for (String str : strArrSplit) {
            if (strValueOf.equals(str)) {
                editorEdit2.apply();
            }
        }
        for (String str2 : strArrSplit) {
            strValueOf = strValueOf + Constants.PACKNAME_END + str2;
        }
        editorEdit2.putString("sudrt_package_game_id_list", strValueOf);
        editorEdit2.apply();
    }
}
