package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionLeaderboardTimelineItemBindings;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.mom0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListTimelineItem;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionLeaderboardTimelineItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/mom0;", Item.TYPE, "", "b", "(Ll/mom0;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveVoiceAuctionLeaderboardListTimelineItem extends LiveVoiceAuctionLeaderboardTimelineItemBindings {
    public /* synthetic */ LiveVoiceAuctionLeaderboardListTimelineItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m79025b(@NotNull mom0 item) {
        item.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(item.getItem().auctionTime * 1000);
        this.f49070b.setText(calendar.get(1) + "年");
        this.f49070b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceAuctionLeaderboardListTimelineItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
