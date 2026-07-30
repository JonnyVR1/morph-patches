package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.PictureTxtDeeplinkMessageView;
import com.p046p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import java.util.List;
import p147v.VDraweeView;
import p149l.a1c0;
import p149l.e5q;
import p149l.j2e0;
import p149l.knb0;
import p149l.qib0;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemInviteMessage extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemInviteMessage f31049a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31050b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f31051c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f31052d;

    public ItemInviteMessage(Context context) {
        this(context, null);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
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
                qib0.f154691G.m102331L0(this.f31050b, pictureTxtDeeplinkMsgData.view.image);
            }
            if (!TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.title)) {
                this.f31051c.setText(pictureTxtDeeplinkMsgData.view.title);
            }
            if (!TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.subTitle)) {
                this.f31052d.setText(pictureTxtDeeplinkMsgData.view.subTitle);
            }
            if (TextUtils.isEmpty(pictureTxtDeeplinkMsgData.schema)) {
                return;
            }
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.d5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84550a.m48239c(pictureTxtDeeplinkMsgData, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m48238b(View view) {
        e5q.m114890a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m48239c(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, View view) {
        j2e0.m139446m(xdl0.m208328E(this), Uri.parse(pictureTxtDeeplinkMsgData.schema));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48238b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31051c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31051c.setTextSize(15.0f);
            this.f31052d.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31052d.setTextSize(13.0f);
        }
    }

    public ItemInviteMessage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemInviteMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
