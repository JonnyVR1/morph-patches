package p153l;

import android.content.DialogInterface;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;

/* JADX INFO: loaded from: classes11.dex */
public class zei extends AbstractC18774n4 {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(p8l.C19323a c19323a) {
        v5b0.m199800z(true);
        CoreModule.f18264c.f20303E0.m141085a4();
        hei heiVar = new hei(c19323a.m171258a(), "");
        heiVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yei
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                v5b0.m199800z(false);
            }
        });
        heiVar.show();
        return Boolean.TRUE;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        return s7a.m184982k() && !joa.m146353C3() && (c19323a.f151040a.getParentFragment() instanceof cvl) && ((cvl) c19323a.f151040a.getParentFragment()).mo39558T() == NewTanFragTag.HOME && !CoreModule.f18264c.f20303E0.m141061C3() && !v5b0.m199782h() && CoreModule.f18264c.f20340Q1.f20859R.m35753D();
    }
}
