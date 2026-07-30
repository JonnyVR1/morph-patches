package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.nio.ByteBuffer;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.f7c;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class MediaHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mdhd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    private Date creationTime;
    private long duration;
    private String language;
    private Date modificationTime;
    private long timescale;

    static {
        ajc$preClinit();
    }

    public MediaHeaderBox() {
        super(TYPE);
        this.creationTime = new Date();
        this.modificationTime = new Date();
        this.language = "eng";
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("MediaHeaderBox.java", MediaHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 46);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 50);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 118);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", Constants.LONG), 54);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", Constants.LONG), 58);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", Constants.VOID), 79);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", Constants.VOID), 83);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.LONG, "timescale", "", Constants.VOID), 87);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.LONG, BLiveOperationTitleShowType.duration, "", Constants.VOID), 91);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", Constants.VOID), 95);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = f7c.m119785b(yyp.m216560m(byteBuffer));
            this.modificationTime = f7c.m119785b(yyp.m216560m(byteBuffer));
            this.timescale = yyp.m216558k(byteBuffer);
            this.duration = yyp.m216560m(byteBuffer);
        } else {
            this.creationTime = f7c.m119785b(yyp.m216558k(byteBuffer));
            this.modificationTime = f7c.m119785b(yyp.m216558k(byteBuffer));
            this.timescale = yyp.m216558k(byteBuffer);
            this.duration = yyp.m216558k(byteBuffer);
        }
        this.language = yyp.m216553f(byteBuffer);
        yyp.m216556i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        int version = getVersion();
        Date date = this.creationTime;
        if (version == 1) {
            bzp.m104637i(byteBuffer, f7c.m119784a(date));
            bzp.m104637i(byteBuffer, f7c.m119784a(this.modificationTime));
            bzp.m104635g(byteBuffer, this.timescale);
            bzp.m104637i(byteBuffer, this.duration);
        } else {
            bzp.m104635g(byteBuffer, f7c.m119784a(date));
            bzp.m104635g(byteBuffer, f7c.m119784a(this.modificationTime));
            bzp.m104635g(byteBuffer, this.timescale);
            bzp.m104635g(byteBuffer, this.duration);
        }
        bzp.m104632d(byteBuffer, this.language);
        bzp.m104633e(byteBuffer, 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 1 ? 32L : 20L) + 4;
    }

    public Date getCreationTime() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public long getDuration() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.duration;
    }

    public String getLanguage() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.language;
    }

    public Date getModificationTime() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getTimescale() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.timescale;
    }

    public void setCreationTime(Date date) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, date));
        this.creationTime = date;
    }

    public void setDuration(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this, Conversions.longObject(j)));
        this.duration = j;
    }

    public void setLanguage(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this, str));
        this.language = str;
    }

    public void setModificationTime(Date date) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this, date));
        this.modificationTime = date;
    }

    public void setTimescale(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.longObject(j)));
        this.timescale = j;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, this, this));
        return "MediaHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";timescale=" + getTimescale() + ";duration=" + getDuration() + ";language=" + getLanguage() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
