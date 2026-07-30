package p153l;

import android.graphics.Point;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class prf0 extends ogk {

    /* JADX INFO: renamed from: a */
    private nrf0 f153781a;

    /* JADX INFO: renamed from: b */
    private float f153782b = 0.8f;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public prf0() {
        this.useNewViewPort = true;
        Point[] pointArr = {new Point(0, 0), new Point(255, 255)};
        Point[] pointArr2 = {new Point(0, 0), new Point(120, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA), new Point(255, 255)};
        jt2 cxd0Var = new cxd0(1.0f);
        jt2 z1j0Var = new z1j0(pointArr, pointArr, pointArr, pointArr2);
        jt2 kkc0Var = new kkc0();
        this.f153781a = new nrf0(0.8f);
        cxd0Var.addTarget(z1j0Var);
        cxd0Var.addTarget(kkc0Var);
        cxd0Var.addTarget(this.f153781a);
        z1j0Var.addTarget(this.f153781a);
        kkc0Var.addTarget(this.f153781a);
        this.f153781a.registerFilterLocation(cxd0Var, 0);
        this.f153781a.registerFilterLocation(z1j0Var, 1);
        this.f153781a.registerFilterLocation(kkc0Var, 2);
        this.f153781a.addTarget(this);
        registerInitialFilter(cxd0Var);
        registerFilter(z1j0Var);
        registerFilter(kkc0Var);
        registerTerminalFilter(this.f153781a);
    }

    public void setSmoothLevel(float f) {
        synchronized (getLockObject()) {
            this.f153781a.m164482Q1(f);
        }
    }
}
