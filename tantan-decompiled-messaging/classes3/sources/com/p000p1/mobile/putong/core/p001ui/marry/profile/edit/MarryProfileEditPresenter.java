package com.p000p1.mobile.putong.core.p001ui.marry.profile.edit;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.MarryProfileEditPresenter;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import l.jq2;
import l.l9b;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.tw6;
import l.vwb;
import l.yij0;
import p003l.cww;
import p003l.e30;
import p003l.fww;
import p003l.m250;
import p003l.v1x;
import p003l.vvl;
import p003l.w9j;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryProfileEditPresenter extends jq2<v1x> implements vvl {

    /* JADX INFO: renamed from: a */
    public User f282a;

    /* JADX INFO: renamed from: b */
    public int f283b;

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
        this.f283b = 0;
    }

    /* JADX INFO: renamed from: A0 */
    private void m463A0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ ProfileEditInfo m467h0(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m470x0(Bundle bundle) {
        ((v1x) ((jq2) this).viewModel).m8286m(bundle);
        ((v1x) ((jq2) this).viewModel).mo494d(this.f282a);
        if (bundle == null || !bundle.getBoolean("saveInstanceKey")) {
            m484p0();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m471C0(User user) {
        this.f282a = user;
        cww.m3491j(user);
        ((v1x) ((jq2) this).viewModel).mo494d(this.f282a);
    }

    /* JADX INFO: renamed from: D0 */
    public void m472D0() {
        CoreModule.c.e0.Ia();
    }

    @Override // p003l.vvl
    /* JADX INFO: renamed from: M */
    public void mo473M(List<Media> list) {
        if (NullChecker.a(this.f282a)) {
            User user = this.f282a;
            user.pictures = list;
            m471C0(user);
        }
    }

    @Override // p003l.vvl
    /* JADX INFO: renamed from: O */
    public void mo474O() {
        m479k0(true);
    }

    @Override // p003l.vvl
    /* JADX INFO: renamed from: Q */
    public void mo475Q(PhoneNumber phoneNumber, PhoneNumber phoneNumber2) {
        if (NullChecker.a(this.f282a) && NullChecker.a(this.f282a.settings)) {
            this.f282a.settings.phoneNumber = NullChecker.a(phoneNumber) ? phoneNumber.clone() : null;
            this.f282a.settings.linkedPhoneNumber = NullChecker.a(phoneNumber2) ? phoneNumber2.clone() : null;
            m471C0(this.f282a);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m476Z() {
        super.Z();
        m485q0();
        this.f283b = TextUtils.equals(act().getIntent().getStringExtra("editTab"), "preview") ? 1 : 0;
        creates(new e30() { // from class: l.l1x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5169a.m470x0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m477a0() {
        super.a0();
    }

    public void destroy() {
    }

    @Override // p003l.vvl
    /* JADX INFO: renamed from: f */
    public User mo478f() {
        return this.f282a;
    }

    /* JADX INFO: renamed from: k0 */
    public void m479k0(boolean z) {
        m480l0(z);
        ((v1x) ((jq2) this).viewModel).f8176j = true;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m480l0(boolean z) {
        if (!((v1x) ((jq2) this).viewModel).mo492I0(this.f282a, z)) {
            return false;
        }
        if (NullChecker.a(this.f282a) && NullChecker.a(this.f282a.profile) && NullChecker.a(this.f282a.profile.extensions)) {
            if (NullChecker.a(this.f282a.profile.extensions.basic)) {
                if (!vwb.J(this.f282a.profile.extensions.basic.province) && !TextUtils.isEmpty((CharSequence) this.f282a.profile.extensions.basic.province.get(0))) {
                    Profile profile = this.f282a.profile;
                    profile.hometown = (String) profile.extensions.basic.province.get(0);
                } else if (!vwb.J(this.f282a.profile.extensions.basic.country)) {
                    Profile profile2 = this.f282a.profile;
                    profile2.hometown = (String) profile2.extensions.basic.country.get(0);
                }
            }
            if (NullChecker.a(this.f282a.profile.extensions.marriage) && !vwb.J(this.f282a.profile.extensions.marriage.mateDescription)) {
                TextUtils.isEmpty((CharSequence) this.f282a.profile.extensions.marriage.mateDescription.get(0));
            }
            m482n0(this.f282a);
        }
        final User userNa = CoreModule.c.e0.na();
        final User userSubtract = this.f282a.subtract(userNa);
        if (!NullChecker.a(userSubtract)) {
            cww.m3489h();
            act().finish();
            return true;
        }
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = this.f282a.clone();
        act().progress(R.string.R0);
        duringCreated(CoreModule.c.B0.t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.m1x
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return MarryProfileEditPresenter.m467h0((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.n1x
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f5822a.m486r0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe((m250) mkd0.H(new e30() { // from class: l.o1x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6024a.m487s0((roj0) obj);
            }
        }, new e30() { // from class: l.p1x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6303a.m489u0(userNa, userSubtract, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m481m0() {
        return ((v1x) ((jq2) this).viewModel).mo497r0(false);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m482n0(User user) {
        Profile profile;
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null) {
            return;
        }
        if (vwb.J(profileExtensionMarriage.mateStatus)) {
            user.profile.extensions.marriage.mateStatus = vwb.f0(new String[]{"unlimited"});
        }
        if (vwb.J(user.profile.extensions.marriage.mateAge)) {
            user.profile.extensions.marriage.mateAge = vwb.f0(new String[]{"18", "unlimited"});
        }
        if (vwb.J(user.profile.extensions.marriage.mateQualification)) {
            user.profile.extensions.marriage.mateQualification = vwb.f0(new String[]{"unlimited"});
        }
        if (vwb.J(user.profile.extensions.marriage.mateHeight)) {
            user.profile.extensions.marriage.mateHeight = vwb.f0(new String[]{"unlimited", "unlimited"});
        }
        if (vwb.J(user.profile.extensions.marriage.mateIncome)) {
            user.profile.extensions.marriage.mateIncome = vwb.f0(new String[]{"unlimited"});
        }
        if (vwb.J(user.profile.extensions.marriage.mateAddress)) {
            user.profile.extensions.marriage.mateAddress = vwb.f0(new String[]{"different_city"});
        }
    }

    /* JADX INFO: renamed from: o0 */
    public int m483o0() {
        return this.f283b;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m484p0() {
        String stringExtra = act().getIntent().getStringExtra("marry_jump_marry");
        if (!TextUtils.equals(stringExtra, "jump_loop_type_default")) {
            if (TextUtils.equals(stringExtra, "marry_series_type_mate")) {
                act().startActivityForResult(MarryEditProfileSeriesAct.m498X1(act(), this.f282a, vwb.f0(new MarrySeriesType[]{MarrySeriesType.MATE}), false), 5001);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        List list = null;
        List list2 = (NullChecker.a(this.f282a.profile.extensions) && NullChecker.a(this.f282a.profile.extensions.marriage)) ? this.f282a.profile.extensions.marriage.status : null;
        if (NullChecker.a(this.f282a.profile.extensions) && NullChecker.a(this.f282a.profile.extensions.marriage)) {
            list = this.f282a.profile.extensions.marriage.expectedTime;
        }
        if (vwb.J(list2)) {
            arrayList.add(MarrySeriesType.STATUS);
        }
        if (vwb.J(list)) {
            arrayList.add(MarrySeriesType.EXPECTED_TIME);
        }
        if (vwb.J(arrayList)) {
            return;
        }
        act().startActivityForResult(MarryEditProfileSeriesAct.m498X1(act(), this.f282a, arrayList, false), 5001);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m485q0() {
        User userClone = CoreModule.c.e0.p9().clone();
        this.f282a = userClone;
        userClone.nullCheck();
        cww.m3491j(this.f282a);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C1099c m486r0(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.c.e0.u9(user);
        }
        User user2 = this.f282a;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        cww.m3490i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m487s0(roj0 roj0Var) {
        cww.m3489h();
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m488t0() {
        act().finish();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m489u0(User user, User user2, Throwable th) {
        act().progressDismiss();
        if (yij0.H(th)) {
            m463A0();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            m463A0();
            m471C0(this.f282a);
            if (tw6.d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
                lsi0.w(R.string.s);
                return;
            } else {
                osi0.f(R.string.Y0);
                return;
            }
        }
        if (NullChecker.a(act())) {
            m463A0();
            if (th instanceof TantanException.Client.TantanForbidden) {
                TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                if (tantanForbidden.isCannotModify() && !TextUtils.isEmpty(tantanForbidden.message)) {
                    return;
                }
            }
            String string = act().getString(R.string.A2);
            double dDoubleValue = (NullChecker.a(user.settings) && NullChecker.a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : 0.0d;
            if (NullChecker.a(user2.settings) && NullChecker.a(user2.settings.birthdate)) {
                dDoubleValue = user2.settings.birthdate.doubleValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis((long) dDoubleValue);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(qib0.H.guessedCurrentServerTime());
            int iT = l9b.T(calendar, calendar2);
            if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iT > 120) {
                string = act().getString(R.string.h0);
            } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                string = act().getString(R.string.i0);
            } else if (iT > 120) {
                string = act().getString(R.string.j0);
            }
            act().dialog().F(string).t0(R.string.i, new Runnable() { // from class: l.q1x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6579a.m488t0();
                }
            }).k0(R.string.a).z0();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m490y0(int i, int i2, Intent intent) {
        fww fwwVarM8285l = ((v1x) ((jq2) this).viewModel).m8285l();
        if (fwwVarM8285l instanceof fww) {
            fwwVarM8285l.mo457l0(i, i2, intent);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m491z0(String str) {
        fww fwwVarM8285l = ((v1x) ((jq2) this).viewModel).m8285l();
        if (fwwVarM8285l instanceof fww) {
            fwwVarM8285l.mo455S3(str);
        }
    }
}
