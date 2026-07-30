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
import p153l.f3d0;
import p153l.g13;
import p153l.i13;

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
    List<C3463a> entries;
    int numIndSub;

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.EC3SpecificBox$a */
    public static class C3463a {

        /* JADX INFO: renamed from: a */
        public int f11732a;

        /* JADX INFO: renamed from: b */
        public int f11733b;

        /* JADX INFO: renamed from: c */
        public int f11734c;

        /* JADX INFO: renamed from: d */
        public int f11735d;

        /* JADX INFO: renamed from: e */
        public int f11736e;

        /* JADX INFO: renamed from: f */
        public int f11737f;

        /* JADX INFO: renamed from: g */
        public int f11738g;

        /* JADX INFO: renamed from: h */
        public int f11739h;

        /* JADX INFO: renamed from: i */
        public int f11740i;

        public String toString() {
            return "Entry{fscod=" + this.f11732a + ", bsid=" + this.f11733b + ", bsmod=" + this.f11734c + ", acmod=" + this.f11735d + ", lfeon=" + this.f11736e + ", reserved=" + this.f11737f + ", num_dep_sub=" + this.f11738g + ", chan_loc=" + this.f11739h + ", reserved2=" + this.f11740i + '}';
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
        g13 g13Var = new g13(byteBuffer);
        this.dataRate = g13Var.m128488a(13);
        this.numIndSub = g13Var.m128488a(3) + 1;
        for (int i = 0; i < this.numIndSub; i++) {
            C3463a c3463a = new C3463a();
            c3463a.f11732a = g13Var.m128488a(2);
            c3463a.f11733b = g13Var.m128488a(5);
            c3463a.f11734c = g13Var.m128488a(5);
            c3463a.f11735d = g13Var.m128488a(3);
            c3463a.f11736e = g13Var.m128488a(1);
            c3463a.f11737f = g13Var.m128488a(3);
            int iM128488a = g13Var.m128488a(4);
            c3463a.f11738g = iM128488a;
            if (iM128488a > 0) {
                c3463a.f11739h = g13Var.m128488a(9);
            } else {
                c3463a.f11740i = g13Var.m128488a(1);
            }
            this.entries.add(c3463a);
        }
    }

    public void addEntry(C3463a c3463a) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this, c3463a));
        this.entries.add(c3463a);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, byteBuffer));
        i13 i13Var = new i13(byteBuffer);
        i13Var.m138073a(this.dataRate, 13);
        i13Var.m138073a(this.entries.size() - 1, 3);
        for (C3463a c3463a : this.entries) {
            i13Var.m138073a(c3463a.f11732a, 2);
            i13Var.m138073a(c3463a.f11733b, 5);
            i13Var.m138073a(c3463a.f11734c, 5);
            i13Var.m138073a(c3463a.f11735d, 3);
            i13Var.m138073a(c3463a.f11736e, 1);
            i13Var.m138073a(c3463a.f11737f, 3);
            i13Var.m138073a(c3463a.f11738g, 4);
            if (c3463a.f11738g > 0) {
                i13Var.m138073a(c3463a.f11739h, 9);
            } else {
                i13Var.m138073a(c3463a.f11740i, 1);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        Iterator<C3463a> it = this.entries.iterator();
        long j = 2;
        while (it.hasNext()) {
            j += it.next().f11738g > 0 ? 4L : 3L;
        }
        return j;
    }

    public int getDataRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        return this.dataRate;
    }

    public List<C3463a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.entries;
    }

    public int getNumIndSub() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this));
        return this.numIndSub;
    }

    public void setDataRate(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this, Conversions.intObject(i)));
        this.dataRate = i;
    }

    public void setEntries(List<C3463a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, list));
        this.entries = list;
    }

    public void setNumIndSub(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this, Conversions.intObject(i)));
        this.numIndSub = i;
    }
}
