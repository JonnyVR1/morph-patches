package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.i5q;
import l.knb0;
import l.mqi0;
import l.osi0;
import l.qib0;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.spongycastle.crypto.tls.CipherSuite;
import p003l.n000;
import p028v.VDraweeView;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemLimitTimePic extends LinearLayout implements InterfaceC0102a, c0.c {

    /* JADX INFO: renamed from: a */
    public ItemLimitTimePic f950a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f951b;

    /* JADX INFO: renamed from: c */
    public VLinear f952c;

    /* JADX INFO: renamed from: d */
    public ImageView f953d;

    /* JADX INFO: renamed from: e */
    public TextView f954e;

    /* JADX INFO: renamed from: f */
    public TextView f955f;

    /* JADX INFO: renamed from: g */
    public VLinear f956g;

    /* JADX INFO: renamed from: h */
    public ImageView f957h;

    /* JADX INFO: renamed from: i */
    public TextView f958i;

    /* JADX INFO: renamed from: j */
    public TextView f959j;

    /* JADX INFO: renamed from: k */
    public Message f960k;

    /* JADX INFO: renamed from: l */
    public c0.a f961l;

    /* JADX INFO: renamed from: m */
    public boolean f962m;

    /* JADX INFO: renamed from: n */
    public long f963n;

    /* JADX INFO: renamed from: o */
    public String f964o;

    public ItemLimitTimePic(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m1327f(View view) {
        ItemMessageBase.m1395R(this).onLongClick(this.f951b);
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        String str;
        int i;
        if (getContext() instanceof MessagesAct) {
            zvf0.x("e_time_photo_message", "p_chat_view");
            final MessagesAct messagesAct = (MessagesAct) getContext();
            this.f960k = message;
            this.f964o = "message_limit_time_pic_progress_" + ((DbObject) message).id;
            CoreModule.c.t1.t(this);
            if (vwb.J(message.media)) {
                str = "";
            } else {
                str = ((Media) message.media.get(0)).url;
                this.f951b.setZoomAnimationKey(n000.m6523h(message, ((Media) message.media.get(0)).cover()));
            }
            if (!TextUtils.isEmpty(str)) {
                this.f951b.getHierarchy().H(RoundingParams.b(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f)));
                if (NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.limitTimePicture)) {
                    if (TEnum.equals(message.additionalData.limitTimePicture.status, "read")) {
                        this.f962m = true;
                    }
                    i = message.additionalData.limitTimePicture.duration;
                } else {
                    this.f962m = false;
                    i = 0;
                }
                if (this.f962m || message.isMe()) {
                    xdl0.M(this.f952c, false);
                    xdl0.M(this.f956g, false);
                    qib0.G.I0(this.f951b, str, t100.d(140.0f), t100.d(140.0f));
                } else {
                    qib0.G.O(this.f951b, str, 2, 100);
                }
                this.f963n = (long) (message.createdTime + (((long) i) * 1000));
                boolean z = !this.f962m && mqi0.o() >= this.f963n;
                this.f951b.setImageAlpha(255);
                if (!message.isMe()) {
                    if (z) {
                        xdl0.M(this.f952c, false);
                        xdl0.M(this.f956g, true);
                        this.f957h.setImageAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
                        this.f951b.setImageAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
                    } else if (!this.f962m) {
                        this.f955f.setTypeface(Typeface.defaultFromStyle(1));
                        xdl0.M(this.f952c, true);
                        xdl0.M(this.f956g, false);
                        m1331g();
                    }
                }
                xdl0.E0(this.f951b, new View.OnClickListener() { // from class: l.g5q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3802a.m1330e(message, messagesAct, view);
                    }
                });
            }
            boolean zIsMe = message.isMe();
            TextView textView = this.f959j;
            if (zIsMe) {
                xdl0.M(textView, false);
            } else {
                xdl0.M(textView, true);
                this.f959j.setText("限时快拍");
            }
            this.f951b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.h5q
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f4118a.m1327f(view);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        Message message = this.f960k;
        if (message == null || vwb.J(message.media)) {
            return null;
        }
        if (this.f960k.isMe() || this.f962m) {
            return CoreModule.P().i().M5(getContext(), (Media) this.f960k.media.get(0), this.f960k);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m1328c(View view) {
        i5q.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m1329d(Message message, MessagesAct messagesAct, boolean z) {
        boolean z2 = !z && mqi0.o() >= this.f963n;
        if (message.isMe() || !z2) {
            zvf0.r("e_time_photo_message", messagesAct.pageId());
            if (!message.isMe() && !z) {
                Conversation conversationZp = CoreModule.c.f0.zp(message.cid);
                if (conversationZp == null || TEnum.equals(conversationZp.status, "dismissed")) {
                    osi0.g("已解除配对，无法查看");
                    return;
                }
                CoreModule.c.f0.zo(message);
            }
            if (vwb.J(message.media)) {
                return;
            }
            Media media = (Media) message.media.get(0);
            if (!NullChecker.a(media) || TextUtils.isEmpty(media.url)) {
                return;
            }
            CoreModule.P().a().n1(messagesAct, message, media);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1330e(Message message, MessagesAct messagesAct, View view) {
        m1329d(message, messagesAct, this.f962m);
    }

    /* JADX INFO: renamed from: g */
    public final void m1331g() {
        MessageAdditionalData messageAdditionalData;
        Message message = this.f960k;
        if (message == null || (messageAdditionalData = message.additionalData) == null || messageAdditionalData.limitTimePicture == null) {
            return;
        }
        this.f955f.setText(c0.l(this.f963n - mqi0.o()));
        CoreModule.c.t1.t(this);
        c0.a aVar = new c0.a();
        this.f961l = aVar;
        aVar.a(true).g(this.f964o).d(this).f(this.f963n);
        CoreModule.c.t1.r(this.f961l);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.c.t1.t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1328c(this);
        if (ura.e().d().I4()) {
            this.f959j.setTextColor(getResources().getColor(a1c0.i));
            this.f958i.setTextColor(-1);
            xdl0.N(this.f953d, c3c0.j3);
            xdl0.N(this.f957h, c3c0.h3);
            this.f955f.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(c3c0.g3), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1332u(String str, long j, long j2, long j3, long j4) {
        TextView textView;
        if (TextUtils.equals(this.f964o, str) && (textView = this.f955f) != null) {
            if (j3 >= j) {
                textView.setText(c0.l(j3 - j));
            } else {
                mo1056A(this.f960k);
                CoreModule.c.t1.t(this);
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
