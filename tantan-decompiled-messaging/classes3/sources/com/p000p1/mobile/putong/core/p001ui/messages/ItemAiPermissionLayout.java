package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemAiPermissionLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.j760;
import l.knb0;
import l.mkd0;
import l.o0q;
import l.xdl0;
import l.zvf0;
import p003l.dml;
import p003l.e30;
import p003l.m250;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemAiPermissionLayout extends VLinear implements InterfaceC0102a {

    /* JADX INFO: renamed from: c */
    public ItemAiPermissionLayout f660c;

    /* JADX INFO: renamed from: d */
    public VText f661d;

    /* JADX INFO: renamed from: e */
    public VText f662e;

    /* JADX INFO: renamed from: f */
    public VText f663f;

    /* JADX INFO: renamed from: g */
    public VText f664g;

    /* JADX INFO: renamed from: h */
    public VText f665h;

    /* JADX INFO: renamed from: i */
    public boolean f666i;

    public ItemAiPermissionLayout(Context context) {
        super(context);
        this.f666i = false;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m1063P(Message message, View view) {
        zvf0.u("e_paip_choose_avatar_switch", "p_chat_view", new j760[]{j760.a("switch_config_type", "0")});
        CoreModule.c.W1.h3(false, message.cid);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m1065R(Message message, View view) {
        zvf0.u("e_paip_choose_avatar_switch", "p_chat_view", new j760[]{j760.a("switch_config_type", "1")});
        CoreModule.c.W1.h3(true, message.cid);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final void m1066S(View view) {
        o0q.a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m1067T(final Message message, User user) {
        String aiPictureStatus = user.getAiPictureStatus();
        if (TextUtils.equals(aiPictureStatus, "true") || TextUtils.equals(aiPictureStatus, "false")) {
            xdl0.M(this.f663f, false);
            xdl0.M(this.f664g, false);
            xdl0.M(this.f665h, true);
            this.f665h.setText(TextUtils.equals(aiPictureStatus, "true") ? "已允许" : "已拒绝");
            return;
        }
        xdl0.M(this.f663f, true);
        xdl0.M(this.f664g, true);
        xdl0.M(this.f665h, false);
        xdl0.E0(this.f663f, new View.OnClickListener() { // from class: l.m0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemAiPermissionLayout.m1063P(message, view);
            }
        });
        xdl0.E0(this.f664g, new View.OnClickListener() { // from class: l.n0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemAiPermissionLayout.m1065R(message, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: U */
    public void mo1068U(dml dmlVar, final Message message, InterfaceC0102a.a aVar) {
        super.mo1068U(dmlVar, message, aVar);
        Act actE = xdl0.E(this) instanceof Act ? xdl0.E(this) : null;
        if (actE == null) {
            return;
        }
        if (!this.f666i) {
            this.f666i = true;
            zvf0.x("e_paip_choose_avatar_switch", "p_chat_view");
        }
        dmlVar.mo3522c(actE, CoreModule.c.e0.o9().distinctUntilChanged()).subscribe((m250) mkd0.G(new e30() { // from class: l.l0q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5147a.m1067T(message, (User) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1066S(this);
        this.f661d.getPaint().setFakeBoldText(true);
        this.f663f.getPaint().setFakeBoldText(true);
        this.f664g.getPaint().setFakeBoldText(true);
        this.f665h.getPaint().setFakeBoldText(true);
    }

    public ItemAiPermissionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f666i = false;
    }

    public ItemAiPermissionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f666i = false;
    }
}
