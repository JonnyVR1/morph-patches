package com.p046p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserLeaderBoard;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceVirtualUserLeaderBoardContentViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.kjn0;
import p149l.t100;
import p149l.uyo0;
import p149l.xdl0;
import p149l.ycn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/call/userleaderboard/page/VoiceUserLeaderBoardPage;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceVirtualUserLeaderBoardContentViewBindings;", "Ll/uyo0;", "Ll/kjn0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", "leaderboards", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/util/List;)V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "userLeaderBoard", "j0", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;)V", "l0", "()V", "hourLeaderBoardItem", "q", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;)V", "leaderBoard", "k0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;)V", "Ll/ycn0;", "h", "Lkotlin/Lazy;", "getBoardAdapter", "()Ll/ycn0;", "boardAdapter", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserLeaderBoard;", "Landroid/animation/Animator;", "j", "Landroid/animation/Animator;", "bgAnim", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceUserLeaderBoardPage extends LiveVoiceVirtualUserLeaderBoardContentViewBindings<uyo0> implements kjn0 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy boardAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public BLiveVoiceUserLeaderBoard leaderBoard;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Animator bgAnim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceUserLeaderBoardPage(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.boardAdapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.tyo0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceUserLeaderBoardPage.m76874i0(context, this);
            }
        });
    }

    private final ycn0 getBoardAdapter() {
        return (ycn0) this.boardAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static ycn0 m76874i0(Context context, VoiceUserLeaderBoardPage voiceUserLeaderBoardPage) {
        return new ycn0(context, voiceUserLeaderBoardPage, ((uyo0) voiceUserLeaderBoardPage.f48394d).getName(), "");
    }

    /* JADX INFO: renamed from: l */
    private final void m76875l(List<? extends BLiveVoiceHourLeaderBoardItem> leaderboards) {
        xdl0.m208344M(this.f48397g, leaderboards.isEmpty());
        xdl0.m208344M(this.f48396f, true);
        getBoardAdapter().m214171N(leaderboards);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m76876j0(@NotNull String name, @NotNull BLiveVoiceUserLeaderBoard userLeaderBoard) {
        name.getClass();
        userLeaderBoard.getClass();
        this.f48396f.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f48396f.setAdapter(getBoardAdapter());
        m76877k0(userLeaderBoard);
        xdl0.m208357U(this.f48396f, t100.m186890d(0.0f));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m76877k0(BLiveVoiceUserLeaderBoard leaderBoard) {
        this.leaderBoard = leaderBoard;
        List<BLiveVoiceHourLeaderBoardItem> list = leaderBoard.leaderboards;
        list.getClass();
        m76875l(list);
    }

    /* JADX INFO: renamed from: l0 */
    public void m76878l0() {
        getBoardAdapter().m214168G();
        this.leaderBoard = null;
        Animator animator = this.bgAnim;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.bgAnim;
        if (animator2 != null) {
            animator2.end();
        }
    }

    @Override // p149l.kjn0
    /* JADX INFO: renamed from: q */
    public void mo76879q(@NotNull BLiveVoiceHourLeaderBoardItem hourLeaderBoardItem) {
        hourLeaderBoardItem.getClass();
    }

    public /* synthetic */ VoiceUserLeaderBoardPage(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
