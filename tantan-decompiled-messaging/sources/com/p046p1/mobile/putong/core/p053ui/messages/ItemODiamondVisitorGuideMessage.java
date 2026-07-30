package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemODiamondVisitorGuideMessage;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.e30;
import p149l.eqh0;
import p149l.vwb;
import p149l.xdl0;
import p149l.yaq;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemODiamondVisitorGuideMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f31328a;

    /* JADX INFO: renamed from: b */
    public TextView f31329b;

    /* JADX INFO: renamed from: c */
    public TextView f31330c;

    /* JADX INFO: renamed from: d */
    public TextView f31331d;

    /* JADX INFO: renamed from: e */
    public ImageView f31332e;

    public ItemODiamondVisitorGuideMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48538a(Act act, View view) {
        CoreModule.m29935P().m94656g().mo35021Og(act, "p_chat,visit_decrypt", new e30() { // from class: l.xaq
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemODiamondVisitorGuideMessage.m48539b((PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
        zvf0.m220399u("e_visit_times_decrypt", OMSDialogPositon.p_chat_view, vwb.m200311Y("button_type", "open"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m48539b(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m48540c(User user, Act act, View view) {
        zvf0.m220399u("e_visit_times_decrypt", OMSDialogPositon.p_chat_view, vwb.m200311Y("button_type", "close"));
        CoreModule.m29935P().m94654e().mo34970Kh(user.f56011id);
        ((MessagesAct) act).f31640f.mo120654G6();
    }

    /* JADX INFO: renamed from: d */
    public final void m48541d(View view) {
        yaq.m213869a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m48542e() {
        this.f31328a.setTypeface(eqh0.m117752c(3), 1);
        this.f31329b.setTypeface(eqh0.m117752c(3), 1);
    }

    /* JADX INFO: renamed from: f */
    public void m48543f(final Act act, Message message, final User user) {
        if (act instanceof MessagesAct) {
            try {
                JSONObject jSONObject = new JSONObject(message.value);
                String strOptString = jSONObject.optString("title");
                String strOptString2 = jSONObject.optString("sub_title");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    this.f31328a.setText(strOptString);
                    this.f31330c.setText(strOptString2);
                }
            } catch (JSONException unused) {
            }
            xdl0.m208329E0(this.f31331d, new View.OnClickListener() { // from class: l.vaq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemODiamondVisitorGuideMessage.m48538a(act, view);
                }
            });
            xdl0.m208329E0(this.f31332e, new View.OnClickListener() { // from class: l.waq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemODiamondVisitorGuideMessage.m48540c(user, act, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48541d(this);
        m48542e();
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
