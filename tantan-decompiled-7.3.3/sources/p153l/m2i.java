package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.TextTheme;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderItem;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderSelectItem;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.MineAskPostState;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class m2i extends jic0<BubbleInfo> {

    /* JADX INFO: renamed from: d */
    public Act f134579d;

    /* JADX INFO: renamed from: e */
    public y20<Integer> f134580e;

    /* JADX INFO: renamed from: f */
    public String f134581f;

    /* JADX INFO: renamed from: g */
    public String f134582g;

    /* JADX INFO: renamed from: c */
    public List<BubbleInfo> f134578c = new ArrayList();

    /* JADX INFO: renamed from: h */
    public h80<BubbleInfo> f134583h = new C18531a();

    /* JADX INFO: renamed from: l.m2i$a */
    public class C18531a extends h80<BubbleInfo> {
        public C18531a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo65120k(BubbleInfo bubbleInfo, int i, View view) {
            i4g0.m138492A("e_other_state_avartar", m2i.this.m156842K(), jyb.m147494Y("state_id", bubbleInfo.emotion.f39596id), jyb.m147494Y("owner_id", FeedModule.m61406H().me_().f56859id));
        }
    }

    public m2i(Act act, String str) {
        this.f134579d = act;
        this.f134582g = str;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m156841I(BubbleInfo bubbleInfo) {
        return (bubbleInfo.createdTime + 8.64E7d) - ((double) pzi0.m174454o()) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public String m156842K() {
        return ksg.m151174K(this.f134582g, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f134578c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return i == 1 ? new FeedStateHeaderSelectItem(this.f134579d) : new FeedStateHeaderItem(this.f134579d);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final BubbleInfo bubbleInfo, int i, int i2) {
        if (view instanceof FeedStateHeaderItem) {
            FeedStateHeaderItem feedStateHeaderItem = (FeedStateHeaderItem) view;
            feedStateHeaderItem.m66963u(bubbleInfo, i2);
            m156845L(i2, feedStateHeaderItem);
            m156849P(bubbleInfo, i2 == 0 && (bubbleInfo instanceof MineAskPostState));
            return;
        }
        if (view instanceof FeedStateHeaderSelectItem) {
            this.f134583h.m133881h(view, bubbleInfo, i2);
            FeedStateHeaderSelectItem feedStateHeaderSelectItem = (FeedStateHeaderSelectItem) view;
            bnl0.m105509E0(feedStateHeaderSelectItem, new View.OnClickListener() { // from class: l.k2i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f123602a.m156846M(bubbleInfo, view2);
                }
            });
            feedStateHeaderSelectItem.m66967k0(bubbleInfo);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public BubbleInfo getItem(int i) {
        return this.f134578c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public void m156845L(final int i, FeedStateHeaderItem feedStateHeaderItem) {
        final BubbleInfo bubbleInfo = this.f134578c.get(i);
        feedStateHeaderItem.setOnClickListener(new View.OnClickListener() { // from class: l.l2i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129770a.m156847N(i, bubbleInfo, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m156846M(BubbleInfo bubbleInfo, View view) {
        i4g0.m138520r("e_fast_state_post", m156842K());
        m156851R(bubbleInfo.emotion);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m156847N(int i, BubbleInfo bubbleInfo, View view) {
        if (i != 0) {
            if (m156841I(bubbleInfo)) {
                m156857X(i);
                m156848O(bubbleInfo);
                return;
            } else {
                o1j0.m165636j("状态已结束");
                m156852S(i);
                return;
            }
        }
        if (bubbleInfo instanceof MineAskPostState) {
            m156859Z();
            m156850Q(bubbleInfo);
        } else if (m156841I(bubbleInfo)) {
            m156858Y();
            m156848O(bubbleInfo);
        } else {
            o1j0.m165636j("状态已结束");
            m156853T();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m156848O(BubbleInfo bubbleInfo) {
        i4g0.m138523u("e_other_state_avartar", m156842K(), jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id));
    }

    /* JADX INFO: renamed from: P */
    public void m156849P(BubbleInfo bubbleInfo, boolean z) {
        if (z) {
            i4g0.m138492A("e_set_my_state", m156842K(), jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id), jyb.m147494Y("source_page", m156842K()));
        } else {
            i4g0.m138492A("e_other_state_avartar", m156842K(), jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id));
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m156850Q(BubbleInfo bubbleInfo) {
        i4g0.m138523u("e_set_my_state", m156842K(), jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id), jyb.m147494Y("source_page", m156842K()));
    }

    /* JADX INFO: renamed from: R */
    public final void m156851R(Emotion emotion) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.value = "";
        bubbleInfo.emotion = emotion;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = emotion.backgroundColor;
        textTheme.iconColor = emotion.iconColor;
        bubbleInfo.textTheme = textTheme;
        FeedModule.f39704e.m159782V0(bubbleInfo, "follow_top_state");
    }

    /* JADX INFO: renamed from: S */
    public final void m156852S(int i) {
        if (i < this.f134578c.size()) {
            this.f134578c.remove(i);
            notifyItemRemoved(i);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m156853T() {
        this.f134578c.remove(0);
        this.f134578c.add(0, new MineAskPostState());
        notifyItemChanged(0);
        FeedModule.f39703d.m145741lc(null);
    }

    /* JADX INFO: renamed from: U */
    public void m156854U(List<BubbleInfo> list) {
        this.f134578c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: V */
    public void m156855V(y20<Integer> y20Var) {
        this.f134580e = y20Var;
    }

    /* JADX INFO: renamed from: W */
    public void m156856W(String str) {
        this.f134581f = str;
    }

    /* JADX INFO: renamed from: X */
    public final void m156857X(int i) {
        m156860a0(1, this.f134578c.size(), i - 1, m156842K());
    }

    /* JADX INFO: renamed from: Y */
    public final void m156858Y() {
        m156860a0(0, 1, 0, m156842K());
    }

    /* JADX INFO: renamed from: Z */
    public void m156859Z() {
        h3i.m133488f(this.f134579d, m156842K());
    }

    /* JADX INFO: renamed from: a0 */
    public void m156860a0(int i, int i2, int i3, String str) {
        Act act = this.f134579d;
        act.startActivity(FeedStatusPageAct.m66746r2(act, this.f134578c.subList(i, i2), i3, this.f134581f, str));
    }

    @Override // p153l.jic0
    @CallSuper
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        y20<Integer> y20Var = this.f134580e;
        if (y20Var != null) {
            y20Var.call(Integer.valueOf(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f134578c.get(i).isPostSelectBubble ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull @NotNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f134583h.m133884o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull @NotNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f134583h.m133884o();
    }
}
