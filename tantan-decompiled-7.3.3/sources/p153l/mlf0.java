package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.IntlMoreGender;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.User;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u001b\u0010\u0013\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m88121d2 = {"Ll/mlf0;", "Ll/ar2;", "Ll/plf0;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "k0", "()V", "a0", "Landroid/os/Bundle;", "sis", "j0", "(Landroid/os/Bundle;)V", "destroy", "", "", "selectList", "l0", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/SignUpData;", "a", "Lcom/p1/mobile/putong/data/SignUpData;", "data", "Companion", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mlf0 extends ar2<plf0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public SignUpData data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlf0(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m158867e0(mlf0 mlf0Var, Bundle bundle) {
        ((plf0) mlf0Var.viewModel).m172831r();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m158868f0(mlf0 mlf0Var, Throwable th) {
        Act act = mlf0Var.act();
        if (act != null) {
            act.progressDismiss();
        }
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m158869g0(mlf0 mlf0Var, uxj0 uxj0Var) {
        Act act = mlf0Var.act();
        if (act != null) {
            act.progressDismiss();
            act.startActivity(C16330cp.m111725k(((plf0) mlf0Var.viewModel).getAct(), mlf0Var.data));
            act.m68056e2();
            bsj0.m106261S(act);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m158870h0(mlf0 mlf0Var, User user) {
        PhoneNumber phoneNumber;
        PhoneNumber phoneNumber2;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        Boolean bool;
        SettingGroups settingGroup2;
        IntlMoreGender intlMoreGender2;
        user.getClass();
        SignUpData signUpData = mlf0Var.data;
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
        SignUpData signUpData2 = mlf0Var.data;
        int i = 0;
        if (signUpData2 != null) {
            Settings settings3 = user.settings;
            signUpData2.profileShowGender = (settings3 == null || (settingGroup = settings3.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null || (bool = intlMoreGender.showOnProfile) == null) ? false : bool.booleanValue();
        }
        SignUpData signUpData3 = mlf0Var.data;
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
        String str2 = AccountModule.f16756c.m29306R0().get();
        if (!TextUtils.isEmpty(str2)) {
            SignUpData signUpData4 = mlf0Var.data;
            if (signUpData4 != null) {
                signUpData4.profilePath = str2;
            }
            if (signUpData4 != null) {
                signUpData4.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            }
        }
        AccountModule.f16756c.m29336i2(mlf0Var.data);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m158871i0(Throwable th) {
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m158872k0() {
        Act act;
        C22421c c22421cDuringCreated;
        this.data = new SignUpData();
        if (!ike.m140276h().m140285k() || (act = ((plf0) this.viewModel).getAct()) == null || (c22421cDuringCreated = act.duringCreated(AccountModule.f16756c.m29317Y0())) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.hlf0
            @Override // p153l.y20
            public final void call(Object obj) {
                mlf0.m158870h0(this.f110500a, (User) obj);
            }
        }, new y20() { // from class: l.ilf0
            @Override // p153l.y20
            public final void call(Object obj) {
                mlf0.m158871i0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.jlf0
            @Override // p153l.y20
            public final void call(Object obj) {
                mlf0.m158867e0(this.f121551a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m158873j0(@Nullable Bundle sis) {
        plf0 plf0Var;
        Act actM172828e;
        Intent intent;
        if (sis != null) {
            Serializable serializable = sis.getSerializable("signup_data");
            this.data = serializable instanceof SignUpData ? (SignUpData) serializable : null;
        }
        if (this.data == null && (plf0Var = (plf0) this.viewModel) != null && (actM172828e = plf0Var.getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String()) != null && (intent = actM172828e.getIntent()) != null) {
            Serializable serializableExtra = intent.getSerializableExtra("signup_data");
            this.data = serializableExtra instanceof SignUpData ? (SignUpData) serializableExtra : null;
        }
        if (this.data == null) {
            m158872k0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m158874l0(@NotNull List<String> selectList) {
        C22421c c22421cDuringCreated;
        selectList.getClass();
        SignUpData signUpData = this.data;
        if (signUpData == null) {
            Act act = act();
            if (act != null) {
                act.progressDismiss();
            }
            m158872k0();
            return;
        }
        if (signUpData != null) {
            signUpData.intlFriendPurpose = selectList;
            signUpData.signUpType = AccountTempApi.SignUpType.intlFriendPurposeSaved;
        }
        Act act2 = act();
        if (act2 == null || (c22421cDuringCreated = act2.duringCreated(ike.m140278q(this.data, null))) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.klf0
            @Override // p153l.y20
            public final void call(Object obj) {
                mlf0.m158869g0(this.f127368a, (uxj0) obj);
            }
        }, new y20() { // from class: l.llf0
            @Override // p153l.y20
            public final void call(Object obj) {
                mlf0.m158868f0(this.f132545a, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
