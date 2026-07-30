package p003l;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p1.mobile.putong.core.ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.data.Physical;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Work;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.ura;
import l.vwb;
import l.w9j;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class km90 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m7610a(d30 d30Var, int i, int i2, Intent intent) {
        if (vwb.J(m7620k(CoreModule.c.e0.na()))) {
            m7618i("success", d30Var);
            return false;
        }
        CoreModule.c.q2.w3("fail");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m7612c(int i, int i2, Intent intent) {
        if (vwb.J(m7619j(CoreModule.c.e0.na()))) {
            zvf0.D("e_ideal_limit_profile_complete", "p_suggest_users_home_view", new j760[0]);
            CoreModule.c.m0.o8();
            osi0.g("推荐已更新");
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m7614e(d30 d30Var, int i, int i2, Intent intent) {
        if (vwb.J(m7620k(CoreModule.c.e0.na()))) {
            m7618i("success", d30Var);
            return false;
        }
        CoreModule.c.q2.w3("fail");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m7615f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m7616g(d30 d30Var, roj0 roj0Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m7617h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m7618i(String str, final d30 d30Var) {
        CoreModule.c.q2.w3(str).switchMap(new w9j() { // from class: l.hm90
            public final Object call(Object obj) {
                return CoreModule.c.q2.p3();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.im90
            public final void call(Object obj) {
                km90.m7616g(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.jm90
            public final void call(Object obj) {
                km90.m7617h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList<MarrySeriesType> m7619j(User user) {
        ArrayList<MarrySeriesType> arrayList = new ArrayList<>();
        if (!LoopFragmentFactory.J(LoopInputType.PROFESSION, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.PROFESSION);
        }
        if (!LoopFragmentFactory.J(LoopInputType.QUALIFICATION, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.QUALIFICATIONS);
        }
        if (!LoopFragmentFactory.J(LoopInputType.HEIGHT, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.HEIGHT);
        }
        if (!LoopFragmentFactory.J(LoopInputType.SIGNATURE, user, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG)) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_ABOUT_ME);
        }
        if (user.pictures.size() < 3) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList<MarrySeriesType> m7620k(User user) {
        ArrayList<MarrySeriesType> arrayList = new ArrayList<>();
        Work work = user.profile.work;
        boolean z = true;
        boolean z2 = work == null || TextUtils.isEmpty(work.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.b.getString(R.string.l2));
        Work work2 = user.profile.work;
        if (work2 != null && !TextUtils.isEmpty(work2.department) && !TextUtils.equals(user.profile.work.department, CoreModule.b.getString(R.string.l2))) {
            z = false;
        }
        if ((z2 || z) && !user.profile.studies.active) {
            arrayList.add(MarrySeriesType.PROFESSION);
        }
        ProfileExtensionBasic profileExtensionBasic = user.profile.extensions.basic;
        if (profileExtensionBasic == null || vwb.J(profileExtensionBasic.qualification) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.qualification.get(0))) {
            arrayList.add(MarrySeriesType.QUALIFICATIONS);
        }
        ProfileExtensionBasic profileExtensionBasic2 = user.profile.extensions.basic;
        if (profileExtensionBasic2 == null || ((vwb.J(profileExtensionBasic2.country) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.country.get(0))) && ((vwb.J(user.profile.extensions.basic.city) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.city.get(0))) && ((vwb.J(user.profile.extensions.basic.province) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.province.get(0))) && TextUtils.isEmpty(user.profile.hometown))))) {
            arrayList.add(MarrySeriesType.ADDRESS_HOMETOWN);
        }
        ProfileExtensionBasic profileExtensionBasic3 = user.profile.extensions.basic;
        if (profileExtensionBasic3 == null || vwb.J(profileExtensionBasic3.friendPurpose)) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE);
        }
        Physical physical = user.profile.extensions.physical;
        if (physical == null || vwb.J(physical.height) || TextUtils.equals((CharSequence) user.profile.extensions.physical.height.get(0), CoreModule.b.getString(R.string.l2))) {
            arrayList.add(MarrySeriesType.HEIGHT);
        }
        if (TextUtils.isEmpty(user.description) || user.description.length() < 15 || !TextUtils.isEmpty(CoreModule.c.q2.n3())) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_ABOUT_ME);
        }
        if (user.pictures.size() < 3) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS);
        }
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (!TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified") && !TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            arrayList.add(MarrySeriesType.PROFILE_FEATURED_AVATAR_AUTHENTICATION);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static void m7621l(Act act) {
        User userP9 = CoreModule.c.e0.p9();
        ArrayList<MarrySeriesType> arrayListM7619j = m7619j(userP9);
        if (arrayListM7619j.isEmpty()) {
            return;
        }
        Intent intentY1 = MarryEditProfileSeriesAct.Y1(act, userP9, arrayListM7619j, false, true, false);
        intentY1.putExtra("from", "from_ideal_type_swipe_guide");
        act.startActivityForResult(intentY1, new a.a() { // from class: l.cm90
            /* JADX INFO: renamed from: a */
            public final boolean m5965a(int i, int i2, Intent intent) {
                return km90.m7612c(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m7622m(final Act act, final d30 d30Var, final d30 d30Var2) {
        act.duringCreated(CoreModule.c.q2.p3()).subscribe(mkd0.H(new e30() { // from class: l.dm90
            public final void call(Object obj) {
                km90.m7623n(act, d30Var, d30Var2);
            }
        }, new e30() { // from class: l.em90
            public final void call(Object obj) {
                km90.m7615f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public static void m7623n(Act act, final d30 d30Var, d30 d30Var2) {
        if (ura.e().d().am()) {
            if (NullChecker.a(d30Var2)) {
                d30Var2.call();
                return;
            }
            return;
        }
        if (ura.e().d().bn()) {
            ura.e().d().Fa(act, "other");
            return;
        }
        User userNa = CoreModule.c.e0.na();
        ArrayList<MarrySeriesType> arrayListM7620k = m7620k(userNa);
        if (vwb.J(arrayListM7620k) && TextUtils.isEmpty(CoreModule.c.q2.n3())) {
            m7618i("good_user", d30Var);
        } else {
            if (CoreModule.P().a().v4()) {
                CoreModule.P().a().dm(act, new a.a() { // from class: l.fm90
                    /* JADX INFO: renamed from: a */
                    public final boolean m6484a(int i, int i2, Intent intent) {
                        return km90.m7610a(d30Var, i, i2, intent);
                    }
                });
                return;
            }
            Intent intentY1 = MarryEditProfileSeriesAct.Y1(act, userNa, arrayListM7620k, false, true, false);
            intentY1.putExtra("from_profile_featured", true);
            act.startActivityForResult(intentY1, new a.a() { // from class: l.gm90
                /* JADX INFO: renamed from: a */
                public final boolean m6771a(int i, int i2, Intent intent) {
                    return km90.m7614e(d30Var, i, i2, intent);
                }
            });
        }
    }
}
