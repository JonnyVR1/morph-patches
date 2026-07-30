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
public class sul0 extends AbstractC15610a<MessageLocation> implements VipLocationItemView.InterfaceC9109a {

    /* JADX INFO: renamed from: d */
    public yvl0 f170696d;

    /* JADX INFO: renamed from: e */
    public qvl0 f170697e;

    /* JADX INFO: renamed from: c */
    public ArrayList<MessageLocation> f170695c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public y20<MessageLocation> f170698f = new y20() { // from class: l.pul0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f154197a.m188041z((MessageLocation) obj);
        }
    };

    public sul0(yvl0 yvl0Var, qvl0 qvl0Var) {
        this.f170696d = yvl0Var;
        this.f170697e = qvl0Var;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m188038A(MessageLocation messageLocation, VipLocationItemView vipLocationItemView, z80 z80Var) {
        if (tul0.m192753a(messageLocation.coordinates, new DoublePair(z80Var.m218937d(), z80Var.m218938e()))) {
            messageLocation.name = z80Var.mo143670b();
            String strMo143669a = z80Var.mo143669a();
            messageLocation.address = strMo143669a;
            if (!TextUtils.isEmpty(strMo143669a)) {
                vipLocationItemView.f37915c.setText(messageLocation.address);
            }
            this.f170697e.m178362b1(true);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m188039B(ArrayList<MessageLocation> arrayList) {
        this.f170695c = arrayList;
        notifyDataSetChanged();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.VipLocationItemView.InterfaceC9109a
    /* JADX INFO: renamed from: a */
    public void mo57465a(final MessageLocation messageLocation, final VipLocationItemView vipLocationItemView) {
        fmj fmjVar = this.f170697e.f159778a;
        Act act = this.f170696d.getAct();
        DoublePair doublePair = messageLocation.coordinates;
        fmjVar.m126239e(act, doublePair.first, doublePair.second, new y20() { // from class: l.qul0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159590a.m188038A(messageLocation, vipLocationItemView, (z80) obj);
            }
        }, new y20() { // from class: l.rul0
            @Override // p153l.y20
            public final void call(Object obj) {
                App.f16087d.m21432k((Throwable) obj);
            }
        });
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return p9r.m171370a(this.f170696d.getContext()).inflate(kec0.f125382Df, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<MessageLocation> mo21403p() {
        return this.f170695c;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, MessageLocation messageLocation, int i, int i2) {
        ((VipLocationItemView) view).m57464e(messageLocation, this.f170698f, this.f170696d.f201744n, this, tul0.m192753a(messageLocation.coordinates, this.f170697e.m178352I0()));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m188041z(MessageLocation messageLocation) {
        this.f170697e.m178348E0(this.f170696d.getAct(), messageLocation, null);
    }
}
