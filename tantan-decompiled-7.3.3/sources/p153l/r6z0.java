package p153l;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.bef.effectsdk.RequirementDefine;
import com.google.android.gms.internal.ads.C2233o1;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgad;
import com.p051p1.mobile.putong.core.data.RegionRuleTag;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class r6z0 implements b6z0, btx0 {

    /* JADX INFO: renamed from: m */
    public static final zzgaa f161526m = zzgaa.zzp(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: n */
    public static final zzgaa f161527n = zzgaa.zzp(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: o */
    public static final zzgaa f161528o = zzgaa.zzp(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: p */
    public static final zzgaa f161529p = zzgaa.zzp(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: q */
    public static final zzgaa f161530q = zzgaa.zzp(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: r */
    public static final zzgaa f161531r = zzgaa.zzp(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: s */
    @Nullable
    public static r6z0 f161532s;

    /* JADX INFO: renamed from: a */
    public final zzgad f161533a;

    /* JADX INFO: renamed from: c */
    public final mfv0 f161535c;

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    public int f161537e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    public long f161538f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    public long f161539g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("this")
    public long f161540h;

    /* JADX INFO: renamed from: i */
    @GuardedBy("this")
    public long f161541i;

    /* JADX INFO: renamed from: j */
    @GuardedBy("this")
    public long f161542j;

    /* JADX INFO: renamed from: k */
    @GuardedBy("this")
    public long f161543k;

    /* JADX INFO: renamed from: l */
    public int f161544l;

    /* JADX INFO: renamed from: b */
    public final z5z0 f161534b = new z5z0();

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public final f7z0 f161536d = new f7z0(2000);

    public /* synthetic */ r6z0(Context context, Map map, int i, mfv0 mfv0Var, boolean z, e6z0 e6z0Var) {
        this.f161533a = zzgad.zzc(map);
        this.f161535c = mfv0Var;
        if (context == null) {
            this.f161544l = 0;
            this.f161542j = m180063e(0);
            return;
        }
        C2233o1 c2233o1M13124b = C2233o1.m13124b(context);
        int iM13126a = c2233o1M13124b.m13126a();
        this.f161544l = iM13126a;
        this.f161542j = m180063e(iM13126a);
        c2233o1M13124b.m13127d(new d6z0(this));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x0003, B:10:0x0011, B:12:0x0015, B:14:0x001f, B:16:0x0029, B:20:0x003e, B:19:0x0032, B:9:0x000c, B:21:0x00e4), top: B:26:0x0003 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static synchronized r6z0 m180059c(Context context) {
        String strM207229b;
        TelephonyManager telephonyManager;
        try {
            if (f161532s == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                int i = mpw0.f137957a;
                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                    strM207229b = wnw0.m207229b(Locale.getDefault().getCountry());
                } else {
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (TextUtils.isEmpty(networkCountryIso)) {
                        strM207229b = wnw0.m207229b(Locale.getDefault().getCountry());
                    } else {
                        strM207229b = wnw0.m207229b(networkCountryIso);
                    }
                }
                int[] iArrM180062j = m180062j(strM207229b);
                HashMap map = new HashMap(8);
                map.put(0, 1000000L);
                zzgaa zzgaaVar = f161526m;
                map.put(2, (Long) zzgaaVar.get(iArrM180062j[0]));
                map.put(3, (Long) f161527n.get(iArrM180062j[1]));
                map.put(4, (Long) f161528o.get(iArrM180062j[2]));
                map.put(5, (Long) f161529p.get(iArrM180062j[3]));
                map.put(10, (Long) f161530q.get(iArrM180062j[4]));
                map.put(9, (Long) f161531r.get(iArrM180062j[5]));
                map.put(7, (Long) zzgaaVar.get(iArrM180062j[0]));
                f161532s = new r6z0(applicationContext, map, 2000, mfv0.f136676a, true, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f161532s;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m180061h(akx0 akx0Var, boolean z) {
        return z && !akx0Var.m98632a(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0239, code lost:
    
        if (r3.equals("TR") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x027d, code lost:
    
        if (r3.equals("TH") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0295, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0469, code lost:
    
        if (r3.equals("PG") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06b7, code lost:
    
        if (r3.equals("LI") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x07a5, code lost:
    
        if (r3.equals("IS") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0aad, code lost:
    
        if (r3.equals(com.p051p1.mobile.putong.core.data.RegionRuleTag.f21236CM) != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0bae, code lost:
    
        if (r3.equals("AD") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L390;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] m180062j(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 2091) {
            if (iHashCode != 2092) {
                if (iHashCode != 2102) {
                    if (iHashCode != 2103) {
                        if (iHashCode != 2111) {
                            if (iHashCode != 2112) {
                                if (iHashCode != 2135) {
                                    if (iHashCode != 2136) {
                                        switch (iHashCode) {
                                            case 2083:
                                                break;
                                            case 2084:
                                                if (str.equals("AE")) {
                                                    return new int[]{1, 4, 2, 3, 4, 1};
                                                }
                                                break;
                                            case 2085:
                                                break;
                                            case 2086:
                                                break;
                                            default:
                                                switch (iHashCode) {
                                                    case 2088:
                                                        break;
                                                    case 2094:
                                                        if (str.equals("AO")) {
                                                            return new int[]{3, 4, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2105:
                                                        break;
                                                    case 2114:
                                                        if (str.equals("BD")) {
                                                            return new int[]{2, 1, 3, 2, 4, 2};
                                                        }
                                                        break;
                                                    case 2115:
                                                        if (str.equals("BE")) {
                                                            return new int[]{0, 0, 1, 0, 1, 2};
                                                        }
                                                        break;
                                                    case 2116:
                                                        break;
                                                    case 2117:
                                                        break;
                                                    case 2118:
                                                        if (str.equals("BH")) {
                                                            return new int[]{1, 3, 1, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2119:
                                                        break;
                                                    case 2120:
                                                        if (str.equals("BJ")) {
                                                            return new int[]{4, 4, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2133:
                                                        if (str.equals("BW")) {
                                                            return new int[]{3, 2, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2142:
                                                        break;
                                                    case 2145:
                                                        break;
                                                    case 2152:
                                                        break;
                                                    case 2153:
                                                        break;
                                                    case 2154:
                                                        break;
                                                    case 2155:
                                                        if (str.equals("CN")) {
                                                            return new int[]{2, 0, 1, 1, 3, 1};
                                                        }
                                                        break;
                                                    case 2156:
                                                        if (str.equals("CO")) {
                                                            return new int[]{2, 3, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2159:
                                                        break;
                                                    case 2162:
                                                        break;
                                                    case 2163:
                                                        if (str.equals("CV")) {
                                                            return new int[]{2, 3, 0, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2164:
                                                        break;
                                                    case 2165:
                                                        break;
                                                    case 2166:
                                                        if (str.equals("CY")) {
                                                            return new int[]{1, 0, 1, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2167:
                                                        if (str.equals("CZ")) {
                                                            return new int[]{0, 0, 2, 0, 1, 2};
                                                        }
                                                        break;
                                                    case 2177:
                                                        if (str.equals("DE")) {
                                                            return new int[]{0, 1, 4, 2, 2, 1};
                                                        }
                                                        break;
                                                    case 2182:
                                                        break;
                                                    case 2183:
                                                        if (str.equals("DK")) {
                                                            return new int[]{0, 0, 2, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2185:
                                                        break;
                                                    case 2187:
                                                        break;
                                                    case 2198:
                                                        break;
                                                    case 2206:
                                                        if (str.equals("EC")) {
                                                            return new int[]{1, 3, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2208:
                                                        break;
                                                    case 2210:
                                                        break;
                                                    case 2221:
                                                        break;
                                                    case 2222:
                                                        if (str.equals("ES")) {
                                                            return new int[]{0, 0, 0, 0, 1, 0};
                                                        }
                                                        break;
                                                    case 2223:
                                                        if (str.equals("ET")) {
                                                            return new int[]{4, 3, 4, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2243:
                                                        if (str.equals("FI")) {
                                                            return new int[]{0, 0, 0, 1, 0, 2};
                                                        }
                                                        break;
                                                    case 2244:
                                                        if (str.equals("FJ")) {
                                                            return new int[]{3, 2, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2245:
                                                        break;
                                                    case 2247:
                                                        if (str.equals("FM")) {
                                                            return new int[]{4, 2, 4, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2249:
                                                        if (str.equals("FO")) {
                                                            return new int[]{0, 2, 2, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2252:
                                                        if (str.equals("FR")) {
                                                            return new int[]{1, 1, 1, 1, 0, 2};
                                                        }
                                                        break;
                                                    case 2266:
                                                        if (str.equals("GA")) {
                                                            return new int[]{3, 4, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2267:
                                                        if (str.equals("GB")) {
                                                            return new int[]{1, 1, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2269:
                                                        if (str.equals("GD")) {
                                                            return new int[]{2, 2, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2270:
                                                        if (str.equals("GE")) {
                                                            return new int[]{1, 1, 0, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2271:
                                                        if (str.equals("GF")) {
                                                            return new int[]{3, 2, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2272:
                                                        if (str.equals("GG")) {
                                                            return new int[]{0, 2, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2273:
                                                        if (str.equals("GH")) {
                                                            return new int[]{3, 3, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2274:
                                                        break;
                                                    case 2277:
                                                        break;
                                                    case 2278:
                                                        break;
                                                    case 2279:
                                                        if (str.equals("GN")) {
                                                            return new int[]{3, 4, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2281:
                                                        if (str.equals("GP")) {
                                                            return new int[]{2, 1, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2282:
                                                        break;
                                                    case 2283:
                                                        if (str.equals("GR")) {
                                                            return new int[]{1, 0, 0, 0, 1, 2};
                                                        }
                                                        break;
                                                    case 2285:
                                                        if (str.equals("GT")) {
                                                            return new int[]{2, 1, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2286:
                                                        if (str.equals("GU")) {
                                                            return new int[]{2, 2, 4, 3, 3, 2};
                                                        }
                                                        break;
                                                    case 2288:
                                                        if (str.equals("GW")) {
                                                            return new int[]{4, 4, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2290:
                                                        if (str.equals("GY")) {
                                                            return new int[]{3, 1, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2307:
                                                        if (str.equals("HK")) {
                                                            return new int[]{0, 1, 0, 1, 1, 0};
                                                        }
                                                        break;
                                                    case 2314:
                                                        break;
                                                    case 2316:
                                                        break;
                                                    case 2317:
                                                        break;
                                                    case 2331:
                                                        if (str.equals("ID")) {
                                                            return new int[]{3, 1, 3, 3, 2, 4};
                                                        }
                                                        break;
                                                    case 2332:
                                                        if (str.equals("IE")) {
                                                            return new int[]{1, 1, 1, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2339:
                                                        if (str.equals("IL")) {
                                                            return new int[]{1, 2, 2, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2340:
                                                        break;
                                                    case 2341:
                                                        if (str.equals("IN")) {
                                                            return new int[]{1, 1, 3, 2, 2, 3};
                                                        }
                                                        break;
                                                    case 2342:
                                                        if (str.equals("IO")) {
                                                            return new int[]{3, 2, 2, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2344:
                                                        if (str.equals("IQ")) {
                                                            return new int[]{3, 2, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2345:
                                                        if (str.equals("IR")) {
                                                            return new int[]{4, 2, 3, 3, 4, 3};
                                                        }
                                                        break;
                                                    case 2346:
                                                        break;
                                                    case 2347:
                                                        if (str.equals("IT")) {
                                                            return new int[]{0, 1, 1, 2, 1, 2};
                                                        }
                                                        break;
                                                    case 2363:
                                                        break;
                                                    case 2371:
                                                        if (str.equals("JM")) {
                                                            return new int[]{2, 4, 3, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2373:
                                                        break;
                                                    case 2374:
                                                        if (str.equals("JP")) {
                                                            return new int[]{0, 3, 2, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2394:
                                                        if (str.equals("KE")) {
                                                            return new int[]{3, 2, 1, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2396:
                                                        if (str.equals("KG")) {
                                                            return new int[]{2, 1, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2397:
                                                        if (str.equals("KH")) {
                                                            return new int[]{1, 0, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2398:
                                                        break;
                                                    case 2402:
                                                        break;
                                                    case 2403:
                                                        break;
                                                    case 2407:
                                                        if (str.equals("KR")) {
                                                            return new int[]{0, 2, 2, 4, 4, 4};
                                                        }
                                                        break;
                                                    case 2412:
                                                        break;
                                                    case 2414:
                                                        break;
                                                    case 2415:
                                                        if (str.equals("KZ")) {
                                                            return new int[]{2, 1, 2, 2, 3, 2};
                                                        }
                                                        break;
                                                    case 2421:
                                                        if (str.equals("LA")) {
                                                            return new int[]{1, 2, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2422:
                                                        if (str.equals("LB")) {
                                                            return new int[]{3, 1, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2423:
                                                        if (str.equals("LC")) {
                                                            return new int[]{2, 2, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2429:
                                                        break;
                                                    case 2431:
                                                        break;
                                                    case 2438:
                                                        break;
                                                    case 2439:
                                                        break;
                                                    case 2440:
                                                        if (str.equals("LT")) {
                                                            return new int[]{0, 1, 0, 1, 0, 2};
                                                        }
                                                        break;
                                                    case 2441:
                                                        if (str.equals("LU")) {
                                                            return new int[]{4, 0, 3, 2, 1, 3};
                                                        }
                                                        break;
                                                    case 2442:
                                                        break;
                                                    case 2445:
                                                        break;
                                                    case 2452:
                                                        if (str.equals("MA")) {
                                                            return new int[]{3, 3, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2454:
                                                        break;
                                                    case 2455:
                                                        if (str.equals("MD")) {
                                                            return new int[]{1, 0, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2456:
                                                        if (str.equals("ME")) {
                                                            return new int[]{2, 0, 0, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2457:
                                                        if (str.equals("MF")) {
                                                            return new int[]{1, 2, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2458:
                                                        break;
                                                    case 2459:
                                                        break;
                                                    case 2462:
                                                        if (str.equals("MK")) {
                                                            return new int[]{1, 0, 0, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2463:
                                                        break;
                                                    case 2464:
                                                        break;
                                                    case 2465:
                                                        if (str.equals("MN")) {
                                                            return new int[]{2, 0, 2, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2466:
                                                        if (str.equals("MO")) {
                                                            return new int[]{0, 2, 4, 4, 3, 1};
                                                        }
                                                        break;
                                                    case 2467:
                                                        break;
                                                    case 2468:
                                                        if (str.equals("MQ")) {
                                                            return new int[]{2, 1, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2469:
                                                        break;
                                                    case 2470:
                                                        break;
                                                    case 2471:
                                                        break;
                                                    case 2472:
                                                        if (str.equals("MU")) {
                                                            return new int[]{3, 1, 0, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2473:
                                                        if (str.equals("MV")) {
                                                            return new int[]{3, 2, 1, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2474:
                                                        if (str.equals("MW")) {
                                                            return new int[]{3, 2, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2475:
                                                        if (str.equals("MX")) {
                                                            return new int[]{2, 4, 4, 4, 3, 2};
                                                        }
                                                        break;
                                                    case 2476:
                                                        if (str.equals("MY")) {
                                                            return new int[]{1, 0, 4, 1, 1, 0};
                                                        }
                                                        break;
                                                    case 2477:
                                                        break;
                                                    case 2483:
                                                        if (str.equals("NA")) {
                                                            return new int[]{3, 4, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2485:
                                                        break;
                                                    case 2487:
                                                        break;
                                                    case 2488:
                                                        break;
                                                    case 2489:
                                                        if (str.equals("NG")) {
                                                            return new int[]{3, 4, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2491:
                                                        break;
                                                    case 2494:
                                                        if (str.equals("NL")) {
                                                            return new int[]{2, 1, 4, 3, 0, 4};
                                                        }
                                                        break;
                                                    case 2497:
                                                        if (str.equals("NO")) {
                                                            return new int[]{0, 0, 3, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2498:
                                                        if (str.equals("NP")) {
                                                            return new int[]{2, 2, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2500:
                                                        break;
                                                    case 2503:
                                                        break;
                                                    case 2508:
                                                        if (str.equals("NZ")) {
                                                            return new int[]{0, 0, 1, 2, 4, 2};
                                                        }
                                                        break;
                                                    case 2526:
                                                        if (str.equals("OM")) {
                                                            return new int[]{2, 3, 1, 2, 4, 2};
                                                        }
                                                        break;
                                                    case 2545:
                                                        break;
                                                    case 2549:
                                                        if (str.equals("PE")) {
                                                            return new int[]{1, 2, 4, 4, 3, 2};
                                                        }
                                                        break;
                                                    case 2550:
                                                        if (str.equals("PF")) {
                                                            return new int[]{2, 2, 3, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2551:
                                                        break;
                                                    case 2552:
                                                        if (str.equals("PH")) {
                                                            return new int[]{2, 1, 2, 3, 2, 1};
                                                        }
                                                        break;
                                                    case 2555:
                                                        if (str.equals(BLiveTraceServerLocation.f45309PK)) {
                                                            return new int[]{3, 3, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2556:
                                                        if (str.equals("PL")) {
                                                            return new int[]{1, 0, 2, 2, 4, 4};
                                                        }
                                                        break;
                                                    case 2557:
                                                        break;
                                                    case 2562:
                                                        if (str.equals("PR")) {
                                                            return new int[]{2, 0, 2, 1, 2, 0};
                                                        }
                                                        break;
                                                    case 2563:
                                                        if (str.equals("PS")) {
                                                            return new int[]{3, 4, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2564:
                                                        break;
                                                    case 2567:
                                                        if (str.equals("PW")) {
                                                            return new int[]{2, 2, 4, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2569:
                                                        break;
                                                    case 2576:
                                                        if (str.equals("QA")) {
                                                            return new int[]{1, 4, 4, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2611:
                                                        if (str.equals("RE")) {
                                                            return new int[]{0, 3, 2, 3, 1, 2};
                                                        }
                                                        break;
                                                    case 2621:
                                                        if (str.equals("RO")) {
                                                            return new int[]{0, 0, 1, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2625:
                                                        if (str.equals("RS")) {
                                                            return new int[]{1, 0, 0, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2627:
                                                        if (str.equals("RU")) {
                                                            return new int[]{1, 0, 0, 1, 3, 3};
                                                        }
                                                        break;
                                                    case 2629:
                                                        if (str.equals("RW")) {
                                                            return new int[]{3, 3, 2, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2638:
                                                        if (str.equals("SA")) {
                                                            return new int[]{3, 1, 1, 2, 2, 0};
                                                        }
                                                        break;
                                                    case 2639:
                                                        break;
                                                    case 2640:
                                                        break;
                                                    case 2641:
                                                        break;
                                                    case 2642:
                                                        break;
                                                    case 2644:
                                                        if (str.equals("SG")) {
                                                            return new int[]{2, 3, 3, 3, 1, 1};
                                                        }
                                                        break;
                                                    case 2645:
                                                        break;
                                                    case 2646:
                                                        break;
                                                    case 2647:
                                                        break;
                                                    case 2648:
                                                        if (str.equals("SK")) {
                                                            return new int[]{0, 1, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2649:
                                                        break;
                                                    case 2650:
                                                        break;
                                                    case 2651:
                                                        if (str.equals("SN")) {
                                                            return new int[]{4, 4, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2652:
                                                        if (str.equals("SO")) {
                                                            return new int[]{2, 2, 3, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2655:
                                                        if (str.equals("SR")) {
                                                            return new int[]{2, 4, 4, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2656:
                                                        break;
                                                    case 2657:
                                                        if (str.equals("ST")) {
                                                            return new int[]{2, 2, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2659:
                                                        if (str.equals("SV")) {
                                                            return new int[]{2, 3, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2661:
                                                        break;
                                                    case 2662:
                                                        break;
                                                    case 2663:
                                                        break;
                                                    case 2671:
                                                        if (str.equals("TC")) {
                                                            return new int[]{3, 2, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2672:
                                                        break;
                                                    case 2675:
                                                        if (str.equals("TG")) {
                                                            return new int[]{3, 4, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2676:
                                                        break;
                                                    case 2678:
                                                        break;
                                                    case 2680:
                                                        break;
                                                    case 2681:
                                                        break;
                                                    case 2682:
                                                        if (str.equals("TN")) {
                                                            return new int[]{3, 1, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2683:
                                                        if (str.equals("TO")) {
                                                            return new int[]{3, 2, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2686:
                                                        break;
                                                    case 2688:
                                                        if (str.equals("TT")) {
                                                            return new int[]{2, 4, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2690:
                                                        break;
                                                    case 2691:
                                                        if (str.equals("TW")) {
                                                            return new int[]{0, 0, 0, 0, 0, 0};
                                                        }
                                                        break;
                                                    case 2694:
                                                        if (str.equals("TZ")) {
                                                            return new int[]{3, 4, 2, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2700:
                                                        break;
                                                    case 2706:
                                                        if (str.equals("UG")) {
                                                            return new int[]{3, 3, 2, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2718:
                                                        if (str.equals("US")) {
                                                            return new int[]{2, 2, 4, 1, 3, 1};
                                                        }
                                                        break;
                                                    case 2724:
                                                        if (str.equals("UY")) {
                                                            return new int[]{2, 1, 1, 2, 1, 2};
                                                        }
                                                        break;
                                                    case 2725:
                                                        if (str.equals("UZ")) {
                                                            return new int[]{1, 2, 3, 4, 3, 2};
                                                        }
                                                        break;
                                                    case 2731:
                                                        break;
                                                    case 2733:
                                                        break;
                                                    case 2735:
                                                        break;
                                                    case 2737:
                                                        if (str.equals("VG")) {
                                                            return new int[]{2, 2, 1, 1, 2, 4};
                                                        }
                                                        break;
                                                    case 2739:
                                                        if (str.equals("VI")) {
                                                            return new int[]{0, 2, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2744:
                                                        if (str.equals("VN")) {
                                                            return new int[]{0, 0, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2751:
                                                        break;
                                                    case 2767:
                                                        break;
                                                    case 2780:
                                                        break;
                                                    case 2803:
                                                        if (str.equals("XK")) {
                                                            return new int[]{1, 2, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2828:
                                                        break;
                                                    case 2843:
                                                        break;
                                                    case 2855:
                                                        if (str.equals("ZA")) {
                                                            return new int[]{2, 4, 2, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2867:
                                                        if (str.equals("ZM")) {
                                                            return new int[]{4, 4, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2877:
                                                        break;
                                                    default:
                                                        switch (iHashCode) {
                                                            case 2096:
                                                                break;
                                                            case 2097:
                                                                if (str.equals(RequirementDefine.REQUIREMENT_AR_TAG)) {
                                                                    return new int[]{2, 2, 2, 2, 1, 2};
                                                                }
                                                                break;
                                                            case 2098:
                                                                if (str.equals("AS")) {
                                                                    return new int[]{2, 2, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2099:
                                                                break;
                                                            case 2100:
                                                                if (str.equals("AU")) {
                                                                    return new int[]{0, 3, 1, 1, 3, 0};
                                                                }
                                                                break;
                                                            default:
                                                                switch (iHashCode) {
                                                                    case 2122:
                                                                        break;
                                                                    case 2123:
                                                                        if (str.equals("BM")) {
                                                                            return new int[]{0, 2, 0, 0, 2, 2};
                                                                        }
                                                                        break;
                                                                    case 2124:
                                                                        if (str.equals("BN")) {
                                                                            return new int[]{3, 2, 0, 0, 2, 2};
                                                                        }
                                                                        break;
                                                                    case 2125:
                                                                        if (str.equals("BO")) {
                                                                            return new int[]{1, 2, 4, 4, 2, 2};
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (iHashCode) {
                                                                            case 2127:
                                                                                break;
                                                                            case 2128:
                                                                                if (str.equals("BR")) {
                                                                                    return new int[]{1, 1, 1, 1, 2, 4};
                                                                                }
                                                                                break;
                                                                            case 2129:
                                                                                if (str.equals(RegionRuleTag.f21235BS)) {
                                                                                    return new int[]{3, 2, 1, 1, 2, 2};
                                                                                }
                                                                                break;
                                                                            case 2130:
                                                                                if (str.equals("BT")) {
                                                                                    return new int[]{3, 1, 2, 2, 3, 2};
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (iHashCode) {
                                                                                    case 2147:
                                                                                        if (str.equals("CF")) {
                                                                                            return new int[]{4, 2, 4, 2, 2, 2};
                                                                                        }
                                                                                        break;
                                                                                    case 2148:
                                                                                        break;
                                                                                    case 2149:
                                                                                        if (str.equals("CH")) {
                                                                                            return new int[]{0, 1, 0, 0, 0, 2};
                                                                                        }
                                                                                        break;
                                                                                    case 2150:
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    }
                                } else if (str.equals("BY")) {
                                    return new int[]{1, 2, 3, 3, 2, 2};
                                }
                            }
                        }
                    }
                } else if (str.equals("AW")) {
                    return new int[]{2, 2, 3, 4, 2, 2};
                }
            }
        } else if (str.equals("AL")) {
            return new int[]{1, 1, 1, 2, 2, 2};
        }
        return new int[]{2, 2, 2, 2, 2, 2};
    }

    @Override // p153l.b6z0
    /* JADX INFO: renamed from: a */
    public final void mo102800a(a6z0 a6z0Var) {
        this.f161534b.m218755c(a6z0Var);
    }

    @Override // p153l.b6z0
    /* JADX INFO: renamed from: b */
    public final void mo102801b(Handler handler, a6z0 a6z0Var) {
        a6z0Var.getClass();
        this.f161534b.m218753a(handler, a6z0Var);
    }

    /* JADX INFO: renamed from: e */
    public final long m180063e(int i) {
        Long l2 = (Long) this.f161533a.get(Integer.valueOf(i));
        if (l2 == null) {
            l2 = (Long) this.f161533a.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: f */
    public final void m180064f(int i, long j, long j2) {
        int i2;
        long j3;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.f161543k) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.f161543k = j2;
        this.f161534b.m218754b(i2, j3, j2);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m180065g(int i) throws Throwable {
        Throwable th;
        int i2;
        try {
            try {
                if (this.f161544l != i) {
                    this.f161544l = i;
                    if (i != 1 && i != 0 && i != 8) {
                        this.f161542j = m180063e(i);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (this.f161537e > 0) {
                            try {
                                i2 = (int) (jElapsedRealtime - this.f161538f);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } else {
                            i2 = 0;
                        }
                        m180064f(i2, this.f161539g, this.f161542j);
                        this.f161538f = jElapsedRealtime;
                        this.f161539g = 0L;
                        this.f161541i = 0L;
                        this.f161540h = 0L;
                        this.f161536d.m124510c();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: i */
    public final synchronized void mo106410i(fex0 fex0Var, akx0 akx0Var, boolean z) {
        try {
            if (m180061h(akx0Var, z)) {
                if (this.f161537e == 0) {
                    this.f161538f = SystemClock.elapsedRealtime();
                }
                this.f161537e++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[Catch: all -> 0x006f, TRY_ENTER, TryCatch #2 {all -> 0x006f, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0010, B:13:0x002b, B:23:0x005d, B:22:0x0052), top: B:36:0x0001 }] */
    @Override // p153l.btx0
    /* JADX INFO: renamed from: l */
    public final synchronized void mo106412l(fex0 fex0Var, akx0 akx0Var, boolean z) throws Throwable {
        Throwable th;
        r6z0 r6z0Var;
        try {
            try {
                if (m180061h(akx0Var, z)) {
                    lev0.m153958f(this.f161537e > 0);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i = (int) (jElapsedRealtime - this.f161538f);
                    this.f161540h += (long) i;
                    long j = this.f161541i;
                    long j2 = this.f161539g;
                    this.f161541i = j + j2;
                    if (i > 0) {
                        this.f161536d.m124509b((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                        if (this.f161540h < 2000) {
                            try {
                                if (this.f161541i >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                    this.f161542j = (long) this.f161536d.m124508a(0.5f);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            this.f161542j = (long) this.f161536d.m124508a(0.5f);
                        }
                        r6z0Var = this;
                        r6z0Var.m180064f(i, this.f161539g, this.f161542j);
                        r6z0Var.f161538f = jElapsedRealtime;
                        r6z0Var.f161539g = 0L;
                    } else {
                        r6z0Var = this;
                    }
                    r6z0Var.f161537e--;
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: n */
    public final synchronized void mo106413n(fex0 fex0Var, akx0 akx0Var, boolean z, int i) {
        if (m180061h(akx0Var, z)) {
            this.f161539g += (long) i;
        }
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: k */
    public final void mo106411k(fex0 fex0Var, akx0 akx0Var, boolean z) {
    }
}
