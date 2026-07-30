package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CommonTipBox;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemCommonTipBoxV2;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.j000;
import p149l.j2e0;
import p149l.l2q;
import p149l.qib0;
import p149l.qsz;
import p149l.ura;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemCommonTipBoxV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public ItemCommonTipBoxV2 f30899c;

    /* JADX INFO: renamed from: d */
    public VLinear f30900d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f30901e;

    /* JADX INFO: renamed from: f */
    public VText f30902f;

    /* JADX INFO: renamed from: g */
    public VText f30903g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f30904h;

    /* JADX INFO: renamed from: i */
    public VText f30905i;

    public ItemCommonTipBoxV2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m48107P(CommonTipBox commonTipBox, HashMap map, Act act, View view) {
        zvf0.m220397s(commonTipBox.statsModuleId, OMSDialogPositon.p_chat_view, map);
        if (TextUtils.isEmpty(commonTipBox.schema)) {
            return;
        }
        j2e0.m139446m(act, Uri.parse(commonTipBox.schema));
    }

    /* JADX INFO: renamed from: R */
    public static void m48108R(Message message, CommonTipBox commonTipBox, HashMap<String, Object> map) {
        if (TextUtils.equals(commonTipBox.type, "verify")) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9)) {
                map.put("has_verified", Integer.valueOf(userM169527p9.isPicVerificationVerified() ? 1 : 0));
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m48109Q(View view) {
        l2q.m148294a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m48110S(final Act act, j000 j000Var, Message message) {
        if (!NullChecker.m81303a(message) || !NullChecker.m81303a(message.additionalData) || !NullChecker.m81303a(message.additionalData.commonTipBox)) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this, true);
        final CommonTipBox commonTipBox = message.additionalData.commonTipBox;
        if (!TextUtils.isEmpty(commonTipBox.iconUrl)) {
            qib0.f154691G.m102331L0(this.f30901e, commonTipBox.iconUrl);
        }
        if (!TextUtils.isEmpty(commonTipBox.title)) {
            this.f30902f.setText(commonTipBox.title);
        }
        if (!TextUtils.isEmpty(commonTipBox.subtitle)) {
            this.f30903g.setText(commonTipBox.subtitle);
        }
        final HashMap map = new HashMap();
        try {
            if (!TextUtils.isEmpty(commonTipBox.statsModuleParameter)) {
                JSONObject jSONObject = new JSONObject(commonTipBox.statsModuleParameter);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.get(next));
                }
            }
        } catch (Exception unused) {
        }
        m48108R(message, commonTipBox, map);
        boolean zIsEmpty = TextUtils.isEmpty(commonTipBox.button);
        VText vText = this.f30905i;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        } else {
            vText.setText(commonTipBox.button);
            xdl0.m208344M(this.f30905i, true);
            this.f30905i.setTextColor(Color.parseColor("#FE7E1D"));
            xdl0.m208329E0(this.f30905i, new View.OnClickListener() { // from class: l.k2q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemCommonTipBoxV2.m48107P(commonTipBox, map, act, view);
                }
            });
        }
        m48111T(j000Var.f115625r, message, commonTipBox.statsModuleId, map);
    }

    /* JADX INFO: renamed from: T */
    public final void m48111T(qsz qszVar, Message message, String str, Map<String, Object> map) {
        String str2 = "ITEM_COMMON_TIP_BOX_V2" + str + map.toString() + message.f56011id;
        if (qszVar.m176377a(str2)) {
            return;
        }
        qszVar.m176378b(str2);
        zvf0.m220403y(str, OMSDialogPositon.p_chat_view, map);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48109Q(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f30901e, c3c0.f78830p2);
            this.f30902f.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30903g.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30905i.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemCommonTipBoxV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCommonTipBoxV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
