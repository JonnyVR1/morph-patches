package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.IntlMoreGender;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.StepSignupStage;
import com.p051p1.mobile.putong.data.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ%\u0010\u0014\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\tJ\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\tJ'\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u0013\u0010#\"\u0004\b$\u0010\u0017¨\u0006&"}, m88121d2 = {"Ll/clf0;", "Ll/ar2;", "Ll/flf0;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "a0", "()V", "Landroid/os/Bundle;", "sis", "m0", "(Landroid/os/Bundle;)V", "destroy", "", "", "selectedList", "", "isLanguage", "o0", "(Ljava/util/List;Z)V", "p0", "(Z)V", "n0", "q0", "Lcom/p1/mobile/putong/data/Profile;", "l0", "(Ljava/util/List;Z)Lcom/p1/mobile/putong/data/Profile;", "Lcom/p1/mobile/putong/data/SignUpData;", "a", "Lcom/p1/mobile/putong/data/SignUpData;", "data", "b", "Z", "()Z", "setLanguage", "Companion", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class clf0 extends ar2<flf0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public SignUpData data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isLanguage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clf0(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m110609e0(clf0 clf0Var, uxj0 uxj0Var) {
        flf0 flf0Var = (flf0) clf0Var.viewModel;
        if (flf0Var != null) {
            flf0Var.m126138s(false);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m110610f0(clf0 clf0Var, User user) {
        IntlGender intlGender;
        PhoneNumber phoneNumber;
        PhoneNumber phoneNumber2;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        Boolean bool;
        SettingGroups settingGroup2;
        user.getClass();
        SignUpData signUpData = clf0Var.data;
        if (signUpData != null) {
            signUpData.name = user.name;
        }
        String str = null;
        if (signUpData != null) {
            Settings settings = user.settings;
            signUpData.birthdate = settings != null ? settings.birthdate : null;
        }
        Settings settings2 = user.settings;
        int i = 0;
        if (((settings2 == null || (settingGroup2 = settings2.getSettingGroup()) == null) ? null : settingGroup2.gender) != null) {
            SignUpData signUpData2 = clf0Var.data;
            if (signUpData2 != null) {
                Settings settings3 = user.settings;
                signUpData2.profileShowGender = (settings3 == null || (settingGroup = settings3.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null || (bool = intlMoreGender.showOnProfile) == null) ? false : bool.booleanValue();
            }
            Settings settings4 = user.settings;
            settings4.getClass();
            intlGender = settings4.getSettingGroup().gender.newGender;
        } else {
            intlGender = null;
        }
        SignUpData signUpData3 = clf0Var.data;
        if (signUpData3 != null) {
            signUpData3.gender = user.gender;
        }
        if (signUpData3 != null) {
            signUpData3.newGender = intlGender;
        }
        if (signUpData3 != null) {
            Settings settings5 = user.settings;
            if (settings5 != null && (phoneNumber2 = settings5.phoneNumber) != null) {
                str = phoneNumber2.number;
            }
            signUpData3.phoneNumber = str;
        }
        if (signUpData3 != null) {
            Settings settings6 = user.settings;
            if (settings6 != null && (phoneNumber = settings6.phoneNumber) != null) {
                i = phoneNumber.countryCode;
            }
            signUpData3.countryCode = i;
        }
        String str2 = AccountModule.f16756c.m29306R0().get();
        if (!TextUtils.isEmpty(str2)) {
            SignUpData signUpData4 = clf0Var.data;
            if (signUpData4 != null) {
                signUpData4.profilePath = str2;
            }
            if (signUpData4 != null) {
                signUpData4.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            }
        }
        AccountModule.f16756c.m29336i2(clf0Var.data);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m110611g0(clf0 clf0Var, Throwable th) {
        Act act = clf0Var.act();
        if (act != null) {
            act.progressDismiss();
        }
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m110612h0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static void m110613i0(Throwable th) {
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m110614j0(clf0 clf0Var, Bundle bundle) {
        ((flf0) clf0Var.viewModel).m126136n(clf0Var.isLanguage);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m110615k0(clf0 clf0Var, uxj0 uxj0Var) {
        Act act = clf0Var.act();
        if (act != null) {
            act.progressDismiss();
            act.startActivity(C16330cp.m111725k(((flf0) clf0Var.viewModel).getAct(), clf0Var.data));
            act.m68056e2();
            bsj0.m106261S(act);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.zkf0
            @Override // p153l.y20
            public final void call(Object obj) {
                clf0.m110614j0(this.f204774a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final Profile m110616l0(List<String> selectedList, boolean isLanguage) {
        Profile profile = new Profile();
        Extensions extensions = new Extensions();
        profile.extensions = extensions;
        extensions.basic = new ProfileExtensionBasic();
        Extensions extensions2 = profile.extensions;
        if (isLanguage) {
            extensions2.basic.language = selectedList;
            return profile;
        }
        extensions2.basic.ethnicity = selectedList;
        return profile;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m110617m0(@Nullable Bundle sis) {
        flf0 flf0Var;
        Act actM126130f;
        Intent intent;
        if (sis != null) {
            Serializable serializable = sis.getSerializable("signup_data");
            this.data = serializable instanceof SignUpData ? (SignUpData) serializable : null;
            this.isLanguage = sis.getBoolean("signup_language", false);
        }
        if (this.data == null && (flf0Var = (flf0) this.viewModel) != null && (actM126130f = flf0Var.getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String()) != null && (intent = actM126130f.getIntent()) != null) {
            Serializable serializableExtra = intent.getSerializableExtra("signup_data");
            this.data = serializableExtra instanceof SignUpData ? (SignUpData) serializableExtra : null;
            this.isLanguage = intent.getBooleanExtra("signup_language", false);
        }
        if (!this.isLanguage && TextUtils.isEmpty(mdp.INSTANCE.m157986h())) {
            m110621q0();
        }
        if (this.data == null) {
            m110618n0();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m110618n0() {
        Act act;
        C22421c c22421cDuringCreated;
        this.data = new SignUpData();
        if (!ike.m140276h().m140285k() || (act = ((flf0) this.viewModel).getAct()) == null || (c22421cDuringCreated = act.duringCreated(AccountModule.f16756c.m29317Y0())) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.xkf0
            @Override // p153l.y20
            public final void call(Object obj) {
                clf0.m110610f0(this.f194784a, (User) obj);
            }
        }, new y20() { // from class: l.ykf0
            @Override // p153l.y20
            public final void call(Object obj) {
                clf0.m110613i0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m110619o0(@Nullable List<String> selectedList, boolean isLanguage) {
        C22421c c22421cDuringCreated;
        SignUpData signUpData = this.data;
        if (signUpData == null) {
            m110618n0();
            return;
        }
        if (signUpData != null) {
            if (isLanguage) {
                signUpData.language = selectedList;
            } else {
                signUpData.ethnicity = selectedList;
            }
            signUpData.signUpType = isLanguage ? AccountTempApi.SignUpType.languageSaved : AccountTempApi.SignUpType.ethnicitySaved;
        }
        Act act = act();
        if (act == null || (c22421cDuringCreated = act.duringCreated(ike.m140278q(this.data, null))) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.alf0
            @Override // p153l.y20
            public final void call(Object obj) {
                clf0.m110615k0(this.f72110a, (uxj0) obj);
            }
        }, new y20() { // from class: l.blf0
            @Override // p153l.y20
            public final void call(Object obj) {
                clf0.m110611g0(this.f77193a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m110620p0(boolean isLanguage) {
        ike.m140276h().m140281f(SignupStage.get("verified"), StepSignupStage.get(isLanguage ? StepSignupStage.language_saved : StepSignupStage.ethnicity_saved));
        Act act = act();
        if (act != null) {
            act.startActivity(C16330cp.m111725k(act, this.data));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m110621q0() {
        C22421c c22421cDuringCreated;
        Profile profileM110616l0 = m110616l0(new ArrayList(), false);
        Act act = act();
        if (act == null || (c22421cDuringCreated = act.duringCreated(AccountModule.f16756c.m29334h1(profileM110616l0, null))) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.vkf0
            @Override // p153l.y20
            public final void call(Object obj) {
                clf0.m110609e0(this.f184482a, (uxj0) obj);
            }
        }, new y20() { // from class: l.wkf0
            @Override // p153l.y20
            public final void call(Object obj) {
                clf0.m110612h0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
