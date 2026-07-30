package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.mck0;
import p149l.wyp;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class ClassificationBox extends AbstractFullBox {
    public static final String TYPE = "clsf";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private String classificationEntity;
    private String classificationInfo;
    private int classificationTableIndex;
    private String language;

    static {
        ajc$preClinit();
    }

    public ClassificationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ClassificationBox.java", ClassificationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 48);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", Constants.INT), 52);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 56);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationEntity", "", Constants.VOID), 60);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", Constants.INT, "classificationTableIndex", "", Constants.VOID), 64);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", Constants.VOID), 68);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationInfo", "", Constants.VOID), 72);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 101);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.classificationEntity = wyp.m206117b(bArr);
        this.classificationTableIndex = yyp.m216556i(byteBuffer);
        this.language = yyp.m216553f(byteBuffer);
        this.classificationInfo = yyp.m216554g(byteBuffer);
    }

    public String getClassificationEntity() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.classificationEntity;
    }

    public String getClassificationInfo() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.classificationInfo;
    }

    public int getClassificationTableIndex() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.classificationTableIndex;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(wyp.m206118d(this.classificationEntity));
        bzp.m104633e(byteBuffer, this.classificationTableIndex);
        bzp.m104632d(byteBuffer, this.language);
        byteBuffer.put(mck0.m154017b(this.classificationInfo));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return mck0.m154018c(this.classificationInfo) + 9;
    }

    public String getLanguage() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.language;
    }

    public void setClassificationEntity(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this, str));
        this.classificationEntity = str;
    }

    public void setClassificationInfo(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this, str));
        this.classificationInfo = str;
    }

    public void setClassificationTableIndex(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.classificationTableIndex = i;
    }

    public void setLanguage(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this, str));
        this.language = str;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this));
        return "ClassificationBox[language=" + getLanguage() + "classificationEntity=" + getClassificationEntity() + ";classificationTableIndex=" + getClassificationTableIndex() + ";language=" + getLanguage() + ";classificationInfo=" + getClassificationInfo() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
