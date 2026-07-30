package p153l;

import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cb20 extends dh2<LinearLayout> implements arl {

    /* JADX INFO: renamed from: d */
    public VDraweeView f80693d;

    /* JADX INFO: renamed from: e */
    public VText f80694e;

    /* JADX INFO: renamed from: f */
    public AutoRefreshTextView f80695f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f80696g;

    /* JADX INFO: renamed from: h */
    public SpannableStringBuilder f80697h;

    /* JADX INFO: renamed from: l.cb20$a */
    public class C16223a extends RecyclerView.AbstractC0578n {
        public C16223a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
            if (adapterPosition % 5 != 0) {
                rect.left = qa00.m175859d(3.0f);
            }
            if (adapterPosition >= 5) {
                rect.top = qa00.m175859d(3.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.cb20$b */
    public static class C16224b extends d3q<FrameLayout> {

        /* JADX INFO: renamed from: a */
        public final LongLinkSocketMessage.MysteryBoxReward f80699a;

        public C16224b(LongLinkSocketMessage.MysteryBoxReward mysteryBoxReward) {
            this.f80699a = mysteryBoxReward;
        }

        @Override // p153l.d3q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo71749u(FrameLayout frameLayout) {
            super.mo71749u(frameLayout);
            VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(mdc0.f135886A2);
            VText vText = (VText) frameLayout.findViewById(mdc0.f135983L0);
            VText vText2 = (VText) frameLayout.findViewById(mdc0.f136162e4);
            String url = this.f80699a.getUrl();
            int i = qa00.f156335v;
            izs.m142870u("context_single_room", vDraweeView, url, i, i);
            vText.setText(this.f80699a.getNum() + "");
            vText2.setText(this.f80699a.getName());
        }

        @Override // p153l.d3q
        /* JADX INFO: renamed from: o */
        public int mo71748o() {
            return yec0.f199314xb;
        }
    }

    public cb20(LiveMessage liveMessage, yql yqlVar) {
        super(liveMessage, yqlVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo72182m(LinearLayout linearLayout) {
        super.mo72182m(linearLayout);
        ((RecyclerView) linearLayout.findViewById(mdc0.f136242m5)).addItemDecoration(new C16223a());
    }

    /* JADX INFO: renamed from: L */
    public final List<C16224b> m108597L(LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(mysteryBoxRecord.getRewardsList(), new y20() { // from class: l.bb20
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(new cb20.C16224b((LongLinkSocketMessage.MysteryBoxReward) obj));
            }
        });
        return arrayList;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LinearLayout linearLayout) {
        super.mo71749u(linearLayout);
        this.f80693d = (VDraweeView) linearLayout.findViewById(mdc0.f135886A2);
        this.f80694e = (VText) linearLayout.findViewById(mdc0.f135983L0);
        this.f80695f = (AutoRefreshTextView) linearLayout.findViewById(mdc0.f135966J1);
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(mdc0.f136242m5);
        this.f80696g = new LiveBaseAdapter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(linearLayout.getContext(), 5);
        recyclerView.setAdapter(this.f80696g);
        recyclerView.setLayoutManager(gridLayoutManager);
        if (jyb.m147479J(this.f88411a.spanList)) {
            return;
        }
        LiveMessage liveMessage = this.f88411a;
        m108599O(liveMessage, liveMessage.spanList.get(0));
    }

    /* JADX INFO: renamed from: O */
    public void m108599O(LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder) {
        if (liveMessage == null) {
            return;
        }
        this.f80697h = spannableStringBuilder;
        String iconUrl = liveMessage.getMysteryBoxRecord().getIconUrl();
        VDraweeView vDraweeView = this.f80693d;
        int i = qa00.f156288A;
        izs.m142870u("context_single_room", vDraweeView, iconUrl, i, i);
        this.f80694e.setText(liveMessage.getMysteryBoxRecord().getNum() + "");
        this.f80696g.m68554Z(m108597L(liveMessage.getMysteryBoxRecord()));
        this.f80695f.setText(spannableStringBuilder);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199030c0;
    }

    @Override // p153l.arl
    /* JADX INFO: renamed from: M */
    public void mo73677M() {
    }
}
