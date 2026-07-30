package p003l;

import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemView;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zoy extends uoy {

    /* JADX INFO: renamed from: i */
    public int f9389i;

    /* JADX INFO: renamed from: j */
    public int f9390j;

    public zoy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f9389i = -1;
        this.f9390j = -1;
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
    @Override // p003l.uoy
    /* JADX INFO: renamed from: c */
    public void mo2907c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        if (m8187e(2)) {
            messageBarActionItemView.f1819a.setImageResource(this.f8046c);
            messageBarActionItemView.f1819a.setColorFilter(this.f9390j);
        } else {
            messageBarActionItemView.f1819a.setImageResource(this.f8045b);
            messageBarActionItemView.f1819a.setColorFilter(this.f9389i);
        }
        xdl0.M(messageBarActionItemView, this.f8048e & this.f8047d);
    }

    /* JADX INFO: renamed from: l */
    public zoy m9459l(int i) {
        this.f9389i = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public zoy m9460m(int i) {
        this.f9390j = i;
        return this;
    }
}
