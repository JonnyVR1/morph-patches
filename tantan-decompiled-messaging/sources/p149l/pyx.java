package p149l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0003R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R0\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u001bj\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/pyx;", "", "<init>", "()V", "Ll/irl;", "file", "Landroid/media/MediaExtractor;", "c", "(Ll/irl;)Landroid/media/MediaExtractor;", "Landroid/media/MediaFormat;", "videoFormat", "", "a", "(Landroid/media/MediaFormat;)Z", "extractor", "", "f", "(Landroid/media/MediaExtractor;)I", "e", "", "mimeType", "b", "(Ljava/lang/String;)Z", "", Constants.INAPP_DATA_TAG, "Z", "isTypeMapInit", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "supportTypeMap", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class pyx {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean isTypeMapInit;

    @NotNull
    public static final pyx INSTANCE = new pyx();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, Boolean> supportTypeMap = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final boolean m172167a(@NotNull MediaFormat videoFormat) {
        videoFormat.getClass();
        String string = videoFormat.getString(IMediaFormat.KEY_MIME);
        if (string == null) {
            string = "";
        }
        return StringsKt.m93412P(string, "hevc", false, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m172168b(@NotNull String mimeType) {
        HashMap<String, Boolean> map;
        String lowerCase;
        try {
            mimeType.getClass();
            if (!isTypeMapInit) {
                isTypeMapInit = true;
                m172170d();
            }
            map = supportTypeMap;
            Locale locale = Locale.ROOT;
            locale.getClass();
            lowerCase = mimeType.toLowerCase(locale);
            lowerCase.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return map.containsKey(lowerCase);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final MediaExtractor m172169c(@NotNull irl file) {
        file.getClass();
        MediaExtractor mediaExtractor = new MediaExtractor();
        file.mo137904c(mediaExtractor);
        return mediaExtractor;
    }

    /* JADX INFO: renamed from: d */
    public final void m172170d() {
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (!codecInfoAt.isEncoder()) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        HashMap<String, Boolean> map = supportTypeMap;
                        str.getClass();
                        Locale locale = Locale.ROOT;
                        locale.getClass();
                        String lowerCase = str.toLowerCase(locale);
                        lowerCase.getClass();
                        map.put(lowerCase, Boolean.TRUE);
                    }
                }
            }
            C21588z0.INSTANCE.m216709d("AnimPlayer.MediaUtil", "supportType=" + supportTypeMap.keySet());
        } catch (Throwable th) {
            C21588z0.INSTANCE.m216707b("AnimPlayer.MediaUtil", "getSupportType " + th);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m172171e(@NotNull MediaExtractor extractor) {
        extractor.getClass();
        int trackCount = extractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i);
            trackFormat.getClass();
            String string = trackFormat.getString(IMediaFormat.KEY_MIME);
            if (string == null) {
                string = "";
            }
            if (C15386d.m93483J(string, "audio/", false, 2, null)) {
                C21588z0.INSTANCE.m216709d("AnimPlayer.MediaUtil", "Extractor selected track " + i + " (" + string + "): " + trackFormat);
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m172172f(@NotNull MediaExtractor extractor) {
        extractor.getClass();
        int trackCount = extractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i);
            trackFormat.getClass();
            String string = trackFormat.getString(IMediaFormat.KEY_MIME);
            if (string == null) {
                string = "";
            }
            if (C15386d.m93483J(string, "video/", false, 2, null)) {
                C21588z0.INSTANCE.m216709d("AnimPlayer.MediaUtil", "Extractor selected track " + i + " (" + string + "): " + trackFormat);
                return i;
            }
        }
        return -1;
    }
}
