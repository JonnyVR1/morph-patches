package com.p046p1.mobile.putong.core.p053ui.marry.profile.edit;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryProfileEditPresenter;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p133rx.C22306c;
import p149l.cww;
import p149l.e30;
import p149l.fww;
import p149l.jq2;
import p149l.l9b;
import p149l.lsi0;
import p149l.mcr;
import p149l.mkd0;
import p149l.osi0;
import p149l.pcl0;
import p149l.qib0;
import p149l.roj0;
import p149l.tw6;
import p149l.v1x;
import p149l.vvl;
import p149l.vwb;
import p149l.w9j;
import p149l.yij0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryProfileEditPresenter extends jq2<v1x> implements vvl {

    /* JADX INFO: renamed from: a */
    public User f30391a;

    /* JADX INFO: renamed from: b */
    public int f30392b;

    public static class ProfileEditInfoException extends RuntimeException {
        private ProfileEditInfo editInfo;

        public ProfileEditInfoException(ProfileEditInfo profileEditInfo) {
            this.editInfo = profileEditInfo;
        }

        public ProfileEditInfo getEditInfo() {
            return this.editInfo;
        }
    }

    public MarryProfileEditPresenter(mcr mcrVar) {
        super(mcrVar);
        this.f30392b = 0;
    }

    /* JADX INFO: renamed from: A0 */
    private void m47420A0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ ProfileEditInfo m47424h0(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m47427x0(Bundle bundle) {
        ((v1x) this.viewModel).m196661m(bundle);
        ((v1x) this.viewModel).mo47449d(this.f30391a);
        if (bundle == null || !bundle.getBoolean("saveInstanceKey")) {
            m47439p0();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m47428C0(User user) {
        this.f30391a = user;
        cww.m109077j(user);
        ((v1x) this.viewModel).mo47449d(this.f30391a);
    }

    /* JADX INFO: renamed from: D0 */
    public void m47429D0() {
        CoreModule.f17545c.f19639e0.m169402Ia();
    }

    @Override // p149l.vvl
    /* JADX INFO: renamed from: M */
    public void mo47430M(List<Media> list) {
        if (NullChecker.m81303a(this.f30391a)) {
            User user = this.f30391a;
            user.pictures = list;
            m47428C0(user);
        }
    }

    @Override // p149l.vvl
    /* JADX INFO: renamed from: O */
    public void mo47431O() {
        m47434k0(true);
    }

    @Override // p149l.vvl
    /* JADX INFO: renamed from: Q */
    public void mo47432Q(PhoneNumber phoneNumber, PhoneNumber phoneNumber2) {
        if (NullChecker.m81303a(this.f30391a) && NullChecker.m81303a(this.f30391a.settings)) {
            this.f30391a.settings.phoneNumber = NullChecker.m81303a(phoneNumber) ? phoneNumber.mo223809clone() : null;
            this.f30391a.settings.linkedPhoneNumber = NullChecker.m81303a(phoneNumber2) ? phoneNumber2.mo223809clone() : null;
            m47428C0(this.f30391a);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m47440q0();
        this.f30392b = TextUtils.equals(act().getIntent().getStringExtra("editTab"), "preview") ? 1 : 0;
        creates(new e30() { // from class: l.l1x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125690a.m47427x0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    @Override // p149l.vvl
    /* JADX INFO: renamed from: f */
    public User mo47433f() {
        return this.f30391a;
    }

    /* JADX INFO: renamed from: k0 */
    public void m47434k0(boolean z) {
        m47435l0(z);
        ((v1x) this.viewModel).f179295j = true;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m47435l0(boolean z) {
        if (!((v1x) this.viewModel).mo47447I0(this.f30391a, z)) {
            return false;
        }
        if (NullChecker.m81303a(this.f30391a) && NullChecker.m81303a(this.f30391a.profile) && NullChecker.m81303a(this.f30391a.profile.extensions)) {
            if (NullChecker.m81303a(this.f30391a.profile.extensions.basic)) {
                if (!vwb.m200296J(this.f30391a.profile.extensions.basic.province) && !TextUtils.isEmpty(this.f30391a.profile.extensions.basic.province.get(0))) {
                    Profile profile = this.f30391a.profile;
                    profile.hometown = profile.extensions.basic.province.get(0);
                } else if (!vwb.m200296J(this.f30391a.profile.extensions.basic.country)) {
                    Profile profile2 = this.f30391a.profile;
                    profile2.hometown = profile2.extensions.basic.country.get(0);
                }
            }
            if (NullChecker.m81303a(this.f30391a.profile.extensions.marriage) && !vwb.m200296J(this.f30391a.profile.extensions.marriage.mateDescription)) {
                TextUtils.isEmpty(this.f30391a.profile.extensions.marriage.mateDescription.get(0));
            }
            m47437n0(this.f30391a);
        }
        final User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        final User userSubtract = this.f30391a.subtract(userM169520na);
        if (!NullChecker.m81303a(userSubtract)) {
            cww.m109075h();
            act().m66873d2();
            return true;
        }
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = this.f30391a.mo223809clone();
        act().progress(R$string.f27771R0);
        duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31621t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.m1x
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MarryProfileEditPresenter.m47424h0((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.n1x
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136729a.m47441r0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.o1x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141485a.m47442s0((roj0) obj);
            }
        }, new e30() { // from class: l.p1x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146777a.m47444u0(userM169520na, userSubtract, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m47436m0() {
        return ((v1x) this.viewModel).mo47450r0(false);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m47437n0(User user) {
        Profile profile;
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null) {
            return;
        }
        if (vwb.m200296J(profileExtensionMarriage.mateStatus)) {
            user.profile.extensions.marriage.mateStatus = vwb.m200324f0("unlimited");
        }
        if (vwb.m200296J(user.profile.extensions.marriage.mateAge)) {
            user.profile.extensions.marriage.mateAge = vwb.m200324f0("18", "unlimited");
        }
        if (vwb.m200296J(user.profile.extensions.marriage.mateQualification)) {
            user.profile.extensions.marriage.mateQualification = vwb.m200324f0("unlimited");
        }
        if (vwb.m200296J(user.profile.extensions.marriage.mateHeight)) {
            user.profile.extensions.marriage.mateHeight = vwb.m200324f0("unlimited", "unlimited");
        }
        if (vwb.m200296J(user.profile.extensions.marriage.mateIncome)) {
            user.profile.extensions.marriage.mateIncome = vwb.m200324f0("unlimited");
        }
        if (vwb.m200296J(user.profile.extensions.marriage.mateAddress)) {
            user.profile.extensions.marriage.mateAddress = vwb.m200324f0("different_city");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public int m47438o0() {
        return this.f30392b;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m47439p0() {
        String stringExtra = act().getIntent().getStringExtra("marry_jump_marry");
        if (!TextUtils.equals(stringExtra, "jump_loop_type_default")) {
            if (TextUtils.equals(stringExtra, "marry_series_type_mate")) {
                act().startActivityForResult(MarryEditProfileSeriesAct.m47451X1(act(), this.f30391a, vwb.m200324f0(MarrySeriesType.MATE), false), 5001);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = null;
        List<String> list2 = (NullChecker.m81303a(this.f30391a.profile.extensions) && NullChecker.m81303a(this.f30391a.profile.extensions.marriage)) ? this.f30391a.profile.extensions.marriage.status : null;
        if (NullChecker.m81303a(this.f30391a.profile.extensions) && NullChecker.m81303a(this.f30391a.profile.extensions.marriage)) {
            list = this.f30391a.profile.extensions.marriage.expectedTime;
        }
        if (vwb.m200296J(list2)) {
            arrayList.add(MarrySeriesType.STATUS);
        }
        if (vwb.m200296J(list)) {
            arrayList.add(MarrySeriesType.EXPECTED_TIME);
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        act().startActivityForResult(MarryEditProfileSeriesAct.m47451X1(act(), this.f30391a, arrayList, false), 5001);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m47440q0() {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        this.f30391a = userMo223809clone;
        userMo223809clone.nullCheck();
        cww.m109077j(this.f30391a);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C22306c m47441r0(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f17545c.f19639e0.m169547u9(user);
        }
        User user2 = this.f30391a;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        cww.m109076i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m47442s0(roj0 roj0Var) {
        cww.m109075h();
        act().progressDismiss();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m47443t0() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m47444u0(User user, User user2, Throwable th) {
        act().progressDismiss();
        if (yij0.m214930H(th)) {
            m47420A0();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            m47420A0();
            m47428C0(this.f30391a);
            if (tw6.m190849d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
                lsi0.m151593w(R$string.f27923s);
                return;
            } else {
                osi0.m165782f(R$string.f27806Y0);
                return;
            }
        }
        if (NullChecker.m81303a(act())) {
            m47420A0();
            if (th instanceof TantanException.Client.TantanForbidden) {
                TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                if (tantanForbidden.isCannotModify() && !TextUtils.isEmpty(tantanForbidden.message)) {
                    return;
                }
            }
            String string = act().getString(R$string.f27683A2);
            double dDoubleValue = (NullChecker.m81303a(user.settings) && NullChecker.m81303a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (NullChecker.m81303a(user2.settings) && NullChecker.m81303a(user2.settings.birthdate)) {
                dDoubleValue = user2.settings.birthdate.doubleValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis((long) dDoubleValue);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(qib0.f154693H.guessedCurrentServerTime());
            int iM149011T = l9b.m149011T(calendar, calendar2);
            if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iM149011T > 120) {
                string = act().getString(R$string.f27858h0);
            } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                string = act().getString(R$string.f27864i0);
            } else if (iM149011T > 120) {
                string = act().getString(R$string.f27870j0);
            }
            act().dialog().m20504F(string).m20556t0(R$string.f27863i, new Runnable() { // from class: l.q1x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152172a.m47443t0();
                }
            }).m20541k0(R$string.f27815a).m20568z0();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m47445y0(int i, int i2, Intent intent) {
        pcl0 pcl0VarM196660l = ((v1x) this.viewModel).m196660l();
        if (pcl0VarM196660l instanceof fww) {
            ((fww) pcl0VarM196660l).mo47414l0(i, i2, intent);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m47446z0(String str) {
        pcl0 pcl0VarM196660l = ((v1x) this.viewModel).m196660l();
        if (pcl0VarM196660l instanceof fww) {
            ((fww) pcl0VarM196660l).mo47412S3(str);
        }
    }
}
