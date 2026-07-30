package p009l;

import android.media.AudioManager;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fb1 {
    /* JADX INFO: renamed from: a */
    public static boolean m14356a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        return m14357b(onAudioFocusChangeListener, i, 3);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14357b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2) {
        AudioManager audioManager = (AudioManager) CoreModule.b.getSystemService("audio");
        return NullChecker.a(audioManager) && audioManager.requestAudioFocus(onAudioFocusChangeListener, i2, i) == 1;
    }
}
