package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemBreakIceMessage;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.h39;
import p153l.hcm;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l3q;
import p153l.lyh0;
import p153l.pf60;
import p153l.qa00;
import p153l.sfj0;
import p153l.uxj0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemBreakIceMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemBreakIceMessage f31683a;

    /* JADX INFO: renamed from: b */
    public VLinear f31684b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f31685c;

    /* JADX INFO: renamed from: d */
    public VImage f31686d;

    /* JADX INFO: renamed from: e */
    public VText f31687e;

    /* JADX INFO: renamed from: f */
    public VImage f31688f;

    /* JADX INFO: renamed from: g */
    public VLinear f31689g;

    /* JADX INFO: renamed from: h */
    public VText f31690h;

    /* JADX INFO: renamed from: i */
    public VImage f31691i;

    /* JADX INFO: renamed from: j */
    public VLinear f31692j;

    /* JADX INFO: renamed from: k */
    public VText f31693k;

    /* JADX INFO: renamed from: l */
    public VImage f31694l;

    /* JADX INFO: renamed from: m */
    public HashSet<String> f31695m;

    /* JADX INFO: renamed from: n */
    public Runnable f31696n;

    /* JADX INFO: renamed from: o */
    public boolean f31697o;

    public ItemBreakIceMessage(Context context) {
        super(context);
        this.f31695m = new HashSet<>();
        this.f31696n = null;
        this.f31697o = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49225b(Runnable runnable, MessagesAct messagesAct, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        i4g0.m138523u("e_close_click", messagesAct.pageId(), pf60.m172085a("shortcut_type", "ice_break_write"));
    }

    /* JADX INFO: renamed from: d */
    public final void m49227d(View view) {
        l3q.m152734a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49228e(List list, Message message, MessagesAct messagesAct, View view) {
        CoreModule.f18264c.f20384f0.f20673e0.onNext(uxj0.f181467a);
        m49233j(this.f31690h.getText().toString(), ((BreakIce) list.get(0)).tipId, (BreakIce) list.get(0));
        CoreModule.f18264c.f20381e0.m116474I9(message.cid, ((BreakIce) list.get(0)).tipId);
        m49235l(messagesAct, this.f31690h.getText().toString());
        if (NullChecker.m82486a(this.f31696n)) {
            this.f31696n.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m49229f(List list, Message message, MessagesAct messagesAct, View view) {
        CoreModule.f18264c.f20384f0.f20673e0.onNext(uxj0.f181467a);
        m49233j(this.f31693k.getText().toString(), ((BreakIce) list.get(1)).tipId, (BreakIce) list.get(0));
        CoreModule.f18264c.f20381e0.m116474I9(message.cid, ((BreakIce) list.get(1)).tipId);
        m49235l(messagesAct, this.f31693k.getText().toString());
        if (NullChecker.m82486a(this.f31696n)) {
            this.f31696n.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m49230g(final MessagesAct messagesAct, final Message message) {
        if (NullChecker.m82486a(message) && NullChecker.m82486a(message.additionalData) && !jyb.m147479J(message.additionalData.localBreakIce)) {
            bnl0.m105524M(this.f31688f, false);
            final List<BreakIce> list = message.additionalData.localBreakIce;
            boolean zMo34517hm = CoreModule.m30933P().m143412i().mo34517hm();
            SVGAnimationView sVGAnimationView = this.f31685c;
            if (zMo34517hm) {
                bnl0.m105524M(sVGAnimationView, true);
                bnl0.m105524M(this.f31686d, false);
                m49232i(messagesAct, message);
                this.f31684b.setBackgroundResource(ibc0.f113771D1);
                this.f31687e.setTextSize(15.0f);
                this.f31687e.setTextColor(Color.parseColor("#9C6F7B"));
            } else {
                bnl0.m105524M(sVGAnimationView, false);
                bnl0.m105524M(this.f31686d, true);
                this.f31684b.setBackgroundResource(ibc0.f114171w5);
                this.f31687e.setTextSize(14.0f);
                this.f31687e.setTextColor(Color.parseColor("#66000000"));
            }
            if (list.size() == 1) {
                bnl0.m105524M(this.f31692j, false);
                this.f31687e.setText(String.format(messagesAct.string(R$string.f21552M5), "1"));
                this.f31690h.setText(list.get(0).content);
                m49234k(message, list.get(0).content, list.get(0).tipId, list.get(0));
            } else if (list.size() > 1) {
                bnl0.m105524M(this.f31692j, true);
                this.f31687e.setText(String.format(messagesAct.string(R$string.f21552M5), "2"));
                this.f31690h.setText(list.get(0).content);
                this.f31693k.setText(list.get(1).content);
                m49234k(message, list.get(0).content + Constants.PACKNAME_END + list.get(1).content, list.get(0).tipId + Constants.PACKNAME_END + list.get(1).tipId, list.get(0));
            }
            this.f31689g.setOnClickListener(new View.OnClickListener() { // from class: l.i3q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f112774a.m49228e(list, message, messagesAct, view);
                }
            });
            this.f31692j.setOnClickListener(new View.OnClickListener() { // from class: l.j3q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f118206a.m49229f(list, message, messagesAct, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public void m49231h(final MessagesAct messagesAct, Message message, final Runnable runnable) {
        User userM116503Pa;
        this.f31696n = runnable;
        m49230g(messagesAct, message);
        if (h39.m133421J() && (userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(messagesAct.f32488f.mo111034r3())) != null) {
            this.f31687e.setText(String.format("和%s打个招呼吧", userM116503Pa.isFemale() ? "她" : "他"));
        }
        bnl0.m105538V(this.f31684b, qa00.f156320g);
        bnl0.m105539W(this.f31684b, qa00.f156326m);
        bnl0.m105540X(this.f31684b, 0);
        bnl0.m105537U(this.f31684b, 0);
        bnl0.m105524M(this.f31688f, true);
        bnl0.m105509E0(this.f31688f, new View.OnClickListener() { // from class: l.k3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemBreakIceMessage.m49225b(runnable, messagesAct, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m49232i(MessagesAct messagesAct, Message message) {
        if (this.f31697o || TextUtils.equals(hcm.m134472r().m134480s(), message.cid)) {
            if (this.f31685c.isAnimating()) {
                return;
            }
            this.f31685c.setImageDrawable(messagesAct.drawable(ibc0.f113929V1));
        } else {
            hcm.m134472r().m134476D(message.cid);
            this.f31697o = true;
            this.f31685c.setImageDrawable(null);
            this.f31685c.startAnimation();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m49233j(String str, String str2, BreakIce breakIce) {
        if (CoreModule.m30933P().m143412i().mo34517hm()) {
            sfj0.m185596c("e_chat_topic", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_content", str), sfj0.C20032a.m185615h(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str2), sfj0.C20032a.m185615h("response_uuid", breakIce.response_uuid));
        } else {
            sfj0.m185596c("e_chat_topic", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_content", str), sfj0.C20032a.m185615h(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str2));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m49234k(Message message, String str, String str2, BreakIce breakIce) {
        if (this.f31695m.contains(message.f56859id)) {
            return;
        }
        this.f31695m.add(message.f56859id);
        if (CoreModule.m30933P().m143412i().mo34517hm()) {
            sfj0.m185601h("e_chat_topic", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_content", str), sfj0.C20032a.m185615h(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str2), sfj0.C20032a.m185615h("response_uuid", breakIce.response_uuid));
        } else {
            sfj0.m185601h("e_chat_topic", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_content", str), sfj0.C20032a.m185615h(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str2));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m49235l(MessagesAct messagesAct, String str) {
        messagesAct.f32488f.m110914S6(str);
        if (NullChecker.m82486a(this.f31696n)) {
            this.f31696n.run();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49227d(this);
        this.f31690h.setTypeface(lyh0.m156283c(3), 1);
        this.f31693k.setTypeface(lyh0.m156283c(3), 1);
        this.f31687e.setTypeface(lyh0.m156283c(3), 1);
        if (CoreModule.m30933P().m143412i().mo34517hm()) {
            this.f31684b.setBackgroundResource(ibc0.f113771D1);
            this.f31687e.setTextSize(15.0f);
            this.f31687e.setTextColor(Color.parseColor("#9C6F7B"));
            SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/4a4c8be8-97f8-48e0-a98b-0d2cbd93f7d814.svga").repeatCount(1).autoPlay(false).into(this.f31685c);
        }
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f31686d, ibc0.f113897R1);
            bnl0.m105526N(this.f31688f, ibc0.f114092n7);
            bnl0.m105526N(this.f31691i, ibc0.f113888Q1);
            bnl0.m105526N(this.f31694l, ibc0.f113888Q1);
            this.f31687e.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31690h.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31693k.setTextColor(getResources().getColor(g9c0.f102817g));
        }
    }

    public ItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31695m = new HashSet<>();
        this.f31696n = null;
        this.f31697o = false;
    }

    public ItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31695m = new HashSet<>();
        this.f31696n = null;
        this.f31697o = false;
    }
}
