package com.coremedia.iso.boxes;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.sm4;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class TimeToSampleBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "stts";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    static Map<List<C1401a>, SoftReference<long[]>> cache;
    List<C1401a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.TimeToSampleBox$a */
    public static class C1401a {

        /* JADX INFO: renamed from: a */
        long f5767a;

        /* JADX INFO: renamed from: b */
        long f5768b;

        public C1401a(long j, long j2) {
            this.f5767a = j;
            this.f5768b = j2;
        }

        /* JADX INFO: renamed from: a */
        public long m7359a() {
            return this.f5767a;
        }

        /* JADX INFO: renamed from: b */
        public long m7360b() {
            return this.f5768b;
        }

        public String toString() {
            return "Entry{count=" + this.f5767a + ", delta=" + this.f5768b + '}';
        }
    }

    static {
        ajc$preClinit();
        cache = new WeakHashMap();
    }

    public TimeToSampleBox() {
        super(TYPE);
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TimeToSampleBox.java", TimeToSampleBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 83);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }

    public static synchronized long[] blowupTimeToSamples(List<C1401a> list) {
        long[] jArr;
        SoftReference<long[]> softReference = cache.get(list);
        if (softReference != null && (jArr = softReference.get()) != null) {
            return jArr;
        }
        Iterator<C1401a> it = list.iterator();
        long jM7359a = 0;
        while (it.hasNext()) {
            jM7359a += it.next().m7359a();
        }
        long[] jArr2 = new long[(int) jM7359a];
        int i = 0;
        for (C1401a c1401a : list) {
            int i2 = 0;
            while (i2 < c1401a.m7359a()) {
                jArr2[i] = c1401a.m7360b();
                i2++;
                i++;
            }
        }
        cache.put(list, new SoftReference<>(jArr2));
        return jArr2;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int iM184929a = sm4.m184929a(yyp.m216558k(byteBuffer));
        this.entries = new ArrayList(iM184929a);
        for (int i = 0; i < iM184929a; i++) {
            this.entries.add(new C1401a(yyp.m216558k(byteBuffer), yyp.m216558k(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.entries.size());
        for (C1401a c1401a : this.entries) {
            bzp.m104635g(byteBuffer, c1401a.m7359a());
            bzp.m104635g(byteBuffer, c1401a.m7360b());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 8) + 8;
    }

    public List<C1401a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1401a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return "TimeToSampleBox[entryCount=" + this.entries.size() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
