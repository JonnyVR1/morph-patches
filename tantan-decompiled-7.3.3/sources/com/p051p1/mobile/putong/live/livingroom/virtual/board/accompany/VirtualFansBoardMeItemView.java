package com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualFansBoardItemMeBindings;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.n3d0;
import p153l.n9c0;
import p153l.osn0;
import p153l.qa00;
import p153l.usn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardMeItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualFansBoardItemMeBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "Ll/osn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "i0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;Ll/osn0;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VirtualFansBoardMeItemView extends LiveVirtualFansBoardItemMeBindings {
    public /* synthetic */ VirtualFansBoardMeItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78037i0(@NotNull BLiveVoiceHourLeaderBoardItem item, @NotNull osn0 listener) {
        item.getClass();
        listener.getClass();
        this.f48930g.setText(item.user.name);
        this.f48928e.setText(usn0.m197950e(item.rank));
        VText vText = this.f48928e;
        long j = item.rank;
        vText.setTextSize((j > 99 || j <= 0) ? 12.0f : 18.0f);
        this.f48932i.setText(usn0.m197949d(item.amount));
        CommonMaskAvatarView commonMaskAvatarView = this.f48929f;
        commonMaskAvatarView.getClass();
        usn0.m197951f(commonMaskAvatarView, item, qa00.m175859d(73.0f));
        LiveGenderMedalView liveGenderMedalView = this.f48931h;
        String str = item.user.gender;
        str.getClass();
        liveGenderMedalView.m76072Q(str, (int) item.user.age, true);
        this.f48932i.setTextColor(n3d0.m161277a(item.amount <= 0 ? n9c0.f140847m1 : n9c0.f140855p0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualFansBoardMeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
