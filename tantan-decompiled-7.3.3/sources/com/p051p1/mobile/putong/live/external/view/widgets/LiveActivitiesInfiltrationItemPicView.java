package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.ActivitySuggests;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesInfiltrationItemPicView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p153l.bfu;
import p153l.bnl0;
import p153l.eur;
import p153l.gtr;
import p153l.gur;
import p153l.izs;
import p153l.qfs;
import p153l.rtr;
import p153l.y6u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;¨\u0006A"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/view/widgets/LiveActivitiesInfiltrationItemPicView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/eur;", "presenter", "Lcom/p1/mobile/putong/live/base/data/BLiveActivity;", "removeAt", "Ll/rtr;", "liveActivitiesInfo", "Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;", "liveSuggests", Constants.INAPP_POSITION, Constants.INAPP_DATA_TAG, "(Ll/eur;Lcom/p1/mobile/putong/live/base/data/BLiveActivity;Ll/rtr;Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_img", "()Lv/VDraweeView;", "set_img", "(Lv/VDraweeView;)V", "_img", "Lv/VFrame;", "b", "Lv/VFrame;", "get_cover", "()Lv/VFrame;", "set_cover", "(Lv/VFrame;)V", "_cover", "Lv/VImage;", "Lv/VImage;", "get_follow", "()Lv/VImage;", "set_follow", "(Lv/VImage;)V", "_follow", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_name", "()Landroid/widget/TextView;", "set_name", "(Landroid/widget/TextView;)V", "_name", "e", "get_desc", "set_desc", "_desc", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveActivitiesInfiltrationItemPicView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _img;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VFrame _cover;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _follow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveActivitiesInfiltrationItemPicView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX INFO: renamed from: e */
    public static final void m72069e(eur eurVar, gur gurVar, View view) {
        eurVar.m122754x0(gurVar);
        qfs.C19565a c19565aM176408f = qfs.m176401k().m176404b(gurVar.f106562a.f56859id).m176405c("liveActivityAnchorSuggest").m176408f(gurVar.f106562a.f56859id);
        BLive bLive = gurVar.f106565d;
        if (bLive != null) {
            c19565aM176408f.m176406d(bLive.f45171id).m176407e(gurVar.f106565d.state);
        }
        bfu.m104069a("p_live_follow", c19565aM176408f.m176403a());
    }

    /* JADX INFO: renamed from: f */
    public static final void m72070f(eur eurVar, gur gurVar, int i, View view) {
        eurVar.m122753u0(gurVar, i);
    }

    /* JADX INFO: renamed from: c */
    public final void m72071c(View view) {
        gtr.m132255a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m72072d(@NotNull final eur presenter, @Nullable BLiveActivity removeAt, @NotNull rtr liveActivitiesInfo, @Nullable ActivitySuggests liveSuggests, final int pos) {
        BLiveAbsData bLiveAbsDataM183160t;
        BLiveAbsRoom bLiveAbsRoomM183161u;
        presenter.getClass();
        liveActivitiesInfo.getClass();
        if (removeAt == null || (bLiveAbsDataM183160t = liveActivitiesInfo.m183160t(removeAt.reference.f45267id)) == null || (bLiveAbsRoomM183161u = liveActivitiesInfo.m183161u(bLiveAbsDataM183160t.room.f45267id)) == null) {
            return;
        }
        izs.m142868s("context_live_activities", get_img(), bLiveAbsRoomM183161u.getCoverUrl());
        User userM183162v = liveActivitiesInfo.m183162v(bLiveAbsRoomM183161u.owner.f45267id);
        if (userM183162v != null) {
            get_name().setText(userM183162v.name);
            if (userM183162v.location != null) {
                get_desc().setText(y6u.m214505i(userM183162v));
            }
            bfu.m104070b("p_live_follow", qfs.m176401k().m176404b(userM183162v.f56859id).m176405c("liveActivityAnchorSuggest").m176408f(userM183162v.f56859id).m176406d(bLiveAbsDataM183160t.f45171id).m176407e(bLiveAbsDataM183160t.state).m176403a());
            final gur gurVar = new gur(userM183162v, (BLiveRoom) bLiveAbsRoomM183161u, removeAt, (BLive) bLiveAbsDataM183160t, liveSuggests);
            bnl0.m105509E0(get_follow(), new View.OnClickListener() { // from class: l.etr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveActivitiesInfiltrationItemPicView.m72069e(presenter, gurVar, view);
                }
            });
            bnl0.m105509E0(get_img(), new View.OnClickListener() { // from class: l.ftr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveActivitiesInfiltrationItemPicView.m72070f(presenter, gurVar, pos, view);
                }
            });
        }
    }

    @NotNull
    public final VFrame get_cover() {
        VFrame vFrame = this._cover;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_cover");
        return null;
    }

    @NotNull
    public final TextView get_desc() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final VImage get_follow() {
        VImage vImage = this._follow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_follow");
        return null;
    }

    @NotNull
    public final VDraweeView get_img() {
        VDraweeView vDraweeView = this._img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_img");
        return null;
    }

    @NotNull
    public final TextView get_name() {
        TextView textView = this._name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72071c(this);
    }

    public final void set_cover(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._cover = vFrame;
    }

    public final void set_desc(@NotNull TextView textView) {
        textView.getClass();
        this._desc = textView;
    }

    public final void set_follow(@NotNull VImage vImage) {
        vImage.getClass();
        this._follow = vImage;
    }

    public final void set_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._img = vDraweeView;
    }

    public final void set_name(@NotNull TextView textView) {
        textView.getClass();
        this._name = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveActivitiesInfiltrationItemPicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveActivitiesInfiltrationItemPicView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
