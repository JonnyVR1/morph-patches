package p153l;

import com.bef.effectsdk.RequirementDefine;
import com.core.glcore.util.DetectDelayStopHelper;
import com.idv.identity.base.algorithm.IdentityFaceState;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class tje {

    /* JADX INFO: renamed from: a */
    public final List<int[]> f174577a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<String> f174578b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m191425a(int[] iArr, String str) {
        this.f174577a.add(iArr);
        this.f174578b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m191426b() {
        if (this.f174577a.isEmpty()) {
            m191425a(new int[]{0, 19}, "US/CA");
            m191425a(new int[]{30, 39}, "US");
            m191425a(new int[]{60, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA}, "US/CA");
            m191425a(new int[]{300, 379}, "FR");
            m191425a(new int[]{380}, "BG");
            m191425a(new int[]{383}, "SI");
            m191425a(new int[]{385}, "HR");
            m191425a(new int[]{387}, "BA");
            m191425a(new int[]{400, 440}, "DE");
            m191425a(new int[]{450, 459}, "JP");
            m191425a(new int[]{460, 469}, "RU");
            m191425a(new int[]{471}, "TW");
            m191425a(new int[]{474}, "EE");
            m191425a(new int[]{475}, "LV");
            m191425a(new int[]{476}, "AZ");
            m191425a(new int[]{477}, "LT");
            m191425a(new int[]{478}, "UZ");
            m191425a(new int[]{479}, "LK");
            m191425a(new int[]{480}, "PH");
            m191425a(new int[]{481}, "BY");
            m191425a(new int[]{482}, "UA");
            m191425a(new int[]{484}, "MD");
            m191425a(new int[]{485}, "AM");
            m191425a(new int[]{486}, "GE");
            m191425a(new int[]{487}, "KZ");
            m191425a(new int[]{489}, "HK");
            m191425a(new int[]{490, 499}, "JP");
            m191425a(new int[]{500, 509}, "GB");
            m191425a(new int[]{520}, "GR");
            m191425a(new int[]{528}, "LB");
            m191425a(new int[]{529}, "CY");
            m191425a(new int[]{531}, "MK");
            m191425a(new int[]{535}, "MT");
            m191425a(new int[]{539}, "IE");
            m191425a(new int[]{540, 549}, "BE/LU");
            m191425a(new int[]{560}, "PT");
            m191425a(new int[]{569}, "IS");
            m191425a(new int[]{570, 579}, "DK");
            m191425a(new int[]{590}, "PL");
            m191425a(new int[]{594}, "RO");
            m191425a(new int[]{599}, "HU");
            m191425a(new int[]{600, IdentityFaceState.FACE_OPEN_MOUTH_DONE}, "ZA");
            m191425a(new int[]{603}, "GH");
            m191425a(new int[]{608}, "BH");
            m191425a(new int[]{609}, "MU");
            m191425a(new int[]{611}, "MA");
            m191425a(new int[]{613}, "DZ");
            m191425a(new int[]{616}, "KE");
            m191425a(new int[]{618}, "CI");
            m191425a(new int[]{619}, "TN");
            m191425a(new int[]{621}, "SY");
            m191425a(new int[]{622}, "EG");
            m191425a(new int[]{624}, "LY");
            m191425a(new int[]{625}, "JO");
            m191425a(new int[]{626}, "IR");
            m191425a(new int[]{627}, "KW");
            m191425a(new int[]{628}, "SA");
            m191425a(new int[]{629}, "AE");
            m191425a(new int[]{640, 649}, "FI");
            m191425a(new int[]{690, 695}, "CN");
            m191425a(new int[]{700, 709}, "NO");
            m191425a(new int[]{729}, "IL");
            m191425a(new int[]{730, 739}, "SE");
            m191425a(new int[]{740}, "GT");
            m191425a(new int[]{741}, "SV");
            m191425a(new int[]{742}, "HN");
            m191425a(new int[]{743}, "NI");
            m191425a(new int[]{744}, "CR");
            m191425a(new int[]{745}, "PA");
            m191425a(new int[]{746}, "DO");
            m191425a(new int[]{DetectDelayStopHelper.TYPE_DETECT_PICKNOISE}, "MX");
            m191425a(new int[]{DetectDelayStopHelper.TYPE_DETECT_AR_GIFT, 755}, "CA");
            m191425a(new int[]{759}, "VE");
            m191425a(new int[]{760, 769}, "CH");
            m191425a(new int[]{770}, "CO");
            m191425a(new int[]{773}, "UY");
            m191425a(new int[]{775}, "PE");
            m191425a(new int[]{777}, "BO");
            m191425a(new int[]{779}, RequirementDefine.REQUIREMENT_AR_TAG);
            m191425a(new int[]{780}, "CL");
            m191425a(new int[]{784}, "PY");
            m191425a(new int[]{785}, "PE");
            m191425a(new int[]{PutongAct.REQUEST_CODE_PICKER}, "EC");
            m191425a(new int[]{ggn.REQUEST_JSCODE_PICKER, 790}, "BR");
            m191425a(new int[]{800, 839}, "IT");
            m191425a(new int[]{840, 849}, "ES");
            m191425a(new int[]{850}, "CU");
            m191425a(new int[]{858}, "SK");
            m191425a(new int[]{859}, "CZ");
            m191425a(new int[]{860}, "YU");
            m191425a(new int[]{865}, "MN");
            m191425a(new int[]{867}, "KP");
            m191425a(new int[]{868, 869}, "TR");
            m191425a(new int[]{870, 879}, "NL");
            m191425a(new int[]{880}, "KR");
            m191425a(new int[]{885}, "TH");
            m191425a(new int[]{888}, "SG");
            m191425a(new int[]{890}, "IN");
            m191425a(new int[]{893}, "VN");
            m191425a(new int[]{896}, BLiveTraceServerLocation.f45309PK);
            m191425a(new int[]{899}, "ID");
            m191425a(new int[]{900, 919}, "AT");
            m191425a(new int[]{930, 939}, "AU");
            m191425a(new int[]{940, 949}, "AZ");
            m191425a(new int[]{955}, "MY");
            m191425a(new int[]{958}, "MO");
        }
    }

    /* JADX INFO: renamed from: c */
    public String m191427c(String str) {
        int[] iArr;
        int i;
        m191426b();
        int i2 = Integer.parseInt(str.substring(0, 3));
        int size = this.f174577a.size();
        for (int i3 = 0; i3 < size && i2 >= (i = (iArr = this.f174577a.get(i3))[0]); i3++) {
            if (iArr.length != 1) {
                i = iArr[1];
            }
            if (i2 <= i) {
                return this.f174578b.get(i3);
            }
        }
        return null;
    }
}
