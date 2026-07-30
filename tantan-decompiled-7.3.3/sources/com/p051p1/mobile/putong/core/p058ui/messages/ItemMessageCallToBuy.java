package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.GaussianBlurParameters;
import com.p051p1.mobile.putong.data.MessageCallToBuy;
import com.p051p1.mobile.putong.data.MessageCallToBuyButton;
import com.p051p1.mobile.putong.data.MessageCallToBuyMedia;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.UnlockConversationType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.fsb0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.k900;
import p153l.lyh0;
import p153l.n9q;
import p153l.ovb0;
import p153l.pf60;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageCallToBuy extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemMessageCallToBuy f31996a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f31997b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31998c;

    /* JADX INFO: renamed from: d */
    public VText f31999d;

    /* JADX INFO: renamed from: e */
    public VText f32000e;

    /* JADX INFO: renamed from: f */
    public String f32001f;

    public ItemMessageCallToBuy(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        MessageCallToBuy messageCallToBuy;
        final String str = null;
        try {
            messageCallToBuy = MessageCallToBuy.JSON_ADAPTER.parse(message.msgData);
            try {
                boolean zIsEmpty = TextUtils.isEmpty(messageCallToBuy.button.redirect);
                MessageCallToBuyButton messageCallToBuyButton = messageCallToBuy.button;
                if (zIsEmpty) {
                    this.f32001f = messageCallToBuyButton.href;
                } else {
                    this.f32001f = messageCallToBuyButton.redirect;
                }
                str = messageCallToBuy.cardVersion;
            } catch (IOException e) {
                e = e;
                CrashHelper.m82479c(e);
            }
        } catch (IOException e2) {
            e = e2;
            messageCallToBuy = null;
        }
        if (!k900.m148791c(message.f56859id)) {
            k900.m148797i(message.f56859id);
            i4g0.m138492A("e_ctbscard", OMSDialogPositon.p_chat_view, pf60.m172085a("assistant_types", m49570f(this.f32001f)), pf60.m172085a("card_ui", m49571g(str)));
        }
        if (NullChecker.m82487b(messageCallToBuy)) {
            if (!"5".equals(messageCallToBuy.cardVersion) || jyb.m147479J(messageCallToBuy.medias)) {
                bnl0.m105524M(this.f31997b, false);
            } else {
                bnl0.m105524M(this.f31997b, true);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31998c.getLayoutParams();
                layoutParams.height = qa00.m175859d(210.0f);
                this.f31998c.setLayoutParams(layoutParams);
                MessageCallToBuyMedia messageCallToBuyMedia = messageCallToBuy.medias.get(0);
                fsb0 fsb0Var = uqb0.f180374G;
                VDraweeView vDraweeView = this.f31998c;
                String str2 = messageCallToBuyMedia.url;
                GaussianBlurParameters gaussianBlurParameters = messageCallToBuyMedia.gaussianBlurParameters;
                fsb0Var.m127120O(vDraweeView, str2, gaussianBlurParameters.iterations, gaussianBlurParameters.blurRadius);
            }
            this.f31999d.setTypeface(Typeface.defaultFromStyle(1));
            this.f31999d.setText(messageCallToBuy.text);
            this.f32000e.setTypeface(lyh0.m156283c(3), 1);
            this.f32000e.setText(messageCallToBuy.button.text);
            boolean zMo180325G1 = CoreModule.m30933P().m143412i().mo180325G1();
            VText vText = this.f32000e;
            if (zMo180325G1) {
                vText.setBackgroundResource(ibc0.f113907S3);
            } else {
                vText.setBackgroundResource(ibc0.f114192z);
            }
            bnl0.m105509E0(this.f31996a, new View.OnClickListener() { // from class: l.l9q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f130622a.m49574j(str, view);
                }
            });
            bnl0.m105509E0(this.f32000e, new View.OnClickListener() { // from class: l.m9q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f135430a.m49575k(str, view);
                }
            });
        }
        m49576l(this.f32001f, true);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m49567c(View view) {
        n9q.m162002a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public MessagesAct m49568d() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m49569e() {
        boolean zM49572h = m49572h(this.f32001f);
        String str = this.f32001f;
        if (!zM49572h) {
            if (!m49573i(str)) {
                if (!CoreModule.m30933P().m143412i().mo34492e2()) {
                    CoreModule.m30933P().m143408e().mo35988li(getContext(), "", false);
                    return;
                }
                if (TextUtils.isEmpty(this.f32001f)) {
                    this.f32001f = "tantan://vip/see?from=assistant_card";
                }
                CoreModule.m30933P().m143412i().mo180426Y(m49568d(), Uri.parse(this.f32001f));
                return;
            }
            Uri uri = Uri.parse(this.f32001f);
            Privilege privilegeMo180374O5 = CoreModule.m30933P().m143412i().mo180374O5(uri.getQueryParameter("privilege"));
            if (NullChecker.m82486a(privilegeMo180374O5) && CoreModule.m30933P().m143412i().mo34492e2()) {
                CoreModule.m30933P().m143412i().mo34568pr(m49568d(), "p_chat_view,e_assistant_see,click", privilegeMo180374O5);
                return;
            } else {
                CoreModule.m30933P().m143412i().mo180426Y(m49568d(), uri);
                return;
            }
        }
        Uri uri2 = Uri.parse(str);
        Privilege privilegeMo180374O6 = CoreModule.m30933P().m143412i().mo180374O5(uri2.getQueryParameter("privilege"));
        String queryParameter = uri2.getQueryParameter(Active.TYPE);
        if (!NullChecker.m82486a(privilegeMo180374O6) || CoreModule.m30933P().m143410g().mo36014Fs()) {
            CoreModule.m30933P().m143412i().mo180426Y(m49568d(), uri2);
            return;
        }
        if (TextUtils.equals(queryParameter, UnlockConversationType.quick_chat) && !CoreModule.m30933P().m143412i().mo180323F5()) {
            CoreModule.m30933P().m143412i().mo180426Y(m49568d(), uri2);
        } else if (!TextUtils.equals(queryParameter, "voice_quick_chat") || CoreModule.m30933P().m143412i().mo180497l2() <= 0) {
            CoreModule.m30933P().m143412i().mo34568pr(m49568d(), "p_chat,assistant_quickchat", privilegeMo180374O6);
        } else {
            CoreModule.m30933P().m143412i().mo180426Y(m49568d(), uri2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m49570f(String str) {
        if (m49572h(str)) {
            return "quickchat";
        }
        return m49573i(str) ? "see" : "other";
    }

    /* JADX INFO: renamed from: g */
    public final String m49571g(String str) {
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
    public final boolean m49572h(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("tantanapp://quickChat2Floor");
    }

    /* JADX INFO: renamed from: i */
    public final boolean m49573i(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("tantanapp://vip/see");
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m49574j(String str, View view) {
        i4g0.m138523u("e_ctbscard", OMSDialogPositon.p_chat_view, pf60.m172085a("assistant_types", m49570f(this.f32001f)), pf60.m172085a("card_ui", m49571g(str)));
        m49569e();
        m49576l(this.f32001f, false);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m49575k(String str, View view) {
        i4g0.m138523u("e_ctbscard_button", OMSDialogPositon.p_chat_view, pf60.m172085a("assistant_types", m49570f(this.f32001f)), pf60.m172085a("card_ui", m49571g(str)), pf60.m172085a("father_e", "e_ctbscard"));
        m49569e();
        m49576l(this.f32001f, false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX INFO: renamed from: l */
    public final void m49576l(String str, boolean z) {
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
                            str2 = SummarizedPrivilegesId.supremePartner;
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
                    i4g0.m138492A("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, jyb.m147494Y("vas_guide_type", str2));
                } else {
                    i4g0.m138523u("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, jyb.m147494Y("vas_guide_type", str2));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49567c(this);
    }

    public ItemMessageCallToBuy(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageCallToBuy(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
