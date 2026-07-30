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
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class CompositionTimeToSample extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "ctts";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    List<C1416a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.CompositionTimeToSample$a */
    public static class C1416a {

        /* JADX INFO: renamed from: a */
        int f5773a;

        /* JADX INFO: renamed from: b */
        int f5774b;

        public C1416a(int i, int i2) {
            this.f5773a = i;
            this.f5774b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m7384a() {
            return this.f5773a;
        }

        /* JADX INFO: renamed from: b */
        public int m7385b() {
            return this.f5774b;
        }

        public String toString() {
            return "Entry{count=" + this.f5773a + ", offset=" + this.f5774b + '}';
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

    public static int[] blowupCompositionTimes(List<C1416a> list) {
        Iterator<C1416a> it = list.iterator();
        long jM7384a = 0;
        while (it.hasNext()) {
            jM7384a += (long) it.next().m7384a();
        }
        int[] iArr = new int[(int) jM7384a];
        int i = 0;
        for (C1416a c1416a : list) {
            int i2 = 0;
            while (i2 < c1416a.m7384a()) {
                iArr[i] = c1416a.m7385b();
                i2++;
                i++;
            }
        }
        return iArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int iM182119a = rn4.m182119a(y0q.m213895k(byteBuffer));
        this.entries = new ArrayList(iM182119a);
        for (int i = 0; i < iM182119a; i++) {
            this.entries.add(new C1416a(rn4.m182119a(y0q.m213895k(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.entries.size());
        for (C1416a c1416a : this.entries) {
            b1q.m101495g(byteBuffer, c1416a.m7384a());
            byteBuffer.putInt(c1416a.m7385b());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 8) + 8;
    }

    public List<C1416a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1416a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }
}
