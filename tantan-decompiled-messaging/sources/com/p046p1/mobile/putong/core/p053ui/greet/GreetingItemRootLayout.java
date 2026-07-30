package com.p046p1.mobile.putong.core.p053ui.greet;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageExtData;
import com.p046p1.mobile.putong.core.data.MessageTipsContent;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetingItemRootLayout;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.c3c0;
import p149l.d30;
import p149l.dml;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.rdm;
import p149l.t100;
import p149l.xdl0;
import p149l.xma;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class GreetingItemRootLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f29424a;

    /* JADX INFO: renamed from: b */
    public ViewStub f29425b;

    /* JADX INFO: renamed from: c */
    public ViewStub f29426c;

    /* JADX INFO: renamed from: d */
    public View f29427d;

    /* JADX INFO: renamed from: e */
    public View f29428e;

    /* JADX INFO: renamed from: f */
    public VText f29429f;

    /* JADX INFO: renamed from: g */
    public ItemGreetGuidePic f29430g;

    public GreetingItemRootLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45756a(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m45761f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public Act m45762g() {
        return (Act) getContext();
    }

    public View getRealRenderView() {
        return getChildAt(0);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m45763h(String str) {
        return TextUtils.equals(str, "instantChat");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m45764i(User user) {
        boolean zIsFemale = user.isFemale();
        VText vText = this.f29429f;
        if (zIsFemale) {
            vText.setText("解锁黑金会员，立即与她畅聊");
        } else {
            vText.setText("解锁黑金会员，立即与他畅聊");
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m45765j(User user) {
        CoreModule.m29935P().m94658i().mo158206B1(m45762g(), user);
        m45762g().m66873d2();
        CoreModule.f17545c.f19642f0.m32650Fo();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m45766k(final User user) {
        CoreModule.m29935P().m94658i().mo158316V(m45762g(), user, new d30() { // from class: l.sak
            @Override // p149l.d30
            public final void call() {
                this.f163416a.m45765j(user);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m45767l(MessageTipsContent messageTipsContent, String str, dml dmlVar, View view) {
        CoreModule.f17545c.f19555C0.m210115x4();
        if (!TextUtils.isEmpty(messageTipsContent.statsModuleId)) {
            zvf0.m220399u(messageTipsContent.statsModuleId, "p_kankan_chat_popup", j760.m140076a("other_user_id", str), j760.m140076a("is_blackgold", xma.m210043F3() ? "1" : 0));
        }
        if (xma.m210043F3()) {
            dmlVar.mo67374c(m45762g(), CoreModule.f17545c.f19639e0.m169410Ka(str).first()).subscribe(mkd0.m154956H(new e30() { // from class: l.qak
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153542a.m45766k((User) obj);
                }
            }, new e30() { // from class: l.rak
                @Override // p149l.e30
                public final void call(Object obj) {
                    GreetingItemRootLayout.m45756a((Throwable) obj);
                }
            }));
        } else {
            CoreModule.m29935P().m94654e().mo34964Do(m45762g(), str, "p_chat_greet,odiamond_sayhi");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m45768m(Message message, int i, dml dmlVar, rdm rdmVar) {
        xdl0.m208344M(this.f29424a, false);
        if (NullChecker.m81303a(this.f29427d)) {
            xdl0.m208344M(this.f29427d, false);
        }
        if (NullChecker.m81303a(this.f29430g)) {
            xdl0.m208344M(this.f29430g, false);
        }
        if (message.isMe() && NullChecker.m81303a(message.extData) && NullChecker.m81303a(message.extData.greetingTips) && NullChecker.m81303a(message.extData.greetingTips.selfShown) && TextUtils.equals(message.extData.greetingTips.selfShown.style, "sendPhoto")) {
            if (this.f29430g == null) {
                this.f29430g = (ItemGreetGuidePic) this.f29426c.inflate();
            }
            xdl0.m208344M(this.f29430g, true);
            this.f29430g.m45806O(message.cid);
            return;
        }
        if (NullChecker.m81303a(message.extData) && NullChecker.m81303a(message.extData.greetingTips)) {
            boolean zIsMe = message.isMe();
            MessageExtData messageExtData = message.extData;
            if (zIsMe) {
                if (!NullChecker.m81303a(messageExtData.greetingTips.selfShown) || TextUtils.isEmpty(message.extData.greetingTips.selfShown.value)) {
                    return;
                }
                if (m45763h(message.extData.greetingTips.selfShown.style)) {
                    m45769n(message, dmlVar, rdmVar);
                    return;
                }
                m45771p(message.extData.greetingTips.selfShown.style);
                this.f29424a.setText(message.extData.greetingTips.selfShown.value);
                xdl0.m208344M(this.f29424a, true);
                return;
            }
            if (!NullChecker.m81303a(messageExtData.greetingTips.otherShown) || TextUtils.isEmpty(message.extData.greetingTips.otherShown.value)) {
                return;
            }
            if (m45763h(message.extData.greetingTips.selfShown.style)) {
                m45769n(message, dmlVar, rdmVar);
                return;
            }
            m45771p(message.extData.greetingTips.otherShown.style);
            this.f29424a.setText(message.extData.greetingTips.otherShown.value);
            xdl0.m208344M(this.f29424a, true);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m45769n(Message message, dml dmlVar, rdm rdmVar) {
        if (this.f29427d == null) {
            View viewInflate = this.f29425b.inflate();
            this.f29427d = viewInflate;
            this.f29428e = viewInflate.findViewById(y4c0.f196060V2);
            this.f29429f = (VText) this.f29427d.findViewById(y4c0.f196066W2);
            ((VText) this.f29427d.findViewById(y4c0.f196072X2)).getPaint().setFakeBoldText(true);
        }
        String str = message.f56011id;
        boolean zIsMe = message.isMe();
        MessageExtData messageExtData = message.extData;
        m45770o(str, zIsMe ? messageExtData.greetingTips.selfShown : messageExtData.greetingTips.otherShown, message.isMe() ? message.cid : message.owner, dmlVar, rdmVar);
        xdl0.m208344M(this.f29427d, true);
    }

    /* JADX INFO: renamed from: o */
    public final void m45770o(String str, final MessageTipsContent messageTipsContent, final String str2, final dml dmlVar, rdm rdmVar) {
        if (!rdmVar.m178976a(str)) {
            rdmVar.m178977b(str);
            if (!TextUtils.isEmpty(messageTipsContent.statsModuleId)) {
                zvf0.m220368A(messageTipsContent.statsModuleId, "p_kankan_chat_popup", j760.m140076a("other_user_id", str2), j760.m140076a("is_blackgold", xma.m210043F3() ? "1" : 0));
            }
        }
        dmlVar.mo67374c(m45762g(), CoreModule.f17545c.f19639e0.m169410Ka(str2).first()).subscribe(mkd0.m154956H(new e30() { // from class: l.nak
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137912a.m45764i((User) obj);
            }
        }, new e30() { // from class: l.oak
            @Override // p149l.e30
            public final void call(Object obj) {
                GreetingItemRootLayout.m45761f((Throwable) obj);
            }
        }));
        if (NullChecker.m81303a(this.f29428e)) {
            xdl0.m208329E0(this.f29428e, new View.OnClickListener() { // from class: l.pak
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147983a.m45767l(messageTipsContent, str2, dmlVar, view);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setClipChildren(false);
        setClipToPadding(false);
        this.f29424a = (VText) findViewById(y4c0.f196027Q);
        this.f29425b = (ViewStub) findViewById(y4c0.f195994K2);
        this.f29426c = (ViewStub) findViewById(y4c0.f196123f0);
    }

    /* JADX INFO: renamed from: p */
    public final void m45771p(String str) {
        boolean zEquals = TextUtils.equals(str, "blackDiamond");
        VText vText = this.f29424a;
        if (zEquals) {
            xdl0.m208383k(vText, getContext().getResources().getDrawable(c3c0.f78765i0));
            this.f29424a.setTextColor(Color.parseColor("#ffedd7a3"));
            VText vText2 = this.f29424a;
            int i = t100.f167261j;
            int i2 = t100.f167256e;
            vText2.setPadding(i, i2, i, i2);
            this.f29424a.setBackgroundResource(c3c0.f78923z5);
            return;
        }
        vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f29424a.setTextColor(Color.parseColor("#4c000000"));
        this.f29424a.setBackgroundColor(0);
        VText vText3 = this.f29424a;
        int i3 = t100.f167261j;
        int i4 = t100.f167256e;
        vText3.setPadding(i3, i4, i3, i4);
    }

    public GreetingItemRootLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GreetingItemRootLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
