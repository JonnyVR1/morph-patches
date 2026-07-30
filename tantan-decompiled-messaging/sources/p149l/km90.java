package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Work;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class km90 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m146473a(d30 d30Var, int i, int i2, Intent intent) {
        if (vwb.m200296J(m146483k(CoreModule.f17545c.f19639e0.m169520na()))) {
            m146481i("success", d30Var);
            return false;
        }
        CoreModule.f17545c.f19677q2.m137716w3("fail");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m146475c(int i, int i2, Intent intent) {
        if (vwb.m200296J(m146482j(CoreModule.f17545c.f19639e0.m169520na()))) {
            zvf0.m220371D("e_ideal_limit_profile_complete", "p_suggest_users_home_view", new j760[0]);
            CoreModule.f17545c.f19663m0.m31133o8();
            osi0.m165783g("推荐已更新");
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m146477e(d30 d30Var, int i, int i2, Intent intent) {
        if (vwb.m200296J(m146483k(CoreModule.f17545c.f19639e0.m169520na()))) {
            m146481i("success", d30Var);
            return false;
        }
        CoreModule.f17545c.f19677q2.m137716w3("fail");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m146478f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m146479g(d30 d30Var, roj0 roj0Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m146480h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m146481i(String str, final d30 d30Var) {
        CoreModule.f17545c.f19677q2.m137716w3(str).switchMap(new w9j() { // from class: l.hm90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19677q2.m137710p3();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.im90
            @Override // p149l.e30
            public final void call(Object obj) {
                km90.m146479g(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.jm90
            @Override // p149l.e30
            public final void call(Object obj) {
                km90.m146480h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList<MarrySeriesType> m146482j(User user) {
        ArrayList<MarrySeriesType> arrayList = new ArrayList<>();
        if (!LoopFragmentFactory.m51466J(LoopInputType.PROFESSION, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.PROFESSION);
        }
        if (!LoopFragmentFactory.m51466J(LoopInputType.QUALIFICATION, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.QUALIFICATIONS);
        }
        if (!LoopFragmentFactory.m51466J(LoopInputType.HEIGHT, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.HEIGHT);
        }
        if (!LoopFragmentFactory.m51466J(LoopInputType.SIGNATURE, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_ABOUT_ME);
        }
        if (user.pictures.size() < 3) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList<MarrySeriesType> m146483k(User user) {
        ArrayList<MarrySeriesType> arrayList = new ArrayList<>();
        Work work = user.profile.work;
        boolean z = true;
        boolean z2 = work == null || TextUtils.isEmpty(work.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.f17544b.getString(R$string.f27884l2));
        Work work2 = user.profile.work;
        if (work2 != null && !TextUtils.isEmpty(work2.department) && !TextUtils.equals(user.profile.work.department, CoreModule.f17544b.getString(R$string.f27884l2))) {
            z = false;
        }
        if ((z2 || z) && !user.profile.studies.active) {
            arrayList.add(MarrySeriesType.PROFESSION);
        }
        ProfileExtensionBasic profileExtensionBasic = user.profile.extensions.basic;
        if (profileExtensionBasic == null || vwb.m200296J(profileExtensionBasic.qualification) || TextUtils.isEmpty(user.profile.extensions.basic.qualification.get(0))) {
            arrayList.add(MarrySeriesType.QUALIFICATIONS);
        }
        ProfileExtensionBasic profileExtensionBasic2 = user.profile.extensions.basic;
        if (profileExtensionBasic2 == null || ((vwb.m200296J(profileExtensionBasic2.country) || TextUtils.isEmpty(user.profile.extensions.basic.country.get(0))) && ((vwb.m200296J(user.profile.extensions.basic.city) || TextUtils.isEmpty(user.profile.extensions.basic.city.get(0))) && ((vwb.m200296J(user.profile.extensions.basic.province) || TextUtils.isEmpty(user.profile.extensions.basic.province.get(0))) && TextUtils.isEmpty(user.profile.hometown))))) {
            arrayList.add(MarrySeriesType.ADDRESS_HOMETOWN);
        }
        ProfileExtensionBasic profileExtensionBasic3 = user.profile.extensions.basic;
        if (profileExtensionBasic3 == null || vwb.m200296J(profileExtensionBasic3.friendPurpose)) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE);
        }
        Physical physical = user.profile.extensions.physical;
        if (physical == null || vwb.m200296J(physical.height) || TextUtils.equals(user.profile.extensions.physical.height.get(0), CoreModule.f17544b.getString(R$string.f27884l2))) {
            arrayList.add(MarrySeriesType.HEIGHT);
        }
        if (TextUtils.isEmpty(user.description) || user.description.length() < 15 || !TextUtils.isEmpty(CoreModule.f17545c.f19677q2.m137708n3())) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_ABOUT_ME);
        }
        if (user.pictures.size() < 3) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS);
        }
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (!TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified") && !TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_AVATAR_AUTHENTICATION);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static void m146484l(Act act) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        ArrayList<MarrySeriesType> arrayListM146482j = m146482j(userM169527p9);
        if (arrayListM146482j.isEmpty()) {
            return;
        }
        Intent intentM47452Y1 = MarryEditProfileSeriesAct.m47452Y1(act, userM169527p9, arrayListM146482j, false, true, false);
        intentM47452Y1.putExtra("from", "from_ideal_type_swipe_guide");
        act.startActivityForResult(intentM47452Y1, new C4317a.a() { // from class: l.cm90
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return km90.m146475c(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m146485m(final Act act, final d30 d30Var, final d30 d30Var2) {
        act.duringCreated(CoreModule.f17545c.f19677q2.m137710p3()).subscribe(mkd0.m154956H(new e30() { // from class: l.dm90
            @Override // p149l.e30
            public final void call(Object obj) {
                km90.m146486n(act, d30Var, d30Var2);
            }
        }, new e30() { // from class: l.em90
            @Override // p149l.e30
            public final void call(Object obj) {
                km90.m146478f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public static void m146486n(Act act, final d30 d30Var, d30 d30Var2) {
        if (ura.m195053e().m195057d().mo33799am()) {
            if (NullChecker.m81303a(d30Var2)) {
                d30Var2.call();
                return;
            }
            return;
        }
        if (ura.m195053e().m195057d().mo33805bn()) {
            ura.m195053e().m195057d().mo33685Fa(act, "other");
            return;
        }
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        ArrayList<MarrySeriesType> arrayListM146483k = m146483k(userM169520na);
        if (vwb.m200296J(arrayListM146483k) && TextUtils.isEmpty(CoreModule.f17545c.f19677q2.m137708n3())) {
            m146481i("good_user", d30Var);
        } else {
            if (CoreModule.m29935P().m94651a().mo33606v4()) {
                CoreModule.m29935P().m94651a().mo33485dm(act, new C4317a.a() { // from class: l.fm90
                    @Override // com.p046p1.mobile.android.app.C4317a.a
                    /* JADX INFO: renamed from: a */
                    public final boolean mo20401a(int i, int i2, Intent intent) {
                        return km90.m146473a(d30Var, i, i2, intent);
                    }
                });
                return;
            }
            Intent intentM47452Y1 = MarryEditProfileSeriesAct.m47452Y1(act, userM169520na, arrayListM146483k, false, true, false);
            intentM47452Y1.putExtra("from_profile_featured", true);
            act.startActivityForResult(intentM47452Y1, new C4317a.a() { // from class: l.gm90
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i, int i2, Intent intent) {
                    return km90.m146477e(d30Var, i, i2, intent);
                }
            });
        }
    }
}
