package com.p000p1.mobile.putong.core.p001ui.messages;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemLoveBuzzUnlockSuccess;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import l.bt0;
import l.d6q;
import l.qib0;
import l.rw6;
import l.xdl0;
import p003l.d30;
import p003l.tqz;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemLoveBuzzUnlockSuccess extends LinearLayout {

    /* JADX INFO: renamed from: f */
    public static final InterpolatorC0078a f1006f = new InterpolatorC0078a(0.15f);

    /* JADX INFO: renamed from: a */
    public ItemLoveBuzzUnlockSuccess f1007a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1008b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1009c;

    /* JADX INFO: renamed from: d */
    public VText f1010d;

    /* JADX INFO: renamed from: e */
    public tqz f1011e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLoveBuzzUnlockSuccess$a */
    public static class InterpolatorC0078a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f1012a;

        public InterpolatorC0078a(float f) {
            this.f1012a = f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            double dPow = Math.pow(2.0d, (-10.0f) * f);
            float f2 = this.f1012a;
            return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
        }
    }

    public ItemLoveBuzzUnlockSuccess(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1381c() {
    }

    /* JADX INFO: renamed from: d */
    public final void m1382d(View view) {
        d6q.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1383e() {
        xdl0.M0(this.f1008b, true);
        xdl0.M0(this.f1009c, true);
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
    /* JADX INFO: renamed from: f */
    public final void m1384f() {
        SimpleDraweeView simpleDraweeView = this.f1008b;
        simpleDraweeView.setPivotX((simpleDraweeView.getWidth() / 3) * 2);
        SimpleDraweeView simpleDraweeView2 = this.f1008b;
        simpleDraweeView2.setPivotY(simpleDraweeView2.getHeight() * 2);
        SimpleDraweeView simpleDraweeView3 = this.f1009c;
        simpleDraweeView3.setPivotX(simpleDraweeView3.getWidth() / 3);
        SimpleDraweeView simpleDraweeView4 = this.f1009c;
        simpleDraweeView4.setPivotY(simpleDraweeView4.getHeight() * 2);
        SimpleDraweeView simpleDraweeView5 = this.f1008b;
        InterpolatorC0078a interpolatorC0078a = f1006f;
        Property property = View.ROTATION;
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(simpleDraweeView5, property, 0L, 1500L, interpolatorC0078a, new float[]{-6.0f, 0.0f}), bt0.l(this.f1009c, property, 0L, 1500L, interpolatorC0078a, new float[]{6.0f, 0.0f})});
        bt0.v(animatorZ, new Runnable() { // from class: l.b6q
            @Override // java.lang.Runnable
            public final void run() {
                this.f2344a.m1383e();
            }
        });
        animatorZ.start();
        this.f1011e.m7883J1(new d30() { // from class: l.c6q
            @Override // p003l.d30
            public final void call() {
                ItemLoveBuzzUnlockSuccess.m1381c();
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
    /* JADX INFO: renamed from: g */
    public void m1385g(tqz tqzVar, User user, User user2, Conversation conversation) {
        this.f1011e = tqzVar;
        if (user.isBannedNew() || user.isAccountCancellation()) {
            qib0.G.Y0(this.f1008b, CoreModule.l.i().T0());
        } else {
            qib0.G.L0(this.f1008b, rw6.a(user).profileSmall().formatted());
        }
        if (CoreModule.P().b().Wr(conversation)) {
            this.f1010d.setText(R.string.B3);
        }
        qib0.G.L0(this.f1009c, rw6.b(user2).profileSmall().formatted());
        if (tqzVar.m7886L0()) {
            xdl0.M0(this.f1008b, false);
            xdl0.M0(this.f1009c, false);
            this.f1011e.m7962w0();
            post(new Runnable() { // from class: l.a6q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2084a.m1384f();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1382d(this);
    }

    public ItemLoveBuzzUnlockSuccess(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLoveBuzzUnlockSuccess(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
