package com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardFirstView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.jcr;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.osn0;
import p153l.qa00;
import p153l.usn0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\nJ5\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000eJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardFirstView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "k0", "(Ljava/lang/String;)V", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "Ll/osn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "isGroupOrHourBoard", "showMvp", "l0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;Ll/osn0;Ljava/lang/String;ZZ)V", "m0", "j0", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", "o", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", "mHourLeaderBoardItem", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceHourBoardFirstView extends LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public BLiveHourLeaderBoardItem mHourLeaderBoardItem;

    public /* synthetic */ VoiceHourBoardFirstView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m78599i0(osn0 osn0Var, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, View view) {
        osn0Var.mo78062p(bLiveVoiceHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m78600k0(String name) {
        String str;
        if (jcr.f120090a.equals(name)) {
            str = "https://fe-static.tancdn.com/v1/raw/4d8bf3ff-b877-415e-95a3-597a61e6b66313.svga";
        } else {
            str = jcr.f120091b.equals(name) ? "https://fe-static.tancdn.com/v1/raw/e70068ae-465d-4804-9641-7c968617b94b13.svga" : "https://auto.tancdn.com/v1/raw/5aa8daac-87da-4bca-9ea9-61a6985b620413.pdf";
        }
        this.f49210g.m69686m(str, -1, null, false);
    }

    /* JADX INFO: renamed from: r */
    private final void m78601r() {
        float fM105592y0 = bnl0.m105592y0() * 0.35466668f;
        float f = fM105592y0 / 0.66169155f;
        int i = (int) fM105592y0;
        bnl0.m105507D0(i, this);
        int i2 = (int) f;
        bnl0.m105505C0(this, i2);
        bnl0.m105507D0(i, this.f49210g);
        bnl0.m105505C0(this.f49210g, i2);
        bnl0.m105507D0(i, this.f49209f);
        bnl0.m105505C0(this.f49209f, i2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78602j0() {
        this.mHourLeaderBoardItem = null;
        this.f49211h.m73302i0();
        setOnClickListener(null);
        this.f49211h.getRealAvatarView().getHierarchy().m207041D(obc0.f146169R2);
        this.f49216m.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        this.f49216m.setText(zrv.f205803e.getString(R$string.f48209l6));
        this.f49217n.setText("");
        bnl0.m105524M(this.f49213j, true);
        bnl0.m105524M(this.f49215l, false);
        bnl0.m105524M(this.f49217n, false);
        bnl0.m105524M(this.f49212i, false);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m78603l0(@NotNull final BLiveVoiceHourLeaderBoardItem item, @NotNull final osn0 listener, @NotNull String name, boolean isGroupOrHourBoard, boolean showMvp) {
        item.getClass();
        listener.getClass();
        name.getClass();
        this.f49216m.setTextColor(n3d0.m161277a(n9c0.f140856p1));
        this.f49211h.getRealAvatarView().getHierarchy().m207041D(obc0.f146169R2);
        CommonMaskAvatarView commonMaskAvatarView = this.f49211h;
        commonMaskAvatarView.getClass();
        usn0.m197951f(commonMaskAvatarView, item, qa00.f156304Q);
        bnl0.m105524M(this.f49213j, !this.f49211h.m73304k0());
        if (TextUtils.isEmpty(item.mvpUser.avatar) || !showMvp) {
            bnl0.m105524M(this.f49212i, false);
        } else {
            bnl0.m105524M(this.f49212i, true);
            izs.m142868s("context_single_room", this.f49212i, item.mvpUser.avatar);
        }
        VText vText = this.f49216m;
        if (isGroupOrHourBoard) {
            vText.setText(item.room.title);
            String str = item.user.onCall ? "onlive" : "unknown_";
            this.f49215l.m69969u();
            LivingNewTagView livingNewTagView = this.f49215l;
            BLiveState bLiveState = BLiveState.get(str);
            bLiveState.getClass();
            livingNewTagView.m69968s(bLiveState);
        } else {
            vText.setText(item.user.name);
            bnl0.m105524M(this.f49215l, false);
        }
        if (jcr.f120091b.equals(name) || jcr.f120090a.equals(name)) {
            bnl0.m105524M(this.f49209f, false);
        } else {
            bnl0.m105524M(this.f49209f, true);
            this.f49209f.setBackgroundResource(obc0.f146461q3);
        }
        bnl0.m105524M(this.f49217n, true);
        this.f49217n.setText(usn0.m197948c(item.amount, name));
        setOnClickListener(new View.OnClickListener() { // from class: l.wln0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceHourBoardFirstView.m78599i0(listener, item, view);
            }
        });
        m78600k0(name);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78604m0(@NotNull String name) {
        name.getClass();
        m78602j0();
        m78600k0(name);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceHourLeaderBoardDialogMainlandHeaderFirstBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78601r();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceHourBoardFirstView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
