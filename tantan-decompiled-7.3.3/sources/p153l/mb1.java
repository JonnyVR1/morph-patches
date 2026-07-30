package p153l;

import android.media.AudioManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class mb1 {
    /* JADX INFO: renamed from: a */
    public static boolean m157763a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        return m157764b(onAudioFocusChangeListener, i, 3);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m157764b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2) {
        AudioManager audioManager = (AudioManager) CoreModule.f18263b.getSystemService("audio");
        return NullChecker.m82486a(audioManager) && audioManager.requestAudioFocus(onAudioFocusChangeListener, i2, i) == 1;
    }
}
