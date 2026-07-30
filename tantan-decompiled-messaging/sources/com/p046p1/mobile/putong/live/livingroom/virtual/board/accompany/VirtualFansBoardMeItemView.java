package com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualFansBoardItemMeBindings;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.h1c0;
import p149l.kjn0;
import p149l.kvc0;
import p149l.qjn0;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardMeItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualFansBoardItemMeBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "Ll/kjn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "i0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;Ll/kjn0;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VirtualFansBoardMeItemView extends LiveVirtualFansBoardItemMeBindings {
    public /* synthetic */ VirtualFansBoardMeItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76854i0(@NotNull BLiveVoiceHourLeaderBoardItem item, @NotNull kjn0 listener) {
        item.getClass();
        listener.getClass();
        this.f48082g.setText(item.user.name);
        this.f48080e.setText(qjn0.m175024e(item.rank));
        VText vText = this.f48080e;
        long j = item.rank;
        vText.setTextSize((j > 99 || j <= 0) ? 12.0f : 18.0f);
        this.f48084i.setText(qjn0.m175023d(item.amount));
        CommonMaskAvatarView commonMaskAvatarView = this.f48081f;
        commonMaskAvatarView.getClass();
        qjn0.m175025f(commonMaskAvatarView, item, t100.m186890d(73.0f));
        LiveGenderMedalView liveGenderMedalView = this.f48083h;
        String str = item.user.gender;
        str.getClass();
        liveGenderMedalView.m74889Q(str, (int) item.user.age, true);
        this.f48084i.setTextColor(kvc0.m147352a(item.amount <= 0 ? h1c0.f105386m1 : h1c0.f105394p0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualFansBoardMeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
