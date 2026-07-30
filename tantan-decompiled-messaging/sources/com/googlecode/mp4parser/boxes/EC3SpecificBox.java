package com.googlecode.mp4parser.boxes;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.cvc0;
import p149l.r03;
import p149l.t03;

/* JADX INFO: loaded from: classes7.dex */
public class EC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dec3";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    int dataRate;
    List<C3440a> entries;
    int numIndSub;

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.EC3SpecificBox$a */
    public static class C3440a {

        /* JADX INFO: renamed from: a */
        public int f11695a;

        /* JADX INFO: renamed from: b */
        public int f11696b;

        /* JADX INFO: renamed from: c */
        public int f11697c;

        /* JADX INFO: renamed from: d */
        public int f11698d;

        /* JADX INFO: renamed from: e */
        public int f11699e;

        /* JADX INFO: renamed from: f */
        public int f11700f;

        /* JADX INFO: renamed from: g */
        public int f11701g;

        /* JADX INFO: renamed from: h */
        public int f11702h;

        /* JADX INFO: renamed from: i */
        public int f11703i;

        public String toString() {
            return "Entry{fscod=" + this.f11695a + ", bsid=" + this.f11696b + ", bsmod=" + this.f11697c + ", acmod=" + this.f11698d + ", lfeon=" + this.f11699e + ", reserved=" + this.f11700f + ", num_dep_sub=" + this.f11701g + ", chan_loc=" + this.f11702h + ", reserved2=" + this.f11703i + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public EC3SpecificBox() {
        super(TYPE);
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("EC3SpecificBox.java", EC3SpecificBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContentSize", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", Constants.LONG), 25);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContent", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", Constants.VOID), 65);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "java.util.List"), 86);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 90);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "addEntry", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry", "entry", "", Constants.VOID), 94);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", Constants.INT), 98);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", Constants.INT, "dataRate", "", Constants.VOID), 102);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", Constants.INT), 106);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", Constants.INT, "numIndSub", "", Constants.VOID), 110);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        r03 r03Var = new r03(byteBuffer);
        this.dataRate = r03Var.m177327a(13);
        this.numIndSub = r03Var.m177327a(3) + 1;
        for (int i = 0; i < this.numIndSub; i++) {
            C3440a c3440a = new C3440a();
            c3440a.f11695a = r03Var.m177327a(2);
            c3440a.f11696b = r03Var.m177327a(5);
            c3440a.f11697c = r03Var.m177327a(5);
            c3440a.f11698d = r03Var.m177327a(3);
            c3440a.f11699e = r03Var.m177327a(1);
            c3440a.f11700f = r03Var.m177327a(3);
            int iM177327a = r03Var.m177327a(4);
            c3440a.f11701g = iM177327a;
            if (iM177327a > 0) {
                c3440a.f11702h = r03Var.m177327a(9);
            } else {
                c3440a.f11703i = r03Var.m177327a(1);
            }
            this.entries.add(c3440a);
        }
    }

    public void addEntry(C3440a c3440a) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this, c3440a));
        this.entries.add(c3440a);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, byteBuffer));
        t03 t03Var = new t03(byteBuffer);
        t03Var.m186811a(this.dataRate, 13);
        t03Var.m186811a(this.entries.size() - 1, 3);
        for (C3440a c3440a : this.entries) {
            t03Var.m186811a(c3440a.f11695a, 2);
            t03Var.m186811a(c3440a.f11696b, 5);
            t03Var.m186811a(c3440a.f11697c, 5);
            t03Var.m186811a(c3440a.f11698d, 3);
            t03Var.m186811a(c3440a.f11699e, 1);
            t03Var.m186811a(c3440a.f11700f, 3);
            t03Var.m186811a(c3440a.f11701g, 4);
            if (c3440a.f11701g > 0) {
                t03Var.m186811a(c3440a.f11702h, 9);
            } else {
                t03Var.m186811a(c3440a.f11703i, 1);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        Iterator<C3440a> it = this.entries.iterator();
        long j = 2;
        while (it.hasNext()) {
            j += it.next().f11701g > 0 ? 4L : 3L;
        }
        return j;
    }

    public int getDataRate() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this));
        return this.dataRate;
    }

    public List<C3440a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.entries;
    }

    public int getNumIndSub() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this));
        return this.numIndSub;
    }

    public void setDataRate(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this, Conversions.intObject(i)));
        this.dataRate = i;
    }

    public void setEntries(List<C3440a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, list));
        this.entries = list;
    }

    public void setNumIndSub(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this, Conversions.intObject(i)));
        this.numIndSub = i;
    }
}
