package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.view.LiveSettingNewBaseView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class sb2 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public LiveSettingNewBaseView f163494i;

    /* JADX INFO: renamed from: j */
    public DialogC12611a f163495j;

    /* JADX INFO: renamed from: k */
    public List<i80<View>> f163496k;

    public sb2(bsm bsmVar) {
        super(bsmVar);
        this.f163496k = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m183179Z3(soj0 soj0Var) {
        m183184W3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m183180a4(soj0 soj0Var) {
        m183192g4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().BottomEvent.dismissSettingDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.lb2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127264a.m183179Z3((soj0) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.openSettingDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mb2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132983a.m183180a4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.refreshSettingButtonRedDot().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.nb2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137999a.m183187b4((soj0) obj);
            }
        }));
        m129301d3(wjj.class, new w9j() { // from class: l.ob2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f142881a.m183188c4((wjj) obj);
            }
        });
        duringCreated(m206028F2().BottomEvent.addModelToSettingAdapter().m172460g()).filter(new w9j() { // from class: l.pb2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((i80) obj) != null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.qb2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153614a.m183181T3((i80) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.removeModelToSettingAdapter().m172460g()).filter(new w9j() { // from class: l.rb2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((i80) obj) != null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ib2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112345a.m183193h4((i80) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m183181T3(i80 i80Var) {
        if (this.f163496k.contains(i80Var) || !m183182U3(i80Var)) {
            return;
        }
        this.f163496k.add(i80Var);
        if (m183186Y3() != null) {
            m183186Y3().setModels(this.f163496k);
        }
        if (TextUtils.equals((CharSequence) m129297F3(new de3(800)), "layered") && ((Boolean) m129297F3(new yme0(800))).booleanValue()) {
            return;
        }
        m183183V3();
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m183182U3(i80 i80Var) {
        if (i80Var == null || TextUtils.isEmpty(i80Var.m111416Y3())) {
            return false;
        }
        Iterator<i80<View>> it = this.f163496k.iterator();
        while (it.hasNext()) {
            if (i80Var.m111416Y3().equals(it.next().m111416Y3())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: V3 */
    public void m183183V3() {
        m206028F2().BottomEvent.setSettingButtonRedDot().mo172463j(Boolean.valueOf(m183195l1()));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m183184W3(boolean z) {
        DialogC12611a dialogC12611a = this.f163495j;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f163494i.m76585k0();
        DialogC12611a dialogC12611a2 = this.f163495j;
        if (z) {
            dialogC12611a2.m71758P(null);
        } else {
            dialogC12611a2.dismiss();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final DialogC12611a m183185X3() {
        if (this.f163495j == null) {
            byr byrVar = new byr(this, t6c0.f168550v5);
            this.f163495j = byrVar;
            byrVar.m71776h0(new e30() { // from class: l.hb2
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f106877a.m183189d4((View) obj);
                }
            });
            this.f163495j.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.jb2
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f117154a.m183190e4(dialogInterface);
                }
            });
            this.f163495j.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kb2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f122182a.m183191f4(dialogInterface);
                }
            });
        }
        return this.f163495j;
    }

    /* JADX INFO: renamed from: Y3 */
    public final LiveSettingNewBaseView m183186Y3() {
        LiveSettingNewBaseView liveSettingNewBaseView = this.f163494i;
        if (liveSettingNewBaseView == null) {
            return null;
        }
        return liveSettingNewBaseView;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m183187b4(soj0 soj0Var) {
        if (TextUtils.equals((CharSequence) m129297F3(new de3(800)), "layered") && ((Boolean) m129297F3(new yme0(800))).booleanValue()) {
            return;
        }
        m183183V3();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ LiveSettingNewBaseView m183188c4(wjj wjjVar) {
        return this.f163494i;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m183189d4(View view) {
        this.f163494i = (LiveSettingNewBaseView) view;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m183190e4(DialogInterface dialogInterface) {
        m183194i4();
        this.f163494i.m76586l0();
        m206028F2().BottomEvent.onSettingDialogShow().m172467p();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m183191f4(DialogInterface dialogInterface) {
        this.f163494i.m76585k0();
        m206028F2().BottomEvent.onSettingDialogDismiss().m172467p();
    }

    /* JADX INFO: renamed from: g4 */
    public void m183192g4() {
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("settingButtonBubble");
        m183185X3().show();
    }

    /* JADX INFO: renamed from: h4 */
    public void m183193h4(i80 i80Var) {
        if (this.f163496k.isEmpty() || !this.f163496k.contains(i80Var)) {
            return;
        }
        this.f163496k.remove(i80Var);
        if (m183186Y3() != null) {
            m183186Y3().setModels(this.f163496k);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m183194i4() {
        if (vwb.m200296J(this.f163496k) || m183186Y3() == null) {
            return;
        }
        m183186Y3().setModels(this.f163496k);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m183195l1() {
        int i = 0;
        for (int i2 = 0; i2 < this.f163496k.size(); i2++) {
            i80<View> i80Var = this.f163496k.get(i2);
            boolean zMo111422f4 = i80Var.mo111422f4();
            boolean zM134932k4 = i80Var.m134932k4();
            if (zMo111422f4 || zM134932k4) {
                i++;
            }
        }
        return i > 0;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        this.f163496k.clear();
        super.mo69117n();
        m183184W3(false);
        if (m183186Y3() != null) {
            m183186Y3().m76584j0();
        }
    }
}
