package com.p051p1.mobile.putong.core.p058ui.marry.profile.edit;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryProfileEditPresenter;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p137rx.C22421c;
import p153l.ar2;
import p153l.bsj0;
import p153l.bzw;
import p153l.ezw;
import p153l.jyb;
import p153l.ner;
import p153l.nyl;
import p153l.o1j0;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.u4x;
import p153l.uqb0;
import p153l.uxj0;
import p153l.wx6;
import p153l.y20;
import p153l.yab;

/* JADX INFO: loaded from: classes3.dex */
public class MarryProfileEditPresenter extends ar2<u4x> implements nyl {

    /* JADX INFO: renamed from: a */
    public User f31239a;

    /* JADX INFO: renamed from: b */
    public int f31240b;

    public static class ProfileEditInfoException extends RuntimeException {
        private ProfileEditInfo editInfo;

        public ProfileEditInfoException(ProfileEditInfo profileEditInfo) {
            this.editInfo = profileEditInfo;
        }

        public ProfileEditInfo getEditInfo() {
            return this.editInfo;
        }
    }

    public MarryProfileEditPresenter(ner nerVar) {
        super(nerVar);
        this.f31240b = 0;
    }

    /* JADX INFO: renamed from: A0 */
    private void m48603A0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ ProfileEditInfo m48607h0(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m48610x0(Bundle bundle) {
        ((u4x) this.viewModel).m194510m(bundle);
        ((u4x) this.viewModel).mo48632d(this.f31239a);
        if (bundle == null || !bundle.getBoolean("saveInstanceKey")) {
            m48622p0();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m48611C0(User user) {
        this.f31239a = user;
        bzw.m107268j(user);
        ((u4x) this.viewModel).mo48632d(this.f31239a);
    }

    /* JADX INFO: renamed from: D0 */
    public void m48612D0() {
        CoreModule.f18264c.f20381e0.m116475Ia();
    }

    @Override // p153l.nyl
    /* JADX INFO: renamed from: M */
    public void mo48613M(List<Media> list) {
        if (NullChecker.m82486a(this.f31239a)) {
            User user = this.f31239a;
            user.pictures = list;
            m48611C0(user);
        }
    }

    @Override // p153l.nyl
    /* JADX INFO: renamed from: O */
    public void mo48614O() {
        m48617k0(true);
    }

    @Override // p153l.nyl
    /* JADX INFO: renamed from: Q */
    public void mo48615Q(PhoneNumber phoneNumber, PhoneNumber phoneNumber2) {
        if (NullChecker.m82486a(this.f31239a) && NullChecker.m82486a(this.f31239a.settings)) {
            this.f31239a.settings.phoneNumber = NullChecker.m82486a(phoneNumber) ? phoneNumber.mo225055clone() : null;
            this.f31239a.settings.linkedPhoneNumber = NullChecker.m82486a(phoneNumber2) ? phoneNumber2.mo225055clone() : null;
            m48611C0(this.f31239a);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m48623q0();
        this.f31240b = TextUtils.equals(act().getIntent().getStringExtra("editTab"), "preview") ? 1 : 0;
        creates(new y20() { // from class: l.k4x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123948a.m48610x0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    @Override // p153l.nyl
    /* JADX INFO: renamed from: f */
    public User mo48616f() {
        return this.f31239a;
    }

    /* JADX INFO: renamed from: k0 */
    public void m48617k0(boolean z) {
        m48618l0(z);
        ((u4x) this.viewModel).f177556j = true;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m48618l0(boolean z) {
        if (!((u4x) this.viewModel).mo48630I0(this.f31239a, z)) {
            return false;
        }
        if (NullChecker.m82486a(this.f31239a) && NullChecker.m82486a(this.f31239a.profile) && NullChecker.m82486a(this.f31239a.profile.extensions)) {
            if (NullChecker.m82486a(this.f31239a.profile.extensions.basic)) {
                if (!jyb.m147479J(this.f31239a.profile.extensions.basic.province) && !TextUtils.isEmpty(this.f31239a.profile.extensions.basic.province.get(0))) {
                    Profile profile = this.f31239a.profile;
                    profile.hometown = profile.extensions.basic.province.get(0);
                } else if (!jyb.m147479J(this.f31239a.profile.extensions.basic.country)) {
                    Profile profile2 = this.f31239a.profile;
                    profile2.hometown = profile2.extensions.basic.country.get(0);
                }
            }
            if (NullChecker.m82486a(this.f31239a.profile.extensions.marriage) && !jyb.m147479J(this.f31239a.profile.extensions.marriage.mateDescription)) {
                TextUtils.isEmpty(this.f31239a.profile.extensions.marriage.mateDescription.get(0));
            }
            m48620n0(this.f31239a);
        }
        final User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        final User userSubtract = this.f31239a.subtract(userM116593na);
        if (!NullChecker.m82486a(userSubtract)) {
            bzw.m107266h();
            act().m68056e2();
            return true;
        }
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = this.f31239a.mo225055clone();
        act().progress(R$string.f28619R0);
        duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32624t4(profileEditInfoNew_).onErrorReturn(new qcj() { // from class: l.l4x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MarryProfileEditPresenter.m48607h0((Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.m4x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134836a.m48624r0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.n4x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140262a.m48625s0((uxj0) obj);
            }
        }, new y20() { // from class: l.o4x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145015a.m48627u0(userM116593na, userSubtract, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m48619m0() {
        return ((u4x) this.viewModel).mo48633r0(false);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m48620n0(User user) {
        Profile profile;
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        if (user == null || (profile = user.profile) == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null) {
            return;
        }
        if (jyb.m147479J(profileExtensionMarriage.mateStatus)) {
            user.profile.extensions.marriage.mateStatus = jyb.m147507f0("unlimited");
        }
        if (jyb.m147479J(user.profile.extensions.marriage.mateAge)) {
            user.profile.extensions.marriage.mateAge = jyb.m147507f0("18", "unlimited");
        }
        if (jyb.m147479J(user.profile.extensions.marriage.mateQualification)) {
            user.profile.extensions.marriage.mateQualification = jyb.m147507f0("unlimited");
        }
        if (jyb.m147479J(user.profile.extensions.marriage.mateHeight)) {
            user.profile.extensions.marriage.mateHeight = jyb.m147507f0("unlimited", "unlimited");
        }
        if (jyb.m147479J(user.profile.extensions.marriage.mateIncome)) {
            user.profile.extensions.marriage.mateIncome = jyb.m147507f0("unlimited");
        }
        if (jyb.m147479J(user.profile.extensions.marriage.mateAddress)) {
            user.profile.extensions.marriage.mateAddress = jyb.m147507f0("different_city");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public int m48621o0() {
        return this.f31240b;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m48622p0() {
        String stringExtra = act().getIntent().getStringExtra("marry_jump_marry");
        if (!TextUtils.equals(stringExtra, "jump_loop_type_default")) {
            if (TextUtils.equals(stringExtra, "marry_series_type_mate")) {
                act().startActivityForResult(MarryEditProfileSeriesAct.m48634Y1(act(), this.f31239a, jyb.m147507f0(MarrySeriesType.MATE), false), 5001);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = null;
        List<String> list2 = (NullChecker.m82486a(this.f31239a.profile.extensions) && NullChecker.m82486a(this.f31239a.profile.extensions.marriage)) ? this.f31239a.profile.extensions.marriage.status : null;
        if (NullChecker.m82486a(this.f31239a.profile.extensions) && NullChecker.m82486a(this.f31239a.profile.extensions.marriage)) {
            list = this.f31239a.profile.extensions.marriage.expectedTime;
        }
        if (jyb.m147479J(list2)) {
            arrayList.add(MarrySeriesType.STATUS);
        }
        if (jyb.m147479J(list)) {
            arrayList.add(MarrySeriesType.EXPECTED_TIME);
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        act().startActivityForResult(MarryEditProfileSeriesAct.m48634Y1(act(), this.f31239a, arrayList, false), 5001);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m48623q0() {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        this.f31239a = userMo225055clone;
        userMo225055clone.nullCheck();
        bzw.m107268j(this.f31239a);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C22421c m48624r0(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f18264c.f20381e0.m116620u9(user);
        }
        User user2 = this.f31239a;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        bzw.m107267i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m48625s0(uxj0 uxj0Var) {
        bzw.m107266h();
        act().progressDismiss();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m48626t0() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m48627u0(User user, User user2, Throwable th) {
        act().progressDismiss();
        if (bsj0.m106250H(th)) {
            m48603A0();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            m48603A0();
            m48611C0(this.f31239a);
            if (wx6.m208374d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
                o1j0.m165649w(R$string.f28771s);
                return;
            } else {
                r1j0.m179419f(R$string.f28654Y0);
                return;
            }
        }
        if (NullChecker.m82486a(act())) {
            m48603A0();
            if (th instanceof TantanException.Client.TantanForbidden) {
                TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                if (tantanForbidden.isCannotModify() && !TextUtils.isEmpty(tantanForbidden.message)) {
                    return;
                }
            }
            String string = act().getString(R$string.f28531A2);
            double dDoubleValue = (NullChecker.m82486a(user.settings) && NullChecker.m82486a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (NullChecker.m82486a(user2.settings) && NullChecker.m82486a(user2.settings.birthdate)) {
                dDoubleValue = user2.settings.birthdate.doubleValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis((long) dDoubleValue);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(uqb0.f180376H.guessedCurrentServerTime());
            int iM214863T = yab.m214863T(calendar, calendar2);
            if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iM214863T > 120) {
                string = act().getString(R$string.f28706h0);
            } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                string = act().getString(R$string.f28712i0);
            } else if (iM214863T > 120) {
                string = act().getString(R$string.f28718j0);
            }
            act().dialog().m21503F(string).m21555t0(R$string.f28711i, new Runnable() { // from class: l.p4x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f150571a.m48626t0();
                }
            }).m21540k0(R$string.f28663a).m21567z0();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m48628y0(int i, int i2, Intent intent) {
        ner nerVarM194509l = ((u4x) this.viewModel).m194509l();
        if (nerVarM194509l instanceof ezw) {
            ((ezw) nerVarM194509l).mo48597l0(i, i2, intent);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m48629z0(String str) {
        ner nerVarM194509l = ((u4x) this.viewModel).m194509l();
        if (nerVarM194509l instanceof ezw) {
            ((ezw) nerVarM194509l).mo48595S3(str);
        }
    }
}
