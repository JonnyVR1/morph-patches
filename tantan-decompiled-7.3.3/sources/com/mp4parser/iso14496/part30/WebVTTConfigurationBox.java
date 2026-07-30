package com.mp4parser.iso14496.part30;

import com.clevertap.android.sdk.Constants;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;
import p153l.slk0;
import p153l.y0q;

/* JADX INFO: loaded from: classes8.dex */
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
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getConfig", "com.mp4parser.iso14496.part30.WebVTTConfigurationBox", "", "", "", "java.lang.String"), 36);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setConfig", "com.mp4parser.iso14496.part30.WebVTTConfigurationBox", "java.lang.String", Constants.KEY_CONFIG, "", com.meituan.robust.Constants.VOID), 40);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.config = y0q.m213892h(byteBuffer, byteBuffer.remaining());
    }

    public String getConfig() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.config;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(slk0.m186593b(this.config));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return slk0.m186594c(this.config);
    }

    public void setConfig(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.config = str;
    }
}
