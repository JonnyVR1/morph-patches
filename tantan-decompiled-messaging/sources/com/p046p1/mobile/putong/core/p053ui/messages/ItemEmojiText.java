package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageTipsContent;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.bhq;
import p149l.j000;
import p149l.l0c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemEmojiText extends ItemText implements InterfaceC8519a {

    /* JADX INFO: renamed from: n */
    public int f30929n;

    /* JADX INFO: renamed from: o */
    public int f30930o;

    /* JADX INFO: renamed from: p */
    public int f30931p;

    /* JADX INFO: renamed from: q */
    public int f30932q;

    /* JADX INFO: renamed from: r */
    public Drawable f30933r;

    /* JADX INFO: renamed from: s */
    public int f30934s;

    /* JADX INFO: renamed from: t */
    public int f30935t;

    /* JADX INFO: renamed from: u */
    public int f30936u;

    /* JADX INFO: renamed from: v */
    public int f30937v;

    /* JADX INFO: renamed from: w */
    public Drawable f30938w;

    public ItemEmojiText(Context context) {
        super(context);
        this.f30929n = -1;
        this.f30930o = -1;
        this.f30931p = -1;
        this.f30932q = -1;
        this.f30933r = null;
        this.f30934s = -1;
        this.f30935t = -1;
        this.f30936u = -1;
        this.f30937v = -1;
        this.f30938w = null;
        m48129H();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemText, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        setDefaultAttr(message);
        super.mo42388A(message);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemText
    /* JADX INFO: renamed from: G */
    public void mo48128G(String str, InterfaceC8519a.a aVar, Message message) {
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            setLargeEmojiForceDisabled(true);
        }
        MessageTipsContent messageTipsContentM139089N = j000.m139089N(message);
        if (TextUtils.isEmpty(str)) {
            setMovementMethod(null);
            setText(str);
            return;
        }
        if (User.isTeamAccount(message.owner) && m48732u(str)) {
            StudentVerificationStatus verificationStatus = getVerificationStatus();
            if (CoreModule.m29935P().m94658i().mo158426p1() && NullChecker.m81303a(verificationStatus)) {
                setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                setMovementMethod(null);
            }
            setText(ItemText.m48725p(str.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            setLongClickCallBack(aVar);
            return;
        }
        if ((User.isTeamAccount(message.owner) || (NullChecker.m81303a(messageTipsContentM139089N) && !TextUtils.isEmpty(messageTipsContentM139089N.value))) && bhq.m101910b(str)) {
            setText(ItemText.m48725p(str.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
            setMovementMethod(LinkMovementMethod.getInstance());
            setLongClickCallBack(aVar);
        } else {
            setMovementMethod(null);
            setText(m48729q(new SpannableStringBuilder(str)));
            m48731s();
            m48730r(str, aVar);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m48129H() {
        this.f30929n = (int) Dialog.m20447c0(getContext(), l0c0.f125493h);
        this.f30930o = (int) Dialog.m20447c0(getContext(), l0c0.f125495j);
        this.f30931p = (int) Dialog.m20447c0(getContext(), l0c0.f125494i);
        this.f30932q = (int) Dialog.m20447c0(getContext(), l0c0.f125492g);
        this.f30933r = Dialog.m20449e0(getContext(), l0c0.f125491f);
        this.f30934s = (int) Dialog.m20447c0(getContext(), l0c0.f125487b);
        this.f30935t = (int) Dialog.m20447c0(getContext(), l0c0.f125489d);
        this.f30936u = (int) Dialog.m20447c0(getContext(), l0c0.f125488c);
        this.f30937v = (int) Dialog.m20447c0(getContext(), l0c0.f125486a);
        this.f30938w = Dialog.m20449e0(getContext(), l0c0.f125490e);
    }

    public void setDefaultAttr(Message message) {
        if (message.isMe()) {
            setPaddingRelative(this.f30929n, this.f30930o, this.f30931p, this.f30932q);
            setBackground(this.f30933r);
        } else {
            setPaddingRelative(this.f30934s, this.f30935t, this.f30936u, this.f30937v);
            setBackground(this.f30938w);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemText, com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: y */
    public void mo48130y(Message message, InterfaceC8519a.a aVar) {
        setDefaultAttr(message);
        super.mo48130y(message, aVar);
    }

    public ItemEmojiText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30929n = -1;
        this.f30930o = -1;
        this.f30931p = -1;
        this.f30932q = -1;
        this.f30933r = null;
        this.f30934s = -1;
        this.f30935t = -1;
        this.f30936u = -1;
        this.f30937v = -1;
        this.f30938w = null;
        m48129H();
    }

    public ItemEmojiText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30929n = -1;
        this.f30930o = -1;
        this.f30931p = -1;
        this.f30932q = -1;
        this.f30933r = null;
        this.f30934s = -1;
        this.f30935t = -1;
        this.f30936u = -1;
        this.f30937v = -1;
        this.f30938w = null;
        m48129H();
    }
}
