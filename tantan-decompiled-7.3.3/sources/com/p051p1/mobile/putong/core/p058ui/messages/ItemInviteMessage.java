package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.PictureTxtDeeplinkMessageView;
import com.p051p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.e7q;
import p153l.g9c0;
import p153l.gta;
import p153l.nae0;
import p153l.ovb0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemInviteMessage extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemInviteMessage f31897a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31898b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f31899c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f31900d;

    public ItemInviteMessage(Context context) {
        this(context, null);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView;
        if (message == null) {
            return;
        }
        try {
            final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = PictureTxtDeeplinkMsgData.JSON_ADAPTER.parse(message.msgData);
            if (pictureTxtDeeplinkMsgData == null || (pictureTxtDeeplinkMessageView = pictureTxtDeeplinkMsgData.view) == null) {
                return;
            }
            if (!TextUtils.isEmpty(pictureTxtDeeplinkMessageView.image)) {
                uqb0.f180374G.m127115L0(this.f31898b, pictureTxtDeeplinkMsgData.view.image);
            }
            if (!TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.title)) {
                this.f31899c.setText(pictureTxtDeeplinkMsgData.view.title);
            }
            if (!TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.subTitle)) {
                this.f31900d.setText(pictureTxtDeeplinkMsgData.view.subTitle);
            }
            if (TextUtils.isEmpty(pictureTxtDeeplinkMsgData.schema)) {
                return;
            }
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.d7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85541a.m49422c(pictureTxtDeeplinkMsgData, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m49421b(View view) {
        e7q.m119766a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m49422c(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, View view) {
        nae0.m162083m(bnl0.m105508E(this), Uri.parse(pictureTxtDeeplinkMsgData.schema));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49421b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31899c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31899c.setTextSize(15.0f);
            this.f31900d.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31900d.setTextSize(13.0f);
        }
    }

    public ItemInviteMessage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemInviteMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
