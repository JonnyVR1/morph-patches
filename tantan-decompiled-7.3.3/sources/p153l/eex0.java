package p153l;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@WorkerThread
public final class eex0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final URL f93680a;

    /* JADX INFO: renamed from: b */
    public final byte[] f93681b;

    /* JADX INFO: renamed from: c */
    public final ncx0 f93682c;

    /* JADX INFO: renamed from: d */
    public final String f93683d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f93684e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ p9x0 f93685f;

    public eex0(p9x0 p9x0Var, String str, URL url, byte[] bArr, Map<String, String> map, ncx0 ncx0Var) {
        this.f93685f = p9x0Var;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(ncx0Var);
        this.f93680a = url;
        this.f93681b = bArr;
        this.f93682c = ncx0Var;
        this.f93683d = str;
        this.f93684e = map;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x014f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: l.qbx0.<init>(java.lang.String, l.ncx0, int, java.lang.Throwable, byte[], java.util.Map, l.jdx0):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.eex0.run():void");
    }
}
