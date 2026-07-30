package com.p046p1.mobile.putong.live.livingroom.increment.gift.receivegift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUserItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.h1c0;
import p149l.i3c0;
import p149l.kvc0;
import p149l.mlj;
import p149l.t100;
import p149l.tfc0;
import p149l.vfc0;
import p149l.w8u;
import p149l.wfc0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u000eR\"\u0010#\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010/\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0017R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00107¨\u00068"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/tfc0;", "model", "e", "(Ll/tfc0;)V", "g", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "", Constants.INAPP_DATA_TAG, "(Ll/tfc0;)Ljava/lang/String;", "f", "c", "a", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;)V", "_root", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;", "get_head", "()Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;", "set_head", "(Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;)V", "_head", "Landroid/view/View;", "get_select", "()Landroid/view/View;", "set_select", "_select", "Lv/VText;", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "Ll/tfc0;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ReceiveGiftUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ReceiveGiftUserItemView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public CommonAnimMaskAvatarView _head;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View _select;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public tfc0 model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveGiftUserItemView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m73972a(ReceiveGiftUserItemView receiveGiftUserItemView, View view) {
        tfc0 tfc0Var = receiveGiftUserItemView.model;
        tfc0 tfc0Var2 = null;
        if (tfc0Var == null) {
            Intrinsics.m87502r("model");
            tfc0Var = null;
        }
        boolean zM188677K = tfc0Var.getIsPacketMode();
        tfc0 tfc0Var3 = receiveGiftUserItemView.model;
        if (zM188677K) {
            if (tfc0Var3 == null) {
                Intrinsics.m87502r("model");
                tfc0Var3 = null;
            }
            wfc0 wfc0VarM188676J = tfc0Var3.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
            tfc0 tfc0Var4 = receiveGiftUserItemView.model;
            if (tfc0Var4 == null) {
                Intrinsics.m87502r("model");
            } else {
                tfc0Var2 = tfc0Var4;
            }
            wfc0VarM188676J.mo73995a(tfc0Var2);
            return;
        }
        if (tfc0Var3 == null) {
            Intrinsics.m87502r("model");
            tfc0Var3 = null;
        }
        if (tfc0Var3.getCallInfo().m155159h()) {
            view.setSelected(false);
            tfc0 tfc0Var5 = receiveGiftUserItemView.model;
            if (tfc0Var5 == null) {
                Intrinsics.m87502r("model");
                tfc0Var5 = null;
            }
            tfc0Var5.getCallInfo().m155161j(false);
            receiveGiftUserItemView.m73977f();
            tfc0 tfc0Var6 = receiveGiftUserItemView.model;
            if (tfc0Var6 == null) {
                Intrinsics.m87502r("model");
            } else {
                tfc0Var2 = tfc0Var6;
            }
            tfc0Var2.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo73997c();
            return;
        }
        view.setSelected(true);
        tfc0 tfc0Var7 = receiveGiftUserItemView.model;
        if (tfc0Var7 == null) {
            Intrinsics.m87502r("model");
            tfc0Var7 = null;
        }
        tfc0Var7.getCallInfo().m155161j(true);
        receiveGiftUserItemView.m73977f();
        tfc0 tfc0Var8 = receiveGiftUserItemView.model;
        if (tfc0Var8 == null) {
            Intrinsics.m87502r("model");
        } else {
            tfc0Var2 = tfc0Var8;
        }
        tfc0Var2.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo73997c();
    }

    /* JADX INFO: renamed from: b */
    public final void m73973b(View view) {
        vfc0.m198276a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m73974c() {
        setOnClickListener(new View.OnClickListener() { // from class: l.ufc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReceiveGiftUserItemView.m73972a(this.f176247a, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final String m73975d(tfc0 model) {
        boolean zMo73996b = model.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo73996b();
        if (model.getCallInfo().m155156e()) {
            String strM202217t = zMo73996b ? w8u.m202217t(R$string.f46666F) : w8u.m202217t(R$string.f46644E);
            strM202217t.getClass();
            return strM202217t;
        }
        String strM202218u = zMo73996b ? w8u.m202218u(R$string.f46732I, Integer.valueOf(model.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() + 1)) : w8u.m202218u(R$string.f46732I, Integer.valueOf(model.getCallInfo().f134445f.f152540d + 1));
        strM202218u.getClass();
        return strM202218u;
    }

    /* JADX INFO: renamed from: e */
    public final void m73976e(@NotNull tfc0 model) {
        model.getClass();
        this.model = model;
        mlj mljVarM188674H = model.getCallInfo();
        get_head().setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72114d("context_single_room").m72113c(mljVarM188674H.f134440a ? mljVarM188674H.f134441b.avatar : mljVarM188674H.f134444e.f111522c).m72115e(t100.f167271t).m72111a());
        if (ypv.f199493a.m199315H()) {
            get_select().setBackground(kvc0.m147353b(i3c0.f110812O6));
        } else {
            get_select().setBackground(kvc0.m147353b(i3c0.f110823P6));
        }
        m73974c();
        m73978g();
    }

    /* JADX INFO: renamed from: f */
    public final void m73977f() {
        tfc0 tfc0Var = this.model;
        if (tfc0Var == null) {
            Intrinsics.m87502r("model");
            tfc0Var = null;
        }
        if (tfc0Var.getCallInfo().m155159h()) {
            get_name().setTextColor(kvc0.m147352a(h1c0.f105362e1));
        } else {
            get_name().setTextColor(kvc0.m147352a(h1c0.f105386m1));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m73978g() {
        VText vText = get_name();
        tfc0 tfc0Var = this.model;
        tfc0 tfc0Var2 = null;
        if (tfc0Var == null) {
            Intrinsics.m87502r("model");
            tfc0Var = null;
        }
        vText.setText(m73975d(tfc0Var));
        tfc0 tfc0Var3 = this.model;
        if (tfc0Var3 == null) {
            Intrinsics.m87502r("model");
        } else {
            tfc0Var2 = tfc0Var3;
        }
        setSelected(tfc0Var2.getCallInfo().m155159h());
        m73977f();
    }

    @NotNull
    public final CommonAnimMaskAvatarView get_head() {
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = this._head;
        if (commonAnimMaskAvatarView != null) {
            return commonAnimMaskAvatarView;
        }
        Intrinsics.m87502r("_head");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    @NotNull
    public final ReceiveGiftUserItemView get_root() {
        ReceiveGiftUserItemView receiveGiftUserItemView = this._root;
        if (receiveGiftUserItemView != null) {
            return receiveGiftUserItemView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final View get_select() {
        View view = this._select;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_select");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73973b(this);
    }

    public final void set_head(@NotNull CommonAnimMaskAvatarView commonAnimMaskAvatarView) {
        commonAnimMaskAvatarView.getClass();
        this._head = commonAnimMaskAvatarView;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_root(@NotNull ReceiveGiftUserItemView receiveGiftUserItemView) {
        receiveGiftUserItemView.getClass();
        this._root = receiveGiftUserItemView;
    }

    public final void set_select(@NotNull View view) {
        view.getClass();
        this._select = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveGiftUserItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveGiftUserItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
