package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.data.DetectText;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.pib;
import l.uqd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cww {

    /* JADX INFO: renamed from: l.cww$a */
    public static /* synthetic */ class C0215a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2849a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f2849a = iArr;
            try {
                iArr[MarrySeriesType.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2849a[MarrySeriesType.MATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2849a[MarrySeriesType.FAMILY_BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2849a[MarrySeriesType.BRIDE_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2849a[MarrySeriesType.PROLOGUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3487f(MarrySeriesType marrySeriesType, String str) {
        int i = C0215a.f2849a[marrySeriesType.ordinal()];
        if (i == 1) {
            pib pibVar = CoreModule.c.e0;
            m3488g(pibVar.i4, pibVar.p9().profile.extensions.marriage.declaration, str, 20);
            return;
        }
        if (i == 2) {
            pib pibVar2 = CoreModule.c.e0;
            m3488g(pibVar2.j4, pibVar2.p9().profile.extensions.marriage.mateDescription, str, 20);
            return;
        }
        if (i == 3) {
            pib pibVar3 = CoreModule.c.e0;
            m3488g(pibVar3.k4, pibVar3.p9().profile.extensions.basic.familyBackground, str, 20);
        } else if (i == 4) {
            pib pibVar4 = CoreModule.c.e0;
            m3488g(pibVar4.l4, pibVar4.p9().profile.extensions.marriage.bridePrice, str, 0);
        } else {
            if (i != 5) {
                return;
            }
            pib pibVar5 = CoreModule.c.e0;
            m3488g(pibVar5.m4, pibVar5.p9().profile.extensions.marriage.prologue, str, 20);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3488g(uqd0 uqd0Var, List<String> list, String str, int i) {
        if (!TextUtils.isEmpty(vwb.J(list) ? "" : list.get(0)) || str.length() <= i) {
            return;
        }
        uqd0Var.put(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m3489h() {
        CoreModule.c.e0.i4.clear();
        CoreModule.c.e0.j4.clear();
        CoreModule.c.e0.k4.clear();
        CoreModule.c.e0.l4.clear();
        CoreModule.c.e0.m4.clear();
    }

    /* JADX INFO: renamed from: i */
    public static void m3490i(ProfileEditInfo profileEditInfo, User user) {
        List list = profileEditInfo.details;
        if (vwb.r(list, new w9j() { // from class: l.xvw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("marriage.declaration"));
            }
        }) != null) {
            CoreModule.c.e0.i4.clear();
            user.profile.extensions.marriage.declaration = profileEditInfo.user.profile.extensions.marriage.declaration;
        }
        if (vwb.r(list, new w9j() { // from class: l.yvw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("mateDescription"));
            }
        }) != null) {
            CoreModule.c.e0.j4.clear();
            user.profile.extensions.marriage.mateDescription = profileEditInfo.user.profile.extensions.marriage.mateDescription;
        }
        if (vwb.r(list, new w9j() { // from class: l.zvw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("familyBackground"));
            }
        }) != null) {
            CoreModule.c.e0.k4.clear();
            user.profile.extensions.basic.familyBackground = profileEditInfo.user.profile.extensions.basic.familyBackground;
        }
        if (vwb.r(list, new w9j() { // from class: l.aww
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("bridePrice"));
            }
        }) != null) {
            CoreModule.c.e0.l4.clear();
            user.profile.extensions.marriage.bridePrice = profileEditInfo.user.profile.extensions.marriage.bridePrice;
        }
        if (vwb.r(list, new w9j() { // from class: l.bww
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DetectText) obj).key.contains("prologue"));
            }
        }) != null) {
            CoreModule.c.e0.m4.clear();
            user.profile.extensions.marriage.prologue = profileEditInfo.user.profile.extensions.marriage.prologue;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m3491j(User user) {
        if (!TextUtils.isEmpty((CharSequence) CoreModule.c.e0.i4.get())) {
            user.profile.extensions.marriage.declaration = vwb.f0(new String[]{(String) CoreModule.c.e0.i4.get()});
        }
        if (!TextUtils.isEmpty((CharSequence) CoreModule.c.e0.j4.get())) {
            user.profile.extensions.marriage.mateDescription = vwb.f0(new String[]{(String) CoreModule.c.e0.j4.get()});
        }
        if (!TextUtils.isEmpty((CharSequence) CoreModule.c.e0.k4.get())) {
            user.profile.extensions.basic.familyBackground = vwb.f0(new String[]{(String) CoreModule.c.e0.k4.get()});
        }
        if (!TextUtils.isEmpty((CharSequence) CoreModule.c.e0.l4.get())) {
            user.profile.extensions.marriage.bridePrice = vwb.f0(new String[]{(String) CoreModule.c.e0.l4.get()});
        }
        if (TextUtils.isEmpty((CharSequence) CoreModule.c.e0.m4.get())) {
            return;
        }
        user.profile.extensions.marriage.prologue = vwb.f0(new String[]{(String) CoreModule.c.e0.m4.get()});
    }
}
