package com.coremedia.iso.boxes;

import com.clevertap.android.sdk.Constants;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class TrackReferenceTypeBox extends AbstractBox {
    public static final String TYPE1 = "hint";
    public static final String TYPE2 = "cdsc";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private long[] trackIds;

    static {
        ajc$preClinit();
    }

    public TrackReferenceTypeBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrackReferenceTypeBox.java", TrackReferenceTypeBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTrackIds", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "[J"), 40);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "java.lang.String"), 65);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining() / 4;
        this.trackIds = new long[iRemaining];
        for (int i = 0; i < iRemaining; i++) {
            this.trackIds[i] = yyp.m216558k(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        for (long j : this.trackIds) {
            bzp.m104635g(byteBuffer, j);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.trackIds.length * 4;
    }

    public long[] getTrackIds() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.trackIds;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        StringBuilder sb = new StringBuilder("TrackReferenceTypeBox[type=");
        sb.append(getType());
        for (int i = 0; i < this.trackIds.length; i++) {
            sb.append(";trackId");
            sb.append(i);
            sb.append("=");
            sb.append(this.trackIds[i]);
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }
}
