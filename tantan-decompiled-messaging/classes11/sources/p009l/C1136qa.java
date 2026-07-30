package p009l;

import com.immomo.mediacore.audio.AudioProcess;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.base.internal.voiceengine.WebRtcAudioManager;
import l.d30;
import l.gdm;
import l.hfw;
import l.i3t;
import l.kmc0;
import l.o4s;
import l.uvr;

/* JADX INFO: renamed from: l.qa */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C1136qa {

    /* JADX INFO: renamed from: a */
    public static boolean f19109a = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20847a() {
        System.loadLibrary("MomoSoundAndroid");
        System.loadLibrary("MomoAudioMixer");
        System.loadLibrary("ijkaudioprocess");
    }

    /* JADX INFO: renamed from: b */
    public static void m20848b(gdm gdmVar) {
        if (BuzzMediaCallManager.INSTANCE.S()) {
            return;
        }
        o4s o4sVarD = uvr.d();
        if (!NullChecker.a(o4sVarD) || !o4sVarD.E0()) {
            kmc0.k(AudioProcess.class).c("loadLibrariesOnce", new Object[]{gdmVar});
            return;
        }
        try {
            i3t.a(new d30() { // from class: l.pa
                public final void call() {
                    C1136qa.m20847a();
                }
            }, "hookLoadLibrariesOnce", "all", false, true);
        } catch (Throwable unused) {
            if (f19109a) {
                return;
            }
            f19109a = true;
            hfw.a("AudioProcessHookSo", "dlopen failed: library libMomoSoundAndroid.so not found");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m20849c(WebRtcAudioManager webRtcAudioManager, int i, int i2) {
        try {
            kmc0.l(webRtcAudioManager).c("notifyPlayoutVolumeChange", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }
}
