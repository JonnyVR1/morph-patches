package com.googlecode.mp4parser.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;
import p153l.slk0;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public class BaseLocationBox extends AbstractFullBox {
    public static final String TYPE = "bloc";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    String baseLocation;
    String purchaseLocation;

    static {
        ajc$preClinit();
    }

    public BaseLocationBox() {
        super(TYPE);
        this.baseLocation = "";
        this.purchaseLocation = "";
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("BaseLocationBox.java", BaseLocationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "baseLocation", "", Constants.VOID), 48);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "purchaseLocation", "", Constants.VOID), 56);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.Object", "o", "", Constants.BOOLEAN), 86);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", Constants.INT), 100);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 107);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        String strM213891g = y0q.m213891g(byteBuffer);
        this.baseLocation = strM213891g;
        byteBuffer.get(new byte[255 - slk0.m186594c(strM213891g)]);
        String strM213891g2 = y0q.m213891g(byteBuffer);
        this.purchaseLocation = strM213891g2;
        byteBuffer.get(new byte[255 - slk0.m186594c(strM213891g2)]);
        byteBuffer.get(new byte[512]);
    }

    public boolean equals(Object obj) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseLocationBox baseLocationBox = (BaseLocationBox) obj;
        String str = this.baseLocation;
        String str2 = baseLocationBox.baseLocation;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        String str3 = this.purchaseLocation;
        String str4 = baseLocationBox.purchaseLocation;
        return str3 == null ? str4 == null : str3.equals(str4);
    }

    public String getBaseLocation() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.baseLocation;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(slk0.m186593b(this.baseLocation));
        byteBuffer.put(new byte[256 - slk0.m186594c(this.baseLocation)]);
        byteBuffer.put(slk0.m186593b(this.purchaseLocation));
        byteBuffer.put(new byte[256 - slk0.m186594c(this.purchaseLocation)]);
        byteBuffer.put(new byte[512]);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 1028L;
    }

    public String getPurchaseLocation() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.purchaseLocation;
    }

    public int hashCode() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        String str = this.baseLocation;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.purchaseLocation;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void setBaseLocation(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.baseLocation = str;
    }

    public void setPurchaseLocation(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.purchaseLocation = str;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return "BaseLocationBox{baseLocation='" + this.baseLocation + "', purchaseLocation='" + this.purchaseLocation + "'}";
    }

    public BaseLocationBox(String str, String str2) {
        super(TYPE);
        this.baseLocation = str;
        this.purchaseLocation = str2;
    }
}
