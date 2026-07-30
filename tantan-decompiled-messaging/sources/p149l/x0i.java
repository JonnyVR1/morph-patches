package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderItem;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderSelectItem;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.MineAskPostState;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class x0i extends dac0<BubbleInfo> {

    /* JADX INFO: renamed from: d */
    public Act f188972d;

    /* JADX INFO: renamed from: e */
    public e30<Integer> f188973e;

    /* JADX INFO: renamed from: f */
    public String f188974f;

    /* JADX INFO: renamed from: g */
    public String f188975g;

    /* JADX INFO: renamed from: c */
    public List<BubbleInfo> f188971c = new ArrayList();

    /* JADX INFO: renamed from: h */
    public l80<BubbleInfo> f188976h = new C21015a();

    /* JADX INFO: renamed from: l.x0i$a */
    public class C21015a extends l80<BubbleInfo> {
        public C21015a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo63937k(BubbleInfo bubbleInfo, int i, View view) {
            zvf0.m220368A("e_other_state_avartar", x0i.this.m206615K(), vwb.m200311Y("state_id", bubbleInfo.emotion.f38748id), vwb.m200311Y("owner_id", FeedModule.m60222H().me_().f56011id));
        }
    }

    public x0i(Act act, String str) {
        this.f188972d = act;
        this.f188975g = str;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m206614I(BubbleInfo bubbleInfo) {
        return (bubbleInfo.createdTime + 8.64E7d) - ((double) mqi0.m155944o()) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public String m206615K() {
        return vqg.m199515K(this.f188975g, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f188971c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return i == 1 ? new FeedStateHeaderSelectItem(this.f188972d) : new FeedStateHeaderItem(this.f188972d);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final BubbleInfo bubbleInfo, int i, int i2) {
        if (view instanceof FeedStateHeaderItem) {
            FeedStateHeaderItem feedStateHeaderItem = (FeedStateHeaderItem) view;
            feedStateHeaderItem.m65780u(bubbleInfo, i2);
            m206618L(i2, feedStateHeaderItem);
            m206622P(bubbleInfo, i2 == 0 && (bubbleInfo instanceof MineAskPostState));
            return;
        }
        if (view instanceof FeedStateHeaderSelectItem) {
            this.f188976h.m148839h(view, bubbleInfo, i2);
            FeedStateHeaderSelectItem feedStateHeaderSelectItem = (FeedStateHeaderSelectItem) view;
            xdl0.m208329E0(feedStateHeaderSelectItem, new View.OnClickListener() { // from class: l.v0i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f179116a.m206619M(bubbleInfo, view2);
                }
            });
            feedStateHeaderSelectItem.m65784k0(bubbleInfo);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public BubbleInfo getItem(int i) {
        return this.f188971c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public void m206618L(final int i, FeedStateHeaderItem feedStateHeaderItem) {
        final BubbleInfo bubbleInfo = this.f188971c.get(i);
        feedStateHeaderItem.setOnClickListener(new View.OnClickListener() { // from class: l.w0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183919a.m206620N(i, bubbleInfo, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m206619M(BubbleInfo bubbleInfo, View view) {
        zvf0.m220396r("e_fast_state_post", m206615K());
        m206624R(bubbleInfo.emotion);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m206620N(int i, BubbleInfo bubbleInfo, View view) {
        if (i != 0) {
            if (m206614I(bubbleInfo)) {
                m206630X(i);
                m206621O(bubbleInfo);
                return;
            } else {
                lsi0.m151580j("状态已结束");
                m206625S(i);
                return;
            }
        }
        if (bubbleInfo instanceof MineAskPostState) {
            m206632Z();
            m206623Q(bubbleInfo);
        } else if (m206614I(bubbleInfo)) {
            m206631Y();
            m206621O(bubbleInfo);
        } else {
            lsi0.m151580j("状态已结束");
            m206626T();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m206621O(BubbleInfo bubbleInfo) {
        zvf0.m220399u("e_other_state_avartar", m206615K(), vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id));
    }

    /* JADX INFO: renamed from: P */
    public void m206622P(BubbleInfo bubbleInfo, boolean z) {
        if (z) {
            zvf0.m220368A("e_set_my_state", m206615K(), vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id), vwb.m200311Y("source_page", m206615K()));
        } else {
            zvf0.m220368A("e_other_state_avartar", m206615K(), vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id));
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m206623Q(BubbleInfo bubbleInfo) {
        zvf0.m220399u("e_set_my_state", m206615K(), vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id), vwb.m200311Y("source_page", m206615K()));
    }

    /* JADX INFO: renamed from: R */
    public final void m206624R(Emotion emotion) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.value = "";
        bubbleInfo.emotion = emotion;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = emotion.backgroundColor;
        textTheme.iconColor = emotion.iconColor;
        bubbleInfo.textTheme = textTheme;
        FeedModule.f38856e.m132649V0(bubbleInfo, "follow_top_state");
    }

    /* JADX INFO: renamed from: S */
    public final void m206625S(int i) {
        if (i < this.f188971c.size()) {
            this.f188971c.remove(i);
            notifyItemRemoved(i);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m206626T() {
        this.f188971c.remove(0);
        this.f188971c.add(0, new MineAskPostState());
        notifyItemChanged(0);
        FeedModule.f38855d.m209500lc(null);
    }

    /* JADX INFO: renamed from: U */
    public void m206627U(List<BubbleInfo> list) {
        this.f188971c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: V */
    public void m206628V(e30<Integer> e30Var) {
        this.f188973e = e30Var;
    }

    /* JADX INFO: renamed from: W */
    public void m206629W(String str) {
        this.f188974f = str;
    }

    /* JADX INFO: renamed from: X */
    public final void m206630X(int i) {
        m206633a0(1, this.f188971c.size(), i - 1, m206615K());
    }

    /* JADX INFO: renamed from: Y */
    public final void m206631Y() {
        m206633a0(0, 1, 0, m206615K());
    }

    /* JADX INFO: renamed from: Z */
    public void m206632Z() {
        s1i.m181966f(this.f188972d, m206615K());
    }

    /* JADX INFO: renamed from: a0 */
    public void m206633a0(int i, int i2, int i3, String str) {
        Act act = this.f188972d;
        act.startActivity(FeedStatusPageAct.m65561q2(act, this.f188971c.subList(i, i2), i3, this.f188974f, str));
    }

    @Override // p149l.dac0
    @CallSuper
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        e30<Integer> e30Var = this.f188973e;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f188971c.get(i).isPostSelectBubble ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull @NotNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f188976h.m148842o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull @NotNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f188976h.m148842o();
    }
}
