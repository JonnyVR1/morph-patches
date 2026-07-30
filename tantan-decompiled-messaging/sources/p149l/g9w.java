package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.ResourcesUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.BuzzRegion;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 ¨\u0006\""}, m87232d2 = {"Ll/g9w;", "", "<init>", "()V", "", "c", "b", "Lcom/p1/mobile/putong/data/Region;", "region", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/data/Region;)Ljava/lang/Integer;", "", "mccList", "Ll/gp3;", "g", "(Ljava/util/List;)Ljava/util/List;", "mcc", "", "h", "(I)Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/BuzzRegion;", "f", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/BuzzRegion;", "e", "(I)Ll/gp3;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "buzzRegions", "", "[Ljava/lang/Integer;", "buzzMCCs", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class g9w {

    @NotNull
    public static final g9w INSTANCE = new g9w();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static ArrayList<BuzzRegion> buzzRegions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Integer[] buzzMCCs;

    /* JADX INFO: renamed from: a */
    public static void m124850a() {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = CoreModule.f17544b.getResources().getAssets().open("intl_buzz_country_area_info.json");
            inputStreamOpen.getClass();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    sb.append(line);
                }
            }
            bufferedReader.close();
            inputStreamReader.close();
            inputStreamOpen.close();
            List list = JsonParseHelper.parseList(sb.toString(), BuzzRegion.JSON_ADAPTER);
            buzzRegions = list instanceof ArrayList ? (ArrayList) list : null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m124851b() {
        if (NullChecker.m81303a(buzzMCCs)) {
            return;
        }
        buzzMCCs = new Integer[]{-1, 0, 440, 302, 234, Integer.valueOf(HttpStatus.HTTP_VERSION_NOT_SUPPORTED_505), 310, 530, 510, Integer.valueOf(HttpStatus.BAD_GATEWAY_502), 450, 525, 515, 602, 520};
    }

    /* JADX INFO: renamed from: c */
    public final void m124852c() {
        if (NullChecker.m81303a(buzzRegions)) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.f9w
            @Override // java.lang.Runnable
            public final void run() {
                g9w.m124850a();
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Integer m124853d(@Nullable Region region) {
        String str;
        String lowerCase = null;
        if (region != null && buzzRegions != null) {
            String str2 = region.country;
            String str3 = region.city;
            if ((TextUtils.equals(str2, "中国") || TextUtils.equals(str2, "China")) && (TextUtils.equals(str3, "香港") || TextUtils.equals(str3, "Hongkong") || TextUtils.equals(str3, "澳门") || TextUtils.equals(str3, "Macao"))) {
                str2 = str3;
            }
            BuzzRegion buzzRegionM124855f = m124855f(str2);
            if (NullChecker.m81303a(buzzRegionM124855f)) {
                if (buzzRegionM124855f != null && (str = buzzRegionM124855f.countryCode) != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                return Integer.valueOf(ResourcesUtils.m29643a("core_intl_buzz_" + lowerCase + "_icon", ResourcesUtils.TYPE.DRAWABLE));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final gp3 m124854e(int mcc) {
        Integer[] numArr = buzzMCCs;
        if (numArr == null) {
            return null;
        }
        for (Integer num : numArr) {
            if (num.intValue() == mcc) {
                return new gp3(mcc, INSTANCE.m124857h(mcc));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final BuzzRegion m124855f(String region) {
        if (region != null && buzzRegions != null) {
            String language = Locale.getDefault().getLanguage();
            language.getClass();
            if (C15386d.m93483J(language, "zh", false, 2, null)) {
                ArrayList<BuzzRegion> arrayList = buzzRegions;
                if (arrayList != null) {
                    for (BuzzRegion buzzRegion : arrayList) {
                        if (TextUtils.equals(buzzRegion.nameZh, region)) {
                            return buzzRegion;
                        }
                    }
                }
            } else if (C15386d.m93483J(language, "ko", false, 2, null)) {
                ArrayList<BuzzRegion> arrayList2 = buzzRegions;
                if (arrayList2 != null) {
                    for (BuzzRegion buzzRegion2 : arrayList2) {
                        if (TextUtils.equals(buzzRegion2.nameKo, region)) {
                            return buzzRegion2;
                        }
                    }
                }
            } else if (C15386d.m93483J(language, "ja", false, 2, null)) {
                ArrayList<BuzzRegion> arrayList3 = buzzRegions;
                if (arrayList3 != null) {
                    for (BuzzRegion buzzRegion3 : arrayList3) {
                        if (TextUtils.equals(buzzRegion3.nameJa, region)) {
                            return buzzRegion3;
                        }
                    }
                }
            } else {
                ArrayList<BuzzRegion> arrayList4 = buzzRegions;
                if (arrayList4 != null) {
                    for (BuzzRegion buzzRegion4 : arrayList4) {
                        if (TextUtils.equals(buzzRegion4.nameEn, region)) {
                            return buzzRegion4;
                        }
                    }
                }
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<gp3> m124856g(@Nullable List<Integer> mccList) {
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new gp3(-1, hvc0.m133156c(R$string.f20164G)), new gp3(0, hvc0.m133156c(R$string.f20170J)));
        if (mccList != null) {
            Iterator<T> it = mccList.iterator();
            while (it.hasNext()) {
                gp3 gp3VarM124854e = INSTANCE.m124854e(((Number) it.next()).intValue());
                if (gp3VarM124854e != null) {
                    arrayListArrayListOf.add(gp3VarM124854e);
                }
            }
        }
        return arrayListArrayListOf;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final String m124857h(int mcc) {
        int i;
        if (mcc == -1) {
            return hvc0.m133156c(R$string.f20164G);
        }
        if (mcc == 0) {
            return hvc0.m133156c(R$string.f20170J);
        }
        if (mcc == -1) {
            i = R$string.f20164G;
        } else if (mcc != 0) {
            switch (mcc) {
                case 234:
                    i = R$string.f20233j1;
                    break;
                case 302:
                    i = R$string.f20221f1;
                    break;
                case 310:
                    i = R$string.f20236k1;
                    break;
                case 440:
                    i = R$string.f20227h1;
                    break;
                case 450:
                    i = R$string.f20168I;
                    break;
                case HttpStatus.BAD_GATEWAY_502 /* 502 */:
                    i = R$string.f20172K;
                    break;
                case HttpStatus.HTTP_VERSION_NOT_SUPPORTED_505 /* 505 */:
                    i = R$string.f20218e1;
                    break;
                case 510:
                    i = R$string.f20224g1;
                    break;
                case 515:
                    i = R$string.f20174L;
                    break;
                case 520:
                    i = R$string.f20186R;
                    break;
                case 525:
                    i = R$string.f20176M;
                    break;
                case 530:
                    i = R$string.f20230i1;
                    break;
                case 602:
                    i = R$string.f20166H;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            i = R$string.f20170J;
        }
        return i == -1 ? "" : hvc0.m133156c(i);
    }
}
