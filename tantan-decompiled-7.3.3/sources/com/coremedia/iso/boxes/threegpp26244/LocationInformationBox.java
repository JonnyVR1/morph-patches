package com.coremedia.iso.boxes.threegpp26244;

import com.facebook.AuthenticationTokenClaims;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.slk0;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class LocationInformationBox extends AbstractFullBox {
    public static final String TYPE = "loci";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    private String additionalNotes;
    private double altitude;
    private String astronomicalBody;
    private String language;
    private double latitude;
    private double longitude;
    private String name;
    private int role;

    static {
        ajc$preClinit();
    }

    public LocationInformationBox() {
        super(TYPE);
        this.name = "";
        this.astronomicalBody = "";
        this.additionalNotes = "";
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("LocationInformationBox.java", LocationInformationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 30);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", Constants.VOID), 34);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", Constants.DOUBLE), 70);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", Constants.DOUBLE, "altitude", "", Constants.VOID), 74);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", Constants.VOID), 82);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 86);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", Constants.VOID), 90);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", AuthenticationTokenClaims.JSON_KEY_NAME, "", Constants.VOID), 42);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", Constants.INT), 46);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", Constants.INT, "role", "", Constants.VOID), 50);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", Constants.DOUBLE), 54);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", Constants.DOUBLE, "longitude", "", Constants.VOID), 58);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", Constants.DOUBLE), 62);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", Constants.DOUBLE, "latitude", "", Constants.VOID), 66);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = y0q.m213890f(byteBuffer);
        this.name = y0q.m213891g(byteBuffer);
        this.role = y0q.m213898n(byteBuffer);
        this.longitude = y0q.m213888d(byteBuffer);
        this.latitude = y0q.m213888d(byteBuffer);
        this.altitude = y0q.m213888d(byteBuffer);
        this.astronomicalBody = y0q.m213891g(byteBuffer);
        this.additionalNotes = y0q.m213891g(byteBuffer);
    }

    public String getAdditionalNotes() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_14, this, this));
        return this.additionalNotes;
    }

    public double getAltitude() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.altitude;
    }

    public String getAstronomicalBody() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.astronomicalBody;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101492d(byteBuffer, this.language);
        byteBuffer.put(slk0.m186593b(this.name));
        byteBuffer.put((byte) 0);
        b1q.m101498j(byteBuffer, this.role);
        b1q.m101490b(byteBuffer, this.longitude);
        b1q.m101490b(byteBuffer, this.latitude);
        b1q.m101490b(byteBuffer, this.altitude);
        byteBuffer.put(slk0.m186593b(this.astronomicalBody));
        byteBuffer.put((byte) 0);
        byteBuffer.put(slk0.m186593b(this.additionalNotes));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return slk0.m186593b(this.name).length + 22 + slk0.m186593b(this.astronomicalBody).length + slk0.m186593b(this.additionalNotes).length;
    }

    public String getLanguage() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.language;
    }

    public double getLatitude() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.latitude;
    }

    public double getLongitude() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.longitude;
    }

    public String getName() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.name;
    }

    public int getRole() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.role;
    }

    public void setAdditionalNotes(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_15, this, this, str));
        this.additionalNotes = str;
    }

    public void setAltitude(double d) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.doubleObject(d)));
        this.altitude = d;
    }

    public void setAstronomicalBody(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_13, this, this, str));
        this.astronomicalBody = str;
    }

    public void setLanguage(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.language = str;
    }

    public void setLatitude(double d) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.doubleObject(d)));
        this.latitude = d;
    }

    public void setLongitude(double d) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.doubleObject(d)));
        this.longitude = d;
    }

    public void setName(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.name = str;
    }

    public void setRole(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.role = i;
    }
}
