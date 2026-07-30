package p006l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.vip.VipLocationItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.MessageLocation;
import java.util.ArrayList;
import java.util.List;
import l.a;
import l.d90;
import l.e30;
import l.mjj;
import l.o6j0;
import l.o7r;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gil0 extends a<MessageLocation> implements VipLocationItemView.InterfaceC0382a {

    /* JADX INFO: renamed from: d */
    public ljl0 f13331d;

    /* JADX INFO: renamed from: e */
    public cjl0 f13332e;

    /* JADX INFO: renamed from: c */
    public ArrayList<MessageLocation> f13330c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public e30<MessageLocation> f13333f = new e30() { // from class: l.dil0
        public final void call(Object obj) {
            this.f10417a.m15810z((MessageLocation) obj);
        }
    };

    public gil0(ljl0 ljl0Var, cjl0 cjl0Var) {
        this.f13331d = ljl0Var;
        this.f13332e = cjl0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m15806A(MessageLocation messageLocation, VipLocationItemView vipLocationItemView, d90 d90Var) {
        if (cjl0.m13476E0(messageLocation.coordinates, new DoublePair(d90Var.d(), d90Var.e()))) {
            messageLocation.name = d90Var.b();
            String strA = d90Var.a();
            messageLocation.address = strA;
            if (!TextUtils.isEmpty(strA)) {
                vipLocationItemView.f6848c.setText(messageLocation.address);
            }
            this.f13332e.m13516a1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m15810z(MessageLocation messageLocation) {
        o6j0.c("e_my_roam_location", this.f13331d.act().pageId(), new o6j0.a[0]);
        if (ljl0.m18808n("p_settings_location,manyou", this.f13331d.act(), this.f13332e.m13509G0())) {
            cjl0.m13474C0(this.f13331d.act(), messageLocation, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public void m15811B(ArrayList<MessageLocation> arrayList) {
        this.f13330c = arrayList;
        notifyDataSetChanged();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.VipLocationItemView.InterfaceC0382a
    /* JADX INFO: renamed from: a */
    public void mo9716a(final MessageLocation messageLocation, final VipLocationItemView vipLocationItemView) {
        mjj mjjVar = this.f13332e.f9692b;
        Act act = this.f13331d.act();
        DoublePair doublePair = messageLocation.coordinates;
        mjjVar.e(act, doublePair.first, doublePair.second, new e30() { // from class: l.eil0
            public final void call(Object obj) {
                this.f11169a.m15806A(messageLocation, vipLocationItemView, (d90) obj);
            }
        }, new e30() { // from class: l.fil0
            public final void call(Object obj) {
                App.d.k((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public View m15813m(ViewGroup viewGroup, int i) {
        return o7r.a(this.f13331d.m18818C0()).inflate(f6c0.f12485wf, viewGroup, false);
    }

    /* JADX INFO: renamed from: p */
    public List<MessageLocation> m15814p() {
        return this.f13330c;
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m15812j(View view, MessageLocation messageLocation, int i, int i2) {
        ((VipLocationItemView) view).m9715e(messageLocation, this.f13333f, this.f13331d.f16470o, this, cjl0.m13476E0(messageLocation.coordinates, this.f13332e.m13511I0()));
    }
}
