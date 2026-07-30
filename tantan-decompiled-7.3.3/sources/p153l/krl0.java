package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationItemView;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class krl0 extends AbstractC15610a<MessageLocation> implements VipLocationItemView.InterfaceC9109a {

    /* JADX INFO: renamed from: d */
    public psl0 f128484d;

    /* JADX INFO: renamed from: e */
    public gsl0 f128485e;

    /* JADX INFO: renamed from: c */
    public ArrayList<MessageLocation> f128483c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public y20<MessageLocation> f128486f = new y20() { // from class: l.hrl0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f111362a.m151099z((MessageLocation) obj);
        }
    };

    public krl0(psl0 psl0Var, gsl0 gsl0Var) {
        this.f128484d = psl0Var;
        this.f128485e = gsl0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m151095A(MessageLocation messageLocation, VipLocationItemView vipLocationItemView, z80 z80Var) {
        if (gsl0.m132072E0(messageLocation.coordinates, new DoublePair(z80Var.m218937d(), z80Var.m218938e()))) {
            messageLocation.name = z80Var.mo143670b();
            String strMo143669a = z80Var.mo143669a();
            messageLocation.address = strMo143669a;
            if (!TextUtils.isEmpty(strMo143669a)) {
                vipLocationItemView.f37915c.setText(messageLocation.address);
            }
            this.f128485e.m132110a1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m151099z(MessageLocation messageLocation) {
        sfj0.m185596c("e_my_roam_location", this.f128484d.getAct().pageId(), new sfj0.C20032a[0]);
        if (psl0.m173668n("p_settings_location,manyou", this.f128484d.getAct(), this.f128485e.m132105G0())) {
            gsl0.m132070C0(this.f128484d.getAct(), messageLocation, null);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m151100B(ArrayList<MessageLocation> arrayList) {
        this.f128483c = arrayList;
        notifyDataSetChanged();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.VipLocationItemView.InterfaceC9109a
    /* JADX INFO: renamed from: a */
    public void mo57465a(final MessageLocation messageLocation, final VipLocationItemView vipLocationItemView) {
        fmj fmjVar = this.f128485e.f106305b;
        Act act = this.f128484d.getAct();
        DoublePair doublePair = messageLocation.coordinates;
        fmjVar.m126239e(act, doublePair.first, doublePair.second, new y20() { // from class: l.irl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116582a.m151095A(messageLocation, vipLocationItemView, (z80) obj);
            }
        }, new y20() { // from class: l.jrl0
            @Override // p153l.y20
            public final void call(Object obj) {
                App.f16087d.m21432k((Throwable) obj);
            }
        });
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return p9r.m171370a(this.f128484d.getContext()).inflate(kec0.f125382Df, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<MessageLocation> mo21403p() {
        return this.f128483c;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, MessageLocation messageLocation, int i, int i2) {
        ((VipLocationItemView) view).m57464e(messageLocation, this.f128486f, this.f128484d.f153944o, this, gsl0.m132072E0(messageLocation.coordinates, this.f128485e.m132107I0()));
    }
}
