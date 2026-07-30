package p153l;

import android.text.TextUtils;
import java.io.File;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class hsg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final pug0 f111440a;

    /* JADX INFO: renamed from: b */
    public File f111441b;

    /* JADX INFO: renamed from: c */
    public File f111442c;

    public hsg0(pug0 pug0Var) {
        this.f111440a = pug0Var;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x023d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0259  */
    /* JADX WARN: Code duplicated, block: B:127:0x025c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0270 A[LOOP:4: B:133:0x026e->B:134:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0282  */
    /* JADX WARN: Code duplicated, block: B:202:0x01bb A[EDGE_INSN: B:202:0x01bb->B:94:0x01bb BREAK  A[LOOP:3: B:90:0x01b1->B:228:?], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b A[Catch: all -> 0x0147, Exception -> 0x014a, TryCatch #4 {Exception -> 0x014a, blocks: (B:66:0x0135, B:68:0x013b, B:70:0x0143, B:75:0x014c), top: B:195:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0143 A[Catch: all -> 0x0147, Exception -> 0x014a, TryCatch #4 {Exception -> 0x014a, blocks: (B:66:0x0135, B:68:0x013b, B:70:0x0143, B:75:0x014c), top: B:195:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b7 A[Catch: all -> 0x01dd, IOException -> 0x01df, TRY_LEAVE, TryCatch #17 {IOException -> 0x01df, blocks: (B:89:0x01a1, B:90:0x01b1, B:92:0x01b7), top: B:208:0x01a1 }] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:140:0x0295
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: a */
    public final void m136972a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.hsg0.m136972a():void");
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        try {
            pug0 pug0Var = this.f111440a;
            if (TextUtils.isEmpty(pug0Var.f154185a) || TextUtils.isEmpty(pug0Var.f154187c)) {
                return;
            }
            m136972a();
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.file("ReportCLogTask", "ReportConsoleLogTask error:" + LogUtils.getErrorInfo(e));
        }
    }
}
