package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;

/* JADX INFO: loaded from: classes11.dex */
public class i1g0 extends kmq0<g1g0> {

    /* JADX INFO: renamed from: c */
    private boolean f112516c = false;

    public i1g0(g1g0 g1g0Var) {
        this.f127530b = g1g0Var;
    }

    /* JADX INFO: renamed from: b */
    private ho0 m138099b() {
        boolean z = this.f112516c;
        T t = this.f127530b;
        return z ? ((g1g0) t).m128510k().m136376b() : ((g1g0) t).m128510k().m170709g().m136376b();
    }

    /* JADX WARN: Type inference failed for: r6v21, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, java.lang.Integer] */
    @Override // p153l.kmq0
    /* JADX INFO: renamed from: a */
    public void mo138100a(String str, String[] strArr, boolean z) {
        if (z) {
            str.getClass();
            switch (str) {
                case "anim":
                    boolean z2 = this.f112516c;
                    T t = this.f127530b;
                    if (z2) {
                        p60 p60VarM128510k = ((g1g0) t).m128510k();
                        p60VarM128510k.f110862e.add(p60VarM128510k.m170707d());
                        break;
                    } else {
                        c53 c53VarM170709g = ((g1g0) t).m128510k().m170709g();
                        c53VarM170709g.f110862e.add(c53VarM170709g.m107977d());
                        break;
                    }
                    break;
                case "bone":
                    this.f112516c = false;
                    ((g1g0) this.f127530b).m128510k().f150716g.add(new c53(((g1g0) this.f127530b).m128510k()));
                    break;
                case "actor":
                    this.f112516c = true;
                    T t2 = this.f127530b;
                    ((g1g0) t2).f101750A.add(new p60((g1g0) t2));
                    break;
            }
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1992012396:
                if (str.equals(BLiveOperationTitleShowType.duration)) {
                }
                break;
            case -1820889964:
                if (str.equals("extend_y")) {
                }
                break;
            case -1445158613:
                if (str.equals("rotate_interpolator")) {
                }
                break;
            case -1379405195:
                if (str.equals("move_interpolator")) {
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                }
                break;
            case -852068928:
                if (str.equals("width_height")) {
                }
                break;
            case -418716716:
                if (str.equals("src_ltwh")) {
                }
                break;
            case -98586022:
                if (str.equals("src_id_wh")) {
                }
                break;
            case -64908900:
                if (str.equals("scale_interpolator")) {
                }
                break;
            case 3357649:
                if (str.equals("move")) {
                }
                break;
            case 3373707:
                if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                }
                break;
            case 108280125:
                if (str.equals("range")) {
                }
                break;
            case 109250890:
                if (str.equals(BigEyeFilter.UNIFORM_SCALE)) {
                }
                break;
            case 1216326152:
                if (str.equals("alpha_interpolator")) {
                }
                break;
            case 2011608879:
                if (str.equals("layout_type")) {
                }
                break;
        }
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Switch insn not found in header
            	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.i1g0.mo138100a(java.lang.String, java.lang.String[], boolean):void");
    }
}
