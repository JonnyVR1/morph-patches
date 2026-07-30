package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemRecentlySee;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.view.MessageLinearMaxWidth;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.e51;
import l.ffx;
import l.knb0;
import l.mkd0;
import l.qib0;
import l.ura;
import l.vwb;
import l.y4c0;
import p003l.dml;
import p003l.e30;
import p003l.m250;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemRecentlySee extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: g */
    public static int f1339g;

    /* JADX INFO: renamed from: a */
    public ItemRecentlySee f1340a;

    /* JADX INFO: renamed from: b */
    public MessageLinearMaxWidth f1341b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1342c;

    /* JADX INFO: renamed from: d */
    public VText f1343d;

    /* JADX INFO: renamed from: e */
    public VText f1344e;

    /* JADX INFO: renamed from: f */
    public ItemText f1345f;

    public ItemRecentlySee(@NonNull Context context) {
        super(context);
        onFinishInflate();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m1714a(InterfaceC0102a.a aVar, View view) {
        aVar.mo1435a();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1715b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m1718e(View view) {
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1345f.mo1056A(message);
        if (getContext() instanceof Act) {
            getContext().duringCreated(CoreModule.c.s1.r3(message.referenceMsgId)).subscribe((m250) mkd0.H(new e30() { // from class: l.idq
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4394a.m1720g((CoreData) obj);
                }
            }, new e30() { // from class: l.jdq
                @Override // p003l.e30
                public final void call(Object obj) {
                    ItemRecentlySee.m1715b((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return vwb.f0(new knb0[]{vwb.Z(getContext().getString(R.string.c), new Runnable() { // from class: l.fdq
            @Override // java.lang.Runnable
            public final void run() {
                this.f3570a.m1719f();
            }
        }, Integer.valueOf(c3c0.x1), (Object) null)});
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: U */
    public void mo1068U(dml dmlVar, Message message, final InterfaceC0102a.a aVar) {
        this.f1345f.mo1210y(message, aVar);
        this.f1345f.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.gdq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemRecentlySee.m1714a(aVar, view);
            }
        });
        this.f1341b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hdq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemRecentlySee.m1718e(view);
            }
        });
        mo1056A(message);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m1719f() {
        e51.q(this.f1345f.getText().toString());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1720g(CoreData coreData) {
        List list = coreData.literatures;
        if (vwb.J(list)) {
            return;
        }
        Literatures literatures = (Literatures) list.get(0);
        qib0.G.N0(this.f1342c, literatures.headUrl, false);
        this.f1343d.setText(literatures.title);
        CharSequence charSequenceQ5 = CoreModule.P().i().q5(literatures);
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceQ5);
        AppCompatTextView appCompatTextView = this.f1344e;
        if (zIsEmpty) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setVisibility(0);
            this.f1344e.setText(charSequenceQ5);
        }
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
        this.f1340a = (ItemRecentlySee) findViewById(y4c0.Z);
        this.f1341b = findViewById(y4c0.O1);
        this.f1342c = (VDraweeView) findViewById(y4c0.h0);
        this.f1343d = (VText) findViewById(y4c0.Q4);
        this.f1344e = (VText) findViewById(y4c0.r0);
        this.f1345f = (ItemText) findViewById(y4c0.A4);
        this.f1343d.setTypeface(Typeface.defaultFromStyle(1));
        if (ura.e().d().I4()) {
            this.f1343d.setTextColor(getResources().getColor(a1c0.g));
            this.f1344e.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iD = ffx.d(i);
        f1339g = iD;
        this.f1341b.setMaxWidth(iD);
        super.onMeasure(i, i2);
    }

    public ItemRecentlySee(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRecentlySee(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
