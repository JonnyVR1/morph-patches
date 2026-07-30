package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.nio.ByteBuffer;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;
import p153l.b1q;
import p153l.f3d0;
import p153l.khx;
import p153l.l8c;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class MovieHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mvhd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_16 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_17 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_18 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_19 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_20 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_21 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_22 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_23 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_24 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_25 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_26 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_27 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_28 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private khx matrix;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume;

    static {
        ajc$preClinit();
    }

    public MovieHeaderBox() {
        super(TYPE);
        this.rate = 1.0d;
        this.volume = 1.0f;
        this.matrix = khx.f126933j;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("MovieHeaderBox.java", MovieHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 63);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 67);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", Constants.VOID), 203);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.LONG, "timescale", "", Constants.VOID), Primes.SMALL_FACTOR_LIMIT);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.LONG, BLiveOperationTitleShowType.duration, "", Constants.VOID), 215);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.DOUBLE, "rate", "", Constants.VOID), 222);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.FLOAT, "volume", "", Constants.VOID), 226);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", Constants.VOID), 230);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.LONG, "nextTrackId", "", Constants.VOID), 234);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.INT), 238);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.INT, "previewTime", "", Constants.VOID), 242);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.INT), 246);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.LONG), 71);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.INT, "previewDuration", "", Constants.VOID), 250);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.INT), 254);
        ajc$tjp_22 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.INT, "posterTime", "", Constants.VOID), 258);
        ajc$tjp_23 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.INT), 262);
        ajc$tjp_24 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.INT, "selectionTime", "", Constants.VOID), 266);
        ajc$tjp_25 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.INT), 270);
        ajc$tjp_26 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.INT, "selectionDuration", "", Constants.VOID), 274);
        ajc$tjp_27 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.INT), 278);
        ajc$tjp_28 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.INT, "currentTime", "", Constants.VOID), 282);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.LONG), 75);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.DOUBLE), 79);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.FLOAT), 83);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.LONG), 91);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", Constants.VOID), CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = l8c.m153169b(y0q.m213897m(byteBuffer));
            this.modificationTime = l8c.m153169b(y0q.m213897m(byteBuffer));
            this.timescale = y0q.m213895k(byteBuffer);
            this.duration = y0q.m213897m(byteBuffer);
        } else {
            this.creationTime = l8c.m153169b(y0q.m213895k(byteBuffer));
            this.modificationTime = l8c.m153169b(y0q.m213895k(byteBuffer));
            this.timescale = y0q.m213895k(byteBuffer);
            this.duration = y0q.m213895k(byteBuffer);
        }
        this.rate = y0q.m213888d(byteBuffer);
        this.volume = y0q.m213889e(byteBuffer);
        y0q.m213893i(byteBuffer);
        y0q.m213895k(byteBuffer);
        y0q.m213895k(byteBuffer);
        this.matrix = khx.m149830a(byteBuffer);
        this.previewTime = byteBuffer.getInt();
        this.previewDuration = byteBuffer.getInt();
        this.posterTime = byteBuffer.getInt();
        this.selectionTime = byteBuffer.getInt();
        this.selectionDuration = byteBuffer.getInt();
        this.currentTime = byteBuffer.getInt();
        this.nextTrackId = y0q.m213895k(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        int version = getVersion();
        Date date = this.creationTime;
        if (version == 1) {
            b1q.m101497i(byteBuffer, l8c.m153168a(date));
            b1q.m101497i(byteBuffer, l8c.m153168a(this.modificationTime));
            b1q.m101495g(byteBuffer, this.timescale);
            b1q.m101497i(byteBuffer, this.duration);
        } else {
            b1q.m101495g(byteBuffer, l8c.m153168a(date));
            b1q.m101495g(byteBuffer, l8c.m153168a(this.modificationTime));
            b1q.m101495g(byteBuffer, this.timescale);
            b1q.m101495g(byteBuffer, this.duration);
        }
        b1q.m101490b(byteBuffer, this.rate);
        b1q.m101491c(byteBuffer, this.volume);
        b1q.m101493e(byteBuffer, 0);
        b1q.m101495g(byteBuffer, 0L);
        b1q.m101495g(byteBuffer, 0L);
        this.matrix.m149832c(byteBuffer);
        byteBuffer.putInt(this.previewTime);
        byteBuffer.putInt(this.previewDuration);
        byteBuffer.putInt(this.posterTime);
        byteBuffer.putInt(this.selectionTime);
        byteBuffer.putInt(this.selectionDuration);
        byteBuffer.putInt(this.currentTime);
        b1q.m101495g(byteBuffer, this.nextTrackId);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 1 ? 32L : 20L) + 80;
    }

    public Date getCreationTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public int getCurrentTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_27, this, this));
        return this.currentTime;
    }

    public long getDuration() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.duration;
    }

    public khx getMatrix() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.matrix;
    }

    public Date getModificationTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getNextTrackId() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this));
        return this.nextTrackId;
    }

    public int getPosterTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_21, this, this));
        return this.posterTime;
    }

    public int getPreviewDuration() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_19, this, this));
        return this.previewDuration;
    }

    public int getPreviewTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_17, this, this));
        return this.previewTime;
    }

    public double getRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.rate;
    }

    public int getSelectionDuration() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_25, this, this));
        return this.selectionDuration;
    }

    public int getSelectionTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_23, this, this));
        return this.selectionTime;
    }

    public long getTimescale() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.timescale;
    }

    public float getVolume() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        return this.volume;
    }

    public void setCreationTime(Date date) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, date));
        this.creationTime = date;
        if (l8c.m153168a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setCurrentTime(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_28, this, this, Conversions.intObject(i)));
        this.currentTime = i;
    }

    public void setDuration(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this, Conversions.longObject(j)));
        this.duration = j;
        if (j >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setMatrix(khx khxVar) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_15, this, this, khxVar));
        this.matrix = khxVar;
    }

    public void setModificationTime(Date date) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this, date));
        this.modificationTime = date;
        if (l8c.m153168a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setNextTrackId(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_16, this, this, Conversions.longObject(j)));
        this.nextTrackId = j;
    }

    public void setPosterTime(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_22, this, this, Conversions.intObject(i)));
        this.posterTime = i;
    }

    public void setPreviewDuration(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_20, this, this, Conversions.intObject(i)));
        this.previewDuration = i;
    }

    public void setPreviewTime(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_18, this, this, Conversions.intObject(i)));
        this.previewTime = i;
    }

    public void setRate(double d) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_13, this, this, Conversions.doubleObject(d)));
        this.rate = d;
    }

    public void setSelectionDuration(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_26, this, this, Conversions.intObject(i)));
        this.selectionDuration = i;
    }

    public void setSelectionTime(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_24, this, this, Conversions.intObject(i)));
        this.selectionTime = i;
    }

    public void setTimescale(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.longObject(j)));
        this.timescale = j;
    }

    public void setVolume(float f) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_14, this, this, Conversions.floatObject(f)));
        this.volume = f;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return "MovieHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";timescale=" + getTimescale() + ";duration=" + getDuration() + ";rate=" + getRate() + ";volume=" + getVolume() + ";matrix=" + this.matrix + ";nextTrackId=" + getNextTrackId() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
