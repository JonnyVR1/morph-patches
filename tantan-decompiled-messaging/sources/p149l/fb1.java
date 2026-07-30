package p149l;

import android.media.AudioManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class fb1 {
    /* JADX INFO: renamed from: a */
    public static boolean m120341a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        return m120342b(onAudioFocusChangeListener, i, 3);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m120342b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2) {
        AudioManager audioManager = (AudioManager) CoreModule.f17544b.getSystemService("audio");
        return NullChecker.m81303a(audioManager) && audioManager.requestAudioFocus(onAudioFocusChangeListener, i2, i) == 1;
    }
}
