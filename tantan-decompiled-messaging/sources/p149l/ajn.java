package p149l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.intlGender.C8890a;
import com.p046p1.mobile.putong.core.p053ui.settings.intlGender.IntlGenderDetailsAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.IntlMoreGender;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\tR$\u0010)\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00100\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00108\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0016\"\u0004\b7\u0010\u0019R$\u0010=\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u0010\u001cR\u001c\u0010@\u001a\n >*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010$¨\u0006A"}, m87232d2 = {"Ll/ajn;", "Ll/jq2;", "Lcom/p1/mobile/putong/core/ui/settings/intlGender/a;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "destroy", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "o0", "(Lcom/p1/mobile/putong/data/User;)V", "a0", "Lcom/p1/mobile/putong/data/IntlGender;", "j0", "()Lcom/p1/mobile/putong/data/IntlGender;", "i0", "()Lcom/p1/mobile/putong/data/User;", "", "k0", "()Ljava/lang/String;", "subGender", "r0", "(Ljava/lang/String;)V", "gender", "q0", "(Lcom/p1/mobile/putong/data/IntlGender;)V", "Landroid/content/Intent;", "data", "p0", "(Landroid/content/Intent;)V", "l0", "Ll/cwf0;", "a", "Ll/cwf0;", "getPageHelper", "()Ll/cwf0;", "setPageHelper", "(Ll/cwf0;)V", "pageHelper", "b", "Lcom/p1/mobile/putong/data/User;", "_user", "", "c", "Z", "isChange", "()Z", "setChange", "(Z)V", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "getOldSubGender", "setOldSubGender", "oldSubGender", "e", "Lcom/p1/mobile/putong/data/IntlGender;", "getOldGender", "setOldGender", "oldGender", "kotlin.jvm.PlatformType", "f", "popupDialogPageHelper", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ajn extends jq2<C8890a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public cwf0 pageHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public User _user;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isChange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String oldSubGender;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public IntlGender oldGender;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final cwf0 popupDialogPageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajn(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
        this.popupDialogPageHelper = i0e.m133794c("p_clone_gender_edit_confirm", Dialog.class.getName());
    }

    /* JADX INFO: renamed from: e0 */
    public static void m96989e0(ajn ajnVar, Bundle bundle) {
        V v2 = ajnVar.viewModel;
        v2.getClass();
        ((C8890a) v2).m55578r();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m96992h0(ajn ajnVar, C4319c c4319c) {
        c4319c.getClass();
        if (c4319c == C4319c.f15545f) {
            cwf0 cwf0Var = ajnVar.pageHelper;
            cwf0Var.getClass();
            cwf0Var.m109033i();
            return;
        }
        if (c4319c == C4319c.f15548i) {
            cwf0 cwf0Var2 = ajnVar.pageHelper;
            cwf0Var2.getClass();
            cwf0Var2.m109036l();
        } else if (c4319c == C4319c.f15549j) {
            cwf0 cwf0Var3 = ajnVar.pageHelper;
            cwf0Var3.getClass();
            cwf0Var3.m109035k();
        } else if (c4319c == C4319c.f15552m) {
            cwf0 cwf0Var4 = ajnVar.pageHelper;
            cwf0Var4.getClass();
            cwf0Var4.m109034j();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m96993m0(ajn ajnVar, Intent intent) {
        zvf0.m220396r("e_clone_gender_edit_confirm", "p_clone_gender_edit_confirm");
        Act act = ajnVar.act();
        if (act != null) {
            act.setResult(-1, intent);
        }
        Act act2 = ajnVar.act();
        if (act2 != null) {
            act2.m66873d2();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m96994n0(ajn ajnVar, DialogInterface dialogInterface) {
        i0e.m133796e(ajnVar.popupDialogPageHelper);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.win
            @Override // p149l.e30
            public final void call(Object obj) {
                ajn.m96989e0(this.f186554a, (Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.xin
            @Override // p149l.e30
            public final void call(Object obj) {
                ajn.m96992h0(this.f193138a, (C4319c) obj);
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final User get_user() {
        return this._user;
    }

    @SuppressLint({"WrongConstant"})
    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final IntlGender m96996j0() {
        Gender gender;
        IntlGender intlGender;
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        IntlGender intlGender2 = IntlGender.get("unknown_");
        User user = this._user;
        if (user == null || (gender = user.gender) == null) {
            gender = Gender.get("unknown_");
        }
        User user2 = this._user;
        if (user2 == null || (settings = user2.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null || (intlGender = intlMoreGender.newGender) == null) {
            intlGender = IntlGender.get(gender.toString());
        }
        if (!TEnum.equals(intlGender, intlGender2)) {
            intlGender2 = intlGender;
        }
        intlGender2.getClass();
        return intlGender2;
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public final String m96997k0() {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        User user = this._user;
        if (user == null || (settings = user.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null) {
            return null;
        }
        return intlMoreGender.subGender;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: l0 */
    public final void m96998l0() {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        Settings settings2;
        SettingGroups settingGroup2;
        IntlMoreGender intlMoreGender2;
        zvf0.m220396r("e_clone_gender_save", "p_clone_gender_edit");
        Act act = act();
        if (act != null) {
            this.isChange = (Intrinsics.m87488d(m96996j0(), this.oldGender) && Intrinsics.m87488d(m96997k0(), this.oldSubGender)) ? false : true;
            final Intent intent = new Intent();
            if (!this.isChange) {
                Act act2 = act();
                if (act2 != null) {
                    act2.setResult(0, intent);
                }
                Act act3 = act();
                if (act3 != null) {
                    act3.m66873d2();
                    return;
                }
                return;
            }
            User user = this._user;
            if (((user == null || (settings2 = user.settings) == null || (settingGroup2 = settings2.getSettingGroup()) == null || (intlMoreGender2 = settingGroup2.gender) == null) ? null : intlMoreGender2.newGender) == null) {
                User user2 = this._user;
                if ((user2 != null ? user2.gender : null) != null && user2 != null && (settings = user2.settings) != null && (settingGroup = settings.getSettingGroup()) != null && (intlMoreGender = settingGroup.gender) != null) {
                    User user3 = this._user;
                    user3.getClass();
                    intlMoreGender.newGender = IntlGender.get(user3.gender.toString());
                }
            }
            intent.putExtra("result_data", this._user);
            i0e.m133797f(this.popupDialogPageHelper);
            new dd80.C16336a(act).m110996y0(act.string(R$string.f18884rf)).m110991t0(act.string(R$string.f18854qf)).m110974c0(act.getString(R$string.f18824pf), new Runnable() { // from class: l.yin
                @Override // java.lang.Runnable
                public final void run() {
                    ajn.m96993m0(this.f198523a, intent);
                }
            }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.zin
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ajn.m96994n0(this.f203345a, dialogInterface);
                }
            }).m110968W(act.string(R$string.f18793of)).m110961P(true).m110989r0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m96999o0(@Nullable User user) {
        this._user = user;
        this.oldSubGender = m96997k0();
        this.oldGender = m96996j0();
        this.pageHelper = new cwf0("p_clone_gender_edit", IntlGenderDetailsAct.class.getName());
    }

    /* JADX INFO: renamed from: p0 */
    public final void m97000p0(@NotNull Intent data) {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        Settings settings2;
        SettingGroups settingGroup2;
        IntlMoreGender intlMoreGender2;
        data.getClass();
        IntlMoreGender intlMoreGender3 = (IntlMoreGender) data.getSerializableExtra("result_data");
        if (intlMoreGender3 != null) {
            User user = this._user;
            if (Intrinsics.m87488d((user == null || (settings2 = user.settings) == null || (settingGroup2 = settings2.getSettingGroup()) == null || (intlMoreGender2 = settingGroup2.gender) == null) ? null : intlMoreGender2.subGender, intlMoreGender3.subGender)) {
                return;
            }
            User user2 = this._user;
            if (user2 != null && (settings = user2.settings) != null && (settingGroup = settings.getSettingGroup()) != null && (intlMoreGender = settingGroup.gender) != null) {
                intlMoreGender.subGender = intlMoreGender3.subGender;
            }
            ((C8890a) this.viewModel).m55571j();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m97001q0(@Nullable IntlGender gender) {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        User user = this._user;
        if (user == null || (settings = user.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null) {
            return;
        }
        intlMoreGender.newGender = gender;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m97002r0(@Nullable String subGender) {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        User user = this._user;
        if (user == null || (settings = user.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null) {
            return;
        }
        intlMoreGender.subGender = subGender;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
