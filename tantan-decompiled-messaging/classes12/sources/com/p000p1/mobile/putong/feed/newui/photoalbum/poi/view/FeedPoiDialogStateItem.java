package com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.Emotion;
import l.qib0;
import l.t100;
import p007l.roh;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPoiDialogStateItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPoiDialogStateItem f3747c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f3748d;

    /* JADX INFO: renamed from: e */
    public TextView f3749e;

    public FeedPoiDialogStateItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m6115P(View view) {
        roh.m13942a(this, view);
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
    /* JADX INFO: renamed from: Q */
    public void m6116Q(Emotion emotion, boolean z) {
        qib0.G.I0(this.f3748d, emotion.emojiUrl, t100.d(52.0f), t100.d(52.0f));
        this.f3749e.setText(emotion.text);
        this.f3747c.setSelected(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6115P(this);
    }

    public FeedPoiDialogStateItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiDialogStateItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
