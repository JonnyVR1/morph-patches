package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.azk0;
import p153l.b1q;
import p153l.dqi0;
import p153l.dyj0;
import p153l.eqi0;
import p153l.f3d0;
import p153l.fqi0;
import p153l.ilc0;
import p153l.kgk;
import p153l.moh0;
import p153l.ndd0;
import p153l.po4;
import p153l.rn4;
import p153l.u4g0;
import p153l.vjm0;
import p153l.w0q;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public class SampleGroupDescriptionBox extends AbstractFullBox {
    public static final String TYPE = "sgpd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private int defaultLength;
    private List<kgk> groupEntries;

    static {
        ajc$preClinit();
    }

    public SampleGroupDescriptionBox() {
        super(TYPE);
        this.groupEntries = new LinkedList();
        setVersion(1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleGroupDescriptionBox.java", SampleGroupDescriptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", Constants.INT), CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", Constants.INT, "defaultLength", "", Constants.VOID), 149);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 153);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", Constants.VOID), 157);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", Constants.BOOLEAN), 162);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", Constants.INT), 183);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256);
    }

    private kgk parseGroupEntry(ByteBuffer byteBuffer, String str) {
        kgk u4g0Var;
        if ("roll".equals(str)) {
            u4g0Var = new ndd0();
        } else if ("rash".equals(str)) {
            u4g0Var = new ilc0();
        } else if ("seig".equals(str)) {
            u4g0Var = new po4();
        } else if ("rap ".equals(str)) {
            u4g0Var = new vjm0();
        } else if ("tele".equals(str)) {
            u4g0Var = new eqi0();
        } else if ("sync".equals(str)) {
            u4g0Var = new moh0();
        } else if ("tscl".equals(str)) {
            u4g0Var = new dqi0();
        } else if ("tsas".equals(str)) {
            u4g0Var = new fqi0();
        } else {
            u4g0Var = "stsa".equals(str) ? new u4g0() : new dyj0(str);
        }
        u4g0Var.mo117530c(byteBuffer);
        return u4g0Var;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() != 1) {
            azk0.m101074a("SampleGroupDescriptionBox are only supported in version 1");
            return;
        }
        String strM213886b = y0q.m213886b(byteBuffer);
        if (getVersion() == 1) {
            this.defaultLength = rn4.m182119a(y0q.m213895k(byteBuffer));
        }
        long jM213895k = y0q.m213895k(byteBuffer);
        while (true) {
            long j = jM213895k - 1;
            if (jM213895k <= 0) {
                return;
            }
            int iM182119a = this.defaultLength;
            if (getVersion() != 1) {
                azk0.m101074a("This should be implemented");
                return;
            }
            if (this.defaultLength == 0) {
                iM182119a = rn4.m182119a(y0q.m213895k(byteBuffer));
            }
            int iPosition = byteBuffer.position() + iM182119a;
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.limit(iM182119a);
            this.groupEntries.add(parseGroupEntry(byteBufferSlice, strM213886b));
            byteBuffer.position(iPosition);
            jM213895k = j;
        }
    }

    public boolean equals(Object obj) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleGroupDescriptionBox sampleGroupDescriptionBox = (SampleGroupDescriptionBox) obj;
        if (this.defaultLength != sampleGroupDescriptionBox.defaultLength) {
            return false;
        }
        List<kgk> list = this.groupEntries;
        List<kgk> list2 = sampleGroupDescriptionBox.groupEntries;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(w0q.m204214d(this.groupEntries.get(0).mo117529b()));
        if (getVersion() == 1) {
            b1q.m101495g(byteBuffer, this.defaultLength);
        }
        b1q.m101495g(byteBuffer, this.groupEntries.size());
        for (kgk kgkVar : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                b1q.m101495g(byteBuffer, kgkVar.mo117528a().limit());
            }
            byteBuffer.put(kgkVar.mo117528a());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long jMo117531d = (getVersion() == 1 ? 12L : 8L) + 4;
        for (kgk kgkVar : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                jMo117531d += 4;
            }
            jMo117531d += (long) kgkVar.mo117531d();
        }
        return jMo117531d;
    }

    public int getDefaultLength() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.defaultLength;
    }

    public List<kgk> getGroupEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.groupEntries;
    }

    public int hashCode() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        int i = this.defaultLength * 31;
        List<kgk> list = this.groupEntries;
        return i + (list != null ? list.hashCode() : 0);
    }

    public void setDefaultLength(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.defaultLength = i;
    }

    public void setGroupEntries(List<kgk> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, list));
        this.groupEntries = list;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        StringBuilder sb = new StringBuilder("SampleGroupDescriptionBox{groupingType='");
        sb.append(this.groupEntries.size() > 0 ? this.groupEntries.get(0).mo117529b() : "????");
        sb.append("', defaultLength=");
        sb.append(this.defaultLength);
        sb.append(", groupEntries=");
        sb.append(this.groupEntries);
        sb.append('}');
        return sb.toString();
    }
}
