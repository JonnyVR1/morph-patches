package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.wyp;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class FileTypeBox extends AbstractBox {
    public static final String TYPE = "ftyp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private List<String> compatibleBrands;
    private String majorBrand;
    private long minorVersion;

    static {
        ajc$preClinit();
    }

    public FileTypeBox(String str, long j, List<String> list) {
        super(TYPE);
        List list2 = Collections.EMPTY_LIST;
        this.majorBrand = str;
        this.minorVersion = j;
        this.compatibleBrands = list;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("FileTypeBox.java", FileTypeBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.lang.String"), 85);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "", Constants.VOID), 94);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", Constants.LONG, "minorVersion", "", Constants.VOID), 103);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", Constants.LONG), 113);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.util.List"), 122);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "", Constants.VOID), 126);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.majorBrand = yyp.m216549b(byteBuffer);
        this.minorVersion = yyp.m216558k(byteBuffer);
        int iRemaining = byteBuffer.remaining() / 4;
        this.compatibleBrands = new LinkedList();
        for (int i = 0; i < iRemaining; i++) {
            this.compatibleBrands.add(yyp.m216549b(byteBuffer));
        }
    }

    public List<String> getCompatibleBrands() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.compatibleBrands;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(wyp.m206118d(this.majorBrand));
        bzp.m104635g(byteBuffer, this.minorVersion);
        Iterator<String> it = this.compatibleBrands.iterator();
        while (it.hasNext()) {
            byteBuffer.put(wyp.m206118d(it.next()));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.compatibleBrands.size() * 4) + 8;
    }

    public String getMajorBrand() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.majorBrand;
    }

    public long getMinorVersion() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.minorVersion;
    }

    public void setCompatibleBrands(List<String> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, list));
        this.compatibleBrands = list;
    }

    public void setMajorBrand(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.majorBrand = str;
    }

    public void setMinorVersion(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this, Conversions.longObject(j)));
        this.minorVersion = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FileTypeBox[majorBrand=");
        sb.append(getMajorBrand());
        sb.append(";minorVersion=");
        sb.append(getMinorVersion());
        for (String str : this.compatibleBrands) {
            sb.append(";compatibleBrand=");
            sb.append(str);
        }
        sb.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return sb.toString();
    }

    public FileTypeBox() {
        super(TYPE);
        this.compatibleBrands = Collections.EMPTY_LIST;
    }
}
