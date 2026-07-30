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
import p153l.azk0;
import p153l.b1q;
import p153l.f3d0;
import p153l.khx;
import p153l.l8c;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class TrackHeaderBox extends AbstractFullBox {
    public static final String TYPE = "tkhd";
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
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_29 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private khx matrix;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    static {
        ajc$preClinit();
    }

    public TrackHeaderBox() {
        super(TYPE);
        this.matrix = khx.f126933j;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrackHeaderBox.java", TrackHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 60);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 64);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", Constants.VOID), CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", Constants.VOID), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", Constants.VOID), 203);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.LONG, "trackId", "", Constants.VOID), Primes.SMALL_FACTOR_LIMIT);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.LONG, BLiveOperationTitleShowType.duration, "", Constants.VOID), 215);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.INT, "layer", "", Constants.VOID), 222);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.INT, "alternateGroup", "", Constants.VOID), 226);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.FLOAT, "volume", "", Constants.VOID), 230);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", Constants.VOID), 234);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.LONG), 68);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.DOUBLE, "width", "", Constants.VOID), 238);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.DOUBLE, "height", "", Constants.VOID), 242);
        ajc$tjp_22 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.BOOLEAN), 247);
        ajc$tjp_23 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.BOOLEAN), 251);
        ajc$tjp_24 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.BOOLEAN), 255);
        ajc$tjp_25 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.BOOLEAN), 259);
        ajc$tjp_26 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.BOOLEAN, "enabled", "", Constants.VOID), 263);
        ajc$tjp_27 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.BOOLEAN, "inMovie", "", Constants.VOID), 271);
        ajc$tjp_28 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.BOOLEAN, "inPreview", "", Constants.VOID), 279);
        ajc$tjp_29 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.BOOLEAN, "inPoster", "", Constants.VOID), 287);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.LONG), 72);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.INT), 76);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.INT), 80);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.FLOAT), 84);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.DOUBLE), 92);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.DOUBLE), 96);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = l8c.m153169b(y0q.m213897m(byteBuffer));
            this.modificationTime = l8c.m153169b(y0q.m213897m(byteBuffer));
            this.trackId = y0q.m213895k(byteBuffer);
            y0q.m213895k(byteBuffer);
            long j = byteBuffer.getLong();
            this.duration = j;
            if (j < -1) {
                azk0.m101074a("The tracks duration is bigger than Long.MAX_VALUE");
                return;
            }
        } else {
            this.creationTime = l8c.m153169b(y0q.m213895k(byteBuffer));
            this.modificationTime = l8c.m153169b(y0q.m213895k(byteBuffer));
            this.trackId = y0q.m213895k(byteBuffer);
            y0q.m213895k(byteBuffer);
            this.duration = y0q.m213895k(byteBuffer);
        }
        y0q.m213895k(byteBuffer);
        y0q.m213895k(byteBuffer);
        this.layer = y0q.m213893i(byteBuffer);
        this.alternateGroup = y0q.m213893i(byteBuffer);
        this.volume = y0q.m213889e(byteBuffer);
        y0q.m213893i(byteBuffer);
        this.matrix = khx.m149830a(byteBuffer);
        this.width = y0q.m213888d(byteBuffer);
        this.height = y0q.m213888d(byteBuffer);
    }

    public int getAlternateGroup() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        return this.alternateGroup;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this, byteBuffer));
        writeVersionAndFlags(byteBuffer);
        int version = getVersion();
        Date date = this.creationTime;
        if (version == 1) {
            b1q.m101497i(byteBuffer, l8c.m153168a(date));
            b1q.m101497i(byteBuffer, l8c.m153168a(this.modificationTime));
            b1q.m101495g(byteBuffer, this.trackId);
            b1q.m101495g(byteBuffer, 0L);
            b1q.m101497i(byteBuffer, this.duration);
        } else {
            b1q.m101495g(byteBuffer, l8c.m153168a(date));
            b1q.m101495g(byteBuffer, l8c.m153168a(this.modificationTime));
            b1q.m101495g(byteBuffer, this.trackId);
            b1q.m101495g(byteBuffer, 0L);
            b1q.m101495g(byteBuffer, this.duration);
        }
        b1q.m101495g(byteBuffer, 0L);
        b1q.m101495g(byteBuffer, 0L);
        b1q.m101493e(byteBuffer, this.layer);
        b1q.m101493e(byteBuffer, this.alternateGroup);
        b1q.m101491c(byteBuffer, this.volume);
        b1q.m101493e(byteBuffer, 0);
        this.matrix.m149832c(byteBuffer);
        b1q.m101490b(byteBuffer, this.width);
        b1q.m101490b(byteBuffer, this.height);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 1 ? 36L : 24L) + 60;
    }

    public Date getCreationTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public long getDuration() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.duration;
    }

    public double getHeight() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this));
        return this.height;
    }

    public int getLayer() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.layer;
    }

    public khx getMatrix() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this));
        return this.matrix;
    }

    public Date getModificationTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getTrackId() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.trackId;
    }

    public float getVolume() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.volume;
    }

    public double getWidth() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.width;
    }

    public boolean isEnabled() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_22, this, this));
        return (getFlags() & 1) > 0;
    }

    public boolean isInMovie() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_23, this, this));
        return (getFlags() & 2) > 0;
    }

    public boolean isInPoster() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_25, this, this));
        return (getFlags() & 8) > 0;
    }

    public boolean isInPreview() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_24, this, this));
        return (getFlags() & 4) > 0;
    }

    public void setAlternateGroup(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.alternateGroup = i;
    }

    public void setCreationTime(Date date) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this, date));
        this.creationTime = date;
        if (l8c.m153168a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setDuration(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_15, this, this, Conversions.longObject(j)));
        this.duration = j;
        if (j >= 4294967296L) {
            setFlags(1);
        }
    }

    public void setEnabled(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_26, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & (-2));
        }
    }

    public void setHeight(double d) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_21, this, this, Conversions.doubleObject(d)));
        this.height = d;
    }

    public void setInMovie(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_27, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & (-3));
        }
    }

    public void setInPoster(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_29, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 8);
        } else {
            setFlags(getFlags() & (-9));
        }
    }

    public void setInPreview(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_28, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 4);
        } else {
            setFlags(getFlags() & (-5));
        }
    }

    public void setLayer(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_16, this, this, Conversions.intObject(i)));
        this.layer = i;
    }

    public void setMatrix(khx khxVar) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_19, this, this, khxVar));
        this.matrix = khxVar;
    }

    public void setModificationTime(Date date) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_13, this, this, date));
        this.modificationTime = date;
        if (l8c.m153168a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setTrackId(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_14, this, this, Conversions.longObject(j)));
        this.trackId = j;
    }

    public void setVolume(float f) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_18, this, this, Conversions.floatObject(f)));
        this.volume = f;
    }

    public void setWidth(double d) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_20, this, this, Conversions.doubleObject(d)));
        this.width = d;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this));
        return "TrackHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";trackId=" + getTrackId() + ";duration=" + getDuration() + ";layer=" + getLayer() + ";alternateGroup=" + getAlternateGroup() + ";volume=" + getVolume() + ";matrix=" + this.matrix + ";width=" + getWidth() + ";height=" + getHeight() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
