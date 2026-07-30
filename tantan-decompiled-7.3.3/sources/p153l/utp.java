package p153l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class utp extends c0s {

    /* JADX INFO: renamed from: A */
    public final View f180983A;

    /* JADX INFO: renamed from: B */
    public final View f180984B;

    /* JADX INFO: renamed from: C */
    public final VDraweeView f180985C;

    /* JADX INFO: renamed from: D */
    public final View f180986D;

    /* JADX INFO: renamed from: E */
    public final yup f180987E;

    /* JADX INFO: renamed from: x */
    public final EmptyView f180988x;

    /* JADX INFO: renamed from: y */
    public final VRecyclerView f180989y;

    /* JADX INFO: renamed from: z */
    public final View f180990z;

    public utp(final xup xupVar, final String str) {
        super(xupVar, LayoutInflater.from(xupVar.act()).inflate(yec0.f198790I2, (ViewGroup) null));
        bnl0.m105509E0(m72943R().findViewById(mdc0.f136247n1), new View.OnClickListener() { // from class: l.mtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138647a.m198077u0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m72943R().findViewById(mdc0.f135919E);
        this.f180985C = vDraweeView;
        qnp0.m177260c1(vDraweeView, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        View viewFindViewById = m72943R().findViewById(mdc0.f135930F1);
        this.f180986D = viewFindViewById;
        View viewFindViewById2 = m72943R().findViewById(mdc0.f136109Z0);
        this.f180990z = viewFindViewById2;
        View viewFindViewById3 = m72943R().findViewById(mdc0.f136186g8);
        this.f180984B = viewFindViewById3;
        View viewFindViewById4 = m72943R().findViewById(mdc0.f136187h);
        this.f180983A = viewFindViewById4;
        VRecyclerView vRecyclerView = (VRecyclerView) m72943R().findViewById(mdc0.f136303t3);
        this.f180989y = vRecyclerView;
        EmptyView emptyView = (EmptyView) m72943R().findViewById(mdc0.f136265p1);
        this.f180988x = emptyView;
        emptyView.setGravity(17);
        emptyView.m69900b(obc0.f146353h3);
        emptyView.m69901c(qa00.m175859d(110.0f), qa00.m175859d(110.0f));
        emptyView.m69903e(R$string.f48440vh);
        emptyView.m69902d(Color.parseColor("#4dffabf7"));
        emptyView.setTextMargin(qa00.f156318e);
        yup yupVar = new yup();
        this.f180987E = yupVar;
        vRecyclerView.setAdapter(yupVar);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(xupVar.act()));
        yupVar.m68553Y(vRecyclerView, emptyView);
        bnl0.m105509E0(m72943R().findViewById(mdc0.f135883A), new View.OnClickListener() { // from class: l.ntp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143622a.m198078v0(view);
            }
        });
        bnl0.m105509E0(viewFindViewById2, new View.OnClickListener() { // from class: l.otp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148997a.m198079w0(xupVar, view);
            }
        });
        bnl0.m105509E0(viewFindViewById3, new View.OnClickListener() { // from class: l.ptp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154101a.m198080x0(xupVar, view);
            }
        });
        bnl0.m105509E0(viewFindViewById4, new View.OnClickListener() { // from class: l.qtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159475a.m198082y0(xupVar, view);
            }
        });
        izs.m142870u("context_livingAct", vDraweeView, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", bnl0.m105592y0(), qa00.m175859d(580.0f));
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.rtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xupVar.m138876w3(str, qa00.m175859d(600.0f), 7001, 24);
            }
        });
        viewFindViewById2.callOnClick();
    }

    /* JADX INFO: renamed from: B0 */
    private void m198068B0(final xup xupVar, View view, String str) {
        this.f180990z.setSelected(false);
        this.f180984B.setSelected(false);
        this.f180983A.setSelected(false);
        this.f180987E.m68554Z(jyb.m147507f0(new d3q[0]));
        view.setSelected(true);
        xupVar.m213179k4(str, new y20() { // from class: l.stp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170597a.m198083z0(xupVar, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m198077u0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m198078v0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m198079w0(xup xupVar, View view) {
        m198068B0(xupVar, view, "daily");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m198080x0(xup xupVar, View view) {
        m198068B0(xupVar, view, MerchandiseTimeUnit.week);
    }

    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public void m198083z0(final xup xupVar, List<BLiveVoiceMemberLb> list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.ttp
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(new fvp(xupVar, (x20) null, (BLiveVoiceMemberLb) obj));
            }
        });
        this.f180987E.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m198082y0(xup xupVar, View view) {
        m198068B0(xupVar, view, "total");
    }
}
