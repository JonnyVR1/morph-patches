package com.p000p1.mobile.putong.core.p001ui.messages;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageWCInvite;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.webview.mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.j2e0;
import l.j760;
import l.knb0;
import l.lsi0;
import l.qib0;
import l.t100;
import l.ura;
import l.vwb;
import l.w2e0;
import l.xdl0;
import l.z9q;
import l.zvf0;
import p003l.f30;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageWCInvite extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemMessageWCInvite f1151a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1152b;

    /* JADX INFO: renamed from: c */
    public VText f1153c;

    /* JADX INFO: renamed from: d */
    public VText f1154d;

    /* JADX INFO: renamed from: e */
    public boolean f1155e;

    /* JADX INFO: renamed from: f */
    public String f1156f;

    public ItemMessageWCInvite(Context context) {
        super(context);
        this.f1155e = false;
        this.f1156f = "";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1574a(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            lsi0.j(pictureTxtDeeplinkMsgData.failRemind);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = (PictureTxtDeeplinkMsgData) PictureTxtDeeplinkMsgData.JSON_ADAPTER.parse(message.msgData);
            if (pictureTxtDeeplinkMsgData == null) {
                return;
            }
            if (NullChecker.a(message.extData)) {
                this.f1156f = message.extData.extra;
            }
            if (!this.f1155e) {
                this.f1155e = true;
                boolean zIsEmpty = TextUtils.isEmpty(this.f1156f);
                String str = message.owner;
                if (!zIsEmpty) {
                    boolean zIsTeamAccount = User.isTeamAccount(str);
                    String str2 = this.f1156f;
                    if (zIsTeamAccount) {
                        zvf0.A("e_assistant_activity_message", "p_chat_view", new j760[]{vwb.Y("oms_trace", str2)});
                    } else {
                        zvf0.A("e_friends_invite_message", "p_chat_view", new j760[]{vwb.Y("oms_trace", str2)});
                    }
                } else if (User.isTeamAccount(str)) {
                    zvf0.x("e_worldcup_assistant_message", "p_worldcup_assistant");
                } else {
                    zvf0.x("e_chat_game_share", "p_worldcup_chat");
                }
            }
            if (NullChecker.a(pictureTxtDeeplinkMsgData.view)) {
                xdl0.E0(this.f1154d, new View.OnClickListener() { // from class: l.u9q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7939a.m1578e(message, pictureTxtDeeplinkMsgData, view);
                    }
                });
                CharSequence charSequence = pictureTxtDeeplinkMsgData.view.title;
                boolean zIsEmpty2 = TextUtils.isEmpty(charSequence);
                AppCompatTextView appCompatTextView = this.f1153c;
                if (zIsEmpty2) {
                    xdl0.M(appCompatTextView, false);
                } else {
                    xdl0.M(appCompatTextView, true);
                    this.f1153c.setText(charSequence);
                }
                CharSequence charSequence2 = pictureTxtDeeplinkMsgData.view.button;
                boolean zIsEmpty3 = TextUtils.isEmpty(charSequence2);
                AppCompatTextView appCompatTextView2 = this.f1154d;
                if (zIsEmpty3) {
                    xdl0.M(appCompatTextView2, false);
                } else {
                    xdl0.M(appCompatTextView2, true);
                    this.f1154d.setText(charSequence2);
                }
                if (TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.image)) {
                    return;
                }
                qib0.G.L0(this.f1152b, pictureTxtDeeplinkMsgData.view.image);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m1576c(View view) {
        z9q.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final String m1577d(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            w2e0 w2e0VarD = new w2e0.a(activity, str).d();
            Uri.Builder builderBuildUpon = Uri.parse((String) w2e0VarD.f().get("url")).buildUpon();
            for (String str2 : w2e0VarD.f().keySet()) {
                if (!"url".equals(str2)) {
                    builderBuildUpon.appendQueryParameter(str2, (String) w2e0VarD.f().get(str2));
                }
            }
            return builderBuildUpon.build().toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1578e(Message message, final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, View view) {
        if (!TextUtils.isEmpty(this.f1156f)) {
            boolean zIsTeamAccount = User.isTeamAccount(message.owner);
            String str = this.f1156f;
            if (zIsTeamAccount) {
                zvf0.u("e_assistant_activity_message", "p_chat_view", new j760[]{vwb.Y("oms_trace", str)});
            } else {
                zvf0.u("e_friends_invite_message", "p_chat_view", new j760[]{vwb.Y("oms_trace", str)});
            }
        } else if (User.isTeamAccount(message.owner)) {
            zvf0.r("e_worldcup_assistant_message", "p_worldcup_assistant");
        } else {
            zvf0.r("e_chat_game_share", "p_worldcup_chat");
        }
        if (pictureTxtDeeplinkMsgData.view.isFullScreen) {
            j2e0.n(xdl0.E(this), Uri.parse(pictureTxtDeeplinkMsgData.schema), new f30() { // from class: l.v9q
                @Override // p003l.f30
                public final void call(Object obj, Object obj2) {
                    ItemMessageWCInvite.m1574a(pictureTxtDeeplinkMsgData, (String) obj, (String) obj2);
                }
            });
        } else {
            m1579f(xdl0.E(this), m1577d(xdl0.E(this), pictureTxtDeeplinkMsgData.schema));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1579f(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentX1 = MkDlgWebViewAct.X1(activity, "", str);
        intentX1.putExtra("hideNavigationBar", true);
        intentX1.putExtra("skipLoading", true);
        intentX1.putExtra("transparent_status_bar", true);
        intentX1.putExtra("webviewColor", "transparent");
        intentX1.putExtra("hideNotch", true);
        activity.startActivity(intentX1);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1576c(this);
        this.f1153c.setTypeface(Typeface.defaultFromStyle(1));
        this.f1154d.setTypeface(Typeface.defaultFromStyle(1));
        this.f1152b.getHierarchy().H(RoundingParams.b(t100.d(10.0f), t100.d(10.0f), 0.0f, 0.0f));
        if (ura.e().d().I4()) {
            this.f1153c.setTextColor(getResources().getColor(a1c0.g));
            this.f1154d.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemMessageWCInvite(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1155e = false;
        this.f1156f = "";
    }

    public ItemMessageWCInvite(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1155e = false;
        this.f1156f = "";
    }
}
