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
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class AlbumBox extends AbstractFullBox {
    public static final String TYPE = "albm";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private String albumTitle;
    private String language;
    private int trackNumber;

    static {
        ajc$preClinit();
    }

    public AlbumBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AlbumBox.java", AlbumBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 51);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 55);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "", "", "", Constants.INT), 59);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", Constants.VOID), 63);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "albumTitle", "", Constants.VOID), 67);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTrackNumber", "com.coremedia.iso.boxes.AlbumBox", Constants.INT, "trackNumber", "", Constants.VOID), 71);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 103);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = yyp.m216553f(byteBuffer);
        this.albumTitle = yyp.m216554g(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            this.trackNumber = yyp.m216561n(byteBuffer);
        } else {
            this.trackNumber = -1;
        }
    }

    public String getAlbumTitle() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.albumTitle;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104632d(byteBuffer, this.language);
        byteBuffer.put(mck0.m154017b(this.albumTitle));
        byteBuffer.put((byte) 0);
        int i = this.trackNumber;
        if (i != -1) {
            bzp.m104638j(byteBuffer, i);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return mck0.m154018c(this.albumTitle) + 7 + (this.trackNumber == -1 ? 0 : 1);
    }

    public String getLanguage() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.language;
    }

    public int getTrackNumber() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.trackNumber;
    }

    public void setAlbumTitle(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this, str));
        this.albumTitle = str;
    }

    public void setLanguage(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.language = str;
    }

    public void setTrackNumber(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.trackNumber = i;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        StringBuilder sb = new StringBuilder("AlbumBox[language=");
        sb.append(getLanguage());
        sb.append(";albumTitle=");
        sb.append(getAlbumTitle());
        if (this.trackNumber >= 0) {
            sb.append(";trackNumber=");
            sb.append(getTrackNumber());
        }
        sb.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return sb.toString();
    }
}
