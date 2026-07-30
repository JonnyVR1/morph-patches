package p153l;

import android.os.Build;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.core.FepManager;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\tJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\tJ\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\tJ\u000f\u0010\"\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\"\u0010\tJ\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010 J\u000f\u0010&\u001a\u00020\u001eH\u0007¢\u0006\u0004\b&\u0010 J\u000f\u0010'\u001a\u00020\u0007H\u0007¢\u0006\u0004\b'\u0010\tR\u001a\u0010*\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b)\u0010\u0014¨\u0006+"}, m88121d2 = {"Ll/rs8;", "", "<init>", "()V", "Lcom/hellogroup/fep/base/core/FepManager;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lcom/hellogroup/fep/base/core/FepManager;", "", "q", "()Z", "b", "u", Constants.INAPP_DATA_TAG, "", "", "o", "()Ljava/util/Set;", "j", Constants.KEY_T, "m", "()Ljava/lang/String;", "e", BLiveStormDanmakuGiftResourceType.f45292l, "r", "isUIConfig", "g", "(Z)Ljava/lang/String;", "h", BaseSei.f14624X, "p", "", ResourceDirection.f39656v, "()I", "w", "a", "n", RXScreenCaptureService.KEY_INDEX, "k", "f", "c", "Ljava/lang/String;", "getLOG_TAG", "LOG_TAG", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class rs8 {
    public static final rs8 INSTANCE = new rs8();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String LOG_TAG = "CoreFepConfigUtils";

    private rs8() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m182910a() {
        return kt0.m151313a(INSTANCE.m182928s().m17589j("mkAllowSafeChecker", 1), true);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m182911b() {
        return kt0.m151315c(INSTANCE.m182928s().m17589j("discardMKLogIPErrorEnable", 0), 0, 1, null) == 1;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m182912c() {
        return kt0.m151313a(INSTANCE.m182928s().m17589j("enableOnlyHtmlRedirect", 0), false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m182913d() {
        return kt0.m151315c(INSTANCE.m182928s().m17589j("MKLogBridgeCallEnable", 0), 0, 1, null) == 1;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m182914e() {
        return kt0.m151315c(INSTANCE.m182928s().m17589j("MKAllowAllLogs", 0), 0, 1, null) == 1;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final int m182915f() {
        return kt0.m151314b(INSTANCE.m182928s().m17589j("mkAndroid302LogPercentage", 0), 0);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m182916g(boolean isUIConfig) {
        return kt0.m151317e(INSTANCE.m182928s().m17589j(isUIConfig ? "MKUIBlackHosts" : "MKLogBlackHosts", WeJson.EMPTY_ARR), WeJson.EMPTY_ARR);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m182917h(boolean isUIConfig) {
        return kt0.m151317e(INSTANCE.m182928s().m17589j(isUIConfig ? "MKUIBlackUrls" : "MKLogBlackUrls", WeJson.EMPTY_ARR), WeJson.EMPTY_ARR);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final int m182918i() {
        return kt0.m151314b(INSTANCE.m182928s().m17589j("cleanwebviewLoadThirdUrlLogPercentage", 0), 0);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final Set<String> m182919j() {
        FepManager fepManagerM182928s = INSTANCE.m182928s();
        String str = WeJson.EMPTY_ARR;
        String strM151327o = kt0.m151327o(fepManagerM182928s.m17589j("discardBridgeList", WeJson.EMPTY_ARR));
        if (strM151327o != null) {
            str = strM151327o;
        }
        if (i8g0.m139002d(str)) {
            if (C15493d.m94374J(StringsKt.m94324Z0(str).toString(), "[", false, 2, null)) {
                JSONArray jSONArray = new JSONArray(str);
                HashSet hashSet = new HashSet(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.optString(i));
                }
                return hashSet;
            }
        }
        return SetsKt.emptySet();
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final int m182920k() {
        return kt0.m151314b(INSTANCE.m182928s().m17589j("mkLoadThirdUrlLogPercentage", 0), 0);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m182921l() {
        return kt0.m151315c(INSTANCE.m182928s().m17589j("MKLogEnhanceEnable", 1), 0, 1, null) == 1;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m182922m() {
        String strM151327o = kt0.m151327o(INSTANCE.m182928s().m17589j("mkSafetyWhiteHosts", "\n[\n  \"+.momocdn.com\",\n  \"+.modd.vip\",\n  \"+.soulchil.live\",\n  \"+.soulchill.live\",\n  \"+.hellogroup.com\",\n  \"+.zhiqiuapp.com\",\n  \"+.soulchillcdn.com\",\n  \"+.ihani.tv\",\n  \"+.heybud.world\",\n  \"+.igamesofficial.com\",\n  \"+.meetlovapp.com\",\n  \"+.korvor.com\",\n  \"+.zao-ai-tech.com\",\n  \"+.zao-ai-deep.com\",\n  \"+.zao-ai-factory.com\",\n  \"+.zao-ai-lab.com\",\n  \"+.deepzao.com\",\n  \"+.zao-ai-industry.com\",\n  \"+.iwoniuapp.com\",\n  \"+.uchikare.com\",\n  \"+.mokatech.cn\",\n  \"+.doki.ren\",\n  \"+.theamarapp.com\",\n  \"+.bjwmpp.com\",\n  \"+.hellogroupcdn.com\",\n  \"+.hertownapp.com\",\n  \"+.yaahlan.fun\",\n  \"+.picwell.art\",\n  \"+.momopictures.cn\",\n  \"+.momoapk.com\",\n  \"+.spacecape.com\",\n  \"+.imkaka.com\",\n  \"+.wemomo.com\",\n  \"+.hellogroupjapan.com\",\n  \"+.immomo.com\",\n  \"+.hertownapp.cn\",\n  \"+.immomogame.com\",\n  \"+.outbase.cn\",\n  \"+.hellosrc.xyz\",\n  \"+.inspaze.cn\"\n]\n    "));
        return strM151327o != null ? strM151327o : "\n[\n  \"+.momocdn.com\",\n  \"+.modd.vip\",\n  \"+.soulchil.live\",\n  \"+.soulchill.live\",\n  \"+.hellogroup.com\",\n  \"+.zhiqiuapp.com\",\n  \"+.soulchillcdn.com\",\n  \"+.ihani.tv\",\n  \"+.heybud.world\",\n  \"+.igamesofficial.com\",\n  \"+.meetlovapp.com\",\n  \"+.korvor.com\",\n  \"+.zao-ai-tech.com\",\n  \"+.zao-ai-deep.com\",\n  \"+.zao-ai-factory.com\",\n  \"+.zao-ai-lab.com\",\n  \"+.deepzao.com\",\n  \"+.zao-ai-industry.com\",\n  \"+.iwoniuapp.com\",\n  \"+.uchikare.com\",\n  \"+.mokatech.cn\",\n  \"+.doki.ren\",\n  \"+.theamarapp.com\",\n  \"+.bjwmpp.com\",\n  \"+.hellogroupcdn.com\",\n  \"+.hertownapp.com\",\n  \"+.yaahlan.fun\",\n  \"+.picwell.art\",\n  \"+.momopictures.cn\",\n  \"+.momoapk.com\",\n  \"+.spacecape.com\",\n  \"+.imkaka.com\",\n  \"+.wemomo.com\",\n  \"+.hellogroupjapan.com\",\n  \"+.immomo.com\",\n  \"+.hertownapp.cn\",\n  \"+.immomogame.com\",\n  \"+.outbase.cn\",\n  \"+.hellosrc.xyz\",\n  \"+.inspaze.cn\"\n]\n    ";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final Set<String> m182923n() {
        String strM151317e = kt0.m151317e(INSTANCE.m182928s().m17589j("mkSafeProtocols", WeJson.EMPTY_ARR), WeJson.EMPTY_ARR);
        if (!StringsKt.m94329e0(strM151317e)) {
            if (strM151317e == null) {
                C0799b.m4641a("null cannot be cast to non-null type kotlin.CharSequence");
                return null;
            }
            if (C15493d.m94374J(StringsKt.m94324Z0(strM151317e).toString(), "[", false, 2, null)) {
                try {
                    JSONArray jSONArray = new JSONArray(strM151317e);
                    IntRange intRangeM88496l = C15274a.m88496l(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM88496l, 10));
                    Iterator<Integer> it = intRangeM88496l.iterator();
                    while (it.hasNext()) {
                        arrayList.add(jSONArray.optString(((IntIterator) it).nextInt(), ""));
                    }
                    return CollectionsKt.toSet(arrayList);
                } catch (Throwable th) {
                    jzv.m147730c(LOG_TAG, "getMkSafeProtocols", th);
                    return SetsKt.emptySet();
                }
            }
        }
        return SetsKt.emptySet();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final Set<String> m182924o() {
        FepManager fepManagerM182928s = INSTANCE.m182928s();
        String str = WeJson.EMPTY_ARR;
        String strM151327o = kt0.m151327o(fepManagerM182928s.m17589j("reportBridgeList", WeJson.EMPTY_ARR));
        if (strM151327o != null) {
            str = strM151327o;
        }
        if (i8g0.m139002d(str)) {
            if (C15493d.m94374J(StringsKt.m94324Z0(str).toString(), "[", false, 2, null)) {
                JSONArray jSONArray = new JSONArray(str);
                HashSet hashSet = new HashSet(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.optString(i));
                }
                return hashSet;
            }
        }
        return SetsKt.emptySet();
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m182925p() {
        return kt0.m151313a(INSTANCE.m182928s().m17589j("requestDispatchEnable", 0), false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final boolean m182926q() {
        int iM151315c = kt0.m151315c(INSTANCE.m182928s().m17589j("mkAndroidDisableJsLocationReplacePercentage", 0), 0, 1, null);
        return iM151315c > 0 && new Random().nextInt(100) < iM151315c;
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final boolean m182927r() {
        String strM151327o = kt0.m151327o(INSTANCE.m182928s().m17589j("foldDeviceModelList", WeJson.EMPTY_ARR));
        if (i8g0.m139002d(strM151327o) && !WeJson.EMPTY_ARR.equals(strM151327o)) {
            try {
                JSONArray jSONArray = new JSONArray(strM151327o);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strOptString = jSONArray.optString(i, "");
                    strOptString.getClass();
                    if (strOptString == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = strOptString.toLowerCase();
                    lowerCase.getClass();
                    String str = Build.MODEL;
                    str.getClass();
                    if (str == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase2 = str.toLowerCase();
                    lowerCase2.getClass();
                    if (Objects.equals(lowerCase, lowerCase2)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    private final FepManager m182928s() {
        return FepManager.INSTANCE.m17610a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final boolean m182929t() {
        return kt0.m151315c(INSTANCE.m182928s().m17589j("mkOpenBridgeSafetyCheck", 0), 0, 1, null) == 1;
    }

    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final boolean m182930u() {
        return kt0.m151315c(INSTANCE.m182928s().m17589j("mkFDTBridgeEnable", 0), 0, 1, null) == 1;
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final int m182931v() {
        return kt0.m151314b(INSTANCE.m182928s().m17589j("mkSecondPkgFrequency", 0), 0);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final boolean m182932w() {
        return kt0.m151313a(INSTANCE.m182928s().m17589j("mkSecondPkgUpdateEnable", 0), false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: x */
    public static final boolean m182933x() {
        return kt0.m151313a(INSTANCE.m182928s().m17589j("mkInjectJsMonitorAndroidSwitch", 0), false);
    }
}
