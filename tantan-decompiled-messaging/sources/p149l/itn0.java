package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.smart_refresh.SmartRefreshLayout;
import p147v.smart_refresh.footer.TTRefreshFooter;
import p147v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00132\u0010\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00132\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u0018¢\u0006\u0004\b\u001e\u0010\u001cR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00101\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010L\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010H\u001a\u0004\b:\u0010I\"\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010N¨\u0006P"}, m87232d2 = {"Ll/itn0;", "", "Ll/csn0;", "presenter", "", "emptyTitle", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Ll/csn0;Ljava/lang/String;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "enable", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Z)V", Constants.INAPP_DATA_TAG, "()V", "", "Ll/d1q;", "itemModels", "k", "(Ljava/util/List;)V", Careers.f38732it, "j", "a", "Ljava/lang/String;", "getEmptyTitle", "()Ljava/lang/String;", "setEmptyTitle", "(Ljava/lang/String;)V", "b", "I", "getIndex", "()I", "setIndex", "(I)V", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "g", "()Landroid/widget/ImageView;", "set_emptyView", "(Landroid/widget/ImageView;)V", "_emptyView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "f", "()Landroid/widget/TextView;", "set_emptyTitle", "(Landroid/widget/TextView;)V", "_emptyTitle", "Lv/smart_refresh/SmartRefreshLayout;", "e", "Lv/smart_refresh/SmartRefreshLayout;", RXScreenCaptureService.KEY_INDEX, "()Lv/smart_refresh/SmartRefreshLayout;", "set_refreshLayout", "(Lv/smart_refresh/SmartRefreshLayout;)V", "_refreshLayout", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "h", "()Landroidx/recyclerview/widget/RecyclerView;", "set_list", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_list", "Landroid/view/View;", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", OMSTemplateModeType.view, "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class itn0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String emptyTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _emptyView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _emptyTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public SmartRefreshLayout _refreshLayout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public RecyclerView _list;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public View view;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter adapter;

    public itn0(@NotNull final csn0<?> csn0Var, @NotNull String str, int i) {
        csn0Var.getClass();
        str.getClass();
        this.emptyTitle = str;
        this.index = i;
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.adapter = liveBaseAdapter;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(csn0Var.act());
        layoutInflaterFrom.getClass();
        this.view = m138218c(layoutInflaterFrom, null);
        m138223h().setLayoutManager(new LinearLayoutManager(csn0Var.act(), 1, false));
        m138223h().setAdapter(liveBaseAdapter);
        SmartRefreshLayout smartRefreshLayoutM138224i = m138224i();
        smartRefreshLayoutM138224i.mo223163S(new TTRefreshHeader(csn0Var.act()));
        smartRefreshLayoutM138224i.mo223161Q(new TTRefreshFooter(csn0Var.act()));
        smartRefreshLayoutM138224i.mo223159O(new df50() { // from class: l.gtn0
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                itn0.m138216a(csn0Var, hnc0Var);
            }
        });
        smartRefreshLayoutM138224i.mo223158M(new me50() { // from class: l.htn0
            @Override // p149l.me50
            /* JADX INFO: renamed from: a */
            public final void mo77835a(hnc0 hnc0Var) {
                itn0.m138217b(csn0Var, this, hnc0Var);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m138216a(csn0 csn0Var, hnc0 hnc0Var) {
        hnc0Var.getClass();
        csn0Var.m108552H4();
    }

    /* JADX INFO: renamed from: b */
    public static void m138217b(csn0 csn0Var, itn0 itn0Var, hnc0 hnc0Var) {
        hnc0Var.getClass();
        csn0Var.m108550D4(itn0Var.index);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m138218c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM143156b = jtn0.m143156b(this, inflater, parent);
        viewM143156b.getClass();
        return viewM143156b;
    }

    /* JADX INFO: renamed from: d */
    public final void m138219d() {
        m138224i().m223770o();
        m138224i().m223775t();
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final TextView m138221f() {
        TextView textView = this._emptyTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_emptyTitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final ImageView m138222g() {
        ImageView imageView = this._emptyView;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_emptyView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final RecyclerView m138223h() {
        RecyclerView recyclerView = this._list;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SmartRefreshLayout m138224i() {
        SmartRefreshLayout smartRefreshLayout = this._refreshLayout;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        Intrinsics.m87502r("_refreshLayout");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m138225j(@NotNull List<d1q<?>> it) {
        it.getClass();
        this.adapter.m67355J().addAll(it);
        this.adapter.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: k */
    public final void m138226k(@NotNull List<d1q<?>> itemModels) {
        itemModels.getClass();
        m138221f().setText(this.emptyTitle);
        if (itemModels.isEmpty()) {
            m138222g().setVisibility(0);
            m138221f().setVisibility(0);
            m138224i().setVisibility(8);
        } else {
            m138222g().setVisibility(8);
            m138221f().setVisibility(8);
            m138224i().setVisibility(0);
        }
        this.adapter.m67371Z(itemModels);
    }

    /* JADX INFO: renamed from: l */
    public final void m138227l(boolean enable) {
        m138224i().m223755G(enable);
        m138224i().m223757I(enable);
    }
}
