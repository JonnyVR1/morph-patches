package p003l;

import android.graphics.Color;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class bpy extends uoy {

    /* JADX INFO: renamed from: i */
    public int f2423i;

    /* JADX INFO: renamed from: j */
    public int f2424j;

    /* JADX INFO: renamed from: k */
    public int f2425k;

    /* JADX INFO: renamed from: l */
    public int f2426l;

    public bpy(MessageBarActionItemType messageBarActionItemType, int i) {
        super(messageBarActionItemType, i, -1);
        this.f2423i = -1;
        this.f2424j = -1;
        this.f2425k = -1;
        this.f2426l = -1;
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
        super.mo2907c(messageBarActionItemView, i, i2);
        if (m8187e(2)) {
            if (m8187e(1)) {
                messageBarActionItemView.f1819a.setColorFilter(this.f2426l);
                return;
            } else {
                messageBarActionItemView.f1819a.setColorFilter(this.f2425k);
                return;
            }
        }
        if (m8187e(1)) {
            int i3 = this.f2424j;
            if (i3 > 0) {
                messageBarActionItemView.f1819a.setColorFilter(i3);
                return;
            }
            return;
        }
        int i4 = this.f2423i;
        if (i4 > 0) {
            messageBarActionItemView.f1819a.setColorFilter(i4);
        }
    }

    /* JADX INFO: renamed from: l */
    public bpy mo2978l(int i) {
        this.f2423i = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public int m2979m(int i, int i2, int i3) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iRed2 = Color.red(i2);
        int iGreen2 = Color.green(i2);
        return Color.argb(iAlpha + ((i3 * (Color.alpha(i2) - iAlpha)) / 100), iRed + (((iRed2 - iRed) * i3) / 100), iGreen + (((iGreen2 - iGreen) * i3) / 100), iBlue + (((Color.blue(i2) - iBlue) * i3) / 100));
    }

    /* JADX INFO: renamed from: n */
    public bpy mo2980n(int i) {
        this.f2424j = i;
        return this;
    }

    public bpy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f2423i = -1;
        this.f2424j = -1;
        this.f2425k = -1;
        this.f2426l = -1;
    }
}
