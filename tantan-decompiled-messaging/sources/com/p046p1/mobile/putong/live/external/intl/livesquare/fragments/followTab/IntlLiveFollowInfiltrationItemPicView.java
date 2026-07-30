package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab;

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
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowInfiltrationItemPicView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.adu;
import p149l.deu;
import p149l.hxs;
import p149l.i3o;
import p149l.mtn;
import p149l.ntn;
import p149l.pds;
import p149l.run;
import p149l.x4u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;¨\u0006A"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowInfiltrationItemPicView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/i3o;", "presenter", "Lcom/p1/mobile/putong/live/base/data/BLiveActivity;", "removeAt", "Ll/mtn;", "liveActivitiesInfo", "Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;", "liveSuggests", Constants.INAPP_POSITION, Constants.INAPP_DATA_TAG, "(Ll/i3o;Lcom/p1/mobile/putong/live/base/data/BLiveActivity;Ll/mtn;Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_img", "()Lv/VDraweeView;", "set_img", "(Lv/VDraweeView;)V", "_img", "Lv/VImage;", "b", "Lv/VImage;", "get_follow", "()Lv/VImage;", "set_follow", "(Lv/VImage;)V", "_follow", "Lv/VText;", "Lv/VText;", "get_age", "()Lv/VText;", "set_age", "(Lv/VText;)V", "_age", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_name", "()Landroid/widget/TextView;", "set_name", "(Landroid/widget/TextView;)V", "_name", "e", "get_desc", "set_desc", "_desc", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlLiveFollowInfiltrationItemPicView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _img;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _follow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _age;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlLiveFollowInfiltrationItemPicView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX INFO: renamed from: e */
    public static final void m70074e(i3o i3oVar, ntn ntnVar, View view) {
        i3oVar.m134296j3(ntnVar);
        pds.C19186a c19186aM168408f = pds.m168401k().m168404b(ntnVar.f140493a.f56011id).m168405c("liveActivityAnchorSuggest").m168408f(ntnVar.f140493a.f56011id);
        BLive bLive = ntnVar.f140496d;
        if (bLive != null) {
            c19186aM168408f.m168406d(bLive.f44323id).m168407e(ntnVar.f140496d.state);
        }
        adu.m96005a("p_live_follow", c19186aM168408f.m168403a());
    }

    /* JADX INFO: renamed from: f */
    public static final void m70075f(i3o i3oVar, ntn ntnVar, int i, View view) {
        i3oVar.m134295i3(ntnVar, i);
    }

    /* JADX INFO: renamed from: c */
    public final void m70076c(View view) {
        run.m180882a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m70077d(@NotNull final i3o presenter, @Nullable BLiveActivity removeAt, @NotNull mtn liveActivitiesInfo, @Nullable ActivitySuggests liveSuggests, final int pos) {
        BLiveAbsData bLiveAbsDataM156328t;
        BLiveAbsRoom bLiveAbsRoomM156329u;
        presenter.getClass();
        liveActivitiesInfo.getClass();
        if (removeAt == null || (bLiveAbsDataM156328t = liveActivitiesInfo.m156328t(removeAt.reference.f44419id)) == null || (bLiveAbsRoomM156329u = liveActivitiesInfo.m156329u(bLiveAbsDataM156328t.room.f44419id)) == null) {
            return;
        }
        hxs.m133406s("context_live_activities", get_img(), bLiveAbsRoomM156329u.getCoverUrl());
        User userM156330v = liveActivitiesInfo.m156330v(bLiveAbsRoomM156329u.owner.f44419id);
        if (userM156330v != null) {
            boolean zIsFemale = userM156330v.isFemale();
            Integer num = userM156330v.age;
            num.getClass();
            deu.m111399b(zIsFemale, num.intValue(), get_age());
            get_name().setText(userM156330v.name);
            if (userM156330v.location != null) {
                get_desc().setText(x4u.m207023i(userM156330v));
            }
            adu.m96006b("p_live_follow", pds.m168401k().m168404b(userM156330v.f56011id).m168405c("liveActivityAnchorSuggest").m168408f(userM156330v.f56011id).m168406d(bLiveAbsDataM156328t.f44323id).m168407e(bLiveAbsDataM156328t.state).m168403a());
            final ntn ntnVar = new ntn(userM156330v, (BLiveRoom) bLiveAbsRoomM156329u, removeAt, (BLive) bLiveAbsDataM156328t, liveSuggests);
            xdl0.m208329E0(get_follow(), new View.OnClickListener() { // from class: l.pun
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlLiveFollowInfiltrationItemPicView.m70074e(presenter, ntnVar, view);
                }
            });
            xdl0.m208329E0(get_img(), new View.OnClickListener() { // from class: l.qun
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlLiveFollowInfiltrationItemPicView.m70075f(presenter, ntnVar, pos, view);
                }
            });
        }
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_age");
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
        m70076c(this);
    }

    public final void set_age(@NotNull VText vText) {
        vText.getClass();
        this._age = vText;
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
    public IntlLiveFollowInfiltrationItemPicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlLiveFollowInfiltrationItemPicView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
