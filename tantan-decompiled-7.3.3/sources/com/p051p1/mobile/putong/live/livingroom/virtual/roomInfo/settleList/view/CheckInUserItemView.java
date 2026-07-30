package com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.settleList.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.settleList.view.CheckInUserItemView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.obc0;
import p153l.qa00;
import p153l.v35;
import p153l.x35;
import p153l.xau;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0010R\"\u0010\u001c\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/settleList/view/CheckInUserItemView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/v35;", "model", ResourceDirection.f39656v, "(Ll/v35;)V", "Landroid/view/View;", OMSTemplateModeType.view, BLiveStormDanmakuGiftResourceType.f45294s, "(Landroid/view/View;)V", "u", "a", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/settleList/view/CheckInUserItemView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/settleList/view/CheckInUserItemView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/settleList/view/CheckInUserItemView;)V", "_root", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_icon", "()Lv/VDraweeView;", "set_icon", "(Lv/VDraweeView;)V", "_icon", "Lv/VText;", "c", "Lv/VText;", "get_tag", "()Lv/VText;", "set_tag", "(Lv/VText;)V", "_tag", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public static void m78626p(v35 v35Var, View view) {
        v35Var.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo149946B1(v35Var.getUser());
    }

    @NotNull
    public final VDraweeView get_icon() {
        VDraweeView vDraweeView = this._icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_icon");
        return null;
    }

    @NotNull
    public final CheckInUserItemView get_root() {
        CheckInUserItemView checkInUserItemView = this._root;
        if (checkInUserItemView != null) {
            return checkInUserItemView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    public final VText get_tag() {
        VText vText = this._tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tag");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78627s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m78627s(View view) {
        x35.m209192a(this, view);
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
    public final void m78628u(v35 model) {
        String str = model.getUser().userId;
        str.getClass();
        bnl0.m105524M(get_tag(), false);
        if (model.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo149957i0(str)) {
            bnl0.m105524M(get_tag(), true);
            get_tag().setBackgroundResource(obc0.f146482s0);
            get_tag().setText(xau.m209910t(R$string.f48460wf));
        } else {
            if (!model.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo149952d0(str)) {
                bnl0.m105524M(get_tag(), false);
                return;
            }
            bnl0.m105524M(get_tag(), true);
            get_tag().setBackgroundResource(obc0.f146433o);
            get_tag().setText(xau.m209910t(R$string.f48210l7));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m78629v(@NotNull final v35 model) {
        model.getClass();
        VDraweeView vDraweeView = get_icon();
        String str = model.getUser().avatar;
        int i = qa00.f156338y;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
        bnl0.m105538V(this, model.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == 0 ? 0 : qa00.f156321h);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.w35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckInUserItemView.m78626p(model, view);
            }
        });
        m78628u(model);
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
