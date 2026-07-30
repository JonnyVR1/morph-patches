package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationItemView;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class oll0 extends AbstractC15503a<MessageLocation> implements VipLocationItemView.InterfaceC8946a {

    /* JADX INFO: renamed from: d */
    public uml0 f144515d;

    /* JADX INFO: renamed from: e */
    public mml0 f144516e;

    /* JADX INFO: renamed from: c */
    public ArrayList<MessageLocation> f144514c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public e30<MessageLocation> f144517f = new e30() { // from class: l.lll0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f128731a.m164953z((MessageLocation) obj);
        }
    };

    public oll0(uml0 uml0Var, mml0 mml0Var) {
        this.f144515d = uml0Var;
        this.f144516e = mml0Var;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m164950A(MessageLocation messageLocation, VipLocationItemView vipLocationItemView, d90 d90Var) {
        if (pll0.m170238a(messageLocation.coordinates, new DoublePair(d90Var.m110407d(), d90Var.m110408e()))) {
            messageLocation.name = d90Var.mo110405b();
            String strMo110404a = d90Var.mo110404a();
            messageLocation.address = strMo110404a;
            if (!TextUtils.isEmpty(strMo110404a)) {
                vipLocationItemView.f37067c.setText(messageLocation.address);
            }
            this.f144516e.m155482b1(true);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m164951B(ArrayList<MessageLocation> arrayList) {
        this.f144514c = arrayList;
        notifyDataSetChanged();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.VipLocationItemView.InterfaceC8946a
    /* JADX INFO: renamed from: a */
    public void mo56282a(final MessageLocation messageLocation, final VipLocationItemView vipLocationItemView) {
        mjj mjjVar = this.f144516e.f134673a;
        Act act = this.f144515d.getAct();
        DoublePair doublePair = messageLocation.coordinates;
        mjjVar.m154844e(act, doublePair.first, doublePair.second, new e30() { // from class: l.mll0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134453a.m164950A(messageLocation, vipLocationItemView, (d90) obj);
            }
        }, new e30() { // from class: l.nll0
            @Override // p149l.e30
            public final void call(Object obj) {
                App.f15368d.m20433k((Throwable) obj);
            }
        });
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return o7r.m163037a(this.f144515d.getContext()).inflate(f6c0.f96071wf, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<MessageLocation> mo20404p() {
        return this.f144514c;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, MessageLocation messageLocation, int i, int i2) {
        ((VipLocationItemView) view).m56281e(messageLocation, this.f144517f, this.f144515d.f177278n, this, pll0.m170238a(messageLocation.coordinates, this.f144516e.m155472I0()));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m164953z(MessageLocation messageLocation) {
        this.f144516e.m155468E0(this.f144515d.getAct(), messageLocation, null);
    }
}
