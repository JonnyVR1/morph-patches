package p149l;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import com.immomo.moment.mediautils.AudioSpeedControlPlayer;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class dt10 {

    /* JADX INFO: renamed from: a */
    public static volatile rr10 f87804a = null;

    /* JADX INFO: renamed from: b */
    public static volatile Handler f87805b = null;

    /* JADX INFO: renamed from: c */
    public static MusicContent f87806c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f87807d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f87808e = false;

    /* JADX INFO: renamed from: f */
    public static boolean f87809f = false;

    /* JADX INFO: renamed from: g */
    public static long f87810g = 0;

    /* JADX INFO: renamed from: h */
    public static long f87811h = -2;

    /* JADX INFO: renamed from: i */
    public static List<Object> f87812i;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m113509a(AudioSpeedControlPlayer audioSpeedControlPlayer) {
        if (f87808e) {
            f87804a.m180500g().start();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m113510b() {
        if (NullChecker.m81303a(f87812i)) {
            f87812i.clear();
            f87812i = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m113511c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static long m113512d() {
        return f87811h;
    }

    /* JADX INFO: renamed from: e */
    public static int m113513e(String str) throws Throwable {
        int i;
        if (TextUtils.isEmpty(str)) {
            jfd0.m141176a("music path is null.");
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
            CrashHelper.m81296c(e);
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
                    if (NullChecker.m81303a(mediaPlayer2)) {
                        mediaPlayer2.release();
                    }
                    return duration;
                } catch (IOException e2) {
                    e = e2;
                    mediaPlayer = mediaPlayer2;
                    CrashHelper.m81296c(e);
                    if (!NullChecker.m81303a(mediaPlayer)) {
                        return -1;
                    }
                    mediaPlayer.release();
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    mediaPlayer = mediaPlayer2;
                    if (NullChecker.m81303a(mediaPlayer)) {
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
    public static rr10 m113514f() {
        if (f87804a == null) {
            synchronized (dt10.class) {
                try {
                    if (f87804a == null) {
                        f87804a = new rr10(m113511c());
                        f87804a.m180507n(new AudioSpeedControlPlayer.OnPreparedListener() { // from class: l.ct10
                            @Override // com.immomo.moment.mediautils.AudioSpeedControlPlayer.OnPreparedListener
                            public final void onPrepared(AudioSpeedControlPlayer audioSpeedControlPlayer) {
                                dt10.m113509a(audioSpeedControlPlayer);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f87804a;
    }

    /* JADX INFO: renamed from: g */
    public static long m113515g() {
        long j = f87810g + 1;
        f87810g = j;
        if (j == Long.MAX_VALUE) {
            f87810g = 0L;
        }
        return f87810g;
    }

    /* JADX INFO: renamed from: h */
    public static void m113516h() {
        if (NullChecker.m81303a(f87805b)) {
            f87805b.removeCallbacksAndMessages(null);
        }
        f87805b = null;
        m113517i();
        m113510b();
        if (NullChecker.m81303a(f87804a)) {
            if (f87804a.m180501h()) {
                f87804a.m180502i();
            }
            f87804a.m180503j();
        }
        f87804a = null;
        f87810g = 0L;
    }

    /* JADX INFO: renamed from: i */
    public static void m113517i() {
        m113518j();
        f87806c = null;
        f87808e = false;
        f87809f = false;
    }

    /* JADX INFO: renamed from: j */
    public static void m113518j() {
        if (NullChecker.m81303a(f87804a)) {
            f87804a.m180504k();
        }
        f87807d = true;
        f87808e = false;
        f87809f = false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m113519k(MusicContent musicContent) {
        boolean zM180506m;
        if (musicContent == null || (TextUtils.isEmpty(musicContent.uri) && TextUtils.isEmpty(musicContent.path))) {
            return false;
        }
        if (NullChecker.m81303a(f87806c) && f87806c.isDeepEquals(musicContent)) {
            return true;
        }
        m113514f();
        m113517i();
        f87806c = musicContent;
        try {
            zM180506m = f87804a.m180506m(musicContent.path);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            zM180506m = false;
        }
        f87807d = false;
        return zM180506m;
    }

    /* JADX INFO: renamed from: l */
    public static void m113520l(long j, int i, int i2, boolean z, float f) throws IllegalStateException {
        f87811h = j;
        if (!NullChecker.m81303a(f87804a) || f87807d) {
            return;
        }
        f87804a.m180509p(i, i2, z, f);
        f87808e = true;
        f87809f = false;
    }

    /* JADX INFO: renamed from: m */
    public static long m113521m(MusicContent musicContent, long j, int i, int i2, float f) {
        if (m113511c()) {
            lsi0.m151595y("该机型暂不支持此功能！");
            return 0L;
        }
        if (musicContent == null) {
            return 0L;
        }
        MusicContent musicContent2 = f87806c;
        boolean z = musicContent2 != null && musicContent2.isDeepEquals(musicContent);
        if (!z) {
            m113519k(musicContent);
        }
        m113520l(j, i, i2, z, f);
        return j;
    }

    /* JADX INFO: renamed from: n */
    public static long m113522n(MusicContent musicContent, int i, int i2) {
        return m113521m(musicContent, m113515g(), i, i2, 1.0f);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m113523o(long j) {
        long j2 = f87811h;
        if (j2 != j && j2 != Long.MIN_VALUE) {
            return false;
        }
        if (NullChecker.m81303a(f87804a)) {
            f87804a.m180510q();
            f87808e = false;
            f87809f = false;
        }
        f87806c = null;
        return true;
    }
}
