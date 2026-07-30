package p009l;

import android.content.DialogInterface;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p1.mobile.putong.core.CoreModule;
import l.g6a;
import l.peq0;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class seq0 extends AbstractC1065o4 {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(z5l.C1346a c1346a) {
        rxa0.m21889z(true);
        CoreModule.c.g2.n3();
        peq0 peq0Var = new peq0(c1346a.m25611a(), "");
        peq0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.req0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                rxa0.m21889z(false);
            }
        });
        peq0Var.show();
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        return g6a.z() && !xma.O3() && (c1346a.f23487a.getParentFragment() instanceof psl) && c1346a.f23487a.getParentFragment().mo2537T() == NewTanFragTag.HOME && !CoreModule.c.g2.i3() && !rxa0.m21871h();
    }
}
