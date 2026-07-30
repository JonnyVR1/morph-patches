package p153l;

import android.media.AudioManager;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class lb1 {
    /* JADX INFO: renamed from: a */
    public static boolean m153551a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioManager audioManager = (AudioManager) FeedModule.f39700a.getSystemService("audio");
        return NullChecker.m82486a(audioManager) && audioManager.abandonAudioFocus(onAudioFocusChangeListener) == 1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m153552b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        return m153553c(onAudioFocusChangeListener, i, 3);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m153553c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2) {
        AudioManager audioManager = (AudioManager) FeedModule.f39700a.getSystemService("audio");
        return NullChecker.m82486a(audioManager) && audioManager.requestAudioFocus(onAudioFocusChangeListener, i2, i) == 1;
    }
}
