package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.a1c0;
import p149l.c3c0;
import p149l.i5q;
import p149l.knb0;
import p149l.mqi0;
import p149l.n000;
import p149l.osi0;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLimitTimePic extends LinearLayout implements InterfaceC8519a, RunnableC4733c0.c {

    /* JADX INFO: renamed from: a */
    public ItemLimitTimePic f31059a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31060b;

    /* JADX INFO: renamed from: c */
    public VLinear f31061c;

    /* JADX INFO: renamed from: d */
    public ImageView f31062d;

    /* JADX INFO: renamed from: e */
    public TextView f31063e;

    /* JADX INFO: renamed from: f */
    public TextView f31064f;

    /* JADX INFO: renamed from: g */
    public VLinear f31065g;

    /* JADX INFO: renamed from: h */
    public ImageView f31066h;

    /* JADX INFO: renamed from: i */
    public TextView f31067i;

    /* JADX INFO: renamed from: j */
    public TextView f31068j;

    /* JADX INFO: renamed from: k */
    public Message f31069k;

    /* JADX INFO: renamed from: l */
    public RunnableC4733c0.a f31070l;

    /* JADX INFO: renamed from: m */
    public boolean f31071m;

    /* JADX INFO: renamed from: n */
    public long f31072n;

    /* JADX INFO: renamed from: o */
    public String f31073o;

    public ItemLimitTimePic(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m48245f(View view) {
        ItemMessageBase.m48311R(this).onLongClick(this.f31060b);
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        String str;
        int i;
        if (getContext() instanceof MessagesAct) {
            zvf0.m220402x("e_time_photo_message", OMSDialogPositon.p_chat_view);
            final MessagesAct messagesAct = (MessagesAct) getContext();
            this.f31069k = message;
            this.f31073o = "message_limit_time_pic_progress_" + message.f56011id;
            CoreModule.f17545c.f19685t1.m31515t(this);
            if (vwb.m200296J(message.media)) {
                str = "";
            } else {
                str = message.media.get(0).url;
                this.f31060b.setZoomAnimationKey(n000.m157189h(message, message.media.get(0).cover()));
            }
            if (!TextUtils.isEmpty(str)) {
                this.f31060b.getHierarchy().m112053H(RoundingParams.m8248b(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f)));
                if (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.limitTimePicture)) {
                    if (TEnum.equals(message.additionalData.limitTimePicture.status, "read")) {
                        this.f31071m = true;
                    }
                    i = message.additionalData.limitTimePicture.duration;
                } else {
                    this.f31071m = false;
                    i = 0;
                }
                if (this.f31071m || message.isMe()) {
                    xdl0.m208344M(this.f31061c, false);
                    xdl0.m208344M(this.f31065g, false);
                    qib0.f154691G.m102325I0(this.f31060b, str, t100.m186890d(140.0f), t100.m186890d(140.0f));
                } else {
                    qib0.f154691G.m102336O(this.f31060b, str, 2, 100);
                }
                this.f31072n = (long) (message.createdTime + (((long) i) * 1000));
                boolean z = !this.f31071m && mqi0.m155944o() >= this.f31072n;
                this.f31060b.setImageAlpha(255);
                if (!message.isMe()) {
                    if (z) {
                        xdl0.m208344M(this.f31061c, false);
                        xdl0.m208344M(this.f31065g, true);
                        this.f31066h.setImageAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
                        this.f31060b.setImageAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
                    } else if (!this.f31071m) {
                        this.f31064f.setTypeface(Typeface.defaultFromStyle(1));
                        xdl0.m208344M(this.f31061c, true);
                        xdl0.m208344M(this.f31065g, false);
                        m48249g();
                    }
                }
                xdl0.m208329E0(this.f31060b, new View.OnClickListener() { // from class: l.g5q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f101180a.m48248e(message, messagesAct, view);
                    }
                });
            }
            boolean zIsMe = message.isMe();
            TextView textView = this.f31068j;
            if (zIsMe) {
                xdl0.m208344M(textView, false);
            } else {
                xdl0.m208344M(textView, true);
                this.f31068j.setText("限时快拍");
            }
            this.f31060b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.h5q
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f105965a.m48245f(view);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        Message message = this.f31069k;
        if (message == null || vwb.m200296J(message.media)) {
            return null;
        }
        if (this.f31069k.isMe() || this.f31071m) {
            return CoreModule.m29935P().m94658i().mo158271M5((Act) getContext(), this.f31069k.media.get(0), this.f31069k);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m48246c(View view) {
        i5q.m134527a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m48247d(Message message, MessagesAct messagesAct, boolean z) {
        boolean z2 = !z && mqi0.m155944o() >= this.f31072n;
        if (message.isMe() || !z2) {
            zvf0.m220396r("e_time_photo_message", messagesAct.pageId());
            if (!message.isMe() && !z) {
                Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(message.cid);
                if (conversationM33216zp == null || TEnum.equals(conversationM33216zp.status, "dismissed")) {
                    osi0.m165783g("已解除配对，无法查看");
                    return;
                }
                CoreModule.f17545c.f19642f0.m33215zo(message);
            }
            if (vwb.m200296J(message.media)) {
                return;
            }
            Media media = message.media.get(0);
            if (!NullChecker.m81303a(media) || TextUtils.isEmpty(media.url)) {
                return;
            }
            CoreModule.m29935P().m94651a().mo158413n1(messagesAct, message, media);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48248e(Message message, MessagesAct messagesAct, View view) {
        m48247d(message, messagesAct, this.f31071m);
    }

    /* JADX INFO: renamed from: g */
    public final void m48249g() {
        MessageAdditionalData messageAdditionalData;
        Message message = this.f31069k;
        if (message == null || (messageAdditionalData = message.additionalData) == null || messageAdditionalData.limitTimePicture == null) {
            return;
        }
        this.f31064f.setText(RunnableC4733c0.m31502l(this.f31072n - mqi0.m155944o()));
        CoreModule.f17545c.f19685t1.m31515t(this);
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        this.f31070l = aVar;
        aVar.m31517a(true).m31523g(this.f31073o).m31520d(this).m31522f(this.f31072n);
        CoreModule.f17545c.f19685t1.m31513r(this.f31070l);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f17545c.f19685t1.m31515t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48246c(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31068j.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31067i.setTextColor(-1);
            xdl0.m208346N(this.f31062d, c3c0.f78777j3);
            xdl0.m208346N(this.f31066h, c3c0.f78759h3);
            this.f31064f.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(c3c0.f78750g3), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
        TextView textView;
        if (TextUtils.equals(this.f31073o, str) && (textView = this.f31064f) != null) {
            if (j3 >= j) {
                textView.setText(RunnableC4733c0.m31502l(j3 - j));
            } else {
                mo42388A(this.f31069k);
                CoreModule.f17545c.f19685t1.m31515t(this);
            }
        }
    }

    public ItemLimitTimePic(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLimitTimePic(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
