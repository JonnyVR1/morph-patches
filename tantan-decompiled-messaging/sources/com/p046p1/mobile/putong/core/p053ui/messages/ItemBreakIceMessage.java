package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemBreakIceMessage;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.eqh0;
import p149l.j760;
import p149l.l1q;
import p149l.o6j0;
import p149l.r9m;
import p149l.roj0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.y19;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemBreakIceMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemBreakIceMessage f30835a;

    /* JADX INFO: renamed from: b */
    public VLinear f30836b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f30837c;

    /* JADX INFO: renamed from: d */
    public VImage f30838d;

    /* JADX INFO: renamed from: e */
    public VText f30839e;

    /* JADX INFO: renamed from: f */
    public VImage f30840f;

    /* JADX INFO: renamed from: g */
    public VLinear f30841g;

    /* JADX INFO: renamed from: h */
    public VText f30842h;

    /* JADX INFO: renamed from: i */
    public VImage f30843i;

    /* JADX INFO: renamed from: j */
    public VLinear f30844j;

    /* JADX INFO: renamed from: k */
    public VText f30845k;

    /* JADX INFO: renamed from: l */
    public VImage f30846l;

    /* JADX INFO: renamed from: m */
    public HashSet<String> f30847m;

    /* JADX INFO: renamed from: n */
    public Runnable f30848n;

    /* JADX INFO: renamed from: o */
    public boolean f30849o;

    public ItemBreakIceMessage(Context context) {
        super(context);
        this.f30847m = new HashSet<>();
        this.f30848n = null;
        this.f30849o = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m48042b(Runnable runnable, MessagesAct messagesAct, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        zvf0.m220399u("e_close_click", messagesAct.pageId(), j760.m140076a("shortcut_type", "ice_break_write"));
    }

    /* JADX INFO: renamed from: d */
    public final void m48044d(View view) {
        l1q.m148202a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48045e(List list, Message message, MessagesAct messagesAct, View view) {
        CoreModule.f17545c.f19642f0.f19931e0.onNext(roj0.f160388a);
        m48050j(this.f30842h.getText().toString(), ((BreakIce) list.get(0)).tipId, (BreakIce) list.get(0));
        CoreModule.f17545c.f19639e0.m169401I9(message.cid, ((BreakIce) list.get(0)).tipId);
        m48052l(messagesAct, this.f30842h.getText().toString());
        if (NullChecker.m81303a(this.f30848n)) {
            this.f30848n.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m48046f(List list, Message message, MessagesAct messagesAct, View view) {
        CoreModule.f17545c.f19642f0.f19931e0.onNext(roj0.f160388a);
        m48050j(this.f30845k.getText().toString(), ((BreakIce) list.get(1)).tipId, (BreakIce) list.get(0));
        CoreModule.f17545c.f19639e0.m169401I9(message.cid, ((BreakIce) list.get(1)).tipId);
        m48052l(messagesAct, this.f30845k.getText().toString());
        if (NullChecker.m81303a(this.f30848n)) {
            this.f30848n.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m48047g(final MessagesAct messagesAct, final Message message) {
        if (NullChecker.m81303a(message) && NullChecker.m81303a(message.additionalData) && !vwb.m200296J(message.additionalData.localBreakIce)) {
            xdl0.m208344M(this.f30840f, false);
            final List<BreakIce> list = message.additionalData.localBreakIce;
            boolean zMo33514hm = CoreModule.m29935P().m94658i().mo33514hm();
            SVGAnimationView sVGAnimationView = this.f30837c;
            if (zMo33514hm) {
                xdl0.m208344M(sVGAnimationView, true);
                xdl0.m208344M(this.f30838d, false);
                m48049i(messagesAct, message);
                this.f30836b.setBackgroundResource(c3c0.f78496D1);
                this.f30839e.setTextSize(15.0f);
                this.f30839e.setTextColor(Color.parseColor("#9C6F7B"));
            } else {
                xdl0.m208344M(sVGAnimationView, false);
                xdl0.m208344M(this.f30838d, true);
                this.f30836b.setBackgroundResource(c3c0.f78896w5);
                this.f30839e.setTextSize(14.0f);
                this.f30839e.setTextColor(Color.parseColor("#66000000"));
            }
            if (list.size() == 1) {
                xdl0.m208344M(this.f30844j, false);
                this.f30839e.setText(String.format(messagesAct.string(R$string.f20810M5), "1"));
                this.f30842h.setText(list.get(0).content);
                m48051k(message, list.get(0).content, list.get(0).tipId, list.get(0));
            } else if (list.size() > 1) {
                xdl0.m208344M(this.f30844j, true);
                this.f30839e.setText(String.format(messagesAct.string(R$string.f20810M5), "2"));
                this.f30842h.setText(list.get(0).content);
                this.f30845k.setText(list.get(1).content);
                m48051k(message, list.get(0).content + Constants.PACKNAME_END + list.get(1).content, list.get(0).tipId + Constants.PACKNAME_END + list.get(1).tipId, list.get(0));
            }
            this.f30841g.setOnClickListener(new View.OnClickListener() { // from class: l.i1q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f110482a.m48045e(list, message, messagesAct, view);
                }
            });
            this.f30844j.setOnClickListener(new View.OnClickListener() { // from class: l.j1q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115829a.m48046f(list, message, messagesAct, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public void m48048h(final MessagesAct messagesAct, Message message, final Runnable runnable) {
        User userM169430Pa;
        this.f30848n = runnable;
        m48047g(messagesAct, message);
        if (y19.m212150J() && (userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(messagesAct.f31640f.mo120828r3())) != null) {
            this.f30839e.setText(String.format("和%s打个招呼吧", userM169430Pa.isFemale() ? "她" : "他"));
        }
        xdl0.m208358V(this.f30836b, t100.f167258g);
        xdl0.m208359W(this.f30836b, t100.f167264m);
        xdl0.m208360X(this.f30836b, 0);
        xdl0.m208357U(this.f30836b, 0);
        xdl0.m208344M(this.f30840f, true);
        xdl0.m208329E0(this.f30840f, new View.OnClickListener() { // from class: l.k1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemBreakIceMessage.m48042b(runnable, messagesAct, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m48049i(MessagesAct messagesAct, Message message) {
        if (this.f30849o || TextUtils.equals(r9m.m178395r().m178403s(), message.cid)) {
            if (this.f30837c.isAnimating()) {
                return;
            }
            this.f30837c.setImageDrawable(messagesAct.drawable(c3c0.f78654V1));
        } else {
            r9m.m178395r().m178399D(message.cid);
            this.f30849o = true;
            this.f30837c.setImageDrawable(null);
            this.f30837c.startAnimation();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m48050j(String str, String str2, BreakIce breakIce) {
        if (CoreModule.m29935P().m94658i().mo33514hm()) {
            o6j0.m162859c("e_chat_topic", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_content", str), o6j0.C18854a.m162878h(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str2), o6j0.C18854a.m162878h("response_uuid", breakIce.response_uuid));
        } else {
            o6j0.m162859c("e_chat_topic", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_content", str), o6j0.C18854a.m162878h(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str2));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m48051k(Message message, String str, String str2, BreakIce breakIce) {
        if (this.f30847m.contains(message.f56011id)) {
            return;
        }
        this.f30847m.add(message.f56011id);
        if (CoreModule.m29935P().m94658i().mo33514hm()) {
            o6j0.m162864h("e_chat_topic", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_content", str), o6j0.C18854a.m162878h(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str2), o6j0.C18854a.m162878h("response_uuid", breakIce.response_uuid));
        } else {
            o6j0.m162864h("e_chat_topic", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_content", str), o6j0.C18854a.m162878h(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str2));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m48052l(MessagesAct messagesAct, String str) {
        messagesAct.f31640f.m120708S6(str);
        if (NullChecker.m81303a(this.f30848n)) {
            this.f30848n.run();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48044d(this);
        this.f30842h.setTypeface(eqh0.m117752c(3), 1);
        this.f30845k.setTypeface(eqh0.m117752c(3), 1);
        this.f30839e.setTypeface(eqh0.m117752c(3), 1);
        if (CoreModule.m29935P().m94658i().mo33514hm()) {
            this.f30836b.setBackgroundResource(c3c0.f78496D1);
            this.f30839e.setTextSize(15.0f);
            this.f30839e.setTextColor(Color.parseColor("#9C6F7B"));
            SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/4a4c8be8-97f8-48e0-a98b-0d2cbd93f7d814.svga").repeatCount(1).autoPlay(false).into(this.f30837c);
        }
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f30838d, c3c0.f78622R1);
            xdl0.m208346N(this.f30840f, c3c0.f78817n7);
            xdl0.m208346N(this.f30843i, c3c0.f78613Q1);
            xdl0.m208346N(this.f30846l, c3c0.f78613Q1);
            this.f30839e.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30842h.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30845k.setTextColor(getResources().getColor(a1c0.f67153g));
        }
    }

    public ItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30847m = new HashSet<>();
        this.f30848n = null;
        this.f30849o = false;
    }

    public ItemBreakIceMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30847m = new HashSet<>();
        this.f30848n = null;
        this.f30849o = false;
    }
}
