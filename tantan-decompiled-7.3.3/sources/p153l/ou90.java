package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Work;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class ou90 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m169267a(x20 x20Var, int i, int i2, Intent intent) {
        if (jyb.m147479J(m169277k(CoreModule.f18264c.f20381e0.m116593na()))) {
            m169275i("success", x20Var);
            return false;
        }
        CoreModule.f18264c.f20419q2.m197497w3("fail");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m169269c(int i, int i2, Intent intent) {
        if (jyb.m147479J(m169276j(CoreModule.f18264c.f20381e0.m116593na()))) {
            i4g0.m138495D("e_ideal_limit_profile_complete", "p_suggest_users_home_view", new pf60[0]);
            CoreModule.f18264c.f20405m0.m32136o8();
            r1j0.m179420g("推荐已更新");
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m169271e(x20 x20Var, int i, int i2, Intent intent) {
        if (jyb.m147479J(m169277k(CoreModule.f18264c.f20381e0.m116593na()))) {
            m169275i("success", x20Var);
            return false;
        }
        CoreModule.f18264c.f20419q2.m197497w3("fail");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m169272f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m169273g(x20 x20Var, uxj0 uxj0Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m169274h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m169275i(String str, final x20 x20Var) {
        CoreModule.f18264c.f20419q2.m197497w3(str).switchMap(new qcj() { // from class: l.lu90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20419q2.m197491p3();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.mu90
            @Override // p153l.y20
            public final void call(Object obj) {
                ou90.m169273g(x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.nu90
            @Override // p153l.y20
            public final void call(Object obj) {
                ou90.m169274h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList<MarrySeriesType> m169276j(User user) {
        ArrayList<MarrySeriesType> arrayList = new ArrayList<>();
        if (!LoopFragmentFactory.m52649J(LoopInputType.PROFESSION, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.PROFESSION);
        }
        if (!LoopFragmentFactory.m52649J(LoopInputType.QUALIFICATION, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.QUALIFICATIONS);
        }
        if (!LoopFragmentFactory.m52649J(LoopInputType.HEIGHT, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.HEIGHT);
        }
        if (!LoopFragmentFactory.m52649J(LoopInputType.SIGNATURE, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_ABOUT_ME);
        }
        if (user.pictures.size() < 3) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList<MarrySeriesType> m169277k(User user) {
        ArrayList<MarrySeriesType> arrayList = new ArrayList<>();
        Work work = user.profile.work;
        boolean z = true;
        boolean z2 = work == null || TextUtils.isEmpty(work.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.f18263b.getString(R$string.f28732l2));
        Work work2 = user.profile.work;
        if (work2 != null && !TextUtils.isEmpty(work2.department) && !TextUtils.equals(user.profile.work.department, CoreModule.f18263b.getString(R$string.f28732l2))) {
            z = false;
        }
        if ((z2 || z) && !user.profile.studies.active) {
            arrayList.add(MarrySeriesType.PROFESSION);
        }
        ProfileExtensionBasic profileExtensionBasic = user.profile.extensions.basic;
        if (profileExtensionBasic == null || jyb.m147479J(profileExtensionBasic.qualification) || TextUtils.isEmpty(user.profile.extensions.basic.qualification.get(0))) {
            arrayList.add(MarrySeriesType.QUALIFICATIONS);
        }
        ProfileExtensionBasic profileExtensionBasic2 = user.profile.extensions.basic;
        if (profileExtensionBasic2 == null || ((jyb.m147479J(profileExtensionBasic2.country) || TextUtils.isEmpty(user.profile.extensions.basic.country.get(0))) && ((jyb.m147479J(user.profile.extensions.basic.city) || TextUtils.isEmpty(user.profile.extensions.basic.city.get(0))) && ((jyb.m147479J(user.profile.extensions.basic.province) || TextUtils.isEmpty(user.profile.extensions.basic.province.get(0))) && TextUtils.isEmpty(user.profile.hometown))))) {
            arrayList.add(MarrySeriesType.ADDRESS_HOMETOWN);
        }
        ProfileExtensionBasic profileExtensionBasic3 = user.profile.extensions.basic;
        if (profileExtensionBasic3 == null || jyb.m147479J(profileExtensionBasic3.friendPurpose)) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE);
        }
        Physical physical = user.profile.extensions.physical;
        if (physical == null || jyb.m147479J(physical.height) || TextUtils.equals(user.profile.extensions.physical.height.get(0), CoreModule.f18263b.getString(R$string.f28732l2))) {
            arrayList.add(MarrySeriesType.HEIGHT);
        }
        if (TextUtils.isEmpty(user.description) || user.description.length() < 15 || !TextUtils.isEmpty(CoreModule.f18264c.f20419q2.m197489n3())) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_ABOUT_ME);
        }
        if (user.pictures.size() < 3) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS);
        }
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (!TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified") && !TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_AVATAR_AUTHENTICATION);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static void m169278l(Act act) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        ArrayList<MarrySeriesType> arrayListM169276j = m169276j(userM116600p9);
        if (arrayListM169276j.isEmpty()) {
            return;
        }
        Intent intentM48635Z1 = MarryEditProfileSeriesAct.m48635Z1(act, userM116600p9, arrayListM169276j, false, true, false);
        intentM48635Z1.putExtra("from", "from_ideal_type_swipe_guide");
        act.startActivityForResult(intentM48635Z1, new C4468a.a() { // from class: l.gu90
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return ou90.m169269c(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m169279m(final Act act, final x20 x20Var, final x20 x20Var2) {
        act.duringCreated(CoreModule.f18264c.f20419q2.m197491p3()).subscribe(psd0.m173597H(new y20() { // from class: l.hu90
            @Override // p153l.y20
            public final void call(Object obj) {
                ou90.m169280n(act, x20Var, x20Var2);
            }
        }, new y20() { // from class: l.iu90
            @Override // p153l.y20
            public final void call(Object obj) {
                ou90.m169272f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public static void m169280n(Act act, final x20 x20Var, x20 x20Var2) {
        if (gta.m132210e().m132214d().mo34802am()) {
            if (NullChecker.m82486a(x20Var2)) {
                x20Var2.call();
                return;
            }
            return;
        }
        if (gta.m132210e().m132214d().mo34808bn()) {
            gta.m132210e().m132214d().mo34688Fa(act, "other");
            return;
        }
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        ArrayList<MarrySeriesType> arrayListM169277k = m169277k(userM116593na);
        if (jyb.m147479J(arrayListM169277k) && TextUtils.isEmpty(CoreModule.f18264c.f20419q2.m197489n3())) {
            m169275i("good_user", x20Var);
        } else {
            if (CoreModule.m30933P().m143405a().mo34609v4()) {
                CoreModule.m30933P().m143405a().mo34488dm(act, new C4468a.a() { // from class: l.ju90
                    @Override // com.p051p1.mobile.android.app.C4468a.a
                    /* JADX INFO: renamed from: a */
                    public final boolean mo21400a(int i, int i2, Intent intent) {
                        return ou90.m169267a(x20Var, i, i2, intent);
                    }
                });
                return;
            }
            Intent intentM48635Z1 = MarryEditProfileSeriesAct.m48635Z1(act, userM116593na, arrayListM169277k, false, true, false);
            intentM48635Z1.putExtra("from_profile_featured", true);
            act.startActivityForResult(intentM48635Z1, new C4468a.a() { // from class: l.ku90
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i, int i2, Intent intent) {
                    return ou90.m169271e(x20Var, i, i2, intent);
                }
            });
        }
    }
}
