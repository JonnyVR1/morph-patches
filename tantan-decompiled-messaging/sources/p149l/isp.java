package p149l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class isp extends byr {

    /* JADX INFO: renamed from: A */
    public final TextView f114788A;

    /* JADX INFO: renamed from: B */
    public final ysp f114789B;

    /* JADX INFO: renamed from: C */
    public final View f114790C;

    /* JADX INFO: renamed from: D */
    public final View f114791D;

    /* JADX INFO: renamed from: E */
    public final View f114792E;

    /* JADX INFO: renamed from: x */
    public final EmptyView f114793x;

    /* JADX INFO: renamed from: y */
    public final VRecyclerView f114794y;

    /* JADX INFO: renamed from: z */
    public final VDraweeView f114795z;

    public isp(final xsp xspVar) {
        super(xspVar, LayoutInflater.from(xspVar.act()).inflate(t6c0.f168070J2, (ViewGroup) null));
        xdl0.m208329E0(m71760R().findViewById(g5c0.f101002n1), new View.OnClickListener() { // from class: l.vrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182740a.m138060B0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m71760R().findViewById(g5c0.f100674E);
        this.f114795z = vDraweeView;
        mep0.m154301c1(vDraweeView, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        TextView textView = (TextView) m71760R().findViewById(g5c0.f101065u1);
        this.f114788A = textView;
        VRecyclerView vRecyclerView = (VRecyclerView) m71760R().findViewById(g5c0.f101058t3);
        this.f114794y = vRecyclerView;
        EmptyView emptyView = (EmptyView) m71760R().findViewById(g5c0.f101020p1);
        this.f114793x = emptyView;
        emptyView.setGravity(17);
        emptyView.m68717b(i3c0.f111025h3);
        emptyView.m68718c(t100.m186890d(110.0f), t100.m186890d(110.0f));
        emptyView.m68720e(R$string.f47592vh);
        emptyView.m68719d(Color.parseColor("#4dffabf7"));
        emptyView.setTextMargin(t100.f167256e);
        this.f114790C = m71760R().findViewById(g5c0.f100768O3);
        View viewFindViewById = m71760R().findViewById(g5c0.f100777P3);
        this.f114791D = viewFindViewById;
        View viewFindViewById2 = m71760R().findViewById(g5c0.f100786Q3);
        this.f114792E = viewFindViewById2;
        viewFindViewById2.setEnabled(false);
        ysp yspVar = new ysp();
        this.f114789B = yspVar;
        vRecyclerView.setAdapter(yspVar);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(xspVar.act()));
        yspVar.m67370Y(vRecyclerView, emptyView);
        hxs.m133408u("context_livingAct", vDraweeView, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", xdl0.m208412y0(), t100.m186890d(580.0f));
        xdl0.m208329E0(m71760R().findViewById(g5c0.f100638A), new View.OnClickListener() { // from class: l.zrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204534a.m138061C0(view);
            }
        });
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.asp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71468a.m138062D0(view);
            }
        });
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.bsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77113a.m138063E0(view);
            }
        });
        xdl0.m208329E0(viewFindViewById2, new View.OnClickListener() { // from class: l.csp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82371a.m138080G0(xspVar, view);
            }
        });
        m138083J0(xspVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m138060B0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m138061C0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m138062D0(View view) {
        m138064L0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m138063E0(View view) {
        m138064L0(false);
    }

    /* JADX INFO: renamed from: L0 */
    private void m138064L0(final boolean z) {
        vwb.m200354z(this.f114789B.m67355J(), new e30() { // from class: l.esp
            @Override // p149l.e30
            public final void call(Object obj) {
                ((z7m) ((d1q) obj)).mo108449i(z);
            }
        });
        m138085M0();
        if (this.f114789B.m67355J().size() == 1 && (this.f114789B.m67355J().get(0) instanceof crp)) {
            this.f114789B.m67355J().remove(0);
        }
        this.f114789B.notifyDataSetChanged();
        xdl0.m208344M(this.f114790C, z);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m138078A0(xsp xspVar) {
        m138083J0(xspVar);
        m138064L0(false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m138080G0(final xsp xspVar, View view) {
        new frp(xspVar).m122889q0(kvc0.m147355d(R$string.f46962Sg), kvc0.m147355d(R$string.f46941Rg), kvc0.m147355d(R$string.f46683Fg), kvc0.m147355d(R$string.f46639Dg), new d30() { // from class: l.fsp
            @Override // p149l.d30
            public final void call() {
                this.f99091a.m138079F0(xspVar);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m138082I0(xsp xspVar, ArrayList arrayList, BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin) {
        arrayList.add(new ftp(xspVar, this, bLiveVoiceFansMyJoin));
    }

    /* JADX INFO: renamed from: J0 */
    public void m138083J0(final xsp xspVar) {
        xspVar.m210829n4(new e30() { // from class: l.dsp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87779a.m138081H0(xspVar, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public void m138081H0(final xsp xspVar, List<BLiveVoiceFansMyJoin> list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.xrp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194158a.m138082I0(xspVar, arrayList, (BLiveVoiceFansMyJoin) obj);
            }
        });
        if (!vwb.m200296J(arrayList)) {
            arrayList.add(new crp());
        }
        this.f114789B.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: M0 */
    public void m138085M0() {
        this.f114792E.setEnabled(!vwb.m200339n(this.f114789B.m67355J(), new w9j() { // from class: l.yrp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((z7m) ((d1q) obj)).isChecked());
            }
        }).isEmpty());
    }

    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final void m138079F0(final xsp xspVar) {
        ArrayList<String> arrayListM200303Q = vwb.m200303Q(vwb.m200339n(this.f114789B.m67355J(), new w9j() { // from class: l.gsp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((z7m) ((d1q) obj)).isChecked());
            }
        }), new w9j() { // from class: l.hsp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((z7m) ((d1q) obj)).getUserId();
            }
        });
        if (arrayListM200303Q.isEmpty()) {
            return;
        }
        xspVar.m210820e4(arrayListM200303Q, new d30() { // from class: l.wrp
            @Override // p149l.d30
            public final void call() {
                this.f187813a.m138078A0(xspVar);
            }
        });
    }
}
