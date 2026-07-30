package p003l;

import android.animation.ValueAnimator;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cpy extends bpy {

    /* JADX INFO: renamed from: m */
    public int f2745m;

    /* JADX INFO: renamed from: l.cpy$a */
    public class C0206a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f2746a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MessageBarActionItemView f2747b;

        public C0206a(boolean z, MessageBarActionItemView messageBarActionItemView) {
            this.f2746a = z;
            this.f2747b = messageBarActionItemView;
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
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            boolean z = this.f2746a;
            cpy cpyVar = cpy.this;
            this.f2747b.f1819a.setColorFilter(z ? cpyVar.m2979m(cpyVar.f2424j, cpyVar.f2423i, iIntValue) : cpyVar.m2979m(cpyVar.f2423i, cpyVar.f2424j, iIntValue));
        }
    }

    public cpy(MessageBarActionItemType messageBarActionItemType, int i) {
        super(messageBarActionItemType, i);
        this.f2745m = 0;
    }

    @Override // p003l.bpy, p003l.uoy
    /* JADX INFO: renamed from: c */
    public void mo2907c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo2907c(messageBarActionItemView, i, i2);
        m3415o(messageBarActionItemView);
    }

    /* JADX INFO: renamed from: o */
    public final void m3415o(MessageBarActionItemView messageBarActionItemView) {
        boolean z = (this.f2745m & 1) > 0;
        if (z != ((this.f8049f & 1) > 0)) {
            ValueAnimator duration = ValueAnimator.ofInt(0, 100).setDuration(150L);
            duration.addUpdateListener(new C0206a(z, messageBarActionItemView));
            duration.start();
        }
        this.f2745m = this.f8049f;
    }

    public cpy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f2745m = 0;
    }
}
