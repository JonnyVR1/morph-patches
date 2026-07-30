package com.googlecode.mp4parser.boxes.apple;

import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;
import p153l.iig0;
import p153l.slk0;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public class AppleRecordingYearBox extends AppleDataBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    Date date;

    /* JADX INFO: renamed from: df */
    DateFormat f11743df;

    static {
        ajc$preClinit();
    }

    public AppleRecordingYearBox() {
        super("©day", 1);
        this.date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ssZ");
        this.f11743df = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AppleRecordingYearBox.java", AppleRecordingYearBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "", "", "", "java.util.Date"), 27);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "java.util.Date", "date", "", Constants.VOID), 31);
    }

    public static String iso8601toRfc822Date(String str) {
        return str.replaceAll("Z$", "+0000").replaceAll("([0-9][0-9]):([0-9][0-9])$", "$1$2");
    }

    public static String rfc822toIso8601Date(String str) {
        return str.replaceAll("\\+0000$", "Z");
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public int getDataLength() {
        return slk0.m186593b(rfc822toIso8601Date(this.f11743df.format(this.date))).length;
    }

    public Date getDate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.date;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public void parseData(ByteBuffer byteBuffer) {
        try {
            this.date = this.f11743df.parse(iso8601toRfc822Date(y0q.m213892h(byteBuffer, byteBuffer.remaining())));
        } catch (ParseException e) {
            iig0.m140070a(e);
        }
    }

    public void setDate(Date date) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, date));
        this.date = date;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public byte[] writeData() {
        return slk0.m186593b(rfc822toIso8601Date(this.f11743df.format(this.date)));
    }
}
