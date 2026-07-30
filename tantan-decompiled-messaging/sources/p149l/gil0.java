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
public class gil0 extends AbstractC15503a<MessageLocation> implements VipLocationItemView.InterfaceC8946a {

    /* JADX INFO: renamed from: d */
    public ljl0 f102936d;

    /* JADX INFO: renamed from: e */
    public cjl0 f102937e;

    /* JADX INFO: renamed from: c */
    public ArrayList<MessageLocation> f102935c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public e30<MessageLocation> f102938f = new e30() { // from class: l.dil0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f86401a.m126360z((MessageLocation) obj);
        }
    };

    public gil0(ljl0 ljl0Var, cjl0 cjl0Var) {
        this.f102936d = ljl0Var;
        this.f102937e = cjl0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m126356A(MessageLocation messageLocation, VipLocationItemView vipLocationItemView, d90 d90Var) {
        if (cjl0.m107181E0(messageLocation.coordinates, new DoublePair(d90Var.m110407d(), d90Var.m110408e()))) {
            messageLocation.name = d90Var.mo110405b();
            String strMo110404a = d90Var.mo110404a();
            messageLocation.address = strMo110404a;
            if (!TextUtils.isEmpty(strMo110404a)) {
                vipLocationItemView.f37067c.setText(messageLocation.address);
            }
            this.f102937e.m107219a1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m126360z(MessageLocation messageLocation) {
        o6j0.m162859c("e_my_roam_location", this.f102936d.getAct().pageId(), new o6j0.C18854a[0]);
        if (ljl0.m149994n("p_settings_location,manyou", this.f102936d.getAct(), this.f102937e.m107214G0())) {
            cjl0.m107179C0(this.f102936d.getAct(), messageLocation, null);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m126361B(ArrayList<MessageLocation> arrayList) {
        this.f102935c = arrayList;
        notifyDataSetChanged();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.VipLocationItemView.InterfaceC8946a
    /* JADX INFO: renamed from: a */
    public void mo56282a(final MessageLocation messageLocation, final VipLocationItemView vipLocationItemView) {
        mjj mjjVar = this.f102937e.f81201b;
        Act act = this.f102936d.getAct();
        DoublePair doublePair = messageLocation.coordinates;
        mjjVar.m154844e(act, doublePair.first, doublePair.second, new e30() { // from class: l.eil0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91614a.m126356A(messageLocation, vipLocationItemView, (d90) obj);
            }
        }, new e30() { // from class: l.fil0
            @Override // p149l.e30
            public final void call(Object obj) {
                App.f15368d.m20433k((Throwable) obj);
            }
        });
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return o7r.m163037a(this.f102936d.getContext()).inflate(f6c0.f96071wf, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<MessageLocation> mo20404p() {
        return this.f102935c;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, MessageLocation messageLocation, int i, int i2) {
        ((VipLocationItemView) view).m56281e(messageLocation, this.f102938f, this.f102936d.f128356o, this, cjl0.m107181E0(messageLocation.coordinates, this.f102937e.m107216I0()));
    }
}
