package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.InterestLevel;
import com.p000p1.mobile.putong.core.data.Literatures;
import com.p000p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ldm {
    /* JADX INFO: renamed from: a */
    public static String m7715a(LiteraturesComments literaturesComments, LiteraturesComments literaturesComments2) {
        if (literaturesComments2 != null && literaturesComments != null && !TextUtils.isEmpty(literaturesComments2.interestLevel) && !TextUtils.isEmpty(literaturesComments.interestLevel) && literaturesComments.interestLevel.equals(literaturesComments2.interestLevel)) {
            String str = literaturesComments.interestLevel;
            str.getClass();
            switch (str) {
                case "to_watch":
                    return "both_wish";
                case "watching":
                    return "both_watching";
                case "watched":
                    return "both_watched";
                default:
                    return "";
            }
        }
        if (!NullChecker.a(literaturesComments)) {
            return "";
        }
        String str2 = literaturesComments.interestLevel;
        str2.getClass();
        switch (str2.hashCode()) {
            case -1431097845:
                if (!str2.equals(InterestLevel.to_watch)) {
                }
                break;
            case 545156275:
                if (!str2.equals(InterestLevel.watching)) {
                }
                break;
            case 1125964206:
                if (!str2.equals(InterestLevel.watched)) {
                }
                break;
            default:
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
            r0 = 2
            java.lang.String r1 = "watched"
            r2 = 1
            java.lang.String r3 = "watching"
            r4 = 0
            java.lang.String r5 = "to_watch"
            r6 = -1
            java.lang.String r7 = ""
            if (r10 == 0) goto L5d
            if (r9 == 0) goto L5d
            java.lang.String r8 = r10.interestLevel
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L5d
            java.lang.String r8 = r9.interestLevel
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L5d
            java.lang.String r8 = r9.interestLevel
            java.lang.String r10 = r10.interestLevel
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L5d
            java.lang.String r9 = r9.interestLevel
            r9.getClass()
            int r10 = r9.hashCode()
            switch(r10) {
                case -1431097845: goto L48;
                case 545156275: goto L3f;
                case 1125964206: goto L38;
                default: goto L36;
            }
        L36:
            r0 = r6
            goto L50
        L38:
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L50
            goto L36
        L3f:
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L46
            goto L36
        L46:
            r0 = r2
            goto L50
        L48:
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L4f
            goto L36
        L4f:
            r0 = r4
        L50:
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L57;
                case 2: goto L54;
                default: goto L53;
            }
        L53:
            return r7
        L54:
            java.lang.String r9 = "both_watched"
            return r9
        L57:
            java.lang.String r9 = "both_watching"
            return r9
        L5a:
            java.lang.String r9 = "both_wish"
            return r9
        L5d:
            boolean r10 = com.tantanapp.common.utils.NullChecker.a(r9)
            if (r10 == 0) goto L96
            java.lang.String r9 = r9.interestLevel
            r9.getClass()
            int r10 = r9.hashCode()
            switch(r10) {
                case -1431097845: goto L81;
                case 545156275: goto L78;
                case 1125964206: goto L71;
                default: goto L6f;
            }
        L6f:
            r0 = r6
            goto L89
        L71:
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L89
            goto L6f
        L78:
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L7f
            goto L6f
        L7f:
            r0 = r2
            goto L89
        L81:
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L88
            goto L6f
        L88:
            r0 = r4
        L89:
            switch(r0) {
                case 0: goto L93;
                case 1: goto L90;
                case 2: goto L8d;
                default: goto L8c;
            }
        L8c:
            return r7
        L8d:
            java.lang.String r9 = "single_watched"
            return r9
        L90:
            java.lang.String r9 = "single_watching"
            return r9
        L93:
            java.lang.String r9 = "single_wish"
            return r9
        L96:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p003l.ldm.m7715a(com.p1.mobile.putong.core.data.LiteraturesComments, com.p1.mobile.putong.core.data.LiteraturesComments):java.lang.String");
    }

    /* JADX INFO: renamed from: b */
    public static String m7716b(Literatures literatures) {
        String str = literatures.category;
        str.getClass();
        switch (str) {
            case "teleplay":
                return "tv_show";
            case "book":
                return "book";
            case "movie":
                return "movie";
            default:
                return literatures.category;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Literatures m7717c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CoreModule.c.e0.h7(str);
    }

    /* JADX INFO: renamed from: d */
    public static List<LiteraturesComments> m7718d(String str, String str2) {
        return CoreModule.c.e0.O9(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static List<LiteraturesComments> m7719e(String str) {
        return m7718d(CoreModule.H().userId(), str);
    }
}
