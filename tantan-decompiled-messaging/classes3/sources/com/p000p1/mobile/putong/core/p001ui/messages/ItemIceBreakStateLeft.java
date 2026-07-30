package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageExtData;
import com.p1.mobile.putong.core.data.StateData;
import java.io.IOException;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.knb0;
import l.p4q;
import l.qib0;
import l.t100;
import l.ura;
import l.xdl0;
import p028v.VDraweeView;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemIceBreakStateLeft extends VLinear implements InterfaceC0102a {

    /* JADX INFO: renamed from: c */
    public ItemIceBreakStateLeft f914c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f915d;

    /* JADX INFO: renamed from: e */
    public VText f916e;

    /* JADX INFO: renamed from: f */
    public VText f917f;

    public ItemIceBreakStateLeft(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        MessageExtData messageExtData;
        StateData stateData;
        if (message == null || (messageExtData = message.extData) == null || TextUtils.isEmpty(messageExtData.extra)) {
            return;
        }
        try {
            stateData = (StateData) StateData.JSON_ADAPTER.parse(message.extData.extra);
        } catch (IOException unused) {
            stateData = null;
        }
        if (stateData == null) {
            return;
        }
        qib0.G.L0(this.f915d, stateData.emotionUrl);
        this.f916e.setText(stateData.emotionText);
        this.f917f.setText(stateData.value);
        if (TextUtils.equals(stateData.sourceFlag, "chatPartners")) {
            if (message.isMe()) {
                this.f914c.setBackground(App.e.getResources().getDrawable(c3c0.M2));
            }
            xdl0.D0(t100.c().widthPixels - (t100.d(52.0f) * 2), new View[]{this});
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m1287P(View view) {
        p4q.a(this, view);
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
        m1287P(this);
        this.f917f.getPaint().setFakeBoldText(true);
        this.f916e.getPaint().setFakeBoldText(true);
        if (ura.e().d().I4()) {
            this.f916e.setTextColor(getResources().getColor(a1c0.g));
            this.f916e.setTextSize(15.0f);
            this.f917f.setTextColor(getResources().getColor(a1c0.i));
            this.f917f.setTextSize(13.0f);
        }
    }

    public ItemIceBreakStateLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIceBreakStateLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
