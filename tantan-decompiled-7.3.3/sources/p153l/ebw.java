package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.ResourcesUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.BuzzRegion;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.dbcenter.parse.JsonParseHelper;
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
import kotlin.text.C15493d;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 ¨\u0006\""}, m88121d2 = {"Ll/ebw;", "", "<init>", "()V", "", "c", "b", "Lcom/p1/mobile/putong/data/Region;", "region", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/data/Region;)Ljava/lang/Integer;", "", "mccList", "Ll/gq3;", "g", "(Ljava/util/List;)Ljava/util/List;", "mcc", "", "h", "(I)Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/BuzzRegion;", "f", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/BuzzRegion;", "e", "(I)Ll/gq3;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "buzzRegions", "", "[Ljava/lang/Integer;", "buzzMCCs", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ebw {

    @NotNull
    public static final ebw INSTANCE = new ebw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static ArrayList<BuzzRegion> buzzRegions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Integer[] buzzMCCs;

    /* JADX INFO: renamed from: a */
    public static void m120279a() {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = CoreModule.f18263b.getResources().getAssets().open("intl_buzz_country_area_info.json");
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
    public final void m120280b() {
        if (NullChecker.m82486a(buzzMCCs)) {
            return;
        }
        buzzMCCs = new Integer[]{-1, 0, 440, 302, 234, Integer.valueOf(HttpStatus.HTTP_VERSION_NOT_SUPPORTED_505), 310, 530, 510, Integer.valueOf(HttpStatus.BAD_GATEWAY_502), 450, 525, 515, 602, 520};
    }

    /* JADX INFO: renamed from: c */
    public final void m120281c() {
        if (NullChecker.m82486a(buzzRegions)) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.dbw
            @Override // java.lang.Runnable
            public final void run() {
                ebw.m120279a();
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Integer m120282d(@Nullable Region region) {
        String str;
        String lowerCase = null;
        if (region != null && buzzRegions != null) {
            String str2 = region.country;
            String str3 = region.city;
            if ((TextUtils.equals(str2, "中国") || TextUtils.equals(str2, "China")) && (TextUtils.equals(str3, "香港") || TextUtils.equals(str3, "Hongkong") || TextUtils.equals(str3, "澳门") || TextUtils.equals(str3, "Macao"))) {
                str2 = str3;
            }
            BuzzRegion buzzRegionM120284f = m120284f(str2);
            if (NullChecker.m82486a(buzzRegionM120284f)) {
                if (buzzRegionM120284f != null && (str = buzzRegionM120284f.countryCode) != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                return Integer.valueOf(ResourcesUtils.m30641a("core_intl_buzz_" + lowerCase + "_icon", ResourcesUtils.TYPE.DRAWABLE));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final gq3 m120283e(int mcc) {
        Integer[] numArr = buzzMCCs;
        if (numArr == null) {
            return null;
        }
        for (Integer num : numArr) {
            if (num.intValue() == mcc) {
                return new gq3(mcc, INSTANCE.m120286h(mcc));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final BuzzRegion m120284f(String region) {
        if (region != null && buzzRegions != null) {
            String language = Locale.getDefault().getLanguage();
            language.getClass();
            if (C15493d.m94374J(language, "zh", false, 2, null)) {
                ArrayList<BuzzRegion> arrayList = buzzRegions;
                if (arrayList != null) {
                    for (BuzzRegion buzzRegion : arrayList) {
                        if (TextUtils.equals(buzzRegion.nameZh, region)) {
                            return buzzRegion;
                        }
                    }
                }
            } else if (C15493d.m94374J(language, "ko", false, 2, null)) {
                ArrayList<BuzzRegion> arrayList2 = buzzRegions;
                if (arrayList2 != null) {
                    for (BuzzRegion buzzRegion2 : arrayList2) {
                        if (TextUtils.equals(buzzRegion2.nameKo, region)) {
                            return buzzRegion2;
                        }
                    }
                }
            } else if (C15493d.m94374J(language, "ja", false, 2, null)) {
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
    public final List<gq3> m120285g(@Nullable List<Integer> mccList) {
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new gq3(-1, k3d0.m148007c(R$string.f20906G)), new gq3(0, k3d0.m148007c(R$string.f20912J)));
        if (mccList != null) {
            Iterator<T> it = mccList.iterator();
            while (it.hasNext()) {
                gq3 gq3VarM120283e = INSTANCE.m120283e(((Number) it.next()).intValue());
                if (gq3VarM120283e != null) {
                    arrayListArrayListOf.add(gq3VarM120283e);
                }
            }
        }
        return arrayListArrayListOf;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final String m120286h(int mcc) {
        int i;
        if (mcc == -1) {
            return k3d0.m148007c(R$string.f20906G);
        }
        if (mcc == 0) {
            return k3d0.m148007c(R$string.f20912J);
        }
        if (mcc == -1) {
            i = R$string.f20906G;
        } else if (mcc != 0) {
            switch (mcc) {
                case 234:
                    i = R$string.f20975j1;
                    break;
                case 302:
                    i = R$string.f20963f1;
                    break;
                case 310:
                    i = R$string.f20978k1;
                    break;
                case 440:
                    i = R$string.f20969h1;
                    break;
                case 450:
                    i = R$string.f20910I;
                    break;
                case HttpStatus.BAD_GATEWAY_502 /* 502 */:
                    i = R$string.f20914K;
                    break;
                case HttpStatus.HTTP_VERSION_NOT_SUPPORTED_505 /* 505 */:
                    i = R$string.f20960e1;
                    break;
                case 510:
                    i = R$string.f20966g1;
                    break;
                case 515:
                    i = R$string.f20916L;
                    break;
                case 520:
                    i = R$string.f20928R;
                    break;
                case 525:
                    i = R$string.f20918M;
                    break;
                case 530:
                    i = R$string.f20972i1;
                    break;
                case 602:
                    i = R$string.f20908H;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            i = R$string.f20912J;
        }
        return i == -1 ? "" : k3d0.m148007c(i);
    }
}
