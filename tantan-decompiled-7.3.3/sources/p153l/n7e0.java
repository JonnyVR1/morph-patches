package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputMyLife;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputSignature;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputVerification;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.tencent.open.SocialOperation;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class n7e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m161863e(int i, int i2, Intent intent) {
        CoreModule.m30933P().m143405a().mo34503fl();
        return false;
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        String str = mapM96743f.get("entry");
        byte b = 2;
        LoopInputType loopInputType = null;
        ExpLoopInputType expLoopInputVerification = null;
        if (gra.m131778z()) {
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
                    ljf.m154504a(abe0Var.m96739b(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT, expLoopInputVerification);
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
            String str2 = mapM96743f.get("from");
            if (loopInputType != null) {
                if (aw90.m100562F().f73701a == null) {
                    gta.m132210e().m132214d().mo34947xc(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
                }
                Intent intentM52689Y1 = ProfileInfoLoopEditAct.m52689Y1(abe0Var.m96739b(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT, loopInputType, aw90.m100562F().f73701a);
                intentM52689Y1.putExtra("loop_create_from_page", str2);
                intentM52689Y1.putExtra("loop_edit_patch_flag", true);
                ((Act) bnl0.m105506D(abe0Var.m96739b())).startActivityForResult(intentM52689Y1, new C4468a.a() { // from class: l.m7e0
                    @Override // com.p051p1.mobile.android.app.C4468a.a
                    /* JADX INFO: renamed from: a */
                    public final boolean mo21400a(int i, int i2, Intent intent) {
                        return n7e0.m161863e(i, i2, intent);
                    }
                });
                return;
            }
        }
        super.mo95798a(abe0Var, z20Var);
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
