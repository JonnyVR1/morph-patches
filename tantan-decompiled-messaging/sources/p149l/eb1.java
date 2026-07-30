package p149l;

import android.media.AudioManager;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class eb1 {
    /* JADX INFO: renamed from: a */
    public static boolean m115446a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioManager audioManager = (AudioManager) FeedModule.f38852a.getSystemService("audio");
        return NullChecker.m81303a(audioManager) && audioManager.abandonAudioFocus(onAudioFocusChangeListener) == 1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m115447b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        return m115448c(onAudioFocusChangeListener, i, 3);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m115448c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2) {
        AudioManager audioManager = (AudioManager) FeedModule.f38852a.getSystemService("audio");
        return NullChecker.m81303a(audioManager) && audioManager.requestAudioFocus(onAudioFocusChangeListener, i2, i) == 1;
    }
}
