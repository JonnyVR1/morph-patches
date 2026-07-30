package p007l;

import android.media.AudioManager;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class eb1 {
    /* JADX INFO: renamed from: a */
    public static boolean m9688a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioManager audioManager = (AudioManager) FeedModule.f313a.getSystemService("audio");
        return NullChecker.a(audioManager) && audioManager.abandonAudioFocus(onAudioFocusChangeListener) == 1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9689b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        return m9690c(onAudioFocusChangeListener, i, 3);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9690c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2) {
        AudioManager audioManager = (AudioManager) FeedModule.f313a.getSystemService("audio");
        return NullChecker.a(audioManager) && audioManager.requestAudioFocus(onAudioFocusChangeListener, i2, i) == 1;
    }
}
