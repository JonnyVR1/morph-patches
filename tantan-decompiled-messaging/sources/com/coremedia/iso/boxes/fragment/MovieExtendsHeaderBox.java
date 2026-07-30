package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class MovieExtendsHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mehd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private long fragmentDuration;

    static {
        ajc$preClinit();
    }

    public MovieExtendsHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("MovieExtendsHeaderBox.java", MovieExtendsHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", "", "", "", Constants.LONG), 65);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", Constants.LONG, "fragmentDuration", "", Constants.VOID), 69);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.fragmentDuration = getVersion() == 1 ? yyp.m216560m(byteBuffer) : yyp.m216558k(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        int version = getVersion();
        long j = this.fragmentDuration;
        if (version == 1) {
            bzp.m104637i(byteBuffer, j);
        } else {
            bzp.m104635g(byteBuffer, j);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return getVersion() == 1 ? 12 : 8;
    }

    public long getFragmentDuration() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.fragmentDuration;
    }

    public void setFragmentDuration(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(j)));
        this.fragmentDuration = j;
    }
}
