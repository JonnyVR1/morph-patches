package com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardSecondOrThirdView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.ap0;
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
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ=\u0010\u0017\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\nJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u001d¨\u0006 "}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardSecondOrThirdView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "", FirebaseAnalytics.Param.INDEX, "Ll/kjn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "isGroupOrHourBoard", "showMvp", "m0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;ILl/kjn0;Ljava/lang/String;ZZ)V", "svgaUrl", "k0", "(Ljava/lang/String;)V", "n0", "(I)V", "j0", "l0", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceHourBoardSecondOrThirdView extends LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardSecondOrThirdView$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardSecondOrThirdView$a", "Ll/ap0;", "", "b", "()V", "g", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12983a extends ap0 {
        public C12983a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            xdl0.m208345M0(VoiceHourBoardSecondOrThirdView.this.f48351g, false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            xdl0.m208345M0(VoiceHourBoardSecondOrThirdView.this.f48351g, true);
        }
    }

    public /* synthetic */ VoiceHourBoardSecondOrThirdView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m77436i0(kjn0 kjn0Var, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, View view) {
        kjn0Var.mo76879q(bLiveVoiceHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: r */
    private final void m77437r() {
        float fM208412y0 = xdl0.m208412y0() * 0.26933333f;
        float f = fM208412y0 / 0.58381504f;
        int i = (int) fM208412y0;
        xdl0.m208327D0(i, this);
        int i2 = (int) f;
        xdl0.m208325C0(this, i2);
        xdl0.m208327D0(i, this.f48351g);
        xdl0.m208325C0(this.f48351g, i2);
        xdl0.m208327D0(i, this.f48350f);
        xdl0.m208325C0(this.f48350f, i2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77438j0() {
        this.f48352h.m72119i0();
        this.f48352h.getRealAvatarView().getHierarchy().m112049D(i3c0.f110841R2);
        this.f48357m.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        this.f48357m.setText(ypv.f199497e.getString(R$string.f47361l6));
        this.f48358n.setText("");
        setOnClickListener(null);
        xdl0.m208344M(this.f48356l, false);
        xdl0.m208344M(this.f48354j, true);
        this.f48351g.stepToFrame(0.0f, false);
        this.f48351g.setAnimListener(null);
        xdl0.m208345M0(this.f48351g, false);
        xdl0.m208344M(this.f48358n, false);
        xdl0.m208344M(this.f48353i, false);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m77439k0(@NotNull String svgaUrl) {
        svgaUrl.getClass();
        xdl0.m208345M0(this.f48351g, true);
        this.f48351g.clearDynamicData();
        this.f48351g.m68504n();
        this.f48351g.mo68502l(svgaUrl, 1, new C12983a());
    }

    /* JADX INFO: renamed from: l0 */
    public final void m77440l0(int index) {
        if (index == 1) {
            this.f48354j.setImageResource(i3c0.f111181u3);
            this.f48350f.setBackgroundResource(i3c0.f111145r3);
        } else {
            if (index != 2) {
                return;
            }
            this.f48354j.setImageResource(i3c0.f111193v3);
            this.f48350f.setBackgroundResource(i3c0.f111157s3);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m77441m0(@NotNull final BLiveVoiceHourLeaderBoardItem item, int index, @NotNull final kjn0 listener, @NotNull String name, boolean isGroupOrHourBoard, boolean showMvp) {
        item.getClass();
        listener.getClass();
        name.getClass();
        xdl0.m208345M0(this.f48352h, true);
        this.f48352h.getRealAvatarView().getHierarchy().m112049D(i3c0.f110841R2);
        CommonMaskAvatarView commonMaskAvatarView = this.f48352h;
        commonMaskAvatarView.getClass();
        qjn0.m175025f(commonMaskAvatarView, item, t100.m186890d(73.0f));
        xdl0.m208344M(this.f48354j, !this.f48352h.m72121k0());
        VText vText = this.f48357m;
        if (isGroupOrHourBoard) {
            vText.setText(item.room.title);
            String str = item.user.onCall ? "onlive" : "unknown_";
            this.f48356l.m68786u();
            LivingNewTagView livingNewTagView = this.f48356l;
            BLiveState bLiveState = BLiveState.get(str);
            bLiveState.getClass();
            livingNewTagView.m68785s(bLiveState);
        } else {
            vText.setText(item.user.name);
            xdl0.m208344M(this.f48356l, false);
        }
        if (!har.f106811a.equals(name) && !har.f106812b.equals(name)) {
            m77440l0(index);
        }
        xdl0.m208344M(this.f48358n, true);
        this.f48358n.setText(qjn0.m175022c(item.amount, name));
        setOnClickListener(new View.OnClickListener() { // from class: l.zcn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceHourBoardSecondOrThirdView.m77436i0(listener, item, view);
            }
        });
        if (TextUtils.isEmpty(item.mvpUser.avatar) || !showMvp) {
            xdl0.m208344M(this.f48353i, false);
        } else {
            xdl0.m208344M(this.f48353i, true);
            hxs.m133406s("context_single_room", this.f48353i, item.mvpUser.avatar);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m77442n0(int index) {
        m77438j0();
        m77440l0(index);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77437r();
        this.f48351g.setAlpha(0.8f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceHourBoardSecondOrThirdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
