package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageTipsContent;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.bjq;
import p153l.g900;
import p153l.q8c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemEmojiText extends ItemText implements InterfaceC8682a {

    /* JADX INFO: renamed from: n */
    public int f31777n;

    /* JADX INFO: renamed from: o */
    public int f31778o;

    /* JADX INFO: renamed from: p */
    public int f31779p;

    /* JADX INFO: renamed from: q */
    public int f31780q;

    /* JADX INFO: renamed from: r */
    public Drawable f31781r;

    /* JADX INFO: renamed from: s */
    public int f31782s;

    /* JADX INFO: renamed from: t */
    public int f31783t;

    /* JADX INFO: renamed from: u */
    public int f31784u;

    /* JADX INFO: renamed from: v */
    public int f31785v;

    /* JADX INFO: renamed from: w */
    public Drawable f31786w;

    public ItemEmojiText(Context context) {
        super(context);
        this.f31777n = -1;
        this.f31778o = -1;
        this.f31779p = -1;
        this.f31780q = -1;
        this.f31781r = null;
        this.f31782s = -1;
        this.f31783t = -1;
        this.f31784u = -1;
        this.f31785v = -1;
        this.f31786w = null;
        m49312H();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemText, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        setDefaultAttr(message);
        super.mo43399A(message);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemText
    /* JADX INFO: renamed from: G */
    public void mo49311G(String str, InterfaceC8682a.a aVar, Message message) {
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            setLargeEmojiForceDisabled(true);
        }
        MessageTipsContent messageTipsContentM129476N = g900.m129476N(message);
        if (TextUtils.isEmpty(str)) {
            setMovementMethod(null);
            setText(str);
            return;
        }
        if (User.isTeamAccount(message.owner) && m49915u(str)) {
            StudentVerificationStatus verificationStatus = getVerificationStatus();
            if (CoreModule.m30933P().m143412i().mo180518p1() && NullChecker.m82486a(verificationStatus)) {
                setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                setMovementMethod(null);
            }
            setText(ItemText.m49908p(str.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            setLongClickCallBack(aVar);
            return;
        }
        if ((User.isTeamAccount(message.owner) || (NullChecker.m82486a(messageTipsContentM129476N) && !TextUtils.isEmpty(messageTipsContentM129476N.value))) && bjq.m104639b(str)) {
            setText(ItemText.m49908p(str.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            setMovementMethod(LinkMovementMethod.getInstance());
            setLongClickCallBack(aVar);
        } else {
            setMovementMethod(null);
            setText(m49912q(new SpannableStringBuilder(str)));
            m49914s();
            m49913r(str, aVar);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m49312H() {
        this.f31777n = (int) Dialog.m21446c0(getContext(), q8c0.f156098h);
        this.f31778o = (int) Dialog.m21446c0(getContext(), q8c0.f156100j);
        this.f31779p = (int) Dialog.m21446c0(getContext(), q8c0.f156099i);
        this.f31780q = (int) Dialog.m21446c0(getContext(), q8c0.f156097g);
        this.f31781r = Dialog.m21448e0(getContext(), q8c0.f156096f);
        this.f31782s = (int) Dialog.m21446c0(getContext(), q8c0.f156092b);
        this.f31783t = (int) Dialog.m21446c0(getContext(), q8c0.f156094d);
        this.f31784u = (int) Dialog.m21446c0(getContext(), q8c0.f156093c);
        this.f31785v = (int) Dialog.m21446c0(getContext(), q8c0.f156091a);
        this.f31786w = Dialog.m21448e0(getContext(), q8c0.f156095e);
    }

    public void setDefaultAttr(Message message) {
        if (message.isMe()) {
            setPaddingRelative(this.f31777n, this.f31778o, this.f31779p, this.f31780q);
            setBackground(this.f31781r);
        } else {
            setPaddingRelative(this.f31782s, this.f31783t, this.f31784u, this.f31785v);
            setBackground(this.f31786w);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemText, com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: y */
    public void mo49313y(Message message, InterfaceC8682a.a aVar) {
        setDefaultAttr(message);
        super.mo49313y(message, aVar);
    }

    public ItemEmojiText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31777n = -1;
        this.f31778o = -1;
        this.f31779p = -1;
        this.f31780q = -1;
        this.f31781r = null;
        this.f31782s = -1;
        this.f31783t = -1;
        this.f31784u = -1;
        this.f31785v = -1;
        this.f31786w = null;
        m49312H();
    }

    public ItemEmojiText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31777n = -1;
        this.f31778o = -1;
        this.f31779p = -1;
        this.f31780q = -1;
        this.f31781r = null;
        this.f31782s = -1;
        this.f31783t = -1;
        this.f31784u = -1;
        this.f31785v = -1;
        this.f31786w = null;
        m49312H();
    }
}
