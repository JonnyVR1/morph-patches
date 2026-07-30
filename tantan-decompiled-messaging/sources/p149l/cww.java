package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class cww {

    /* JADX INFO: renamed from: l.cww$a */
    public static /* synthetic */ class C16265a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82815a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f82815a = iArr;
            try {
                iArr[MarrySeriesType.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82815a[MarrySeriesType.MATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82815a[MarrySeriesType.FAMILY_BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82815a[MarrySeriesType.BRIDE_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82815a[MarrySeriesType.PROLOGUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m109073f(MarrySeriesType marrySeriesType, String str) {
        int i = C16265a.f82815a[marrySeriesType.ordinal()];
        if (i == 1) {
            pib pibVar = CoreModule.f17545c.f19639e0;
            m109074g(pibVar.f149393i4, pibVar.m169527p9().profile.extensions.marriage.declaration, str, 20);
            return;
        }
        if (i == 2) {
            pib pibVar2 = CoreModule.f17545c.f19639e0;
            m109074g(pibVar2.f149401j4, pibVar2.m169527p9().profile.extensions.marriage.mateDescription, str, 20);
            return;
        }
        if (i == 3) {
            pib pibVar3 = CoreModule.f17545c.f19639e0;
            m109074g(pibVar3.f149409k4, pibVar3.m169527p9().profile.extensions.basic.familyBackground, str, 20);
        } else if (i == 4) {
            pib pibVar4 = CoreModule.f17545c.f19639e0;
            m109074g(pibVar4.f149417l4, pibVar4.m169527p9().profile.extensions.marriage.bridePrice, str, 0);
        } else {
            if (i != 5) {
                return;
            }
            pib pibVar5 = CoreModule.f17545c.f19639e0;
            m109074g(pibVar5.f149425m4, pibVar5.m169527p9().profile.extensions.marriage.prologue, str, 20);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m109074g(uqd0 uqd0Var, List<String> list, String str, int i) {
        if (!TextUtils.isEmpty(vwb.m200296J(list) ? "" : list.get(0)) || str.length() <= i) {
            return;
        }
        uqd0Var.put(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m109075h() {
        CoreModule.f17545c.f19639e0.f149393i4.clear();
        CoreModule.f17545c.f19639e0.f149401j4.clear();
        CoreModule.f17545c.f19639e0.f149409k4.clear();
        CoreModule.f17545c.f19639e0.f149417l4.clear();
        CoreModule.f17545c.f19639e0.f149425m4.clear();
    }

    /* JADX INFO: renamed from: i */
    public static void m109076i(ProfileEditInfo profileEditInfo, User user) {
        List<DetectText> list = profileEditInfo.details;
        if (vwb.m200346r(list, new w9j() { // from class: l.xvw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("marriage.declaration"));
            }
        }) != null) {
            CoreModule.f17545c.f19639e0.f149393i4.clear();
            user.profile.extensions.marriage.declaration = profileEditInfo.user.profile.extensions.marriage.declaration;
        }
        if (vwb.m200346r(list, new w9j() { // from class: l.yvw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("mateDescription"));
            }
        }) != null) {
            CoreModule.f17545c.f19639e0.f149401j4.clear();
            user.profile.extensions.marriage.mateDescription = profileEditInfo.user.profile.extensions.marriage.mateDescription;
        }
        if (vwb.m200346r(list, new w9j() { // from class: l.zvw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("familyBackground"));
            }
        }) != null) {
            CoreModule.f17545c.f19639e0.f149409k4.clear();
            user.profile.extensions.basic.familyBackground = profileEditInfo.user.profile.extensions.basic.familyBackground;
        }
        if (vwb.m200346r(list, new w9j() { // from class: l.aww
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("bridePrice"));
            }
        }) != null) {
            CoreModule.f17545c.f19639e0.f149417l4.clear();
            user.profile.extensions.marriage.bridePrice = profileEditInfo.user.profile.extensions.marriage.bridePrice;
        }
        if (vwb.m200346r(list, new w9j() { // from class: l.bww
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("prologue"));
            }
        }) != null) {
            CoreModule.f17545c.f19639e0.f149425m4.clear();
            user.profile.extensions.marriage.prologue = profileEditInfo.user.profile.extensions.marriage.prologue;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m109077j(User user) {
        if (!TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149393i4.get())) {
            user.profile.extensions.marriage.declaration = vwb.m200324f0(CoreModule.f17545c.f19639e0.f149393i4.get());
        }
        if (!TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149401j4.get())) {
            user.profile.extensions.marriage.mateDescription = vwb.m200324f0(CoreModule.f17545c.f19639e0.f149401j4.get());
        }
        if (!TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149409k4.get())) {
            user.profile.extensions.basic.familyBackground = vwb.m200324f0(CoreModule.f17545c.f19639e0.f149409k4.get());
        }
        if (!TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149417l4.get())) {
            user.profile.extensions.marriage.bridePrice = vwb.m200324f0(CoreModule.f17545c.f19639e0.f149417l4.get());
        }
        if (TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149425m4.get())) {
            return;
        }
        user.profile.extensions.marriage.prologue = vwb.m200324f0(CoreModule.f17545c.f19639e0.f149425m4.get());
    }
}
