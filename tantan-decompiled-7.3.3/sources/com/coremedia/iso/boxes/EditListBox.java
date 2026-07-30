package com.coremedia.iso.boxes;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class EditListBox extends AbstractFullBox {
    public static final String TYPE = "elst";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private List<C1417a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.EditListBox$a */
    public static class C1417a {

        /* JADX INFO: renamed from: a */
        EditListBox f5775a;

        /* JADX INFO: renamed from: b */
        private long f5776b;

        /* JADX INFO: renamed from: c */
        private long f5777c;

        /* JADX INFO: renamed from: d */
        private double f5778d;

        public C1417a(EditListBox editListBox, ByteBuffer byteBuffer) {
            if (editListBox.getVersion() == 1) {
                this.f5776b = y0q.m213897m(byteBuffer);
                this.f5777c = byteBuffer.getLong();
                this.f5778d = y0q.m213888d(byteBuffer);
            } else {
                this.f5776b = y0q.m213895k(byteBuffer);
                this.f5777c = byteBuffer.getInt();
                this.f5778d = y0q.m213888d(byteBuffer);
            }
            this.f5775a = editListBox;
        }

        /* JADX INFO: renamed from: a */
        public void m7386a(ByteBuffer byteBuffer) {
            int version = this.f5775a.getVersion();
            long j = this.f5776b;
            if (version == 1) {
                b1q.m101497i(byteBuffer, j);
                byteBuffer.putLong(this.f5777c);
            } else {
                b1q.m101495g(byteBuffer, rn4.m182119a(j));
                byteBuffer.putInt(rn4.m182119a(this.f5777c));
            }
            b1q.m101490b(byteBuffer, this.f5778d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1417a c1417a = (C1417a) obj;
            return this.f5777c == c1417a.f5777c && this.f5776b == c1417a.f5776b;
        }

        public int hashCode() {
            long j = this.f5776b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f5777c;
            return i + ((int) ((j2 >>> 32) ^ j2));
        }

        public String toString() {
            return "Entry{segmentDuration=" + this.f5776b + ", mediaTime=" + this.f5777c + ", mediaRate=" + this.f5778d + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public EditListBox() {
        super(TYPE);
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("EditListBox.java", EditListBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 72);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"), 108);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int iM182119a = rn4.m182119a(y0q.m213895k(byteBuffer));
        this.entries = new LinkedList();
        for (int i = 0; i < iM182119a; i++) {
            this.entries.add(new C1417a(this, byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.entries.size());
        Iterator<C1417a> it = this.entries.iterator();
        while (it.hasNext()) {
            it.next().m7386a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int version = getVersion();
        List<C1417a> list = this.entries;
        return ((long) (version == 1 ? list.size() * 20 : list.size() * 12)) + 8;
    }

    public List<C1417a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1417a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return "EditListBox{entries=" + this.entries + '}';
    }
}
