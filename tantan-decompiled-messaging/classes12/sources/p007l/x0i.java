package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.TextTheme;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderItem;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderSelectItem;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.MineAskPostState;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.j760;
import l.lsi0;
import l.mqi0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class x0i extends dac0<BubbleInfo> {

    /* JADX INFO: renamed from: d */
    public Act f14728d;

    /* JADX INFO: renamed from: e */
    public e30<Integer> f14729e;

    /* JADX INFO: renamed from: f */
    public String f14730f;

    /* JADX INFO: renamed from: g */
    public String f14731g;

    /* JADX INFO: renamed from: c */
    public List<BubbleInfo> f14727c = new ArrayList();

    /* JADX INFO: renamed from: h */
    public l80<BubbleInfo> f14732h = new C2530a();

    /* JADX INFO: renamed from: l.x0i$a */
    public class C2530a extends l80<BubbleInfo> {
        public C2530a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo4975k(BubbleInfo bubbleInfo, int i, View view) {
            zvf0.A("e_other_state_avartar", x0i.this.m15957K(), new j760[]{vwb.Y("state_id", bubbleInfo.emotion.f209id), vwb.Y("owner_id", ((DbObject) FeedModule.m1140H().me_()).id)});
        }
    }

    public x0i(Act act, String str) {
        this.f14728d = act;
        this.f14731g = str;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m15956I(BubbleInfo bubbleInfo) {
        return (bubbleInfo.createdTime + 8.64E7d) - ((double) mqi0.o()) > 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public String m15957K() {
        return vqg.m15485K(this.f14731g, false);
    }

    /* JADX INFO: renamed from: C */
    public int m15959C() {
        return this.f14727c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m15960D(ViewGroup viewGroup, int i) {
        return i == 1 ? new FeedStateHeaderSelectItem(this.f14728d) : new FeedStateHeaderItem(this.f14728d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderSelectItem] */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m15958A(View view, final BubbleInfo bubbleInfo, int i, int i2) {
        if (view instanceof FeedStateHeaderItem) {
            FeedStateHeaderItem feedStateHeaderItem = (FeedStateHeaderItem) view;
            feedStateHeaderItem.m6926u(bubbleInfo, i2);
            m15963L(i2, feedStateHeaderItem);
            m15967P(bubbleInfo, i2 == 0 && (bubbleInfo instanceof MineAskPostState));
            return;
        }
        if (view instanceof FeedStateHeaderSelectItem) {
            this.f14732h.m11594h(view, bubbleInfo, i2);
            ?? r1 = (FeedStateHeaderSelectItem) view;
            xdl0.E0((View) r1, new View.OnClickListener() { // from class: l.v0i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f14010a.m15964M(bubbleInfo, view2);
                }
            });
            r1.m6930k0(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public BubbleInfo getItem(int i) {
        return this.f14727c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public void m15963L(final int i, FeedStateHeaderItem feedStateHeaderItem) {
        final BubbleInfo bubbleInfo = this.f14727c.get(i);
        feedStateHeaderItem.setOnClickListener(new View.OnClickListener() { // from class: l.w0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14354a.m15965N(i, bubbleInfo, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m15964M(BubbleInfo bubbleInfo, View view) {
        zvf0.r("e_fast_state_post", m15957K());
        m15969R(bubbleInfo.emotion);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m15965N(int i, BubbleInfo bubbleInfo, View view) {
        if (i != 0) {
            if (m15956I(bubbleInfo)) {
                m15975X(i);
                m15966O(bubbleInfo);
                return;
            } else {
                lsi0.j("状态已结束");
                m15970S(i);
                return;
            }
        }
        if (bubbleInfo instanceof MineAskPostState) {
            m15977Z();
            m15968Q(bubbleInfo);
        } else if (m15956I(bubbleInfo)) {
            m15976Y();
            m15966O(bubbleInfo);
        } else {
            lsi0.j("状态已结束");
            m15971T();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m15966O(BubbleInfo bubbleInfo) {
        zvf0.u("e_other_state_avartar", m15957K(), new j760[]{vwb.Y("state_id", bubbleInfo.f191id), vwb.Y("owner_id", bubbleInfo.owner.f264id)});
    }

    /* JADX INFO: renamed from: P */
    public void m15967P(BubbleInfo bubbleInfo, boolean z) {
        if (z) {
            zvf0.A("e_set_my_state", m15957K(), new j760[]{vwb.Y("state_id", bubbleInfo.f191id), vwb.Y("owner_id", bubbleInfo.owner.f264id), vwb.Y("source_page", m15957K())});
        } else {
            zvf0.A("e_other_state_avartar", m15957K(), new j760[]{vwb.Y("state_id", bubbleInfo.f191id), vwb.Y("owner_id", bubbleInfo.owner.f264id)});
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m15968Q(BubbleInfo bubbleInfo) {
        zvf0.u("e_set_my_state", m15957K(), new j760[]{vwb.Y("state_id", bubbleInfo.f191id), vwb.Y("owner_id", bubbleInfo.owner.f264id), vwb.Y("source_page", m15957K())});
    }

    /* JADX INFO: renamed from: R */
    public final void m15969R(Emotion emotion) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.value = "";
        bubbleInfo.emotion = emotion;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = emotion.backgroundColor;
        textTheme.iconColor = emotion.iconColor;
        bubbleInfo.textTheme = textTheme;
        FeedModule.f317e.m10712V0(bubbleInfo, "follow_top_state");
    }

    /* JADX INFO: renamed from: S */
    public final void m15970S(int i) {
        if (i < this.f14727c.size()) {
            this.f14727c.remove(i);
            notifyItemRemoved(i);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m15971T() {
        this.f14727c.remove(0);
        this.f14727c.add(0, new MineAskPostState());
        notifyItemChanged(0);
        FeedModule.f316d.m16681lc(null);
    }

    /* JADX INFO: renamed from: U */
    public void m15972U(List<BubbleInfo> list) {
        this.f14727c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: V */
    public void m15973V(e30<Integer> e30Var) {
        this.f14729e = e30Var;
    }

    /* JADX INFO: renamed from: W */
    public void m15974W(String str) {
        this.f14730f = str;
    }

    /* JADX INFO: renamed from: X */
    public final void m15975X(int i) {
        m15978a0(1, this.f14727c.size(), i - 1, m15957K());
    }

    /* JADX INFO: renamed from: Y */
    public final void m15976Y() {
        m15978a0(0, 1, 0, m15957K());
    }

    /* JADX INFO: renamed from: Z */
    public void m15977Z() {
        s1i.m13982f(this.f14728d, m15957K());
    }

    /* JADX INFO: renamed from: a0 */
    public void m15978a0(int i, int i2, int i3, String str) {
        Act act = this.f14728d;
        act.startActivity(FeedStatusPageAct.m6688q2(act, this.f14727c.subList(i, i2), i3, this.f14730f, str));
    }

    @CallSuper
    /* JADX INFO: renamed from: e */
    public void m15979e(int i) {
        e30<Integer> e30Var = this.f14729e;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(i));
        }
    }

    public int getItemViewType(int i) {
        return this.f14727c.get(i).isPostSelectBubble ? 1 : 0;
    }

    public void onViewAttachedToWindow(@NonNull @NotNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f14732h.m11597o();
    }

    public void onViewDetachedFromWindow(@NonNull @NotNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f14732h.m11597o();
    }
}
