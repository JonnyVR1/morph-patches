package p153l;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.annotation.Nullable;
import com.bytedance.bpea.entry.common.DataType;
import com.tantanapp.common.utils.CrashHelper;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes10.dex */
public class na5 {

    /* JADX INFO: renamed from: b */
    public static volatile na5 f140977b;

    /* JADX INFO: renamed from: a */
    public ClipboardManager f140978a;

    public na5(Context context) {
        this.f140978a = (ClipboardManager) context.getSystemService(DataType.CLIPBOARD);
    }

    /* JADX INFO: renamed from: c */
    public static na5 m162056c(Context context) {
        if (f140977b == null) {
            synchronized (na5.class) {
                try {
                    if (f140977b == null) {
                        f140977b = new na5(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f140977b;
    }

    /* JADX INFO: renamed from: a */
    public void m162057a(String str, String str2) {
        this.f140978a.setPrimaryClip(ClipData.newPlainText(str, str2));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public String m162058b() {
        ClipDescription primaryClipDescription;
        ClipData primaryClip;
        if (m162059d() && (primaryClipDescription = this.f140978a.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType(MimeTypes.TEXT_PLAIN)) {
            try {
                primaryClip = this.f140978a.getPrimaryClip();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                primaryClip = null;
            }
            if (primaryClip != null && primaryClip.getItemAt(0).getText() != null) {
                return primaryClip.getItemAt(0).getText().toString();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m162059d() {
        return this.f140978a.hasPrimaryClip();
    }
}
