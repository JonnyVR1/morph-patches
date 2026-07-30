package p149l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class xtp extends byr {

    /* JADX INFO: renamed from: A */
    public final View f194423A;

    /* JADX INFO: renamed from: B */
    public final ysp f194424B;

    /* JADX INFO: renamed from: x */
    public final EmptyView f194425x;

    /* JADX INFO: renamed from: y */
    public final VRecyclerView f194426y;

    /* JADX INFO: renamed from: z */
    public final VDraweeView f194427z;

    public xtp(final xsp xspVar, final String str) {
        super(xspVar, LayoutInflater.from(xspVar.act()).inflate(t6c0.f168118N2, (ViewGroup) null));
        xdl0.m208329E0(m71760R().findViewById(g5c0.f101002n1), new View.OnClickListener() { // from class: l.stp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166379a.m211011r0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m71760R().findViewById(g5c0.f100674E);
        this.f194427z = vDraweeView;
        mep0.m154301c1(vDraweeView, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        View viewFindViewById = m71760R().findViewById(g5c0.f100685F1);
        this.f194423A = viewFindViewById;
        VRecyclerView vRecyclerView = (VRecyclerView) m71760R().findViewById(g5c0.f101058t3);
        this.f194426y = vRecyclerView;
        EmptyView emptyView = (EmptyView) m71760R().findViewById(g5c0.f101020p1);
        this.f194425x = emptyView;
        emptyView.setGravity(17);
        emptyView.m68717b(i3c0.f111025h3);
        emptyView.m68718c(t100.m186890d(110.0f), t100.m186890d(110.0f));
        emptyView.m68720e(R$string.f47592vh);
        emptyView.m68719d(Color.parseColor("#4dffabf7"));
        emptyView.setTextMargin(t100.f167256e);
        ysp yspVar = new ysp();
        this.f194424B = yspVar;
        vRecyclerView.setAdapter(yspVar);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(xspVar.act()));
        yspVar.m67370Y(vRecyclerView, emptyView);
        hxs.m133408u("context_livingAct", vDraweeView, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", xdl0.m208412y0(), t100.m186890d(580.0f));
        xspVar.m210827l4(new e30() { // from class: l.ttp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172047a.m211013s0(xspVar, (List) obj);
            }
        });
        xdl0.m208329E0(m71760R().findViewById(g5c0.f100638A), new View.OnClickListener() { // from class: l.utp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178280a.m211012t0(view);
            }
        });
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.vtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xspVar.m129317w3(str, t100.m186890d(600.0f), 7001, 24);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m211011r0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m211012t0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void m211013s0(final xsp xspVar, List<BLiveVoicePlayModeAnchorItem> list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.wtp
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(new ftp(xspVar, (BLiveVoicePlayModeAnchorItem) obj));
            }
        });
        this.f194424B.m67371Z(arrayList);
    }
}
