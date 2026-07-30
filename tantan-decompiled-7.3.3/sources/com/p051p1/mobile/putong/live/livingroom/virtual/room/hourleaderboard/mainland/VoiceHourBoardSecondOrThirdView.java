package com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardSecondOrThirdView;
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
import p153l.wo0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ=\u0010\u0017\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\nJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u001d¨\u0006 "}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardSecondOrThirdView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "", FirebaseAnalytics.Param.INDEX, "Ll/osn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "isGroupOrHourBoard", "showMvp", "m0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;ILl/osn0;Ljava/lang/String;ZZ)V", "svgaUrl", "k0", "(Ljava/lang/String;)V", "n0", "(I)V", "j0", "l0", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceHourBoardSecondOrThirdView extends LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardSecondOrThirdView$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/hourleaderboard/mainland/VoiceHourBoardSecondOrThirdView$a", "Ll/wo0;", "", "b", "()V", "g", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13146a extends wo0 {
        public C13146a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            bnl0.m105525M0(VoiceHourBoardSecondOrThirdView.this.f49199g, false);
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            bnl0.m105525M0(VoiceHourBoardSecondOrThirdView.this.f49199g, true);
        }
    }

    public /* synthetic */ VoiceHourBoardSecondOrThirdView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m78619i0(osn0 osn0Var, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, View view) {
        osn0Var.mo78062p(bLiveVoiceHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: r */
    private final void m78620r() {
        float fM105592y0 = bnl0.m105592y0() * 0.26933333f;
        float f = fM105592y0 / 0.58381504f;
        int i = (int) fM105592y0;
        bnl0.m105507D0(i, this);
        int i2 = (int) f;
        bnl0.m105505C0(this, i2);
        bnl0.m105507D0(i, this.f49199g);
        bnl0.m105505C0(this.f49199g, i2);
        bnl0.m105507D0(i, this.f49198f);
        bnl0.m105505C0(this.f49198f, i2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78621j0() {
        this.f49200h.m73302i0();
        this.f49200h.getRealAvatarView().getHierarchy().m207041D(obc0.f146169R2);
        this.f49205m.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        this.f49205m.setText(zrv.f205803e.getString(R$string.f48209l6));
        this.f49206n.setText("");
        setOnClickListener(null);
        bnl0.m105524M(this.f49204l, false);
        bnl0.m105524M(this.f49202j, true);
        this.f49199g.stepToFrame(0.0f, false);
        this.f49199g.setAnimListener(null);
        bnl0.m105525M0(this.f49199g, false);
        bnl0.m105524M(this.f49206n, false);
        bnl0.m105524M(this.f49201i, false);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m78622k0(@NotNull String svgaUrl) {
        svgaUrl.getClass();
        bnl0.m105525M0(this.f49199g, true);
        this.f49199g.clearDynamicData();
        this.f49199g.m69687n();
        this.f49199g.mo69685l(svgaUrl, 1, new C13146a());
    }

    /* JADX INFO: renamed from: l0 */
    public final void m78623l0(int index) {
        if (index == 1) {
            this.f49202j.setImageResource(obc0.f146509u3);
            this.f49198f.setBackgroundResource(obc0.f146473r3);
        } else {
            if (index != 2) {
                return;
            }
            this.f49202j.setImageResource(obc0.f146521v3);
            this.f49198f.setBackgroundResource(obc0.f146485s3);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78624m0(@NotNull final BLiveVoiceHourLeaderBoardItem item, int index, @NotNull final osn0 listener, @NotNull String name, boolean isGroupOrHourBoard, boolean showMvp) {
        item.getClass();
        listener.getClass();
        name.getClass();
        bnl0.m105525M0(this.f49200h, true);
        this.f49200h.getRealAvatarView().getHierarchy().m207041D(obc0.f146169R2);
        CommonMaskAvatarView commonMaskAvatarView = this.f49200h;
        commonMaskAvatarView.getClass();
        usn0.m197951f(commonMaskAvatarView, item, qa00.m175859d(73.0f));
        bnl0.m105524M(this.f49202j, !this.f49200h.m73304k0());
        VText vText = this.f49205m;
        if (isGroupOrHourBoard) {
            vText.setText(item.room.title);
            String str = item.user.onCall ? "onlive" : "unknown_";
            this.f49204l.m69969u();
            LivingNewTagView livingNewTagView = this.f49204l;
            BLiveState bLiveState = BLiveState.get(str);
            bLiveState.getClass();
            livingNewTagView.m69968s(bLiveState);
        } else {
            vText.setText(item.user.name);
            bnl0.m105524M(this.f49204l, false);
        }
        if (!jcr.f120090a.equals(name) && !jcr.f120091b.equals(name)) {
            m78623l0(index);
        }
        bnl0.m105524M(this.f49206n, true);
        this.f49206n.setText(usn0.m197948c(item.amount, name));
        setOnClickListener(new View.OnClickListener() { // from class: l.dmn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceHourBoardSecondOrThirdView.m78619i0(listener, item, view);
            }
        });
        if (TextUtils.isEmpty(item.mvpUser.avatar) || !showMvp) {
            bnl0.m105524M(this.f49201i, false);
        } else {
            bnl0.m105524M(this.f49201i, true);
            izs.m142868s("context_single_room", this.f49201i, item.mvpUser.avatar);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m78625n0(int index) {
        m78621j0();
        m78623l0(index);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceHourLeaderBoardDialogHeaderSecondOrThirdBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78620r();
        this.f49199g.setAlpha(0.8f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceHourBoardSecondOrThirdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
