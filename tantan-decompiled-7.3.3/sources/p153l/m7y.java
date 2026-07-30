package p153l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0003R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R0\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u001bj\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Ll/m7y;", "", "<init>", "()V", "Ll/wtl;", "file", "Landroid/media/MediaExtractor;", "c", "(Ll/wtl;)Landroid/media/MediaExtractor;", "Landroid/media/MediaFormat;", "videoFormat", "", "a", "(Landroid/media/MediaFormat;)Z", "extractor", "", "f", "(Landroid/media/MediaExtractor;)I", "e", "", "mimeType", "b", "(Ljava/lang/String;)Z", "", Constants.INAPP_DATA_TAG, "Z", "isTypeMapInit", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "supportTypeMap", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class m7y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean isTypeMapInit;

    @NotNull
    public static final m7y INSTANCE = new m7y();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, Boolean> supportTypeMap = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final boolean m157343a(@NotNull MediaFormat videoFormat) {
        videoFormat.getClass();
        String string = videoFormat.getString(IMediaFormat.KEY_MIME);
        if (string == null) {
            string = "";
        }
        return StringsKt.m94303P(string, "hevc", false, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m157344b(@NotNull String mimeType) {
        HashMap<String, Boolean> map;
        String lowerCase;
        try {
            mimeType.getClass();
            if (!isTypeMapInit) {
                isTypeMapInit = true;
                m157346d();
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
    public final MediaExtractor m157345c(@NotNull wtl file) {
        file.getClass();
        MediaExtractor mediaExtractor = new MediaExtractor();
        file.mo167775c(mediaExtractor);
        return mediaExtractor;
    }

    /* JADX INFO: renamed from: d */
    public final void m157346d() {
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
            C21726z0.INSTANCE.m218095d("AnimPlayer.MediaUtil", "supportType=" + supportTypeMap.keySet());
        } catch (Throwable th) {
            C21726z0.INSTANCE.m218093b("AnimPlayer.MediaUtil", "getSupportType " + th);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m157347e(@NotNull MediaExtractor extractor) {
        extractor.getClass();
        int trackCount = extractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i);
            trackFormat.getClass();
            String string = trackFormat.getString(IMediaFormat.KEY_MIME);
            if (string == null) {
                string = "";
            }
            if (C15493d.m94374J(string, "audio/", false, 2, null)) {
                C21726z0.INSTANCE.m218095d("AnimPlayer.MediaUtil", "Extractor selected track " + i + " (" + string + "): " + trackFormat);
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m157348f(@NotNull MediaExtractor extractor) {
        extractor.getClass();
        int trackCount = extractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i);
            trackFormat.getClass();
            String string = trackFormat.getString(IMediaFormat.KEY_MIME);
            if (string == null) {
                string = "";
            }
            if (C15493d.m94374J(string, "video/", false, 2, null)) {
                C21726z0.INSTANCE.m218095d("AnimPlayer.MediaUtil", "Extractor selected track " + i + " (" + string + "): " + trackFormat);
                return i;
            }
        }
        return -1;
    }
}
