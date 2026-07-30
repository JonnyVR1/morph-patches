package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemODiamondVisitorGuideMessage;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.lyh0;
import p153l.y20;
import p153l.ycq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemODiamondVisitorGuideMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f32176a;

    /* JADX INFO: renamed from: b */
    public TextView f32177b;

    /* JADX INFO: renamed from: c */
    public TextView f32178c;

    /* JADX INFO: renamed from: d */
    public TextView f32179d;

    /* JADX INFO: renamed from: e */
    public ImageView f32180e;

    public ItemODiamondVisitorGuideMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49721a(Act act, View view) {
        CoreModule.m30933P().m143410g().mo36024Og(act, "p_chat,visit_decrypt", new y20() { // from class: l.xcq
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemODiamondVisitorGuideMessage.m49722b((PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
        i4g0.m138523u("e_visit_times_decrypt", OMSDialogPositon.p_chat_view, jyb.m147494Y("button_type", "open"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49722b(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m49723c(User user, Act act, View view) {
        i4g0.m138523u("e_visit_times_decrypt", OMSDialogPositon.p_chat_view, jyb.m147494Y("button_type", "close"));
        CoreModule.m30933P().m143408e().mo35973Kh(user.f56859id);
        ((MessagesAct) act).f32488f.mo110860G6();
    }

    /* JADX INFO: renamed from: d */
    public final void m49724d(View view) {
        ycq.m215173a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m49725e() {
        this.f32176a.setTypeface(lyh0.m156283c(3), 1);
        this.f32177b.setTypeface(lyh0.m156283c(3), 1);
    }

    /* JADX INFO: renamed from: f */
    public void m49726f(final Act act, Message message, final User user) {
        if (act instanceof MessagesAct) {
            try {
                JSONObject jSONObject = new JSONObject(message.value);
                String strOptString = jSONObject.optString("title");
                String strOptString2 = jSONObject.optString("sub_title");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    this.f32176a.setText(strOptString);
                    this.f32178c.setText(strOptString2);
                }
            } catch (JSONException unused) {
            }
            bnl0.m105509E0(this.f32179d, new View.OnClickListener() { // from class: l.vcq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemODiamondVisitorGuideMessage.m49721a(act, view);
                }
            });
            bnl0.m105509E0(this.f32180e, new View.OnClickListener() { // from class: l.wcq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemODiamondVisitorGuideMessage.m49723c(user, act, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49724d(this);
        m49725e();
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
