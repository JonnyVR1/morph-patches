package p002l;

import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.e30;
import l.hxs;
import l.t100;
import l.vwb;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u220 extends wg2<LinearLayout> implements pol {

    /* JADX INFO: renamed from: d */
    public VDraweeView f20462d;

    /* JADX INFO: renamed from: e */
    public VText f20463e;

    /* JADX INFO: renamed from: f */
    public AutoRefreshTextView f20464f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f20465g;

    /* JADX INFO: renamed from: h */
    public SpannableStringBuilder f20466h;

    /* JADX INFO: renamed from: l.u220$a */
    public class C0849a extends RecyclerView.n {
        public C0849a() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
            if (adapterPosition % 5 != 0) {
                rect.left = t100.d(3.0f);
            }
            if (adapterPosition >= 5) {
                rect.top = t100.d(3.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.u220$b */
    public static class C0850b extends d1q<FrameLayout> {

        /* JADX INFO: renamed from: a */
        public final LongLinkSocketMessage.MysteryBoxReward f20468a;

        public C0850b(LongLinkSocketMessage.MysteryBoxReward mysteryBoxReward) {
            this.f20468a = mysteryBoxReward;
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void m23269u(FrameLayout frameLayout) {
            super.u(frameLayout);
            VDraweeView vDraweeViewFindViewById = frameLayout.findViewById(g5c0.f10791A2);
            VText vTextFindViewById = frameLayout.findViewById(g5c0.f10888L0);
            VText vTextFindViewById2 = frameLayout.findViewById(g5c0.f11067e4);
            String url = this.f20468a.getUrl();
            int i = t100.v;
            hxs.u("context_single_room", vDraweeViewFindViewById, url, i, i);
            vTextFindViewById.setText(this.f20468a.getNum() + "");
            vTextFindViewById2.setText(this.f20468a.getName());
        }

        /* JADX INFO: renamed from: o */
        public int m23268o() {
            return t6c0.f20078xb;
        }
    }

    public u220(LiveMessage liveMessage, nol nolVar) {
        super(liveMessage, nolVar);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m23264m(LinearLayout linearLayout) {
        super.m(linearLayout);
        linearLayout.findViewById(g5c0.f11147m5).addItemDecoration(new C0849a());
    }

    /* JADX INFO: renamed from: L */
    public final List<C0850b> m23261L(LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(mysteryBoxRecord.getRewardsList(), new e30() { // from class: l.t220
            public final void call(Object obj) {
                arrayList.add(new u220.C0850b((LongLinkSocketMessage.MysteryBoxReward) obj));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m23266u(LinearLayout linearLayout) {
        super.u(linearLayout);
        this.f20462d = linearLayout.findViewById(g5c0.f10791A2);
        this.f20463e = linearLayout.findViewById(g5c0.f10888L0);
        this.f20464f = linearLayout.findViewById(g5c0.f10871J1);
        RecyclerView recyclerViewFindViewById = linearLayout.findViewById(g5c0.f11147m5);
        this.f20465g = new LiveBaseAdapter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(linearLayout.getContext(), 5);
        recyclerViewFindViewById.setAdapter(this.f20465g);
        recyclerViewFindViewById.setLayoutManager(gridLayoutManager);
        if (vwb.J(this.f21724a.spanList)) {
            return;
        }
        LiveMessage liveMessage = this.f21724a;
        m23263O(liveMessage, liveMessage.spanList.get(0));
    }

    /* JADX INFO: renamed from: O */
    public void m23263O(LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder) {
        if (liveMessage == null) {
            return;
        }
        this.f20466h = spannableStringBuilder;
        String iconUrl = liveMessage.getMysteryBoxRecord().getIconUrl();
        VDraweeView vDraweeView = this.f20462d;
        int i = t100.A;
        hxs.u("context_single_room", vDraweeView, iconUrl, i, i);
        this.f20463e.setText(liveMessage.getMysteryBoxRecord().getNum() + "");
        this.f20465g.Z(m23261L(liveMessage.getMysteryBoxRecord()));
        this.f20464f.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: o */
    public int m23265o() {
        return t6c0.f19794c0;
    }

    @Override // p002l.pol
    /* JADX INFO: renamed from: M */
    public void mo5986M() {
    }
}
