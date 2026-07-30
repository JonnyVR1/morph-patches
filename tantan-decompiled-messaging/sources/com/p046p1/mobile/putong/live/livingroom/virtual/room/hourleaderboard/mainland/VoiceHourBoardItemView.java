package com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceHourListItemMainlandBindings;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.hxs;
import p149l.kjn0;
import p149l.qjn0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceHourListItemMainlandBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "Ll/kjn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "isGroupOrHourBoard", "showMvp", "j0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;Ll/kjn0;Ljava/lang/String;ZZ)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceHourBoardItemView extends LiveVoiceHourListItemMainlandBindings {
    public /* synthetic */ VoiceHourBoardItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m77434i0(kjn0 kjn0Var, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, View view) {
        if (kjn0Var != null) {
            kjn0Var.mo76879q(bLiveVoiceHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77435j0(@NotNull final BLiveVoiceHourLeaderBoardItem item, @Nullable final kjn0 listener, @NotNull String name, boolean isGroupOrHourBoard, boolean showMvp) {
        item.getClass();
        name.getClass();
        if (isGroupOrHourBoard) {
            this.f48375i.setText(item.room.title);
            String str = item.user.onCall ? "onlive" : "unknown_";
            this.f48374h.m68786u();
            LivingNewTagView livingNewTagView = this.f48374h;
            BLiveState bLiveState = BLiveState.get(str);
            bLiveState.getClass();
            livingNewTagView.m68785s(bLiveState);
        } else {
            xdl0.m208344M(this.f48374h, false);
            this.f48375i.setText(item.user.name);
        }
        this.f48371e.setText(qjn0.m175024e(item.rank));
        VText vText = this.f48371e;
        long j = item.rank;
        vText.setTextSize((j > 99 || j <= 0) ? 12.0f : 18.0f);
        this.f48378l.setText(qjn0.m175022c(item.amount, name));
        CommonMaskAvatarView commonMaskAvatarView = this.f48372f;
        commonMaskAvatarView.getClass();
        qjn0.m175025f(commonMaskAvatarView, item, t100.m186890d(73.0f));
        setOnClickListener(new View.OnClickListener() { // from class: l.wcn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceHourBoardItemView.m77434i0(listener, item, view);
            }
        });
        LiveGenderMedalView liveGenderMedalView = this.f48376j;
        String str2 = item.user.gender;
        str2.getClass();
        liveGenderMedalView.m74889Q(str2, (int) item.user.age, true);
        if (TextUtils.isEmpty(item.mvpUser.avatar) || !showMvp) {
            xdl0.m208344M(this.f48373g, false);
        } else {
            xdl0.m208344M(this.f48373g, true);
            hxs.m133406s("context_single_room", this.f48373g, item.mvpUser.avatar);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceHourListItemMainlandBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f48371e.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceHourBoardItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
