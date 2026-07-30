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
import p149l.apj0;
import p149l.bdc0;
import p149l.bzp;
import p149l.cvc0;
import p149l.dhi0;
import p149l.ehi0;
import p149l.fgh0;
import p149l.fhi0;
import p149l.k5d0;
import p149l.kwf0;
import p149l.qn4;
import p149l.ram0;
import p149l.sm4;
import p149l.udk;
import p149l.upk0;
import p149l.wyp;
import p149l.yyp;

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
    private List<udk> groupEntries;

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

    private udk parseGroupEntry(ByteBuffer byteBuffer, String str) {
        udk kwf0Var;
        if ("roll".equals(str)) {
            kwf0Var = new k5d0();
        } else if ("rash".equals(str)) {
            kwf0Var = new bdc0();
        } else if ("seig".equals(str)) {
            kwf0Var = new qn4();
        } else if ("rap ".equals(str)) {
            kwf0Var = new ram0();
        } else if ("tele".equals(str)) {
            kwf0Var = new ehi0();
        } else if ("sync".equals(str)) {
            kwf0Var = new fgh0();
        } else if ("tscl".equals(str)) {
            kwf0Var = new dhi0();
        } else if ("tsas".equals(str)) {
            kwf0Var = new fhi0();
        } else {
            kwf0Var = "stsa".equals(str) ? new kwf0() : new apj0(str);
        }
        kwf0Var.mo98140c(byteBuffer);
        return kwf0Var;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() != 1) {
            upk0.m194883a("SampleGroupDescriptionBox are only supported in version 1");
            return;
        }
        String strM216549b = yyp.m216549b(byteBuffer);
        if (getVersion() == 1) {
            this.defaultLength = sm4.m184929a(yyp.m216558k(byteBuffer));
        }
        long jM216558k = yyp.m216558k(byteBuffer);
        while (true) {
            long j = jM216558k - 1;
            if (jM216558k <= 0) {
                return;
            }
            int iM184929a = this.defaultLength;
            if (getVersion() != 1) {
                upk0.m194883a("This should be implemented");
                return;
            }
            if (this.defaultLength == 0) {
                iM184929a = sm4.m184929a(yyp.m216558k(byteBuffer));
            }
            int iPosition = byteBuffer.position() + iM184929a;
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.limit(iM184929a);
            this.groupEntries.add(parseGroupEntry(byteBufferSlice, strM216549b));
            byteBuffer.position(iPosition);
            jM216558k = j;
        }
    }

    public boolean equals(Object obj) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this, obj));
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
        List<udk> list = this.groupEntries;
        List<udk> list2 = sampleGroupDescriptionBox.groupEntries;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(wyp.m206118d(this.groupEntries.get(0).mo98139b()));
        if (getVersion() == 1) {
            bzp.m104635g(byteBuffer, this.defaultLength);
        }
        bzp.m104635g(byteBuffer, this.groupEntries.size());
        for (udk udkVar : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                bzp.m104635g(byteBuffer, udkVar.mo98138a().limit());
            }
            byteBuffer.put(udkVar.mo98138a());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long jMo111825d = (getVersion() == 1 ? 12L : 8L) + 4;
        for (udk udkVar : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                jMo111825d += 4;
            }
            jMo111825d += (long) udkVar.mo111825d();
        }
        return jMo111825d;
    }

    public int getDefaultLength() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.defaultLength;
    }

    public List<udk> getGroupEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.groupEntries;
    }

    public int hashCode() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this));
        int i = this.defaultLength * 31;
        List<udk> list = this.groupEntries;
        return i + (list != null ? list.hashCode() : 0);
    }

    public void setDefaultLength(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.defaultLength = i;
    }

    public void setGroupEntries(List<udk> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, list));
        this.groupEntries = list;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        StringBuilder sb = new StringBuilder("SampleGroupDescriptionBox{groupingType='");
        sb.append(this.groupEntries.size() > 0 ? this.groupEntries.get(0).mo98139b() : "????");
        sb.append("', defaultLength=");
        sb.append(this.defaultLength);
        sb.append(", groupEntries=");
        sb.append(this.groupEntries);
        sb.append('}');
        return sb.toString();
    }
}
