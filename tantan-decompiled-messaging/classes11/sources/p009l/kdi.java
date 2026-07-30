package p009l;

import android.content.DialogInterface;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p1.mobile.putong.core.CoreModule;
import l.g6a;
import l.sci;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kdi extends AbstractC1065o4 {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(z5l.C1346a c1346a) {
        rxa0.m21889z(true);
        CoreModule.c.E0.a4();
        sci sciVar = new sci(c1346a.m25611a(), "");
        sciVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jdi
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                rxa0.m21889z(false);
            }
        });
        sciVar.show();
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        return g6a.k() && !xma.B3() && (c1346a.f23487a.getParentFragment() instanceof psl) && c1346a.f23487a.getParentFragment().mo2537T() == NewTanFragTag.HOME && !CoreModule.c.E0.C3() && !rxa0.m21871h() && CoreModule.c.Q1.R.D();
    }
}
