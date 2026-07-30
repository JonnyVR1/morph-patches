package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ExchangePicture;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.j760;
import l.knb0;
import l.qeq;
import l.qib0;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.eclipse.jetty.servlet.ServletHandler;
import p003l.n000;
import p003l.uxz;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemSwitchPic extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemSwitchPic f1382a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1383b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f1384c;

    /* JADX INFO: renamed from: d */
    public ImageView f1385d;

    /* JADX INFO: renamed from: e */
    public TextView f1386e;

    /* JADX INFO: renamed from: f */
    public TextView f1387f;

    /* JADX INFO: renamed from: g */
    public Message f1388g;

    /* JADX INFO: renamed from: h */
    public String f1389h;

    public ItemSwitchPic(Context context) {
        super(context);
        this.f1389h = "";
    }

    /* JADX INFO: renamed from: e */
    private void m1772e(Message message, MessagesAct messagesAct, boolean z) {
        if (!message.isMe() && z) {
            zvf0.r("e_switch_photo_reply", messagesAct.pageId());
            uxz.m8260t(messagesAct, messagesAct.f1531f.m4295r3(), ((DbObject) message).id, "from_pic_exchange_reply_type");
            return;
        }
        zvf0.u("e_switch_photo_message", messagesAct.pageId(), new j760[]{vwb.Y("photo_owner_id", message.owner), vwb.Y("to_uid", message.isMe() ? messagesAct.f1531f.m4295r3() : CoreModule.H().userId())});
        if (vwb.J(message.media)) {
            return;
        }
        Media media = (Media) message.media.get(0);
        if (!NullChecker.a(media) || TextUtils.isEmpty(media.url)) {
            return;
        }
        CoreModule.P().a().n1(messagesAct, message, media);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ boolean m1773h(View view) {
        ItemMessageBase.m1395R(this).onLongClick(this.f1383b);
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        String str;
        if (getContext() instanceof MessagesAct) {
            final MessagesAct messagesAct = (MessagesAct) getContext();
            this.f1388g = message;
            if (vwb.J(message.media)) {
                str = "";
            } else {
                str = ((Media) message.media.get(0)).url;
                this.f1383b.setZoomAnimationKey(n000.m6523h(message, ((Media) message.media.get(0)).cover()));
            }
            if (!TextUtils.isEmpty(str)) {
                this.f1383b.getHierarchy().H(RoundingParams.b(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f)));
                if (message.additionalData == null) {
                    message.additionalData = MessageAdditionalData.new_();
                }
                ExchangePicture exchangePictureNew_ = message.additionalData.exchangePicture;
                if (exchangePictureNew_ == null) {
                    exchangePictureNew_ = ExchangePicture.new_();
                    exchangePictureNew_.status = ExchangePicture.unknow;
                    exchangePictureNew_.exchangeType = ExchangePicture.SEND_MESSAGE;
                    message.additionalData.exchangePicture = exchangePictureNew_;
                }
                final boolean z = TextUtils.equals(exchangePictureNew_.status, ExchangePicture.unfinished) || TextUtils.equals(exchangePictureNew_.status, ExchangePicture.unknow);
                xdl0.E0(this.f1383b, new View.OnClickListener() { // from class: l.neq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f5888a.m1775f(message, messagesAct, z, view);
                    }
                });
                if (z) {
                    xdl0.M(this.f1384c, true);
                    qib0.G.O(this.f1383b, str, 2, 100);
                    if (exchangePictureNew_.exchangeType == ExchangePicture.SEND_MESSAGE && message.isMe()) {
                        this.f1386e.setBackgroundResource(0);
                        if (TextUtils.equals(exchangePictureNew_.status, ExchangePicture.unknow)) {
                            this.f1389h = "error";
                        } else {
                            this.f1389h = "waitreply";
                        }
                        this.f1386e.setTextSize(15.0f);
                        this.f1386e.setText("等待交换");
                    } else {
                        this.f1386e.setBackgroundResource(c3c0.O6);
                        this.f1386e.setText("回图查看");
                        this.f1386e.setTextSize(12.0f);
                        this.f1389h = "noreply";
                        xdl0.E0(this.f1386e, new View.OnClickListener() { // from class: l.oeq
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f6110a.m1776g(message, messagesAct, view);
                            }
                        });
                    }
                } else {
                    this.f1389h = ServletHandler.__DEFAULT_SERVLET;
                    xdl0.M(this.f1384c, false);
                    qib0.G.I0(this.f1383b, str, t100.d(140.0f), t100.d(140.0f));
                }
            }
            zvf0.A("e_switch_photo_message", messagesAct.pageId(), new j760[]{vwb.Y("switchphoto_type", this.f1389h), vwb.Y("photo_owner_id", message.owner), vwb.Y("to_uid", message.isMe() ? messagesAct.f1531f.m4295r3() : CoreModule.H().userId())});
            boolean zIsMe = message.isMe();
            TextView textView = this.f1387f;
            if (zIsMe) {
                xdl0.M(textView, false);
            } else {
                xdl0.M(textView, true);
                this.f1387f.setText("以图换图");
            }
            this.f1383b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.peq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f6393a.m1773h(view);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        Message message = this.f1388g;
        if (message == null || vwb.J(message.media)) {
            return null;
        }
        if (this.f1388g.isMe() || TextUtils.equals(this.f1389h, ServletHandler.__DEFAULT_SERVLET)) {
            return CoreModule.P().i().M5(getContext(), (Media) this.f1388g.media.get(0), this.f1388g);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m1774d(View view) {
        qeq.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m1775f(Message message, MessagesAct messagesAct, boolean z, View view) {
        m1772e(message, messagesAct, z);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1776g(Message message, MessagesAct messagesAct, View view) {
        m1772e(message, messagesAct, true);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1774d(this);
        if (ura.e().d().I4()) {
            this.f1387f.setTextColor(getResources().getColor(a1c0.i));
            xdl0.N(this.f1385d, c3c0.u4);
        }
    }

    public ItemSwitchPic(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1389h = "";
    }

    public ItemSwitchPic(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1389h = "";
    }
}
