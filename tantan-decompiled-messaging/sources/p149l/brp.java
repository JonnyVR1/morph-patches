package p149l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p046p1.mobile.putong.data.UserMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class brp extends byr {

    /* JADX INFO: renamed from: A */
    public final View f76916A;

    /* JADX INFO: renamed from: B */
    public final View f76917B;

    /* JADX INFO: renamed from: C */
    public final VDraweeView f76918C;

    /* JADX INFO: renamed from: D */
    public final VDraweeView f76919D;

    /* JADX INFO: renamed from: E */
    public final TextView f76920E;

    /* JADX INFO: renamed from: F */
    public final TextView f76921F;

    /* JADX INFO: renamed from: G */
    public final View f76922G;

    /* JADX INFO: renamed from: H */
    public final ysp f76923H;

    /* JADX INFO: renamed from: I */
    public final View f76924I;

    /* JADX INFO: renamed from: J */
    public final View f76925J;

    /* JADX INFO: renamed from: K */
    public final View f76926K;

    /* JADX INFO: renamed from: L */
    public final CommonMedalView f76927L;

    /* JADX INFO: renamed from: M */
    public final View f76928M;

    /* JADX INFO: renamed from: N */
    public String f76929N;

    /* JADX INFO: renamed from: x */
    public final EmptyView f76930x;

    /* JADX INFO: renamed from: y */
    public final VRecyclerView f76931y;

    /* JADX INFO: renamed from: z */
    public final View f76932z;

    public brp(final xsp xspVar) {
        super(xspVar, LayoutInflater.from(xspVar.act()).inflate(t6c0.f168010E2, (ViewGroup) null));
        xdl0.m208329E0(m71760R().findViewById(g5c0.f101002n1), new View.OnClickListener() { // from class: l.jqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119307a.m103565H0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m71760R().findViewById(g5c0.f100674E);
        this.f76918C = vDraweeView;
        mep0.m154301c1(vDraweeView, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        this.f76922G = m71760R().findViewById(g5c0.f100685F1);
        this.f76919D = (VDraweeView) m71760R().findViewById(g5c0.f101054t);
        this.f76920E = (TextView) m71760R().findViewById(g5c0.f100917e4);
        this.f76927L = (CommonMedalView) m71760R().findViewById(g5c0.f100822U3);
        this.f76921F = (TextView) m71760R().findViewById(g5c0.f100840W3);
        View viewFindViewById = m71760R().findViewById(g5c0.f100864Z0);
        this.f76917B = viewFindViewById;
        View viewFindViewById2 = m71760R().findViewById(g5c0.f100941g8);
        this.f76916A = viewFindViewById2;
        View viewFindViewById3 = m71760R().findViewById(g5c0.f100942h);
        this.f76932z = viewFindViewById3;
        VRecyclerView vRecyclerView = (VRecyclerView) m71760R().findViewById(g5c0.f101058t3);
        this.f76931y = vRecyclerView;
        EmptyView emptyView = (EmptyView) m71760R().findViewById(g5c0.f101020p1);
        this.f76930x = emptyView;
        View viewFindViewById4 = m71760R().findViewById(g5c0.f100759N3);
        this.f76928M = viewFindViewById4;
        this.f76924I = m71760R().findViewById(g5c0.f100768O3);
        View viewFindViewById5 = m71760R().findViewById(g5c0.f100777P3);
        this.f76925J = viewFindViewById5;
        View viewFindViewById6 = m71760R().findViewById(g5c0.f100786Q3);
        this.f76926K = viewFindViewById6;
        viewFindViewById6.setEnabled(false);
        emptyView.setGravity(17);
        emptyView.m68717b(i3c0.f111025h3);
        emptyView.m68718c(t100.m186890d(110.0f), t100.m186890d(110.0f));
        emptyView.m68720e(R$string.f47592vh);
        emptyView.m68719d(Color.parseColor("#4dffabf7"));
        emptyView.setTextMargin(t100.f167256e);
        ysp yspVar = new ysp();
        this.f76923H = yspVar;
        vRecyclerView.setAdapter(yspVar);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(xspVar.act()));
        yspVar.m67370Y(vRecyclerView, emptyView);
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.sqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166010a.m103585I0(xspVar, view);
            }
        });
        xdl0.m208329E0(viewFindViewById2, new View.OnClickListener() { // from class: l.tqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171615a.m103586J0(xspVar, view);
            }
        });
        xdl0.m208329E0(viewFindViewById3, new View.OnClickListener() { // from class: l.uqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177763a.m103587K0(xspVar, view);
            }
        });
        xdl0.m208329E0(viewFindViewById5, new View.OnClickListener() { // from class: l.vqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182667a.m103588L0(view);
            }
        });
        xdl0.m208329E0(viewFindViewById6, new View.OnClickListener() { // from class: l.wqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187714a.m103590N0(xspVar, view);
            }
        });
        xdl0.m208329E0(viewFindViewById4, new View.OnClickListener() { // from class: l.xqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194022a.m103566O0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m103565H0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m103566O0(View view) {
        if (xdl0.m208349O0(this.f76924I)) {
            m103567U0(false);
        } else {
            m103567U0(true);
        }
    }

    /* JADX INFO: renamed from: U0 */
    private void m103567U0(final boolean z) {
        vwb.m200354z(this.f76923H.m67355J(), new e30() { // from class: l.arp
            @Override // p149l.e30
            public final void call(Object obj) {
                ((z7m) ((d1q) obj)).mo108449i(z);
            }
        });
        m103596V0();
        if (this.f76923H.m67355J().size() == 1 && (this.f76923H.m67355J().get(0) instanceof crp)) {
            this.f76923H.m67355J().remove(0);
        }
        this.f76923H.notifyDataSetChanged();
        xdl0.m208344M(this.f76924I, z);
    }

    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final void m103589M0(final xsp xspVar) {
        ArrayList<String> arrayListM200303Q = vwb.m200303Q(vwb.m200339n(this.f76923H.m67355J(), new w9j() { // from class: l.lqp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((z7m) ((d1q) obj)).isChecked());
            }
        }), new w9j() { // from class: l.mqp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((z7m) ((d1q) obj)).getUserId();
            }
        });
        if (arrayListM200303Q.isEmpty()) {
            return;
        }
        xspVar.m210823h4(arrayListM200303Q, new d30() { // from class: l.nqp
            @Override // p149l.d30
            public final void call() {
                this.f140091a.m103584G0(xspVar);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m103584G0(final xsp xspVar) {
        xspVar.m210826k4(this.f76929N, new e30() { // from class: l.rqp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160674a.m103583F0(xspVar, (List) obj);
            }
        });
        m103567U0(false);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m103585I0(xsp xspVar, View view) {
        m103595T0(xspVar, view, "daily");
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m103586J0(xsp xspVar, View view) {
        m103595T0(xspVar, view, MerchandiseTimeUnit.week);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m103587K0(xsp xspVar, View view) {
        m103595T0(xspVar, view, "total");
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m103588L0(View view) {
        m103567U0(false);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m103590N0(final xsp xspVar, View view) {
        new frp(xspVar).m122889q0(kvc0.m147355d(R$string.f46727Hg), kvc0.m147355d(R$string.f47025Vg), kvc0.m147355d(R$string.f46705Gg), kvc0.m147355d(R$string.f46639Dg), new d30() { // from class: l.zqp
            @Override // p149l.d30
            public final void call() {
                this.f204406a.m103589M0(xspVar);
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m103591P0(xsp xspVar, ArrayList arrayList, BLiveVoiceMemberLb bLiveVoiceMemberLb) {
        arrayList.add(new ftp(xspVar, new d30() { // from class: l.qqp
            @Override // p149l.d30
            public final void call() {
                this.f155923a.m103596V0();
            }
        }, bLiveVoiceMemberLb));
    }

    /* JADX INFO: renamed from: R0 */
    public void m103593R0(final xsp xspVar, final BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        hxs.m133408u("context_livingAct", this.f76918C, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", xdl0.m208412y0(), t100.m186890d(580.0f));
        hxs.m133407t("context_livingAct", this.f76919D, bLiveVoiceFanBaseDetail.avatar, t100.f167236K);
        this.f76920E.setText(bLiveVoiceFanBaseDetail.name);
        wtn0 wtn0Var = new wtn0(false);
        wtn0Var.m205573t(xspVar);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = bLiveVoiceFanBaseDetail.medalColor;
        userMedal.voiceFanbaseGrade = bLiveVoiceFanBaseDetail.medalGrade;
        userMedal.voiceFanbaseText = bLiveVoiceFanBaseDetail.medalName;
        wtn0Var.m205571r(this.f76927L, userMedal);
        this.f76921F.setText(w8u.m202218u(R$string.f46983Tg, Integer.valueOf(bLiveVoiceFanBaseDetail.memberNum)));
        xdl0.m208329E0(this.f76922G, new View.OnClickListener() { // from class: l.yqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xspVar.m129317w3(bLiveVoiceFanBaseDetail.rulePageUrl, t100.m186890d(600.0f), 7001, 24);
            }
        });
        this.f76917B.callOnClick();
    }

    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m103592Q0(final xsp xspVar, List<BLiveVoiceMemberLb> list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.pqp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150807a.m103591P0(xspVar, arrayList, (BLiveVoiceMemberLb) obj);
            }
        });
        if (!vwb.m200296J(arrayList)) {
            arrayList.add(new crp());
        }
        this.f76923H.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m103595T0(final xsp xspVar, View view, String str) {
        this.f76917B.setSelected(false);
        this.f76916A.setSelected(false);
        this.f76932z.setSelected(false);
        this.f76923H.m67371Z(vwb.m200324f0(new d1q[0]));
        m103567U0(false);
        view.setSelected(true);
        this.f76929N = str;
        xspVar.m210826k4(str, new e30() { // from class: l.kqp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124286a.m103592Q0(xspVar, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public final void m103596V0() {
        this.f76926K.setEnabled(!vwb.m200339n(this.f76923H.m67355J(), new w9j() { // from class: l.oqp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((z7m) ((d1q) obj)).isChecked());
            }
        }).isEmpty());
    }
}
