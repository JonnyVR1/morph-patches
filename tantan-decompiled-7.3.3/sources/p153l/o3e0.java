package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;

/* JADX INFO: loaded from: classes9.dex */
public class o3e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m165850e(int i, int i2, Intent intent) {
        CoreModule.m30933P().m143405a().mo34503fl();
        return false;
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        Act act = (Act) abe0Var.m96739b();
        if (act == null) {
            return;
        }
        if (aw90.m100562F().f73701a == null) {
            gta.m132210e().m132214d().mo34947xc(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
        }
        Intent intentM52689Y1 = ProfileInfoLoopEditAct.m52689Y1(act, LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME, LoopInputType.BIRTHDAY, gta.m132210e().m132214d().mo34760Uc());
        intentM52689Y1.putExtra("loop_edit_patch_flag", true);
        ((Act) bnl0.m105506D(act)).startActivityForResult(intentM52689Y1, new C4468a.a() { // from class: l.n3e0
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return o3e0.m165850e(i, i2, intent);
            }
        });
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
