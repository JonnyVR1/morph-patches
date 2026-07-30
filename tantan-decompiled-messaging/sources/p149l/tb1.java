package p149l;

import com.immomo.mediacore.audio.AudioProcess;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
public class tb1 {

    /* JADX INFO: renamed from: a */
    public static String f169199a = "AudioProcessReflectHelper";

    /* JADX INFO: renamed from: b */
    public static boolean f169200b = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m187788a(String str) {
        try {
            hfw.m130790a(f169199a, "loadLibrary start：" + str);
            System.loadLibrary(str);
            hfw.m130790a(f169199a, "loadLibrary end：" + str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m187789b() {
        if (f169200b) {
            return;
        }
        gdm gdmVar = new gdm() { // from class: l.sb1
            @Override // p149l.gdm
            public final void loadLibrary(String str) {
                tb1.m187788a(str);
            }
        };
        for (Field field : AudioProcess.class.getDeclaredFields()) {
            if ("sLocalLibLoader".equals(field.getName())) {
                try {
                    field.setAccessible(true);
                    field.set(null, gdmVar);
                    f169200b = true;
                    hfw.m130790a(f169199a, "changeLoader");
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
    }
}
