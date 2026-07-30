package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAiPermissionLayout;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p149l.dml;
import p149l.e30;
import p149l.j760;
import p149l.knb0;
import p149l.mkd0;
import p149l.o0q;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAiPermissionLayout extends VLinear implements InterfaceC8519a {

    /* JADX INFO: renamed from: c */
    public ItemAiPermissionLayout f30769c;

    /* JADX INFO: renamed from: d */
    public VText f30770d;

    /* JADX INFO: renamed from: e */
    public VText f30771e;

    /* JADX INFO: renamed from: f */
    public VText f30772f;

    /* JADX INFO: renamed from: g */
    public VText f30773g;

    /* JADX INFO: renamed from: h */
    public VText f30774h;

    /* JADX INFO: renamed from: i */
    public boolean f30775i;

    public ItemAiPermissionLayout(Context context) {
        super(context);
        this.f30775i = false;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m47985P(Message message, View view) {
        zvf0.m220399u("e_paip_choose_avatar_switch", OMSDialogPositon.p_chat_view, j760.m140076a("switch_config_type", "0"));
        CoreModule.f17545c.f19617W1.m137464h3(false, message.cid);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m47987R(Message message, View view) {
        zvf0.m220399u("e_paip_choose_avatar_switch", OMSDialogPositon.p_chat_view, j760.m140076a("switch_config_type", "1"));
        CoreModule.f17545c.f19617W1.m137464h3(true, message.cid);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final void m47988S(View view) {
        o0q.m162163a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m47989T(final Message message, User user) {
        String aiPictureStatus = user.getAiPictureStatus();
        if (TextUtils.equals(aiPictureStatus, "true") || TextUtils.equals(aiPictureStatus, "false")) {
            xdl0.m208344M(this.f30772f, false);
            xdl0.m208344M(this.f30773g, false);
            xdl0.m208344M(this.f30774h, true);
            this.f30774h.setText(TextUtils.equals(aiPictureStatus, "true") ? "已允许" : "已拒绝");
            return;
        }
        xdl0.m208344M(this.f30772f, true);
        xdl0.m208344M(this.f30773g, true);
        xdl0.m208344M(this.f30774h, false);
        xdl0.m208329E0(this.f30772f, new View.OnClickListener() { // from class: l.m0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemAiPermissionLayout.m47985P(message, view);
            }
        });
        xdl0.m208329E0(this.f30773g, new View.OnClickListener() { // from class: l.n0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemAiPermissionLayout.m47987R(message, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(dml dmlVar, final Message message, InterfaceC8519a.a aVar) {
        super.mo47990U(dmlVar, message, aVar);
        Act act = xdl0.m208328E(this) instanceof Act ? (Act) xdl0.m208328E(this) : null;
        if (act == null) {
            return;
        }
        if (!this.f30775i) {
            this.f30775i = true;
            zvf0.m220402x("e_paip_choose_avatar_switch", OMSDialogPositon.p_chat_view);
        }
        dmlVar.mo67374c(act, CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.l0q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125557a.m47989T(message, (User) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47988S(this);
        this.f30770d.getPaint().setFakeBoldText(true);
        this.f30772f.getPaint().setFakeBoldText(true);
        this.f30773g.getPaint().setFakeBoldText(true);
        this.f30774h.getPaint().setFakeBoldText(true);
    }

    public ItemAiPermissionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30775i = false;
    }

    public ItemAiPermissionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30775i = false;
    }
}
