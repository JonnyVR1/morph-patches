package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.ui.profile.exploop.item.ExpLoopInputMyLife;
import com.p1.mobile.putong.core.ui.profile.exploop.item.ExpLoopInputSignature;
import com.p1.mobile.putong.core.ui.profile.exploop.item.ExpLoopInputVerification;
import com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.profile.loop.ProfileInfoLoopEditAct;
import java.util.Map;
import l.f30;
import l.fif;
import l.wn90;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jzd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m17874e(int i, int i2, Intent intent) {
        CoreModule.m1854P().m11706a().m5437fl();
        return false;
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        String str = mapM26160f.get("entry");
        byte b = 2;
        ExpLoopInputSignature expLoopInputVerification = null;
        if (upa.m25545z()) {
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
                        if (!str.equals("signature")) {
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
                    fif.a(w2e0Var.m26156b(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT, expLoopInputVerification);
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
                    if (!str.equals("signature")) {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    expLoopInputVerification = LoopInputType.VERIFICATION;
                    break;
                case 1:
                    expLoopInputVerification = LoopInputType.MY_LIFE_SEE_MYSELF;
                    break;
                case 2:
                    expLoopInputVerification = LoopInputType.SIGNATURE;
                    break;
            }
            String str2 = mapM26160f.get("from");
            if (expLoopInputVerification != null) {
                if (wn90.F().a == null) {
                    ura.m25555e().m25559d().m5881xc(CoreModule.f1534c.f3628e0.m21483na().clone());
                }
                Intent intentX1 = ProfileInfoLoopEditAct.X1(w2e0Var.m26156b(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT, expLoopInputVerification, wn90.F().a);
                intentX1.putExtra("loop_create_from_page", str2);
                intentX1.putExtra("loop_edit_patch_flag", true);
                xdl0.D(w2e0Var.m26156b()).startActivityForResult(intentX1, new a.a() { // from class: l.izd0
                    /* JADX INFO: renamed from: a */
                    public final boolean m17155a(int i, int i2, Intent intent) {
                        return jzd0.m17874e(i, i2, intent);
                    }
                });
                return;
            }
        }
        super.mo11681a(w2e0Var, f30Var);
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
