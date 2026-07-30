package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.GaussianBlurParameters;
import com.p046p1.mobile.putong.data.MessageCallToBuy;
import com.p046p1.mobile.putong.data.MessageCallToBuyButton;
import com.p046p1.mobile.putong.data.MessageCallToBuyMedia;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.UnlockConversationType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bkb0;
import p149l.c3c0;
import p149l.eqh0;
import p149l.j760;
import p149l.knb0;
import p149l.n000;
import p149l.n7q;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageCallToBuy extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemMessageCallToBuy f31148a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f31149b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31150c;

    /* JADX INFO: renamed from: d */
    public VText f31151d;

    /* JADX INFO: renamed from: e */
    public VText f31152e;

    /* JADX INFO: renamed from: f */
    public String f31153f;

    public ItemMessageCallToBuy(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        MessageCallToBuy messageCallToBuy;
        final String str = null;
        try {
            messageCallToBuy = MessageCallToBuy.JSON_ADAPTER.parse(message.msgData);
            try {
                boolean zIsEmpty = TextUtils.isEmpty(messageCallToBuy.button.redirect);
                MessageCallToBuyButton messageCallToBuyButton = messageCallToBuy.button;
                if (zIsEmpty) {
                    this.f31153f = messageCallToBuyButton.href;
                } else {
                    this.f31153f = messageCallToBuyButton.redirect;
                }
                str = messageCallToBuy.cardVersion;
            } catch (IOException e) {
                e = e;
                CrashHelper.m81296c(e);
            }
        } catch (IOException e2) {
            e = e2;
            messageCallToBuy = null;
        }
        if (!n000.m157184c(message.f56011id)) {
            n000.m157190i(message.f56011id);
            zvf0.m220368A("e_ctbscard", OMSDialogPositon.p_chat_view, j760.m140076a("assistant_types", m48387f(this.f31153f)), j760.m140076a("card_ui", m48388g(str)));
        }
        if (NullChecker.m81304b(messageCallToBuy)) {
            if (!"5".equals(messageCallToBuy.cardVersion) || vwb.m200296J(messageCallToBuy.medias)) {
                xdl0.m208344M(this.f31149b, false);
            } else {
                xdl0.m208344M(this.f31149b, true);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31150c.getLayoutParams();
                layoutParams.height = t100.m186890d(210.0f);
                this.f31150c.setLayoutParams(layoutParams);
                MessageCallToBuyMedia messageCallToBuyMedia = messageCallToBuy.medias.get(0);
                bkb0 bkb0Var = qib0.f154691G;
                VDraweeView vDraweeView = this.f31150c;
                String str2 = messageCallToBuyMedia.url;
                GaussianBlurParameters gaussianBlurParameters = messageCallToBuyMedia.gaussianBlurParameters;
                bkb0Var.m102336O(vDraweeView, str2, gaussianBlurParameters.iterations, gaussianBlurParameters.blurRadius);
            }
            this.f31151d.setTypeface(Typeface.defaultFromStyle(1));
            this.f31151d.setText(messageCallToBuy.text);
            this.f31152e.setTypeface(eqh0.m117752c(3), 1);
            this.f31152e.setText(messageCallToBuy.button.text);
            boolean zMo158233G1 = CoreModule.m29935P().m94658i().mo158233G1();
            VText vText = this.f31152e;
            if (zMo158233G1) {
                vText.setBackgroundResource(c3c0.f78632S3);
            } else {
                vText.setBackgroundResource(c3c0.f78917z);
            }
            xdl0.m208329E0(this.f31148a, new View.OnClickListener() { // from class: l.l7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f126737a.m48391j(str, view);
                }
            });
            xdl0.m208329E0(this.f31152e, new View.OnClickListener() { // from class: l.m7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f131839a.m48392k(str, view);
                }
            });
        }
        m48393l(this.f31153f, true);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m48384c(View view) {
        n7q.m158154a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public MessagesAct m48385d() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m48386e() {
        boolean zM48389h = m48389h(this.f31153f);
        String str = this.f31153f;
        if (!zM48389h) {
            if (!m48390i(str)) {
                if (!CoreModule.m29935P().m94658i().mo33489e2()) {
                    CoreModule.m29935P().m94654e().mo34985li(getContext(), "", false);
                    return;
                }
                if (TextUtils.isEmpty(this.f31153f)) {
                    this.f31153f = "tantan://vip/see?from=assistant_card";
                }
                CoreModule.m29935P().m94658i().mo158334Y(m48385d(), Uri.parse(this.f31153f));
                return;
            }
            Uri uri = Uri.parse(this.f31153f);
            Privilege privilegeMo158282O5 = CoreModule.m29935P().m94658i().mo158282O5(uri.getQueryParameter("privilege"));
            if (NullChecker.m81303a(privilegeMo158282O5) && CoreModule.m29935P().m94658i().mo33489e2()) {
                CoreModule.m29935P().m94658i().mo33565pr(m48385d(), "p_chat_view,e_assistant_see,click", privilegeMo158282O5);
                return;
            } else {
                CoreModule.m29935P().m94658i().mo158334Y(m48385d(), uri);
                return;
            }
        }
        Uri uri2 = Uri.parse(str);
        Privilege privilegeMo158282O6 = CoreModule.m29935P().m94658i().mo158282O5(uri2.getQueryParameter("privilege"));
        String queryParameter = uri2.getQueryParameter(Active.TYPE);
        if (!NullChecker.m81303a(privilegeMo158282O6) || CoreModule.m29935P().m94656g().mo35011Fs()) {
            CoreModule.m29935P().m94658i().mo158334Y(m48385d(), uri2);
            return;
        }
        if (TextUtils.equals(queryParameter, UnlockConversationType.quick_chat) && !CoreModule.m29935P().m94658i().mo158231F5()) {
            CoreModule.m29935P().m94658i().mo158334Y(m48385d(), uri2);
        } else if (!TextUtils.equals(queryParameter, "voice_quick_chat") || CoreModule.m29935P().m94658i().mo158405l2() <= 0) {
            CoreModule.m29935P().m94658i().mo33565pr(m48385d(), "p_chat,assistant_quickchat", privilegeMo158282O6);
        } else {
            CoreModule.m29935P().m94658i().mo158334Y(m48385d(), uri2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m48387f(String str) {
        if (m48389h(str)) {
            return "quickchat";
        }
        return m48390i(str) ? "see" : "other";
    }

    /* JADX INFO: renamed from: g */
    public final String m48388g(String str) {
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
    public final boolean m48389h(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("tantanapp://quickChat2Floor");
    }

    /* JADX INFO: renamed from: i */
    public final boolean m48390i(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("tantanapp://vip/see");
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m48391j(String str, View view) {
        zvf0.m220399u("e_ctbscard", OMSDialogPositon.p_chat_view, j760.m140076a("assistant_types", m48387f(this.f31153f)), j760.m140076a("card_ui", m48388g(str)));
        m48386e();
        m48393l(this.f31153f, false);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m48392k(String str, View view) {
        zvf0.m220399u("e_ctbscard_button", OMSDialogPositon.p_chat_view, j760.m140076a("assistant_types", m48387f(this.f31153f)), j760.m140076a("card_ui", m48388g(str)), j760.m140076a("father_e", "e_ctbscard"));
        m48386e();
        m48393l(this.f31153f, false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX INFO: renamed from: l */
    public final void m48393l(String str, boolean z) {
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
                    zvf0.m220368A("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, vwb.m200311Y("vas_guide_type", str2));
                } else {
                    zvf0.m220399u("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, vwb.m200311Y("vas_guide_type", str2));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48384c(this);
    }

    public ItemMessageCallToBuy(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageCallToBuy(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
