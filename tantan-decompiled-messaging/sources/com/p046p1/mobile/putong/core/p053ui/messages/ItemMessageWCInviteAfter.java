package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageWCInviteAfter;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.f30;
import p149l.j2e0;
import p149l.knb0;
import p149l.lsi0;
import p149l.qib0;
import p149l.ura;
import p149l.xdl0;
import p149l.y9q;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageWCInviteAfter extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemMessageWCInviteAfter f31266a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f31267b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31268c;

    /* JADX INFO: renamed from: d */
    public VText f31269d;

    /* JADX INFO: renamed from: e */
    public VText f31270e;

    /* JADX INFO: renamed from: f */
    public VText f31271f;

    /* JADX INFO: renamed from: g */
    public boolean f31272g;

    public ItemMessageWCInviteAfter(Context context) {
        super(context);
        this.f31272g = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48496a(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            lsi0.m151580j(pictureTxtDeeplinkMsgData.failRemind);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = PictureTxtDeeplinkMsgData.JSON_ADAPTER.parse(message.msgData);
            if (pictureTxtDeeplinkMsgData == null) {
                return;
            }
            if (!this.f31272g) {
                this.f31272g = true;
                zvf0.m220402x("e_chat_game_done", "p_worldcup_chat");
            }
            xdl0.m208329E0(this.f31269d, new View.OnClickListener() { // from class: l.w9q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f185393a.m48499d(pictureTxtDeeplinkMsgData, view);
                }
            });
            if (NullChecker.m81303a(pictureTxtDeeplinkMsgData.view)) {
                String str = pictureTxtDeeplinkMsgData.view.title;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                VText vText = this.f31270e;
                if (zIsEmpty) {
                    xdl0.m208344M(vText, false);
                } else {
                    xdl0.m208344M(vText, true);
                    this.f31270e.setText(str);
                }
                String str2 = pictureTxtDeeplinkMsgData.view.subTitle;
                boolean zIsEmpty2 = TextUtils.isEmpty(str2);
                VText vText2 = this.f31271f;
                if (zIsEmpty2) {
                    xdl0.m208344M(vText2, false);
                } else {
                    xdl0.m208344M(vText2, true);
                    this.f31271f.setText(str2);
                }
                String str3 = pictureTxtDeeplinkMsgData.view.button;
                boolean zIsEmpty3 = TextUtils.isEmpty(str3);
                VText vText3 = this.f31269d;
                if (zIsEmpty3) {
                    xdl0.m208344M(vText3, false);
                } else {
                    xdl0.m208344M(vText3, true);
                    this.f31269d.setText(str3);
                }
                if (TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.image)) {
                    return;
                }
                qib0.f154691G.m102331L0(this.f31268c, pictureTxtDeeplinkMsgData.view.image);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m48498c(View view) {
        y9q.m213548a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m48499d(final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, View view) {
        zvf0.m220396r("e_chat_game_done", "p_worldcup_chat");
        j2e0.m139447n(xdl0.m208328E(this.f31269d), Uri.parse(pictureTxtDeeplinkMsgData.schema), new f30() { // from class: l.x9q
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                ItemMessageWCInviteAfter.m48496a(pictureTxtDeeplinkMsgData, (String) obj, (String) obj2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48498c(this);
        this.f31270e.setTypeface(Typeface.defaultFromStyle(1));
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31270e.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31271f.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31269d.setBackgroundResource(c3c0.f78863t);
        }
    }

    public ItemMessageWCInviteAfter(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31272g = false;
    }

    public ItemMessageWCInviteAfter(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31272g = false;
    }
}
