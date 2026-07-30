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
import p153l.a1q;
import p153l.b1q;
import p153l.c1q;
import p153l.f3d0;
import p153l.y0q;

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
    public List<C1419b> items;
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
        int iM213898n = y0q.m213898n(byteBuffer);
        this.offsetSize = iM213898n >>> 4;
        this.lengthSize = iM213898n & 15;
        int iM213898n2 = y0q.m213898n(byteBuffer);
        this.baseOffsetSize = iM213898n2 >>> 4;
        if (getVersion() == 1) {
            this.indexSize = iM213898n2 & 15;
        }
        int iM213893i = y0q.m213893i(byteBuffer);
        for (int i = 0; i < iM213893i; i++) {
            this.items.add(new C1419b(byteBuffer));
        }
    }

    public C1418a createExtent(long j, long j2, long j3) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, (Object) this, (Object) this, new Object[]{Conversions.longObject(j), Conversions.longObject(j2), Conversions.longObject(j3)}));
        return new C1418a(j, j2, j3);
    }

    public C1419b createItem(int i, int i2, int i3, long j, List<C1418a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, (Object) this, (Object) this, new Object[]{Conversions.intObject(i), Conversions.intObject(i2), Conversions.intObject(i3), Conversions.longObject(j), list}));
        return new C1419b(i, i2, i3, j, list);
    }

    public int getBaseOffsetSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.baseOffsetSize;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101498j(byteBuffer, (this.offsetSize << 4) | this.lengthSize);
        int version = getVersion();
        int i = this.baseOffsetSize;
        if (version == 1) {
            b1q.m101498j(byteBuffer, (i << 4) | this.indexSize);
        } else {
            b1q.m101498j(byteBuffer, i << 4);
        }
        b1q.m101493e(byteBuffer, this.items.size());
        Iterator<C1419b> it = this.items.iterator();
        while (it.hasNext()) {
            it.next().m7389a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        Iterator<C1419b> it = this.items.iterator();
        long jM7390b = 8;
        while (it.hasNext()) {
            jM7390b += (long) it.next().m7390b();
        }
        return jM7390b;
    }

    public int getIndexSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.indexSize;
    }

    public List<C1419b> getItems() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.items;
    }

    public int getLengthSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.lengthSize;
    }

    public int getOffsetSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.offsetSize;
    }

    public void setBaseOffsetSize(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.baseOffsetSize = i;
    }

    public void setIndexSize(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.indexSize = i;
    }

    public void setItems(List<C1419b> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, list));
        this.items = list;
    }

    public void setLengthSize(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.lengthSize = i;
    }

    public void setOffsetSize(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.offsetSize = i;
    }

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.ItemLocationBox$a */
    public class C1418a {

        /* JADX INFO: renamed from: a */
        public long f5782a;

        /* JADX INFO: renamed from: b */
        public long f5783b;

        /* JADX INFO: renamed from: c */
        public long f5784c;

        public C1418a(ByteBuffer byteBuffer) {
            int i;
            if (ItemLocationBox.this.getVersion() == 1 && (i = ItemLocationBox.this.indexSize) > 0) {
                this.f5784c = a1q.m95539a(byteBuffer, i);
            }
            this.f5782a = a1q.m95539a(byteBuffer, ItemLocationBox.this.offsetSize);
            this.f5783b = a1q.m95539a(byteBuffer, ItemLocationBox.this.lengthSize);
        }

        /* JADX INFO: renamed from: a */
        public void m7387a(ByteBuffer byteBuffer) {
            int i;
            if (ItemLocationBox.this.getVersion() == 1 && (i = ItemLocationBox.this.indexSize) > 0) {
                c1q.m107634a(this.f5784c, byteBuffer, i);
            }
            c1q.m107634a(this.f5782a, byteBuffer, ItemLocationBox.this.offsetSize);
            c1q.m107634a(this.f5783b, byteBuffer, ItemLocationBox.this.lengthSize);
        }

        /* JADX INFO: renamed from: b */
        public int m7388b() {
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
            C1418a c1418a = (C1418a) obj;
            return this.f5784c == c1418a.f5784c && this.f5783b == c1418a.f5783b && this.f5782a == c1418a.f5782a;
        }

        public int hashCode() {
            long j = this.f5782a;
            long j2 = this.f5783b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f5784c;
            return i + ((int) ((j3 >>> 32) ^ j3));
        }

        public String toString() {
            return "Extent{extentOffset=" + this.f5782a + ", extentLength=" + this.f5783b + ", extentIndex=" + this.f5784c + '}';
        }

        public C1418a(long j, long j2, long j3) {
            this.f5782a = j;
            this.f5783b = j2;
            this.f5784c = j3;
        }
    }

    public C1418a createExtent(ByteBuffer byteBuffer) {
        return new C1418a(byteBuffer);
    }

    public C1419b createItem(ByteBuffer byteBuffer) {
        return new C1419b(byteBuffer);
    }

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.ItemLocationBox$b */
    public class C1419b {

        /* JADX INFO: renamed from: a */
        public int f5786a;

        /* JADX INFO: renamed from: b */
        public int f5787b;

        /* JADX INFO: renamed from: c */
        public int f5788c;

        /* JADX INFO: renamed from: d */
        public long f5789d;

        /* JADX INFO: renamed from: e */
        public List<C1418a> f5790e;

        public C1419b(ByteBuffer byteBuffer) {
            this.f5790e = new LinkedList();
            this.f5786a = y0q.m213893i(byteBuffer);
            if (ItemLocationBox.this.getVersion() == 1) {
                this.f5787b = y0q.m213893i(byteBuffer) & 15;
            }
            this.f5788c = y0q.m213893i(byteBuffer);
            int i = ItemLocationBox.this.baseOffsetSize;
            if (i > 0) {
                this.f5789d = a1q.m95539a(byteBuffer, i);
            } else {
                this.f5789d = 0L;
            }
            int iM213893i = y0q.m213893i(byteBuffer);
            for (int i2 = 0; i2 < iM213893i; i2++) {
                this.f5790e.add(ItemLocationBox.this.new C1418a(byteBuffer));
            }
        }

        /* JADX INFO: renamed from: a */
        public void m7389a(ByteBuffer byteBuffer) {
            b1q.m101493e(byteBuffer, this.f5786a);
            if (ItemLocationBox.this.getVersion() == 1) {
                b1q.m101493e(byteBuffer, this.f5787b);
            }
            b1q.m101493e(byteBuffer, this.f5788c);
            int i = ItemLocationBox.this.baseOffsetSize;
            if (i > 0) {
                c1q.m107634a(this.f5789d, byteBuffer, i);
            }
            b1q.m101493e(byteBuffer, this.f5790e.size());
            Iterator<C1418a> it = this.f5790e.iterator();
            while (it.hasNext()) {
                it.next().m7387a(byteBuffer);
            }
        }

        /* JADX INFO: renamed from: b */
        public int m7390b() {
            int iM7388b = (ItemLocationBox.this.getVersion() == 1 ? 4 : 2) + 2 + ItemLocationBox.this.baseOffsetSize + 2;
            Iterator<C1418a> it = this.f5790e.iterator();
            while (it.hasNext()) {
                iM7388b += it.next().m7388b();
            }
            return iM7388b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1419b c1419b = (C1419b) obj;
            if (this.f5789d != c1419b.f5789d || this.f5787b != c1419b.f5787b || this.f5788c != c1419b.f5788c || this.f5786a != c1419b.f5786a) {
                return false;
            }
            List<C1418a> list = this.f5790e;
            List<C1418a> list2 = c1419b.f5790e;
            return list == null ? list2 == null : list.equals(list2);
        }

        public int hashCode() {
            int i = ((((this.f5786a * 31) + this.f5787b) * 31) + this.f5788c) * 31;
            long j = this.f5789d;
            int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
            List<C1418a> list = this.f5790e;
            return i2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Item{baseOffset=" + this.f5789d + ", itemId=" + this.f5786a + ", constructionMethod=" + this.f5787b + ", dataReferenceIndex=" + this.f5788c + ", extents=" + this.f5790e + '}';
        }

        public C1419b(int i, int i2, int i3, long j, List<C1418a> list) {
            new LinkedList();
            this.f5786a = i;
            this.f5787b = i2;
            this.f5788c = i3;
            this.f5789d = j;
            this.f5790e = list;
        }
    }
}
