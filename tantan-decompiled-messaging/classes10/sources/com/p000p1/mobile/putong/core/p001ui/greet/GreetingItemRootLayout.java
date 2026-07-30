package com.p000p1.mobile.putong.core.p001ui.greet;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageExtData;
import com.p000p1.mobile.putong.core.data.MessageTipsContent;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetingItemRootLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.dml;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.xdl0;
import l.xma;
import l.zvf0;
import p003l.c3c0;
import p003l.rdm;
import p003l.y4c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GreetingItemRootLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f1818a;

    /* JADX INFO: renamed from: b */
    public ViewStub f1819b;

    /* JADX INFO: renamed from: c */
    public ViewStub f1820c;

    /* JADX INFO: renamed from: d */
    public View f1821d;

    /* JADX INFO: renamed from: e */
    public View f1822e;

    /* JADX INFO: renamed from: f */
    public VText f1823f;

    /* JADX INFO: renamed from: g */
    public ItemGreetGuidePic f1824g;

    public GreetingItemRootLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3094a(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m3099f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public Act m3100g() {
        return getContext();
    }

    public View getRealRenderView() {
        return getChildAt(0);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3101h(String str) {
        return TextUtils.equals(str, "instantChat");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m3102i(User user) {
        boolean zIsFemale = user.isFemale();
        VText vText = this.f1823f;
        if (zIsFemale) {
            vText.setText("解锁黑金会员，立即与她畅聊");
        } else {
            vText.setText("解锁黑金会员，立即与他畅聊");
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m3103j(User user) {
        CoreModule.P().i().B1(m3100g(), user);
        m3100g().finish();
        CoreModule.c.f0.Fo();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m3104k(final User user) {
        CoreModule.P().i().V(m3100g(), user, new d30() { // from class: l.sak
            public final void call() {
                this.f7319a.m3103j(user);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m3105l(MessageTipsContent messageTipsContent, String str, dml dmlVar, View view) {
        CoreModule.c.C0.x4();
        if (!TextUtils.isEmpty(messageTipsContent.statsModuleId)) {
            zvf0.u(messageTipsContent.statsModuleId, "p_kankan_chat_popup", new j760[]{j760.a("other_user_id", str), j760.a("is_blackgold", xma.F3() ? "1" : 0)});
        }
        if (xma.F3()) {
            dmlVar.c(m3100g(), CoreModule.c.e0.Ka(str).first()).subscribe(mkd0.H(new e30() { // from class: l.qak
                public final void call(Object obj) {
                    this.f6998a.m3104k((User) obj);
                }
            }, new e30() { // from class: l.rak
                public final void call(Object obj) {
                    GreetingItemRootLayout.m3094a((Throwable) obj);
                }
            }));
        } else {
            CoreModule.P().e().Do(m3100g(), str, "p_chat_greet,odiamond_sayhi");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m3106m(Message message, int i, dml dmlVar, rdm rdmVar) {
        xdl0.M(this.f1818a, false);
        if (NullChecker.a(this.f1821d)) {
            xdl0.M(this.f1821d, false);
        }
        if (NullChecker.a(this.f1824g)) {
            xdl0.M(this.f1824g, false);
        }
        if (message.isMe() && NullChecker.a(message.extData) && NullChecker.a(message.extData.greetingTips) && NullChecker.a(message.extData.greetingTips.selfShown) && TextUtils.equals(message.extData.greetingTips.selfShown.style, "sendPhoto")) {
            if (this.f1824g == null) {
                this.f1824g = (ItemGreetGuidePic) this.f1820c.inflate();
            }
            xdl0.M(this.f1824g, true);
            this.f1824g.m3147O(message.cid);
            return;
        }
        if (NullChecker.a(message.extData) && NullChecker.a(message.extData.greetingTips)) {
            boolean zIsMe = message.isMe();
            MessageExtData messageExtData = message.extData;
            if (zIsMe) {
                if (!NullChecker.a(messageExtData.greetingTips.selfShown) || TextUtils.isEmpty(message.extData.greetingTips.selfShown.value)) {
                    return;
                }
                if (m3101h(message.extData.greetingTips.selfShown.style)) {
                    m3107n(message, dmlVar, rdmVar);
                    return;
                }
                m3109p(message.extData.greetingTips.selfShown.style);
                this.f1818a.setText(message.extData.greetingTips.selfShown.value);
                xdl0.M(this.f1818a, true);
                return;
            }
            if (!NullChecker.a(messageExtData.greetingTips.otherShown) || TextUtils.isEmpty(message.extData.greetingTips.otherShown.value)) {
                return;
            }
            if (m3101h(message.extData.greetingTips.selfShown.style)) {
                m3107n(message, dmlVar, rdmVar);
                return;
            }
            m3109p(message.extData.greetingTips.otherShown.style);
            this.f1818a.setText(message.extData.greetingTips.otherShown.value);
            xdl0.M(this.f1818a, true);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3107n(Message message, dml dmlVar, rdm rdmVar) {
        if (this.f1821d == null) {
            View viewInflate = this.f1819b.inflate();
            this.f1821d = viewInflate;
            this.f1822e = viewInflate.findViewById(y4c0.f8777V2);
            this.f1823f = this.f1821d.findViewById(y4c0.f8783W2);
            this.f1821d.findViewById(y4c0.f8789X2).getPaint().setFakeBoldText(true);
        }
        String str = ((DbObject) message).id;
        boolean zIsMe = message.isMe();
        MessageExtData messageExtData = message.extData;
        m3108o(str, zIsMe ? messageExtData.greetingTips.selfShown : messageExtData.greetingTips.otherShown, message.isMe() ? message.cid : message.owner, dmlVar, rdmVar);
        xdl0.M(this.f1821d, true);
    }

    /* JADX INFO: renamed from: o */
    public final void m3108o(String str, final MessageTipsContent messageTipsContent, final String str2, final dml dmlVar, rdm rdmVar) {
        if (!rdmVar.m9131a(str)) {
            rdmVar.m9132b(str);
            if (!TextUtils.isEmpty(messageTipsContent.statsModuleId)) {
                zvf0.A(messageTipsContent.statsModuleId, "p_kankan_chat_popup", new j760[]{j760.a("other_user_id", str2), j760.a("is_blackgold", xma.F3() ? "1" : 0)});
            }
        }
        dmlVar.c(m3100g(), CoreModule.c.e0.Ka(str2).first()).subscribe(mkd0.H(new e30() { // from class: l.nak
            public final void call(Object obj) {
                this.f6497a.m3102i((User) obj);
            }
        }, new e30() { // from class: l.oak
            public final void call(Object obj) {
                GreetingItemRootLayout.m3099f((Throwable) obj);
            }
        }));
        if (NullChecker.a(this.f1822e)) {
            xdl0.E0(this.f1822e, new View.OnClickListener() { // from class: l.pak
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6838a.m3105l(messageTipsContent, str2, dmlVar, view);
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
        this.f1818a = findViewById(y4c0.f8744Q);
        this.f1819b = (ViewStub) findViewById(y4c0.f8711K2);
        this.f1820c = (ViewStub) findViewById(y4c0.f8840f0);
    }

    /* JADX INFO: renamed from: p */
    public final void m3109p(String str) {
        boolean zEquals = TextUtils.equals(str, "blackDiamond");
        VText vText = this.f1818a;
        if (zEquals) {
            xdl0.k(vText, getContext().getResources().getDrawable(c3c0.f3802i0));
            this.f1818a.setTextColor(Color.parseColor("#ffedd7a3"));
            VText vText2 = this.f1818a;
            int i = t100.j;
            int i2 = t100.e;
            vText2.setPadding(i, i2, i, i2);
            this.f1818a.setBackgroundResource(c3c0.f3960z5);
            return;
        }
        vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f1818a.setTextColor(Color.parseColor("#4c000000"));
        this.f1818a.setBackgroundColor(0);
        VText vText3 = this.f1818a;
        int i3 = t100.j;
        int i4 = t100.e;
        vText3.setPadding(i3, i4, i3, i4);
    }

    public GreetingItemRootLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GreetingItemRootLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
