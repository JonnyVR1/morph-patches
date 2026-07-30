package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p153l.jj5;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1oSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int areAllFieldsValid = 0;
    private static char component2 = 0;
    private static int component3 = 1;
    private static char component4;
    private static char getCurrencyIso4217Code;
    private static char getMediationNetwork;
    private static long getRevenue;
    private final Map<String, Object> AFAdRevenueData;
    private final Context getMonetizationNetwork;

    public static class AFa1zSDK {
        public static byte[] AFAdRevenueData(@NonNull byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        public static byte[] getMediationNetwork(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }
    }

    static {
        getCurrencyIso4217Code();
        ViewConfiguration.getTapTimeout();
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getScrollBarSize();
        ExpandableListView.getPackedPositionForGroup(0);
        TextUtils.indexOf("", "", 0, 0);
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getEdgeSlop();
        int i = component3 + 11;
        areAllFieldsValid = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public AFd1oSDK(Map<String, Object> map, Context context) {
        this.AFAdRevenueData = map;
        this.getMonetizationNetwork = context;
        put(AFAdRevenueData(), getMonetizationNetwork());
    }

    @NonNull
    private String AFAdRevenueData() {
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.AFAdRevenueData;
            Object[] objArr = new Object[1];
            m5234a("䁷\ue88dᆳ몕\ue38bಊ떝\ude8eފ낒\ud999ʹ", Drawable.resolveOpacity(0, 0) + 43261, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFAdRevenueData;
            Object[] objArr2 = new Object[1];
            m5234a("䁴⨑钝缧\ue9a6", 27253 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                areAllFieldsValid = (component3 + 77) % 128;
                Object[] objArr3 = new Object[1];
                m5234a("䁘ゼꆃዻ菐琮\ue506嘑", 28901 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 0 : -1)), objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(string2);
            sb.reverse();
            StringBuilder sbAFAdRevenueData = AFAdRevenueData(string, string3, sb.toString());
            int length = sbAFAdRevenueData.length();
            if (length > 4) {
                int i = areAllFieldsValid + 11;
                component3 = i % 128;
                if (i % 2 == 0) {
                    sbAFAdRevenueData.delete(3, length);
                } else {
                    sbAFAdRevenueData.delete(4, length);
                }
            } else {
                while (length < 4) {
                    length++;
                    sbAFAdRevenueData.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            m5234a("䁽\uf79c⾮", 47087 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
            sbAFAdRevenueData.insert(0, ((String) objArr4[0]).intern());
            return sbAFAdRevenueData.toString();
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            m5235b("헩⃨\uf147\uef2e搼肤䈵ꥼ\udb0e陉諑발歈\uf770븂僓헩⃨㽞唟嬤情쳉襥衕᛫\udc8c֘\uf350撞埙멠\uf350撞\udb0e陉ﱙ츺碐蒿", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            m5234a("䁰\uf0c6ℝ剩芷㌇搐钦엻癁ꚙ\ud7ff࠻뢟\ue9d1ᨧ䭡ﯷⰏ嵐趤㺳潋龔탷ſ놛\ue2d4ጾ䑳\uf488├噎蚤㟱桕领짪稿ꪏ\udb84౯", 45233 - Color.argb(0, 0, 0, 0), objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr7 = new Object[1];
            m5235b("\uf350撞ْ퐶밼ᾯ툵씌", 7 - Color.green(0), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5234a(String str, int i, Object[] objArr) {
        int i2;
        Object obj = str;
        if (str != null) {
            char[] charArray = str.toCharArray();
            $11 = ($10 + 63) % 128;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        AFj1cSDK aFj1cSDK = new AFj1cSDK();
        aFj1cSDK.getMediationNetwork = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFj1cSDK.AFAdRevenueData = 0;
        while (true) {
            int i3 = aFj1cSDK.AFAdRevenueData;
            if (i3 >= cArr.length) {
                break;
            }
            $11 = ($10 + 61) % 128;
            jArr[i3] = (((long) cArr[i3]) ^ (((long) i3) * ((long) aFj1cSDK.getMediationNetwork))) ^ (getRevenue ^ 2235243855485106574L);
            aFj1cSDK.AFAdRevenueData = i3 + 1;
        }
        char[] cArr2 = new char[length];
        aFj1cSDK.AFAdRevenueData = 0;
        while (true) {
            int i4 = aFj1cSDK.AFAdRevenueData;
            if (i4 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i5 = $11 + 95;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr2[i4] = (char) jArr[i4];
                i2 = i4 - 1;
            } else {
                cArr2[i4] = (char) jArr[i4];
                i2 = i4 + 1;
            }
            aFj1cSDK.AFAdRevenueData = i2;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m5235b(String str, int i, Object[] objArr) {
        char[] charArray;
        int i2 = $11 + 71;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            charArray = str.toCharArray();
            $11 = ($10 + 9) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        AFj1aSDK aFj1aSDK = new AFj1aSDK();
        char[] cArr2 = new char[cArr.length];
        aFj1aSDK.getCurrencyIso4217Code = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = aFj1aSDK.getCurrencyIso4217Code;
            if (i3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[i3];
            cArr3[1] = cArr[i3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = ($10 + 41) % 128;
                $11 = i6;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (((long) component4) ^ (-4684633429643392075L))))) ^ ((c2 >>> 5) + ((char) (((long) component2) ^ (-4684633429643392075L))))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) getCurrencyIso4217Code) ^ (-4684633429643392075L)))) ^ ((c3 + i4) ^ ((c3 << 4) + ((char) (((long) getMediationNetwork) ^ (-4684633429643392075L)))))));
                i4 -= 40503;
                i5++;
                $10 = (i6 + 73) % 128;
            }
            int i7 = aFj1aSDK.getCurrencyIso4217Code;
            cArr2[i7] = cArr3[0];
            cArr2[i7 + 1] = cArr3[1];
            aFj1aSDK.getCurrencyIso4217Code = i7 + 2;
        }
    }

    public static void getCurrencyIso4217Code() {
        getRevenue = -6745449825528039016L;
        getMediationNetwork = (char) 38994;
        getCurrencyIso4217Code = (char) 63598;
        component4 = (char) 2542;
        component2 = (char) 19162;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x017b  */
    private String getMonetizationNetwork() {
        String string;
        int i;
        try {
            Map<String, Object> map = this.AFAdRevenueData;
            Object[] objArr = new Object[1];
            m5234a("䁷\ue88dᆳ몕\ue38bಊ떝\ude8eފ낒\ud999ʹ", Color.green(0) + 43261, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFAdRevenueData;
            Object[] objArr2 = new Object[1];
            m5234a("䁰솠䏚엸䜞줁䭍쵺亀킢勈퓇嘃\ud831婁", TextUtils.indexOf("", "") + 33247, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            m5235b("洃\uf1efퟲ\ue38e칷薪", 6 - Color.alpha(0), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            m5234a("䀻\ue4b5ৗ깋퍸", Color.blue(0) + 42193, objArr4);
            String strReplaceAll = strIntern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb = new StringBuilder();
            sb.append(string2);
            sb.append(string3);
            sb.append(strReplaceAll);
            string = AFb1iSDK.getCurrencyIso4217Code(sb.toString()).substring(0, 16);
            component3 = (areAllFieldsValid + 71) % 128;
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            m5235b("\uf28eﰾ̖ᨹ降ॣ崡ᄘ씖\ue3ceﳇ\uf446絠⺞肨礏ృᗧ\uf28eﰾ\ue640䋽魟郟礎瑿ﱾ䋬鋢㪆唯䙺웾\ue62f崡ᄘ씖\ue3ce", 38 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            m5235b("諑발歈\uf770븂僓헩⃨㽞唟嬤情쳉襥衕᛫\udc8c֘\uf350撞埙멠佱䲯\uffdf섨虱ꨆﱙ츺碐蒿▯ᯬ䍡ႝ끝祪礎瑿꙰ؗ⡉ᱜ", (Process.myTid() >> 22) + 44, objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e);
            AFLogger.afRDLog(sb2.toString());
            StringBuilder sb3 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            m5235b("匡\uf577㙬㭿뢩㲁\uf28c\uf5be影\ue348꼤哏䪈ᶈ脒\uf439暮\uf370", KeyEvent.keyCodeFromString("") + 18, objArr7);
            sb3.append(((String) objArr7[0]).intern());
            string = sb3.toString();
        }
        try {
            Context context = this.getMonetizationNetwork;
            Object[] objArr8 = new Object[1];
            m5234a("䁷ᣵ\uf168䧃≍諭匼⯣萗岍㗠蹼曤㽋鞎瀴좥ꄿ禕툎ꭼΩ\udc4a듼ൺ\ue587븁᚛\uef23䞰⃓淚凷⩵苫嬔㎆", KeyEvent.normalizeMetaState(0) + 22669, objArr8);
            Intent intentM145018l = jj5.m145018l(context, null, new IntentFilter(((String) objArr8[0]).intern()));
            int intExtra = -2700;
            if (intentM145018l != null) {
                Object[] objArr9 = new Object[1];
                m5234a("䁢霈\uee8d옗ᶟ甃䲕ꐿ﮻팷⪽", 55163 - View.MeasureSpec.getMode(0), objArr9);
                intExtra = intentM145018l.getIntExtra(((String) objArr9[0]).intern(), -2700);
            }
            String str = this.getMonetizationNetwork.getApplicationInfo().nativeLibraryDir;
            if (str != null) {
                Object[] objArr10 = new Object[1];
                m5235b("佩㈿薘䉟", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, objArr10);
                if (str.contains(((String) objArr10[0]).intern())) {
                    int i2 = component3 + 79;
                    areAllFieldsValid = i2 % 128;
                    if (i2 % 2 != 0) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
            Context context2 = this.getMonetizationNetwork;
            Object[] objArr11 = new Object[1];
            m5235b("쌔㸶䲶僗糸갵", Color.green(0) + 6, objArr11);
            int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr12 = new Object[1];
            m5235b("槗퓋", 1 - View.resolveSizeAndState(0, 0, 0), objArr12);
            sb4.append(((String) objArr12[0]).intern());
            sb4.append(intExtra);
            Object[] objArr13 = new Object[1];
            m5235b("፮奠", (ViewConfiguration.getScrollBarSize() >> 8) + 2, objArr13);
            sb4.append(((String) objArr13[0]).intern());
            sb4.append(i);
            Object[] objArr14 = new Object[1];
            m5235b("뮎㑚", 2 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr14);
            sb4.append(((String) objArr14[0]).intern());
            sb4.append(size);
            Object[] objArr15 = new Object[1];
            m5235b("䒨ꝓ", 2 - View.resolveSizeAndState(0, 0, 0), objArr15);
            sb4.append(((String) objArr15[0]).intern());
            sb4.append(this.AFAdRevenueData.size());
            String string4 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string);
            byte[] bArrAFAdRevenueData = AFa1zSDK.AFAdRevenueData(AFa1zSDK.getMediationNetwork(string4));
            StringBuilder sb6 = new StringBuilder();
            for (byte b : bArrAFAdRevenueData) {
                String hexString = Integer.toHexString(b);
                if (hexString.length() == 1) {
                    hexString = "0".concat(hexString);
                }
                sb6.append(hexString);
            }
            sb5.append(sb6.toString());
            return sb5.toString();
        } catch (Exception e2) {
            Object[] objArr16 = new Object[1];
            m5234a("䁱\ueae6ᕈ뿿\uea70ᒩ뼉\uea69ᓋ뽎\ue9e4ᐔ뺘\ue9f5ᑟ뻟", 43669 - View.MeasureSpec.getMode(0), objArr16);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e2);
            StringBuilder sb7 = new StringBuilder();
            Object[] objArr17 = new Object[1];
            m5235b("諑발歈\uf770븂僓헩⃨㽞唟嬤情쳉襥衕᛫\udc8c֘\uf350撞埙멠佱䲯\uffdf섨虱ꨆﱙ츺碐蒿▯ᯬ䍡ႝ끝祪礎瑿꙰ؗ⡉ᱜ", ExpandableListView.getPackedPositionChild(0L) + 45, objArr17);
            sb7.append(((String) objArr17[0]).intern());
            sb7.append(e2);
            AFLogger.afRDLog(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string);
            Object[] objArr18 = new Object[1];
            m5235b("ﮝ쫤呖襳\uf786앜\u181b保䎴㛄雮썂⠳酣砙\ue5bd", 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr18);
            sb8.append(((String) objArr18[0]).intern());
            return sb8.toString();
        }
    }

    private static StringBuilder AFAdRevenueData(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < 3) {
            int i2 = areAllFieldsValid + 93;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i += 110;
            } else {
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
            }
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < iIntValue; i3++) {
            int i4 = (areAllFieldsValid + 19) % 128;
            component3 = i4;
            areAllFieldsValid = (i4 + 53) % 128;
            Integer numValueOf = null;
            for (int i5 = 0; i5 < 3; i5++) {
                int iCharAt = strArr[i5].charAt(i3);
                if (numValueOf == null) {
                    component3 = (areAllFieldsValid + 11) % 128;
                } else {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
            }
            sb.append(Integer.toHexString(numValueOf.intValue()));
        }
        return sb;
    }
}
