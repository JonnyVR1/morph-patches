package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2210o1;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgad;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class lxy0 implements vwy0, vjx0 {

    /* JADX INFO: renamed from: m */
    public static final zzgaa f130462m = zzgaa.zzp(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: n */
    public static final zzgaa f130463n = zzgaa.zzp(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: o */
    public static final zzgaa f130464o = zzgaa.zzp(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: p */
    public static final zzgaa f130465p = zzgaa.zzp(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: q */
    public static final zzgaa f130466q = zzgaa.zzp(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: r */
    public static final zzgaa f130467r = zzgaa.zzp(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: s */
    @Nullable
    public static lxy0 f130468s;

    /* JADX INFO: renamed from: a */
    public final zzgad f130469a;

    /* JADX INFO: renamed from: c */
    public final g6v0 f130471c;

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    public int f130473e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    public long f130474f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    public long f130475g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("this")
    public long f130476h;

    /* JADX INFO: renamed from: i */
    @GuardedBy("this")
    public long f130477i;

    /* JADX INFO: renamed from: j */
    @GuardedBy("this")
    public long f130478j;

    /* JADX INFO: renamed from: k */
    @GuardedBy("this")
    public long f130479k;

    /* JADX INFO: renamed from: l */
    public int f130480l;

    /* JADX INFO: renamed from: b */
    public final twy0 f130470b = new twy0();

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public final zxy0 f130472d = new zxy0(2000);

    public /* synthetic */ lxy0(Context context, Map map, int i, g6v0 g6v0Var, boolean z, ywy0 ywy0Var) {
        this.f130469a = zzgad.zzc(map);
        this.f130471c = g6v0Var;
        if (context == null) {
            this.f130480l = 0;
            this.f130478j = m152113e(0);
            return;
        }
        C2210o1 c2210o1M13070b = C2210o1.m13070b(context);
        int iM13072a = c2210o1M13070b.m13072a();
        this.f130480l = iM13072a;
        this.f130478j = m152113e(iM13072a);
        c2210o1M13070b.m13073d(new xwy0(this));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x0003, B:10:0x0011, B:12:0x0015, B:14:0x001f, B:16:0x0029, B:20:0x003e, B:19:0x0032, B:9:0x000c, B:21:0x00e4), top: B:26:0x0003 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static synchronized lxy0 m152107c(Context context) {
        String strM174258b;
        TelephonyManager telephonyManager;
        try {
            if (f130468s == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                int i = ggw0.f102568a;
                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                    strM174258b = qew0.m174258b(Locale.getDefault().getCountry());
                } else {
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (TextUtils.isEmpty(networkCountryIso)) {
                        strM174258b = qew0.m174258b(Locale.getDefault().getCountry());
                    } else {
                        strM174258b = qew0.m174258b(networkCountryIso);
                    }
                }
                int[] iArrM152110j = m152110j(strM174258b);
                HashMap map = new HashMap(8);
                map.put(0, 1000000L);
                zzgaa zzgaaVar = f130462m;
                map.put(2, (Long) zzgaaVar.get(iArrM152110j[0]));
                map.put(3, (Long) f130463n.get(iArrM152110j[1]));
                map.put(4, (Long) f130464o.get(iArrM152110j[2]));
                map.put(5, (Long) f130465p.get(iArrM152110j[3]));
                map.put(10, (Long) f130466q.get(iArrM152110j[4]));
                map.put(9, (Long) f130467r.get(iArrM152110j[5]));
                map.put(7, (Long) zzgaaVar.get(iArrM152110j[0]));
                f130468s = new lxy0(applicationContext, map, 2000, g6v0.f101315a, true, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f130468s;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m152109h(uax0 uax0Var, boolean z) {
        return z && !uax0Var.m192805a(8);
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
    
        if (r3.equals(com.p046p1.mobile.putong.core.data.RegionRuleTag.f20494CM) != false) goto L800;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] m152110j(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 6672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.lxy0.m152110j(java.lang.String):int[]");
    }

    @Override // p149l.vwy0
    /* JADX INFO: renamed from: a */
    public final void mo152111a(uwy0 uwy0Var) {
        this.f130470b.m190914c(uwy0Var);
    }

    @Override // p149l.vwy0
    /* JADX INFO: renamed from: b */
    public final void mo152112b(Handler handler, uwy0 uwy0Var) {
        uwy0Var.getClass();
        this.f130470b.m190912a(handler, uwy0Var);
    }

    /* JADX INFO: renamed from: e */
    public final long m152113e(int i) {
        Long l2 = (Long) this.f130469a.get(Integer.valueOf(i));
        if (l2 == null) {
            l2 = (Long) this.f130469a.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: f */
    public final void m152114f(int i, long j, long j2) {
        int i2;
        long j3;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.f130479k) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.f130479k = j2;
        this.f130470b.m190913b(i2, j3, j2);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m152115g(int i) throws Throwable {
        Throwable th;
        int i2;
        try {
            try {
                if (this.f130480l != i) {
                    this.f130480l = i;
                    if (i != 1 && i != 0 && i != 8) {
                        this.f130478j = m152113e(i);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (this.f130473e > 0) {
                            try {
                                i2 = (int) (jElapsedRealtime - this.f130474f);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } else {
                            i2 = 0;
                        }
                        m152114f(i2, this.f130475g, this.f130478j);
                        this.f130474f = jElapsedRealtime;
                        this.f130475g = 0L;
                        this.f130477i = 0L;
                        this.f130476h = 0L;
                        this.f130472d.m220857c();
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

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: i */
    public final synchronized void mo115286i(z4x0 z4x0Var, uax0 uax0Var, boolean z) {
        try {
            if (m152109h(uax0Var, z)) {
                if (this.f130473e == 0) {
                    this.f130474f = SystemClock.elapsedRealtime();
                }
                this.f130473e++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[Catch: all -> 0x006f, TRY_ENTER, TryCatch #2 {all -> 0x006f, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0010, B:13:0x002b, B:23:0x005d, B:22:0x0052), top: B:36:0x0001 }] */
    @Override // p149l.vjx0
    /* JADX INFO: renamed from: l */
    public final synchronized void mo115288l(z4x0 z4x0Var, uax0 uax0Var, boolean z) throws Throwable {
        Throwable th;
        lxy0 lxy0Var;
        try {
            try {
                if (m152109h(uax0Var, z)) {
                    f5v0.m119535f(this.f130473e > 0);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i = (int) (jElapsedRealtime - this.f130474f);
                    this.f130476h += (long) i;
                    long j = this.f130477i;
                    long j2 = this.f130475g;
                    this.f130477i = j + j2;
                    if (i > 0) {
                        this.f130472d.m220856b((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                        if (this.f130476h < 2000) {
                            try {
                                if (this.f130477i >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                    this.f130478j = (long) this.f130472d.m220855a(0.5f);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            this.f130478j = (long) this.f130472d.m220855a(0.5f);
                        }
                        lxy0Var = this;
                        lxy0Var.m152114f(i, this.f130475g, this.f130478j);
                        lxy0Var.f130474f = jElapsedRealtime;
                        lxy0Var.f130475g = 0L;
                    } else {
                        lxy0Var = this;
                    }
                    lxy0Var.f130473e--;
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

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: n */
    public final synchronized void mo115289n(z4x0 z4x0Var, uax0 uax0Var, boolean z, int i) {
        if (m152109h(uax0Var, z)) {
            this.f130475g += (long) i;
        }
    }

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: k */
    public final void mo115287k(z4x0 z4x0Var, uax0 uax0Var, boolean z) {
    }
}
