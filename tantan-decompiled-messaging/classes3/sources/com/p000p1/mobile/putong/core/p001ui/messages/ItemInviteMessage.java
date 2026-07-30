package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.PictureTxtDeeplinkMessageView;
import com.p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p1.mobile.putong.core.ui.VText_Bold;
import java.util.List;
import l.a1c0;
import l.e5q;
import l.j2e0;
import l.knb0;
import l.qib0;
import l.ura;
import l.xdl0;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemInviteMessage extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemInviteMessage f940a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f941b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f942c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f943d;

    public ItemInviteMessage(Context context) {
        this(context, null);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView;
        if (message == null) {
            return;
        }
        try {
            final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = (PictureTxtDeeplinkMsgData) PictureTxtDeeplinkMsgData.JSON_ADAPTER.parse(message.msgData);
            if (pictureTxtDeeplinkMsgData == null || (pictureTxtDeeplinkMessageView = pictureTxtDeeplinkMsgData.view) == null) {
                return;
            }
            if (!TextUtils.isEmpty(pictureTxtDeeplinkMessageView.image)) {
                qib0.G.L0(this.f941b, pictureTxtDeeplinkMsgData.view.image);
            }
            if (!TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.title)) {
                this.f942c.setText(pictureTxtDeeplinkMsgData.view.title);
            }
            if (!TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.subTitle)) {
                this.f943d.setText(pictureTxtDeeplinkMsgData.view.subTitle);
            }
            if (TextUtils.isEmpty(pictureTxtDeeplinkMsgData.schema)) {
                return;
            }
            xdl0.E0(this, new View.OnClickListener() { // from class: l.d5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2899a.m1321c(pictureTxtDeeplinkMsgData, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1320b(View view) {
        e5q.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m1321c(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, View view) {
        j2e0.m(xdl0.E(this), Uri.parse(pictureTxtDeeplinkMsgData.schema));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1320b(this);
        if (ura.e().d().I4()) {
            this.f942c.setTextColor(getResources().getColor(a1c0.g));
            this.f942c.setTextSize(15.0f);
            this.f943d.setTextColor(getResources().getColor(a1c0.i));
            this.f943d.setTextSize(13.0f);
        }
    }

    public ItemInviteMessage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemInviteMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
