package p153l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalIcon;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class vag {

    /* JADX INFO: renamed from: a */
    public static vx3<String, Drawable.ConstantState> f183089a = new vx3<>();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ruf0 m200510d(oag oagVar) {
        return oagVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ oag m200511e(String str, String str2, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.isRecycled() || bitmap2.isRecycled()) {
            return null;
        }
        oag oagVar = new oag(bitmap.copy(bitmap.getConfig(), false), bitmap2.copy(bitmap.getConfig(), false));
        oagVar.m166840d(str);
        f183089a.m203833c(str2, oagVar.getConstantState());
        return oagVar;
    }

    /* JADX INFO: renamed from: f */
    public static String m200512f(BLiveMedalColorTemplate bLiveMedalColorTemplate, fbg fbgVar) {
        char[] charArray = fbgVar.f98100e.toCharArray();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        for (char c : charArray) {
            if (a9g0.m96573h(c)) {
                i++;
            }
            if (a9g0.m96575j(String.valueOf(c)) || Character.isDigit(c)) {
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
        if (!wft.m206159b(2)) {
            return bLiveMedalColorTemplate.backgroundUrl;
        }
        if (z2 || z3) {
            return bLiveMedalColorTemplate.backgroundSmallUrl;
        }
        return (z4 || z5 || z6 || z) ? bLiveMedalColorTemplate.backgroundMiddleUrl : bLiveMedalColorTemplate.backgroundLargeUrl;
    }

    /* JADX INFO: renamed from: g */
    public static String m200513g(String str, String str2) {
        return niw.m163315e(str + str2);
    }

    @Nullable
    @MainThread
    /* JADX INFO: renamed from: h */
    public static C22421c<ruf0> m200514h(int i, BLiveCommonViewConfig bLiveCommonViewConfig) {
        return m200515i(i, bLiveCommonViewConfig, null);
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public static C22421c<ruf0> m200515i(int i, @Nullable BLiveCommonViewConfig bLiveCommonViewConfig, @Nullable String str) {
        return bLiveCommonViewConfig == null ? C22421c.error(new NullPointerException("cannot find anchor's fanbase Medal!")) : m200517k(fbg.m124890a().m124895e(bLiveCommonViewConfig.text).m124894d(bLiveCommonViewConfig.icon).m124892b(bLiveCommonViewConfig.color).m124896f(str).m124893c(i).m124891a());
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public static C22421c<ruf0> m200516j(int i, cm0 cm0Var) {
        return cm0Var == null ? C22421c.error(new NullPointerException("cannot find anchor's fanbase Medal!")) : m200515i(i, cm0Var.f82502b, cm0Var.f82501a);
    }

    @MainThread
    /* JADX INFO: renamed from: k */
    public static C22421c<ruf0> m200517k(final fbg fbgVar) {
        String str;
        BLiveMedalColorTemplate bLiveMedalColorTemplate;
        List<BLiveMedalColorTemplate> listM98151z0 = aiv.m98151z0(fbgVar.f98098c, fbgVar.f98096a);
        String str2 = null;
        if (jyb.m147479J(listM98151z0) || (bLiveMedalColorTemplate = (BLiveMedalColorTemplate) jyb.m147529r(listM98151z0, new qcj() { // from class: l.qag
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMedalColorTemplate) obj).name.equals(fbgVar.f98097b));
            }
        })) == null) {
            str = null;
        } else {
            String strM200512f = m200512f(bLiveMedalColorTemplate, fbgVar);
            BLiveMedalIcon bLiveMedalIcon = (BLiveMedalIcon) jyb.m147529r(bLiveMedalColorTemplate.icons, new qcj() { // from class: l.rag
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveMedalIcon) obj).name.equals(fbgVar.f98099d));
                }
            });
            str = bLiveMedalIcon != null ? bLiveMedalIcon.url : null;
            str2 = strM200512f;
        }
        return (str2 == null || str == null) ? C22421c.error(new NullPointerException("cannot find background or icon for fanbase Medals!")) : m200518l(str2, str, fbgVar.f98100e);
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<ruf0> m200518l(String str, String str2, final String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return C22421c.create(new ek20());
        }
        final String strM200513g = m200513g(str, str2);
        Drawable.ConstantState constantStateM203831a = f183089a.m203831a(strM200513g);
        if (constantStateM203831a == null) {
            return C22421c.zip(izs.m142854e("context_livingAct", str), izs.m142854e("context_livingAct", str2), new rcj() { // from class: l.sag
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return vag.m200511e(str3, strM200513g, (Bitmap) obj, (Bitmap) obj2);
                }
            }).filter(new qcj() { // from class: l.tag
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((oag) obj) != null);
                }
            }).take(1).map(new qcj() { // from class: l.uag
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vag.m200510d((oag) obj);
                }
            }).observeOn(fo0.m126432a());
        }
        oag oagVar = (oag) constantStateM203831a.newDrawable().mutate();
        oagVar.m166840d(str3);
        return C22421c.just(oagVar);
    }
}
