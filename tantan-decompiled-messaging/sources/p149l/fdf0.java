package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.IntlMoreGender;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.User;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u001b\u0010\u0013\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m87232d2 = {"Ll/fdf0;", "Ll/jq2;", "Ll/idf0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "k0", "()V", "a0", "Landroid/os/Bundle;", "sis", "j0", "(Landroid/os/Bundle;)V", "destroy", "", "", "selectList", "l0", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/SignUpData;", "a", "Lcom/p1/mobile/putong/data/SignUpData;", "data", "Companion", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m120966e0(fdf0 fdf0Var, Bundle bundle) {
        ((idf0) fdf0Var.viewModel).m135444r();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m120967f0(fdf0 fdf0Var, Throwable th) {
        Act act = fdf0Var.act();
        if (act != null) {
            act.progressDismiss();
        }
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m120968g0(fdf0 fdf0Var, roj0 roj0Var) {
        Act act = fdf0Var.act();
        if (act != null) {
            act.progressDismiss();
            act.startActivity(C17367hp.m132327k(((idf0) fdf0Var.viewModel).getAct(), fdf0Var.data));
            act.m66873d2();
            yij0.m214941S(act);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m120969h0(fdf0 fdf0Var, User user) {
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
        String str2 = AccountModule.f16037c.m28307R0().get();
        if (!TextUtils.isEmpty(str2)) {
            SignUpData signUpData4 = fdf0Var.data;
            if (signUpData4 != null) {
                signUpData4.profilePath = str2;
            }
            if (signUpData4 != null) {
                signUpData4.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            }
        }
        AccountModule.f16037c.m28337i2(fdf0Var.data);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m120970i0(Throwable th) {
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m120971k0() {
        Act act;
        C22306c c22306cDuringCreated;
        this.data = new SignUpData();
        if (!eje.m116824h().m116833k() || (act = ((idf0) this.viewModel).getAct()) == null || (c22306cDuringCreated = act.duringCreated(AccountModule.f16037c.m28318Y0())) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.adf0
            @Override // p149l.e30
            public final void call(Object obj) {
                fdf0.m120969h0(this.f68932a, (User) obj);
            }
        }, new e30() { // from class: l.bdf0
            @Override // p149l.e30
            public final void call(Object obj) {
                fdf0.m120970i0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.cdf0
            @Override // p149l.e30
            public final void call(Object obj) {
                fdf0.m120966e0(this.f80367a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m120972j0(@Nullable Bundle sis) {
        idf0 idf0Var;
        Act actM135441e;
        Intent intent;
        if (sis != null) {
            Serializable serializable = sis.getSerializable("signup_data");
            this.data = serializable instanceof SignUpData ? (SignUpData) serializable : null;
        }
        if (this.data == null && (idf0Var = (idf0) this.viewModel) != null && (actM135441e = idf0Var.getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String()) != null && (intent = actM135441e.getIntent()) != null) {
            Serializable serializableExtra = intent.getSerializableExtra("signup_data");
            this.data = serializableExtra instanceof SignUpData ? (SignUpData) serializableExtra : null;
        }
        if (this.data == null) {
            m120971k0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m120973l0(@NotNull List<String> selectList) {
        C22306c c22306cDuringCreated;
        selectList.getClass();
        SignUpData signUpData = this.data;
        if (signUpData == null) {
            Act act = act();
            if (act != null) {
                act.progressDismiss();
            }
            m120971k0();
            return;
        }
        if (signUpData != null) {
            signUpData.intlFriendPurpose = selectList;
            signUpData.signUpType = AccountTempApi.SignUpType.intlFriendPurposeSaved;
        }
        Act act2 = act();
        if (act2 == null || (c22306cDuringCreated = act2.duringCreated(eje.m116826q(this.data, null))) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.ddf0
            @Override // p149l.e30
            public final void call(Object obj) {
                fdf0.m120968g0(this.f85592a, (roj0) obj);
            }
        }, new e30() { // from class: l.edf0
            @Override // p149l.e30
            public final void call(Object obj) {
                fdf0.m120967f0(this.f90604a, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
