package p153l;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import com.immomo.moment.mediautils.AudioSpeedControlPlayer;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class l120 {

    /* JADX INFO: renamed from: a */
    public static volatile zz10 f129634a = null;

    /* JADX INFO: renamed from: b */
    public static volatile Handler f129635b = null;

    /* JADX INFO: renamed from: c */
    public static MusicContent f129636c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f129637d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f129638e = false;

    /* JADX INFO: renamed from: f */
    public static boolean f129639f = false;

    /* JADX INFO: renamed from: g */
    public static long f129640g = 0;

    /* JADX INFO: renamed from: h */
    public static long f129641h = -2;

    /* JADX INFO: renamed from: i */
    public static List<Object> f129642i;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m152418a(AudioSpeedControlPlayer audioSpeedControlPlayer) {
        if (f129638e) {
            f129634a.m222220g().start();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m152419b() {
        if (NullChecker.m82486a(f129642i)) {
            f129642i.clear();
            f129642i = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m152420c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static long m152421d() {
        return f129641h;
    }

    /* JADX INFO: renamed from: e */
    public static int m152422e(String str) throws Throwable {
        int i;
        if (TextUtils.isEmpty(str)) {
            mnd0.m159157a("music path is null.");
            return 0;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            mediaMetadataRetriever.release();
            if (!TextUtils.isEmpty(strExtractMetadata) && (i = Integer.parseInt(strExtractMetadata)) > 0) {
                return i;
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        MediaPlayer mediaPlayer = null;
        try {
            try {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                try {
                    mediaPlayer2.setAudioStreamType(3);
                    mediaPlayer2.setDataSource(str);
                    mediaPlayer2.prepare();
                    int duration = mediaPlayer2.getDuration();
                    if (NullChecker.m82486a(mediaPlayer2)) {
                        mediaPlayer2.release();
                    }
                    return duration;
                } catch (IOException e2) {
                    e = e2;
                    mediaPlayer = mediaPlayer2;
                    CrashHelper.m82479c(e);
                    if (!NullChecker.m82486a(mediaPlayer)) {
                        return -1;
                    }
                    mediaPlayer.release();
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    mediaPlayer = mediaPlayer2;
                    if (NullChecker.m82486a(mediaPlayer)) {
                        mediaPlayer.release();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: f */
    public static zz10 m152423f() {
        if (f129634a == null) {
            synchronized (l120.class) {
                try {
                    if (f129634a == null) {
                        f129634a = new zz10(m152420c());
                        f129634a.m222227n(new AudioSpeedControlPlayer.OnPreparedListener() { // from class: l.k120
                            @Override // com.immomo.moment.mediautils.AudioSpeedControlPlayer.OnPreparedListener
                            public final void onPrepared(AudioSpeedControlPlayer audioSpeedControlPlayer) {
                                l120.m152418a(audioSpeedControlPlayer);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f129634a;
    }

    /* JADX INFO: renamed from: g */
    public static long m152424g() {
        long j = f129640g + 1;
        f129640g = j;
        if (j == Long.MAX_VALUE) {
            f129640g = 0L;
        }
        return f129640g;
    }

    /* JADX INFO: renamed from: h */
    public static void m152425h() {
        if (NullChecker.m82486a(f129635b)) {
            f129635b.removeCallbacksAndMessages(null);
        }
        f129635b = null;
        m152426i();
        m152419b();
        if (NullChecker.m82486a(f129634a)) {
            if (f129634a.m222221h()) {
                f129634a.m222222i();
            }
            f129634a.m222223j();
        }
        f129634a = null;
        f129640g = 0L;
    }

    /* JADX INFO: renamed from: i */
    public static void m152426i() {
        m152427j();
        f129636c = null;
        f129638e = false;
        f129639f = false;
    }

    /* JADX INFO: renamed from: j */
    public static void m152427j() {
        if (NullChecker.m82486a(f129634a)) {
            f129634a.m222224k();
        }
        f129637d = true;
        f129638e = false;
        f129639f = false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m152428k(MusicContent musicContent) {
        boolean zM222226m;
        if (musicContent == null || (TextUtils.isEmpty(musicContent.uri) && TextUtils.isEmpty(musicContent.path))) {
            return false;
        }
        if (NullChecker.m82486a(f129636c) && f129636c.isDeepEquals(musicContent)) {
            return true;
        }
        m152423f();
        m152426i();
        f129636c = musicContent;
        try {
            zM222226m = f129634a.m222226m(musicContent.path);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            zM222226m = false;
        }
        f129637d = false;
        return zM222226m;
    }

    /* JADX INFO: renamed from: l */
    public static void m152429l(long j, int i, int i2, boolean z, float f) throws IllegalStateException {
        f129641h = j;
        if (!NullChecker.m82486a(f129634a) || f129637d) {
            return;
        }
        f129634a.m222229p(i, i2, z, f);
        f129638e = true;
        f129639f = false;
    }

    /* JADX INFO: renamed from: m */
    public static long m152430m(MusicContent musicContent, long j, int i, int i2, float f) {
        if (m152420c()) {
            o1j0.m165651y("该机型暂不支持此功能！");
            return 0L;
        }
        if (musicContent == null) {
            return 0L;
        }
        MusicContent musicContent2 = f129636c;
        boolean z = musicContent2 != null && musicContent2.isDeepEquals(musicContent);
        if (!z) {
            m152428k(musicContent);
        }
        m152429l(j, i, i2, z, f);
        return j;
    }

    /* JADX INFO: renamed from: n */
    public static long m152431n(MusicContent musicContent, int i, int i2) {
        return m152430m(musicContent, m152424g(), i, i2, 1.0f);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m152432o(long j) {
        long j2 = f129641h;
        if (j2 != j && j2 != Long.MIN_VALUE) {
            return false;
        }
        if (NullChecker.m82486a(f129634a)) {
            f129634a.m222230q();
            f129638e = false;
            f129639f = false;
        }
        f129636c = null;
        return true;
    }
}
