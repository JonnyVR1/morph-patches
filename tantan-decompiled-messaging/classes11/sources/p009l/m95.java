package p009l;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class m95 {

    /* JADX INFO: renamed from: b */
    public static volatile m95 f16769b;

    /* JADX INFO: renamed from: a */
    public ClipboardManager f16770a;

    public m95(Context context) {
        this.f16770a = (ClipboardManager) context.getSystemService("clipboard");
    }

    /* JADX INFO: renamed from: c */
    public static m95 m18311c(Context context) {
        if (f16769b == null) {
            synchronized (m95.class) {
                try {
                    if (f16769b == null) {
                        f16769b = new m95(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16769b;
    }

    /* JADX INFO: renamed from: a */
    public void m18312a(String str, String str2) {
        this.f16770a.setPrimaryClip(ClipData.newPlainText(str, str2));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public String m18313b() {
        ClipDescription primaryClipDescription;
        ClipData primaryClip;
        if (m18314d() && (primaryClipDescription = this.f16770a.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/plain")) {
            try {
                primaryClip = this.f16770a.getPrimaryClip();
            } catch (Exception e) {
                CrashHelper.c(e);
                primaryClip = null;
            }
            if (primaryClip != null && primaryClip.getItemAt(0).getText() != null) {
                return primaryClip.getItemAt(0).getText().toString();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m18314d() {
        return this.f16770a.hasPrimaryClip();
    }
}
