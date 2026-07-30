package p007l;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import com.immomo.moment.mediautils.AudioSpeedControlPlayer;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import l.jfd0;
import l.lsi0;
import l.rr10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dt10 {

    /* JADX INFO: renamed from: a */
    public static volatile rr10 f7050a = null;

    /* JADX INFO: renamed from: b */
    public static volatile Handler f7051b = null;

    /* JADX INFO: renamed from: c */
    public static MusicContent f7052c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f7053d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f7054e = false;

    /* JADX INFO: renamed from: f */
    public static boolean f7055f = false;

    /* JADX INFO: renamed from: g */
    public static long f7056g = 0;

    /* JADX INFO: renamed from: h */
    public static long f7057h = -2;

    /* JADX INFO: renamed from: i */
    public static List<Object> f7058i;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9565a(AudioSpeedControlPlayer audioSpeedControlPlayer) {
        if (f7054e) {
            f7050a.g().start();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9566b() {
        if (NullChecker.a(f7058i)) {
            f7058i.clear();
            f7058i = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9567c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static long m9568d() {
        return f7057h;
    }

    /* JADX INFO: renamed from: e */
    public static int m9569e(String str) throws Throwable {
        int i;
        if (TextUtils.isEmpty(str)) {
            jfd0.a("music path is null.");
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
            CrashHelper.c(e);
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
                    if (NullChecker.a(mediaPlayer2)) {
                        mediaPlayer2.release();
                    }
                    return duration;
                } catch (IOException e2) {
                    e = e2;
                    mediaPlayer = mediaPlayer2;
                    CrashHelper.c(e);
                    if (!NullChecker.a(mediaPlayer)) {
                        return -1;
                    }
                    mediaPlayer.release();
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    mediaPlayer = mediaPlayer2;
                    if (NullChecker.a(mediaPlayer)) {
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
    public static rr10 m9570f() {
        if (f7050a == null) {
            synchronized (dt10.class) {
                try {
                    if (f7050a == null) {
                        f7050a = new rr10(m9567c());
                        f7050a.n(new AudioSpeedControlPlayer.OnPreparedListener() { // from class: l.ct10
                            public final void onPrepared(AudioSpeedControlPlayer audioSpeedControlPlayer) {
                                dt10.m9565a(audioSpeedControlPlayer);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7050a;
    }

    /* JADX INFO: renamed from: g */
    public static long m9571g() {
        long j = f7056g + 1;
        f7056g = j;
        if (j == Long.MAX_VALUE) {
            f7056g = 0L;
        }
        return f7056g;
    }

    /* JADX INFO: renamed from: h */
    public static void m9572h() {
        if (NullChecker.a(f7051b)) {
            f7051b.removeCallbacksAndMessages(null);
        }
        f7051b = null;
        m9573i();
        m9566b();
        if (NullChecker.a(f7050a)) {
            if (f7050a.h()) {
                f7050a.i();
            }
            f7050a.j();
        }
        f7050a = null;
        f7056g = 0L;
    }

    /* JADX INFO: renamed from: i */
    public static void m9573i() {
        m9574j();
        f7052c = null;
        f7054e = false;
        f7055f = false;
    }

    /* JADX INFO: renamed from: j */
    public static void m9574j() {
        if (NullChecker.a(f7050a)) {
            f7050a.k();
        }
        f7053d = true;
        f7054e = false;
        f7055f = false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m9575k(MusicContent musicContent) {
        boolean zM;
        if (musicContent == null || (TextUtils.isEmpty(musicContent.uri) && TextUtils.isEmpty(musicContent.path))) {
            return false;
        }
        if (NullChecker.a(f7052c) && f7052c.isDeepEquals(musicContent)) {
            return true;
        }
        m9570f();
        m9573i();
        f7052c = musicContent;
        try {
            zM = f7050a.m(musicContent.path);
        } catch (IOException e) {
            CrashHelper.c(e);
            zM = false;
        }
        f7053d = false;
        return zM;
    }

    /* JADX INFO: renamed from: l */
    public static void m9576l(long j, int i, int i2, boolean z, float f) throws IllegalStateException {
        f7057h = j;
        if (!NullChecker.a(f7050a) || f7053d) {
            return;
        }
        f7050a.p(i, i2, z, f);
        f7054e = true;
        f7055f = false;
    }

    /* JADX INFO: renamed from: m */
    public static long m9577m(MusicContent musicContent, long j, int i, int i2, float f) {
        if (m9567c()) {
            lsi0.y("该机型暂不支持此功能！");
            return 0L;
        }
        if (musicContent == null) {
            return 0L;
        }
        MusicContent musicContent2 = f7052c;
        boolean z = musicContent2 != null && musicContent2.isDeepEquals(musicContent);
        if (!z) {
            m9575k(musicContent);
        }
        m9576l(j, i, i2, z, f);
        return j;
    }

    /* JADX INFO: renamed from: n */
    public static long m9578n(MusicContent musicContent, int i, int i2) {
        return m9577m(musicContent, m9571g(), i, i2, 1.0f);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m9579o(long j) {
        long j2 = f7057h;
        if (j2 != j && j2 != Long.MIN_VALUE) {
            return false;
        }
        if (NullChecker.a(f7050a)) {
            f7050a.q();
            f7054e = false;
            f7055f = false;
        }
        f7052c = null;
        return true;
    }
}
