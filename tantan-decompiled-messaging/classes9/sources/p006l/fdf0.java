package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.IntlMoreGender;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.User;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.yij0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u001b\u0010\u0013\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ll/fdf0;", "Ll/jq2;", "Ll/idf0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "k0", "()V", "a0", "Landroid/os/Bundle;", "sis", "j0", "(Landroid/os/Bundle;)V", "destroy", "", "", "selectList", "l0", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/SignUpData;", "a", "Lcom/p1/mobile/putong/data/SignUpData;", "data", "Companion", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class fdf0 extends jq2<idf0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public SignUpData data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdf0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m15309e0(fdf0 fdf0Var, Bundle bundle) {
        ((idf0) ((jq2) fdf0Var).viewModel).m16629r();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m15310f0(fdf0 fdf0Var, Throwable th) {
        Act act = fdf0Var.act();
        if (act != null) {
            act.progressDismiss();
        }
        yij0.D(th);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m15311g0(fdf0 fdf0Var, roj0 roj0Var) {
        Act act = fdf0Var.act();
        if (act != null) {
            act.progressDismiss();
            act.startActivity(C0811hp.m16311k(((idf0) ((jq2) fdf0Var).viewModel).act(), fdf0Var.data));
            act.finish();
            yij0.S(act);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m15312h0(fdf0 fdf0Var, User user) {
        PhoneNumber phoneNumber;
        PhoneNumber phoneNumber2;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        Boolean bool;
        SettingGroups settingGroup2;
        IntlMoreGender intlMoreGender2;
        user.getClass();
        SignUpData signUpData = fdf0Var.data;
        if (signUpData != null) {
            signUpData.name = user.name;
        }
        String str = null;
        if (signUpData != null) {
            Settings settings = user.settings;
            signUpData.birthdate = settings != null ? settings.birthdate : null;
        }
        Settings settings2 = user.settings;
        IntlGender intlGender = (settings2 == null || (settingGroup2 = settings2.getSettingGroup()) == null || (intlMoreGender2 = settingGroup2.gender) == null) ? null : intlMoreGender2.newGender;
        SignUpData signUpData2 = fdf0Var.data;
        int i = 0;
        if (signUpData2 != null) {
            Settings settings3 = user.settings;
            signUpData2.profileShowGender = (settings3 == null || (settingGroup = settings3.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null || (bool = intlMoreGender.showOnProfile) == null) ? false : bool.booleanValue();
        }
        SignUpData signUpData3 = fdf0Var.data;
        if (signUpData3 != null) {
            signUpData3.gender = user.gender;
        }
        if (signUpData3 != null) {
            signUpData3.newGender = intlGender;
        }
        if (signUpData3 != null) {
            Settings settings4 = user.settings;
            if (settings4 != null && (phoneNumber2 = settings4.phoneNumber) != null) {
                str = phoneNumber2.number;
            }
            signUpData3.phoneNumber = str;
        }
        if (signUpData3 != null) {
            Settings settings5 = user.settings;
            if (settings5 != null && (phoneNumber = settings5.phoneNumber) != null) {
                i = phoneNumber.countryCode;
            }
            signUpData3.countryCode = i;
        }
        String str2 = (String) AccountModule.f26c.m202R0().get();
        if (!TextUtils.isEmpty(str2)) {
            SignUpData signUpData4 = fdf0Var.data;
            if (signUpData4 != null) {
                signUpData4.profilePath = str2;
            }
            if (signUpData4 != null) {
                signUpData4.profileMineType = "image/jpeg";
            }
        }
        AccountModule.f26c.m232i2(fdf0Var.data);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m15313i0(Throwable th) {
        yij0.D(th);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m15314k0() {
        Act act;
        c cVarDuringCreated;
        this.data = new SignUpData();
        if (!eje.m14574h().m14583k() || (act = ((idf0) ((jq2) this).viewModel).act()) == null || (cVarDuringCreated = act.duringCreated(AccountModule.f26c.m213Y0())) == null) {
            return;
        }
        cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.adf0
            public final void call(Object obj) {
                fdf0.m15312h0(this.f8222a, (User) obj);
            }
        }, new e30() { // from class: l.bdf0
            public final void call(Object obj) {
                fdf0.m15313i0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m15315a0() {
        creates(new e30() { // from class: l.cdf0
            public final void call(Object obj) {
                fdf0.m15309e0(this.f9601a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m15316j0(@Nullable Bundle sis) {
        idf0 idf0Var;
        Act actM16625e;
        Intent intent;
        if (sis != null) {
            SignUpData serializable = sis.getSerializable("signup_data");
            this.data = serializable instanceof SignUpData ? serializable : null;
        }
        if (this.data == null && (idf0Var = (idf0) ((jq2) this).viewModel) != null && (actM16625e = idf0Var.getAct()) != null && (intent = actM16625e.getIntent()) != null) {
            Serializable serializableExtra = intent.getSerializableExtra("signup_data");
            this.data = serializableExtra instanceof SignUpData ? (SignUpData) serializableExtra : null;
        }
        if (this.data == null) {
            m15314k0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m15317l0(@NotNull List<String> selectList) {
        c cVarDuringCreated;
        selectList.getClass();
        SignUpData signUpData = this.data;
        if (signUpData == null) {
            Act act = act();
            if (act != null) {
                act.progressDismiss();
            }
            m15314k0();
            return;
        }
        if (signUpData != null) {
            signUpData.intlFriendPurpose = selectList;
            signUpData.signUpType = AccountTempApi.SignUpType.intlFriendPurposeSaved;
        }
        Act act2 = act();
        if (act2 == null || (cVarDuringCreated = act2.duringCreated(eje.m14576q(this.data, null))) == null) {
            return;
        }
        cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.ddf0
            public final void call(Object obj) {
                fdf0.m15311g0(this.f10297a, (roj0) obj);
            }
        }, new e30() { // from class: l.edf0
            public final void call(Object obj) {
                fdf0.m15310f0(this.f11087a, (Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
