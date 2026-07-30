package com.coremedia.iso.boxes;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.sm4;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class CompositionTimeToSample extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "ctts";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    List<C1393a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.CompositionTimeToSample$a */
    public static class C1393a {

        /* JADX INFO: renamed from: a */
        int f5736a;

        /* JADX INFO: renamed from: b */
        int f5737b;

        public C1393a(int i, int i2) {
            this.f5736a = i;
            this.f5737b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m7330a() {
            return this.f5736a;
        }

        /* JADX INFO: renamed from: b */
        public int m7331b() {
            return this.f5737b;
        }

        public String toString() {
            return "Entry{count=" + this.f5736a + ", offset=" + this.f5737b + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public CompositionTimeToSample() {
        super(TYPE);
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("CompositionTimeToSample.java", CompositionTimeToSample.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 61);
    }

    public static int[] blowupCompositionTimes(List<C1393a> list) {
        Iterator<C1393a> it = list.iterator();
        long jM7330a = 0;
        while (it.hasNext()) {
            jM7330a += (long) it.next().m7330a();
        }
        int[] iArr = new int[(int) jM7330a];
        int i = 0;
        for (C1393a c1393a : list) {
            int i2 = 0;
            while (i2 < c1393a.m7330a()) {
                iArr[i] = c1393a.m7331b();
                i2++;
                i++;
            }
        }
        return iArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int iM184929a = sm4.m184929a(yyp.m216558k(byteBuffer));
        this.entries = new ArrayList(iM184929a);
        for (int i = 0; i < iM184929a; i++) {
            this.entries.add(new C1393a(sm4.m184929a(yyp.m216558k(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.entries.size());
        for (C1393a c1393a : this.entries) {
            bzp.m104635g(byteBuffer, c1393a.m7330a());
            byteBuffer.putInt(c1393a.m7331b());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 8) + 8;
    }

    public List<C1393a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1393a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }
}
