package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CommonTipBox;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemCommonTipBoxV2;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.g900;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.l4q;
import p153l.n100;
import p153l.nae0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemCommonTipBoxV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public ItemCommonTipBoxV2 f31747c;

    /* JADX INFO: renamed from: d */
    public VLinear f31748d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f31749e;

    /* JADX INFO: renamed from: f */
    public VText f31750f;

    /* JADX INFO: renamed from: g */
    public VText f31751g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f31752h;

    /* JADX INFO: renamed from: i */
    public VText f31753i;

    public ItemCommonTipBoxV2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m49290P(CommonTipBox commonTipBox, HashMap map, Act act, View view) {
        i4g0.m138521s(commonTipBox.statsModuleId, OMSDialogPositon.p_chat_view, map);
        if (TextUtils.isEmpty(commonTipBox.schema)) {
            return;
        }
        nae0.m162083m(act, Uri.parse(commonTipBox.schema));
    }

    /* JADX INFO: renamed from: R */
    public static void m49291R(Message message, CommonTipBox commonTipBox, HashMap<String, Object> map) {
        if (TextUtils.equals(commonTipBox.type, "verify")) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9)) {
                map.put("has_verified", Integer.valueOf(userM116600p9.isPicVerificationVerified() ? 1 : 0));
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m49292Q(View view) {
        l4q.m152815a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m49293S(final Act act, g900 g900Var, Message message) {
        if (!NullChecker.m82486a(message) || !NullChecker.m82486a(message.additionalData) || !NullChecker.m82486a(message.additionalData.commonTipBox)) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this, true);
        final CommonTipBox commonTipBox = message.additionalData.commonTipBox;
        if (!TextUtils.isEmpty(commonTipBox.iconUrl)) {
            uqb0.f180374G.m127115L0(this.f31749e, commonTipBox.iconUrl);
        }
        if (!TextUtils.isEmpty(commonTipBox.title)) {
            this.f31750f.setText(commonTipBox.title);
        }
        if (!TextUtils.isEmpty(commonTipBox.subtitle)) {
            this.f31751g.setText(commonTipBox.subtitle);
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
        m49291R(message, commonTipBox, map);
        boolean zIsEmpty = TextUtils.isEmpty(commonTipBox.button);
        VText vText = this.f31753i;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        } else {
            vText.setText(commonTipBox.button);
            bnl0.m105524M(this.f31753i, true);
            this.f31753i.setTextColor(Color.parseColor("#FE7E1D"));
            bnl0.m105509E0(this.f31753i, new View.OnClickListener() { // from class: l.k4q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemCommonTipBoxV2.m49290P(commonTipBox, map, act, view);
                }
            });
        }
        m49294T(g900Var.f102745r, message, commonTipBox.statsModuleId, map);
    }

    /* JADX INFO: renamed from: T */
    public final void m49294T(n100 n100Var, Message message, String str, Map<String, Object> map) {
        String str2 = "ITEM_COMMON_TIP_BOX_V2" + str + map.toString() + message.f56859id;
        if (n100Var.m161054a(str2)) {
            return;
        }
        n100Var.m161055b(str2);
        i4g0.m138527y(str, OMSDialogPositon.p_chat_view, map);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49292Q(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f31749e, ibc0.f114105p2);
            this.f31750f.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31751g.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31753i.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemCommonTipBoxV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCommonTipBoxV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
