package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputMyLife;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputSignature;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputVerification;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.tencent.open.SocialOperation;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class jzd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m143892e(int i, int i2, Intent intent) {
        CoreModule.m29935P().m94651a().mo33500fl();
        return false;
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        String str = mapM201098f.get("entry");
        byte b = 2;
        LoopInputType loopInputType = null;
        ExpLoopInputType expLoopInputVerification = null;
        if (upa.m194847z()) {
            if (!TextUtils.isEmpty(str)) {
                str.getClass();
                switch (str.hashCode()) {
                    case -1484401125:
                        b = !str.equals("verification") ? (byte) -1 : (byte) 0;
                        break;
                    case -577741570:
                        b = !str.equals("picture") ? (byte) -1 : (byte) 1;
                        break;
                    case 1073584312:
                        if (!str.equals(SocialOperation.GAME_SIGNATURE)) {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        expLoopInputVerification = new ExpLoopInputVerification();
                        break;
                    case 1:
                        expLoopInputVerification = new ExpLoopInputMyLife();
                        break;
                    case 2:
                        expLoopInputVerification = new ExpLoopInputSignature();
                        break;
                }
                if (expLoopInputVerification != null) {
                    fif.m121506a(w2e0Var.m201094b(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT, expLoopInputVerification);
                    return;
                }
            }
        } else if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str.hashCode()) {
                case -1484401125:
                    b = !str.equals("verification") ? (byte) -1 : (byte) 0;
                    break;
                case -577741570:
                    b = !str.equals("picture") ? (byte) -1 : (byte) 1;
                    break;
                case 1073584312:
                    if (!str.equals(SocialOperation.GAME_SIGNATURE)) {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    loopInputType = LoopInputType.VERIFICATION;
                    break;
                case 1:
                    loopInputType = LoopInputType.MY_LIFE_SEE_MYSELF;
                    break;
                case 2:
                    loopInputType = LoopInputType.SIGNATURE;
                    break;
            }
            String str2 = mapM201098f.get("from");
            if (loopInputType != null) {
                if (wn90.m204602F().f187269a == null) {
                    ura.m195053e().m195057d().mo33944xc(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
                }
                Intent intentM51506X1 = ProfileInfoLoopEditAct.m51506X1(w2e0Var.m201094b(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT, loopInputType, wn90.m204602F().f187269a);
                intentM51506X1.putExtra("loop_create_from_page", str2);
                intentM51506X1.putExtra("loop_edit_patch_flag", true);
                ((Act) xdl0.m208326D(w2e0Var.m201094b())).startActivityForResult(intentM51506X1, new C4317a.a() { // from class: l.izd0
                    @Override // com.p046p1.mobile.android.app.C4317a.a
                    /* JADX INFO: renamed from: a */
                    public final boolean mo20401a(int i, int i2, Intent intent) {
                        return jzd0.m143892e(i, i2, intent);
                    }
                });
                return;
            }
        }
        super.mo94421a(w2e0Var, f30Var);
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
