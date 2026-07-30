package p149l;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zdt0 {

    /* JADX INFO: renamed from: b */
    public static List f202716b;

    /* JADX INFO: renamed from: a */
    public static final Map f202715a = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final Object f202717c = new Object();

    /* JADX INFO: renamed from: a */
    public static List m218204a(String str) {
        ArrayList arrayList;
        Object obj = f202717c;
        synchronized (obj) {
            Map map = f202715a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (f202716b == null) {
                            f202716b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : f202716b) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap map2 = new HashMap();
                                map2.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                map2.put("profileLevels", arrayList2);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                map2.put("bitRatesBps", m218205b(videoCapabilities.getBitrateRange()));
                                map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                map2.put("frameRates", m218205b(videoCapabilities.getSupportedFrameRates()));
                                map2.put("widths", m218205b(videoCapabilities.getSupportedWidths()));
                                map2.put("heights", m218205b(videoCapabilities.getSupportedHeights()));
                                map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                arrayList.add(map2);
                            }
                        }
                        f202715a.put(str, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return arrayList;
            } catch (LinkageError e) {
                e = e;
                HashMap map3 = new HashMap();
                map3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                f202715a.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e2) {
                e = e2;
                HashMap map4 = new HashMap();
                map4.put("error", e.getClass().getSimpleName());
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(map4);
                f202715a.put(str, arrayList4);
                return arrayList4;
            }
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: b */
    public static Integer[] m218205b(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
