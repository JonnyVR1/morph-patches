package p009l;

import android.content.DialogInterface;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p1.mobile.putong.core.CoreModule;
import l.hq80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kq80 extends AbstractC1065o4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m17593c(DialogInterface dialogInterface) {
        CoreModule.c.y2.X3();
        rxa0.m21889z(false);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(z5l.C1346a c1346a) {
        rxa0.m21889z(true);
        hq80 hq80Var = new hq80(c1346a.m25611a(), "");
        hq80Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jq80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kq80.m17593c(dialogInterface);
            }
        });
        hq80Var.show();
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        return CoreModule.c.y2.E3() && CoreModule.c.y2.q3() && (c1346a.f23487a.getParentFragment() instanceof psl) && c1346a.f23487a.getParentFragment().mo2537T() == NewTanFragTag.HOME && !rxa0.m21871h();
    }
}
