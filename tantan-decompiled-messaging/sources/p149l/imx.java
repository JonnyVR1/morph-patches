package p149l;

import android.media.AudioDeviceInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes7.dex */
public final class imx {

    /* JADX INFO: renamed from: a */
    private static Random f113975a = new Random();

    /* JADX INFO: renamed from: b */
    private static String f113976b = null;

    /* JADX INFO: renamed from: c */
    private static String f113977c = null;

    /* JADX INFO: renamed from: A */
    private static boolean m137092A(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (char c : str.toCharArray()) {
                if (c <= 31 || c >= 127) {
                    return true;
                }
            }
        }
        return false;
    }

    @RequiresApi(api = 23)
    /* JADX INFO: renamed from: B */
    public static String m137093B(AudioDeviceInfo audioDeviceInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("input:" + audioDeviceInfo.isSource());
        sb.append(",id:(" + audioDeviceInfo.getType() + Constants.SEPARATOR_COMMA + m137113t(audioDeviceInfo.getType()) + ")");
        if (audioDeviceInfo.isSource()) {
            int[] channelCounts = audioDeviceInfo.getChannelCounts();
            int[] encodings = audioDeviceInfo.getEncodings();
            int[] sampleRates = audioDeviceInfo.getSampleRates();
            sb.append(",channel:(");
            for (int i = 0; i < channelCounts.length; i++) {
                if (i != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(channelCounts[i]);
            }
            sb.append("),encode:(");
            for (int i2 = 0; i2 < encodings.length; i2++) {
                if (i2 != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(encodings[i2]);
            }
            sb.append("),srate:(");
            for (int i3 = 0; i3 < sampleRates.length; i3++) {
                if (i3 != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(sampleRates[i3]);
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m137094a(ymx ymxVar, smx smxVar) {
        if (ymxVar == null || smxVar == null) {
            return null;
        }
        smxVar.f165389a = System.currentTimeMillis();
        smxVar.f165390b = ymxVar.f199120u;
        smxVar.f165391c = ymxVar.f199121v;
        smxVar.f165392d = ymxVar.f199116q;
        smxVar.f165393e = ymxVar.m215379a();
        smxVar.f165394f = xxx.m211572F().m211583L();
        smxVar.f165395g = xxx.m211572F().m211579H();
        smxVar.f165396h = ymxVar.f199091Z;
        ymxVar.f199073H = smxVar.f165389a;
        smxVar.f165397i = ymxVar.f199101e0;
        smxVar.f165398j = ymxVar.f199103f0;
        return smxVar.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m137095b(ymx ymxVar, tmx tmxVar) {
        if (ymxVar == null || tmxVar == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        tmxVar.f171187a = jCurrentTimeMillis;
        tmxVar.f171188b = jCurrentTimeMillis - ymxVar.f199073H;
        tmxVar.f171189c = ymxVar.f199120u;
        tmxVar.f171190d = ymxVar.f199121v;
        tmxVar.f171191e = ymxVar.f199116q;
        tmxVar.f171192f = ymxVar.m215379a();
        tmxVar.f171193g = xxx.m211572F().m211583L();
        tmxVar.f171194h = xxx.m211572F().m211579H();
        tmxVar.f171195i = ymxVar.f199101e0;
        tmxVar.f171196j = ymxVar.f199103f0;
        return tmxVar.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m137096c(ymx ymxVar, umx umxVar) {
        if (ymxVar == null || umxVar == null) {
            return null;
        }
        umxVar.f177319a = System.currentTimeMillis();
        umxVar.f177320b = ymxVar.f199095b0;
        umxVar.f177321c = ymxVar.f199097c0;
        umxVar.f177323e = ymxVar.f199121v;
        umxVar.f177322d = ymxVar.f199120u;
        umxVar.f177324f = ymxVar.f199099d0;
        return umxVar.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m137097d(ymx ymxVar, vmx vmxVar) {
        if (ymxVar == null || vmxVar == null) {
            return null;
        }
        vmxVar.f182168a = System.currentTimeMillis();
        vmxVar.f182169b = ymxVar.m215379a();
        vmxVar.f182170c = xxx.m211572F().m211583L();
        vmxVar.f182171d = ymxVar.f199100e;
        vmxVar.f182172e = ymxVar.f199102f;
        vmxVar.f182173f = ymxVar.f199104g;
        vmxVar.f182174g = ymxVar.f199106h;
        vmxVar.f182175h = ymxVar.f199108i;
        vmxVar.f182176i = ymxVar.f199109j;
        vmxVar.f182177j = ymxVar.f199110k;
        vmxVar.f182178k = ymxVar.f199111l;
        vmxVar.f182179l = ymxVar.f199112m;
        vmxVar.f182180m = ymxVar.f199096c;
        vmxVar.f182181n = tze.m191191a(false, "video/hevc") ? 1L : 0L;
        vmxVar.f182182o = ymxVar.f199113n ? 1L : 0L;
        vmxVar.f182183p = st0.m185792g().m185799h();
        vmxVar.f182184q = ymxVar.f199081P;
        vmxVar.f182185r = ymxVar.f199084S;
        vmxVar.f182186s = ymxVar.f199085T;
        vmxVar.f182187t = ymxVar.f199086U;
        vmxVar.f182188u = ymxVar.f199099d0;
        vmxVar.f182189v = ymxVar.f199101e0;
        vmxVar.f182190w = ymxVar.f199103f0;
        vmxVar.f182191x = ymxVar.f199116q;
        vmxVar.f182193z = ymxVar.f199105g0;
        return vmxVar.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m137098e(ymx ymxVar, wmx wmxVar) {
        if (ymxVar == null || wmxVar == null) {
            return null;
        }
        wmxVar.f187172a = System.currentTimeMillis();
        wmxVar.f187173b = ymxVar.f199114o;
        wmxVar.f187174c = System.currentTimeMillis() - ymxVar.f199092a;
        wmxVar.f187175d = ymxVar.m215379a();
        wmxVar.f187176e = ymxVar.f199096c;
        wmxVar.f187177f = ymxVar.f199115p;
        wmxVar.f187178g = xxx.m211572F().m211583L();
        wmxVar.f187179h = ymxVar.f199116q;
        wmxVar.f187180i = ymxVar.f199086U;
        wmxVar.f187181j = ymxVar.f199117r;
        wmxVar.f187182k = ymxVar.f199087V;
        wmxVar.f187183l = ymxVar.f199090Y;
        wmxVar.f187184m = 0;
        wmxVar.f187185n = 0;
        wmxVar.f187186o = ymxVar.f199101e0;
        wmxVar.f187187p = ymxVar.f199103f0;
        wmxVar.f187188q = ymxVar.f199105g0;
        ymxVar.m215380b();
        return wmxVar.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m137099f(ymx ymxVar, xmx xmxVar) {
        if (ymxVar == null || xmxVar == null) {
            return null;
        }
        xmxVar.f193599a = System.currentTimeMillis();
        long j = ymxVar.f199117r;
        xmxVar.f193600b = j - ymxVar.f199066A;
        long j2 = ymxVar.f199118s;
        xmxVar.f193601c = j2 - ymxVar.f199067B;
        long j3 = ymxVar.f199119t;
        xmxVar.f193602d = j3 - ymxVar.f199068C;
        ymxVar.f199066A = j;
        ymxVar.f199067B = j2;
        ymxVar.f199068C = j3;
        xmxVar.f193603e = ymxVar.f199120u;
        xmxVar.f193604f = ymxVar.f199121v;
        long j4 = ymxVar.f199122w;
        xmxVar.f193605g = j4 - ymxVar.f199069D;
        long j5 = ymxVar.f199123x;
        xmxVar.f193606h = j5 - ymxVar.f199070E;
        long j6 = ymxVar.f199124y;
        xmxVar.f193607i = j6 - ymxVar.f199071F;
        long j7 = ymxVar.f199125z;
        xmxVar.f193608j = j7 - ymxVar.f199072G;
        ymxVar.f199069D = j4;
        ymxVar.f199070E = j5;
        ymxVar.f199071F = j6;
        ymxVar.f199072G = j7;
        xmxVar.f193609k = st0.m185792g().m185804m();
        xmxVar.f193610l = st0.m185792g().m185805n();
        xmxVar.f193589D = st0.m185792g().m185797e();
        xmxVar.f193611m = ymxVar.f199075J;
        xmxVar.f193612n = 0L;
        xmxVar.f193613o = 0L;
        xmxVar.f193614p = ymxVar.f199076K;
        xmxVar.f193615q = ymxVar.f199077L;
        xmxVar.f193616r = st0.m185792g().m185793a();
        xmxVar.f193617s = st0.m185792g().m185806o();
        xmxVar.f193618t = st0.m185792g().m185795c();
        xmxVar.f193619u = st0.m185792g().m185796d();
        xmxVar.f193592G = st0.m185792g().m185803l();
        xmxVar.f193620v = ymxVar.f199078M;
        xmxVar.f193621w = ymxVar.f199079N;
        xmxVar.f193622x = ymxVar.f199080O;
        xmxVar.f193623y = ymxVar.f199116q;
        long j8 = ymxVar.f199088W;
        ymxVar.f199088W = 1 + j8;
        xmxVar.f193624z = j8;
        xmxVar.f193586A = xxx.m211572F().m211579H();
        long j9 = ymxVar.f199082Q;
        long j10 = j9 - ymxVar.f199083R;
        if (j10 < 0) {
            j10 = 0;
        }
        xmxVar.f193587B = j10;
        ymxVar.f199083R = j9;
        if (fjx.m121638R().m121693S0()) {
            xmxVar.f193588C = st0.m185792g().m185801j();
            xmxVar.f193590E = st0.m185792g().m185800i();
        }
        ymxVar.f199075J = 0L;
        xmxVar.f193594I = ymxVar.f199101e0;
        xmxVar.f193595J = ymxVar.f199103f0;
        xmxVar.f193596K = st0.m185792g().m185802k();
        xmxVar.f193597L = st0.m185792g().m185798f();
        xmxVar.f193598M = ymxVar.m215379a();
        hjx.m131418a("buffercheckcount", "fillPullWatchV2 object.videoFrameRate " + xmxVar.f193611m);
        return xmxVar.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m137100g(zmx zmxVar, jmx jmxVar) {
        if (zmxVar == null || jmxVar == null) {
            return null;
        }
        jmxVar.f118719a = System.currentTimeMillis();
        jmxVar.f118720b = zmxVar.f203832Z;
        jmxVar.f118721c = zmxVar.f203893u0;
        jmxVar.f118722d = zmxVar.f203895v0;
        jmxVar.f118723e = zmxVar.f203897w0;
        jmxVar.f118724f = zmxVar.f203899x0;
        jmxVar.f118725g = xxx.m211572F().m211583L();
        jmxVar.f118726h = zmxVar.f203852g;
        jmxVar.f118727i = zmxVar.f203898x;
        jmxVar.f118728j = zmxVar.f203789D0;
        jmxVar.f118729k = StringUtil.ALL_INTERFACES;
        jmxVar.f118730l = zmxVar.f203894v;
        jmxVar.f118731m = zmxVar.f203896w;
        jmxVar.f118732n = tze.m191191a(true, "video/hevc") ? 1L : 0L;
        jmxVar.f118733o = zmxVar.f203902z;
        jmxVar.f118734p = zmxVar.f203782A;
        jmxVar.f118735q = st0.m185792g().m185799h();
        jmxVar.f118736r = zmxVar.f203839b1;
        jmxVar.f118737s = zmxVar.f203888s;
        jmxVar.f118738t = zmxVar.f203889s0;
        jmxVar.f118739u = zmxVar.f203891t0;
        zmxVar.m219386a();
        return jmxVar.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m137101h(zmx zmxVar, kmx kmxVar) {
        if (zmxVar == null || kmxVar == null) {
            return null;
        }
        kmxVar.f123831a = System.currentTimeMillis();
        kmxVar.f123832b = zmxVar.f203901y0;
        kmxVar.f123833c = zmxVar.f203784B;
        kmxVar.f123834d = zmxVar.f203832Z;
        kmxVar.f123835e = zmxVar.f203898x;
        kmxVar.f123836f = zmxVar.f203783A0;
        kmxVar.f123837g = zmxVar.f203855h;
        kmxVar.f123838h = xxx.m211572F().m211583L();
        kmxVar.f123839i = zmxVar.f203839b1;
        kmxVar.f123840j = zmxVar.f203888s;
        kmxVar.f123841k = zmxVar.f203891t0;
        int iM211626o = xxx.m211572F().m211626o();
        if (kmxVar.f123832b == 0 && iM211626o != 0) {
            kmxVar.f123832b = iM211626o;
        }
        zmxVar.m219386a();
        return kmxVar.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m137102i(zmx zmxVar, lmx lmxVar) {
        if (zmxVar == null || lmxVar == null) {
            return null;
        }
        lmxVar.f128881a = System.currentTimeMillis();
        long jM211620l = xxx.m211572F().m211620l();
        zmxVar.f203790E = jM211620l;
        long j = zmxVar.f203788D;
        long j2 = j - zmxVar.f203798I;
        long j3 = jM211620l - zmxVar.f203800J;
        long j4 = zmxVar.f203815Q0;
        long j5 = j4 - zmxVar.f203819S0;
        long j6 = zmxVar.f203792F;
        long j7 = j6 - zmxVar.f203802K;
        long j8 = zmxVar.f203794G;
        long j9 = j8 - zmxVar.f203804L;
        long j10 = zmxVar.f203796H;
        long j11 = j10 - zmxVar.f203806M;
        long j12 = zmxVar.f203817R0;
        long j13 = j12 - zmxVar.f203821T0;
        long j14 = zmxVar.f203784B;
        long j15 = j14 - zmxVar.f203786C;
        lmxVar.f128883b = j2 > 0 ? j2 : 0L;
        lmxVar.f128885c = j3 > 0 ? j3 : 0L;
        lmxVar.f128887d = j5 > 0 ? j5 : 0L;
        lmxVar.f128889e = j7 > 0 ? j7 : 0L;
        lmxVar.f128891f = j9 > 0 ? j9 : 0L;
        lmxVar.f128893g = j11 > 0 ? j11 : 0L;
        lmxVar.f128895h = zmxVar.f203809N0;
        lmxVar.f128897i = zmxVar.f203811O0;
        lmxVar.f128899j = zmxVar.f203813P0;
        lmxVar.f128901k = j13 > 0 ? j13 : 0L;
        lmxVar.f128903l = j15 > 0 ? j15 : 0L;
        zmxVar.f203798I = j;
        zmxVar.f203800J = jM211620l;
        zmxVar.f203819S0 = j4;
        zmxVar.f203802K = j6;
        zmxVar.f203804L = j8;
        zmxVar.f203806M = j10;
        zmxVar.f203821T0 = j12;
        zmxVar.f203786C = j14;
        lmxVar.f128905m = zmxVar.f203823U0;
        lmxVar.f128907n = zmxVar.f203825V0;
        lmxVar.f128909o = st0.m185792g().m185804m();
        lmxVar.f128911p = st0.m185792g().m185805n();
        lmxVar.f128930y0 = st0.m185792g().m185797e();
        lmxVar.f128913q = zmxVar.f203827W0;
        lmxVar.f128915r = zmxVar.f203829X0;
        lmxVar.f128917s = zmxVar.f203831Y0;
        lmxVar.f128919t = zmxVar.f203808N;
        lmxVar.f128921u = xxx.m211572F().m211632r();
        lmxVar.f128923v = xxx.m211572F().m211630q();
        lmxVar.f128925w = xxx.m211572F().m211624n();
        lmxVar.f128927x = xxx.m211572F().m211622m();
        lmxVar.f128929y = xxx.m211572F().m211640y();
        lmxVar.f128931z = xxx.m211572F().m211639x();
        lmxVar.f128836A = zmxVar.f203810O;
        lmxVar.f128838B = zmxVar.f203812P;
        lmxVar.f128840C = zmxVar.f203814Q;
        lmxVar.f128842D = zmxVar.f203807M0;
        lmxVar.f128844E = zmxVar.f203894v;
        lmxVar.f128846F = zmxVar.f203896w;
        lmxVar.f128848G = zmxVar.f203858i;
        lmxVar.f128850H = -1L;
        long j16 = zmxVar.f203861j;
        lmxVar.f128852I = j16 - zmxVar.f203870m;
        long j17 = zmxVar.f203864k;
        lmxVar.f128854J = j17 - zmxVar.f203873n;
        long j18 = zmxVar.f203867l;
        lmxVar.f128856K = j18 - zmxVar.f203876o;
        zmxVar.f203870m = j16;
        zmxVar.f203873n = j17;
        zmxVar.f203876o = j18;
        lmxVar.f128858L = zmxVar.f203885r;
        lmxVar.f128862N = st0.m185792g().m185793a();
        lmxVar.f128864O = st0.m185792g().m185806o();
        lmxVar.f128866P = st0.m185792g().m185795c();
        lmxVar.f128868Q = st0.m185792g().m185796d();
        lmxVar.f128841C0 = st0.m185792g().m185803l();
        lmxVar.f128870R = zmxVar.f203888s;
        lmxVar.f128872S = (int) (xxx.m211572F().m211637v() * 100.0f);
        lmxVar.f128874T = (int) (xxx.m211572F().m211635t() * 100.0f);
        lmxVar.f128875U = (int) (xxx.m211572F().m211602c() * 100.0f);
        lmxVar.f128876V = (int) (xxx.m211572F().m211580I() * 100.0f);
        lmxVar.f128878X = zmxVar.f203818S;
        lmxVar.f128879Y = zmxVar.f203820T;
        lmxVar.f128880Z = xxx.m211572F().m211604d();
        lmxVar.f128882a0 = xxx.m211572F().m211628p();
        lmxVar.f128884b0 = xxx.m211572F().m211573A();
        lmxVar.f128886c0 = xxx.m211572F().m211577E();
        lmxVar.f128888d0 = xxx.m211572F().m211582K();
        lmxVar.f128890e0 = zmxVar.f203822U;
        lmxVar.f128892f0 = xxx.m211572F().m211579H();
        long j19 = zmxVar.f203791E0;
        zmxVar.f203791E0 = j19 + 1;
        lmxVar.f128894g0 = j19;
        lmxVar.f128896h0 = zmxVar.f203824V;
        lmxVar.f128898i0 = zmxVar.f203795G0;
        lmxVar.f128900j0 = zmxVar.f203787C0 / 1000;
        lmxVar.f128902k0 = zmxVar.f203793F0 / 1000;
        lmxVar.f128904l0 = (int) (zmxVar.f203797H0 * 100.0f);
        long j20 = zmxVar.f203799I0;
        long j21 = j20 - zmxVar.f203803K0;
        long j22 = zmxVar.f203801J0;
        long j23 = j22 - zmxVar.f203805L0;
        if (j21 <= 0) {
            j21 = 0;
        }
        lmxVar.f128906m0 = j21;
        if (j23 <= 0) {
            j23 = 0;
        }
        lmxVar.f128908n0 = j23;
        zmxVar.f203803K0 = j20;
        zmxVar.f203805L0 = j22;
        lmxVar.f128910o0 = zmxVar.f203833Z0;
        lmxVar.f128912p0 = xxx.m211572F().m211576D() ? 1L : 0L;
        lmxVar.f128914q0 = zmxVar.f203836a1;
        lmxVar.f128916r0 = xxx.m211572F().m211636u();
        lmxVar.f128853I0 = xxx.m211572F().m211634s();
        lmxVar.f128918s0 = xxx.m211572F().m211608f();
        lmxVar.f128920t0 = xxx.m211572F().m211606e();
        lmxVar.f128922u0 = xxx.m211572F().m211610g();
        lmxVar.f128924v0 = xxx.m211572F().m211641z();
        lmxVar.f128859L0 = zmxVar.f203863j1;
        if (fjx.m121638R().m121693S0()) {
            lmxVar.f128926w0 = st0.m185792g().m185801j();
            lmxVar.f128837A0 = st0.m185792g().m185800i();
        }
        lmxVar.f128928x0 = xxx.m211572F().m211581J();
        xxx.m211572F().m211591T();
        if (lmxVar.f128903l == 0) {
            zmxVar.f203854g1++;
        }
        long j24 = zmxVar.f203838b0 - zmxVar.f203841c0;
        lmxVar.f128849G0 = j24 > 0 ? j24 * ((long) (fjx.m121638R().m121732e() == 0 ? 23 : 46)) : 0L;
        zmxVar.f203841c0 = zmxVar.f203838b0;
        long j25 = zmxVar.f203844d0;
        long j26 = j25 - zmxVar.f203847e0;
        if (j26 <= 0) {
            j26 = 0;
        }
        lmxVar.f128851H0 = j26;
        zmxVar.f203847e0 = j25;
        lmxVar.f128863N0 = zmxVar.f203869l1;
        lmxVar.f128865O0 = zmxVar.f203872m1;
        lmxVar.f128867P0 = zmxVar.f203875n1;
        lmxVar.f128857K0 = zmxVar.f203860i1;
        lmxVar.f128869Q0 = st0.m185792g().m185802k();
        lmxVar.f128871R0 = st0.m185792g().m185798f();
        lmxVar.f128873S0 = zmxVar.f203832Z;
        return lmxVar.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m137103j(zmx zmxVar, mmx mmxVar) {
        if (zmxVar == null || mmxVar == null) {
            return null;
        }
        mmxVar.f134711a = System.currentTimeMillis();
        mmxVar.f134714d = xxx.m211572F().m211583L();
        mmxVar.f134712b = zmxVar.f203846e;
        mmxVar.f134713c = zmxVar.f203849f;
        mmxVar.f134716f = zmxVar.f203826W;
        mmxVar.f134717g = zmxVar.f203828X;
        mmxVar.f134715e = zmxVar.f203832Z;
        mmxVar.f134718h = zmxVar.f203839b1;
        mmxVar.f134719i = zmxVar.f203900y;
        mmxVar.f134721k = zmxVar.f203877o0;
        mmxVar.f134720j = zmxVar.f203880p0;
        xxx.m211572F().m211591T();
        return mmxVar.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m137104k(zmx zmxVar, nmx nmxVar) {
        if (zmxVar == null || nmxVar == null) {
            return null;
        }
        nmxVar.f139670a = System.currentTimeMillis();
        nmxVar.f139671b = zmxVar.f203901y0;
        nmxVar.f139675f = xxx.m211572F().m211583L();
        nmxVar.f139672c = zmxVar.f203861j;
        nmxVar.f139674e = zmxVar.f203855h;
        nmxVar.f139676g = zmxVar.f203826W;
        nmxVar.f139677h = zmxVar.f203828X;
        nmxVar.f139673d = zmxVar.f203832Z;
        nmxVar.f139678i = zmxVar.f203839b1;
        nmxVar.f139679j = zmxVar.f203850f0;
        nmxVar.f139680k = zmxVar.f203900y;
        nmxVar.f139681l = zmxVar.f203856h0;
        nmxVar.f139682m = zmxVar.f203862j0;
        nmxVar.f139683n = zmxVar.f203865k0;
        zmxVar.m219386a();
        return nmxVar.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m137105l(zmx zmxVar, omx omxVar) {
        if (zmxVar == null || omxVar == null) {
            return null;
        }
        omxVar.f144703a = System.currentTimeMillis();
        omxVar.f144711i = st0.m185792g().m185804m();
        omxVar.f144712j = st0.m185792g().m185805n();
        omxVar.f144713k = st0.m185792g().m185793a();
        omxVar.f144714l = st0.m185792g().m185806o();
        omxVar.f144722t = st0.m185792g().m185797e();
        omxVar.f144704b = zmxVar.f203858i;
        long j = zmxVar.f203867l - zmxVar.f203876o;
        long j2 = zmxVar.f203864k - zmxVar.f203873n;
        if (j <= 0) {
            j = 0;
        }
        omxVar.f144707e = j;
        if (j2 <= 0) {
            j2 = 0;
        }
        omxVar.f144706d = j2;
        omxVar.f144705c = j2 + j;
        omxVar.f144708f = zmxVar.f203879p;
        omxVar.f144709g = zmxVar.f203882q;
        omxVar.f144727y = zmxVar.f203850f0;
        omxVar.f144710h = zmxVar.f203885r;
        omxVar.f144728z = zmxVar.f203856h0;
        omxVar.f144715m = zmxVar.f203888s;
        omxVar.f144716n = zmxVar.f203826W;
        omxVar.f144717o = zmxVar.f203828X;
        if (fjx.m121638R().m121693S0()) {
            omxVar.f144718p = st0.m185792g().m185801j();
            omxVar.f144723u = st0.m185792g().m185800i();
        }
        omxVar.f144719q = st0.m185792g().m185795c();
        omxVar.f144720r = st0.m185792g().m185796d();
        omxVar.f144725w = st0.m185792g().m185803l();
        long j3 = zmxVar.f203791E0;
        zmxVar.f203791E0 = 1 + j3;
        omxVar.f144721s = j3;
        zmxVar.f203873n = zmxVar.f203864k;
        zmxVar.f203876o = zmxVar.f203867l;
        zmxVar.f203882q = 0L;
        omxVar.f144700A = zmxVar.f203874n0;
        omxVar.f144701B = st0.m185792g().m185802k();
        omxVar.f144702C = st0.m185792g().m185798f();
        return omxVar.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m137106m(zmx zmxVar, pmx pmxVar) {
        if (zmxVar == null || pmxVar == null) {
            return null;
        }
        pmxVar.f150293a = System.currentTimeMillis();
        pmxVar.f150295c = xxx.m211572F().m211583L();
        pmxVar.f150294b = zmxVar.f203846e;
        pmxVar.f150296d = zmxVar.f203852g;
        pmxVar.f150298f = zmxVar.f203894v;
        pmxVar.f150299g = zmxVar.f203896w;
        pmxVar.f150300h = zmxVar.f203898x;
        pmxVar.f150301i = zmxVar.f203902z;
        pmxVar.f150302j = zmxVar.f203782A;
        pmxVar.f150303k = zmxVar.f203826W;
        pmxVar.f150304l = zmxVar.f203828X;
        pmxVar.f150297e = zmxVar.f203832Z;
        pmxVar.f150305m = zmxVar.f203839b1;
        pmxVar.f150306n = zmxVar.f203845d1;
        pmxVar.f150307o = zmxVar.f203888s;
        pmxVar.f150308p = zmxVar.f203851f1;
        pmxVar.f150310r = zmxVar.f203857h1;
        pmxVar.f150311s = zmxVar.f203866k1;
        pmxVar.f150313u = zmxVar.f203877o0;
        pmxVar.f150312t = zmxVar.f203880p0;
        xxx.m211572F().m211591T();
        return pmxVar.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m137107n(zmx zmxVar, qmx qmxVar) {
        if (zmxVar == null || qmxVar == null) {
            return null;
        }
        qmxVar.f155349a = System.currentTimeMillis();
        qmxVar.f155350b = zmxVar.f203901y0;
        qmxVar.f155355g = xxx.m211572F().m211583L();
        qmxVar.f155351c = zmxVar.f203784B;
        qmxVar.f155353e = zmxVar.f203898x;
        qmxVar.f155354f = zmxVar.f203855h;
        qmxVar.f155356h = zmxVar.f203826W;
        qmxVar.f155357i = zmxVar.f203828X;
        qmxVar.f155352d = zmxVar.f203832Z;
        qmxVar.f155358j = zmxVar.f203839b1;
        qmxVar.f155359k = zmxVar.f203845d1;
        qmxVar.f155360l = zmxVar.f203888s;
        qmxVar.f155361m = zmxVar.f203857h1;
        qmxVar.f155362n = zmxVar.f203866k1;
        qmxVar.f155364p = zmxVar.f203865k0;
        qmxVar.f155363o = zmxVar.f203862j0;
        int iM211626o = xxx.m211572F().m211626o();
        if (qmxVar.f155350b == 0 && iM211626o != 0) {
            qmxVar.f155350b = iM211626o;
        }
        zmxVar.m219386a();
        return qmxVar.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m137108o(zmx zmxVar, rmx rmxVar) {
        if (zmxVar == null || rmxVar == null) {
            return null;
        }
        rmxVar.f160169a = System.currentTimeMillis();
        long jM211620l = xxx.m211572F().m211620l();
        zmxVar.f203790E = jM211620l;
        long j = zmxVar.f203788D;
        long j2 = j - zmxVar.f203798I;
        long j3 = jM211620l - zmxVar.f203800J;
        long j4 = zmxVar.f203792F;
        long j5 = j4 - zmxVar.f203802K;
        long j6 = zmxVar.f203794G;
        long j7 = j6 - zmxVar.f203804L;
        long j8 = zmxVar.f203796H;
        long j9 = j8 - zmxVar.f203806M;
        long j10 = zmxVar.f203784B;
        long j11 = j10 - zmxVar.f203786C;
        long j12 = 0;
        if (j2 > 0) {
            j12 = j2;
        }
        rmxVar.f160171b = j12;
        rmxVar.f160173c = j3 > j12 ? j3 : j12;
        rmxVar.f160175d = j5 > j12 ? j5 : j12;
        rmxVar.f160177e = j7 > j12 ? j7 : j12;
        rmxVar.f160179f = j9 > j12 ? j9 : j12;
        rmxVar.f160181g = j11 > j12 ? j11 : j12;
        zmxVar.f203798I = j;
        zmxVar.f203800J = jM211620l;
        zmxVar.f203802K = j4;
        zmxVar.f203804L = j6;
        zmxVar.f203806M = j8;
        zmxVar.f203786C = j10;
        rmxVar.f160187j = zmxVar.f203808N;
        rmxVar.f160201q = zmxVar.f203810O;
        rmxVar.f160203r = zmxVar.f203812P;
        rmxVar.f160205s = zmxVar.f203814Q;
        rmxVar.f160207t = zmxVar.f203894v;
        rmxVar.f160209u = zmxVar.f203896w;
        rmxVar.f160211v = zmxVar.f203858i;
        long j13 = zmxVar.f203864k;
        long j14 = j13 - zmxVar.f203873n;
        long j15 = zmxVar.f203867l;
        long j16 = j15 - zmxVar.f203876o;
        if (j14 <= j12) {
            j14 = j12;
        }
        rmxVar.f160215x = j14;
        if (j16 <= j12) {
            j16 = j12;
        }
        rmxVar.f160217y = j16;
        rmxVar.f160213w = j14 + j16;
        zmxVar.f203873n = j13;
        zmxVar.f203876o = j15;
        rmxVar.f160219z = zmxVar.f203879p;
        rmxVar.f160128A = zmxVar.f203885r;
        rmxVar.f160130B = zmxVar.f203816R;
        rmxVar.f160183h = st0.m185792g().m185804m();
        rmxVar.f160185i = st0.m185792g().m185805n();
        rmxVar.f160132C = st0.m185792g().m185793a();
        rmxVar.f160134D = st0.m185792g().m185806o();
        rmxVar.f160198o0 = st0.m185792g().m185797e();
        rmxVar.f160136E = st0.m185792g().m185795c();
        rmxVar.f160138F = st0.m185792g().m185796d();
        rmxVar.f160206s0 = st0.m185792g().m185803l();
        rmxVar.f160140G = zmxVar.f203888s;
        rmxVar.f160142H = (long) xxx.m211572F().m211637v();
        rmxVar.f160144I = (long) xxx.m211572F().m211635t();
        rmxVar.f160146J = (long) xxx.m211572F().m211602c();
        rmxVar.f160148K = (long) xxx.m211572F().m211580I();
        rmxVar.f160150L = xxx.m211572F().m211612h();
        rmxVar.f160152M = zmxVar.f203818S;
        rmxVar.f160154N = zmxVar.f203820T;
        rmxVar.f160156O = xxx.m211572F().m211604d();
        rmxVar.f160158P = xxx.m211572F().m211573A();
        rmxVar.f160159Q = xxx.m211572F().m211577E();
        rmxVar.f160160R = xxx.m211572F().m211582K();
        rmxVar.f160161S = zmxVar.f203822U;
        rmxVar.f160162T = zmxVar.f203824V;
        rmxVar.f160163U = zmxVar.f203826W;
        rmxVar.f160164V = zmxVar.f203828X;
        rmxVar.f160165W = xxx.m211572F().m211579H();
        long j17 = zmxVar.f203791E0;
        zmxVar.f203791E0 = j17 + 1;
        rmxVar.f160166X = j17;
        rmxVar.f160189k = xxx.m211572F().m211632r();
        rmxVar.f160191l = xxx.m211572F().m211630q();
        rmxVar.f160197o = xxx.m211572F().m211640y();
        rmxVar.f160199p = xxx.m211572F().m211639x();
        rmxVar.f160167Y = zmxVar.f203787C0 / 1000;
        rmxVar.f160168Z = zmxVar.f203793F0 / 1000;
        rmxVar.f160170a0 = (int) (zmxVar.f203797H0 * 100.0f);
        long j18 = zmxVar.f203799I0;
        long j19 = j18 - zmxVar.f203803K0;
        long j20 = zmxVar.f203801J0;
        long j21 = j20 - zmxVar.f203805L0;
        if (j19 <= j12) {
            j19 = j12;
        }
        rmxVar.f160172b0 = j19;
        if (j21 <= j12) {
            j21 = j12;
        }
        rmxVar.f160174c0 = j21;
        zmxVar.f203803K0 = j18;
        zmxVar.f203805L0 = j20;
        rmxVar.f160176d0 = zmxVar.f203833Z0;
        rmxVar.f160178e0 = xxx.m211572F().m211576D() ? 1L : j12;
        rmxVar.f160180f0 = zmxVar.f203836a1;
        rmxVar.f160182g0 = xxx.m211572F().m211636u();
        rmxVar.f160212v0 = xxx.m211572F().m211634s();
        rmxVar.f160184h0 = xxx.m211572F().m211608f();
        rmxVar.f160186i0 = xxx.m211572F().m211606e();
        rmxVar.f160188j0 = xxx.m211572F().m211610g();
        rmxVar.f160190k0 = xxx.m211572F().m211641z();
        rmxVar.f160216x0 = zmxVar.f203852g;
        if (fjx.m121638R().m121693S0()) {
            rmxVar.f160192l0 = st0.m185792g().m185801j();
            rmxVar.f160202q0 = st0.m185792g().m185800i();
        }
        rmxVar.f160194m0 = zmxVar.f203845d1;
        rmxVar.f160196n0 = xxx.m211572F().m211581J();
        rmxVar.f160218y0 = zmxVar.f203857h1;
        rmxVar.f160220z0 = zmxVar.f203866k1;
        rmxVar.f160129A0 = zmxVar.f203869l1;
        rmxVar.f160131B0 = zmxVar.f203872m1;
        rmxVar.f160133C0 = zmxVar.f203875n1;
        rmxVar.f160139F0 = zmxVar.f203878o1;
        long j22 = rmxVar.f160181g;
        if (j22 == j12) {
            zmxVar.f203854g1++;
        } else if (j22 > j12) {
            zmxVar.f203854g1 = 0L;
        }
        rmxVar.f160137E0 = (int) zmxVar.f203871m0;
        rmxVar.f160135D0 = (int) zmxVar.f203868l0;
        rmxVar.f160141G0 = zmxVar.f203862j0;
        rmxVar.f160143H0 = zmxVar.f203883q0;
        rmxVar.f160145I0 = zmxVar.f203886r0;
        rmxVar.f160149K0 = zmxVar.f203881p1;
        rmxVar.f160151L0 = m137118y(zmxVar.f203884q1);
        rmxVar.f160153M0 = m137117x(zmxVar.f203887r1);
        xxx.m211572F().m211591T();
        rmxVar.f160155N0 = st0.m185792g().m185802k();
        rmxVar.f160157O0 = st0.m185792g().m185798f();
        return rmxVar.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m137109p() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        Process processExec;
        System.currentTimeMillis();
        try {
            processExec = Runtime.getRuntime().exec("getprop net.dns1");
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                try {
                    String line = bufferedReader.readLine();
                    System.currentTimeMillis();
                    try {
                        bufferedReader.close();
                    } catch (IOException | NullPointerException unused) {
                    }
                    processExec.destroy();
                    return line;
                } catch (IOException unused2) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException | NullPointerException unused3) {
                        }
                    }
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException | NullPointerException unused4) {
                        }
                    }
                    if (processExec == null) {
                        throw th;
                    }
                    processExec.destroy();
                    throw th;
                }
            } catch (IOException unused5) {
                bufferedReader = null;
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        } catch (IOException unused6) {
            processExec = null;
            bufferedReader = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            processExec = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m137110q() {
        if (!TextUtils.isEmpty(f113976b)) {
            return f113976b;
        }
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            str = "unknow manufacturer";
        }
        return m137092A(str) ? m137114u(str) : str;
    }

    /* JADX INFO: renamed from: r */
    public static String m137111r() {
        if (!TextUtils.isEmpty(f113977c)) {
            return f113977c;
        }
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return m137092A(str) ? m137114u(str) : str;
    }

    /* JADX INFO: renamed from: s */
    public static long m137112s() {
        return f113975a.nextInt(LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
    }

    /* JADX INFO: renamed from: t */
    private static String m137113t(int i) {
        switch (i) {
            case 0:
                return "UNKNOWN";
            case 1:
                return "BUILTIN_EARPIECE";
            case 2:
                return "BUILTIN_SPEAKER";
            case 3:
                return "WIRED_HEADSET";
            case 4:
                return "WIRED_HEADPHONES";
            case 5:
                return "LINE_ANALOG";
            case 6:
                return "LINE_DIGITAL";
            case 7:
                return "BLUETOOTH_SCO";
            case 8:
                return "BLUETOOTH_A2DP";
            case 9:
                return "HDMI";
            case 10:
                return "HDMI_ARC";
            case 11:
                return "USB_DEVICE";
            case 12:
                return "USB_ACCESSORY";
            case 13:
                return "DOCK";
            case 14:
                return "FM";
            case 15:
                return "BUILTIN_MIC";
            case 16:
                return "FM_TUNER";
            case 17:
                return "TV_TUNER";
            case 18:
                return "TELEPHONY";
            case 19:
                return "AUX_LINE";
            case 20:
                return "IP";
            case 21:
                return "BUS";
            case 22:
                return "USB_HEADSET";
            case 23:
                return "HEARING_AID";
            default:
                return "NULL";
        }
    }

    /* JADX INFO: renamed from: u */
    private static String m137114u(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "tantan";
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m137115v() {
        try {
            Class.forName("com.google.android.maps.MapActivity");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m137116w(Object... objArr) {
        StringBuilder sb = new StringBuilder("{");
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(objArr[i]);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    private static String m137117x(Map<String, uza0> map) {
        StringBuilder sb = new StringBuilder("[");
        if (map != null) {
            for (uza0 uza0Var : map.values()) {
                sb.append("(");
                sb.append(uza0Var.toString());
                sb.append(")");
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    private static String m137118y(ArrayList<feb0> arrayList) {
        StringBuilder sb = new StringBuilder("[");
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append("(");
                sb.append(arrayList.get(i).toString());
                sb.append(")");
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    public static String m137119z(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return str;
        }
    }
}
