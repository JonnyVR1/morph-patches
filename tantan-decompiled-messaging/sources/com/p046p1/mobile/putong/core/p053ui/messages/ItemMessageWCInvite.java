package com.p046p1.mobile.putong.core.p053ui.messages;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageWCInvite;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.f30;
import p149l.j2e0;
import p149l.knb0;
import p149l.lsi0;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.w2e0;
import p149l.xdl0;
import p149l.z9q;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageWCInvite extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemMessageWCInvite f31260a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31261b;

    /* JADX INFO: renamed from: c */
    public VText f31262c;

    /* JADX INFO: renamed from: d */
    public VText f31263d;

    /* JADX INFO: renamed from: e */
    public boolean f31264e;

    /* JADX INFO: renamed from: f */
    public String f31265f;

    public ItemMessageWCInvite(Context context) {
        super(context);
        this.f31264e = false;
        this.f31265f = "";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48490a(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            lsi0.m151580j(pictureTxtDeeplinkMsgData.failRemind);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = PictureTxtDeeplinkMsgData.JSON_ADAPTER.parse(message.msgData);
            if (pictureTxtDeeplinkMsgData == null) {
                return;
            }
            if (NullChecker.m81303a(message.extData)) {
                this.f31265f = message.extData.extra;
            }
            if (!this.f31264e) {
                this.f31264e = true;
                boolean zIsEmpty = TextUtils.isEmpty(this.f31265f);
                String str = message.owner;
                if (!zIsEmpty) {
                    boolean zIsTeamAccount = User.isTeamAccount(str);
                    String str2 = this.f31265f;
                    if (zIsTeamAccount) {
                        zvf0.m220368A("e_assistant_activity_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("oms_trace", str2));
                    } else {
                        zvf0.m220368A("e_friends_invite_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("oms_trace", str2));
                    }
                } else if (User.isTeamAccount(str)) {
                    zvf0.m220402x("e_worldcup_assistant_message", "p_worldcup_assistant");
                } else {
                    zvf0.m220402x("e_chat_game_share", "p_worldcup_chat");
                }
            }
            if (NullChecker.m81303a(pictureTxtDeeplinkMsgData.view)) {
                xdl0.m208329E0(this.f31263d, new View.OnClickListener() { // from class: l.u9q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f175493a.m48494e(message, pictureTxtDeeplinkMsgData, view);
                    }
                });
                String str3 = pictureTxtDeeplinkMsgData.view.title;
                boolean zIsEmpty2 = TextUtils.isEmpty(str3);
                VText vText = this.f31262c;
                if (zIsEmpty2) {
                    xdl0.m208344M(vText, false);
                } else {
                    xdl0.m208344M(vText, true);
                    this.f31262c.setText(str3);
                }
                String str4 = pictureTxtDeeplinkMsgData.view.button;
                boolean zIsEmpty3 = TextUtils.isEmpty(str4);
                VText vText2 = this.f31263d;
                if (zIsEmpty3) {
                    xdl0.m208344M(vText2, false);
                } else {
                    xdl0.m208344M(vText2, true);
                    this.f31263d.setText(str4);
                }
                if (TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.image)) {
                    return;
                }
                qib0.f154691G.m102331L0(this.f31261b, pictureTxtDeeplinkMsgData.view.image);
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
    public final void m48492c(View view) {
        z9q.m217681a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final String m48493d(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            w2e0 w2e0VarM201103d = new w2e0.C20787a(activity, str).m201103d();
            Uri.Builder builderBuildUpon = Uri.parse(w2e0VarM201103d.m201098f().get("url")).buildUpon();
            for (String str2 : w2e0VarM201103d.m201098f().keySet()) {
                if (!"url".equals(str2)) {
                    builderBuildUpon.appendQueryParameter(str2, w2e0VarM201103d.m201098f().get(str2));
                }
            }
            return builderBuildUpon.build().toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48494e(Message message, final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, View view) {
        if (!TextUtils.isEmpty(this.f31265f)) {
            boolean zIsTeamAccount = User.isTeamAccount(message.owner);
            String str = this.f31265f;
            if (zIsTeamAccount) {
                zvf0.m220399u("e_assistant_activity_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("oms_trace", str));
            } else {
                zvf0.m220399u("e_friends_invite_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("oms_trace", str));
            }
        } else if (User.isTeamAccount(message.owner)) {
            zvf0.m220396r("e_worldcup_assistant_message", "p_worldcup_assistant");
        } else {
            zvf0.m220396r("e_chat_game_share", "p_worldcup_chat");
        }
        if (pictureTxtDeeplinkMsgData.view.isFullScreen) {
            j2e0.m139447n(xdl0.m208328E(this), Uri.parse(pictureTxtDeeplinkMsgData.schema), new f30() { // from class: l.v9q
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    ItemMessageWCInvite.m48490a(pictureTxtDeeplinkMsgData, (String) obj, (String) obj2);
                }
            });
        } else {
            m48495f(xdl0.m208328E(this), m48493d(xdl0.m208328E(this), pictureTxtDeeplinkMsgData.schema));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m48495f(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentM80228X1 = MkDlgWebViewAct.m80228X1(activity, "", str);
        intentM80228X1.putExtra("hideNavigationBar", true);
        intentM80228X1.putExtra("skipLoading", true);
        intentM80228X1.putExtra("transparent_status_bar", true);
        intentM80228X1.putExtra("webviewColor", "transparent");
        intentM80228X1.putExtra("hideNotch", true);
        activity.startActivity(intentM80228X1);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48492c(this);
        this.f31262c.setTypeface(Typeface.defaultFromStyle(1));
        this.f31263d.setTypeface(Typeface.defaultFromStyle(1));
        this.f31261b.getHierarchy().m112053H(RoundingParams.m8248b(t100.m186890d(10.0f), t100.m186890d(10.0f), 0.0f, 0.0f));
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31262c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31263d.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemMessageWCInvite(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31264e = false;
        this.f31265f = "";
    }

    public ItemMessageWCInvite(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31264e = false;
        this.f31265f = "";
    }
}
