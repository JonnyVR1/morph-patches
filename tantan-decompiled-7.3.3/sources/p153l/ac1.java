package p153l;

import com.immomo.mediacore.audio.AudioProcess;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
public class ac1 {

    /* JADX INFO: renamed from: a */
    public static String f69668a = "AudioProcessReflectHelper";

    /* JADX INFO: renamed from: b */
    public static boolean f69669b = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m96796a(String str) {
        try {
            fhw.m125605a(f69668a, "loadLibrary start：" + str);
            System.loadLibrary(str);
            fhw.m125605a(f69668a, "loadLibrary end：" + str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m96797b() {
        if (f69669b) {
            return;
        }
        wfm wfmVar = new wfm() { // from class: l.zb1
            @Override // p153l.wfm
            public final void loadLibrary(String str) {
                ac1.m96796a(str);
            }
        };
        for (Field field : AudioProcess.class.getDeclaredFields()) {
            if ("sLocalLibLoader".equals(field.getName())) {
                try {
                    field.setAccessible(true);
                    field.set(null, wfmVar);
                    f69669b = true;
                    fhw.m125605a(f69668a, "changeLoader");
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
    }
}
