package p149l;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.annotation.Nullable;
import com.bytedance.bpea.entry.common.DataType;
import com.tantanapp.common.utils.CrashHelper;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes11.dex */
public class m95 {

    /* JADX INFO: renamed from: b */
    public static volatile m95 f132671b;

    /* JADX INFO: renamed from: a */
    public ClipboardManager f132672a;

    public m95(Context context) {
        this.f132672a = (ClipboardManager) context.getSystemService(DataType.CLIPBOARD);
    }

    /* JADX INFO: renamed from: c */
    public static m95 m153590c(Context context) {
        if (f132671b == null) {
            synchronized (m95.class) {
                try {
                    if (f132671b == null) {
                        f132671b = new m95(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f132671b;
    }

    /* JADX INFO: renamed from: a */
    public void m153591a(String str, String str2) {
        this.f132672a.setPrimaryClip(ClipData.newPlainText(str, str2));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public String m153592b() {
        ClipDescription primaryClipDescription;
        ClipData primaryClip;
        if (m153593d() && (primaryClipDescription = this.f132672a.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType(MimeTypes.TEXT_PLAIN)) {
            try {
                primaryClip = this.f132672a.getPrimaryClip();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                primaryClip = null;
            }
            if (primaryClip != null && primaryClip.getItemAt(0).getText() != null) {
                return primaryClip.getItemAt(0).getText().toString();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m153593d() {
        return this.f132672a.hasPrimaryClip();
    }
}
