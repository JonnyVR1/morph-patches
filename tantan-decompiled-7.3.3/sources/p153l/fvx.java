package p153l;

import android.media.AudioDeviceInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
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
public final class fvx {

    /* JADX INFO: renamed from: a */
    private static Random f101104a = new Random();

    /* JADX INFO: renamed from: b */
    private static String f101105b = null;

    /* JADX INFO: renamed from: c */
    private static String f101106c = null;

    /* JADX INFO: renamed from: A */
    private static boolean m127713A(String str) {
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
    public static String m127714B(AudioDeviceInfo audioDeviceInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("input:" + audioDeviceInfo.isSource());
        sb.append(",id:(" + audioDeviceInfo.getType() + Constants.SEPARATOR_COMMA + m127734t(audioDeviceInfo.getType()) + ")");
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
    public static String m127715a(vvx vvxVar, pvx pvxVar) {
        if (vvxVar == null || pvxVar == null) {
            return null;
        }
        pvxVar.f154337a = System.currentTimeMillis();
        pvxVar.f154338b = vvxVar.f186045u;
        pvxVar.f154339c = vvxVar.f186046v;
        pvxVar.f154340d = vvxVar.f186041q;
        pvxVar.f154341e = vvxVar.m203038a();
        pvxVar.f154342f = u6y.m194722F().m194733L();
        pvxVar.f154343g = u6y.m194722F().m194729H();
        pvxVar.f154344h = vvxVar.f186016Z;
        vvxVar.f185998H = pvxVar.f154337a;
        pvxVar.f154345i = vvxVar.f186026e0;
        pvxVar.f154346j = vvxVar.f186028f0;
        return pvxVar.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m127716b(vvx vvxVar, qvx qvxVar) {
        if (vvxVar == null || qvxVar == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        qvxVar.f159832a = jCurrentTimeMillis;
        qvxVar.f159833b = jCurrentTimeMillis - vvxVar.f185998H;
        qvxVar.f159834c = vvxVar.f186045u;
        qvxVar.f159835d = vvxVar.f186046v;
        qvxVar.f159836e = vvxVar.f186041q;
        qvxVar.f159837f = vvxVar.m203038a();
        qvxVar.f159838g = u6y.m194722F().m194733L();
        qvxVar.f159839h = u6y.m194722F().m194729H();
        qvxVar.f159840i = vvxVar.f186026e0;
        qvxVar.f159841j = vvxVar.f186028f0;
        return qvxVar.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m127717c(vvx vvxVar, rvx rvxVar) {
        if (vvxVar == null || rvxVar == null) {
            return null;
        }
        rvxVar.f165068a = System.currentTimeMillis();
        rvxVar.f165069b = vvxVar.f186020b0;
        rvxVar.f165070c = vvxVar.f186022c0;
        rvxVar.f165072e = vvxVar.f186046v;
        rvxVar.f165071d = vvxVar.f186045u;
        rvxVar.f165073f = vvxVar.f186024d0;
        return rvxVar.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m127718d(vvx vvxVar, svx svxVar) {
        if (vvxVar == null || svxVar == null) {
            return null;
        }
        svxVar.f170878a = System.currentTimeMillis();
        svxVar.f170879b = vvxVar.m203038a();
        svxVar.f170880c = u6y.m194722F().m194733L();
        svxVar.f170881d = vvxVar.f186025e;
        svxVar.f170882e = vvxVar.f186027f;
        svxVar.f170883f = vvxVar.f186029g;
        svxVar.f170884g = vvxVar.f186031h;
        svxVar.f170885h = vvxVar.f186033i;
        svxVar.f170886i = vvxVar.f186034j;
        svxVar.f170887j = vvxVar.f186035k;
        svxVar.f170888k = vvxVar.f186036l;
        svxVar.f170889l = vvxVar.f186037m;
        svxVar.f170890m = vvxVar.f186021c;
        svxVar.f170891n = x0f.m208824a(false, "video/hevc") ? 1L : 0L;
        svxVar.f170892o = vvxVar.f186038n ? 1L : 0L;
        svxVar.f170893p = yt0.m217280g().m217287h();
        svxVar.f170894q = vvxVar.f186006P;
        svxVar.f170895r = vvxVar.f186009S;
        svxVar.f170896s = vvxVar.f186010T;
        svxVar.f170897t = vvxVar.f186011U;
        svxVar.f170898u = vvxVar.f186024d0;
        svxVar.f170899v = vvxVar.f186026e0;
        svxVar.f170900w = vvxVar.f186028f0;
        svxVar.f170901x = vvxVar.f186041q;
        svxVar.f170903z = vvxVar.f186030g0;
        return svxVar.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m127719e(vvx vvxVar, tvx tvxVar) {
        if (vvxVar == null || tvxVar == null) {
            return null;
        }
        tvxVar.f176307a = System.currentTimeMillis();
        tvxVar.f176308b = vvxVar.f186039o;
        tvxVar.f176309c = System.currentTimeMillis() - vvxVar.f186017a;
        tvxVar.f176310d = vvxVar.m203038a();
        tvxVar.f176311e = vvxVar.f186021c;
        tvxVar.f176312f = vvxVar.f186040p;
        tvxVar.f176313g = u6y.m194722F().m194733L();
        tvxVar.f176314h = vvxVar.f186041q;
        tvxVar.f176315i = vvxVar.f186011U;
        tvxVar.f176316j = vvxVar.f186042r;
        tvxVar.f176317k = vvxVar.f186012V;
        tvxVar.f176318l = vvxVar.f186015Y;
        tvxVar.f176319m = 0;
        tvxVar.f176320n = 0;
        tvxVar.f176321o = vvxVar.f186026e0;
        tvxVar.f176322p = vvxVar.f186028f0;
        tvxVar.f176323q = vvxVar.f186030g0;
        vvxVar.m203039b();
        return tvxVar.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m127720f(vvx vvxVar, uvx uvxVar) {
        if (vvxVar == null || uvxVar == null) {
            return null;
        }
        uvxVar.f181192a = System.currentTimeMillis();
        long j = vvxVar.f186042r;
        uvxVar.f181193b = j - vvxVar.f185991A;
        long j2 = vvxVar.f186043s;
        uvxVar.f181194c = j2 - vvxVar.f185992B;
        long j3 = vvxVar.f186044t;
        uvxVar.f181195d = j3 - vvxVar.f185993C;
        vvxVar.f185991A = j;
        vvxVar.f185992B = j2;
        vvxVar.f185993C = j3;
        uvxVar.f181196e = vvxVar.f186045u;
        uvxVar.f181197f = vvxVar.f186046v;
        long j4 = vvxVar.f186047w;
        uvxVar.f181198g = j4 - vvxVar.f185994D;
        long j5 = vvxVar.f186048x;
        uvxVar.f181199h = j5 - vvxVar.f185995E;
        long j6 = vvxVar.f186049y;
        uvxVar.f181200i = j6 - vvxVar.f185996F;
        long j7 = vvxVar.f186050z;
        uvxVar.f181201j = j7 - vvxVar.f185997G;
        vvxVar.f185994D = j4;
        vvxVar.f185995E = j5;
        vvxVar.f185996F = j6;
        vvxVar.f185997G = j7;
        uvxVar.f181202k = yt0.m217280g().m217292m();
        uvxVar.f181203l = yt0.m217280g().m217293n();
        uvxVar.f181182D = yt0.m217280g().m217285e();
        uvxVar.f181204m = vvxVar.f186000J;
        uvxVar.f181205n = 0L;
        uvxVar.f181206o = 0L;
        uvxVar.f181207p = vvxVar.f186001K;
        uvxVar.f181208q = vvxVar.f186002L;
        uvxVar.f181209r = yt0.m217280g().m217281a();
        uvxVar.f181210s = yt0.m217280g().m217294o();
        uvxVar.f181211t = yt0.m217280g().m217283c();
        uvxVar.f181212u = yt0.m217280g().m217284d();
        uvxVar.f181185G = yt0.m217280g().m217291l();
        uvxVar.f181213v = vvxVar.f186003M;
        uvxVar.f181214w = vvxVar.f186004N;
        uvxVar.f181215x = vvxVar.f186005O;
        uvxVar.f181216y = vvxVar.f186041q;
        long j8 = vvxVar.f186013W;
        vvxVar.f186013W = 1 + j8;
        uvxVar.f181217z = j8;
        uvxVar.f181179A = u6y.m194722F().m194729H();
        long j9 = vvxVar.f186007Q;
        long j10 = j9 - vvxVar.f186008R;
        if (j10 < 0) {
            j10 = 0;
        }
        uvxVar.f181180B = j10;
        vvxVar.f186008R = j9;
        if (csx.m112235R().m112290S0()) {
            uvxVar.f181181C = yt0.m217280g().m217289j();
            uvxVar.f181183E = yt0.m217280g().m217288i();
        }
        vvxVar.f186000J = 0L;
        uvxVar.f181187I = vvxVar.f186026e0;
        uvxVar.f181188J = vvxVar.f186028f0;
        uvxVar.f181189K = yt0.m217280g().m217290k();
        uvxVar.f181190L = yt0.m217280g().m217286f();
        uvxVar.f181191M = vvxVar.m203038a();
        esx.m122396a("buffercheckcount", "fillPullWatchV2 object.videoFrameRate " + uvxVar.f181204m);
        return uvxVar.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m127721g(wvx wvxVar, gvx gvxVar) {
        if (wvxVar == null || gvxVar == null) {
            return null;
        }
        gvxVar.f106696a = System.currentTimeMillis();
        gvxVar.f106697b = wvxVar.f191048Z;
        gvxVar.f106698c = wvxVar.f191109u0;
        gvxVar.f106699d = wvxVar.f191111v0;
        gvxVar.f106700e = wvxVar.f191113w0;
        gvxVar.f106701f = wvxVar.f191115x0;
        gvxVar.f106702g = u6y.m194722F().m194733L();
        gvxVar.f106703h = wvxVar.f191068g;
        gvxVar.f106704i = wvxVar.f191114x;
        gvxVar.f106705j = wvxVar.f191005D0;
        gvxVar.f106706k = StringUtil.ALL_INTERFACES;
        gvxVar.f106707l = wvxVar.f191110v;
        gvxVar.f106708m = wvxVar.f191112w;
        gvxVar.f106709n = x0f.m208824a(true, "video/hevc") ? 1L : 0L;
        gvxVar.f106710o = wvxVar.f191118z;
        gvxVar.f106711p = wvxVar.f190998A;
        gvxVar.f106712q = yt0.m217280g().m217287h();
        gvxVar.f106713r = wvxVar.f191055b1;
        gvxVar.f106714s = wvxVar.f191104s;
        gvxVar.f106715t = wvxVar.f191105s0;
        gvxVar.f106716u = wvxVar.f191107t0;
        wvxVar.m208110a();
        return gvxVar.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m127722h(wvx wvxVar, hvx hvxVar) {
        if (wvxVar == null || hvxVar == null) {
            return null;
        }
        hvxVar.f111845a = System.currentTimeMillis();
        hvxVar.f111846b = wvxVar.f191117y0;
        hvxVar.f111847c = wvxVar.f191000B;
        hvxVar.f111848d = wvxVar.f191048Z;
        hvxVar.f111849e = wvxVar.f191114x;
        hvxVar.f111850f = wvxVar.f190999A0;
        hvxVar.f111851g = wvxVar.f191071h;
        hvxVar.f111852h = u6y.m194722F().m194733L();
        hvxVar.f111853i = wvxVar.f191055b1;
        hvxVar.f111854j = wvxVar.f191104s;
        hvxVar.f111855k = wvxVar.f191107t0;
        int iM194776o = u6y.m194722F().m194776o();
        if (hvxVar.f111846b == 0 && iM194776o != 0) {
            hvxVar.f111846b = iM194776o;
        }
        wvxVar.m208110a();
        return hvxVar.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m127723i(wvx wvxVar, ivx ivxVar) {
        if (wvxVar == null || ivxVar == null) {
            return null;
        }
        ivxVar.f117175a = System.currentTimeMillis();
        long jM194770l = u6y.m194722F().m194770l();
        wvxVar.f191006E = jM194770l;
        long j = wvxVar.f191004D;
        long j2 = j - wvxVar.f191014I;
        long j3 = jM194770l - wvxVar.f191016J;
        long j4 = wvxVar.f191031Q0;
        long j5 = j4 - wvxVar.f191035S0;
        long j6 = wvxVar.f191008F;
        long j7 = j6 - wvxVar.f191018K;
        long j8 = wvxVar.f191010G;
        long j9 = j8 - wvxVar.f191020L;
        long j10 = wvxVar.f191012H;
        long j11 = j10 - wvxVar.f191022M;
        long j12 = wvxVar.f191033R0;
        long j13 = j12 - wvxVar.f191037T0;
        long j14 = wvxVar.f191000B;
        long j15 = j14 - wvxVar.f191002C;
        ivxVar.f117177b = j2 > 0 ? j2 : 0L;
        ivxVar.f117179c = j3 > 0 ? j3 : 0L;
        ivxVar.f117181d = j5 > 0 ? j5 : 0L;
        ivxVar.f117183e = j7 > 0 ? j7 : 0L;
        ivxVar.f117185f = j9 > 0 ? j9 : 0L;
        ivxVar.f117187g = j11 > 0 ? j11 : 0L;
        ivxVar.f117189h = wvxVar.f191025N0;
        ivxVar.f117191i = wvxVar.f191027O0;
        ivxVar.f117193j = wvxVar.f191029P0;
        ivxVar.f117195k = j13 > 0 ? j13 : 0L;
        ivxVar.f117197l = j15 > 0 ? j15 : 0L;
        wvxVar.f191014I = j;
        wvxVar.f191016J = jM194770l;
        wvxVar.f191035S0 = j4;
        wvxVar.f191018K = j6;
        wvxVar.f191020L = j8;
        wvxVar.f191022M = j10;
        wvxVar.f191037T0 = j12;
        wvxVar.f191002C = j14;
        ivxVar.f117199m = wvxVar.f191039U0;
        ivxVar.f117201n = wvxVar.f191041V0;
        ivxVar.f117203o = yt0.m217280g().m217292m();
        ivxVar.f117205p = yt0.m217280g().m217293n();
        ivxVar.f117224y0 = yt0.m217280g().m217285e();
        ivxVar.f117207q = wvxVar.f191043W0;
        ivxVar.f117209r = wvxVar.f191045X0;
        ivxVar.f117211s = wvxVar.f191047Y0;
        ivxVar.f117213t = wvxVar.f191024N;
        ivxVar.f117215u = u6y.m194722F().m194782r();
        ivxVar.f117217v = u6y.m194722F().m194780q();
        ivxVar.f117219w = u6y.m194722F().m194774n();
        ivxVar.f117221x = u6y.m194722F().m194772m();
        ivxVar.f117223y = u6y.m194722F().m194790y();
        ivxVar.f117225z = u6y.m194722F().m194789x();
        ivxVar.f117130A = wvxVar.f191026O;
        ivxVar.f117132B = wvxVar.f191028P;
        ivxVar.f117134C = wvxVar.f191030Q;
        ivxVar.f117136D = wvxVar.f191023M0;
        ivxVar.f117138E = wvxVar.f191110v;
        ivxVar.f117140F = wvxVar.f191112w;
        ivxVar.f117142G = wvxVar.f191074i;
        ivxVar.f117144H = -1L;
        long j16 = wvxVar.f191077j;
        ivxVar.f117146I = j16 - wvxVar.f191086m;
        long j17 = wvxVar.f191080k;
        ivxVar.f117148J = j17 - wvxVar.f191089n;
        long j18 = wvxVar.f191083l;
        ivxVar.f117150K = j18 - wvxVar.f191092o;
        wvxVar.f191086m = j16;
        wvxVar.f191089n = j17;
        wvxVar.f191092o = j18;
        ivxVar.f117152L = wvxVar.f191101r;
        ivxVar.f117156N = yt0.m217280g().m217281a();
        ivxVar.f117158O = yt0.m217280g().m217294o();
        ivxVar.f117160P = yt0.m217280g().m217283c();
        ivxVar.f117162Q = yt0.m217280g().m217284d();
        ivxVar.f117135C0 = yt0.m217280g().m217291l();
        ivxVar.f117164R = wvxVar.f191104s;
        ivxVar.f117166S = (int) (u6y.m194722F().m194787v() * 100.0f);
        ivxVar.f117168T = (int) (u6y.m194722F().m194785t() * 100.0f);
        ivxVar.f117169U = (int) (u6y.m194722F().m194752c() * 100.0f);
        ivxVar.f117170V = (int) (u6y.m194722F().m194730I() * 100.0f);
        ivxVar.f117172X = wvxVar.f191034S;
        ivxVar.f117173Y = wvxVar.f191036T;
        ivxVar.f117174Z = u6y.m194722F().m194754d();
        ivxVar.f117176a0 = u6y.m194722F().m194778p();
        ivxVar.f117178b0 = u6y.m194722F().m194723A();
        ivxVar.f117180c0 = u6y.m194722F().m194727E();
        ivxVar.f117182d0 = u6y.m194722F().m194732K();
        ivxVar.f117184e0 = wvxVar.f191038U;
        ivxVar.f117186f0 = u6y.m194722F().m194729H();
        long j19 = wvxVar.f191007E0;
        wvxVar.f191007E0 = j19 + 1;
        ivxVar.f117188g0 = j19;
        ivxVar.f117190h0 = wvxVar.f191040V;
        ivxVar.f117192i0 = wvxVar.f191011G0;
        ivxVar.f117194j0 = wvxVar.f191003C0 / 1000;
        ivxVar.f117196k0 = wvxVar.f191009F0 / 1000;
        ivxVar.f117198l0 = (int) (wvxVar.f191013H0 * 100.0f);
        long j20 = wvxVar.f191015I0;
        long j21 = j20 - wvxVar.f191019K0;
        long j22 = wvxVar.f191017J0;
        long j23 = j22 - wvxVar.f191021L0;
        if (j21 <= 0) {
            j21 = 0;
        }
        ivxVar.f117200m0 = j21;
        if (j23 <= 0) {
            j23 = 0;
        }
        ivxVar.f117202n0 = j23;
        wvxVar.f191019K0 = j20;
        wvxVar.f191021L0 = j22;
        ivxVar.f117204o0 = wvxVar.f191049Z0;
        ivxVar.f117206p0 = u6y.m194722F().m194726D() ? 1L : 0L;
        ivxVar.f117208q0 = wvxVar.f191052a1;
        ivxVar.f117210r0 = u6y.m194722F().m194786u();
        ivxVar.f117147I0 = u6y.m194722F().m194784s();
        ivxVar.f117212s0 = u6y.m194722F().m194758f();
        ivxVar.f117214t0 = u6y.m194722F().m194756e();
        ivxVar.f117216u0 = u6y.m194722F().m194760g();
        ivxVar.f117218v0 = u6y.m194722F().m194791z();
        ivxVar.f117153L0 = wvxVar.f191079j1;
        if (csx.m112235R().m112290S0()) {
            ivxVar.f117220w0 = yt0.m217280g().m217289j();
            ivxVar.f117131A0 = yt0.m217280g().m217288i();
        }
        ivxVar.f117222x0 = u6y.m194722F().m194731J();
        u6y.m194722F().m194741T();
        if (ivxVar.f117197l == 0) {
            wvxVar.f191070g1++;
        }
        long j24 = wvxVar.f191054b0 - wvxVar.f191057c0;
        ivxVar.f117143G0 = j24 > 0 ? j24 * ((long) (csx.m112235R().m112329e() == 0 ? 23 : 46)) : 0L;
        wvxVar.f191057c0 = wvxVar.f191054b0;
        long j25 = wvxVar.f191060d0;
        long j26 = j25 - wvxVar.f191063e0;
        if (j26 <= 0) {
            j26 = 0;
        }
        ivxVar.f117145H0 = j26;
        wvxVar.f191063e0 = j25;
        ivxVar.f117157N0 = wvxVar.f191085l1;
        ivxVar.f117159O0 = wvxVar.f191088m1;
        ivxVar.f117161P0 = wvxVar.f191091n1;
        ivxVar.f117151K0 = wvxVar.f191076i1;
        ivxVar.f117163Q0 = yt0.m217280g().m217290k();
        ivxVar.f117165R0 = yt0.m217280g().m217286f();
        ivxVar.f117167S0 = wvxVar.f191048Z;
        return ivxVar.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m127724j(wvx wvxVar, jvx jvxVar) {
        if (wvxVar == null || jvxVar == null) {
            return null;
        }
        jvxVar.f122844a = System.currentTimeMillis();
        jvxVar.f122847d = u6y.m194722F().m194733L();
        jvxVar.f122845b = wvxVar.f191062e;
        jvxVar.f122846c = wvxVar.f191065f;
        jvxVar.f122849f = wvxVar.f191042W;
        jvxVar.f122850g = wvxVar.f191044X;
        jvxVar.f122848e = wvxVar.f191048Z;
        jvxVar.f122851h = wvxVar.f191055b1;
        jvxVar.f122852i = wvxVar.f191116y;
        jvxVar.f122854k = wvxVar.f191093o0;
        jvxVar.f122853j = wvxVar.f191096p0;
        u6y.m194722F().m194741T();
        return jvxVar.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m127725k(wvx wvxVar, kvx kvxVar) {
        if (wvxVar == null || kvxVar == null) {
            return null;
        }
        kvxVar.f129005a = System.currentTimeMillis();
        kvxVar.f129006b = wvxVar.f191117y0;
        kvxVar.f129010f = u6y.m194722F().m194733L();
        kvxVar.f129007c = wvxVar.f191077j;
        kvxVar.f129009e = wvxVar.f191071h;
        kvxVar.f129011g = wvxVar.f191042W;
        kvxVar.f129012h = wvxVar.f191044X;
        kvxVar.f129008d = wvxVar.f191048Z;
        kvxVar.f129013i = wvxVar.f191055b1;
        kvxVar.f129014j = wvxVar.f191066f0;
        kvxVar.f129015k = wvxVar.f191116y;
        kvxVar.f129016l = wvxVar.f191072h0;
        kvxVar.f129017m = wvxVar.f191078j0;
        kvxVar.f129018n = wvxVar.f191081k0;
        wvxVar.m208110a();
        return kvxVar.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m127726l(wvx wvxVar, lvx lvxVar) {
        if (wvxVar == null || lvxVar == null) {
            return null;
        }
        lvxVar.f133739a = System.currentTimeMillis();
        lvxVar.f133747i = yt0.m217280g().m217292m();
        lvxVar.f133748j = yt0.m217280g().m217293n();
        lvxVar.f133749k = yt0.m217280g().m217281a();
        lvxVar.f133750l = yt0.m217280g().m217294o();
        lvxVar.f133758t = yt0.m217280g().m217285e();
        lvxVar.f133740b = wvxVar.f191074i;
        long j = wvxVar.f191083l - wvxVar.f191092o;
        long j2 = wvxVar.f191080k - wvxVar.f191089n;
        if (j <= 0) {
            j = 0;
        }
        lvxVar.f133743e = j;
        if (j2 <= 0) {
            j2 = 0;
        }
        lvxVar.f133742d = j2;
        lvxVar.f133741c = j2 + j;
        lvxVar.f133744f = wvxVar.f191095p;
        lvxVar.f133745g = wvxVar.f191098q;
        lvxVar.f133763y = wvxVar.f191066f0;
        lvxVar.f133746h = wvxVar.f191101r;
        lvxVar.f133764z = wvxVar.f191072h0;
        lvxVar.f133751m = wvxVar.f191104s;
        lvxVar.f133752n = wvxVar.f191042W;
        lvxVar.f133753o = wvxVar.f191044X;
        if (csx.m112235R().m112290S0()) {
            lvxVar.f133754p = yt0.m217280g().m217289j();
            lvxVar.f133759u = yt0.m217280g().m217288i();
        }
        lvxVar.f133755q = yt0.m217280g().m217283c();
        lvxVar.f133756r = yt0.m217280g().m217284d();
        lvxVar.f133761w = yt0.m217280g().m217291l();
        long j3 = wvxVar.f191007E0;
        wvxVar.f191007E0 = 1 + j3;
        lvxVar.f133757s = j3;
        wvxVar.f191089n = wvxVar.f191080k;
        wvxVar.f191092o = wvxVar.f191083l;
        wvxVar.f191098q = 0L;
        lvxVar.f133736A = wvxVar.f191090n0;
        lvxVar.f133737B = yt0.m217280g().m217290k();
        lvxVar.f133738C = yt0.m217280g().m217286f();
        return lvxVar.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m127727m(wvx wvxVar, mvx mvxVar) {
        if (wvxVar == null || mvxVar == null) {
            return null;
        }
        mvxVar.f138961a = System.currentTimeMillis();
        mvxVar.f138963c = u6y.m194722F().m194733L();
        mvxVar.f138962b = wvxVar.f191062e;
        mvxVar.f138964d = wvxVar.f191068g;
        mvxVar.f138966f = wvxVar.f191110v;
        mvxVar.f138967g = wvxVar.f191112w;
        mvxVar.f138968h = wvxVar.f191114x;
        mvxVar.f138969i = wvxVar.f191118z;
        mvxVar.f138970j = wvxVar.f190998A;
        mvxVar.f138971k = wvxVar.f191042W;
        mvxVar.f138972l = wvxVar.f191044X;
        mvxVar.f138965e = wvxVar.f191048Z;
        mvxVar.f138973m = wvxVar.f191055b1;
        mvxVar.f138974n = wvxVar.f191061d1;
        mvxVar.f138975o = wvxVar.f191104s;
        mvxVar.f138976p = wvxVar.f191067f1;
        mvxVar.f138978r = wvxVar.f191073h1;
        mvxVar.f138979s = wvxVar.f191082k1;
        mvxVar.f138981u = wvxVar.f191093o0;
        mvxVar.f138980t = wvxVar.f191096p0;
        u6y.m194722F().m194741T();
        return mvxVar.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m127728n(wvx wvxVar, nvx nvxVar) {
        if (wvxVar == null || nvxVar == null) {
            return null;
        }
        nvxVar.f143874a = System.currentTimeMillis();
        nvxVar.f143875b = wvxVar.f191117y0;
        nvxVar.f143880g = u6y.m194722F().m194733L();
        nvxVar.f143876c = wvxVar.f191000B;
        nvxVar.f143878e = wvxVar.f191114x;
        nvxVar.f143879f = wvxVar.f191071h;
        nvxVar.f143881h = wvxVar.f191042W;
        nvxVar.f143882i = wvxVar.f191044X;
        nvxVar.f143877d = wvxVar.f191048Z;
        nvxVar.f143883j = wvxVar.f191055b1;
        nvxVar.f143884k = wvxVar.f191061d1;
        nvxVar.f143885l = wvxVar.f191104s;
        nvxVar.f143886m = wvxVar.f191073h1;
        nvxVar.f143887n = wvxVar.f191082k1;
        nvxVar.f143889p = wvxVar.f191081k0;
        nvxVar.f143888o = wvxVar.f191078j0;
        int iM194776o = u6y.m194722F().m194776o();
        if (nvxVar.f143875b == 0 && iM194776o != 0) {
            nvxVar.f143875b = iM194776o;
        }
        wvxVar.m208110a();
        return nvxVar.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m127729o(wvx wvxVar, ovx ovxVar) {
        if (wvxVar == null || ovxVar == null) {
            return null;
        }
        ovxVar.f149359a = System.currentTimeMillis();
        long jM194770l = u6y.m194722F().m194770l();
        wvxVar.f191006E = jM194770l;
        long j = wvxVar.f191004D;
        long j2 = j - wvxVar.f191014I;
        long j3 = jM194770l - wvxVar.f191016J;
        long j4 = wvxVar.f191008F;
        long j5 = j4 - wvxVar.f191018K;
        long j6 = wvxVar.f191010G;
        long j7 = j6 - wvxVar.f191020L;
        long j8 = wvxVar.f191012H;
        long j9 = j8 - wvxVar.f191022M;
        long j10 = wvxVar.f191000B;
        long j11 = j10 - wvxVar.f191002C;
        long j12 = 0;
        if (j2 > 0) {
            j12 = j2;
        }
        ovxVar.f149361b = j12;
        ovxVar.f149363c = j3 > j12 ? j3 : j12;
        ovxVar.f149365d = j5 > j12 ? j5 : j12;
        ovxVar.f149367e = j7 > j12 ? j7 : j12;
        ovxVar.f149369f = j9 > j12 ? j9 : j12;
        ovxVar.f149371g = j11 > j12 ? j11 : j12;
        wvxVar.f191014I = j;
        wvxVar.f191016J = jM194770l;
        wvxVar.f191018K = j4;
        wvxVar.f191020L = j6;
        wvxVar.f191022M = j8;
        wvxVar.f191002C = j10;
        ovxVar.f149377j = wvxVar.f191024N;
        ovxVar.f149391q = wvxVar.f191026O;
        ovxVar.f149393r = wvxVar.f191028P;
        ovxVar.f149395s = wvxVar.f191030Q;
        ovxVar.f149397t = wvxVar.f191110v;
        ovxVar.f149399u = wvxVar.f191112w;
        ovxVar.f149401v = wvxVar.f191074i;
        long j13 = wvxVar.f191080k;
        long j14 = j13 - wvxVar.f191089n;
        long j15 = wvxVar.f191083l;
        long j16 = j15 - wvxVar.f191092o;
        if (j14 <= j12) {
            j14 = j12;
        }
        ovxVar.f149405x = j14;
        if (j16 <= j12) {
            j16 = j12;
        }
        ovxVar.f149407y = j16;
        ovxVar.f149403w = j14 + j16;
        wvxVar.f191089n = j13;
        wvxVar.f191092o = j15;
        ovxVar.f149409z = wvxVar.f191095p;
        ovxVar.f149318A = wvxVar.f191101r;
        ovxVar.f149320B = wvxVar.f191032R;
        ovxVar.f149373h = yt0.m217280g().m217292m();
        ovxVar.f149375i = yt0.m217280g().m217293n();
        ovxVar.f149322C = yt0.m217280g().m217281a();
        ovxVar.f149324D = yt0.m217280g().m217294o();
        ovxVar.f149388o0 = yt0.m217280g().m217285e();
        ovxVar.f149326E = yt0.m217280g().m217283c();
        ovxVar.f149328F = yt0.m217280g().m217284d();
        ovxVar.f149396s0 = yt0.m217280g().m217291l();
        ovxVar.f149330G = wvxVar.f191104s;
        ovxVar.f149332H = (long) u6y.m194722F().m194787v();
        ovxVar.f149334I = (long) u6y.m194722F().m194785t();
        ovxVar.f149336J = (long) u6y.m194722F().m194752c();
        ovxVar.f149338K = (long) u6y.m194722F().m194730I();
        ovxVar.f149340L = u6y.m194722F().m194762h();
        ovxVar.f149342M = wvxVar.f191034S;
        ovxVar.f149344N = wvxVar.f191036T;
        ovxVar.f149346O = u6y.m194722F().m194754d();
        ovxVar.f149348P = u6y.m194722F().m194723A();
        ovxVar.f149349Q = u6y.m194722F().m194727E();
        ovxVar.f149350R = u6y.m194722F().m194732K();
        ovxVar.f149351S = wvxVar.f191038U;
        ovxVar.f149352T = wvxVar.f191040V;
        ovxVar.f149353U = wvxVar.f191042W;
        ovxVar.f149354V = wvxVar.f191044X;
        ovxVar.f149355W = u6y.m194722F().m194729H();
        long j17 = wvxVar.f191007E0;
        wvxVar.f191007E0 = j17 + 1;
        ovxVar.f149356X = j17;
        ovxVar.f149379k = u6y.m194722F().m194782r();
        ovxVar.f149381l = u6y.m194722F().m194780q();
        ovxVar.f149387o = u6y.m194722F().m194790y();
        ovxVar.f149389p = u6y.m194722F().m194789x();
        ovxVar.f149357Y = wvxVar.f191003C0 / 1000;
        ovxVar.f149358Z = wvxVar.f191009F0 / 1000;
        ovxVar.f149360a0 = (int) (wvxVar.f191013H0 * 100.0f);
        long j18 = wvxVar.f191015I0;
        long j19 = j18 - wvxVar.f191019K0;
        long j20 = wvxVar.f191017J0;
        long j21 = j20 - wvxVar.f191021L0;
        if (j19 <= j12) {
            j19 = j12;
        }
        ovxVar.f149362b0 = j19;
        if (j21 <= j12) {
            j21 = j12;
        }
        ovxVar.f149364c0 = j21;
        wvxVar.f191019K0 = j18;
        wvxVar.f191021L0 = j20;
        ovxVar.f149366d0 = wvxVar.f191049Z0;
        ovxVar.f149368e0 = u6y.m194722F().m194726D() ? 1L : j12;
        ovxVar.f149370f0 = wvxVar.f191052a1;
        ovxVar.f149372g0 = u6y.m194722F().m194786u();
        ovxVar.f149402v0 = u6y.m194722F().m194784s();
        ovxVar.f149374h0 = u6y.m194722F().m194758f();
        ovxVar.f149376i0 = u6y.m194722F().m194756e();
        ovxVar.f149378j0 = u6y.m194722F().m194760g();
        ovxVar.f149380k0 = u6y.m194722F().m194791z();
        ovxVar.f149406x0 = wvxVar.f191068g;
        if (csx.m112235R().m112290S0()) {
            ovxVar.f149382l0 = yt0.m217280g().m217289j();
            ovxVar.f149392q0 = yt0.m217280g().m217288i();
        }
        ovxVar.f149384m0 = wvxVar.f191061d1;
        ovxVar.f149386n0 = u6y.m194722F().m194731J();
        ovxVar.f149408y0 = wvxVar.f191073h1;
        ovxVar.f149410z0 = wvxVar.f191082k1;
        ovxVar.f149319A0 = wvxVar.f191085l1;
        ovxVar.f149321B0 = wvxVar.f191088m1;
        ovxVar.f149323C0 = wvxVar.f191091n1;
        ovxVar.f149329F0 = wvxVar.f191094o1;
        long j22 = ovxVar.f149371g;
        if (j22 == j12) {
            wvxVar.f191070g1++;
        } else if (j22 > j12) {
            wvxVar.f191070g1 = 0L;
        }
        ovxVar.f149327E0 = (int) wvxVar.f191087m0;
        ovxVar.f149325D0 = (int) wvxVar.f191084l0;
        ovxVar.f149331G0 = wvxVar.f191078j0;
        ovxVar.f149333H0 = wvxVar.f191099q0;
        ovxVar.f149335I0 = wvxVar.f191102r0;
        ovxVar.f149339K0 = wvxVar.f191097p1;
        ovxVar.f149341L0 = m127739y(wvxVar.f191100q1);
        ovxVar.f149343M0 = m127738x(wvxVar.f191103r1);
        u6y.m194722F().m194741T();
        ovxVar.f149345N0 = yt0.m217280g().m217290k();
        ovxVar.f149347O0 = yt0.m217280g().m217286f();
        return ovxVar.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m127730p() throws Throwable {
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
    public static String m127731q() {
        if (!TextUtils.isEmpty(f101105b)) {
            return f101105b;
        }
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            str = "unknow manufacturer";
        }
        return m127713A(str) ? m127735u(str) : str;
    }

    /* JADX INFO: renamed from: r */
    public static String m127732r() {
        if (!TextUtils.isEmpty(f101106c)) {
            return f101106c;
        }
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return m127713A(str) ? m127735u(str) : str;
    }

    /* JADX INFO: renamed from: s */
    public static long m127733s() {
        return f101104a.nextInt(LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
    }

    /* JADX INFO: renamed from: t */
    private static String m127734t(int i) {
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
    private static String m127735u(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "tantan";
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m127736v() {
        try {
            Class.forName("com.google.android.maps.MapActivity");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m127737w(Object... objArr) {
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
    private static String m127738x(Map<String, y7b0> map) {
        StringBuilder sb = new StringBuilder("[");
        if (map != null) {
            for (y7b0 y7b0Var : map.values()) {
                sb.append("(");
                sb.append(y7b0Var.toString());
                sb.append(")");
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    private static String m127739y(ArrayList<jmb0> arrayList) {
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
    public static String m127740z(String str) {
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
