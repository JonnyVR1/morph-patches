package p002l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p1.mobile.putong.live.livingroom.view.LiveSettingNewBaseView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.ffw;
import l.soj0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sb2 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public LiveSettingNewBaseView f18903i;

    /* JADX INFO: renamed from: j */
    public C0200a f18904j;

    /* JADX INFO: renamed from: k */
    public List<i80<View>> f18905k;

    public sb2(bsm bsmVar) {
        super(bsmVar);
        this.f18905k = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m22333Z3(soj0 soj0Var) {
        m22339W3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m22334a4(soj0 soj0Var) {
        m22347g4();
    }

    /* JADX INFO: renamed from: T */
    public void m22335T() {
        super.T();
        duringCreated((c) m25548F2().BottomEvent.dismissSettingDialog().g()).subscribe(ffw.d(new e30() { // from class: l.lb2
            public final void call(Object obj) {
                this.f14750a.m22333Z3((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().BottomEvent.openSettingDialog().g()).subscribe(ffw.d(new e30() { // from class: l.mb2
            public final void call(Object obj) {
                this.f15307a.m22334a4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().BottomEvent.refreshSettingButtonRedDot().g()).subscribe(ffw.d(new e30() { // from class: l.nb2
            public final void call(Object obj) {
                this.f15908a.m22342b4((soj0) obj);
            }
        }));
        m14188d3(wjj.class, new w9j() { // from class: l.ob2
            public final Object call(Object obj) {
                return this.f16477a.m22343c4((wjj) obj);
            }
        });
        duringCreated((c) m25548F2().BottomEvent.addModelToSettingAdapter().g()).filter(new w9j() { // from class: l.pb2
            public final Object call(Object obj) {
                return Boolean.valueOf(((i80) obj) != null);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.qb2
            public final void call(Object obj) {
                this.f17884a.m22336T3((i80) obj);
            }
        }));
        duringCreated((c) m25548F2().BottomEvent.removeModelToSettingAdapter().g()).filter(new w9j() { // from class: l.rb2
            public final Object call(Object obj) {
                return Boolean.valueOf(((i80) obj) != null);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.ib2
            public final void call(Object obj) {
                this.f13127a.m22348h4((i80) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m22336T3(i80 i80Var) {
        if (this.f18905k.contains(i80Var) || !m22337U3(i80Var)) {
            return;
        }
        this.f18905k.add(i80Var);
        if (m22341Y3() != null) {
            m22341Y3().setModels(this.f18905k);
        }
        if (TextUtils.equals((CharSequence) m14184F3(new de3(800)), "layered") && ((Boolean) m14184F3(new yme0(800))).booleanValue()) {
            return;
        }
        m22338V3();
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m22337U3(i80 i80Var) {
        if (i80Var == null || TextUtils.isEmpty(i80Var.m11808Y3())) {
            return false;
        }
        Iterator<i80<View>> it = this.f18905k.iterator();
        while (it.hasNext()) {
            if (i80Var.m11808Y3().equals(it.next().m11808Y3())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: V3 */
    public void m22338V3() {
        m25548F2().BottomEvent.setSettingButtonRedDot().j(Boolean.valueOf(m22350l1()));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m22339W3(boolean z) {
        a aVar = this.f18904j;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f18903i.k0();
        C0200a c0200a = this.f18904j;
        if (z) {
            c0200a.m5126P(null);
        } else {
            c0200a.dismiss();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final C0200a m22340X3() {
        if (this.f18904j == null) {
            byr byrVar = new byr(this, t6c0.f20046v5);
            this.f18904j = byrVar;
            byrVar.m5144h0(new e30() { // from class: l.hb2
                public final void call(Object obj) {
                    this.f11956a.m22344d4((View) obj);
                }
            });
            this.f18904j.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.jb2
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f13663a.m22345e4(dialogInterface);
                }
            });
            this.f18904j.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kb2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f14266a.m22346f4(dialogInterface);
                }
            });
        }
        return this.f18904j;
    }

    /* JADX INFO: renamed from: Y3 */
    public final LiveSettingNewBaseView m22341Y3() {
        LiveSettingNewBaseView liveSettingNewBaseView = this.f18903i;
        if (liveSettingNewBaseView == null) {
            return null;
        }
        return liveSettingNewBaseView;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m22342b4(soj0 soj0Var) {
        if (TextUtils.equals((CharSequence) m14184F3(new de3(800)), "layered") && ((Boolean) m14184F3(new yme0(800))).booleanValue()) {
            return;
        }
        m22338V3();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ LiveSettingNewBaseView m22343c4(wjj wjjVar) {
        return this.f18903i;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m22344d4(View view) {
        this.f18903i = (LiveSettingNewBaseView) view;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m22345e4(DialogInterface dialogInterface) {
        m22349i4();
        this.f18903i.l0();
        m25548F2().BottomEvent.onSettingDialogShow().p();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m22346f4(DialogInterface dialogInterface) {
        this.f18903i.k0();
        m25548F2().BottomEvent.onSettingDialogDismiss().p();
    }

    /* JADX INFO: renamed from: g4 */
    public void m22347g4() {
        m25548F2().BootBubbleEvent.dismissBubble().j("settingButtonBubble");
        m22340X3().show();
    }

    /* JADX INFO: renamed from: h4 */
    public void m22348h4(i80 i80Var) {
        if (this.f18905k.isEmpty() || !this.f18905k.contains(i80Var)) {
            return;
        }
        this.f18905k.remove(i80Var);
        if (m22341Y3() != null) {
            m22341Y3().setModels(this.f18905k);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m22349i4() {
        if (vwb.J(this.f18905k) || m22341Y3() == null) {
            return;
        }
        m22341Y3().setModels(this.f18905k);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m22350l1() {
        int i = 0;
        for (int i2 = 0; i2 < this.f18905k.size(); i2++) {
            i80<View> i80Var = this.f18905k.get(i2);
            boolean zMo11814f4 = i80Var.mo11814f4();
            boolean zM15042k4 = i80Var.m15042k4();
            if (zMo11814f4 || zM15042k4) {
                i++;
            }
        }
        return i > 0;
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        this.f18905k.clear();
        super.mo5949n();
        m22339W3(false);
        if (m22341Y3() != null) {
            m22341Y3().j0();
        }
    }
}
