package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.profile.loop.ProfileInfoLoopEditAct;
import l.f30;
import l.wn90;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class kvd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m18272e(int i, int i2, Intent intent) {
        CoreModule.m1854P().m11706a().m5437fl();
        return false;
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Act actM26156b = w2e0Var.m26156b();
        if (actM26156b == null) {
            return;
        }
        if (wn90.F().a == null) {
            ura.m25555e().m25559d().m5881xc(CoreModule.f1534c.f3628e0.m21483na().clone());
        }
        Intent intentX1 = ProfileInfoLoopEditAct.X1(actM26156b, LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME, LoopInputType.BIRTHDAY, ura.m25555e().m25559d().m5694Uc());
        intentX1.putExtra("loop_edit_patch_flag", true);
        xdl0.D(actM26156b).startActivityForResult(intentX1, new a.a() { // from class: l.jvd0
            /* JADX INFO: renamed from: a */
            public final boolean m17841a(int i, int i2, Intent intent) {
                return kvd0.m18272e(i, i2, intent);
            }
        });
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
