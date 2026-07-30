package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.slk0;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class TitleBox extends AbstractFullBox {
    public static final String TYPE = "titl";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private String language;
    private String title;

    static {
        ajc$preClinit();
    }

    public TitleBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TitleBox.java", TitleBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTitle", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", Constants.VOID), 59);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTitle", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "title", "", Constants.VOID), 63);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 86);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = y0q.m213890f(byteBuffer);
        this.title = y0q.m213891g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101492d(byteBuffer, this.language);
        byteBuffer.put(slk0.m186593b(this.title));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return slk0.m186594c(this.title) + 7;
    }

    public String getLanguage() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.language;
    }

    public String getTitle() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.title;
    }

    public void setLanguage(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public void setTitle(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.title = str;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return "TitleBox[language=" + getLanguage() + ";title=" + getTitle() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
