package p153l;

import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.p051p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes13.dex */
public class r1j {

    /* JADX INFO: renamed from: a */
    public static td1[] f160832a = new td1[0];

    /* JADX INFO: renamed from: a */
    public static td1[] m179412a(AudioVolumeWeight[] audioVolumeWeightArr) {
        if (audioVolumeWeightArr == null) {
            return f160832a;
        }
        td1[] td1VarArr = new td1[audioVolumeWeightArr.length];
        for (int i = 0; i < audioVolumeWeightArr.length; i++) {
            td1VarArr[i] = new td1(audioVolumeWeightArr[i]);
        }
        return td1VarArr;
    }

    /* JADX INFO: renamed from: b */
    public static MMLiveUserConfig m179413b(cgu cguVar) {
        return new MMLiveUserConfig(cguVar.f81730a, cguVar.f81735f, cguVar.f81731b, cguVar.f81732c, wx0.m208362b(App.f16088e), wx0.m208361a(App.f16088e), false);
    }
}
