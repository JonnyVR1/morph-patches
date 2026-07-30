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
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class TimeToSampleBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "stts";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    static Map<List<C1424a>, SoftReference<long[]>> cache;
    List<C1424a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.TimeToSampleBox$a */
    public static class C1424a {

        /* JADX INFO: renamed from: a */
        long f5804a;

        /* JADX INFO: renamed from: b */
        long f5805b;

        public C1424a(long j, long j2) {
            this.f5804a = j;
            this.f5805b = j2;
        }

        /* JADX INFO: renamed from: a */
        public long m7413a() {
            return this.f5804a;
        }

        /* JADX INFO: renamed from: b */
        public long m7414b() {
            return this.f5805b;
        }

        public String toString() {
            return "Entry{count=" + this.f5804a + ", delta=" + this.f5805b + '}';
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

    public static synchronized long[] blowupTimeToSamples(List<C1424a> list) {
        long[] jArr;
        SoftReference<long[]> softReference = cache.get(list);
        if (softReference != null && (jArr = softReference.get()) != null) {
            return jArr;
        }
        Iterator<C1424a> it = list.iterator();
        long jM7413a = 0;
        while (it.hasNext()) {
            jM7413a += it.next().m7413a();
        }
        long[] jArr2 = new long[(int) jM7413a];
        int i = 0;
        for (C1424a c1424a : list) {
            int i2 = 0;
            while (i2 < c1424a.m7413a()) {
                jArr2[i] = c1424a.m7414b();
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
        int iM182119a = rn4.m182119a(y0q.m213895k(byteBuffer));
        this.entries = new ArrayList(iM182119a);
        for (int i = 0; i < iM182119a; i++) {
            this.entries.add(new C1424a(y0q.m213895k(byteBuffer), y0q.m213895k(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.entries.size());
        for (C1424a c1424a : this.entries) {
            b1q.m101495g(byteBuffer, c1424a.m7413a());
            b1q.m101495g(byteBuffer, c1424a.m7414b());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 8) + 8;
    }

    public List<C1424a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1424a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return "TimeToSampleBox[entryCount=" + this.entries.size() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
