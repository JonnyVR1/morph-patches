package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageWCInvite;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.abe0;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.nae0;
import p153l.o1j0;
import p153l.ovb0;
import p153l.qa00;
import p153l.uqb0;
import p153l.z20;
import p153l.zbq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageWCInvite extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemMessageWCInvite f32108a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f32109b;

    /* JADX INFO: renamed from: c */
    public VText f32110c;

    /* JADX INFO: renamed from: d */
    public VText f32111d;

    /* JADX INFO: renamed from: e */
    public boolean f32112e;

    /* JADX INFO: renamed from: f */
    public String f32113f;

    public ItemMessageWCInvite(Context context) {
        super(context);
        this.f32112e = false;
        this.f32113f = "";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49673a(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            o1j0.m165636j(pictureTxtDeeplinkMsgData.failRemind);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = PictureTxtDeeplinkMsgData.JSON_ADAPTER.parse(message.msgData);
            if (pictureTxtDeeplinkMsgData == null) {
                return;
            }
            if (NullChecker.m82486a(message.extData)) {
                this.f32113f = message.extData.extra;
            }
            if (!this.f32112e) {
                this.f32112e = true;
                boolean zIsEmpty = TextUtils.isEmpty(this.f32113f);
                String str = message.owner;
                if (!zIsEmpty) {
                    boolean zIsTeamAccount = User.isTeamAccount(str);
                    String str2 = this.f32113f;
                    if (zIsTeamAccount) {
                        i4g0.m138492A("e_assistant_activity_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("oms_trace", str2));
                    } else {
                        i4g0.m138492A("e_friends_invite_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("oms_trace", str2));
                    }
                } else if (User.isTeamAccount(str)) {
                    i4g0.m138526x("e_worldcup_assistant_message", "p_worldcup_assistant");
                } else {
                    i4g0.m138526x("e_chat_game_share", "p_worldcup_chat");
                }
            }
            if (NullChecker.m82486a(pictureTxtDeeplinkMsgData.view)) {
                bnl0.m105509E0(this.f32111d, new View.OnClickListener() { // from class: l.ubq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f178339a.m49677e(message, pictureTxtDeeplinkMsgData, view);
                    }
                });
                String str3 = pictureTxtDeeplinkMsgData.view.title;
                boolean zIsEmpty2 = TextUtils.isEmpty(str3);
                VText vText = this.f32110c;
                if (zIsEmpty2) {
                    bnl0.m105524M(vText, false);
                } else {
                    bnl0.m105524M(vText, true);
                    this.f32110c.setText(str3);
                }
                String str4 = pictureTxtDeeplinkMsgData.view.button;
                boolean zIsEmpty3 = TextUtils.isEmpty(str4);
                VText vText2 = this.f32111d;
                if (zIsEmpty3) {
                    bnl0.m105524M(vText2, false);
                } else {
                    bnl0.m105524M(vText2, true);
                    this.f32111d.setText(str4);
                }
                if (TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.image)) {
                    return;
                }
                uqb0.f180374G.m127115L0(this.f32109b, pictureTxtDeeplinkMsgData.view.image);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m49675c(View view) {
        zbq.m219211a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final String m49676d(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            abe0 abe0VarM96748d = new abe0.C15681a(activity, str).m96748d();
            Uri.Builder builderBuildUpon = Uri.parse(abe0VarM96748d.m96743f().get("url")).buildUpon();
            for (String str2 : abe0VarM96748d.m96743f().keySet()) {
                if (!"url".equals(str2)) {
                    builderBuildUpon.appendQueryParameter(str2, abe0VarM96748d.m96743f().get(str2));
                }
            }
            return builderBuildUpon.build().toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49677e(Message message, final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, View view) {
        if (!TextUtils.isEmpty(this.f32113f)) {
            boolean zIsTeamAccount = User.isTeamAccount(message.owner);
            String str = this.f32113f;
            if (zIsTeamAccount) {
                i4g0.m138523u("e_assistant_activity_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("oms_trace", str));
            } else {
                i4g0.m138523u("e_friends_invite_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("oms_trace", str));
            }
        } else if (User.isTeamAccount(message.owner)) {
            i4g0.m138520r("e_worldcup_assistant_message", "p_worldcup_assistant");
        } else {
            i4g0.m138520r("e_chat_game_share", "p_worldcup_chat");
        }
        if (pictureTxtDeeplinkMsgData.view.isFullScreen) {
            nae0.m162084n(bnl0.m105508E(this), Uri.parse(pictureTxtDeeplinkMsgData.schema), new z20() { // from class: l.vbq
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    ItemMessageWCInvite.m49673a(pictureTxtDeeplinkMsgData, (String) obj, (String) obj2);
                }
            });
        } else {
            m49678f(bnl0.m105508E(this), m49676d(bnl0.m105508E(this), pictureTxtDeeplinkMsgData.schema));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m49678f(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentM81411Y1 = MkDlgWebViewAct.m81411Y1(activity, "", str);
        intentM81411Y1.putExtra("hideNavigationBar", true);
        intentM81411Y1.putExtra("skipLoading", true);
        intentM81411Y1.putExtra("transparent_status_bar", true);
        intentM81411Y1.putExtra("webviewColor", "transparent");
        intentM81411Y1.putExtra("hideNotch", true);
        activity.startActivity(intentM81411Y1);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49675c(this);
        this.f32110c.setTypeface(Typeface.defaultFromStyle(1));
        this.f32111d.setTypeface(Typeface.defaultFromStyle(1));
        this.f32109b.getHierarchy().m207045H(RoundingParams.m8302b(qa00.m175859d(10.0f), qa00.m175859d(10.0f), 0.0f, 0.0f));
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32110c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32111d.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemMessageWCInvite(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32112e = false;
        this.f32113f = "";
    }

    public ItemMessageWCInvite(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32112e = false;
        this.f32113f = "";
    }
}
