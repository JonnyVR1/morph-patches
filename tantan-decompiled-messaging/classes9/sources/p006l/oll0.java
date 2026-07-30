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
import l.o7r;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class oll0 extends a<MessageLocation> implements VipLocationItemView.InterfaceC0382a {

    /* JADX INFO: renamed from: d */
    public uml0 f18276d;

    /* JADX INFO: renamed from: e */
    public mml0 f18277e;

    /* JADX INFO: renamed from: c */
    public ArrayList<MessageLocation> f18275c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public e30<MessageLocation> f18278f = new e30() { // from class: l.lll0
        public final void call(Object obj) {
            this.f16511a.m20702z((MessageLocation) obj);
        }
    };

    public oll0(uml0 uml0Var, mml0 mml0Var) {
        this.f18276d = uml0Var;
        this.f18277e = mml0Var;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m20696A(MessageLocation messageLocation, VipLocationItemView vipLocationItemView, d90 d90Var) {
        if (pll0.m21591a(messageLocation.coordinates, new DoublePair(d90Var.d(), d90Var.e()))) {
            messageLocation.name = d90Var.b();
            String strA = d90Var.a();
            messageLocation.address = strA;
            if (!TextUtils.isEmpty(strA)) {
                vipLocationItemView.f6848c.setText(messageLocation.address);
            }
            this.f18277e.m19438b1(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public void m20697B(ArrayList<MessageLocation> arrayList) {
        this.f18275c = arrayList;
        notifyDataSetChanged();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.VipLocationItemView.InterfaceC0382a
    /* JADX INFO: renamed from: a */
    public void mo9716a(final MessageLocation messageLocation, final VipLocationItemView vipLocationItemView) {
        mjj mjjVar = this.f18277e.f17117a;
        Act act = this.f18276d.act();
        DoublePair doublePair = messageLocation.coordinates;
        mjjVar.e(act, doublePair.first, doublePair.second, new e30() { // from class: l.mll0
            public final void call(Object obj) {
                this.f17029a.m20696A(messageLocation, vipLocationItemView, (d90) obj);
            }
        }, new e30() { // from class: l.nll0
            public final void call(Object obj) {
                App.d.k((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public View m20699m(ViewGroup viewGroup, int i) {
        return o7r.a(this.f18276d.m25285C0()).inflate(f6c0.f12485wf, viewGroup, false);
    }

    /* JADX INFO: renamed from: p */
    public List<MessageLocation> m20700p() {
        return this.f18275c;
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m20698j(View view, MessageLocation messageLocation, int i, int i2) {
        ((VipLocationItemView) view).m9715e(messageLocation, this.f18278f, this.f18276d.f23659n, this, pll0.m21591a(messageLocation.coordinates, this.f18277e.m19426I0()));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m20702z(MessageLocation messageLocation) {
        this.f18277e.m19422E0(this.f18276d.act(), messageLocation, null);
    }
}
