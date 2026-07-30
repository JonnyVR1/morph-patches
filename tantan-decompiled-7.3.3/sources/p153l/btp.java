package p153l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p051p1.mobile.putong.data.UserMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class btp extends c0s {

    /* JADX INFO: renamed from: A */
    public final View f78373A;

    /* JADX INFO: renamed from: B */
    public final View f78374B;

    /* JADX INFO: renamed from: C */
    public final VDraweeView f78375C;

    /* JADX INFO: renamed from: D */
    public final VDraweeView f78376D;

    /* JADX INFO: renamed from: E */
    public final TextView f78377E;

    /* JADX INFO: renamed from: F */
    public final TextView f78378F;

    /* JADX INFO: renamed from: G */
    public final View f78379G;

    /* JADX INFO: renamed from: H */
    public final yup f78380H;

    /* JADX INFO: renamed from: I */
    public final View f78381I;

    /* JADX INFO: renamed from: J */
    public final View f78382J;

    /* JADX INFO: renamed from: K */
    public final View f78383K;

    /* JADX INFO: renamed from: L */
    public final CommonMedalView f78384L;

    /* JADX INFO: renamed from: M */
    public final View f78385M;

    /* JADX INFO: renamed from: N */
    public String f78386N;

    /* JADX INFO: renamed from: x */
    public final EmptyView f78387x;

    /* JADX INFO: renamed from: y */
    public final VRecyclerView f78388y;

    /* JADX INFO: renamed from: z */
    public final View f78389z;

    public btp(final xup xupVar) {
        super(xupVar, LayoutInflater.from(xupVar.act()).inflate(yec0.f198742E2, (ViewGroup) null));
        bnl0.m105509E0(m72943R().findViewById(mdc0.f136247n1), new View.OnClickListener() { // from class: l.jsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122483a.m106343H0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m72943R().findViewById(mdc0.f135919E);
        this.f78375C = vDraweeView;
        qnp0.m177260c1(vDraweeView, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        this.f78379G = m72943R().findViewById(mdc0.f135930F1);
        this.f78376D = (VDraweeView) m72943R().findViewById(mdc0.f136299t);
        this.f78377E = (TextView) m72943R().findViewById(mdc0.f136162e4);
        this.f78384L = (CommonMedalView) m72943R().findViewById(mdc0.f136067U3);
        this.f78378F = (TextView) m72943R().findViewById(mdc0.f136085W3);
        View viewFindViewById = m72943R().findViewById(mdc0.f136109Z0);
        this.f78374B = viewFindViewById;
        View viewFindViewById2 = m72943R().findViewById(mdc0.f136186g8);
        this.f78373A = viewFindViewById2;
        View viewFindViewById3 = m72943R().findViewById(mdc0.f136187h);
        this.f78389z = viewFindViewById3;
        VRecyclerView vRecyclerView = (VRecyclerView) m72943R().findViewById(mdc0.f136303t3);
        this.f78388y = vRecyclerView;
        EmptyView emptyView = (EmptyView) m72943R().findViewById(mdc0.f136265p1);
        this.f78387x = emptyView;
        View viewFindViewById4 = m72943R().findViewById(mdc0.f136004N3);
        this.f78385M = viewFindViewById4;
        this.f78381I = m72943R().findViewById(mdc0.f136013O3);
        View viewFindViewById5 = m72943R().findViewById(mdc0.f136022P3);
        this.f78382J = viewFindViewById5;
        View viewFindViewById6 = m72943R().findViewById(mdc0.f136031Q3);
        this.f78383K = viewFindViewById6;
        viewFindViewById6.setEnabled(false);
        emptyView.setGravity(17);
        emptyView.m69900b(obc0.f146353h3);
        emptyView.m69901c(qa00.m175859d(110.0f), qa00.m175859d(110.0f));
        emptyView.m69903e(R$string.f48440vh);
        emptyView.m69902d(Color.parseColor("#4dffabf7"));
        emptyView.setTextMargin(qa00.f156318e);
        yup yupVar = new yup();
        this.f78380H = yupVar;
        vRecyclerView.setAdapter(yupVar);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(xupVar.act()));
        yupVar.m68553Y(vRecyclerView, emptyView);
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.ssp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170500a.m106363I0(xupVar, view);
            }
        });
        bnl0.m105509E0(viewFindViewById2, new View.OnClickListener() { // from class: l.tsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176010a.m106364J0(xupVar, view);
            }
        });
        bnl0.m105509E0(viewFindViewById3, new View.OnClickListener() { // from class: l.usp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180841a.m106365K0(xupVar, view);
            }
        });
        bnl0.m105509E0(viewFindViewById5, new View.OnClickListener() { // from class: l.vsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185643a.m106366L0(view);
            }
        });
        bnl0.m105509E0(viewFindViewById6, new View.OnClickListener() { // from class: l.wsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190663a.m106368N0(xupVar, view);
            }
        });
        bnl0.m105509E0(viewFindViewById4, new View.OnClickListener() { // from class: l.xsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196118a.m106344O0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m106343H0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m106344O0(View view) {
        if (bnl0.m105529O0(this.f78381I)) {
            m106345U0(false);
        } else {
            m106345U0(true);
        }
    }

    /* JADX INFO: renamed from: U0 */
    private void m106345U0(final boolean z) {
        jyb.m147537z(this.f78380H.m68538J(), new y20() { // from class: l.atp
            @Override // p153l.y20
            public final void call(Object obj) {
                ((pam) ((d3q) obj)).mo112536i(z);
            }
        });
        m106374V0();
        if (this.f78380H.m68538J().size() == 1 && (this.f78380H.m68538J().get(0) instanceof ctp)) {
            this.f78380H.m68538J().remove(0);
        }
        this.f78380H.notifyDataSetChanged();
        bnl0.m105524M(this.f78381I, z);
    }

    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final void m106367M0(final xup xupVar) {
        ArrayList<String> arrayListM147486Q = jyb.m147486Q(jyb.m147522n(this.f78380H.m68538J(), new qcj() { // from class: l.lsp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pam) ((d3q) obj)).isChecked());
            }
        }), new qcj() { // from class: l.msp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((pam) ((d3q) obj)).getUserId();
            }
        });
        if (arrayListM147486Q.isEmpty()) {
            return;
        }
        xupVar.m213176h4(arrayListM147486Q, new x20() { // from class: l.nsp
            @Override // p153l.x20
            public final void call() {
                this.f143525a.m106362G0(xupVar);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m106362G0(final xup xupVar) {
        xupVar.m213179k4(this.f78386N, new y20() { // from class: l.rsp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164711a.m106361F0(xupVar, (List) obj);
            }
        });
        m106345U0(false);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m106363I0(xup xupVar, View view) {
        m106373T0(xupVar, view, "daily");
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m106364J0(xup xupVar, View view) {
        m106373T0(xupVar, view, MerchandiseTimeUnit.week);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m106365K0(xup xupVar, View view) {
        m106373T0(xupVar, view, "total");
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m106366L0(View view) {
        m106345U0(false);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m106368N0(final xup xupVar, View view) {
        new ftp(xupVar).m127379q0(n3d0.m161280d(R$string.f47575Hg), n3d0.m161280d(R$string.f47873Vg), n3d0.m161280d(R$string.f47553Gg), n3d0.m161280d(R$string.f47487Dg), new x20() { // from class: l.zsp
            @Override // p153l.x20
            public final void call() {
                this.f205887a.m106367M0(xupVar);
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m106369P0(xup xupVar, ArrayList arrayList, BLiveVoiceMemberLb bLiveVoiceMemberLb) {
        arrayList.add(new fvp(xupVar, new x20() { // from class: l.qsp
            @Override // p153l.x20
            public final void call() {
                this.f159345a.m106374V0();
            }
        }, bLiveVoiceMemberLb));
    }

    /* JADX INFO: renamed from: R0 */
    public void m106371R0(final xup xupVar, final BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        izs.m142870u("context_livingAct", this.f78375C, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", bnl0.m105592y0(), qa00.m175859d(580.0f));
        izs.m142869t("context_livingAct", this.f78376D, bLiveVoiceFanBaseDetail.avatar, qa00.f156298K);
        this.f78377E.setText(bLiveVoiceFanBaseDetail.name);
        a3o0 a3o0Var = new a3o0(false);
        a3o0Var.m95860t(xupVar);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = bLiveVoiceFanBaseDetail.medalColor;
        userMedal.voiceFanbaseGrade = bLiveVoiceFanBaseDetail.medalGrade;
        userMedal.voiceFanbaseText = bLiveVoiceFanBaseDetail.medalName;
        a3o0Var.m95858r(this.f78384L, userMedal);
        this.f78378F.setText(xau.m209911u(R$string.f47831Tg, Integer.valueOf(bLiveVoiceFanBaseDetail.memberNum)));
        bnl0.m105509E0(this.f78379G, new View.OnClickListener() { // from class: l.ysp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xupVar.m138876w3(bLiveVoiceFanBaseDetail.rulePageUrl, qa00.m175859d(600.0f), 7001, 24);
            }
        });
        this.f78374B.callOnClick();
    }

    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m106370Q0(final xup xupVar, List<BLiveVoiceMemberLb> list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.psp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153956a.m106369P0(xupVar, arrayList, (BLiveVoiceMemberLb) obj);
            }
        });
        if (!jyb.m147479J(arrayList)) {
            arrayList.add(new ctp());
        }
        this.f78380H.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m106373T0(final xup xupVar, View view, String str) {
        this.f78374B.setSelected(false);
        this.f78373A.setSelected(false);
        this.f78389z.setSelected(false);
        this.f78380H.m68554Z(jyb.m147507f0(new d3q[0]));
        m106345U0(false);
        view.setSelected(true);
        this.f78386N = str;
        xupVar.m213179k4(str, new y20() { // from class: l.ksp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128597a.m106370Q0(xupVar, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public final void m106374V0() {
        this.f78383K.setEnabled(!jyb.m147522n(this.f78380H.m68538J(), new qcj() { // from class: l.osp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pam) ((d3q) obj)).isChecked());
            }
        }).isEmpty());
    }
}
