package p149l;

import com.bef.effectsdk.RequirementDefine;
import com.core.glcore.util.DetectDelayStopHelper;
import com.idv.identity.base.algorithm.IdentityFaceState;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class pie {

    /* JADX INFO: renamed from: a */
    public final List<int[]> f149545a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<String> f149546b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m169596a(int[] iArr, String str) {
        this.f149545a.add(iArr);
        this.f149546b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m169597b() {
        if (this.f149545a.isEmpty()) {
            m169596a(new int[]{0, 19}, "US/CA");
            m169596a(new int[]{30, 39}, "US");
            m169596a(new int[]{60, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA}, "US/CA");
            m169596a(new int[]{300, 379}, "FR");
            m169596a(new int[]{380}, "BG");
            m169596a(new int[]{383}, "SI");
            m169596a(new int[]{385}, "HR");
            m169596a(new int[]{387}, "BA");
            m169596a(new int[]{400, 440}, "DE");
            m169596a(new int[]{450, 459}, "JP");
            m169596a(new int[]{460, 469}, "RU");
            m169596a(new int[]{471}, "TW");
            m169596a(new int[]{474}, "EE");
            m169596a(new int[]{475}, "LV");
            m169596a(new int[]{476}, "AZ");
            m169596a(new int[]{477}, "LT");
            m169596a(new int[]{478}, "UZ");
            m169596a(new int[]{479}, "LK");
            m169596a(new int[]{480}, "PH");
            m169596a(new int[]{481}, "BY");
            m169596a(new int[]{482}, "UA");
            m169596a(new int[]{484}, "MD");
            m169596a(new int[]{485}, "AM");
            m169596a(new int[]{486}, "GE");
            m169596a(new int[]{487}, "KZ");
            m169596a(new int[]{489}, "HK");
            m169596a(new int[]{490, 499}, "JP");
            m169596a(new int[]{500, 509}, "GB");
            m169596a(new int[]{520}, "GR");
            m169596a(new int[]{528}, "LB");
            m169596a(new int[]{529}, "CY");
            m169596a(new int[]{531}, "MK");
            m169596a(new int[]{535}, "MT");
            m169596a(new int[]{539}, "IE");
            m169596a(new int[]{540, 549}, "BE/LU");
            m169596a(new int[]{560}, "PT");
            m169596a(new int[]{569}, "IS");
            m169596a(new int[]{570, 579}, "DK");
            m169596a(new int[]{590}, "PL");
            m169596a(new int[]{594}, "RO");
            m169596a(new int[]{599}, "HU");
            m169596a(new int[]{600, IdentityFaceState.FACE_OPEN_MOUTH_DONE}, "ZA");
            m169596a(new int[]{603}, "GH");
            m169596a(new int[]{608}, "BH");
            m169596a(new int[]{609}, "MU");
            m169596a(new int[]{611}, "MA");
            m169596a(new int[]{613}, "DZ");
            m169596a(new int[]{616}, "KE");
            m169596a(new int[]{618}, "CI");
            m169596a(new int[]{619}, "TN");
            m169596a(new int[]{621}, "SY");
            m169596a(new int[]{622}, "EG");
            m169596a(new int[]{624}, "LY");
            m169596a(new int[]{625}, "JO");
            m169596a(new int[]{626}, "IR");
            m169596a(new int[]{627}, "KW");
            m169596a(new int[]{628}, "SA");
            m169596a(new int[]{629}, "AE");
            m169596a(new int[]{640, 649}, "FI");
            m169596a(new int[]{690, 695}, "CN");
            m169596a(new int[]{700, 709}, "NO");
            m169596a(new int[]{729}, "IL");
            m169596a(new int[]{730, 739}, "SE");
            m169596a(new int[]{740}, "GT");
            m169596a(new int[]{741}, "SV");
            m169596a(new int[]{742}, "HN");
            m169596a(new int[]{743}, "NI");
            m169596a(new int[]{744}, "CR");
            m169596a(new int[]{745}, "PA");
            m169596a(new int[]{746}, "DO");
            m169596a(new int[]{DetectDelayStopHelper.TYPE_DETECT_PICKNOISE}, "MX");
            m169596a(new int[]{DetectDelayStopHelper.TYPE_DETECT_AR_GIFT, 755}, "CA");
            m169596a(new int[]{759}, "VE");
            m169596a(new int[]{760, 769}, "CH");
            m169596a(new int[]{770}, "CO");
            m169596a(new int[]{773}, "UY");
            m169596a(new int[]{775}, "PE");
            m169596a(new int[]{777}, "BO");
            m169596a(new int[]{779}, RequirementDefine.REQUIREMENT_AR_TAG);
            m169596a(new int[]{780}, "CL");
            m169596a(new int[]{784}, "PY");
            m169596a(new int[]{785}, "PE");
            m169596a(new int[]{PutongAct.REQUEST_CODE_PICKER}, "EC");
            m169596a(new int[]{gen.REQUEST_JSCODE_PICKER, 790}, "BR");
            m169596a(new int[]{800, 839}, "IT");
            m169596a(new int[]{840, 849}, "ES");
            m169596a(new int[]{850}, "CU");
            m169596a(new int[]{858}, "SK");
            m169596a(new int[]{859}, "CZ");
            m169596a(new int[]{860}, "YU");
            m169596a(new int[]{865}, "MN");
            m169596a(new int[]{867}, "KP");
            m169596a(new int[]{868, 869}, "TR");
            m169596a(new int[]{870, 879}, "NL");
            m169596a(new int[]{880}, "KR");
            m169596a(new int[]{885}, "TH");
            m169596a(new int[]{888}, "SG");
            m169596a(new int[]{890}, "IN");
            m169596a(new int[]{893}, "VN");
            m169596a(new int[]{896}, BLiveTraceServerLocation.f44461PK);
            m169596a(new int[]{899}, "ID");
            m169596a(new int[]{900, 919}, "AT");
            m169596a(new int[]{930, 939}, "AU");
            m169596a(new int[]{940, 949}, "AZ");
            m169596a(new int[]{955}, "MY");
            m169596a(new int[]{958}, "MO");
        }
    }

    /* JADX INFO: renamed from: c */
    public String m169598c(String str) {
        int[] iArr;
        int i;
        m169597b();
        int i2 = Integer.parseInt(str.substring(0, 3));
        int size = this.f149545a.size();
        for (int i3 = 0; i3 < size && i2 >= (i = (iArr = this.f149545a.get(i3))[0]); i3++) {
            if (iArr.length != 1) {
                i = iArr[1];
            }
            if (i2 <= i) {
                return this.f149546b.get(i3);
            }
        }
        return null;
    }
}
