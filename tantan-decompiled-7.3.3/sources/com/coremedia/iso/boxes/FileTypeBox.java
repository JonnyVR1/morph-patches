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
import p153l.b1q;
import p153l.f3d0;
import p153l.w0q;
import p153l.y0q;

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
        this.majorBrand = y0q.m213886b(byteBuffer);
        this.minorVersion = y0q.m213895k(byteBuffer);
        int iRemaining = byteBuffer.remaining() / 4;
        this.compatibleBrands = new LinkedList();
        for (int i = 0; i < iRemaining; i++) {
            this.compatibleBrands.add(y0q.m213886b(byteBuffer));
        }
    }

    public List<String> getCompatibleBrands() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.compatibleBrands;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(w0q.m204214d(this.majorBrand));
        b1q.m101495g(byteBuffer, this.minorVersion);
        Iterator<String> it = this.compatibleBrands.iterator();
        while (it.hasNext()) {
            byteBuffer.put(w0q.m204214d(it.next()));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.compatibleBrands.size() * 4) + 8;
    }

    public String getMajorBrand() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.majorBrand;
    }

    public long getMinorVersion() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.minorVersion;
    }

    public void setCompatibleBrands(List<String> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, list));
        this.compatibleBrands = list;
    }

    public void setMajorBrand(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.majorBrand = str;
    }

    public void setMinorVersion(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this, Conversions.longObject(j)));
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
