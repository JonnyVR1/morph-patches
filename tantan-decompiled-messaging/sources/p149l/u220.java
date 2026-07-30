package p149l;

import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class u220 extends wg2<LinearLayout> implements pol {

    /* JADX INFO: renamed from: d */
    public VDraweeView f173061d;

    /* JADX INFO: renamed from: e */
    public VText f173062e;

    /* JADX INFO: renamed from: f */
    public AutoRefreshTextView f173063f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f173064g;

    /* JADX INFO: renamed from: h */
    public SpannableStringBuilder f173065h;

    /* JADX INFO: renamed from: l.u220$a */
    public class C20338a extends RecyclerView.AbstractC0576n {
        public C20338a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
            if (adapterPosition % 5 != 0) {
                rect.left = t100.m186890d(3.0f);
            }
            if (adapterPosition >= 5) {
                rect.top = t100.m186890d(3.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.u220$b */
    public static class C20339b extends d1q<FrameLayout> {

        /* JADX INFO: renamed from: a */
        public final LongLinkSocketMessage.MysteryBoxReward f173067a;

        public C20339b(LongLinkSocketMessage.MysteryBoxReward mysteryBoxReward) {
            this.f173067a = mysteryBoxReward;
        }

        @Override // p149l.d1q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo70566u(FrameLayout frameLayout) {
            super.mo70566u(frameLayout);
            VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(g5c0.f100641A2);
            VText vText = (VText) frameLayout.findViewById(g5c0.f100738L0);
            VText vText2 = (VText) frameLayout.findViewById(g5c0.f100917e4);
            String url = this.f173067a.getUrl();
            int i = t100.f167273v;
            hxs.m133408u("context_single_room", vDraweeView, url, i, i);
            vText.setText(this.f173067a.getNum() + "");
            vText2.setText(this.f173067a.getName());
        }

        @Override // p149l.d1q
        /* JADX INFO: renamed from: o */
        public int mo70565o() {
            return t6c0.f168582xb;
        }
    }

    public u220(LiveMessage liveMessage, nol nolVar) {
        super(liveMessage, nolVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70999m(LinearLayout linearLayout) {
        super.mo70999m(linearLayout);
        ((RecyclerView) linearLayout.findViewById(g5c0.f100997m5)).addItemDecoration(new C20338a());
    }

    /* JADX INFO: renamed from: L */
    public final List<C20339b> m191436L(LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(mysteryBoxRecord.getRewardsList(), new e30() { // from class: l.t220
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(new u220.C20339b((LongLinkSocketMessage.MysteryBoxReward) obj));
            }
        });
        return arrayList;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LinearLayout linearLayout) {
        super.mo70566u(linearLayout);
        this.f173061d = (VDraweeView) linearLayout.findViewById(g5c0.f100641A2);
        this.f173062e = (VText) linearLayout.findViewById(g5c0.f100738L0);
        this.f173063f = (AutoRefreshTextView) linearLayout.findViewById(g5c0.f100721J1);
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(g5c0.f100997m5);
        this.f173064g = new LiveBaseAdapter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(linearLayout.getContext(), 5);
        recyclerView.setAdapter(this.f173064g);
        recyclerView.setLayoutManager(gridLayoutManager);
        if (vwb.m200296J(this.f186132a.spanList)) {
            return;
        }
        LiveMessage liveMessage = this.f186132a;
        m191438O(liveMessage, liveMessage.spanList.get(0));
    }

    /* JADX INFO: renamed from: O */
    public void m191438O(LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder) {
        if (liveMessage == null) {
            return;
        }
        this.f173065h = spannableStringBuilder;
        String iconUrl = liveMessage.getMysteryBoxRecord().getIconUrl();
        VDraweeView vDraweeView = this.f173061d;
        int i = t100.f167226A;
        hxs.m133408u("context_single_room", vDraweeView, iconUrl, i, i);
        this.f173062e.setText(liveMessage.getMysteryBoxRecord().getNum() + "");
        this.f173064g.m67371Z(m191436L(liveMessage.getMysteryBoxRecord()));
        this.f173063f.setText(spannableStringBuilder);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168298c0;
    }

    @Override // p149l.pol
    /* JADX INFO: renamed from: M */
    public void mo72494M() {
    }
}
