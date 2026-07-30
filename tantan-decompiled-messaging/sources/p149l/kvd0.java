package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;

/* JADX INFO: loaded from: classes9.dex */
public class kvd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m147362e(int i, int i2, Intent intent) {
        CoreModule.m29935P().m94651a().mo33500fl();
        return false;
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Act act = (Act) w2e0Var.m201094b();
        if (act == null) {
            return;
        }
        if (wn90.m204602F().f187269a == null) {
            ura.m195053e().m195057d().mo33944xc(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
        }
        Intent intentM51506X1 = ProfileInfoLoopEditAct.m51506X1(act, LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME, LoopInputType.BIRTHDAY, ura.m195053e().m195057d().mo33757Uc());
        intentM51506X1.putExtra("loop_edit_patch_flag", true);
        ((Act) xdl0.m208326D(act)).startActivityForResult(intentM51506X1, new C4317a.a() { // from class: l.jvd0
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return kvd0.m147362e(i, i2, intent);
            }
        });
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
