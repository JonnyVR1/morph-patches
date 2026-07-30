package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class e5r0 implements c6r0 {

    /* JADX INFO: renamed from: d */
    public static final int[] f89457d = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};

    /* JADX INFO: renamed from: e */
    public static final d5r0 f89458e = new d5r0(new c5r0() { // from class: l.a5r0
        @Override // p149l.c5r0
        public final Constructor zza() throws IllegalAccessException, InvocationTargetException {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(j5r0.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });

    /* JADX INFO: renamed from: f */
    public static final d5r0 f89459f = new d5r0(new c5r0() { // from class: l.b5r0
        @Override // p149l.c5r0
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(j5r0.class).getConstructor(null);
        }
    });

    /* JADX INFO: renamed from: b */
    @Nullable
    public zzgaa f89460b;

    /* JADX INFO: renamed from: c */
    public final pfr0 f89461c = new lfr0();

    /* JADX WARN: Code duplicated, block: B:112:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bf A[PHI: r19
      0x01bf: PHI (r19v2 int) = (r19v0 int), (r19v1 int), (r19v1 int) binds: [B:119:0x01bd, B:122:0x01cb, B:125:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.c6r0
    /* JADX INFO: renamed from: a */
    public final synchronized j5r0[] mo95449a(Uri uri, Map map) {
        int i;
        j5r0[] j5r0VarArr;
        try {
            ArrayList arrayList = new ArrayList(20);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            int i2 = 6;
            int i3 = 1;
            if (str != null) {
                String strM196368e = uys0.m196368e(str);
                switch (strM196368e.hashCode()) {
                    case -2123537834:
                        if (strM196368e.equals("audio/eac3-joc")) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1662384011:
                        if (strM196368e.equals("video/mp2p")) {
                            i = 10;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1662384007:
                        if (strM196368e.equals("video/mp2t")) {
                            i = 11;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1662095187:
                        if (strM196368e.equals("video/webm")) {
                            i = 6;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1606874997:
                        if (strM196368e.equals("audio/amr-wb")) {
                            i = 3;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1487464690:
                        if (strM196368e.equals("image/heif")) {
                            i = 20;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1487394660:
                        if (strM196368e.equals(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG)) {
                            i = 14;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1487018032:
                        if (strM196368e.equals("image/webp")) {
                            i = 18;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1248337486:
                        if (strM196368e.equals("application/mp4")) {
                            i = 8;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1079884372:
                        if (strM196368e.equals(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_XMS_AVI)) {
                            i = 16;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1004728940:
                        if (strM196368e.equals("text/vtt")) {
                            i = 13;
                        } else {
                            i = -1;
                        }
                        break;
                    case -879272239:
                        if (strM196368e.equals("image/bmp")) {
                            i = 19;
                        } else {
                            i = -1;
                        }
                        break;
                    case -879258763:
                        if (strM196368e.equals(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG)) {
                            i = 17;
                        } else {
                            i = -1;
                        }
                        break;
                    case -387023398:
                        if (strM196368e.equals("audio/x-matroska")) {
                            i = 6;
                        } else {
                            i = -1;
                        }
                        break;
                    case -43467528:
                        if (strM196368e.equals("application/webm")) {
                            i = 6;
                        } else {
                            i = -1;
                        }
                        break;
                    case 13915911:
                        if (strM196368e.equals("video/x-flv")) {
                            i = 5;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187078296:
                        if (strM196368e.equals("audio/ac3")) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187078297:
                        if (strM196368e.equals("audio/ac4")) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187078669:
                        if (strM196368e.equals("audio/amr")) {
                            i = 3;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187090232:
                        if (strM196368e.equals(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG_4)) {
                            i = 8;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187091926:
                        if (strM196368e.equals("audio/ogg")) {
                            i = 9;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187099443:
                        if (strM196368e.equals("audio/wav")) {
                            i = 12;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1331848029:
                        if (strM196368e.equals(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4)) {
                            i = 8;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1503095341:
                        if (strM196368e.equals(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP)) {
                            i = 3;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1504578661:
                        if (strM196368e.equals("audio/eac3")) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1504619009:
                        if (strM196368e.equals("audio/flac")) {
                            i = 4;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1504824762:
                        if (strM196368e.equals("audio/midi")) {
                            i = 15;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1504831518:
                        if (strM196368e.equals(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG)) {
                            i = 7;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1505118770:
                        if (strM196368e.equals("audio/webm")) {
                            i = 6;
                        } else {
                            i = -1;
                        }
                        break;
                    case 2039520277:
                        if (strM196368e.equals(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MATROSKA)) {
                            i = 6;
                        } else {
                            i = -1;
                        }
                        break;
                    default:
                        i = -1;
                        break;
                }
            } else {
                i = -1;
            }
            if (i != -1) {
                m114892b(i, arrayList);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i2 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i2 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i2 = i3;
            } else {
                i3 = 2;
                if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                    i2 = i3;
                } else if (lastPathSegment.endsWith(".amr")) {
                    i2 = 3;
                } else if (lastPathSegment.endsWith(".flac")) {
                    i2 = 4;
                } else if (lastPathSegment.endsWith(".flv")) {
                    i2 = 5;
                } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                    i2 = 15;
                } else if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                    if (lastPathSegment.endsWith(".mp3")) {
                        i2 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i2 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i2 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i2 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i2 = 11;
                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        i2 = 12;
                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        i2 = 13;
                    } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                        i2 = 14;
                    } else if (lastPathSegment.endsWith(".avi")) {
                        i2 = 16;
                    } else if (lastPathSegment.endsWith(".png")) {
                        i2 = 17;
                    } else if (lastPathSegment.endsWith(".webp")) {
                        i2 = 18;
                    } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                        i2 = 19;
                    } else if (lastPathSegment.endsWith(".heic")) {
                        i2 = 20;
                    } else {
                        i2 = -1;
                    }
                }
            }
            if (i2 != -1 && i2 != i) {
                m114892b(i2, arrayList);
            }
            int[] iArr = f89457d;
            for (int i4 = 0; i4 < 20; i4++) {
                int i5 = iArr[i4];
                if (i5 != i && i5 != i2) {
                    m114892b(i5, arrayList);
                }
            }
            j5r0VarArr = new j5r0[arrayList.size()];
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                j5r0VarArr[i6] = (j5r0) arrayList.get(i6);
            }
        } catch (Throwable th) {
            throw th;
        }
        return j5r0VarArr;
    }

    /* JADX INFO: renamed from: b */
    public final void m114892b(int i, List list) {
        switch (i) {
            case 0:
                list.add(new hir0());
                break;
            case 1:
                list.add(new kir0());
                break;
            case 2:
                list.add(new nir0(0));
                break;
            case 3:
                list.add(new u7r0(0));
                break;
            case 4:
                j5r0 j5r0VarM110069a = f89458e.m110069a(0);
                if (j5r0VarM110069a == null) {
                    list.add(new y8r0(0));
                } else {
                    list.add(j5r0VarM110069a);
                }
                break;
            case 5:
                list.add(new b9r0());
                break;
            case 6:
                list.add(new tbr0(0));
                break;
            case 7:
                list.add(new lcr0(0));
                break;
            case 8:
                list.add(new rdr0(this.f89461c, 32, null, null, zzgaa.zzl(), null));
                list.add(new wdr0(this.f89461c, 16));
                break;
            case 9:
                list.add(new ler0());
                break;
            case 10:
                list.add(new bkr0());
                break;
            case 11:
                if (this.f89460b == null) {
                    this.f89460b = zzgaa.zzl();
                }
                list.add(new wkr0(1, 1, this.f89461c, new hew0(0L), new pir0(0, this.f89460b), 112800));
                break;
            case 12:
                list.add(new ilr0());
                break;
            case 14:
                list.add(new g9r0(0));
                break;
            case 15:
                j5r0 j5r0VarM110069a2 = f89459f.m110069a(new Object[0]);
                if (j5r0VarM110069a2 != null) {
                    list.add(j5r0VarM110069a2);
                }
                break;
            case 16:
                list.add(new z7r0());
                break;
            case 17:
                list.add(new ifr0());
                break;
            case 18:
                list.add(new nlr0());
                break;
            case 19:
                list.add(new g8r0());
                break;
            case 20:
                list.add(new f9r0());
                break;
        }
    }
}
