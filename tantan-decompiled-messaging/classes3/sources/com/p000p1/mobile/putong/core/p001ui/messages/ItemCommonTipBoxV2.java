package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemCommonTipBoxV2;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CommonTipBox;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l.a1c0;
import l.c3c0;
import l.j2e0;
import l.l2q;
import l.qib0;
import l.ura;
import l.xdl0;
import l.zvf0;
import org.json.JSONObject;
import p003l.j000;
import p003l.qsz;
import p028v.VDraweeView;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemCommonTipBoxV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public ItemCommonTipBoxV2 f790c;

    /* JADX INFO: renamed from: d */
    public VLinear f791d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f792e;

    /* JADX INFO: renamed from: f */
    public VText f793f;

    /* JADX INFO: renamed from: g */
    public VText f794g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f795h;

    /* JADX INFO: renamed from: i */
    public VText f796i;

    public ItemCommonTipBoxV2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m1187P(CommonTipBox commonTipBox, HashMap map, Act act, View view) {
        zvf0.s(commonTipBox.statsModuleId, "p_chat_view", map);
        if (TextUtils.isEmpty(commonTipBox.schema)) {
            return;
        }
        j2e0.m(act, Uri.parse(commonTipBox.schema));
    }

    /* JADX INFO: renamed from: R */
    public static void m1188R(Message message, CommonTipBox commonTipBox, HashMap<String, Object> map) {
        if (TextUtils.equals(commonTipBox.type, "verify")) {
            User userP9 = CoreModule.c.e0.p9();
            if (NullChecker.a(userP9)) {
                map.put("has_verified", Integer.valueOf(userP9.isPicVerificationVerified() ? 1 : 0));
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m1189Q(View view) {
        l2q.a(this, view);
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
    /* JADX INFO: renamed from: S */
    public void m1190S(final Act act, j000 j000Var, Message message) {
        if (!NullChecker.a(message) || !NullChecker.a(message.additionalData) || !NullChecker.a(message.additionalData.commonTipBox)) {
            xdl0.M(this, false);
            return;
        }
        xdl0.M(this, true);
        final CommonTipBox commonTipBox = message.additionalData.commonTipBox;
        if (!TextUtils.isEmpty(commonTipBox.iconUrl)) {
            qib0.G.L0(this.f792e, commonTipBox.iconUrl);
        }
        if (!TextUtils.isEmpty(commonTipBox.title)) {
            this.f793f.setText(commonTipBox.title);
        }
        if (!TextUtils.isEmpty(commonTipBox.subtitle)) {
            this.f794g.setText(commonTipBox.subtitle);
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
        m1188R(message, commonTipBox, map);
        boolean zIsEmpty = TextUtils.isEmpty(commonTipBox.button);
        AppCompatTextView appCompatTextView = this.f796i;
        if (zIsEmpty) {
            xdl0.M(appCompatTextView, false);
        } else {
            appCompatTextView.setText(commonTipBox.button);
            xdl0.M(this.f796i, true);
            this.f796i.setTextColor(Color.parseColor("#FE7E1D"));
            xdl0.E0(this.f796i, new View.OnClickListener() { // from class: l.k2q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemCommonTipBoxV2.m1187P(commonTipBox, map, act, view);
                }
            });
        }
        m1191T(j000Var.f4538r, message, commonTipBox.statsModuleId, map);
    }

    /* JADX INFO: renamed from: T */
    public final void m1191T(qsz qszVar, Message message, String str, Map<String, Object> map) {
        String str2 = "ITEM_COMMON_TIP_BOX_V2" + str + map.toString() + ((DbObject) message).id;
        if (qszVar.m7030a(str2)) {
            return;
        }
        qszVar.m7031b(str2);
        zvf0.y(str, "p_chat_view", map);
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
        m1189Q(this);
        if (ura.e().d().I4()) {
            xdl0.N(this.f792e, c3c0.p2);
            this.f793f.setTextColor(getResources().getColor(a1c0.g));
            this.f794g.setTextColor(getResources().getColor(a1c0.i));
            this.f796i.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemCommonTipBoxV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCommonTipBoxV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
