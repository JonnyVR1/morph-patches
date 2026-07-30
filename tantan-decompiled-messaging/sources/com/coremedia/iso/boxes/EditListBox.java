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
import p149l.bzp;
import p149l.cvc0;
import p149l.sm4;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class EditListBox extends AbstractFullBox {
    public static final String TYPE = "elst";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private List<C1394a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.EditListBox$a */
    public static class C1394a {

        /* JADX INFO: renamed from: a */
        EditListBox f5738a;

        /* JADX INFO: renamed from: b */
        private long f5739b;

        /* JADX INFO: renamed from: c */
        private long f5740c;

        /* JADX INFO: renamed from: d */
        private double f5741d;

        public C1394a(EditListBox editListBox, ByteBuffer byteBuffer) {
            if (editListBox.getVersion() == 1) {
                this.f5739b = yyp.m216560m(byteBuffer);
                this.f5740c = byteBuffer.getLong();
                this.f5741d = yyp.m216551d(byteBuffer);
            } else {
                this.f5739b = yyp.m216558k(byteBuffer);
                this.f5740c = byteBuffer.getInt();
                this.f5741d = yyp.m216551d(byteBuffer);
            }
            this.f5738a = editListBox;
        }

        /* JADX INFO: renamed from: a */
        public void m7332a(ByteBuffer byteBuffer) {
            int version = this.f5738a.getVersion();
            long j = this.f5739b;
            if (version == 1) {
                bzp.m104637i(byteBuffer, j);
                byteBuffer.putLong(this.f5740c);
            } else {
                bzp.m104635g(byteBuffer, sm4.m184929a(j));
                byteBuffer.putInt(sm4.m184929a(this.f5740c));
            }
            bzp.m104630b(byteBuffer, this.f5741d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1394a c1394a = (C1394a) obj;
            return this.f5740c == c1394a.f5740c && this.f5739b == c1394a.f5739b;
        }

        public int hashCode() {
            long j = this.f5739b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f5740c;
            return i + ((int) ((j2 >>> 32) ^ j2));
        }

        public String toString() {
            return "Entry{segmentDuration=" + this.f5739b + ", mediaTime=" + this.f5740c + ", mediaRate=" + this.f5741d + '}';
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
        int iM184929a = sm4.m184929a(yyp.m216558k(byteBuffer));
        this.entries = new LinkedList();
        for (int i = 0; i < iM184929a; i++) {
            this.entries.add(new C1394a(this, byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.entries.size());
        Iterator<C1394a> it = this.entries.iterator();
        while (it.hasNext()) {
            it.next().m7332a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int version = getVersion();
        List<C1394a> list = this.entries;
        return ((long) (version == 1 ? list.size() * 20 : list.size() * 12)) + 8;
    }

    public List<C1394a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1394a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return "EditListBox{entries=" + this.entries + '}';
    }
}
