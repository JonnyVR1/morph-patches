package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
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
import com.p051p1.mobile.putong.core.data.ExchangePicture;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.k900;
import p153l.ovb0;
import p153l.qa00;
import p153l.qgq;
import p153l.r600;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSwitchPic extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemSwitchPic f32339a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f32340b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f32341c;

    /* JADX INFO: renamed from: d */
    public ImageView f32342d;

    /* JADX INFO: renamed from: e */
    public TextView f32343e;

    /* JADX INFO: renamed from: f */
    public TextView f32344f;

    /* JADX INFO: renamed from: g */
    public Message f32345g;

    /* JADX INFO: renamed from: h */
    public String f32346h;

    public ItemSwitchPic(Context context) {
        super(context);
        this.f32346h = "";
    }

    /* JADX INFO: renamed from: e */
    private void m49871e(Message message, MessagesAct messagesAct, boolean z) {
        if (!message.isMe() && z) {
            i4g0.m138520r("e_switch_photo_reply", messagesAct.pageId());
            r600.m179973t(messagesAct, messagesAct.f32488f.mo111034r3(), message.f56859id, "from_pic_exchange_reply_type");
            return;
        }
        i4g0.m138523u("e_switch_photo_message", messagesAct.pageId(), jyb.m147494Y("photo_owner_id", message.owner), jyb.m147494Y("to_uid", message.isMe() ? messagesAct.f32488f.mo111034r3() : CoreModule.m30929H().userId()));
        if (jyb.m147479J(message.media)) {
            return;
        }
        Media media = message.media.get(0);
        if (!NullChecker.m82486a(media) || TextUtils.isEmpty(media.url)) {
            return;
        }
        CoreModule.m30933P().m143405a().mo180505n1(messagesAct, message, media);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ boolean m49872h(View view) {
        ItemMessageBase.m49494R(this).onLongClick(this.f32340b);
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        String str;
        if (getContext() instanceof MessagesAct) {
            final MessagesAct messagesAct = (MessagesAct) getContext();
            this.f32345g = message;
            if (jyb.m147479J(message.media)) {
                str = "";
            } else {
                str = message.media.get(0).url;
                this.f32340b.setZoomAnimationKey(k900.m148796h(message, message.media.get(0).cover()));
            }
            if (!TextUtils.isEmpty(str)) {
                this.f32340b.getHierarchy().m207045H(RoundingParams.m8302b(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f)));
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
                bnl0.m105509E0(this.f32340b, new View.OnClickListener() { // from class: l.ngq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f141849a.m49874f(message, messagesAct, z, view);
                    }
                });
                if (z) {
                    bnl0.m105524M(this.f32341c, true);
                    uqb0.f180374G.m127120O(this.f32340b, str, 2, 100);
                    if (exchangePictureNew_.exchangeType == ExchangePicture.SEND_MESSAGE && message.isMe()) {
                        this.f32343e.setBackgroundResource(0);
                        if (TextUtils.equals(exchangePictureNew_.status, ExchangePicture.unknow)) {
                            this.f32346h = "error";
                        } else {
                            this.f32346h = "waitreply";
                        }
                        this.f32343e.setTextSize(15.0f);
                        this.f32343e.setText("等待交换");
                    } else {
                        this.f32343e.setBackgroundResource(ibc0.f113875O6);
                        this.f32343e.setText("回图查看");
                        this.f32343e.setTextSize(12.0f);
                        this.f32346h = "noreply";
                        bnl0.m105509E0(this.f32343e, new View.OnClickListener() { // from class: l.ogq
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f147299a.m49875g(message, messagesAct, view);
                            }
                        });
                    }
                } else {
                    this.f32346h = "default";
                    bnl0.m105524M(this.f32341c, false);
                    uqb0.f180374G.m127109I0(this.f32340b, str, qa00.m175859d(140.0f), qa00.m175859d(140.0f));
                }
            }
            i4g0.m138492A("e_switch_photo_message", messagesAct.pageId(), jyb.m147494Y("switchphoto_type", this.f32346h), jyb.m147494Y("photo_owner_id", message.owner), jyb.m147494Y("to_uid", message.isMe() ? messagesAct.f32488f.mo111034r3() : CoreModule.m30929H().userId()));
            boolean zIsMe = message.isMe();
            TextView textView = this.f32344f;
            if (zIsMe) {
                bnl0.m105524M(textView, false);
            } else {
                bnl0.m105524M(textView, true);
                this.f32344f.setText("以图换图");
            }
            this.f32340b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.pgq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f152322a.m49872h(view);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        Message message = this.f32345g;
        if (message == null || jyb.m147479J(message.media)) {
            return null;
        }
        if (this.f32345g.isMe() || TextUtils.equals(this.f32346h, "default")) {
            return CoreModule.m30933P().m143412i().mo180363M5((Act) getContext(), this.f32345g.media.get(0), this.f32345g);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m49873d(View view) {
        qgq.m176502a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m49874f(Message message, MessagesAct messagesAct, boolean z, View view) {
        m49871e(message, messagesAct, z);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49875g(Message message, MessagesAct messagesAct, View view) {
        m49871e(message, messagesAct, true);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49873d(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32344f.setTextColor(getResources().getColor(g9c0.f102819i));
            bnl0.m105526N(this.f32342d, ibc0.f114152u4);
        }
    }

    public ItemSwitchPic(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32346h = "";
    }

    public ItemSwitchPic(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32346h = "";
    }
}
