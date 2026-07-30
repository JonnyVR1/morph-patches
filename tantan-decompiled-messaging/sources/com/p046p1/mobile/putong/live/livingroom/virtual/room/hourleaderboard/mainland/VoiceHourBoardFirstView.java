package com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardFirstView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.h1c0;
import p149l.har;
import p149l.hxs;
import p149l.i3c0;
import p149l.kjn0;
import p149l.kvc0;
import p149l.qjn0;
import p149l.t100;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\nJ5\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000eJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardFirstView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "k0", "(Ljava/lang/String;)V", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "Ll/kjn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "isGroupOrHourBoard", "showMvp", "l0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;Ll/kjn0;Ljava/lang/String;ZZ)V", "m0", "j0", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", "o", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", "mHourLeaderBoardItem", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceHourBoardFirstView extends LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public BLiveHourLeaderBoardItem mHourLeaderBoardItem;

    public /* synthetic */ VoiceHourBoardFirstView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m77416i0(kjn0 kjn0Var, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, View view) {
        kjn0Var.mo76879q(bLiveVoiceHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m77417k0(String name) {
        String str;
        if (har.f106811a.equals(name)) {
            str = "https://fe-static.tancdn.com/v1/raw/4d8bf3ff-b877-415e-95a3-597a61e6b66313.svga";
        } else {
            str = har.f106812b.equals(name) ? "https://fe-static.tancdn.com/v1/raw/e70068ae-465d-4804-9641-7c968617b94b13.svga" : "https://auto.tancdn.com/v1/raw/5aa8daac-87da-4bca-9ea9-61a6985b620413.pdf";
        }
        this.f48362g.m68503m(str, -1, null, false);
    }

    /* JADX INFO: renamed from: r */
    private final void m77418r() {
        float fM208412y0 = xdl0.m208412y0() * 0.35466668f;
        float f = fM208412y0 / 0.66169155f;
        int i = (int) fM208412y0;
        xdl0.m208327D0(i, this);
        int i2 = (int) f;
        xdl0.m208325C0(this, i2);
        xdl0.m208327D0(i, this.f48362g);
        xdl0.m208325C0(this.f48362g, i2);
        xdl0.m208327D0(i, this.f48361f);
        xdl0.m208325C0(this.f48361f, i2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77419j0() {
        this.mHourLeaderBoardItem = null;
        this.f48363h.m72119i0();
        setOnClickListener(null);
        this.f48363h.getRealAvatarView().getHierarchy().m112049D(i3c0.f110841R2);
        this.f48368m.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        this.f48368m.setText(ypv.f199497e.getString(R$string.f47361l6));
        this.f48369n.setText("");
        xdl0.m208344M(this.f48365j, true);
        xdl0.m208344M(this.f48367l, false);
        xdl0.m208344M(this.f48369n, false);
        xdl0.m208344M(this.f48364i, false);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m77420l0(@NotNull final BLiveVoiceHourLeaderBoardItem item, @NotNull final kjn0 listener, @NotNull String name, boolean isGroupOrHourBoard, boolean showMvp) {
        item.getClass();
        listener.getClass();
        name.getClass();
        this.f48368m.setTextColor(kvc0.m147352a(h1c0.f105395p1));
        this.f48363h.getRealAvatarView().getHierarchy().m112049D(i3c0.f110841R2);
        CommonMaskAvatarView commonMaskAvatarView = this.f48363h;
        commonMaskAvatarView.getClass();
        qjn0.m175025f(commonMaskAvatarView, item, t100.f167242Q);
        xdl0.m208344M(this.f48365j, !this.f48363h.m72121k0());
        if (TextUtils.isEmpty(item.mvpUser.avatar) || !showMvp) {
            xdl0.m208344M(this.f48364i, false);
        } else {
            xdl0.m208344M(this.f48364i, true);
            hxs.m133406s("context_single_room", this.f48364i, item.mvpUser.avatar);
        }
        VText vText = this.f48368m;
        if (isGroupOrHourBoard) {
            vText.setText(item.room.title);
            String str = item.user.onCall ? "onlive" : "unknown_";
            this.f48367l.m68786u();
            LivingNewTagView livingNewTagView = this.f48367l;
            BLiveState bLiveState = BLiveState.get(str);
            bLiveState.getClass();
            livingNewTagView.m68785s(bLiveState);
        } else {
            vText.setText(item.user.name);
            xdl0.m208344M(this.f48367l, false);
        }
        if (har.f106812b.equals(name) || har.f106811a.equals(name)) {
            xdl0.m208344M(this.f48361f, false);
        } else {
            xdl0.m208344M(this.f48361f, true);
            this.f48361f.setBackgroundResource(i3c0.f111133q3);
        }
        xdl0.m208344M(this.f48369n, true);
        this.f48369n.setText(qjn0.m175022c(item.amount, name));
        setOnClickListener(new View.OnClickListener() { // from class: l.scn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceHourBoardFirstView.m77416i0(listener, item, view);
            }
        });
        m77417k0(name);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m77421m0(@NotNull String name) {
        name.getClass();
        m77419j0();
        m77417k0(name);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77418r();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceHourBoardFirstView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
