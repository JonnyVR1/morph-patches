package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class bzw {

    /* JADX INFO: renamed from: l.bzw$a */
    public static /* synthetic */ class C16146a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f79179a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f79179a = iArr;
            try {
                iArr[MarrySeriesType.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79179a[MarrySeriesType.MATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79179a[MarrySeriesType.FAMILY_BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f79179a[MarrySeriesType.BRIDE_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f79179a[MarrySeriesType.PROLOGUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m107264f(MarrySeriesType marrySeriesType, String str) {
        int i = C16146a.f79179a[marrySeriesType.ordinal()];
        if (i == 1) {
            dkb dkbVar = CoreModule.f18264c.f20381e0;
            m107265g(dkbVar.f89250i4, dkbVar.m116600p9().profile.extensions.marriage.declaration, str, 20);
            return;
        }
        if (i == 2) {
            dkb dkbVar2 = CoreModule.f18264c.f20381e0;
            m107265g(dkbVar2.f89258j4, dkbVar2.m116600p9().profile.extensions.marriage.mateDescription, str, 20);
            return;
        }
        if (i == 3) {
            dkb dkbVar3 = CoreModule.f18264c.f20381e0;
            m107265g(dkbVar3.f89266k4, dkbVar3.m116600p9().profile.extensions.basic.familyBackground, str, 20);
        } else if (i == 4) {
            dkb dkbVar4 = CoreModule.f18264c.f20381e0;
            m107265g(dkbVar4.f89274l4, dkbVar4.m116600p9().profile.extensions.marriage.bridePrice, str, 0);
        } else {
            if (i != 5) {
                return;
            }
            dkb dkbVar5 = CoreModule.f18264c.f20381e0;
            m107265g(dkbVar5.f89282m4, dkbVar5.m116600p9().profile.extensions.marriage.prologue, str, 20);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m107265g(wyd0 wyd0Var, List<String> list, String str, int i) {
        if (!TextUtils.isEmpty(jyb.m147479J(list) ? "" : list.get(0)) || str.length() <= i) {
            return;
        }
        wyd0Var.put(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m107266h() {
        CoreModule.f18264c.f20381e0.f89250i4.clear();
        CoreModule.f18264c.f20381e0.f89258j4.clear();
        CoreModule.f18264c.f20381e0.f89266k4.clear();
        CoreModule.f18264c.f20381e0.f89274l4.clear();
        CoreModule.f18264c.f20381e0.f89282m4.clear();
    }

    /* JADX INFO: renamed from: i */
    public static void m107267i(ProfileEditInfo profileEditInfo, User user) {
        List<DetectText> list = profileEditInfo.details;
        if (jyb.m147529r(list, new qcj() { // from class: l.wyw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("marriage.declaration"));
            }
        }) != null) {
            CoreModule.f18264c.f20381e0.f89250i4.clear();
            user.profile.extensions.marriage.declaration = profileEditInfo.user.profile.extensions.marriage.declaration;
        }
        if (jyb.m147529r(list, new qcj() { // from class: l.xyw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("mateDescription"));
            }
        }) != null) {
            CoreModule.f18264c.f20381e0.f89258j4.clear();
            user.profile.extensions.marriage.mateDescription = profileEditInfo.user.profile.extensions.marriage.mateDescription;
        }
        if (jyb.m147529r(list, new qcj() { // from class: l.yyw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("familyBackground"));
            }
        }) != null) {
            CoreModule.f18264c.f20381e0.f89266k4.clear();
            user.profile.extensions.basic.familyBackground = profileEditInfo.user.profile.extensions.basic.familyBackground;
        }
        if (jyb.m147529r(list, new qcj() { // from class: l.zyw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("bridePrice"));
            }
        }) != null) {
            CoreModule.f18264c.f20381e0.f89274l4.clear();
            user.profile.extensions.marriage.bridePrice = profileEditInfo.user.profile.extensions.marriage.bridePrice;
        }
        if (jyb.m147529r(list, new qcj() { // from class: l.azw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("prologue"));
            }
        }) != null) {
            CoreModule.f18264c.f20381e0.f89282m4.clear();
            user.profile.extensions.marriage.prologue = profileEditInfo.user.profile.extensions.marriage.prologue;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m107268j(User user) {
        if (!TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89250i4.get())) {
            user.profile.extensions.marriage.declaration = jyb.m147507f0(CoreModule.f18264c.f20381e0.f89250i4.get());
        }
        if (!TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89258j4.get())) {
            user.profile.extensions.marriage.mateDescription = jyb.m147507f0(CoreModule.f18264c.f20381e0.f89258j4.get());
        }
        if (!TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89266k4.get())) {
            user.profile.extensions.basic.familyBackground = jyb.m147507f0(CoreModule.f18264c.f20381e0.f89266k4.get());
        }
        if (!TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89274l4.get())) {
            user.profile.extensions.marriage.bridePrice = jyb.m147507f0(CoreModule.f18264c.f20381e0.f89274l4.get());
        }
        if (TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89282m4.get())) {
            return;
        }
        user.profile.extensions.marriage.prologue = jyb.m147507f0(CoreModule.f18264c.f20381e0.f89282m4.get());
    }
}
