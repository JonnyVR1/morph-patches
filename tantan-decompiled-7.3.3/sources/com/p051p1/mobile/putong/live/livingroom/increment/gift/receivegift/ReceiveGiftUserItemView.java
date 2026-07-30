package com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUserItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.aoc0;
import p153l.coc0;
import p153l.coj;
import p153l.doc0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.xau;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u000eR\"\u0010#\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010/\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0017R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00107¨\u00068"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/aoc0;", "model", "e", "(Ll/aoc0;)V", "g", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "", Constants.INAPP_DATA_TAG, "(Ll/aoc0;)Ljava/lang/String;", "f", "c", "a", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUserItemView;)V", "_root", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;", "get_head", "()Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;", "set_head", "(Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonAnimMaskAvatarView;)V", "_head", "Landroid/view/View;", "get_select", "()Landroid/view/View;", "set_select", "_select", "Lv/VText;", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "Ll/aoc0;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public aoc0 model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveGiftUserItemView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m75155a(ReceiveGiftUserItemView receiveGiftUserItemView, View view) {
        aoc0 aoc0Var = receiveGiftUserItemView.model;
        aoc0 aoc0Var2 = null;
        if (aoc0Var == null) {
            Intrinsics.m88391r("model");
            aoc0Var = null;
        }
        boolean zM99062K = aoc0Var.getIsPacketMode();
        aoc0 aoc0Var3 = receiveGiftUserItemView.model;
        if (zM99062K) {
            if (aoc0Var3 == null) {
                Intrinsics.m88391r("model");
                aoc0Var3 = null;
            }
            doc0 doc0VarM99061J = aoc0Var3.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
            aoc0 aoc0Var4 = receiveGiftUserItemView.model;
            if (aoc0Var4 == null) {
                Intrinsics.m88391r("model");
            } else {
                aoc0Var2 = aoc0Var4;
            }
            doc0VarM99061J.mo75178a(aoc0Var2);
            return;
        }
        if (aoc0Var3 == null) {
            Intrinsics.m88391r("model");
            aoc0Var3 = null;
        }
        if (aoc0Var3.getCallInfo().m111666h()) {
            view.setSelected(false);
            aoc0 aoc0Var5 = receiveGiftUserItemView.model;
            if (aoc0Var5 == null) {
                Intrinsics.m88391r("model");
                aoc0Var5 = null;
            }
            aoc0Var5.getCallInfo().m111668j(false);
            receiveGiftUserItemView.m75160f();
            aoc0 aoc0Var6 = receiveGiftUserItemView.model;
            if (aoc0Var6 == null) {
                Intrinsics.m88391r("model");
            } else {
                aoc0Var2 = aoc0Var6;
            }
            aoc0Var2.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo75180c();
            return;
        }
        view.setSelected(true);
        aoc0 aoc0Var7 = receiveGiftUserItemView.model;
        if (aoc0Var7 == null) {
            Intrinsics.m88391r("model");
            aoc0Var7 = null;
        }
        aoc0Var7.getCallInfo().m111668j(true);
        receiveGiftUserItemView.m75160f();
        aoc0 aoc0Var8 = receiveGiftUserItemView.model;
        if (aoc0Var8 == null) {
            Intrinsics.m88391r("model");
        } else {
            aoc0Var2 = aoc0Var8;
        }
        aoc0Var2.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo75180c();
    }

    /* JADX INFO: renamed from: b */
    public final void m75156b(View view) {
        coc0.m111638a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m75157c() {
        setOnClickListener(new View.OnClickListener() { // from class: l.boc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReceiveGiftUserItemView.m75155a(this.f77665a, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final String m75158d(aoc0 model) {
        boolean zMo75179b = model.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().mo75179b();
        if (model.getCallInfo().m111663e()) {
            String strM209910t = zMo75179b ? xau.m209910t(R$string.f47514F) : xau.m209910t(R$string.f47492E);
            strM209910t.getClass();
            return strM209910t;
        }
        String strM209911u = zMo75179b ? xau.m209911u(R$string.f47580I, Integer.valueOf(model.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() + 1)) : xau.m209911u(R$string.f47580I, Integer.valueOf(model.getCallInfo().f82890f.f150595d + 1));
        strM209911u.getClass();
        return strM209911u;
    }

    /* JADX INFO: renamed from: e */
    public final void m75159e(@NotNull aoc0 model) {
        model.getClass();
        this.model = model;
        coj cojVarM99059H = model.getCallInfo();
        get_head().setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73297d("context_single_room").m73296c(cojVarM99059H.f82885a ? cojVarM99059H.f82886b.avatar : cojVarM99059H.f82889e.f107999c).m73298e(qa00.f156333t).m73294a());
        if (zrv.f205799a.m207637H()) {
            get_select().setBackground(n3d0.m161278b(obc0.f146140O6));
        } else {
            get_select().setBackground(n3d0.m161278b(obc0.f146151P6));
        }
        m75157c();
        m75161g();
    }

    /* JADX INFO: renamed from: f */
    public final void m75160f() {
        aoc0 aoc0Var = this.model;
        if (aoc0Var == null) {
            Intrinsics.m88391r("model");
            aoc0Var = null;
        }
        if (aoc0Var.getCallInfo().m111666h()) {
            get_name().setTextColor(n3d0.m161277a(n9c0.f140823e1));
        } else {
            get_name().setTextColor(n3d0.m161277a(n9c0.f140847m1));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m75161g() {
        VText vText = get_name();
        aoc0 aoc0Var = this.model;
        aoc0 aoc0Var2 = null;
        if (aoc0Var == null) {
            Intrinsics.m88391r("model");
            aoc0Var = null;
        }
        vText.setText(m75158d(aoc0Var));
        aoc0 aoc0Var3 = this.model;
        if (aoc0Var3 == null) {
            Intrinsics.m88391r("model");
        } else {
            aoc0Var2 = aoc0Var3;
        }
        setSelected(aoc0Var2.getCallInfo().m111666h());
        m75160f();
    }

    @NotNull
    public final CommonAnimMaskAvatarView get_head() {
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = this._head;
        if (commonAnimMaskAvatarView != null) {
            return commonAnimMaskAvatarView;
        }
        Intrinsics.m88391r("_head");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @NotNull
    public final ReceiveGiftUserItemView get_root() {
        ReceiveGiftUserItemView receiveGiftUserItemView = this._root;
        if (receiveGiftUserItemView != null) {
            return receiveGiftUserItemView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    public final View get_select() {
        View view = this._select;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_select");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75156b(this);
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
