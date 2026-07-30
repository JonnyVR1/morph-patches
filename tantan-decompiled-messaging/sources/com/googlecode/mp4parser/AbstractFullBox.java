package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.FullBox;
import com.meituan.robust.Constants;
import com.sina.weibo.sdk.constant.WBConstants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractFullBox extends AbstractBox implements FullBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private int flags;
    private int version;

    static {
        ajc$preClinit();
    }

    public AbstractFullBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AbstractFullBox.java", AbstractFullBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setVersion", "com.googlecode.mp4parser.AbstractFullBox", Constants.INT, WBConstants.AUTH_PARAMS_VERSION, "", Constants.VOID), 51);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFlags", "com.googlecode.mp4parser.AbstractFullBox", Constants.INT, "flags", "", Constants.VOID), 64);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.flags;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.version;
    }

    public final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = yyp.m216561n(byteBuffer);
        this.flags = yyp.m216557j(byteBuffer);
        return 4L;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.flags = i;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this, Conversions.intObject(i)));
        this.version = i;
    }

    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        bzp.m104638j(byteBuffer, this.version);
        bzp.m104634f(byteBuffer, this.flags);
    }

    public AbstractFullBox(String str, byte[] bArr) {
        super(str, bArr);
    }
}
