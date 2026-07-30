package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;
import p153l.slk0;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class XmlBox extends AbstractFullBox {
    public static final String TYPE = "xml ";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    String xml;

    static {
        ajc$preClinit();
    }

    public XmlBox() {
        super(TYPE);
        this.xml = "";
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("XmlBox.java", XmlBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getXml", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 20);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setXml", "com.coremedia.iso.boxes.XmlBox", "java.lang.String", "xml", "", Constants.VOID), 24);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 46);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.xml = y0q.m213892h(byteBuffer, byteBuffer.remaining());
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(slk0.m186593b(this.xml));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return slk0.m186594c(this.xml) + 4;
    }

    public String getXml() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.xml;
    }

    public void setXml(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.xml = str;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return "XmlBox{xml='" + this.xml + "'}";
    }
}
