package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionLeaderboardItem;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionLeaderboardPageBindings;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListPage;
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
import p151v.VLinear;
import p151v.VText;
import p151v.smart_refresh.footer.TTRefreshFooter;
import p151v.smart_refresh.header.TTRefreshHeader;
import p153l.bf10;
import p153l.bnl0;
import p153l.d3q;
import p153l.fc2;
import p153l.izs;
import p153l.kn50;
import p153l.mvc0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.vom0;
import p153l.yau;
import p153l.ynp0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012¢\u0006\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionLeaderboardPageBindings;", "Ll/vom0;", "Ll/kn50;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "r", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", RequestParameters.SUBRESOURCE_APPEND, "", "Ll/d3q;", "data", "l0", "(Ljava/lang/String;ZLjava/util/List;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;", Item.TYPE, "n0", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeaderboardItem;)V", "showEmpty", "m0", "(Ljava/lang/String;Z)V", "k0", "noMoreData", "j0", "(Z)V", "Ll/mvc0;", "refreshLayout", "w2", "(Ll/mvc0;)V", "a", "getData", "()Ljava/util/List;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "p", "Lkotlin/Lazy;", "getListAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "listAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveVoiceAuctionLeaderboardListPage extends LiveVoiceAuctionLeaderboardPageBindings<vom0<?, ?>> implements kn50 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy listAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceAuctionLeaderboardListPage(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.listAdapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.f3v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVoiceAuctionLeaderboardListPage.m79017i0();
            }
        });
    }

    private final LiveBaseAdapter getListAdapter() {
        return (LiveBaseAdapter) this.listAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static LiveBaseAdapter m79017i0() {
        return new LiveBaseAdapter();
    }

    @Override // p153l.tm50
    /* JADX INFO: renamed from: a */
    public void mo79018a(@NotNull mvc0 refreshLayout) {
        refreshLayout.getClass();
        ((vom0) this.f49057d).mo99327L3(getListAdapter().m68538J().size());
    }

    @NotNull
    public final List<d3q<?>> getData() {
        List<d3q<?>> listM68538J = getListAdapter().m68538J();
        listM68538J.getClass();
        return listM68538J;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79019j0(boolean noMoreData) {
        this.f49059f.m225016o();
        if (noMoreData) {
            this.f49059f.m225001G(false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m79020k0() {
        this.f49059f.m225021t();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m79021l0(@NotNull String name, boolean append, @NotNull List<? extends d3q<?>> data) {
        name.getClass();
        data.getClass();
        if (append) {
            int size = getListAdapter().m68538J().size();
            getListAdapter().m68538J().addAll(data);
            getListAdapter().notifyItemRangeChanged(size, data.size());
        } else {
            getListAdapter().m68554Z(CollectionsKt.toList(data));
            getListAdapter().notifyDataSetChanged();
            m79022m0(name, getListAdapter().m68538J().isEmpty());
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m79022m0(@NotNull String name, boolean showEmpty) {
        name.getClass();
        bnl0.m105524M(this.f49059f, !showEmpty);
        bnl0.m105524M(this.f49061h, showEmpty);
        if (showEmpty) {
            this.f49061h.f45502b.setText("暂无数据");
            this.f49061h.m69900b(obc0.f146347g9);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m79023n0(@Nullable BLiveAuctionLeaderboardItem item) {
        VLinear vLinear = this.f49062i;
        if (item == null) {
            bnl0.m105524M(vLinear, false);
            this.f49059f.setClipToPadding(true);
            this.f49059f.setPadding(0, 0, 0, 0);
            return;
        }
        bnl0.m105524M(vLinear, true);
        int i = item.rank;
        if (i > 99 || i == -1) {
            this.f49063j.setTextSize(14.0f);
            this.f49063j.setText("99+");
        } else {
            this.f49063j.setText(String.valueOf(i));
        }
        VText vText = this.f49066m;
        String str = item.userInfo.userName;
        str.getClass();
        String strM103845w = bf10.m103845w(str, 4);
        String str2 = item.otherUserInfo.userName;
        str2.getClass();
        vText.setText(strM103845w + " 拍下 " + bf10.m103845w(str2, 4));
        this.f49067n.setText(item.relationDetail.name);
        if (!TextUtils.isEmpty(item.relationDetail.startBgColor) && !TextUtils.isEmpty(item.relationDetail.endBgColor)) {
            this.f49067n.setBackground(fc2.m124981k(ynp0.m216917B(item.relationDetail.startBgColor), ynp0.m216917B(item.relationDetail.endBgColor), 4, GradientDrawable.Orientation.TOP_BOTTOM));
        }
        VText vText2 = this.f49068o;
        int i2 = item.worth;
        vText2.setText(i2 == 0 ? "0" : yau.m214935c(i2));
        izs.m142868s("context_single_room", this.f49064k, item.userInfo.avatar);
        izs.m142868s("context_single_room", this.f49065l, item.otherUserInfo.avatar);
        this.f49059f.setClipToPadding(false);
        this.f49059f.setPadding(0, 0, 0, qa00.f156298K);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionLeaderboardPageBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f49059f.m225003I(false);
        this.f49059f.m225000F(false);
        this.f49059f.m225001G(true);
        this.f49059f.mo224409S(new TTRefreshHeader(getContext()));
        this.f49059f.mo224407Q(new TTRefreshFooter(getContext()));
        this.f49059f.mo224406P(this);
        RecyclerView recyclerView = this.f49060g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getListAdapter());
        this.f49061h.m69901c(qa00.m175859d(150.0f), qa00.m175859d(220.0f)).m69902d(n3d0.m161277a(n9c0.f140847m1));
        this.f49063j.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: r */
    public final void m79024r() {
        ((vom0) this.f49057d).mo99329c();
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NotNull mvc0 refreshLayout) {
        refreshLayout.getClass();
        ((vom0) this.f49057d).mo99329c();
    }

    public /* synthetic */ LiveVoiceAuctionLeaderboardListPage(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
