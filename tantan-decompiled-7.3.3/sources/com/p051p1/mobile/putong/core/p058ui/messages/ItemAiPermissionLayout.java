package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAiPermissionLayout;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.o2q;
import p153l.ovb0;
import p153l.pf60;
import p153l.pol;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAiPermissionLayout extends VLinear implements InterfaceC8682a {

    /* JADX INFO: renamed from: c */
    public ItemAiPermissionLayout f31617c;

    /* JADX INFO: renamed from: d */
    public VText f31618d;

    /* JADX INFO: renamed from: e */
    public VText f31619e;

    /* JADX INFO: renamed from: f */
    public VText f31620f;

    /* JADX INFO: renamed from: g */
    public VText f31621g;

    /* JADX INFO: renamed from: h */
    public VText f31622h;

    /* JADX INFO: renamed from: i */
    public boolean f31623i;

    public ItemAiPermissionLayout(Context context) {
        super(context);
        this.f31623i = false;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m49168P(Message message, View view) {
        i4g0.m138523u("e_paip_choose_avatar_switch", OMSDialogPositon.p_chat_view, pf60.m172085a("switch_config_type", "0"));
        CoreModule.f18264c.f20359W1.m159484h3(false, message.cid);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m49170R(Message message, View view) {
        i4g0.m138523u("e_paip_choose_avatar_switch", OMSDialogPositon.p_chat_view, pf60.m172085a("switch_config_type", "1"));
        CoreModule.f18264c.f20359W1.m159484h3(true, message.cid);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final void m49171S(View view) {
        o2q.m165742a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m49172T(final Message message, User user) {
        String aiPictureStatus = user.getAiPictureStatus();
        if (TextUtils.equals(aiPictureStatus, "true") || TextUtils.equals(aiPictureStatus, "false")) {
            bnl0.m105524M(this.f31620f, false);
            bnl0.m105524M(this.f31621g, false);
            bnl0.m105524M(this.f31622h, true);
            this.f31622h.setText(TextUtils.equals(aiPictureStatus, "true") ? "已允许" : "已拒绝");
            return;
        }
        bnl0.m105524M(this.f31620f, true);
        bnl0.m105524M(this.f31621g, true);
        bnl0.m105524M(this.f31622h, false);
        bnl0.m105509E0(this.f31620f, new View.OnClickListener() { // from class: l.m2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemAiPermissionLayout.m49168P(message, view);
            }
        });
        bnl0.m105509E0(this.f31621g, new View.OnClickListener() { // from class: l.n2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemAiPermissionLayout.m49170R(message, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(pol polVar, final Message message, InterfaceC8682a.a aVar) {
        super.mo49173U(polVar, message, aVar);
        Act act = bnl0.m105508E(this) instanceof Act ? (Act) bnl0.m105508E(this) : null;
        if (act == null) {
            return;
        }
        if (!this.f31623i) {
            this.f31623i = true;
            i4g0.m138526x("e_paip_choose_avatar_switch", OMSDialogPositon.p_chat_view);
        }
        polVar.mo68557c(act, CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.l2q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129792a.m49172T(message, (User) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49171S(this);
        this.f31618d.getPaint().setFakeBoldText(true);
        this.f31620f.getPaint().setFakeBoldText(true);
        this.f31621g.getPaint().setFakeBoldText(true);
        this.f31622h.getPaint().setFakeBoldText(true);
    }

    public ItemAiPermissionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31623i = false;
    }

    public ItemAiPermissionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31623i = false;
    }
}
