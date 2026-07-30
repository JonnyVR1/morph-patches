package com.mp4parser.iso14496.part30;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.cvc0;
import p149l.mck0;
import p149l.yyp;

/* JADX INFO: loaded from: classes8.dex */
public class WebVTTSourceLabelBox extends AbstractBox {
    public static final String TYPE = "vlab";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    String sourceLabel;

    static {
        ajc$preClinit();
    }

    public WebVTTSourceLabelBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("WebVTTSourceLabelBox.java", WebVTTSourceLabelBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSourceLabel", "com.mp4parser.iso14496.part30.WebVTTSourceLabelBox", "", "", "", "java.lang.String"), 37);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSourceLabel", "com.mp4parser.iso14496.part30.WebVTTSourceLabelBox", "java.lang.String", "sourceLabel", "", Constants.VOID), 41);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.sourceLabel = yyp.m216555h(byteBuffer, byteBuffer.remaining());
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(mck0.m154017b(this.sourceLabel));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return mck0.m154018c(this.sourceLabel);
    }

    public String getSourceLabel() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.sourceLabel;
    }

    public void setSourceLabel(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.sourceLabel = str;
    }
}
