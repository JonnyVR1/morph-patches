package com.coremedia.iso.boxes;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.azp;
import p149l.bzp;
import p149l.cvc0;
import p149l.czp;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class ItemLocationBox extends AbstractFullBox {
    public static final String TYPE = "iloc";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    public int baseOffsetSize;
    public int indexSize;
    public List<C1396b> items;
    public int lengthSize;
    public int offsetSize;

    static {
        ajc$preClinit();
    }

    public ItemLocationBox() {
        super(TYPE);
        this.offsetSize = 8;
        this.lengthSize = 8;
        this.baseOffsetSize = 8;
        this.indexSize = 0;
        this.items = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ItemLocationBox.java", ItemLocationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", Constants.INT), 119);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", Constants.INT, "offsetSize", "", Constants.VOID), 123);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", Constants.INT), 127);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", Constants.INT, "lengthSize", "", Constants.VOID), 131);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", Constants.INT), CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", Constants.INT, "baseOffsetSize", "", Constants.VOID), CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", Constants.INT), CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", Constants.INT, "indexSize", "", Constants.VOID), CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", FirebaseAnalytics.Param.ITEMS, "", Constants.VOID), CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int iM216561n = yyp.m216561n(byteBuffer);
        this.offsetSize = iM216561n >>> 4;
        this.lengthSize = iM216561n & 15;
        int iM216561n2 = yyp.m216561n(byteBuffer);
        this.baseOffsetSize = iM216561n2 >>> 4;
        if (getVersion() == 1) {
            this.indexSize = iM216561n2 & 15;
        }
        int iM216556i = yyp.m216556i(byteBuffer);
        for (int i = 0; i < iM216556i; i++) {
            this.items.add(new C1396b(byteBuffer));
        }
    }

    public C1395a createExtent(long j, long j2, long j3) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_11, (Object) this, (Object) this, new Object[]{Conversions.longObject(j), Conversions.longObject(j2), Conversions.longObject(j3)}));
        return new C1395a(j, j2, j3);
    }

    public C1396b createItem(int i, int i2, int i3, long j, List<C1395a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, (Object) this, (Object) this, new Object[]{Conversions.intObject(i), Conversions.intObject(i2), Conversions.intObject(i3), Conversions.longObject(j), list}));
        return new C1396b(i, i2, i3, j, list);
    }

    public int getBaseOffsetSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.baseOffsetSize;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104638j(byteBuffer, (this.offsetSize << 4) | this.lengthSize);
        int version = getVersion();
        int i = this.baseOffsetSize;
        if (version == 1) {
            bzp.m104638j(byteBuffer, (i << 4) | this.indexSize);
        } else {
            bzp.m104638j(byteBuffer, i << 4);
        }
        bzp.m104633e(byteBuffer, this.items.size());
        Iterator<C1396b> it = this.items.iterator();
        while (it.hasNext()) {
            it.next().m7335a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        Iterator<C1396b> it = this.items.iterator();
        long jM7336b = 8;
        while (it.hasNext()) {
            jM7336b += (long) it.next().m7336b();
        }
        return jM7336b;
    }

    public int getIndexSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.indexSize;
    }

    public List<C1396b> getItems() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.items;
    }

    public int getLengthSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.lengthSize;
    }

    public int getOffsetSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.offsetSize;
    }

    public void setBaseOffsetSize(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.baseOffsetSize = i;
    }

    public void setIndexSize(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.indexSize = i;
    }

    public void setItems(List<C1396b> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this, list));
        this.items = list;
    }

    public void setLengthSize(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.lengthSize = i;
    }

    public void setOffsetSize(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.offsetSize = i;
    }

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.ItemLocationBox$a */
    public class C1395a {

        /* JADX INFO: renamed from: a */
        public long f5745a;

        /* JADX INFO: renamed from: b */
        public long f5746b;

        /* JADX INFO: renamed from: c */
        public long f5747c;

        public C1395a(ByteBuffer byteBuffer) {
            int i;
            if (ItemLocationBox.this.getVersion() == 1 && (i = ItemLocationBox.this.indexSize) > 0) {
                this.f5747c = azp.m99722a(byteBuffer, i);
            }
            this.f5745a = azp.m99722a(byteBuffer, ItemLocationBox.this.offsetSize);
            this.f5746b = azp.m99722a(byteBuffer, ItemLocationBox.this.lengthSize);
        }

        /* JADX INFO: renamed from: a */
        public void m7333a(ByteBuffer byteBuffer) {
            int i;
            if (ItemLocationBox.this.getVersion() == 1 && (i = ItemLocationBox.this.indexSize) > 0) {
                czp.m109429a(this.f5747c, byteBuffer, i);
            }
            czp.m109429a(this.f5745a, byteBuffer, ItemLocationBox.this.offsetSize);
            czp.m109429a(this.f5746b, byteBuffer, ItemLocationBox.this.lengthSize);
        }

        /* JADX INFO: renamed from: b */
        public int m7334b() {
            ItemLocationBox itemLocationBox = ItemLocationBox.this;
            int i = itemLocationBox.indexSize;
            if (i <= 0) {
                i = 0;
            }
            return i + itemLocationBox.offsetSize + itemLocationBox.lengthSize;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1395a c1395a = (C1395a) obj;
            return this.f5747c == c1395a.f5747c && this.f5746b == c1395a.f5746b && this.f5745a == c1395a.f5745a;
        }

        public int hashCode() {
            long j = this.f5745a;
            long j2 = this.f5746b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f5747c;
            return i + ((int) ((j3 >>> 32) ^ j3));
        }

        public String toString() {
            return "Extent{extentOffset=" + this.f5745a + ", extentLength=" + this.f5746b + ", extentIndex=" + this.f5747c + '}';
        }

        public C1395a(long j, long j2, long j3) {
            this.f5745a = j;
            this.f5746b = j2;
            this.f5747c = j3;
        }
    }

    public C1395a createExtent(ByteBuffer byteBuffer) {
        return new C1395a(byteBuffer);
    }

    public C1396b createItem(ByteBuffer byteBuffer) {
        return new C1396b(byteBuffer);
    }

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.ItemLocationBox$b */
    public class C1396b {

        /* JADX INFO: renamed from: a */
        public int f5749a;

        /* JADX INFO: renamed from: b */
        public int f5750b;

        /* JADX INFO: renamed from: c */
        public int f5751c;

        /* JADX INFO: renamed from: d */
        public long f5752d;

        /* JADX INFO: renamed from: e */
        public List<C1395a> f5753e;

        public C1396b(ByteBuffer byteBuffer) {
            this.f5753e = new LinkedList();
            this.f5749a = yyp.m216556i(byteBuffer);
            if (ItemLocationBox.this.getVersion() == 1) {
                this.f5750b = yyp.m216556i(byteBuffer) & 15;
            }
            this.f5751c = yyp.m216556i(byteBuffer);
            int i = ItemLocationBox.this.baseOffsetSize;
            if (i > 0) {
                this.f5752d = azp.m99722a(byteBuffer, i);
            } else {
                this.f5752d = 0L;
            }
            int iM216556i = yyp.m216556i(byteBuffer);
            for (int i2 = 0; i2 < iM216556i; i2++) {
                this.f5753e.add(ItemLocationBox.this.new C1395a(byteBuffer));
            }
        }

        /* JADX INFO: renamed from: a */
        public void m7335a(ByteBuffer byteBuffer) {
            bzp.m104633e(byteBuffer, this.f5749a);
            if (ItemLocationBox.this.getVersion() == 1) {
                bzp.m104633e(byteBuffer, this.f5750b);
            }
            bzp.m104633e(byteBuffer, this.f5751c);
            int i = ItemLocationBox.this.baseOffsetSize;
            if (i > 0) {
                czp.m109429a(this.f5752d, byteBuffer, i);
            }
            bzp.m104633e(byteBuffer, this.f5753e.size());
            Iterator<C1395a> it = this.f5753e.iterator();
            while (it.hasNext()) {
                it.next().m7333a(byteBuffer);
            }
        }

        /* JADX INFO: renamed from: b */
        public int m7336b() {
            int iM7334b = (ItemLocationBox.this.getVersion() == 1 ? 4 : 2) + 2 + ItemLocationBox.this.baseOffsetSize + 2;
            Iterator<C1395a> it = this.f5753e.iterator();
            while (it.hasNext()) {
                iM7334b += it.next().m7334b();
            }
            return iM7334b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1396b c1396b = (C1396b) obj;
            if (this.f5752d != c1396b.f5752d || this.f5750b != c1396b.f5750b || this.f5751c != c1396b.f5751c || this.f5749a != c1396b.f5749a) {
                return false;
            }
            List<C1395a> list = this.f5753e;
            List<C1395a> list2 = c1396b.f5753e;
            return list == null ? list2 == null : list.equals(list2);
        }

        public int hashCode() {
            int i = ((((this.f5749a * 31) + this.f5750b) * 31) + this.f5751c) * 31;
            long j = this.f5752d;
            int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
            List<C1395a> list = this.f5753e;
            return i2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Item{baseOffset=" + this.f5752d + ", itemId=" + this.f5749a + ", constructionMethod=" + this.f5750b + ", dataReferenceIndex=" + this.f5751c + ", extents=" + this.f5753e + '}';
        }

        public C1396b(int i, int i2, int i3, long j, List<C1395a> list) {
            new LinkedList();
            this.f5749a = i;
            this.f5750b = i2;
            this.f5751c = i3;
            this.f5752d = j;
            this.f5753e = list;
        }
    }
}
