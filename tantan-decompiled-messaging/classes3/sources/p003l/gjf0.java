package p003l;

import android.graphics.Point;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gjf0 extends ydk {

    /* JADX INFO: renamed from: a */
    private ejf0 f3898a;

    /* JADX INFO: renamed from: b */
    private float f3899b = 0.8f;

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
    public gjf0() {
        this.useNewViewPort = true;
        Point[] pointArr = {new Point(0, 0), new Point(255, 255)};
        Point[] pointArr2 = {new Point(0, 0), new Point(EACTags.COMPATIBLE_TAG_ALLOCATION_AUTHORITY, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA), new Point(255, 255)};
        ts2 apd0Var = new apd0(1.0f);
        ts2 wsi0Var = new wsi0(pointArr, pointArr, pointArr, pointArr2);
        ts2 dcc0Var = new dcc0();
        this.f3898a = new ejf0(0.8f);
        apd0Var.addTarget(wsi0Var);
        apd0Var.addTarget(dcc0Var);
        apd0Var.addTarget(this.f3898a);
        wsi0Var.addTarget(this.f3898a);
        dcc0Var.addTarget(this.f3898a);
        this.f3898a.registerFilterLocation(apd0Var, 0);
        this.f3898a.registerFilterLocation(wsi0Var, 1);
        this.f3898a.registerFilterLocation(dcc0Var, 2);
        this.f3898a.addTarget(this);
        registerInitialFilter(apd0Var);
        registerFilter(wsi0Var);
        registerFilter(dcc0Var);
        registerTerminalFilter(this.f3898a);
    }

    public void setSmoothLevel(float f) {
        synchronized (getLockObject()) {
            this.f3898a.m3890Q1(f);
        }
    }
}
