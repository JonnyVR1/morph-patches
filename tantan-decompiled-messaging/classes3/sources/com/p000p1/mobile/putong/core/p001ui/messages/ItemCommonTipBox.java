package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemCommonTipBox;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CommonTipBox;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.j2e0;
import l.lsi0;
import l.m2q;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.ura;
import l.xdl0;
import p003l.e30;
import p003l.eqh0;
import p003l.j000;
import p003l.m250;
import p028v.VDraweeView;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemCommonTipBox extends VLinear {

    /* JADX INFO: renamed from: c */
    public ItemCommonTipBox f785c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f786d;

    /* JADX INFO: renamed from: e */
    public VText f787e;

    /* JADX INFO: renamed from: f */
    public VText f788f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f789g;

    public ItemCommonTipBox(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m1182P(boolean z, CommonTipBox commonTipBox, Act act, View view) {
        if (!CoreModule.P().a().w()) {
            lsi0.y("功能已下线");
            return;
        }
        o6j0.c("e_chat_complete_profile", "p_chat_view", new o6j0.a[]{o6j0.a.h("is_profile_complete", z ? "false" : "true")});
        if (z && !TextUtils.isEmpty(commonTipBox.schema)) {
            j2e0.m(act, Uri.parse(commonTipBox.schema));
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m1184R(View view) {
        m2q.a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m1185S(final CommonTipBox commonTipBox, final Act act, User user) {
        boolean zKq = ura.e().d().Kq(user);
        final boolean z = !zKq;
        String str = !zKq ? commonTipBox.button : commonTipBox.disabledButton;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText_Bold vText_Bold = this.f789g;
        if (zIsEmpty) {
            xdl0.M(vText_Bold, false);
        } else {
            vText_Bold.setText(str);
            VText_Bold vText_Bold2 = this.f789g;
            if (zKq) {
                vText_Bold2.setTextColor(Color.parseColor("#33000000"));
            } else {
                vText_Bold2.setTextColor(Color.parseColor("#FE7E1D"));
            }
            xdl0.M(this.f789g, true);
        }
        o6j0.h("e_chat_complete_profile", "p_chat_view", new o6j0.a[]{o6j0.a.h("is_profile_complete", !zKq ? "false" : "true")});
        xdl0.E0(this.f789g, new View.OnClickListener() { // from class: l.j2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemCommonTipBox.m1182P(z, commonTipBox, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m1186T(final Act act, j000 j000Var, Message message) {
        this.f787e.setTypeface(eqh0.m3924c(3), 1);
        if (!NullChecker.a(message) || !NullChecker.a(message.additionalData) || !NullChecker.a(message.additionalData.commonTipBox)) {
            xdl0.M(this, false);
            return;
        }
        xdl0.M(this, true);
        final CommonTipBox commonTipBox = message.additionalData.commonTipBox;
        if (!TextUtils.isEmpty(commonTipBox.iconUrl)) {
            qib0.G.L0(this.f786d, commonTipBox.iconUrl);
        }
        if (!TextUtils.isEmpty(commonTipBox.title)) {
            this.f787e.setText(commonTipBox.title);
        }
        if (!TextUtils.isEmpty(commonTipBox.subtitle)) {
            this.f788f.setText(commonTipBox.subtitle);
        }
        j000Var.c(act, CoreModule.c.e0.Ka(CoreModule.H().userId())).subscribe((m250) mkd0.G(new e30() { // from class: l.i2q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4326a.m1185S(commonTipBox, act, (User) obj);
            }
        }));
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
        m1184R(this);
        if (ura.e().d().I4()) {
            this.f787e.setTextColor(getResources().getColor(a1c0.g));
            this.f789g.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemCommonTipBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCommonTipBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
