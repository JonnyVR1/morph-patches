package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.ura;
import l.xdl0;
import p003l.e30;
import p028v.VLinear_MaxWidth;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AudioTranslationView extends VLinear_MaxWidth {

    /* JADX INFO: renamed from: b */
    public VText f573b;

    /* JADX INFO: renamed from: c */
    public ProgressBar f574c;

    /* JADX INFO: renamed from: d */
    public int f575d;

    /* JADX INFO: renamed from: e */
    public e30<Boolean> f576e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.AudioTranslationView$a */
    public static class C0054a {
        /* JADX INFO: renamed from: b */
        public static void m937b(AudioTranslationView audioTranslationView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            audioTranslationView.f573b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            audioTranslationView.f574c = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public AudioTranslationView(Context context) {
        super(context);
        this.f575d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m934c(View view) {
        C0054a.m937b(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m935d(String str) {
        setState(2);
        this.f573b.setText(str);
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
        m934c(this);
        if (ura.e().d().I4()) {
            this.f573b.setTextColor(getResources().getColor(a1c0.g));
            this.f574c.setIndeterminateDrawable(getResources().getDrawable(c3c0.m));
        }
    }

    public void setAudioViewVisibleCallback(e30<Boolean> e30Var) {
        this.f576e = e30Var;
    }

    public void setState(int i) {
        int i2 = this.f575d;
        this.f575d = i;
        xdl0.M(this, i != 0);
        if (NullChecker.a(this.f576e)) {
            this.f576e.call(Boolean.valueOf(i != 0));
        }
        if (i == 0 || i == 2) {
            if (i2 == 1) {
                this.f574c.setIndeterminate(false);
            }
            xdl0.M(this.f574c, false);
        } else {
            xdl0.M(this.f574c, true);
            this.f574c.setIndeterminate(true);
        }
        xdl0.M(this.f573b, i == 2);
    }

    public AudioTranslationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f575d = 0;
    }

    public AudioTranslationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f575d = 0;
    }
}
