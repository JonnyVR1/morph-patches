package p149l;

import android.content.DialogInterface;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class s6s {

    /* JADX INFO: renamed from: a */
    public final bsm f162848a;

    /* JADX INFO: renamed from: b */
    public boolean f162849b = false;

    /* JADX INFO: renamed from: c */
    public boolean f162850c = false;

    /* JADX INFO: renamed from: d */
    public ArrayList<vtl> f162851d = new ArrayList<>();

    public s6s(bsm bsmVar) {
        this.f162848a = bsmVar;
    }

    /* JADX INFO: renamed from: f */
    public boolean m182463f(final LiveDialogEnum liveDialogEnum) {
        return ((vtl) vwb.m200346r(this.f162851d, new w9j() { // from class: l.n6s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((vtl) obj).getType() == liveDialogEnum);
            }
        })) != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m182464g() {
        return this.f162850c;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m182465h(vtl vtlVar, DialogInterface dialogInterface) {
        this.f162848a.f77106l.DialogCenterEvent.changeVisibility().mo172464m(new tzd().m191190c(true).m191189b(vtlVar.getType()).m191188a(vtlVar.mo71782b()));
        this.f162851d.add(vtlVar);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m182466i(vtl vtlVar, DialogInterface dialogInterface) {
        this.f162848a.f77106l.DialogCenterEvent.changeVisibility().mo172464m(new tzd().m191190c(false).m191189b(vtlVar.getType()).m191188a(vtlVar.mo71782b()));
        this.f162851d.remove(vtlVar);
    }

    /* JADX INFO: renamed from: j */
    public void m182467j(final vtl vtlVar) {
        vtlVar.mo71783c(new DialogInterface.OnShowListener() { // from class: l.q6s
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f152954a.m182465h(vtlVar, dialogInterface);
            }
        });
        vtlVar.mo71781a(new DialogInterface.OnDismissListener() { // from class: l.r6s
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f157977a.m182466i(vtlVar, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m182468k(boolean z) {
        this.f162850c = z;
    }

    /* JADX INFO: renamed from: l */
    public boolean m182469l(final LiveDialogEnum... liveDialogEnumArr) {
        return (this.f162851d.size() == 0 || vwb.m200346r(this.f162851d, new w9j() { // from class: l.o6s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(Arrays.asList(liveDialogEnumArr).contains(((vtl) obj).getType()));
            }
        }) == null) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m182470m(final LiveDialogEnum liveDialogEnum) {
        vtl vtlVar = (vtl) vwb.m200346r(this.f162851d, new w9j() { // from class: l.p6s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((vtl) obj).getType() == liveDialogEnum);
            }
        });
        if (vtlVar == null) {
            return false;
        }
        vtlVar.dismiss();
        return true;
    }
}
