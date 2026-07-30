package p149l;

import android.text.TextUtils;
import org.greenrobot.greendao.converter.PropertyConverter;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class c8e implements PropertyConverter<b8e[], String> {
    /* JADX INFO: renamed from: c */
    private String m105778c(b8e[] b8eVarArr) {
        if (b8eVarArr == null || b8eVarArr.length <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (b8e b8eVar : b8eVarArr) {
            try {
                jSONArray.put(b8eVar.m100770b());
            } catch (Exception unused) {
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: d */
    private b8e[] m105779d(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        b8e[] b8eVarArr = new b8e[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            b8e b8eVar = new b8e();
            b8eVar.m100769a(jSONArray.getJSONObject(i));
            b8eVarArr[i] = b8eVar;
        }
        return b8eVarArr;
    }

    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String convertToDatabaseValue(b8e[] b8eVarArr) {
        return m105778c(b8eVarArr);
    }

    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b8e[] convertToEntityProperty(String str) {
        try {
            return m105779d(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
