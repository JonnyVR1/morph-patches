package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes11.dex */
public class bjq {
    /* JADX INFO: renamed from: a */
    public static boolean m102187a(Context context) {
        SharedPreferences.Editor editorEdit = MMKV.mmkvWithID("JSSharePreference").edit();
        editorEdit.clear();
        return editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m102188b(Context context, String str) {
        return MMKV.mmkvWithID("JSSharePreference").contains(str);
    }

    /* JADX INFO: renamed from: c */
    public static String m102189c(Context context, String str, String str2) {
        MMKV mmkvMmkvWithID = MMKV.mmkvWithID("JSSharePreference");
        return !mmkvMmkvWithID.contains(str) ? "KEY_NOT_EXIST" : mmkvMmkvWithID.getString(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m102190d(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = MMKV.mmkvWithID("JSSharePreference").edit();
        editorEdit.putString(str, str2);
        return editorEdit.commit();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m102191e(Context context, String str) {
        SharedPreferences.Editor editorEdit = MMKV.mmkvWithID("JSSharePreference").edit();
        editorEdit.remove(str);
        return editorEdit.commit();
    }
}
