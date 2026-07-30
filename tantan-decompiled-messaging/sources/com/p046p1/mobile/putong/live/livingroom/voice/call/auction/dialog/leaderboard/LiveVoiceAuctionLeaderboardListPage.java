package com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionLeaderboardItem;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionLeaderboardPageBindings;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListPage;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VLinear;
import p147v.VText;
import p147v.smart_refresh.footer.TTRefreshFooter;
import p147v.smart_refresh.header.TTRefreshHeader;
import p149l.d1q;
import p149l.ef50;
import p149l.h1c0;
import p149l.hnc0;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.r610;
import p149l.rfm0;
import p149l.t100;
import p149l.uep0;
import p149l.x8u;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012¢\u0006\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionLeaderboardPageBindings;", "Ll/rfm0;", "Ll/ef50;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "r", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", RequestParameters.SUBRESOURCE_APPEND, "", "Ll/d1q;", "data", "l0", "(Ljava/lang/String;ZLjava/util/List;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;", Item.TYPE, "n0", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;)V", "showEmpty", "m0", "(Ljava/lang/String;Z)V", "k0", "noMoreData", "j0", "(Z)V", "Ll/hnc0;", "refreshLayout", "w2", "(Ll/hnc0;)V", "a", "getData", "()Ljava/util/List;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "p", "Lkotlin/Lazy;", "getListAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "listAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveVoiceAuctionLeaderboardListPage extends LiveVoiceAuctionLeaderboardPageBindings<rfm0<?, ?>> implements ef50 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy listAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceAuctionLeaderboardListPage(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.listAdapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.e1v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVoiceAuctionLeaderboardListPage.m77834i0();
            }
        });
    }

    private final LiveBaseAdapter getListAdapter() {
        return (LiveBaseAdapter) this.listAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static LiveBaseAdapter m77834i0() {
        return new LiveBaseAdapter();
    }

    @Override // p149l.me50
    /* JADX INFO: renamed from: a */
    public void mo77835a(@NotNull hnc0 refreshLayout) {
        refreshLayout.getClass();
        ((rfm0) this.f48209d).mo179135L3(getListAdapter().m67355J().size());
    }

    @NotNull
    public final List<d1q<?>> getData() {
        List<d1q<?>> listM67355J = getListAdapter().m67355J();
        listM67355J.getClass();
        return listM67355J;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77836j0(boolean noMoreData) {
        this.f48211f.m223770o();
        if (noMoreData) {
            this.f48211f.m223755G(false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m77837k0() {
        this.f48211f.m223775t();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m77838l0(@NotNull String name, boolean append, @NotNull List<? extends d1q<?>> data) {
        name.getClass();
        data.getClass();
        if (append) {
            int size = getListAdapter().m67355J().size();
            getListAdapter().m67355J().addAll(data);
            getListAdapter().notifyItemRangeChanged(size, data.size());
        } else {
            getListAdapter().m67371Z(CollectionsKt.toList(data));
            getListAdapter().notifyDataSetChanged();
            m77839m0(name, getListAdapter().m67355J().isEmpty());
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m77839m0(@NotNull String name, boolean showEmpty) {
        name.getClass();
        xdl0.m208344M(this.f48211f, !showEmpty);
        xdl0.m208344M(this.f48213h, showEmpty);
        if (showEmpty) {
            this.f48213h.f44654b.setText("暂无数据");
            this.f48213h.m68717b(i3c0.f111019g9);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m77840n0(@Nullable BLiveAuctionLeaderboardItem item) {
        VLinear vLinear = this.f48214i;
        if (item == null) {
            xdl0.m208344M(vLinear, false);
            this.f48211f.setClipToPadding(true);
            this.f48211f.setPadding(0, 0, 0, 0);
            return;
        }
        xdl0.m208344M(vLinear, true);
        int i = item.rank;
        if (i > 99 || i == -1) {
            this.f48215j.setTextSize(14.0f);
            this.f48215j.setText("99+");
        } else {
            this.f48215j.setText(String.valueOf(i));
        }
        VText vText = this.f48218m;
        String str = item.userInfo.userName;
        str.getClass();
        String strM178016w = r610.m178016w(str, 4);
        String str2 = item.otherUserInfo.userName;
        str2.getClass();
        vText.setText(strM178016w + " 拍下 " + r610.m178016w(str2, 4));
        this.f48219n.setText(item.relationDetail.name);
        if (!TextUtils.isEmpty(item.relationDetail.startBgColor) && !TextUtils.isEmpty(item.relationDetail.endBgColor)) {
            this.f48219n.setBackground(yb2.m213886k(uep0.m193307B(item.relationDetail.startBgColor), uep0.m193307B(item.relationDetail.endBgColor), 4, GradientDrawable.Orientation.TOP_BOTTOM));
        }
        VText vText2 = this.f48220o;
        int i2 = item.worth;
        vText2.setText(i2 == 0 ? "0" : x8u.m207433c(i2));
        hxs.m133406s("context_single_room", this.f48216k, item.userInfo.avatar);
        hxs.m133406s("context_single_room", this.f48217l, item.otherUserInfo.avatar);
        this.f48211f.setClipToPadding(false);
        this.f48211f.setPadding(0, 0, 0, t100.f167236K);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionLeaderboardPageBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f48211f.m223757I(false);
        this.f48211f.m223754F(false);
        this.f48211f.m223755G(true);
        this.f48211f.mo223163S(new TTRefreshHeader(getContext()));
        this.f48211f.mo223161Q(new TTRefreshFooter(getContext()));
        this.f48211f.mo223160P(this);
        RecyclerView recyclerView = this.f48212g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getListAdapter());
        this.f48213h.m68718c(t100.m186890d(150.0f), t100.m186890d(220.0f)).m68719d(kvc0.m147352a(h1c0.f105386m1));
        this.f48215j.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: r */
    public final void m77841r() {
        ((rfm0) this.f48209d).mo179136c();
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NotNull hnc0 refreshLayout) {
        refreshLayout.getClass();
        ((rfm0) this.f48209d).mo179136c();
    }

    public /* synthetic */ LiveVoiceAuctionLeaderboardListPage(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
