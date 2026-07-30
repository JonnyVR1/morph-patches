package p149l;

import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.p046p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes13.dex */
public class wyi {

    /* JADX INFO: renamed from: a */
    public static md1[] f188568a = new md1[0];

    /* JADX INFO: renamed from: a */
    public static md1[] m206101a(AudioVolumeWeight[] audioVolumeWeightArr) {
        if (audioVolumeWeightArr == null) {
            return f188568a;
        }
        md1[] md1VarArr = new md1[audioVolumeWeightArr.length];
        for (int i = 0; i < audioVolumeWeightArr.length; i++) {
            md1VarArr[i] = new md1(audioVolumeWeightArr[i]);
        }
        return md1VarArr;
    }

    /* JADX INFO: renamed from: b */
    public static MMLiveUserConfig m206102b(beu beuVar) {
        return new MMLiveUserConfig(beuVar.f75241a, beuVar.f75246f, beuVar.f75242b, beuVar.f75243c, px0.m171778b(App.f15369e), px0.m171777a(App.f15369e), false);
    }
}
