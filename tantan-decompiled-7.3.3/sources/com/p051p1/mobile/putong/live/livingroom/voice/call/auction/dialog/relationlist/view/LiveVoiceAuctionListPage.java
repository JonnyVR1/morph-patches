package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionQueuePageBindings;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
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
import p153l.bnl0;
import p153l.bpm0;
import p153l.d3q;
import p153l.dpm0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionQueuePageBindings;", "Ll/bpm0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "j0", "r", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Ll/d3q;", "data", "k0", "(Ljava/lang/String;Ljava/util/List;)V", "", "showEmpty", "l0", "(Ljava/lang/String;Z)V", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "h", "Lkotlin/Lazy;", "getListAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "listAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveVoiceAuctionListPage extends LiveVoiceAuctionQueuePageBindings<bpm0<?, ?>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy listAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceAuctionListPage(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.listAdapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.g3v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVoiceAuctionListPage.m79043i0();
            }
        });
    }

    private final LiveBaseAdapter getListAdapter() {
        return (LiveBaseAdapter) this.listAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static LiveBaseAdapter m79043i0() {
        return new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79044j0() {
        ((bpm0) this.f49078d).mo99534K3();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m79045k0(@NotNull String name, @NotNull List<? extends d3q<?>> data) {
        name.getClass();
        data.getClass();
        m79046l0(name, data.isEmpty());
        getListAdapter().m68554Z(CollectionsKt.toList(data));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m79046l0(@NotNull String name, boolean showEmpty) {
        name.getClass();
        bnl0.m105525M0(this.f49080f, !showEmpty);
        bnl0.m105525M0(this.f49081g, showEmpty);
        if (showEmpty) {
            boolean zM117415a = dpm0.INSTANCE.m117415a(name);
            EmptyView emptyView = this.f49081g;
            if (zM117415a) {
                emptyView.m69900b(obc0.f146359h9);
                this.f49081g.f45502b.setText("暂时没有关系卡");
            } else {
                emptyView.f45502b.setText("暂无可以处理的队列");
                this.f49081g.m69900b(obc0.f146347g9);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionQueuePageBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = this.f49080f;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getListAdapter());
        this.f49081g.m69901c(qa00.m175859d(150.0f), qa00.m175859d(220.0f)).m69902d(n3d0.m161277a(n9c0.f140847m1));
    }

    /* JADX INFO: renamed from: r */
    public final void m79047r() {
        ((bpm0) this.f49078d).mo99534K3();
    }

    public /* synthetic */ LiveVoiceAuctionListPage(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
