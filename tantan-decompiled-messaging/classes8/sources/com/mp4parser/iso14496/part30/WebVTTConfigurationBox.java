package com.mp4parser.iso14496.part30;

import com.googlecode.mp4parser.AbstractBox;
import com.momo.xeengine.gift.GiftLogEvent;
import java.nio.ByteBuffer;
import l.cvc0;
import l.mck0;
import l.yyp;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class WebVTTConfigurationBox extends AbstractBox {
    public static final String TYPE = "vttC";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    String config;

    static {
        ajc$preClinit();
    }

    public WebVTTConfigurationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("WebVTTConfigurationBox.java", WebVTTConfigurationBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getConfig", "com.mp4parser.iso14496.part30.WebVTTConfigurationBox", "", "", "", "java.lang.String"), 36);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setConfig", "com.mp4parser.iso14496.part30.WebVTTConfigurationBox", "java.lang.String", "config", "", "void"), 40);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.config = yyp.h(byteBuffer, byteBuffer.remaining());
    }

    public String getConfig() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.config;
    }

    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(mck0.b(this.config));
    }

    public long getContentSize() {
        return mck0.c(this.config);
    }

    public void setConfig(String str) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.config = str;
    }
}
