package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.i7q;
import p153l.ibc0;
import p153l.jyb;
import p153l.k900;
import p153l.ovb0;
import p153l.pzi0;
import p153l.qa00;
import p153l.r1j0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLimitTimePic extends LinearLayout implements InterfaceC8682a, RunnableC4884c0.c {

    /* JADX INFO: renamed from: a */
    public ItemLimitTimePic f31907a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31908b;

    /* JADX INFO: renamed from: c */
    public VLinear f31909c;

    /* JADX INFO: renamed from: d */
    public ImageView f31910d;

    /* JADX INFO: renamed from: e */
    public TextView f31911e;

    /* JADX INFO: renamed from: f */
    public TextView f31912f;

    /* JADX INFO: renamed from: g */
    public VLinear f31913g;

    /* JADX INFO: renamed from: h */
    public ImageView f31914h;

    /* JADX INFO: renamed from: i */
    public TextView f31915i;

    /* JADX INFO: renamed from: j */
    public TextView f31916j;

    /* JADX INFO: renamed from: k */
    public Message f31917k;

    /* JADX INFO: renamed from: l */
    public RunnableC4884c0.a f31918l;

    /* JADX INFO: renamed from: m */
    public boolean f31919m;

    /* JADX INFO: renamed from: n */
    public long f31920n;

    /* JADX INFO: renamed from: o */
    public String f31921o;

    public ItemLimitTimePic(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m49428f(View view) {
        ItemMessageBase.m49494R(this).onLongClick(this.f31908b);
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        String str;
        int i;
        if (getContext() instanceof MessagesAct) {
            i4g0.m138526x("e_time_photo_message", OMSDialogPositon.p_chat_view);
            final MessagesAct messagesAct = (MessagesAct) getContext();
            this.f31917k = message;
            this.f31921o = "message_limit_time_pic_progress_" + message.f56859id;
            CoreModule.f18264c.f20427t1.m32518t(this);
            if (jyb.m147479J(message.media)) {
                str = "";
            } else {
                str = message.media.get(0).url;
                this.f31908b.setZoomAnimationKey(k900.m148796h(message, message.media.get(0).cover()));
            }
            if (!TextUtils.isEmpty(str)) {
                this.f31908b.getHierarchy().m207045H(RoundingParams.m8302b(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f)));
                if (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.limitTimePicture)) {
                    if (TEnum.equals(message.additionalData.limitTimePicture.status, "read")) {
                        this.f31919m = true;
                    }
                    i = message.additionalData.limitTimePicture.duration;
                } else {
                    this.f31919m = false;
                    i = 0;
                }
                if (this.f31919m || message.isMe()) {
                    bnl0.m105524M(this.f31909c, false);
                    bnl0.m105524M(this.f31913g, false);
                    uqb0.f180374G.m127109I0(this.f31908b, str, qa00.m175859d(140.0f), qa00.m175859d(140.0f));
                } else {
                    uqb0.f180374G.m127120O(this.f31908b, str, 2, 100);
                }
                this.f31920n = (long) (message.createdTime + (((long) i) * 1000));
                boolean z = !this.f31919m && pzi0.m174454o() >= this.f31920n;
                this.f31908b.setImageAlpha(255);
                if (!message.isMe()) {
                    if (z) {
                        bnl0.m105524M(this.f31909c, false);
                        bnl0.m105524M(this.f31913g, true);
                        this.f31914h.setImageAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
                        this.f31908b.setImageAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
                    } else if (!this.f31919m) {
                        this.f31912f.setTypeface(Typeface.defaultFromStyle(1));
                        bnl0.m105524M(this.f31909c, true);
                        bnl0.m105524M(this.f31913g, false);
                        m49432g();
                    }
                }
                bnl0.m105509E0(this.f31908b, new View.OnClickListener() { // from class: l.g7q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f102615a.m49431e(message, messagesAct, view);
                    }
                });
            }
            boolean zIsMe = message.isMe();
            TextView textView = this.f31916j;
            if (zIsMe) {
                bnl0.m105524M(textView, false);
            } else {
                bnl0.m105524M(textView, true);
                this.f31916j.setText("限时快拍");
            }
            this.f31908b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.h7q
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f108147a.m49428f(view);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        Message message = this.f31917k;
        if (message == null || jyb.m147479J(message.media)) {
            return null;
        }
        if (this.f31917k.isMe() || this.f31919m) {
            return CoreModule.m30933P().m143412i().mo180363M5((Act) getContext(), this.f31917k.media.get(0), this.f31917k);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m49429c(View view) {
        i7q.m138981a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m49430d(Message message, MessagesAct messagesAct, boolean z) {
        boolean z2 = !z && pzi0.m174454o() >= this.f31920n;
        if (message.isMe() || !z2) {
            i4g0.m138520r("e_time_photo_message", messagesAct.pageId());
            if (!message.isMe() && !z) {
                Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(message.cid);
                if (conversationM34219zp == null || TEnum.equals(conversationM34219zp.status, "dismissed")) {
                    r1j0.m179420g("已解除配对，无法查看");
                    return;
                }
                CoreModule.f18264c.f20384f0.m34218zo(message);
            }
            if (jyb.m147479J(message.media)) {
                return;
            }
            Media media = message.media.get(0);
            if (!NullChecker.m82486a(media) || TextUtils.isEmpty(media.url)) {
                return;
            }
            CoreModule.m30933P().m143405a().mo180505n1(messagesAct, message, media);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49431e(Message message, MessagesAct messagesAct, View view) {
        m49430d(message, messagesAct, this.f31919m);
    }

    /* JADX INFO: renamed from: g */
    public final void m49432g() {
        MessageAdditionalData messageAdditionalData;
        Message message = this.f31917k;
        if (message == null || (messageAdditionalData = message.additionalData) == null || messageAdditionalData.limitTimePicture == null) {
            return;
        }
        this.f31912f.setText(RunnableC4884c0.m32505l(this.f31920n - pzi0.m174454o()));
        CoreModule.f18264c.f20427t1.m32518t(this);
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        this.f31918l = aVar;
        aVar.m32520a(true).m32526g(this.f31921o).m32523d(this).m32525f(this.f31920n);
        CoreModule.f18264c.f20427t1.m32516r(this.f31918l);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f18264c.f20427t1.m32518t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49429c(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31916j.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31915i.setTextColor(-1);
            bnl0.m105526N(this.f31910d, ibc0.f114052j3);
            bnl0.m105526N(this.f31914h, ibc0.f114034h3);
            this.f31912f.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(ibc0.f114025g3), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
        TextView textView;
        if (TextUtils.equals(this.f31921o, str) && (textView = this.f31912f) != null) {
            if (j3 >= j) {
                textView.setText(RunnableC4884c0.m32505l(j3 - j));
            } else {
                mo43399A(this.f31917k);
                CoreModule.f18264c.f20427t1.m32518t(this);
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
