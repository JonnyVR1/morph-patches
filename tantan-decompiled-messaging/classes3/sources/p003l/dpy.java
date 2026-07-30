package p003l;

import android.animation.ValueAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemView;
import l.ura;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dpy extends bpy {

    /* JADX INFO: renamed from: m */
    public int f3054m;

    /* JADX INFO: renamed from: l.dpy$a */
    public class C0234a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f3055a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f3056b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MessageBarActionItemView f3057c;

        public C0234a(boolean z, boolean z2, MessageBarActionItemView messageBarActionItemView) {
            this.f3055a = z;
            this.f3056b = z2;
            this.f3057c = messageBarActionItemView;
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
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iM2979m;
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            boolean z = this.f3055a;
            dpy dpyVar = dpy.this;
            if (z) {
                boolean z2 = this.f3056b;
                iM2979m = dpyVar.m2979m(z2 ? dpyVar.f2426l : dpyVar.f2424j, z2 ? dpyVar.f2425k : dpyVar.f2423i, iIntValue);
            } else {
                boolean z3 = this.f3056b;
                iM2979m = dpyVar.m2979m(z3 ? dpyVar.f2425k : dpyVar.f2423i, z3 ? dpyVar.f2426l : dpyVar.f2424j, iIntValue);
            }
            this.f3057c.f1819a.setColorFilter(iM2979m);
            this.f3057c.f1819a.setRotation(this.f3055a ? ((iIntValue * 45.0f) / 100.0f) - 45.0f : (iIntValue * (-45.0f)) / 100.0f);
        }
    }

    public dpy(MessageBarActionItemType messageBarActionItemType, int i) {
        super(messageBarActionItemType, i);
        this.f3054m = 0;
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
    /* JADX INFO: renamed from: o */
    private void m3627o(MessageBarActionItemView messageBarActionItemView) {
        int i;
        boolean z = (this.f3054m & 1) > 0;
        boolean z2 = (this.f8049f & 1) > 0;
        boolean zM8187e = m8187e(2);
        if (z != z2) {
            if (ura.e().d().I4()) {
                AppCompatImageView appCompatImageView = messageBarActionItemView.f1819a;
                if (z) {
                    i = zM8187e ? this.f2425k : this.f2423i;
                } else {
                    i = zM8187e ? this.f2426l : this.f2424j;
                }
                appCompatImageView.setColorFilter(i);
            } else {
                ValueAnimator duration = ValueAnimator.ofInt(0, 100).setDuration(280L);
                duration.addUpdateListener(new C0234a(z, zM8187e, messageBarActionItemView));
                duration.start();
            }
        }
        this.f3054m = this.f8049f;
    }

    @Override // p003l.bpy, p003l.uoy
    /* JADX INFO: renamed from: c */
    public void mo2907c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo2907c(messageBarActionItemView, i, i2);
        if (m8187e(2) && ura.e().d().I4()) {
            if (m8187e(1)) {
                int i3 = this.f8046c;
                if (i3 > 0) {
                    messageBarActionItemView.f1819a.setImageResource(i3);
                }
            } else {
                int i4 = this.f8045b;
                if (i4 > 0) {
                    messageBarActionItemView.f1819a.setImageResource(i4);
                }
            }
        }
        m3627o(messageBarActionItemView);
    }

    public dpy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f3054m = 0;
    }
}
