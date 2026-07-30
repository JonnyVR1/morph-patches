package p153l;

import com.immomo.mediacore.audio.AudioProcess;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.base.internal.voiceengine.WebRtcAudioManager;

/* JADX INFO: renamed from: l.la */
/* JADX INFO: loaded from: classes10.dex */
public class C18372la {

    /* JADX INFO: renamed from: a */
    public static boolean f130647a = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m153465a() {
        System.loadLibrary("MomoSoundAndroid");
        System.loadLibrary("MomoAudioMixer");
        System.loadLibrary("ijkaudioprocess");
    }

    /* JADX INFO: renamed from: b */
    public static void m153466b(wfm wfmVar) {
        if (BuzzMediaCallManager.INSTANCE.m48137S()) {
            return;
        }
        p6s p6sVarM203876d = vxr.m203876d();
        if (!NullChecker.m82486a(p6sVarM203876d) || !p6sVarM203876d.m170972E0()) {
            puc0.m173842k(AudioProcess.class).m173851c("loadLibrariesOnce", wfmVar);
            return;
        }
        try {
            j5t.m143591a(new x20() { // from class: l.ka
                @Override // p153l.x20
                public final void call() {
                    C18372la.m153465a();
                }
            }, "hookLoadLibrariesOnce", "all", false, true);
        } catch (Throwable unused) {
            if (f130647a) {
                return;
            }
            f130647a = true;
            fhw.m125605a("AudioProcessHookSo", "dlopen failed: library libMomoSoundAndroid.so not found");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m153467c(WebRtcAudioManager webRtcAudioManager, int i, int i2) {
        try {
            puc0.m173843l(webRtcAudioManager).m173851c("notifyPlayoutVolumeChange", Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }
}
