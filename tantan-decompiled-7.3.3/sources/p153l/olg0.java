package p153l;

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
public final class olg0 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f147834a;

    public olg0(Context context) {
        this.f147834a = context.getSharedPreferences("sudrt_sp_game_package", 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m168109a(uug0 uug0Var, uug0 uug0Var2) {
        long j = uug0Var.f181078f - uug0Var2.f181078f;
        if (0 == j) {
            return 0;
        }
        return j > 0 ? 1 : -1;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m168110b() {
        ArrayList arrayList = new ArrayList(0);
        for (String str : this.f147834a.getString("sudrt_package_game_id_list", "").split(Constants.PACKNAME_END)) {
            uug0 uug0VarM181992a = rlg0.m181992a(this.f147834a.getString(str, ""));
            if (uug0VarM181992a != null) {
                arrayList.add(uug0VarM181992a);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.kig0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return olg0.m168109a((uug0) obj, (uug0) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final void m168111c(long j) {
        SharedPreferences.Editor editorEdit = this.f147834a.edit();
        editorEdit.remove(String.valueOf(j));
        String str = "";
        String[] strArrSplit = this.f147834a.getString("sudrt_package_game_id_list", "").split(Constants.PACKNAME_END);
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
    public final void m168112d(jlg0 jlg0Var) {
        SharedPreferences.Editor editorEdit = this.f147834a.edit();
        editorEdit.remove("sudrt_game_ut_core_info");
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: e */
    public final void m168113e(jsg0 jsg0Var) {
        SharedPreferences.Editor editorEdit = this.f147834a.edit();
        editorEdit.remove("sudrt_game_core_info");
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: f */
    public final void m168114f(psg0 psg0Var) {
        String string;
        String str = "ut_embbed_" + String.valueOf(psg0Var.f153902a);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mgId", psg0Var.f153902a);
            jSONObject.put("fGamePackageMd5", psg0Var.f153903b);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        SharedPreferences.Editor editorEdit = this.f147834a.edit();
        if (string == null || string.isEmpty()) {
            editorEdit.remove(str);
        } else {
            editorEdit.putString(str, string);
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: g */
    public final void m168115g(uug0 uug0Var) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mgId", uug0Var.f181073a);
            jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, uug0Var.f181074b);
            jSONObject.put("url", uug0Var.f181075c);
            jSONObject.put("fNameMd5", uug0Var.f181076d);
            jSONObject.put("fTotalSize", uug0Var.f181077e);
            jSONObject.put("lastUseTimestamp", uug0Var.f181078f);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        SharedPreferences.Editor editorEdit = this.f147834a.edit();
        if (string == null || string.isEmpty()) {
            editorEdit.remove(String.valueOf(uug0Var.f181073a));
        } else {
            editorEdit.putString(String.valueOf(uug0Var.f181073a), string);
        }
        editorEdit.apply();
        long j = uug0Var.f181073a;
        SharedPreferences.Editor editorEdit2 = this.f147834a.edit();
        String[] strArrSplit = this.f147834a.getString("sudrt_package_game_id_list", "").split(Constants.PACKNAME_END);
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
