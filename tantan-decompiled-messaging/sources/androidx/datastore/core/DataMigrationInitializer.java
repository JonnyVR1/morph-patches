package androidx.datastore.core;

import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import p149l.ism;
import p149l.j6f;
import p149l.qkq0;
import p149l.r4c;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, m87232d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", j6f.GPS_DIRECTION_TRUE, "", "()V", "Companion", "datastore-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class DataMigrationInitializer<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u000f\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m87232d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", "<init>", "()V", j6f.GPS_DIRECTION_TRUE, "", "Ll/r4c;", "migrations", "Lkotlin/Function2;", "Ll/ism;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "api", "Lkotlin/coroutines/Continuation;", "", "b", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "c", "(Ljava/util/List;Ll/ism;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final <T> Function2<ism<T>, Continuation<? super Unit>, Object> m1392b(@NotNull List<? extends r4c<T>> migrations) {
            migrations.getClass();
            return new DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0070  */
        /* JADX WARN: Code duplicated, block: B:37:0x009b  */
        /* JADX WARN: Code duplicated, block: B:39:0x009e  */
        /* JADX WARN: Code duplicated, block: B:43:0x0082 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x006a->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0087 -> B:25:0x006a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008a -> B:25:0x006a). Please report as a decompilation issue!!! */
        /* JADX INFO: renamed from: c */
        public final <T> Object m1393c(List<? extends r4c<T>> list, ism<T> ismVar, Continuation<? super Unit> continuation) throws Throwable {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            List list2;
            Iterator<T> it;
            Ref.ObjectRef objectRef;
            Throwable th;
            Function1 function1;
            if (continuation instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) continuation;
                int i = dataMigrationInitializer$Companion$runMigrations$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.label = i - Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, continuation);
                }
            } else {
                dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, continuation);
            }
            Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
            Object objM196133e = uwp.m196133e();
            int i2 = dataMigrationInitializer$Companion$runMigrations$1.label;
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                ArrayList arrayList = new ArrayList();
                Function2<? super T, ? super Continuation<? super T>, ? extends Object> dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2<>(list, arrayList, null);
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = arrayList;
                dataMigrationInitializer$Companion$runMigrations$1.label = 1;
                if (ismVar.mo1432a(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) != objM196133e) {
                    list2 = arrayList;
                }
                return objM196133e;
            }
            if (i2 == 1) {
                list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                ResultKt.m87239b(obj);
            } else {
                if (i2 != 2) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) dataMigrationInitializer$Companion$runMigrations$1.L$1;
                objectRef = (Ref.ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                try {
                    ResultKt.m87239b(obj);
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:297)
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
                    this = this;
                    boolean r0 = r8 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                    r0.<init>(r5, r8)
                L18:
                    java.lang.Object r5 = r0.result
                    java.lang.Object r8 = p149l.uwp.m196133e()
                    int r1 = r0.label
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L45
                    if (r1 == r4) goto L3d
                    if (r1 != r3) goto L37
                    java.lang.Object r6 = r0.L$1
                    java.util.Iterator r6 = (java.util.Iterator) r6
                    java.lang.Object r7 = r0.L$0
                    kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                    kotlin.ResultKt.m87239b(r5)     // Catch: java.lang.Throwable -> L35
                    goto L6a
                L35:
                    r5 = move-exception
                    goto L83
                L37:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    p149l.qkq0.m175383a(r5)
                    return r2
                L3d:
                    java.lang.Object r6 = r0.L$0
                    java.util.List r6 = (java.util.List) r6
                    kotlin.ResultKt.m87239b(r5)
                    goto L5e
                L45:
                    kotlin.ResultKt.m87239b(r5)
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r1 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                    r1.<init>(r6, r5, r2)
                    r0.L$0 = r5
                    r0.label = r4
                    java.lang.Object r6 = r7.mo1432a(r1, r0)
                    if (r6 != r8) goto L5d
                    goto L82
                L5d:
                    r6 = r5
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
                    r5.<init>()
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.Iterator r6 = r6.iterator()
                    r7 = r5
                L6a:
                    boolean r5 = r6.hasNext()
                    if (r5 == 0) goto L95
                    java.lang.Object r5 = r6.next()
                    kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
                    r0.L$0 = r7     // Catch: java.lang.Throwable -> L35
                    r0.L$1 = r6     // Catch: java.lang.Throwable -> L35
                    r0.label = r3     // Catch: java.lang.Throwable -> L35
                    java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L35
                    if (r5 != r8) goto L6a
                L82:
                    return r8
                L83:
                    T r1 = r7.element
                    if (r1 != 0) goto L8a
                    r7.element = r5
                    goto L6a
                L8a:
                    r1.getClass()
                    T r1 = r7.element
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    p149l.h5f.m129395a(r1, r5)
                    goto L6a
                L95:
                    T r5 = r7.element
                    java.lang.Throwable r5 = (java.lang.Throwable) r5
                    if (r5 != 0) goto L9e
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                L9e:
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.m1393c(java.util.List, l.ism, kotlin.coroutines.Continuation):java.lang.Object");
            }

            public Companion() {
            }
        }
    }
