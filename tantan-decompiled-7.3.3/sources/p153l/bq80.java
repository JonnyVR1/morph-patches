package p153l;

import android.content.SharedPreferences;
import com.google.android.vending.licensing.ValidationException;

/* JADX INFO: loaded from: classes7.dex */
public class bq80 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f77863a;

    /* JADX INFO: renamed from: b */
    public final w850 f77864b;

    /* JADX INFO: renamed from: c */
    public SharedPreferences.Editor f77865c = null;

    public bq80(SharedPreferences sharedPreferences, w850 w850Var) {
        this.f77863a = sharedPreferences;
        this.f77864b = w850Var;
    }

    /* JADX INFO: renamed from: a */
    public void m105884a() {
        SharedPreferences.Editor editor = this.f77865c;
        if (editor != null) {
            editor.commit();
            this.f77865c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m105885b(String str, String str2) {
        String string = this.f77863a.getString(str, null);
        if (string != null) {
            try {
                return this.f77864b.mo137946b(string, str);
            } catch (ValidationException unused) {
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public void m105886c(String str, String str2) {
        if (this.f77865c == null) {
            this.f77865c = this.f77863a.edit();
        }
        this.f77865c.putString(str, this.f77864b.mo137945a(str2, str));
    }
}
