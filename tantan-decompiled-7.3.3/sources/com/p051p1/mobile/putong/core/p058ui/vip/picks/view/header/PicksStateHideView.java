package com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksStateHideView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.c17;
import p153l.gbc0;
import p153l.gta;
import p153l.i4g0;
import p153l.lo70;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\"\u00108\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateHideView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PicksUser;", "picksUser", "k0", "(Lcom/p1/mobile/putong/core/data/PicksUser;)V", "l0", "", "getSubtitle", "()Ljava/lang/String;", "Landroid/view/View;", OMSTemplateModeType.view, "j0", "(Landroid/view/View;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lv/VText;", "e", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VImage;", "f", "Lv/VImage;", "get_title_icon", "()Lv/VImage;", "set_title_icon", "(Lv/VImage;)V", "_title_icon", "g", "get_subtitle", "set_subtitle", "_subtitle", "h", "get_more", "set_more", "_more", "", RXScreenCaptureService.KEY_INDEX, "Z", "getHasTrackMv", "()Z", "setHasTrackMv", "(Z)V", "hasTrackMv", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PicksStateHideView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _title_icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _more;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean hasTrackMv;

    public /* synthetic */ PicksStateHideView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m58012h0(Act act, PicksStateHideView picksStateHideView, View view) {
        i4g0.m138520r("e_picks_banner", act.pageId());
        if (gta.m132210e().m132214d().mo34719Lc()) {
            gta.m132210e().m132214d().mo34908qa(act, "daily_picks_entrance");
        } else {
            picksStateHideView.getContext().startActivity(CoreMemberModule.m37004F().m187693b().mo36985a9(picksStateHideView.getContext()));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m58013i0(Act act, PicksStateHideView picksStateHideView, View view) {
        i4g0.m138520r("e_picks_banner", act.pageId());
        picksStateHideView.getContext().startActivity(CoreMemberModule.m37004F().m187693b().mo36985a9(picksStateHideView.getContext()));
    }

    public final boolean getHasTrackMv() {
        return this.hasTrackMv;
    }

    @NotNull
    public final String getSubtitle() {
        return !c17.m107528u0() ? "发现你的心动女孩" : "发现你的心动男孩";
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    public final VText get_more() {
        VText vText = this._more;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_more");
        return null;
    }

    @NotNull
    public final VText get_subtitle() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_subtitle");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @NotNull
    public final VImage get_title_icon() {
        VImage vImage = this._title_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_title_icon");
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m58014j0(View view) {
        lo70.m155042a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m58015k0(@NotNull PicksUser picksUser) {
        String str;
        String str2;
        picksUser.getClass();
        Context context = getContext();
        context.getClass();
        final Act act = (Act) context;
        if (!this.hasTrackMv) {
            this.hasTrackMv = true;
            i4g0.m138526x("e_picks_banner", act.pageId());
        }
        String subtitle = getSubtitle();
        if (gta.m132210e().m132214d().mo34719Lc()) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(gta.m132210e().m132214d().mo34898ol());
            if (userM116503Pa != null) {
                uqb0.f180374G.m127115L0(get_avatar(), userM116503Pa.m61308fp().profileSmall().formatted());
            }
            str = "每日精选";
            str2 = !c17.m107528u0() ? "认识更多优质女性" : "认识更多优质男性";
        } else {
            User userM116503Pa2 = CoreModule.f18264c.f20381e0.m116503Pa(picksUser.f21210id);
            if (userM116503Pa2 != null) {
                uqb0.f180374G.m127115L0(get_avatar(), userM116503Pa2.m61308fp().profileSmall().formatted());
            }
            str = "每日心动";
            str2 = subtitle;
        }
        get_title().setText(str);
        get_subtitle().setText(str2);
        get_more().setVisibility(0);
        setOnClickListener(new View.OnClickListener() { // from class: l.ko70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicksStateHideView.m58012h0(act, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final void m58016l0() {
        Context context = getContext();
        context.getClass();
        final Act act = (Act) context;
        if (!this.hasTrackMv) {
            this.hasTrackMv = true;
            i4g0.m138526x("e_picks_banner", act.pageId());
        }
        uqb0.f180374G.m127138Y0(get_avatar(), gbc0.f103178P1);
        get_title().setTypeface(Typeface.DEFAULT_BOLD);
        get_title().setText("每日心动");
        get_subtitle().setText(getSubtitle());
        get_more().setVisibility(0);
        setOnClickListener(new View.OnClickListener() { // from class: l.jo70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicksStateHideView.m58013i0(act, this, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58014j0(this);
        uqb0.f180374G.m127138Y0(get_avatar(), c17.m107528u0() ? gbc0.f103143K1 : gbc0.f103136J1);
    }

    public final void setHasTrackMv(boolean z) {
        this.hasTrackMv = z;
    }

    public final void set_avatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar = vDraweeView;
    }

    public final void set_more(@NotNull VText vText) {
        vText.getClass();
        this._more = vText;
    }

    public final void set_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._subtitle = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    public final void set_title_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._title_icon = vImage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksStateHideView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksStateHideView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksStateHideView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
