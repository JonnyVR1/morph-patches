package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.ActivitySuggests;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesInfiltrationItemPicView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p149l.adu;
import p149l.dsr;
import p149l.frr;
import p149l.fsr;
import p149l.hxs;
import p149l.pds;
import p149l.qrr;
import p149l.x4u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;¨\u0006A"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/view/widgets/LiveActivitiesInfiltrationItemPicView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/dsr;", "presenter", "Lcom/p1/mobile/putong/live/base/data/BLiveActivity;", "removeAt", "Ll/qrr;", "liveActivitiesInfo", "Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;", "liveSuggests", Constants.INAPP_POSITION, Constants.INAPP_DATA_TAG, "(Ll/dsr;Lcom/p1/mobile/putong/live/base/data/BLiveActivity;Ll/qrr;Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_img", "()Lv/VDraweeView;", "set_img", "(Lv/VDraweeView;)V", "_img", "Lv/VFrame;", "b", "Lv/VFrame;", "get_cover", "()Lv/VFrame;", "set_cover", "(Lv/VFrame;)V", "_cover", "Lv/VImage;", "Lv/VImage;", "get_follow", "()Lv/VImage;", "set_follow", "(Lv/VImage;)V", "_follow", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_name", "()Landroid/widget/TextView;", "set_name", "(Landroid/widget/TextView;)V", "_name", "e", "get_desc", "set_desc", "_desc", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static final void m70886e(dsr dsrVar, fsr fsrVar, View view) {
        dsrVar.m113492x0(fsrVar);
        pds.C19186a c19186aM168408f = pds.m168401k().m168404b(fsrVar.f99099a.f56011id).m168405c("liveActivityAnchorSuggest").m168408f(fsrVar.f99099a.f56011id);
        BLive bLive = fsrVar.f99102d;
        if (bLive != null) {
            c19186aM168408f.m168406d(bLive.f44323id).m168407e(fsrVar.f99102d.state);
        }
        adu.m96005a("p_live_follow", c19186aM168408f.m168403a());
    }

    /* JADX INFO: renamed from: f */
    public static final void m70887f(dsr dsrVar, fsr fsrVar, int i, View view) {
        dsrVar.m113491u0(fsrVar, i);
    }

    /* JADX INFO: renamed from: c */
    public final void m70888c(View view) {
        frr.m122895a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m70889d(@NotNull final dsr presenter, @Nullable BLiveActivity removeAt, @NotNull qrr liveActivitiesInfo, @Nullable ActivitySuggests liveSuggests, final int pos) {
        BLiveAbsData bLiveAbsDataM176126t;
        BLiveAbsRoom bLiveAbsRoomM176127u;
        presenter.getClass();
        liveActivitiesInfo.getClass();
        if (removeAt == null || (bLiveAbsDataM176126t = liveActivitiesInfo.m176126t(removeAt.reference.f44419id)) == null || (bLiveAbsRoomM176127u = liveActivitiesInfo.m176127u(bLiveAbsDataM176126t.room.f44419id)) == null) {
            return;
        }
        hxs.m133406s("context_live_activities", get_img(), bLiveAbsRoomM176127u.getCoverUrl());
        User userM176128v = liveActivitiesInfo.m176128v(bLiveAbsRoomM176127u.owner.f44419id);
        if (userM176128v != null) {
            get_name().setText(userM176128v.name);
            if (userM176128v.location != null) {
                get_desc().setText(x4u.m207023i(userM176128v));
            }
            adu.m96006b("p_live_follow", pds.m168401k().m168404b(userM176128v.f56011id).m168405c("liveActivityAnchorSuggest").m168408f(userM176128v.f56011id).m168406d(bLiveAbsDataM176126t.f44323id).m168407e(bLiveAbsDataM176126t.state).m168403a());
            final fsr fsrVar = new fsr(userM176128v, (BLiveRoom) bLiveAbsRoomM176127u, removeAt, (BLive) bLiveAbsDataM176126t, liveSuggests);
            xdl0.m208329E0(get_follow(), new View.OnClickListener() { // from class: l.drr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveActivitiesInfiltrationItemPicView.m70886e(presenter, fsrVar, view);
                }
            });
            xdl0.m208329E0(get_img(), new View.OnClickListener() { // from class: l.err
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveActivitiesInfiltrationItemPicView.m70887f(presenter, fsrVar, pos, view);
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
        Intrinsics.m87502r("_cover");
        return null;
    }

    @NotNull
    public final TextView get_desc() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_desc");
        return null;
    }

    @NotNull
    public final VImage get_follow() {
        VImage vImage = this._follow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_follow");
        return null;
    }

    @NotNull
    public final VDraweeView get_img() {
        VDraweeView vDraweeView = this._img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_img");
        return null;
    }

    @NotNull
    public final TextView get_name() {
        TextView textView = this._name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70888c(this);
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
