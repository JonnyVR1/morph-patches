package com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceHourListItemMainlandBindings;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.osn0;
import p153l.qa00;
import p153l.usn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceHourListItemMainlandBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "Ll/osn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "isGroupOrHourBoard", "showMvp", "j0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;Ll/osn0;Ljava/lang/String;ZZ)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceHourBoardItemView extends LiveVoiceHourListItemMainlandBindings {
    public /* synthetic */ VoiceHourBoardItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m78617i0(osn0 osn0Var, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, View view) {
        if (osn0Var != null) {
            osn0Var.mo78062p(bLiveVoiceHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78618j0(@NotNull final BLiveVoiceHourLeaderBoardItem item, @Nullable final osn0 listener, @NotNull String name, boolean isGroupOrHourBoard, boolean showMvp) {
        item.getClass();
        name.getClass();
        if (isGroupOrHourBoard) {
            this.f49223i.setText(item.room.title);
            String str = item.user.onCall ? "onlive" : "unknown_";
            this.f49222h.m69969u();
            LivingNewTagView livingNewTagView = this.f49222h;
            BLiveState bLiveState = BLiveState.get(str);
            bLiveState.getClass();
            livingNewTagView.m69968s(bLiveState);
        } else {
            bnl0.m105524M(this.f49222h, false);
            this.f49223i.setText(item.user.name);
        }
        this.f49219e.setText(usn0.m197950e(item.rank));
        VText vText = this.f49219e;
        long j = item.rank;
        vText.setTextSize((j > 99 || j <= 0) ? 12.0f : 18.0f);
        this.f49226l.setText(usn0.m197948c(item.amount, name));
        CommonMaskAvatarView commonMaskAvatarView = this.f49220f;
        commonMaskAvatarView.getClass();
        usn0.m197951f(commonMaskAvatarView, item, qa00.m175859d(73.0f));
        setOnClickListener(new View.OnClickListener() { // from class: l.amn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceHourBoardItemView.m78617i0(listener, item, view);
            }
        });
        LiveGenderMedalView liveGenderMedalView = this.f49224j;
        String str2 = item.user.gender;
        str2.getClass();
        liveGenderMedalView.m76072Q(str2, (int) item.user.age, true);
        if (TextUtils.isEmpty(item.mvpUser.avatar) || !showMvp) {
            bnl0.m105524M(this.f49221g, false);
        } else {
            bnl0.m105524M(this.f49221g, true);
            izs.m142868s("context_single_room", this.f49221g, item.mvpUser.avatar);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceHourListItemMainlandBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f49219e.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceHourBoardItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
