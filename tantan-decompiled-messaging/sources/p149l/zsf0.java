package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;

/* JADX INFO: loaded from: classes13.dex */
public class zsf0 extends fdq0<xsf0> {

    /* JADX INFO: renamed from: c */
    private boolean f204592c = false;

    public zsf0(xsf0 xsf0Var) {
        this.f97068b = xsf0Var;
    }

    /* JADX INFO: renamed from: b */
    private lo0 m220033b() {
        boolean z = this.f204592c;
        T t = this.f97068b;
        return z ? ((xsf0) t).m210742k().m150759b() : ((xsf0) t).m210742k().m187354g().m150759b();
    }

    /* JADX WARN: Type inference failed for: r6v21, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, java.lang.Integer] */
    @Override // p149l.fdq0
    /* JADX INFO: renamed from: a */
    public void mo121004a(String str, String[] strArr, boolean z) {
        if (z) {
            str.getClass();
            switch (str) {
                case "anim":
                    boolean z2 = this.f204592c;
                    T t = this.f97068b;
                    if (z2) {
                        t60 t60VarM210742k = ((xsf0) t).m210742k();
                        t60VarM210742k.f129055e.add(t60VarM210742k.m187352d());
                        break;
                    } else {
                        m43 m43VarM187354g = ((xsf0) t).m210742k().m187354g();
                        m43VarM187354g.f129055e.add(m43VarM187354g.m152989d());
                        break;
                    }
                    break;
                case "bone":
                    this.f204592c = false;
                    ((xsf0) this.f97068b).m210742k().f167894g.add(new m43(((xsf0) this.f97068b).m210742k()));
                    break;
                case "actor":
                    this.f204592c = true;
                    T t2 = this.f97068b;
                    ((xsf0) t2).f194237A.add(new t60((xsf0) t2));
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
        throw new UnsupportedOperationException("Method not decompiled: p149l.zsf0.mo121004a(java.lang.String, java.lang.String[], boolean):void");
    }
}
