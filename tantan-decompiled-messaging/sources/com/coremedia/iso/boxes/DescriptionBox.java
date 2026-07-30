package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.mck0;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class DescriptionBox extends AbstractFullBox {
    public static final String TYPE = "dscp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private String description;
    private String language;

    static {
        ajc$preClinit();
    }

    public DescriptionBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("DescriptionBox.java", DescriptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDescription", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", Constants.VOID), 71);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDescription", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", "description", "", Constants.VOID), 75);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = yyp.m216553f(byteBuffer);
        this.description = yyp.m216554g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104632d(byteBuffer, this.language);
        byteBuffer.put(mck0.m154017b(this.description));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return mck0.m154018c(this.description) + 7;
    }

    public String getDescription() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.description;
    }

    public String getLanguage() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.language;
    }

    public void setDescription(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this, str));
        this.description = str;
    }

    public void setLanguage(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.language = str;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return "DescriptionBox[language=" + getLanguage() + ";description=" + getDescription() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
