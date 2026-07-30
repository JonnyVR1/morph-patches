package p002l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p1.mobile.putong.live.base.data.BLiveMedalIcon;
import java.util.List;
import l.hxs;
import l.imf0;
import l.jo0;
import l.ogw;
import l.t0g0;
import l.vb20;
import l.vdt;
import l.vwb;
import l.w9j;
import l.ww3;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h9g {

    /* JADX INFO: renamed from: a */
    public static ww3<String, Drawable.ConstantState> f11951a = new ww3<>();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ imf0 m14294d(a9g a9gVar) {
        return a9gVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ a9g m14295e(String str, String str2, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.isRecycled() || bitmap2.isRecycled()) {
            return null;
        }
        a9g a9gVar = new a9g(bitmap.copy(bitmap.getConfig(), false), bitmap2.copy(bitmap.getConfig(), false));
        a9gVar.m9458d(str);
        f11951a.c(str2, a9gVar.getConstantState());
        return a9gVar;
    }

    /* JADX INFO: renamed from: f */
    public static String m14296f(BLiveMedalColorTemplate bLiveMedalColorTemplate, r9g r9gVar) {
        char[] charArray = r9gVar.f18430e.toCharArray();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        for (char c : charArray) {
            if (t0g0.h(c)) {
                i++;
            }
            if (t0g0.j(String.valueOf(c)) || Character.isDigit(c)) {
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
        if (!vdt.b(2)) {
            return bLiveMedalColorTemplate.backgroundUrl;
        }
        if (z2 || z3) {
            return bLiveMedalColorTemplate.backgroundSmallUrl;
        }
        return (z4 || z5 || z6 || z) ? bLiveMedalColorTemplate.backgroundMiddleUrl : bLiveMedalColorTemplate.backgroundLargeUrl;
    }

    /* JADX INFO: renamed from: g */
    public static String m14297g(String str, String str2) {
        return ogw.e(str + str2);
    }

    @Nullable
    @MainThread
    /* JADX INFO: renamed from: h */
    public static c<imf0> m14298h(int i, BLiveCommonViewConfig bLiveCommonViewConfig) {
        return m14299i(i, bLiveCommonViewConfig, null);
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public static c<imf0> m14299i(int i, @Nullable BLiveCommonViewConfig bLiveCommonViewConfig, @Nullable String str) {
        return bLiveCommonViewConfig == null ? c.error(new NullPointerException("cannot find anchor's fanbase Medal!")) : m14301k(r9g.m21861a().m21866e(bLiveCommonViewConfig.text).m21865d(bLiveCommonViewConfig.icon).m21863b(bLiveCommonViewConfig.color).m21867f(str).m21864c(i).m21862a());
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public static c<imf0> m14300j(int i, gm0 gm0Var) {
        return gm0Var == null ? c.error(new NullPointerException("cannot find anchor's fanbase Medal!")) : m14299i(i, gm0Var.f11510b, gm0Var.f11509a);
    }

    @MainThread
    /* JADX INFO: renamed from: k */
    public static c<imf0> m14301k(final r9g r9gVar) {
        String str;
        BLiveMedalColorTemplate bLiveMedalColorTemplate;
        List<BLiveMedalColorTemplate> listM27320z0 = zfv.m27320z0(r9gVar.f18428c, r9gVar.f18426a);
        String str2 = null;
        if (vwb.J(listM27320z0) || (bLiveMedalColorTemplate = (BLiveMedalColorTemplate) vwb.r(listM27320z0, new w9j() { // from class: l.c9g
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMedalColorTemplate) obj).name.equals(r9gVar.f18427b));
            }
        })) == null) {
            str = null;
        } else {
            String strM14296f = m14296f(bLiveMedalColorTemplate, r9gVar);
            BLiveMedalIcon bLiveMedalIcon = (BLiveMedalIcon) vwb.r(bLiveMedalColorTemplate.icons, new w9j() { // from class: l.d9g
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveMedalIcon) obj).name.equals(r9gVar.f18429d));
                }
            });
            str = bLiveMedalIcon != null ? bLiveMedalIcon.url : null;
            str2 = strM14296f;
        }
        return (str2 == null || str == null) ? c.error(new NullPointerException("cannot find background or icon for fanbase Medals!")) : m14302l(str2, str, r9gVar.f18430e);
    }

    /* JADX INFO: renamed from: l */
    public static c<imf0> m14302l(String str, String str2, final String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return c.create(new vb20());
        }
        final String strM14297g = m14297g(str, str2);
        Drawable.ConstantState constantState = (Drawable.ConstantState) f11951a.a(strM14297g);
        if (constantState == null) {
            return c.zip(hxs.e("context_livingAct", str), hxs.e("context_livingAct", str2), new x9j() { // from class: l.e9g
                public final Object call(Object obj, Object obj2) {
                    return h9g.m14295e(str3, strM14297g, (Bitmap) obj, (Bitmap) obj2);
                }
            }).filter(new w9j() { // from class: l.f9g
                public final Object call(Object obj) {
                    return Boolean.valueOf(((a9g) obj) != null);
                }
            }).take(1).map(new w9j() { // from class: l.g9g
                public final Object call(Object obj) {
                    return h9g.m14294d((a9g) obj);
                }
            }).observeOn(jo0.a());
        }
        a9g a9gVar = (a9g) constantState.newDrawable().mutate();
        a9gVar.m9458d(str3);
        return c.just(a9gVar);
    }
}
