package p149l;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.asm.Opcodes;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.momo.momortc.MMConstants;
import com.p046p1.mobile.putong.core.data.RegionRuleTag;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.util.HashMap;
import java.util.Map;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jld implements fd2, l7j0 {

    /* JADX INFO: renamed from: p */
    public static final ImmutableList<Long> f118508p = ImmutableList.m15690of(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* JADX INFO: renamed from: q */
    public static final ImmutableList<Long> f118509q = ImmutableList.m15690of(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* JADX INFO: renamed from: r */
    public static final ImmutableList<Long> f118510r = ImmutableList.m15690of(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* JADX INFO: renamed from: s */
    public static final ImmutableList<Long> f118511s = ImmutableList.m15690of(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* JADX INFO: renamed from: t */
    public static final ImmutableList<Long> f118512t = ImmutableList.m15690of(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* JADX INFO: renamed from: u */
    public static final ImmutableList<Long> f118513u = ImmutableList.m15690of(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* JADX INFO: renamed from: v */
    @Nullable
    public static jld f118514v;

    /* JADX INFO: renamed from: a */
    public final ImmutableMap<Integer, Long> f118515a;

    /* JADX INFO: renamed from: b */
    public final fd2.InterfaceC16803a.a f118516b;

    /* JADX INFO: renamed from: c */
    public final zjf0 f118517c;

    /* JADX INFO: renamed from: d */
    public final p95 f118518d;

    /* JADX INFO: renamed from: e */
    public final boolean f118519e;

    /* JADX INFO: renamed from: f */
    public int f118520f;

    /* JADX INFO: renamed from: g */
    public long f118521g;

    /* JADX INFO: renamed from: h */
    public long f118522h;

    /* JADX INFO: renamed from: i */
    public int f118523i;

    /* JADX INFO: renamed from: j */
    public long f118524j;

    /* JADX INFO: renamed from: k */
    public long f118525k;

    /* JADX INFO: renamed from: l */
    public long f118526l;

    /* JADX INFO: renamed from: m */
    public long f118527m;

    /* JADX INFO: renamed from: n */
    public boolean f118528n;

    /* JADX INFO: renamed from: o */
    public int f118529o;

    /* JADX INFO: renamed from: l.jld$b */
    public static final class C17812b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Context f118530a;

        /* JADX INFO: renamed from: b */
        public Map<Integer, Long> f118531b;

        /* JADX INFO: renamed from: c */
        public int f118532c;

        /* JADX INFO: renamed from: d */
        public p95 f118533d;

        /* JADX INFO: renamed from: e */
        public boolean f118534e;

        public C17812b(Context context) {
            this.f118530a = context == null ? null : context.getApplicationContext();
            this.f118531b = m142065b(vck0.m197815O(context));
            this.f118532c = 2000;
            this.f118533d = p95.f147671a;
            this.f118534e = true;
        }

        /* JADX INFO: renamed from: b */
        public static Map<Integer, Long> m142065b(String str) {
            int[] iArrM142055l = jld.m142055l(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            ImmutableList<Long> immutableList = jld.f118508p;
            map.put(2, immutableList.get(iArrM142055l[0]));
            map.put(3, jld.f118509q.get(iArrM142055l[1]));
            map.put(4, jld.f118510r.get(iArrM142055l[2]));
            map.put(5, jld.f118511s.get(iArrM142055l[3]));
            map.put(10, jld.f118512t.get(iArrM142055l[4]));
            map.put(9, jld.f118513u.get(iArrM142055l[5]));
            map.put(7, immutableList.get(iArrM142055l[0]));
            return map;
        }

        /* JADX INFO: renamed from: a */
        public jld m142066a() {
            return new jld(this.f118530a, this.f118531b, this.f118532c, this.f118533d, this.f118534e);
        }
    }

    public jld(@Nullable Context context, Map<Integer, Long> map, int i, p95 p95Var, boolean z) {
        this.f118515a = ImmutableMap.copyOf((Map) map);
        this.f118516b = new fd2.InterfaceC16803a.a();
        this.f118517c = new zjf0(i);
        this.f118518d = p95Var;
        this.f118519e = z;
        if (context == null) {
            this.f118523i = 0;
            this.f118526l = m142062m(0);
            return;
        }
        NetworkTypeObserver networkTypeObserverM12141d = NetworkTypeObserver.m12141d(context);
        int iM12144f = networkTypeObserverM12141d.m12144f();
        this.f118523i = iM12144f;
        this.f118526l = m142062m(iM12144f);
        networkTypeObserverM12141d.m12145h(new NetworkTypeObserver.InterfaceC2054c() { // from class: l.ild
            @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.InterfaceC2054c
            /* JADX INFO: renamed from: a */
            public final void mo12149a(int i2) throws Throwable {
                this.f113818a.m142064q(i2);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: l */
    public static int[] m142055l(String str) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b = 8;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b = 9;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b = 10;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b = 11;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    b = 12;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b = 14;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b = 15;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    b = 17;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    b = 18;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b = 19;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b = 20;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b = 21;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b = 22;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b = 23;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b = 24;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b = 25;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b = 26;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b = 27;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b = 28;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    b = 29;
                }
                break;
            case 2129:
                if (str.equals(RegionRuleTag.f20493BS)) {
                    b = 30;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b = 31;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b = HttpTokens.SPACE;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b = 33;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b = 34;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b = 35;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b = 36;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b = 37;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b = 38;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b = 39;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b = 40;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b = 41;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b = 42;
                }
                break;
            case 2154:
                if (str.equals(RegionRuleTag.f20494CM)) {
                    b = 43;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b = 44;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b = 45;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b = 46;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b = 47;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b = 48;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b = 49;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b = 50;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b = 51;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b = 52;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b = 53;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b = 54;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b = 55;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b = 56;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b = 57;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b = HttpTokens.COLON;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    b = HttpTokens.SEMI_COLON;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b = 60;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    b = 61;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b = 62;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    b = Utf8.REPLACEMENT_BYTE;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b = 64;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b = 65;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b = 66;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b = 67;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b = 68;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b = 69;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b = 70;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b = 71;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b = 72;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b = 73;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b = 74;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b = 75;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b = 76;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b = 77;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b = 78;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b = 79;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b = 80;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b = 81;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b = 82;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b = 83;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b = 84;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b = 85;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b = 86;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b = 87;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b = 88;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    b = 89;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b = 90;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b = 91;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b = 92;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    b = 93;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b = 94;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b = 95;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b = 96;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    b = 97;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b = 98;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b = 99;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b = 100;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    b = 101;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b = 102;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b = 103;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b = 104;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b = 105;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b = 106;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b = 107;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    b = 108;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b = 109;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b = 110;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b = 111;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    b = 112;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b = 113;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b = 114;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b = 115;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b = 116;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b = 117;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    b = 118;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b = 119;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    b = 120;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b = 121;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    b = 122;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b = 123;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b = 124;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b = 125;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b = 126;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b = 127;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    b = 128;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b = 129;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b = 130;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b = 131;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b = 132;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b = 133;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b = 134;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b = 135;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b = 136;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    b = 137;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b = 138;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b = 139;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b = 140;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b = 141;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b = 142;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b = 143;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b = 144;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b = 145;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b = 146;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b = 147;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b = 148;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b = 149;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b = 150;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b = 151;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b = 152;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b = 153;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b = 154;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b = 155;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b = 156;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b = 157;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b = 158;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    b = 159;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    b = 160;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b = 161;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b = 162;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b = 163;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b = 164;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b = 165;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    b = 166;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b = 167;
                }
                break;
            case 2555:
                if (str.equals(BLiveTraceServerLocation.f44461PK)) {
                    b = 168;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b = 169;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b = 170;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b = 171;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b = 172;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b = 173;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b = 174;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    b = 175;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b = 176;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b = 177;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b = 178;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b = 179;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    b = 180;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b = 181;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b = 182;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b = 183;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    b = 184;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b = 185;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b = 186;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b = 187;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b = PSSSigner.TRAILER_IMPLICIT;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b = 189;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    b = 190;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b = 191;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b = 192;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b = 193;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b = 194;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b = 195;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b = 196;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b = 197;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b = 198;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b = 199;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b = 200;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b = 201;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b = 202;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b = 203;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    b = 204;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b = 205;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    b = 206;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b = 207;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    b = 208;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b = 209;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b = 210;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b = 211;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b = 212;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    b = 213;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b = 214;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b = 215;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b = 216;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b = 217;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b = 218;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b = 219;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    b = 220;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b = 221;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b = 222;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    b = 223;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b = 224;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b = 225;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b = 226;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b = 227;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b = 228;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b = 229;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b = 230;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b = 231;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    b = 232;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b = 233;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b = 234;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b = 235;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b = 236;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b = 237;
                }
                break;
        }
        switch (b) {
            case 0:
            case 49:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 3, 4, 4, 2};
            case 2:
            case 166:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 3:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 4:
            case 16:
            case 25:
            case 28:
            case 56:
            case 68:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 3, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 8:
            case 62:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 10:
                return new int[]{1, 2, 1, 4, 1, 4};
            case 11:
                return new int[]{0, 2, 1, 1, 3, 0};
            case 12:
            case 85:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 13:
            case 50:
            case 120:
            case 140:
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
            case 193:
            case 223:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 14:
            case 19:
            case 58:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 15:
            case EACTags.LOGIN_DATA /* 94 */:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 17:
            case 116:
                return new int[]{2, 1, 2, 2, 2, 2};
            case 18:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
            case 63:
            case EACTags.DISCRETIONARY_DATA /* 83 */:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 21:
                return new int[]{1, 3, 1, 4, 4, 2};
            case 22:
            case EACTags.NAME /* 91 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
            case 153:
            case 204:
            case 225:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 23:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 24:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{3, 2, 0, 1, 2, 2};
            case 27:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 1, 2, 1, 1, 0};
            case 30:
            case 118:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 31:
            case 150:
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 32:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 33:
                return new int[]{1, 1, 2, 3, 2, 2};
            case 34:
            case 41:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 35:
                return new int[]{0, 2, 3, 3, 3, 3};
            case 36:
            case 111:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 37:
            case 183:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 38:
            case 76:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 39:
                return new int[]{0, 0, 0, 0, 0, 3};
            case 40:
            case 61:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 42:
                return new int[]{1, 1, 2, 1, 3, 2};
            case 43:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 44:
                return new int[]{2, 0, 4, 3, 3, 1};
            case 45:
                return new int[]{2, 3, 4, 2, 2, 2};
            case 46:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 47:
            case 110:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 48:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 51:
            case 90:
            case 126:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 52:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 53:
                return new int[]{0, 1, 3, 2, 2, 2};
            case 54:
            case 201:
            case 207:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 55:
            case 60:
            case EACTags.TAG_LIST /* 92 */:
            case 124:
            case 144:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 57:
                return new int[]{3, 4, 4, 4, 4, 2};
            case 59:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 65:
                return new int[]{0, 0, 0, 2, 0, 2};
            case 66:
                return new int[]{3, 1, 2, 3, 2, 2};
            case 67:
                return new int[]{4, 2, 3, 0, 2, 2};
            case 69:
                return new int[]{1, 1, 2, 1, 1, 2};
            case 70:
            case 205:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 71:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 72:
            case 112:
            case 115:
            case 119:
            case 200:
            case 224:
                return new int[]{1, 2, 0, 0, 2, 2};
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                return new int[]{1, 0, 0, 2, 2, 2};
            case 74:
            case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
            case 192:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 75:
                return new int[]{0, 2, 1, 0, 2, 2};
            case 77:
            case 103:
                return new int[]{1, 2, 0, 1, 2, 2};
            case 78:
            case 208:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 79:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 80:
                return new int[]{4, 4, 4, 2, 2, 2};
            case EACTags.FILE_REFERENCE /* 81 */:
                return new int[]{3, 1, 1, 3, 2, 2};
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
                return new int[]{4, 4, 3, 3, 2, 2};
            case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                return new int[]{2, 2, 2, 1, 1, 2};
            case EACTags.TRACK1_APPLICATION /* 86 */:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 87:
                return new int[]{3, 0, 1, 1, 2, 2};
            case 88:
                return new int[]{0, 1, 1, 3, 2, 0};
            case 89:
                return new int[]{3, 3, 2, 2, 2, 2};
            case EACTags.HEADER_LIST /* 93 */:
                return new int[]{3, 1, 1, 2, 3, 2};
            case 95:
                return new int[]{1, 2, 2, 3, 4, 2};
            case Opcodes.IADD /* 96 */:
                return new int[]{0, 2, 0, 1, 2, 2};
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
                return new int[]{1, 1, 2, 1, 2, 1};
            case EACTags.FCP_TEMPLATE /* 98 */:
            case 215:
            case 230:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 99:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 100:
                return new int[]{4, 2, 3, 3, 4, 2};
            case 101:
                return new int[]{0, 0, 1, 0, 0, 2};
            case 102:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 104:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 105:
                return new int[]{2, 0, 1, 1, 2, 2};
            case 106:
                return new int[]{0, 3, 3, 3, 4, 4};
            case 107:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 108:
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 109:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 113:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 114:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 117:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 121:
                return new int[]{3, 2, 3, 4, 4, 2};
            case 122:
                return new int[]{3, 4, 3, 4, 2, 2};
            case 123:
            case 219:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 125:
                return new int[]{1, 1, 4, 2, 0, 2};
            case 127:
            case 212:
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 128:
                return new int[]{3, 3, 2, 1, 2, 2};
            case MMConstants.ERR_WATERMARK_READ /* 129 */:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 130:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 131:
                return new int[]{2, 0, 0, 1, 1, 2};
            case 134:
                return new int[]{4, 2, 1, 3, 2, 2};
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                return new int[]{2, 0, 0, 1, 3, 2};
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
            case 217:
                return new int[]{3, 4, 2, 2, 2, 2};
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                return new int[]{2, 2, 2, 3, 4, 2};
            case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                return new int[]{2, 0, 1, 2, 2, 2};
            case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                return new int[]{0, 2, 4, 4, 4, 2};
            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                return new int[]{4, 2, 3, 4, 2, 2};
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
            case 182:
                return new int[]{3, 1, 1, 2, 2, 2};
            case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                return new int[]{3, 4, 1, 3, 3, 2};
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 148:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 149:
                return new int[]{1, 0, 4, 1, 2, 2};
            case 151:
                return new int[]{3, 4, 3, 2, 2, 2};
            case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                return new int[]{3, 2, 3, 4, 2, 2};
            case 154:
                return new int[]{3, 4, 2, 1, 2, 2};
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                return new int[]{2, 3, 4, 3, 2, 2};
            case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                return new int[]{0, 2, 3, 3, 0, 4};
            case 157:
                return new int[]{0, 1, 2, 1, 1, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 159:
                return new int[]{4, 0, 3, 2, 2, 2};
            case 160:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 161:
                return new int[]{1, 0, 2, 2, 4, 2};
            case 162:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 163:
                return new int[]{2, 3, 3, 3, 2, 2};
            case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 165:
            case Opcodes.IFNONNULL /* 199 */:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 167:
                return new int[]{2, 1, 3, 2, 2, 0};
            case 169:
                return new int[]{2, 1, 2, 2, 4, 2};
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                return new int[]{2, 0, 2, 0, 2, 1};
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                return new int[]{3, 4, 1, 4, 2, 2};
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                return new int[]{1, 0, 0, 0, 1, 2};
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                return new int[]{2, 2, 4, 2, 2, 2};
            case 176:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 177:
                return new int[]{1, 2, 2, 3, 1, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                return new int[]{2, 0, 0, 0, 2, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 3, 3};
            case 181:
                return new int[]{3, 3, 1, 0, 2, 2};
            case 184:
                return new int[]{4, 3, 1, 1, 2, 2};
            case 185:
                return new int[]{4, 3, 4, 2, 2, 2};
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                return new int[]{0, 1, 1, 1, 0, 2};
            case 187:
                return new int[]{2, 3, 3, 3, 3, 3};
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
                return new int[]{1, 1, 1, 1, 3, 2};
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                return new int[]{3, 2, 2, 4, 4, 2};
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                return new int[]{2, 4, 3, 0, 2, 2};
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
            case 210:
                return new int[]{4, 2, 2, 3, 2, 2};
            case Opcodes.IFNULL /* 198 */:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 202:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 203:
                return new int[]{2, 2, 1, 3, 2, 2};
            case 206:
                return new int[]{0, 1, 2, 1, 2, 2};
            case 209:
                return new int[]{4, 2, 4, 4, 2, 2};
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
            case 221:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 214:
                return new int[]{1, 4, 0, 0, 2, 2};
            case 216:
                return new int[]{0, 2, 0, 0, 0, 0};
            case 218:
                return new int[]{0, 1, 1, 2, 4, 2};
            case 220:
                return new int[]{1, 1, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 2, 3, 4, 3, 2};
            case 226:
                return new int[]{2, 2, 0, 1, 2, 2};
            case 227:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 228:
                return new int[]{0, 0, 1, 2, 2, 1};
            case 229:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 232:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 234:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 235:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 236:
                return new int[]{4, 4, 4, 3, 3, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    /* JADX INFO: renamed from: n */
    public static synchronized jld m142056n(Context context) {
        try {
            if (f118514v == null) {
                f118514v = new C17812b(context).m142066a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f118514v;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m142057o(C2047a c2047a, boolean z) {
        return z && !c2047a.m12105d(8);
    }

    @Override // p149l.l7j0
    /* JADX INFO: renamed from: a */
    public synchronized void mo142058a(a5c a5cVar, C2047a c2047a, boolean z) {
        try {
            if (m142057o(c2047a, z)) {
                if (this.f118520f == 0) {
                    this.f118521g = this.f118518d.elapsedRealtime();
                }
                this.f118520f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.fd2
    /* JADX INFO: renamed from: c */
    public synchronized long mo120875c() {
        return this.f118526l;
    }

    @Override // p149l.fd2
    /* JADX INFO: renamed from: d */
    public void mo120876d(Handler handler, fd2.InterfaceC16803a interfaceC16803a) {
        p11.m167011e(handler);
        p11.m167011e(interfaceC16803a);
        this.f118516b.m120882b(handler, interfaceC16803a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0011, B:13:0x002e, B:23:0x0060, B:22:0x0055), top: B:38:0x0001 }] */
    @Override // p149l.l7j0
    /* JADX INFO: renamed from: f */
    public synchronized void mo142060f(a5c a5cVar, C2047a c2047a, boolean z) throws Throwable {
        Throwable th;
        jld jldVar;
        try {
            try {
                if (m142057o(c2047a, z)) {
                    p11.m167013g(this.f118520f > 0);
                    long jElapsedRealtime = this.f118518d.elapsedRealtime();
                    int i = (int) (jElapsedRealtime - this.f118521g);
                    this.f118524j += (long) i;
                    long j = this.f118525k;
                    long j2 = this.f118522h;
                    this.f118525k = j + j2;
                    if (i > 0) {
                        this.f118517c.m219090c((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                        if (this.f118524j < 2000) {
                            try {
                                if (this.f118525k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                    this.f118526l = (long) this.f118517c.m219093f(0.5f);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            this.f118526l = (long) this.f118517c.m219093f(0.5f);
                        }
                        jldVar = this;
                        jldVar.m142063p(i, this.f118522h, this.f118526l);
                        jldVar.f118521g = jElapsedRealtime;
                        jldVar.f118522h = 0L;
                    } else {
                        jldVar = this;
                    }
                    jldVar.f118520f--;
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // p149l.fd2
    /* JADX INFO: renamed from: h */
    public void mo120879h(fd2.InterfaceC16803a interfaceC16803a) {
        this.f118516b.m120884d(interfaceC16803a);
    }

    @Override // p149l.l7j0
    /* JADX INFO: renamed from: i */
    public synchronized void mo142061i(a5c a5cVar, C2047a c2047a, boolean z, int i) {
        if (m142057o(c2047a, z)) {
            this.f118522h += (long) i;
        }
    }

    /* JADX INFO: renamed from: m */
    public final long m142062m(int i) {
        Long l2 = this.f118515a.get(Integer.valueOf(i));
        if (l2 == null) {
            l2 = this.f118515a.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    /* JADX INFO: renamed from: p */
    public final void m142063p(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.f118527m) {
            return;
        }
        this.f118527m = j2;
        this.f118516b.m120883c(i, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m142064q(int i) throws Throwable {
        Throwable th;
        try {
            try {
                int i2 = this.f118523i;
                if (i2 != 0) {
                    try {
                        if (!this.f118519e) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (this.f118528n) {
                    i = this.f118529o;
                }
                if (i2 == i) {
                    return;
                }
                this.f118523i = i;
                if (i == 1 || i == 0 || i == 8) {
                    return;
                }
                this.f118526l = m142062m(i);
                long jElapsedRealtime = this.f118518d.elapsedRealtime();
                m142063p(this.f118520f > 0 ? (int) (jElapsedRealtime - this.f118521g) : 0, this.f118522h, this.f118526l);
                this.f118521g = jElapsedRealtime;
                this.f118522h = 0L;
                this.f118525k = 0L;
                this.f118524j = 0L;
                this.f118517c.m219094g();
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

    @Override // p149l.fd2
    /* JADX INFO: renamed from: g */
    public l7j0 mo120878g() {
        return this;
    }

    @Override // p149l.l7j0
    /* JADX INFO: renamed from: b */
    public void mo142059b(a5c a5cVar, C2047a c2047a, boolean z) {
    }
}
