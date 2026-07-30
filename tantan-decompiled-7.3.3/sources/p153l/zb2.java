package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.view.LiveSettingNewBaseView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zb2 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public LiveSettingNewBaseView f203616i;

    /* JADX INFO: renamed from: j */
    public DialogC12774a f203617j;

    /* JADX INFO: renamed from: k */
    public List<e80<View>> f203618k;

    public zb2(dum dumVar) {
        super(dumVar);
        this.f203618k = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m219169Z3(vxj0 vxj0Var) {
        m219174W3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m219170a4(vxj0 vxj0Var) {
        m219182g4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().BottomEvent.dismissSettingDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.sb2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167102a.m219169Z3((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.openSettingDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.tb2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172827a.m219170a4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.refreshSettingButtonRedDot().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ub2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178256a.m219177b4((vxj0) obj);
            }
        }));
        m138860d3(pmj.class, new qcj() { // from class: l.vb2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183183a.m219178c4((pmj) obj);
            }
        });
        duringCreated(m213811F2().BottomEvent.addModelToSettingAdapter().m199270g()).filter(new qcj() { // from class: l.wb2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((e80) obj) != null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.xb2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193120a.m219171T3((e80) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.removeModelToSettingAdapter().m199270g()).filter(new qcj() { // from class: l.yb2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((e80) obj) != null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.pb2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151343a.m219183h4((e80) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m219171T3(e80 e80Var) {
        if (this.f203618k.contains(e80Var) || !m219172U3(e80Var)) {
            return;
        }
        this.f203618k.add(e80Var);
        if (m219176Y3() != null) {
            m219176Y3().setModels(this.f203618k);
        }
        if (TextUtils.equals((CharSequence) m138856F3(new se3(800)), "layered") && ((Boolean) m138856F3(new fve0(800))).booleanValue()) {
            return;
        }
        m219173V3();
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m219172U3(e80 e80Var) {
        if (e80Var == null || TextUtils.isEmpty(e80Var.m149345Y3())) {
            return false;
        }
        Iterator<e80<View>> it = this.f203618k.iterator();
        while (it.hasNext()) {
            if (e80Var.m149345Y3().equals(it.next().m149345Y3())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: V3 */
    public void m219173V3() {
        m213811F2().BottomEvent.setSettingButtonRedDot().mo199273j(Boolean.valueOf(m219185l1()));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m219174W3(boolean z) {
        DialogC12774a dialogC12774a = this.f203617j;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f203616i.m77768k0();
        DialogC12774a dialogC12774a2 = this.f203617j;
        if (z) {
            dialogC12774a2.m72941P(null);
        } else {
            dialogC12774a2.dismiss();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final DialogC12774a m219175X3() {
        if (this.f203617j == null) {
            c0s c0sVar = new c0s(this, yec0.f199282v5);
            this.f203617j = c0sVar;
            c0sVar.m72959h0(new y20() { // from class: l.ob2
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145822a.m219179d4((View) obj);
                }
            });
            this.f203617j.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.qb2
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f156450a.m219180e4(dialogInterface);
                }
            });
            this.f203617j.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rb2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f161976a.m219181f4(dialogInterface);
                }
            });
        }
        return this.f203617j;
    }

    /* JADX INFO: renamed from: Y3 */
    public final LiveSettingNewBaseView m219176Y3() {
        LiveSettingNewBaseView liveSettingNewBaseView = this.f203616i;
        if (liveSettingNewBaseView == null) {
            return null;
        }
        return liveSettingNewBaseView;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m219177b4(vxj0 vxj0Var) {
        if (TextUtils.equals((CharSequence) m138856F3(new se3(800)), "layered") && ((Boolean) m138856F3(new fve0(800))).booleanValue()) {
            return;
        }
        m219173V3();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ LiveSettingNewBaseView m219178c4(pmj pmjVar) {
        return this.f203616i;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m219179d4(View view) {
        this.f203616i = (LiveSettingNewBaseView) view;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m219180e4(DialogInterface dialogInterface) {
        m219184i4();
        this.f203616i.m77769l0();
        m213811F2().BottomEvent.onSettingDialogShow().m199277p();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m219181f4(DialogInterface dialogInterface) {
        this.f203616i.m77768k0();
        m213811F2().BottomEvent.onSettingDialogDismiss().m199277p();
    }

    /* JADX INFO: renamed from: g4 */
    public void m219182g4() {
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("settingButtonBubble");
        m219175X3().show();
    }

    /* JADX INFO: renamed from: h4 */
    public void m219183h4(e80 e80Var) {
        if (this.f203618k.isEmpty() || !this.f203618k.contains(e80Var)) {
            return;
        }
        this.f203618k.remove(e80Var);
        if (m219176Y3() != null) {
            m219176Y3().setModels(this.f203618k);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m219184i4() {
        if (jyb.m147479J(this.f203618k) || m219176Y3() == null) {
            return;
        }
        m219176Y3().setModels(this.f203618k);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m219185l1() {
        int i = 0;
        for (int i2 = 0; i2 < this.f203618k.size(); i2++) {
            e80<View> e80Var = this.f203618k.get(i2);
            boolean zMo149349f4 = e80Var.mo149349f4();
            boolean zM119796k4 = e80Var.m119796k4();
            if (zMo149349f4 || zM119796k4) {
                i++;
            }
        }
        return i > 0;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        this.f203618k.clear();
        super.mo70300n();
        m219174W3(false);
        if (m219176Y3() != null) {
            m219176Y3().m77767j0();
        }
    }
}
