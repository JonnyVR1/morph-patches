package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageTipsContent;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.bhq;
import l.l0c0;
import p003l.j000;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemEmojiText extends ItemText implements InterfaceC0102a {

    /* JADX INFO: renamed from: n */
    public int f820n;

    /* JADX INFO: renamed from: o */
    public int f821o;

    /* JADX INFO: renamed from: p */
    public int f822p;

    /* JADX INFO: renamed from: q */
    public int f823q;

    /* JADX INFO: renamed from: r */
    public Drawable f824r;

    /* JADX INFO: renamed from: s */
    public int f825s;

    /* JADX INFO: renamed from: t */
    public int f826t;

    /* JADX INFO: renamed from: u */
    public int f827u;

    /* JADX INFO: renamed from: v */
    public int f828v;

    /* JADX INFO: renamed from: w */
    public Drawable f829w;

    public ItemEmojiText(Context context) {
        super(context);
        this.f820n = -1;
        this.f821o = -1;
        this.f822p = -1;
        this.f823q = -1;
        this.f824r = null;
        this.f825s = -1;
        this.f826t = -1;
        this.f827u = -1;
        this.f828v = -1;
        this.f829w = null;
        m1209H();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemText, com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        setDefaultAttr(message);
        super.mo1056A(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemText
    /* JADX INFO: renamed from: G */
    public void mo1208G(String str, InterfaceC0102a.a aVar, Message message) {
        if (CoreModule.P().i().G1()) {
            setLargeEmojiForceDisabled(true);
        }
        MessageTipsContent messageTipsContentM5264N = j000.m5264N(message);
        if (TextUtils.isEmpty(str)) {
            setMovementMethod(null);
            setText(str);
            return;
        }
        if (User.isTeamAccount(message.owner) && m1816u(str)) {
            StudentVerificationStatus verificationStatus = getVerificationStatus();
            if (CoreModule.P().i().p1() && NullChecker.a(verificationStatus)) {
                setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                setMovementMethod(null);
            }
            setText(ItemText.m1809p(str.replaceAll("\n", "<br/>"), message));
            setLongClickCallBack(aVar);
            return;
        }
        if ((User.isTeamAccount(message.owner) || (NullChecker.a(messageTipsContentM5264N) && !TextUtils.isEmpty(messageTipsContentM5264N.value))) && bhq.b(str)) {
            setText(ItemText.m1809p(str.replaceAll("\n", "<br/>"), message));
            setMovementMethod(LinkMovementMethod.getInstance());
            setLongClickCallBack(aVar);
        } else {
            setMovementMethod(null);
            setText(m1813q(new SpannableStringBuilder(str)));
            m1815s();
            m1814r(str, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public final void m1209H() {
        this.f820n = (int) Dialog.c0(getContext(), l0c0.h);
        this.f821o = (int) Dialog.c0(getContext(), l0c0.j);
        this.f822p = (int) Dialog.c0(getContext(), l0c0.i);
        this.f823q = (int) Dialog.c0(getContext(), l0c0.g);
        this.f824r = Dialog.e0(getContext(), l0c0.f);
        this.f825s = (int) Dialog.c0(getContext(), l0c0.b);
        this.f826t = (int) Dialog.c0(getContext(), l0c0.d);
        this.f827u = (int) Dialog.c0(getContext(), l0c0.c);
        this.f828v = (int) Dialog.c0(getContext(), l0c0.a);
        this.f829w = Dialog.e0(getContext(), l0c0.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDefaultAttr(Message message) {
        if (message.isMe()) {
            setPaddingRelative(this.f820n, this.f821o, this.f822p, this.f823q);
            setBackground(this.f824r);
        } else {
            setPaddingRelative(this.f825s, this.f826t, this.f827u, this.f828v);
            setBackground(this.f829w);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemText, com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: y */
    public void mo1210y(Message message, InterfaceC0102a.a aVar) {
        setDefaultAttr(message);
        super.mo1210y(message, aVar);
    }

    public ItemEmojiText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f820n = -1;
        this.f821o = -1;
        this.f822p = -1;
        this.f823q = -1;
        this.f824r = null;
        this.f825s = -1;
        this.f826t = -1;
        this.f827u = -1;
        this.f828v = -1;
        this.f829w = null;
        m1209H();
    }

    public ItemEmojiText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f820n = -1;
        this.f821o = -1;
        this.f822p = -1;
        this.f823q = -1;
        this.f824r = null;
        this.f825s = -1;
        this.f826t = -1;
        this.f827u = -1;
        this.f828v = -1;
        this.f829w = null;
        m1209H();
    }
}
