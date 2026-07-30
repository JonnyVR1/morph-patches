package p153l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class xvp extends c0s {

    /* JADX INFO: renamed from: A */
    public final View f196413A;

    /* JADX INFO: renamed from: B */
    public final yup f196414B;

    /* JADX INFO: renamed from: x */
    public final EmptyView f196415x;

    /* JADX INFO: renamed from: y */
    public final VRecyclerView f196416y;

    /* JADX INFO: renamed from: z */
    public final VDraweeView f196417z;

    public xvp(final xup xupVar, final String str) {
        super(xupVar, LayoutInflater.from(xupVar.act()).inflate(yec0.f198850N2, (ViewGroup) null));
        bnl0.m105509E0(m72943R().findViewById(mdc0.f136247n1), new View.OnClickListener() { // from class: l.svp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170864a.m213253r0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m72943R().findViewById(mdc0.f135919E);
        this.f196417z = vDraweeView;
        qnp0.m177260c1(vDraweeView, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        View viewFindViewById = m72943R().findViewById(mdc0.f135930F1);
        this.f196413A = viewFindViewById;
        VRecyclerView vRecyclerView = (VRecyclerView) m72943R().findViewById(mdc0.f136303t3);
        this.f196416y = vRecyclerView;
        EmptyView emptyView = (EmptyView) m72943R().findViewById(mdc0.f136265p1);
        this.f196415x = emptyView;
        emptyView.setGravity(17);
        emptyView.m69900b(obc0.f146353h3);
        emptyView.m69901c(qa00.m175859d(110.0f), qa00.m175859d(110.0f));
        emptyView.m69903e(R$string.f48440vh);
        emptyView.m69902d(Color.parseColor("#4dffabf7"));
        emptyView.setTextMargin(qa00.f156318e);
        yup yupVar = new yup();
        this.f196414B = yupVar;
        vRecyclerView.setAdapter(yupVar);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(xupVar.act()));
        yupVar.m68553Y(vRecyclerView, emptyView);
        izs.m142870u("context_livingAct", vDraweeView, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", bnl0.m105592y0(), qa00.m175859d(580.0f));
        xupVar.m213180l4(new y20() { // from class: l.tvp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176274a.m213255s0(xupVar, (List) obj);
            }
        });
        bnl0.m105509E0(m72943R().findViewById(mdc0.f135883A), new View.OnClickListener() { // from class: l.uvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181158a.m213254t0(view);
            }
        });
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.vvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xupVar.m138876w3(str, qa00.m175859d(600.0f), 7001, 24);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m213253r0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m213254t0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void m213255s0(final xup xupVar, List<BLiveVoicePlayModeAnchorItem> list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.wvp
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(new fvp(xupVar, (BLiveVoicePlayModeAnchorItem) obj));
            }
        });
        this.f196414B.m68554Z(arrayList);
    }
}
