package p153l;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class cnw0 {

    /* JADX INFO: renamed from: a */
    public final String f82794a;

    public cnw0(String str) {
        this.f82794a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m111553e(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + Constants.AES_SUFFIX;
            }
        }
        return str + " : " + str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m111554a(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m111553e(this.f82794a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m111555b(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m111553e(this.f82794a, str, objArr), th);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m111556c(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m111553e(this.f82794a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m111557d(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m111553e(this.f82794a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
