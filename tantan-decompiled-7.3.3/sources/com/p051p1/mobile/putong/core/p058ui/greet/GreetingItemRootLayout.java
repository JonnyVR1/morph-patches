package com.p051p1.mobile.putong.core.p058ui.greet;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageExtData;
import com.p051p1.mobile.putong.core.data.MessageTipsContent;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetingItemRootLayout;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.hgm;
import p153l.i4g0;
import p153l.ibc0;
import p153l.joa;
import p153l.pf60;
import p153l.pol;
import p153l.psd0;
import p153l.qa00;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class GreetingItemRootLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f30272a;

    /* JADX INFO: renamed from: b */
    public ViewStub f30273b;

    /* JADX INFO: renamed from: c */
    public ViewStub f30274c;

    /* JADX INFO: renamed from: d */
    public View f30275d;

    /* JADX INFO: renamed from: e */
    public View f30276e;

    /* JADX INFO: renamed from: f */
    public VText f30277f;

    /* JADX INFO: renamed from: g */
    public ItemGreetGuidePic f30278g;

    public GreetingItemRootLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m46939a(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m46944f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public Act m46945g() {
        return (Act) getContext();
    }

    public View getRealRenderView() {
        return getChildAt(0);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m46946h(String str) {
        return TextUtils.equals(str, "instantChat");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m46947i(User user) {
        boolean zIsFemale = user.isFemale();
        VText vText = this.f30277f;
        if (zIsFemale) {
            vText.setText("解锁黑金会员，立即与她畅聊");
        } else {
            vText.setText("解锁黑金会员，立即与他畅聊");
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m46948j(User user) {
        CoreModule.m30933P().m143412i().mo180298B1(m46945g(), user);
        m46945g().m68056e2();
        CoreModule.f18264c.f20384f0.m33653Fo();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m46949k(final User user) {
        CoreModule.m30933P().m143412i().mo180408V(m46945g(), user, new x20() { // from class: l.jdk
            @Override // p153l.x20
            public final void call() {
                this.f120271a.m46948j(user);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m46950l(MessageTipsContent messageTipsContent, String str, pol polVar, View view) {
        CoreModule.f18264c.f20297C0.m146428y4();
        if (!TextUtils.isEmpty(messageTipsContent.statsModuleId)) {
            i4g0.m138523u(messageTipsContent.statsModuleId, "p_kankan_chat_popup", pf60.m172085a("other_user_id", str), pf60.m172085a("is_blackgold", joa.m146357G3() ? "1" : 0));
        }
        if (joa.m146357G3()) {
            polVar.mo68557c(m46945g(), CoreModule.f18264c.f20381e0.m116483Ka(str).first()).subscribe(psd0.m173597H(new y20() { // from class: l.hdk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f109007a.m46949k((User) obj);
                }
            }, new y20() { // from class: l.idk
                @Override // p153l.y20
                public final void call(Object obj) {
                    GreetingItemRootLayout.m46939a((Throwable) obj);
                }
            }));
        } else {
            CoreModule.m30933P().m143408e().mo35967Do(m46945g(), str, "p_chat_greet,odiamond_sayhi");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m46951m(Message message, int i, pol polVar, hgm hgmVar) {
        bnl0.m105524M(this.f30272a, false);
        if (NullChecker.m82486a(this.f30275d)) {
            bnl0.m105524M(this.f30275d, false);
        }
        if (NullChecker.m82486a(this.f30278g)) {
            bnl0.m105524M(this.f30278g, false);
        }
        if (message.isMe() && NullChecker.m82486a(message.extData) && NullChecker.m82486a(message.extData.greetingTips) && NullChecker.m82486a(message.extData.greetingTips.selfShown) && TextUtils.equals(message.extData.greetingTips.selfShown.style, "sendPhoto")) {
            if (this.f30278g == null) {
                this.f30278g = (ItemGreetGuidePic) this.f30274c.inflate();
            }
            bnl0.m105524M(this.f30278g, true);
            this.f30278g.m46989O(message.cid);
            return;
        }
        if (NullChecker.m82486a(message.extData) && NullChecker.m82486a(message.extData.greetingTips)) {
            boolean zIsMe = message.isMe();
            MessageExtData messageExtData = message.extData;
            if (zIsMe) {
                if (!NullChecker.m82486a(messageExtData.greetingTips.selfShown) || TextUtils.isEmpty(message.extData.greetingTips.selfShown.value)) {
                    return;
                }
                if (m46946h(message.extData.greetingTips.selfShown.style)) {
                    m46952n(message, polVar, hgmVar);
                    return;
                }
                m46954p(message.extData.greetingTips.selfShown.style);
                this.f30272a.setText(message.extData.greetingTips.selfShown.value);
                bnl0.m105524M(this.f30272a, true);
                return;
            }
            if (!NullChecker.m82486a(messageExtData.greetingTips.otherShown) || TextUtils.isEmpty(message.extData.greetingTips.otherShown.value)) {
                return;
            }
            if (m46946h(message.extData.greetingTips.selfShown.style)) {
                m46952n(message, polVar, hgmVar);
                return;
            }
            m46954p(message.extData.greetingTips.otherShown.style);
            this.f30272a.setText(message.extData.greetingTips.otherShown.value);
            bnl0.m105524M(this.f30272a, true);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m46952n(Message message, pol polVar, hgm hgmVar) {
        if (this.f30275d == null) {
            View viewInflate = this.f30273b.inflate();
            this.f30275d = viewInflate;
            this.f30276e = viewInflate.findViewById(edc0.f93295V2);
            this.f30277f = (VText) this.f30275d.findViewById(edc0.f93301W2);
            ((VText) this.f30275d.findViewById(edc0.f93307X2)).getPaint().setFakeBoldText(true);
        }
        String str = message.f56859id;
        boolean zIsMe = message.isMe();
        MessageExtData messageExtData = message.extData;
        m46953o(str, zIsMe ? messageExtData.greetingTips.selfShown : messageExtData.greetingTips.otherShown, message.isMe() ? message.cid : message.owner, polVar, hgmVar);
        bnl0.m105524M(this.f30275d, true);
    }

    /* JADX INFO: renamed from: o */
    public final void m46953o(String str, final MessageTipsContent messageTipsContent, final String str2, final pol polVar, hgm hgmVar) {
        if (!hgmVar.m134950a(str)) {
            hgmVar.m134951b(str);
            if (!TextUtils.isEmpty(messageTipsContent.statsModuleId)) {
                i4g0.m138492A(messageTipsContent.statsModuleId, "p_kankan_chat_popup", pf60.m172085a("other_user_id", str2), pf60.m172085a("is_blackgold", joa.m146357G3() ? "1" : 0));
            }
        }
        polVar.mo68557c(m46945g(), CoreModule.f18264c.f20381e0.m116483Ka(str2).first()).subscribe(psd0.m173597H(new y20() { // from class: l.edk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93529a.m46947i((User) obj);
            }
        }, new y20() { // from class: l.fdk
            @Override // p153l.y20
            public final void call(Object obj) {
                GreetingItemRootLayout.m46944f((Throwable) obj);
            }
        }));
        if (NullChecker.m82486a(this.f30276e)) {
            bnl0.m105509E0(this.f30276e, new View.OnClickListener() { // from class: l.gdk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f103715a.m46950l(messageTipsContent, str2, polVar, view);
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
        this.f30272a = (VText) findViewById(edc0.f93262Q);
        this.f30273b = (ViewStub) findViewById(edc0.f93229K2);
        this.f30274c = (ViewStub) findViewById(edc0.f93358f0);
    }

    /* JADX INFO: renamed from: p */
    public final void m46954p(String str) {
        boolean zEquals = TextUtils.equals(str, "blackDiamond");
        VText vText = this.f30272a;
        if (zEquals) {
            bnl0.m105563k(vText, getContext().getResources().getDrawable(ibc0.f114040i0));
            this.f30272a.setTextColor(Color.parseColor("#ffedd7a3"));
            VText vText2 = this.f30272a;
            int i = qa00.f156323j;
            int i2 = qa00.f156318e;
            vText2.setPadding(i, i2, i, i2);
            this.f30272a.setBackgroundResource(ibc0.f114198z5);
            return;
        }
        vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f30272a.setTextColor(Color.parseColor("#4c000000"));
        this.f30272a.setBackgroundColor(0);
        VText vText3 = this.f30272a;
        int i3 = qa00.f156323j;
        int i4 = qa00.f156318e;
        vText3.setPadding(i3, i4, i3, i4);
    }

    public GreetingItemRootLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GreetingItemRootLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
