package p153l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class iup extends c0s {

    /* JADX INFO: renamed from: A */
    public final TextView f116966A;

    /* JADX INFO: renamed from: B */
    public final yup f116967B;

    /* JADX INFO: renamed from: C */
    public final View f116968C;

    /* JADX INFO: renamed from: D */
    public final View f116969D;

    /* JADX INFO: renamed from: E */
    public final View f116970E;

    /* JADX INFO: renamed from: x */
    public final EmptyView f116971x;

    /* JADX INFO: renamed from: y */
    public final VRecyclerView f116972y;

    /* JADX INFO: renamed from: z */
    public final VDraweeView f116973z;

    public iup(final xup xupVar) {
        super(xupVar, LayoutInflater.from(xupVar.act()).inflate(yec0.f198802J2, (ViewGroup) null));
        bnl0.m105509E0(m72943R().findViewById(mdc0.f136247n1), new View.OnClickListener() { // from class: l.vtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185734a.m142206B0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m72943R().findViewById(mdc0.f135919E);
        this.f116973z = vDraweeView;
        qnp0.m177260c1(vDraweeView, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        TextView textView = (TextView) m72943R().findViewById(mdc0.f136310u1);
        this.f116966A = textView;
        VRecyclerView vRecyclerView = (VRecyclerView) m72943R().findViewById(mdc0.f136303t3);
        this.f116972y = vRecyclerView;
        EmptyView emptyView = (EmptyView) m72943R().findViewById(mdc0.f136265p1);
        this.f116971x = emptyView;
        emptyView.setGravity(17);
        emptyView.m69900b(obc0.f146353h3);
        emptyView.m69901c(qa00.m175859d(110.0f), qa00.m175859d(110.0f));
        emptyView.m69903e(R$string.f48440vh);
        emptyView.m69902d(Color.parseColor("#4dffabf7"));
        emptyView.setTextMargin(qa00.f156318e);
        this.f116968C = m72943R().findViewById(mdc0.f136013O3);
        View viewFindViewById = m72943R().findViewById(mdc0.f136022P3);
        this.f116969D = viewFindViewById;
        View viewFindViewById2 = m72943R().findViewById(mdc0.f136031Q3);
        this.f116970E = viewFindViewById2;
        viewFindViewById2.setEnabled(false);
        yup yupVar = new yup();
        this.f116967B = yupVar;
        vRecyclerView.setAdapter(yupVar);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(xupVar.act()));
        yupVar.m68553Y(vRecyclerView, emptyView);
        izs.m142870u("context_livingAct", vDraweeView, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", bnl0.m105592y0(), qa00.m175859d(580.0f));
        bnl0.m105509E0(m72943R().findViewById(mdc0.f135883A), new View.OnClickListener() { // from class: l.ztp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206032a.m142207C0(view);
            }
        });
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.aup
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73536a.m142208D0(view);
            }
        });
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.bup
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78532a.m142209E0(view);
            }
        });
        bnl0.m105509E0(viewFindViewById2, new View.OnClickListener() { // from class: l.cup
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83865a.m142226G0(xupVar, view);
            }
        });
        m142229J0(xupVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m142206B0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m142207C0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m142208D0(View view) {
        m142210L0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m142209E0(View view) {
        m142210L0(false);
    }

    /* JADX INFO: renamed from: L0 */
    private void m142210L0(final boolean z) {
        jyb.m147537z(this.f116967B.m68538J(), new y20() { // from class: l.eup
            @Override // p153l.y20
            public final void call(Object obj) {
                ((pam) ((d3q) obj)).mo112536i(z);
            }
        });
        m142231M0();
        if (this.f116967B.m68538J().size() == 1 && (this.f116967B.m68538J().get(0) instanceof ctp)) {
            this.f116967B.m68538J().remove(0);
        }
        this.f116967B.notifyDataSetChanged();
        bnl0.m105524M(this.f116968C, z);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m142224A0(xup xupVar) {
        m142229J0(xupVar);
        m142210L0(false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m142226G0(final xup xupVar, View view) {
        new ftp(xupVar).m127379q0(n3d0.m161280d(R$string.f47810Sg), n3d0.m161280d(R$string.f47789Rg), n3d0.m161280d(R$string.f47531Fg), n3d0.m161280d(R$string.f47487Dg), new x20() { // from class: l.fup
            @Override // p153l.x20
            public final void call() {
                this.f100928a.m142225F0(xupVar);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m142228I0(xup xupVar, ArrayList arrayList, BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin) {
        arrayList.add(new fvp(xupVar, this, bLiveVoiceFansMyJoin));
    }

    /* JADX INFO: renamed from: J0 */
    public void m142229J0(final xup xupVar) {
        xupVar.m213182n4(new y20() { // from class: l.dup
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90832a.m142227H0(xupVar, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public void m142227H0(final xup xupVar, List<BLiveVoiceFansMyJoin> list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.xtp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196236a.m142228I0(xupVar, arrayList, (BLiveVoiceFansMyJoin) obj);
            }
        });
        if (!jyb.m147479J(arrayList)) {
            arrayList.add(new ctp());
        }
        this.f116967B.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: M0 */
    public void m142231M0() {
        this.f116970E.setEnabled(!jyb.m147522n(this.f116967B.m68538J(), new qcj() { // from class: l.ytp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pam) ((d3q) obj)).isChecked());
            }
        }).isEmpty());
    }

    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final void m142225F0(final xup xupVar) {
        ArrayList<String> arrayListM147486Q = jyb.m147486Q(jyb.m147522n(this.f116967B.m68538J(), new qcj() { // from class: l.gup
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pam) ((d3q) obj)).isChecked());
            }
        }), new qcj() { // from class: l.hup
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((pam) ((d3q) obj)).getUserId();
            }
        });
        if (arrayListM147486Q.isEmpty()) {
            return;
        }
        xupVar.m213173e4(arrayListM147486Q, new x20() { // from class: l.wtp
            @Override // p153l.x20
            public final void call() {
                this.f190800a.m142224A0(xupVar);
            }
        });
    }
}
