package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab;

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
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowInfiltrationItemPicView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bfu;
import p153l.bnl0;
import p153l.egu;
import p153l.i5o;
import p153l.izs;
import p153l.mvn;
import p153l.nvn;
import p153l.qfs;
import p153l.rwn;
import p153l.y6u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;¨\u0006A"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowInfiltrationItemPicView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/i5o;", "presenter", "Lcom/p1/mobile/putong/live/base/data/BLiveActivity;", "removeAt", "Ll/mvn;", "liveActivitiesInfo", "Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;", "liveSuggests", Constants.INAPP_POSITION, Constants.INAPP_DATA_TAG, "(Ll/i5o;Lcom/p1/mobile/putong/live/base/data/BLiveActivity;Ll/mvn;Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_img", "()Lv/VDraweeView;", "set_img", "(Lv/VDraweeView;)V", "_img", "Lv/VImage;", "b", "Lv/VImage;", "get_follow", "()Lv/VImage;", "set_follow", "(Lv/VImage;)V", "_follow", "Lv/VText;", "Lv/VText;", "get_age", "()Lv/VText;", "set_age", "(Lv/VText;)V", "_age", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_name", "()Landroid/widget/TextView;", "set_name", "(Landroid/widget/TextView;)V", "_name", "e", "get_desc", "set_desc", "_desc", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public static final void m71257e(i5o i5oVar, nvn nvnVar, View view) {
        i5oVar.m138748j3(nvnVar);
        qfs.C19565a c19565aM176408f = qfs.m176401k().m176404b(nvnVar.f143821a.f56859id).m176405c("liveActivityAnchorSuggest").m176408f(nvnVar.f143821a.f56859id);
        BLive bLive = nvnVar.f143824d;
        if (bLive != null) {
            c19565aM176408f.m176406d(bLive.f45171id).m176407e(nvnVar.f143824d.state);
        }
        bfu.m104069a("p_live_follow", c19565aM176408f.m176403a());
    }

    /* JADX INFO: renamed from: f */
    public static final void m71258f(i5o i5oVar, nvn nvnVar, int i, View view) {
        i5oVar.m138747i3(nvnVar, i);
    }

    /* JADX INFO: renamed from: c */
    public final void m71259c(View view) {
        rwn.m183371a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m71260d(@NotNull final i5o presenter, @Nullable BLiveActivity removeAt, @NotNull mvn liveActivitiesInfo, @Nullable ActivitySuggests liveSuggests, final int pos) {
        BLiveAbsData bLiveAbsDataM160300t;
        BLiveAbsRoom bLiveAbsRoomM160301u;
        presenter.getClass();
        liveActivitiesInfo.getClass();
        if (removeAt == null || (bLiveAbsDataM160300t = liveActivitiesInfo.m160300t(removeAt.reference.f45267id)) == null || (bLiveAbsRoomM160301u = liveActivitiesInfo.m160301u(bLiveAbsDataM160300t.room.f45267id)) == null) {
            return;
        }
        izs.m142868s("context_live_activities", get_img(), bLiveAbsRoomM160301u.getCoverUrl());
        User userM160302v = liveActivitiesInfo.m160302v(bLiveAbsRoomM160301u.owner.f45267id);
        if (userM160302v != null) {
            boolean zIsFemale = userM160302v.isFemale();
            Integer num = userM160302v.age;
            num.getClass();
            egu.m120807b(zIsFemale, num.intValue(), get_age());
            get_name().setText(userM160302v.name);
            if (userM160302v.location != null) {
                get_desc().setText(y6u.m214505i(userM160302v));
            }
            bfu.m104070b("p_live_follow", qfs.m176401k().m176404b(userM160302v.f56859id).m176405c("liveActivityAnchorSuggest").m176408f(userM160302v.f56859id).m176406d(bLiveAbsDataM160300t.f45171id).m176407e(bLiveAbsDataM160300t.state).m176403a());
            final nvn nvnVar = new nvn(userM160302v, (BLiveRoom) bLiveAbsRoomM160301u, removeAt, (BLive) bLiveAbsDataM160300t, liveSuggests);
            bnl0.m105509E0(get_follow(), new View.OnClickListener() { // from class: l.pwn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlLiveFollowInfiltrationItemPicView.m71257e(presenter, nvnVar, view);
                }
            });
            bnl0.m105509E0(get_img(), new View.OnClickListener() { // from class: l.qwn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlLiveFollowInfiltrationItemPicView.m71258f(presenter, nvnVar, pos, view);
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
        Intrinsics.m88391r("_age");
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
        m71259c(this);
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
