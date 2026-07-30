package p149l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class urp extends byr {

    /* JADX INFO: renamed from: A */
    public final View f177854A;

    /* JADX INFO: renamed from: B */
    public final View f177855B;

    /* JADX INFO: renamed from: C */
    public final VDraweeView f177856C;

    /* JADX INFO: renamed from: D */
    public final View f177857D;

    /* JADX INFO: renamed from: E */
    public final ysp f177858E;

    /* JADX INFO: renamed from: x */
    public final EmptyView f177859x;

    /* JADX INFO: renamed from: y */
    public final VRecyclerView f177860y;

    /* JADX INFO: renamed from: z */
    public final View f177861z;

    public urp(final xsp xspVar, final String str) {
        super(xspVar, LayoutInflater.from(xspVar.act()).inflate(t6c0.f168058I2, (ViewGroup) null));
        xdl0.m208329E0(m71760R().findViewById(g5c0.f101002n1), new View.OnClickListener() { // from class: l.mrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135396a.m195100u0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m71760R().findViewById(g5c0.f100674E);
        this.f177856C = vDraweeView;
        mep0.m154301c1(vDraweeView, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        View viewFindViewById = m71760R().findViewById(g5c0.f100685F1);
        this.f177857D = viewFindViewById;
        View viewFindViewById2 = m71760R().findViewById(g5c0.f100864Z0);
        this.f177861z = viewFindViewById2;
        View viewFindViewById3 = m71760R().findViewById(g5c0.f100941g8);
        this.f177855B = viewFindViewById3;
        View viewFindViewById4 = m71760R().findViewById(g5c0.f100942h);
        this.f177854A = viewFindViewById4;
        VRecyclerView vRecyclerView = (VRecyclerView) m71760R().findViewById(g5c0.f101058t3);
        this.f177860y = vRecyclerView;
        EmptyView emptyView = (EmptyView) m71760R().findViewById(g5c0.f101020p1);
        this.f177859x = emptyView;
        emptyView.setGravity(17);
        emptyView.m68717b(i3c0.f111025h3);
        emptyView.m68718c(t100.m186890d(110.0f), t100.m186890d(110.0f));
        emptyView.m68720e(R$string.f47592vh);
        emptyView.m68719d(Color.parseColor("#4dffabf7"));
        emptyView.setTextMargin(t100.f167256e);
        ysp yspVar = new ysp();
        this.f177858E = yspVar;
        vRecyclerView.setAdapter(yspVar);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(xspVar.act()));
        yspVar.m67370Y(vRecyclerView, emptyView);
        xdl0.m208329E0(m71760R().findViewById(g5c0.f100638A), new View.OnClickListener() { // from class: l.nrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140213a.m195101v0(view);
            }
        });
        xdl0.m208329E0(viewFindViewById2, new View.OnClickListener() { // from class: l.orp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145345a.m195102w0(xspVar, view);
            }
        });
        xdl0.m208329E0(viewFindViewById3, new View.OnClickListener() { // from class: l.prp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150940a.m195103x0(xspVar, view);
            }
        });
        xdl0.m208329E0(viewFindViewById4, new View.OnClickListener() { // from class: l.qrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156022a.m195105y0(xspVar, view);
            }
        });
        hxs.m133408u("context_livingAct", vDraweeView, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", xdl0.m208412y0(), t100.m186890d(580.0f));
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.rrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xspVar.m129317w3(str, t100.m186890d(600.0f), 7001, 24);
            }
        });
        viewFindViewById2.callOnClick();
    }

    /* JADX INFO: renamed from: B0 */
    private void m195091B0(final xsp xspVar, View view, String str) {
        this.f177861z.setSelected(false);
        this.f177855B.setSelected(false);
        this.f177854A.setSelected(false);
        this.f177858E.m67371Z(vwb.m200324f0(new d1q[0]));
        view.setSelected(true);
        xspVar.m210826k4(str, new e30() { // from class: l.srp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166120a.m195106z0(xspVar, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m195100u0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m195101v0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m195102w0(xsp xspVar, View view) {
        m195091B0(xspVar, view, "daily");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m195103x0(xsp xspVar, View view) {
        m195091B0(xspVar, view, MerchandiseTimeUnit.week);
    }

    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public void m195106z0(final xsp xspVar, List<BLiveVoiceMemberLb> list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.trp
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(new ftp(xspVar, (d30) null, (BLiveVoiceMemberLb) obj));
            }
        });
        this.f177858E.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m195105y0(xsp xspVar, View view) {
        m195091B0(xspVar, view, "total");
    }
}
