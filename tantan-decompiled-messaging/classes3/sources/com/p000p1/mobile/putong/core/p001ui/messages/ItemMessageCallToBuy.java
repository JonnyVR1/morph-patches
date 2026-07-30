package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.GaussianBlurParameters;
import com.p1.mobile.putong.data.MessageCallToBuy;
import com.p1.mobile.putong.data.MessageCallToBuyButton;
import com.p1.mobile.putong.data.MessageCallToBuyMedia;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import l.bkb0;
import l.c3c0;
import l.j760;
import l.knb0;
import l.n7q;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.eqh0;
import p003l.n000;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageCallToBuy extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemMessageCallToBuy f1039a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f1040b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1041c;

    /* JADX INFO: renamed from: d */
    public VText f1042d;

    /* JADX INFO: renamed from: e */
    public VText f1043e;

    /* JADX INFO: renamed from: f */
    public String f1044f;

    public ItemMessageCallToBuy(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        MessageCallToBuy messageCallToBuy;
        final String str = null;
        try {
            messageCallToBuy = (MessageCallToBuy) MessageCallToBuy.JSON_ADAPTER.parse(message.msgData);
            try {
                boolean zIsEmpty = TextUtils.isEmpty(messageCallToBuy.button.redirect);
                MessageCallToBuyButton messageCallToBuyButton = messageCallToBuy.button;
                if (zIsEmpty) {
                    this.f1044f = messageCallToBuyButton.href;
                } else {
                    this.f1044f = messageCallToBuyButton.redirect;
                }
                str = messageCallToBuy.cardVersion;
            } catch (IOException e) {
                e = e;
                CrashHelper.c(e);
            }
        } catch (IOException e2) {
            e = e2;
            messageCallToBuy = null;
        }
        if (!n000.m6518c(((DbObject) message).id)) {
            n000.m6524i(((DbObject) message).id);
            zvf0.A("e_ctbscard", "p_chat_view", new j760[]{j760.a("assistant_types", m1471f(this.f1044f)), j760.a("card_ui", m1472g(str))});
        }
        if (NullChecker.b(messageCallToBuy)) {
            if (!"5".equals(messageCallToBuy.cardVersion) || vwb.J(messageCallToBuy.medias)) {
                xdl0.M(this.f1040b, false);
            } else {
                xdl0.M(this.f1040b, true);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f1041c.getLayoutParams();
                layoutParams.height = t100.d(210.0f);
                this.f1041c.setLayoutParams(layoutParams);
                MessageCallToBuyMedia messageCallToBuyMedia = (MessageCallToBuyMedia) messageCallToBuy.medias.get(0);
                bkb0 bkb0Var = qib0.G;
                VDraweeView vDraweeView = this.f1041c;
                String str2 = messageCallToBuyMedia.url;
                GaussianBlurParameters gaussianBlurParameters = messageCallToBuyMedia.gaussianBlurParameters;
                bkb0Var.O(vDraweeView, str2, gaussianBlurParameters.iterations, gaussianBlurParameters.blurRadius);
            }
            this.f1042d.setTypeface(Typeface.defaultFromStyle(1));
            this.f1042d.setText(messageCallToBuy.text);
            this.f1043e.setTypeface(eqh0.m3924c(3), 1);
            this.f1043e.setText(messageCallToBuy.button.text);
            boolean zG1 = CoreModule.P().i().G1();
            VText vText = this.f1043e;
            if (zG1) {
                vText.setBackgroundResource(c3c0.S3);
            } else {
                vText.setBackgroundResource(c3c0.z);
            }
            xdl0.E0(this.f1039a, new View.OnClickListener() { // from class: l.l7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5223a.m1475j(str, view);
                }
            });
            xdl0.E0(this.f1043e, new View.OnClickListener() { // from class: l.m7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5561a.m1476k(str, view);
                }
            });
        }
        m1477l(this.f1044f, true);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m1468c(View view) {
        n7q.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public MessagesAct m1469d() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m1470e() {
        boolean zM1473h = m1473h(this.f1044f);
        String str = this.f1044f;
        if (!zM1473h) {
            if (!m1474i(str)) {
                if (!CoreModule.P().i().e2()) {
                    CoreModule.P().e().li(getContext(), "", false);
                    return;
                }
                if (TextUtils.isEmpty(this.f1044f)) {
                    this.f1044f = "tantan://vip/see?from=assistant_card";
                }
                CoreModule.P().i().Y(m1469d(), Uri.parse(this.f1044f));
                return;
            }
            Uri uri = Uri.parse(this.f1044f);
            Privilege privilegeO5 = CoreModule.P().i().O5(uri.getQueryParameter("privilege"));
            if (NullChecker.a(privilegeO5) && CoreModule.P().i().e2()) {
                CoreModule.P().i().pr(m1469d(), "p_chat_view,e_assistant_see,click", privilegeO5);
                return;
            } else {
                CoreModule.P().i().Y(m1469d(), uri);
                return;
            }
        }
        Uri uri2 = Uri.parse(str);
        Privilege privilegeO6 = CoreModule.P().i().O5(uri2.getQueryParameter("privilege"));
        String queryParameter = uri2.getQueryParameter("active");
        if (!NullChecker.a(privilegeO6) || CoreModule.P().g().Fs()) {
            CoreModule.P().i().Y(m1469d(), uri2);
            return;
        }
        if (TextUtils.equals(queryParameter, "quick_chat") && !CoreModule.P().i().F5()) {
            CoreModule.P().i().Y(m1469d(), uri2);
        } else if (!TextUtils.equals(queryParameter, "voice_quick_chat") || CoreModule.P().i().l2() <= 0) {
            CoreModule.P().i().pr(m1469d(), "p_chat,assistant_quickchat", privilegeO6);
        } else {
            CoreModule.P().i().Y(m1469d(), uri2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m1471f(String str) {
        if (m1473h(str)) {
            return "quickchat";
        }
        return m1474i(str) ? "see" : "other";
    }

    /* JADX INFO: renamed from: g */
    public final String m1472g(String str) {
        if ("2".equals(str)) {
            return "small_pics";
        }
        if ("3".equals(str)) {
            return "large_pic";
        }
        if ("4".equals(str)) {
            return "small_card_pic";
        }
        return "5".equals(str) ? "large_card_pic" : "content";
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1473h(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("tantanapp://quickChat2Floor");
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1474i(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("tantanapp://vip/see");
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m1475j(String str, View view) {
        zvf0.u("e_ctbscard", "p_chat_view", new j760[]{j760.a("assistant_types", m1471f(this.f1044f)), j760.a("card_ui", m1472g(str))});
        m1470e();
        m1477l(this.f1044f, false);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m1476k(String str, View view) {
        zvf0.u("e_ctbscard_button", "p_chat_view", new j760[]{j760.a("assistant_types", m1471f(this.f1044f)), j760.a("card_ui", m1472g(str)), j760.a("father_e", "e_ctbscard")});
        m1470e();
        m1477l(this.f1044f, false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX INFO: renamed from: l */
    public final void m1477l(String str, boolean z) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String authority = uri.getAuthority();
            String path = uri.getPath();
            if (scheme.startsWith("tantan")) {
                String str2 = "quickchat";
                if (TextUtils.equals(authority, "vip")) {
                    if (!TextUtils.equals(path, "/quickchat")) {
                        if (TextUtils.equals(path, "/see")) {
                            str2 = "call2buysee";
                        } else if (TextUtils.equals("/partner", path)) {
                            str2 = "supremePartner";
                        } else {
                            str2 = null;
                        }
                    }
                } else if (!TextUtils.equals(authority, "quickChat2Floor")) {
                    str2 = null;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (z) {
                    zvf0.A("e_vas_guide_assistant", "p_chat_view", new j760[]{vwb.Y("vas_guide_type", str2)});
                } else {
                    zvf0.u("e_vas_guide_assistant", "p_chat_view", new j760[]{vwb.Y("vas_guide_type", str2)});
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1468c(this);
    }

    public ItemMessageCallToBuy(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageCallToBuy(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
