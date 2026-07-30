package p149l;

import android.content.SharedPreferences;
import com.google.android.vending.licensing.ValidationException;

/* JADX INFO: loaded from: classes7.dex */
public class wh80 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f186371a;

    /* JADX INFO: renamed from: b */
    public final h050 f186372b;

    /* JADX INFO: renamed from: c */
    public SharedPreferences.Editor f186373c = null;

    public wh80(SharedPreferences sharedPreferences, h050 h050Var) {
        this.f186371a = sharedPreferences;
        this.f186372b = h050Var;
    }

    /* JADX INFO: renamed from: a */
    public void m203114a() {
        SharedPreferences.Editor editor = this.f186373c;
        if (editor != null) {
            editor.commit();
            this.f186373c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m203115b(String str, String str2) {
        String string = this.f186371a.getString(str, null);
        if (string != null) {
            try {
                return this.f186372b.mo128945b(string, str);
            } catch (ValidationException unused) {
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public void m203116c(String str, String str2) {
        if (this.f186373c == null) {
            this.f186373c = this.f186371a.edit();
        }
        this.f186373c.putString(str, this.f186372b.mo128944a(str2, str));
    }
}
