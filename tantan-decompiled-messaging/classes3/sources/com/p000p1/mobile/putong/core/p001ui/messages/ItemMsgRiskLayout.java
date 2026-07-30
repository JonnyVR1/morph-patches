package com.p000p1.mobile.putong.core.p001ui.messages;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMsgRiskLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.HarassAlertInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.j2e0;
import l.lsi0;
import l.taq;
import l.ura;
import l.xdl0;
import p003l.f30;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMsgRiskLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f1208c;

    /* JADX INFO: renamed from: d */
    public VImage f1209d;

    /* JADX INFO: renamed from: e */
    public VText f1210e;

    /* JADX INFO: renamed from: f */
    public VText f1211f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f1212g;

    /* JADX INFO: renamed from: h */
    public VLinear f1213h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f1214i;

    /* JADX INFO: renamed from: j */
    public VText f1215j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f1216k;

    /* JADX INFO: renamed from: l */
    public VText f1217l;

    /* JADX INFO: renamed from: m */
    public VText f1218m;

    public ItemMsgRiskLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m1617Q(Message message, String str, String str2) {
        if (TextUtils.equals(str, "cancel")) {
            return;
        }
        CoreModule.c.f0.vq(message, true);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m1618R(Message message, View view) {
        lsi0.y("感谢反馈，探探将持续保持良好的社交环境");
        CoreModule.c.f0.vq(message, false);
    }

    /* JADX INFO: renamed from: A */
    public void m1619A(final Message message) {
        HarassAlertInfo harassAlertInfo;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (harassAlertInfo = messageAdditionalData.harassAlertInfo) == null || TextUtils.equals(harassAlertInfo.status, "reported") || TextUtils.equals(message.additionalData.harassAlertInfo.status, "ignored")) {
            xdl0.M(this.f1218m, true);
            xdl0.M(this.f1213h, false);
            return;
        }
        xdl0.M(this.f1218m, false);
        xdl0.M(this.f1213h, true);
        xdl0.E0(this.f1214i, new View.OnClickListener() { // from class: l.qaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemMsgRiskLayout.m1618R(message, view);
            }
        });
        final String str = (NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.harassAlertInfo)) ? message.additionalData.harassAlertInfo.triggeredMsgID : null;
        xdl0.E0(this.f1216k, new View.OnClickListener() { // from class: l.raq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6823a.m1621T(message, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m1620S(View view) {
        taq.a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m1621T(final Message message, String str, View view) {
        j2e0.n((Activity) getContext(), Uri.parse("tantan://msgReport?uid=" + message.owner + "&conType=hitModelMessage&value=maleHarass&msgId=" + str), new f30() { // from class: l.saq
            @Override // p003l.f30
            public final void call(Object obj, Object obj2) {
                ItemMsgRiskLayout.m1617Q(message, (String) obj, (String) obj2);
            }
        });
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
        m1620S(this);
        if (ura.e().d().I4()) {
            this.f1209d.setImageResource(c3c0.R5);
            this.f1210e.setTextColor(getResources().getColor(a1c0.g));
            this.f1211f.setTextColor(getResources().getColor(a1c0.i));
            this.f1215j.setTextColor(getResources().getColor(a1c0.g));
            this.f1217l.setTextColor(getResources().getColor(a1c0.g));
            this.f1218m.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemMsgRiskLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMsgRiskLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
