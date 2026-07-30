package com.p051p1.mobile.putong.core.p058ui.settings.personaldetails;

import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.settings.PersonalDetailsAct;
import com.p051p1.mobile.putong.core.p058ui.settings.intlGender.IntlGenderDetailsAct;
import com.p051p1.mobile.putong.core.p058ui.settings.personaldetails.IntlPersonalDetailsPresenter;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.IntlMoreGender;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.ar2;
import p153l.bsj0;
import p153l.dkb;
import p153l.hvo;
import p153l.i4g0;
import p153l.jyb;
import p153l.l4g0;
import p153l.ner;
import p153l.pcj;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u0012J\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010\rJ\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0007¢\u0006\u0004\b'\u0010\tR$\u0010/\u001a\u0004\u0018\u00010(8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u0010:\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010&R$\u0010>\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010&R\u0011\u0010A\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010D\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;", "Ll/ar2;", "Ll/hvo;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "s0", "()V", "", "isSettingChange", "D0", "(Z)V", "destroy", "", "from", "t0", "(Ljava/lang/String;)V", "a0", "Lcom/p1/mobile/putong/data/SettingGroups;", "settingGroups", "y0", "(Lcom/p1/mobile/putong/data/SettingGroups;)Z", "n", "G0", "", "date", "A0", "(D)V", "Lcom/p1/mobile/putong/data/BloodType;", "bloodType", "C0", "(Lcom/p1/mobile/putong/data/BloodType;)V", Constants.KEY_CONFIG, "H0", "Lcom/p1/mobile/putong/data/User;", "F0", "(Lcom/p1/mobile/putong/data/User;)V", "z0", "Ll/l4g0;", "a", "Ll/l4g0;", "getPageHelper", "()Ll/l4g0;", "setPageHelper", "(Ll/l4g0;)V", "pageHelper", "b", "Z", "hasShowDlg", "c", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "setUser", "user", "e", "q0", "setEditingUser", "editingUser", "r0", "()Ljava/lang/String;", "userName", "p0", "()D", "birthday", "ProfileEditInfoException", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlPersonalDetailsPresenter extends ar2<hvo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public l4g0 pageHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean hasShowDlg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public User user;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public User editingUser;

    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter$ProfileEditInfoException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "editInfo", "Lcom/p1/mobile/putong/core/data/ProfileEditInfo;", "<init>", "(Lcom/p1/mobile/putong/core/data/ProfileEditInfo;)V", "getEditInfo", "()Lcom/p1/mobile/putong/core/data/ProfileEditInfo;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class ProfileEditInfoException extends RuntimeException {

        @NotNull
        private final ProfileEditInfo editInfo;

        public ProfileEditInfoException(@NotNull ProfileEditInfo profileEditInfo) {
            profileEditInfo.getClass();
            this.editInfo = profileEditInfo;
        }

        @NotNull
        public final ProfileEditInfo getEditInfo() {
            return this.editInfo;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlPersonalDetailsPresenter(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m56805E0(IntlPersonalDetailsPresenter intlPersonalDetailsPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        intlPersonalDetailsPresenter.m56821D0(z);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m56807f0(IntlPersonalDetailsPresenter intlPersonalDetailsPresenter, C4470c c4470c) {
        c4470c.getClass();
        if (c4470c == C4470c.f16264f) {
            l4g0 l4g0Var = intlPersonalDetailsPresenter.pageHelper;
            l4g0Var.getClass();
            l4g0Var.m152774i();
            return;
        }
        if (c4470c == C4470c.f16267i) {
            l4g0 l4g0Var2 = intlPersonalDetailsPresenter.pageHelper;
            l4g0Var2.getClass();
            l4g0Var2.m152777l();
            if (intlPersonalDetailsPresenter.hasShowDlg) {
                return;
            }
            intlPersonalDetailsPresenter.m56828s0();
            return;
        }
        if (c4470c == C4470c.f16268j) {
            l4g0 l4g0Var3 = intlPersonalDetailsPresenter.pageHelper;
            l4g0Var3.getClass();
            l4g0Var3.m152776k();
        } else if (c4470c == C4470c.f16271m) {
            l4g0 l4g0Var4 = intlPersonalDetailsPresenter.pageHelper;
            l4g0Var4.getClass();
            l4g0Var4.m152775j();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m56808g0(IntlPersonalDetailsPresenter intlPersonalDetailsPresenter, Double d) {
        i4g0.m138520r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        if (NullChecker.m82486a(intlPersonalDetailsPresenter.editingUser)) {
            User user = intlPersonalDetailsPresenter.editingUser;
            user.getClass();
            if (NullChecker.m82486a(user.settings)) {
                User user2 = intlPersonalDetailsPresenter.editingUser;
                user2.getClass();
                Settings settings = user2.settings;
                settings.getClass();
                d.getClass();
                settings.birthdate = d;
                m56805E0(intlPersonalDetailsPresenter, false, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static C22421c m56809h0() {
        C22421c<uxj0> c22421cM32121j9 = CoreModule.f18264c.f20405m0.m32121j9();
        final Function1 function1 = new Function1() { // from class: l.duo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlPersonalDetailsPresenter.m56817u0((uxj0) obj);
            }
        };
        return c22421cM32121j9.switchMap(new qcj() { // from class: l.euo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPersonalDetailsPresenter.m56818x0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public static void m56810i0(IntlPersonalDetailsPresenter intlPersonalDetailsPresenter, User user) {
        user.getClass();
        V v2 = intlPersonalDetailsPresenter.viewModel;
        v2.getClass();
        ((hvo) v2).m137379b0();
        intlPersonalDetailsPresenter.user = user;
        User user2 = intlPersonalDetailsPresenter.editingUser;
        if (user2 == null) {
            intlPersonalDetailsPresenter.editingUser = user.mo225055clone();
            V v3 = intlPersonalDetailsPresenter.viewModel;
            v3.getClass();
            User user3 = intlPersonalDetailsPresenter.editingUser;
            user3.getClass();
            ((hvo) v3).m137383i0(user3);
            return;
        }
        if (NullChecker.m82486a(user2.settings)) {
            User user4 = intlPersonalDetailsPresenter.user;
            user4.getClass();
            if (NullChecker.m82486a(user4.settings)) {
                User user5 = intlPersonalDetailsPresenter.editingUser;
                user5.getClass();
                Settings settings = user5.settings;
                settings.getClass();
                User user6 = intlPersonalDetailsPresenter.user;
                user6.getClass();
                Settings settings2 = user6.settings;
                settings2.getClass();
                settings.phoneNumber = settings2.phoneNumber;
                User user7 = intlPersonalDetailsPresenter.editingUser;
                user7.getClass();
                Settings settings3 = user7.settings;
                settings3.getClass();
                User user8 = intlPersonalDetailsPresenter.user;
                user8.getClass();
                Settings settings4 = user8.settings;
                settings4.getClass();
                settings3.settingGroups = settings4.settingGroups;
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m56811j0(IntlPersonalDetailsPresenter intlPersonalDetailsPresenter, uxj0 uxj0Var) {
        Act act = intlPersonalDetailsPresenter.act();
        act.getClass();
        act.progressDismiss();
        V v2 = intlPersonalDetailsPresenter.viewModel;
        v2.getClass();
        User user = intlPersonalDetailsPresenter.editingUser;
        user.getClass();
        ((hvo) v2).m137383i0(user);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m56812k0(IntlPersonalDetailsPresenter intlPersonalDetailsPresenter, Bundle bundle) {
        V v2 = intlPersonalDetailsPresenter.viewModel;
        v2.getClass();
        ((hvo) v2).m137385r();
    }

    /* JADX INFO: renamed from: l0 */
    public static Double m56813l0() {
        Settings settings = CoreModule.f18264c.f20381e0.m116600p9().settings;
        settings.getClass();
        return settings.birthdate;
    }

    /* JADX INFO: renamed from: m0 */
    public static void m56814m0(Boolean bool) {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX INFO: renamed from: o0 */
    public static void m56816o0(IntlPersonalDetailsPresenter intlPersonalDetailsPresenter, Throwable th) {
        boolean z;
        Act act = intlPersonalDetailsPresenter.act();
        act.getClass();
        act.progressDismiss();
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!tantanForbidden.isCannotModify() || TextUtils.isEmpty(tantanForbidden.message)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (th instanceof ProfileEditInfoException) {
            r1j0.m179419f(R$string.f18664M7);
        } else if (z) {
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static final C22421c m56817u0(uxj0 uxj0Var) {
        return CoreModule.f18264c.f20381e0.m116596o9();
    }

    /* JADX INFO: renamed from: x0 */
    public static final C22421c m56818x0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m56819A0(double date) {
        i4g0.m138520r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        User user = this.editingUser;
        user.getClass();
        Settings settings = user.settings;
        settings.getClass();
        settings.birthdate = Double.valueOf(date);
        m56805E0(this, false, 1, null);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m56820C0(@Nullable BloodType bloodType) {
        User user = this.editingUser;
        user.getClass();
        user.profile.extensions.physical.bloodType.add(0, bloodType);
        m56805E0(this, false, 1, null);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m56821D0(boolean isSettingChange) {
        C22421c c22421cDuringCreated;
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        Settings settings2;
        SettingGroups settingGroup2;
        if (NullChecker.m82486a(this.user)) {
            User user = new User();
            user.settings = new Settings();
            User user2 = this.editingUser;
            user2.getClass();
            user.name = user2.name;
            User user3 = this.editingUser;
            if (!isSettingChange) {
                user3.getClass();
                user.gender = user3.gender;
            } else if (user3 != null && (settings = user3.settings) != null && (settingGroup = settings.getSettingGroup()) != null && (intlMoreGender = settingGroup.gender) != null && (settings2 = user.settings) != null && (settingGroup2 = settings2.getSettingGroup()) != null) {
                settingGroup2.gender = intlMoreGender;
            }
            Settings settings3 = user.settings;
            settings3.getClass();
            User user4 = this.editingUser;
            user4.getClass();
            Settings settings4 = user4.settings;
            settings4.getClass();
            settings3.birthdate = settings4.birthdate;
            User user5 = this.editingUser;
            user5.getClass();
            if (!jyb.m147479J(user5.profile.extensions.physical.bloodType)) {
                ArrayList arrayList = new ArrayList();
                User user6 = this.editingUser;
                user6.getClass();
                BloodType bloodType = user6.profile.extensions.physical.bloodType.get(0);
                bloodType.getClass();
                arrayList.add(bloodType);
                Profile profile = new Profile();
                user.profile = profile;
                profile.extensions = new Extensions();
                user.profile.extensions.physical = new Physical();
                user.profile.extensions.physical.bloodType = arrayList;
            }
            User userSubtract = user.subtract(this.user);
            if (NullChecker.m82486a(userSubtract)) {
                Act act = act();
                act.getClass();
                Act act2 = act();
                act2.getClass();
                act.progress(act2.getString(R$string.f18632L5), true);
                if (isSettingChange) {
                    dkb dkbVar = CoreModule.f18264c.f20381e0;
                    Settings settings5 = user.settings;
                    settings5.getClass();
                    c22421cDuringCreated = duringCreated(dkbVar.m116454D9(settings5.getSettingGroup()));
                    c22421cDuringCreated.getClass();
                } else {
                    c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract));
                    c22421cDuringCreated.getClass();
                }
                c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.wto
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        IntlPersonalDetailsPresenter.m56811j0(this.f190798a, (uxj0) obj);
                    }
                }, new y20() { // from class: l.yto
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        IntlPersonalDetailsPresenter.m56816o0(this.f201529a, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m56822F0(@NotNull User date) {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        SettingGroups settingGroup2;
        IntlMoreGender intlMoreGender2;
        Settings settings2;
        SettingGroups settingGroup3;
        IntlMoreGender intlMoreGender3;
        SettingGroups settingGroup4;
        IntlMoreGender intlMoreGender4;
        date.getClass();
        User user = this.editingUser;
        String str = null;
        if (user != null && (settings2 = user.settings) != null && (settingGroup3 = settings2.getSettingGroup()) != null && (intlMoreGender3 = settingGroup3.gender) != null) {
            Settings settings3 = date.settings;
            intlMoreGender3.newGender = (settings3 == null || (settingGroup4 = settings3.getSettingGroup()) == null || (intlMoreGender4 = settingGroup4.gender) == null) ? null : intlMoreGender4.newGender;
        }
        User user2 = this.editingUser;
        if (user2 != null && (settings = user2.settings) != null && (settingGroup = settings.getSettingGroup()) != null && (intlMoreGender = settingGroup.gender) != null) {
            Settings settings4 = date.settings;
            if (settings4 != null && (settingGroup2 = settings4.getSettingGroup()) != null && (intlMoreGender2 = settingGroup2.gender) != null) {
                str = intlMoreGender2.subGender;
            }
            intlMoreGender.subGender = str;
        }
        m56821D0(true);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m56823G0(@Nullable String n) {
        i4g0.m138520r("e_edit_basic_info_save_button", "p_edit_basic_info_view");
        User user = this.editingUser;
        user.getClass();
        n.getClass();
        user.name = n;
        m56805E0(this, false, 1, null);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m56824H0(boolean config) {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        User user = this.editingUser;
        if (user != null && (settings = user.settings) != null && (settingGroup = settings.getSettingGroup()) != null && (intlMoreGender = settingGroup.gender) != null) {
            intlMoreGender.showOnProfile = Boolean.valueOf(config);
        }
        m56821D0(true);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.zto
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPersonalDetailsPresenter.m56812k0(this.f206031a, (Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.auo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPersonalDetailsPresenter.m56807f0(this.f73534a, (C4470c) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.buo
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return IntlPersonalDetailsPresenter.m56809h0();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.cuo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPersonalDetailsPresenter.m56810i0(this.f83860a, (User) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: p0 */
    public final double m56825p0() {
        User user = this.editingUser;
        user.getClass();
        Settings settings = user.settings;
        settings.getClass();
        Double d = settings.birthdate;
        d.getClass();
        return d.doubleValue();
    }

    @Nullable
    /* JADX INFO: renamed from: q0, reason: from getter */
    public final User getEditingUser() {
        return this.editingUser;
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final String m56827r0() {
        User user = this.editingUser;
        user.getClass();
        String str = user.name;
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m56828s0() {
        this.hasShowDlg = true;
        if (TextUtils.equals(this.from, "alert") && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9().settings)) {
            boolean zM116579k8 = CoreModule.f18264c.f20381e0.m116579k8();
            V v2 = this.viewModel;
            if (zM116579k8) {
                v2.getClass();
                ((hvo) v2).m137382h0();
            } else {
                v2.getClass();
                CoreDlg.m46176I1(((hvo) v2).getAct(), new pcj() { // from class: l.fuo
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return IntlPersonalDetailsPresenter.m56813l0();
                    }
                }, new y20() { // from class: l.guo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        IntlPersonalDetailsPresenter.m56808g0(this.f106526a, (Double) obj);
                    }
                }, new y20() { // from class: l.xto
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        IntlPersonalDetailsPresenter.m56814m0((Boolean) obj);
                    }
                });
                i4g0.m138526x("e_edit_basic_info_calendar", "p_edit_basic_info_view");
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m56829t0(@Nullable String from) {
        this.from = from;
        this.pageHelper = new l4g0("p_edit_basic_info_view", PersonalDetailsAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("came_from", from);
            l4g0 l4g0Var = this.pageHelper;
            l4g0Var.getClass();
            l4g0Var.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m56830y0(@Nullable SettingGroups settingGroups) {
        return uqb0.f180396b0.f170324a.mo29171rq(settingGroups);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m56831z0() {
        Act act;
        User user = this.editingUser;
        if (user == null || (act = act()) == null) {
            return;
        }
        act.startActivityForResult(IntlGenderDetailsAct.INSTANCE.m56744a(act(), user), 1);
    }
}
