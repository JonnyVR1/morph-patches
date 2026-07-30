package p149l;

import com.immomo.mediacore.audio.AudioProcess;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.base.internal.voiceengine.WebRtcAudioManager;

/* JADX INFO: renamed from: l.qa */
/* JADX INFO: loaded from: classes11.dex */
public class C19450qa {

    /* JADX INFO: renamed from: a */
    public static boolean f153491a = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m173677a() {
        System.loadLibrary("MomoSoundAndroid");
        System.loadLibrary("MomoAudioMixer");
        System.loadLibrary("ijkaudioprocess");
    }

    /* JADX INFO: renamed from: b */
    public static void m173678b(gdm gdmVar) {
        if (BuzzMediaCallManager.INSTANCE.m46954S()) {
            return;
        }
        o4s o4sVarM196087d = uvr.m196087d();
        if (!NullChecker.m81303a(o4sVarM196087d) || !o4sVarM196087d.m162665E0()) {
            kmc0.m146493k(AudioProcess.class).m146502c("loadLibrariesOnce", gdmVar);
            return;
        }
        try {
            i3t.m134299a(new d30() { // from class: l.pa
                @Override // p149l.d30
                public final void call() {
                    C19450qa.m173677a();
                }
            }, "hookLoadLibrariesOnce", "all", false, true);
        } catch (Throwable unused) {
            if (f153491a) {
                return;
            }
            f153491a = true;
            hfw.m130790a("AudioProcessHookSo", "dlopen failed: library libMomoSoundAndroid.so not found");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m173679c(WebRtcAudioManager webRtcAudioManager, int i, int i2) {
        try {
            kmc0.m146494l(webRtcAudioManager).m146502c("notifyPlayoutVolumeChange", Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }
}
