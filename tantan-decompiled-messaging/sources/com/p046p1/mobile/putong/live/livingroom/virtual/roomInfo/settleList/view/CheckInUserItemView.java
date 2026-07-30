package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.settleList.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.settleList.view.CheckInUserItemView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;
import p149l.v25;
import p149l.w8u;
import p149l.x25;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0010R\"\u0010\u001c\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/settleList/view/CheckInUserItemView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/v25;", "model", ResourceDirection.f38808v, "(Ll/v25;)V", "Landroid/view/View;", OMSTemplateModeType.view, BLiveStormDanmakuGiftResourceType.f44446s, "(Landroid/view/View;)V", "u", "a", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/settleList/view/CheckInUserItemView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/settleList/view/CheckInUserItemView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/settleList/view/CheckInUserItemView;)V", "_root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_icon", "()Lv/VDraweeView;", "set_icon", "(Lv/VDraweeView;)V", "_icon", "Lv/VText;", "c", "Lv/VText;", "get_tag", "()Lv/VText;", "set_tag", "(Lv/VText;)V", "_tag", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class CheckInUserItemView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public CheckInUserItemView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _tag;

    public /* synthetic */ CheckInUserItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: p */
    public static void m77443p(v25 v25Var, View view) {
        v25Var.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo124810B1(v25Var.getUser());
    }

    @NotNull
    public final VDraweeView get_icon() {
        VDraweeView vDraweeView = this._icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_icon");
        return null;
    }

    @NotNull
    public final CheckInUserItemView get_root() {
        CheckInUserItemView checkInUserItemView = this._root;
        if (checkInUserItemView != null) {
            return checkInUserItemView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final VText get_tag() {
        VText vText = this._tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tag");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77444s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m77444s(View view) {
        x25.m206839a(this, view);
    }

    public final void set_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._icon = vDraweeView;
    }

    public final void set_root(@NotNull CheckInUserItemView checkInUserItemView) {
        checkInUserItemView.getClass();
        this._root = checkInUserItemView;
    }

    public final void set_tag(@NotNull VText vText) {
        vText.getClass();
        this._tag = vText;
    }

    /* JADX INFO: renamed from: u */
    public final void m77445u(v25 model) {
        String str = model.getUser().userId;
        str.getClass();
        xdl0.m208344M(get_tag(), false);
        if (model.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo124821i0(str)) {
            xdl0.m208344M(get_tag(), true);
            get_tag().setBackgroundResource(i3c0.f111154s0);
            get_tag().setText(w8u.m202217t(R$string.f47612wf));
        } else {
            if (!model.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo124816d0(str)) {
                xdl0.m208344M(get_tag(), false);
                return;
            }
            xdl0.m208344M(get_tag(), true);
            get_tag().setBackgroundResource(i3c0.f111105o);
            get_tag().setText(w8u.m202217t(R$string.f47362l7));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m77446v(@NotNull final v25 model) {
        model.getClass();
        VDraweeView vDraweeView = get_icon();
        String str = model.getUser().avatar;
        int i = t100.f167276y;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
        xdl0.m208358V(this, model.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == 0 ? 0 : t100.f167259h);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.w25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckInUserItemView.m77443p(model, view);
            }
        });
        m77445u(model);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckInUserItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckInUserItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckInUserItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
