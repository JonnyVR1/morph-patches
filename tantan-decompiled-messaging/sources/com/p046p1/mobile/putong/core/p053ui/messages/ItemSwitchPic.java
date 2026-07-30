package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
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
import com.p046p1.mobile.putong.core.data.ExchangePicture;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p149l.a1c0;
import p149l.c3c0;
import p149l.knb0;
import p149l.n000;
import p149l.qeq;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.uxz;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSwitchPic extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemSwitchPic f31491a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31492b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f31493c;

    /* JADX INFO: renamed from: d */
    public ImageView f31494d;

    /* JADX INFO: renamed from: e */
    public TextView f31495e;

    /* JADX INFO: renamed from: f */
    public TextView f31496f;

    /* JADX INFO: renamed from: g */
    public Message f31497g;

    /* JADX INFO: renamed from: h */
    public String f31498h;

    public ItemSwitchPic(Context context) {
        super(context);
        this.f31498h = "";
    }

    /* JADX INFO: renamed from: e */
    private void m48688e(Message message, MessagesAct messagesAct, boolean z) {
        if (!message.isMe() && z) {
            zvf0.m220396r("e_switch_photo_reply", messagesAct.pageId());
            uxz.m196230t(messagesAct, messagesAct.f31640f.mo120828r3(), message.f56011id, "from_pic_exchange_reply_type");
            return;
        }
        zvf0.m220399u("e_switch_photo_message", messagesAct.pageId(), vwb.m200311Y("photo_owner_id", message.owner), vwb.m200311Y("to_uid", message.isMe() ? messagesAct.f31640f.mo120828r3() : CoreModule.m29931H().userId()));
        if (vwb.m200296J(message.media)) {
            return;
        }
        Media media = message.media.get(0);
        if (!NullChecker.m81303a(media) || TextUtils.isEmpty(media.url)) {
            return;
        }
        CoreModule.m29935P().m94651a().mo158413n1(messagesAct, message, media);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ boolean m48689h(View view) {
        ItemMessageBase.m48311R(this).onLongClick(this.f31492b);
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        String str;
        if (getContext() instanceof MessagesAct) {
            final MessagesAct messagesAct = (MessagesAct) getContext();
            this.f31497g = message;
            if (vwb.m200296J(message.media)) {
                str = "";
            } else {
                str = message.media.get(0).url;
                this.f31492b.setZoomAnimationKey(n000.m157189h(message, message.media.get(0).cover()));
            }
            if (!TextUtils.isEmpty(str)) {
                this.f31492b.getHierarchy().m112053H(RoundingParams.m8248b(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f)));
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
                xdl0.m208329E0(this.f31492b, new View.OnClickListener() { // from class: l.neq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f138639a.m48691f(message, messagesAct, z, view);
                    }
                });
                if (z) {
                    xdl0.m208344M(this.f31493c, true);
                    qib0.f154691G.m102336O(this.f31492b, str, 2, 100);
                    if (exchangePictureNew_.exchangeType == ExchangePicture.SEND_MESSAGE && message.isMe()) {
                        this.f31495e.setBackgroundResource(0);
                        if (TextUtils.equals(exchangePictureNew_.status, ExchangePicture.unknow)) {
                            this.f31498h = "error";
                        } else {
                            this.f31498h = "waitreply";
                        }
                        this.f31495e.setTextSize(15.0f);
                        this.f31495e.setText("等待交换");
                    } else {
                        this.f31495e.setBackgroundResource(c3c0.f78600O6);
                        this.f31495e.setText("回图查看");
                        this.f31495e.setTextSize(12.0f);
                        this.f31498h = "noreply";
                        xdl0.m208329E0(this.f31495e, new View.OnClickListener() { // from class: l.oeq
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f143357a.m48692g(message, messagesAct, view);
                            }
                        });
                    }
                } else {
                    this.f31498h = "default";
                    xdl0.m208344M(this.f31493c, false);
                    qib0.f154691G.m102325I0(this.f31492b, str, t100.m186890d(140.0f), t100.m186890d(140.0f));
                }
            }
            zvf0.m220368A("e_switch_photo_message", messagesAct.pageId(), vwb.m200311Y("switchphoto_type", this.f31498h), vwb.m200311Y("photo_owner_id", message.owner), vwb.m200311Y("to_uid", message.isMe() ? messagesAct.f31640f.mo120828r3() : CoreModule.m29931H().userId()));
            boolean zIsMe = message.isMe();
            TextView textView = this.f31496f;
            if (zIsMe) {
                xdl0.m208344M(textView, false);
            } else {
                xdl0.m208344M(textView, true);
                this.f31496f.setText("以图换图");
            }
            this.f31492b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.peq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f148467a.m48689h(view);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        Message message = this.f31497g;
        if (message == null || vwb.m200296J(message.media)) {
            return null;
        }
        if (this.f31497g.isMe() || TextUtils.equals(this.f31498h, "default")) {
            return CoreModule.m29935P().m94658i().mo158271M5((Act) getContext(), this.f31497g.media.get(0), this.f31497g);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m48690d(View view) {
        qeq.m174228a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m48691f(Message message, MessagesAct messagesAct, boolean z, View view) {
        m48688e(message, messagesAct, z);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48692g(Message message, MessagesAct messagesAct, View view) {
        m48688e(message, messagesAct, true);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48690d(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31496f.setTextColor(getResources().getColor(a1c0.f67155i));
            xdl0.m208346N(this.f31494d, c3c0.f78877u4);
        }
    }

    public ItemSwitchPic(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31498h = "";
    }

    public ItemSwitchPic(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31498h = "";
    }
}
