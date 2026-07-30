package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemODiamondVisitorGuideMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.j760;
import l.vwb;
import l.xdl0;
import l.yaq;
import l.zvf0;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.i18n.MessageBundle;
import p003l.d30;
import p003l.e30;
import p003l.eqh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemODiamondVisitorGuideMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f1219a;

    /* JADX INFO: renamed from: b */
    public TextView f1220b;

    /* JADX INFO: renamed from: c */
    public TextView f1221c;

    /* JADX INFO: renamed from: d */
    public TextView f1222d;

    /* JADX INFO: renamed from: e */
    public ImageView f1223e;

    public ItemODiamondVisitorGuideMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1622a(Act act, View view) {
        CoreModule.P().g().Og(act, "p_chat,visit_decrypt", new e30() { // from class: l.xaq
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemODiamondVisitorGuideMessage.m1623b((PurchaseType) obj);
            }
        }, (d30) null, (d30) null, Privilege.oDiamondVisitor);
        zvf0.u("e_visit_times_decrypt", "p_chat_view", new j760[]{vwb.Y("button_type", "open")});
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1623b(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1624c(User user, Act act, View view) {
        zvf0.u("e_visit_times_decrypt", "p_chat_view", new j760[]{vwb.Y("button_type", HttpHeaderValues.CLOSE)});
        CoreModule.P().e().Kh(((DbObject) user).id);
        ((MessagesAct) act).f1531f.m4119G6();
    }

    /* JADX INFO: renamed from: d */
    public final void m1625d(View view) {
        yaq.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m1626e() {
        this.f1219a.setTypeface(eqh0.m3924c(3), 1);
        this.f1220b.setTypeface(eqh0.m3924c(3), 1);
    }

    /* JADX INFO: renamed from: f */
    public void m1627f(final Act act, Message message, final User user) {
        if (act instanceof MessagesAct) {
            try {
                JSONObject jSONObject = new JSONObject(message.value);
                String strOptString = jSONObject.optString(MessageBundle.TITLE_ENTRY);
                String strOptString2 = jSONObject.optString("sub_title");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    this.f1219a.setText(strOptString);
                    this.f1221c.setText(strOptString2);
                }
            } catch (JSONException unused) {
            }
            xdl0.E0(this.f1222d, new View.OnClickListener() { // from class: l.vaq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemODiamondVisitorGuideMessage.m1622a(act, view);
                }
            });
            xdl0.E0(this.f1223e, new View.OnClickListener() { // from class: l.waq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemODiamondVisitorGuideMessage.m1624c(user, act, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1625d(this);
        m1626e();
    }

    public ItemODiamondVisitorGuideMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemODiamondVisitorGuideMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ItemODiamondVisitorGuideMessage(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
