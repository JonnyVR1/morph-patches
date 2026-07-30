package p149l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalIcon;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class h9g {

    /* JADX INFO: renamed from: a */
    public static ww3<String, Drawable.ConstantState> f106579a = new ww3<>();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ imf0 m129995d(a9g a9gVar) {
        return a9gVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ a9g m129996e(String str, String str2, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.isRecycled() || bitmap2.isRecycled()) {
            return null;
        }
        a9g a9gVar = new a9g(bitmap.copy(bitmap.getConfig(), false), bitmap2.copy(bitmap.getConfig(), false));
        a9gVar.m95421d(str);
        f106579a.m205842c(str2, a9gVar.getConstantState());
        return a9gVar;
    }

    /* JADX INFO: renamed from: f */
    public static String m129997f(BLiveMedalColorTemplate bLiveMedalColorTemplate, r9g r9gVar) {
        char[] charArray = r9gVar.f158370e.toCharArray();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        for (char c : charArray) {
            if (t0g0.m186867h(c)) {
                i++;
            }
            if (t0g0.m186869j(String.valueOf(c)) || Character.isDigit(c)) {
                i2++;
            }
        }
        boolean z2 = i == charArray.length && charArray.length <= 1;
        boolean z3 = i2 == charArray.length && charArray.length <= 2;
        boolean z4 = i == charArray.length && charArray.length <= 2;
        boolean z5 = i2 == charArray.length && charArray.length <= 3;
        boolean z6 = i == 1 && i2 == 1;
        if (i == 1 && i2 == 2) {
            z = true;
        }
        if (!vdt.m198092b(2)) {
            return bLiveMedalColorTemplate.backgroundUrl;
        }
        if (z2 || z3) {
            return bLiveMedalColorTemplate.backgroundSmallUrl;
        }
        return (z4 || z5 || z6 || z) ? bLiveMedalColorTemplate.backgroundMiddleUrl : bLiveMedalColorTemplate.backgroundLargeUrl;
    }

    /* JADX INFO: renamed from: g */
    public static String m129998g(String str, String str2) {
        return ogw.m164284e(str + str2);
    }

    @Nullable
    @MainThread
    /* JADX INFO: renamed from: h */
    public static C22306c<imf0> m129999h(int i, BLiveCommonViewConfig bLiveCommonViewConfig) {
        return m130000i(i, bLiveCommonViewConfig, null);
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public static C22306c<imf0> m130000i(int i, @Nullable BLiveCommonViewConfig bLiveCommonViewConfig, @Nullable String str) {
        return bLiveCommonViewConfig == null ? C22306c.error(new NullPointerException("cannot find anchor's fanbase Medal!")) : m130002k(r9g.m178369a().m178374e(bLiveCommonViewConfig.text).m178373d(bLiveCommonViewConfig.icon).m178371b(bLiveCommonViewConfig.color).m178375f(str).m178372c(i).m178370a());
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public static C22306c<imf0> m130001j(int i, gm0 gm0Var) {
        return gm0Var == null ? C22306c.error(new NullPointerException("cannot find anchor's fanbase Medal!")) : m130000i(i, gm0Var.f103418b, gm0Var.f103417a);
    }

    @MainThread
    /* JADX INFO: renamed from: k */
    public static C22306c<imf0> m130002k(final r9g r9gVar) {
        String str;
        BLiveMedalColorTemplate bLiveMedalColorTemplate;
        List<BLiveMedalColorTemplate> listM218617z0 = zfv.m218617z0(r9gVar.f158368c, r9gVar.f158366a);
        String str2 = null;
        if (vwb.m200296J(listM218617z0) || (bLiveMedalColorTemplate = (BLiveMedalColorTemplate) vwb.m200346r(listM218617z0, new w9j() { // from class: l.c9g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMedalColorTemplate) obj).name.equals(r9gVar.f158367b));
            }
        })) == null) {
            str = null;
        } else {
            String strM129997f = m129997f(bLiveMedalColorTemplate, r9gVar);
            BLiveMedalIcon bLiveMedalIcon = (BLiveMedalIcon) vwb.m200346r(bLiveMedalColorTemplate.icons, new w9j() { // from class: l.d9g
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveMedalIcon) obj).name.equals(r9gVar.f158369d));
                }
            });
            str = bLiveMedalIcon != null ? bLiveMedalIcon.url : null;
            str2 = strM129997f;
        }
        return (str2 == null || str == null) ? C22306c.error(new NullPointerException("cannot find background or icon for fanbase Medals!")) : m130003l(str2, str, r9gVar.f158370e);
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<imf0> m130003l(String str, String str2, final String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return C22306c.create(new vb20());
        }
        final String strM129998g = m129998g(str, str2);
        Drawable.ConstantState constantStateM205840a = f106579a.m205840a(strM129998g);
        if (constantStateM205840a == null) {
            return C22306c.zip(hxs.m133392e("context_livingAct", str), hxs.m133392e("context_livingAct", str2), new x9j() { // from class: l.e9g
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return h9g.m129996e(str3, strM129998g, (Bitmap) obj, (Bitmap) obj2);
                }
            }).filter(new w9j() { // from class: l.f9g
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((a9g) obj) != null);
                }
            }).take(1).map(new w9j() { // from class: l.g9g
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return h9g.m129995d((a9g) obj);
                }
            }).observeOn(jo0.m142408a());
        }
        a9g a9gVar = (a9g) constantStateM205840a.newDrawable().mutate();
        a9gVar.m95421d(str3);
        return C22306c.just(a9gVar);
    }
}
