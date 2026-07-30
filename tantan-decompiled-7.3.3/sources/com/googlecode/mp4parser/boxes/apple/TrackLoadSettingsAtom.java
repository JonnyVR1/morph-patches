package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;

/* JADX INFO: loaded from: classes7.dex */
public class TrackLoadSettingsAtom extends AbstractBox {
    public static final String TYPE = "load";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    int defaultHints;
    int preloadDuration;
    int preloadFlags;
    int preloadStartTime;

    static {
        ajc$preClinit();
    }

    public TrackLoadSettingsAtom() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrackLoadSettingsAtom.java", TrackLoadSettingsAtom.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPreloadStartTime", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", Constants.INT), 49);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPreloadStartTime", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", Constants.INT, "preloadStartTime", "", Constants.VOID), 53);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPreloadDuration", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", Constants.INT), 57);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPreloadDuration", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", Constants.INT, "preloadDuration", "", Constants.VOID), 61);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPreloadFlags", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", Constants.INT), 65);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPreloadFlags", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", Constants.INT, "preloadFlags", "", Constants.VOID), 69);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultHints", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", Constants.INT), 73);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultHints", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", Constants.INT, "defaultHints", "", Constants.VOID), 77);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.preloadStartTime = byteBuffer.getInt();
        this.preloadDuration = byteBuffer.getInt();
        this.preloadFlags = byteBuffer.getInt();
        this.defaultHints = byteBuffer.getInt();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.preloadStartTime);
        byteBuffer.putInt(this.preloadDuration);
        byteBuffer.putInt(this.preloadFlags);
        byteBuffer.putInt(this.defaultHints);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 16L;
    }

    public int getDefaultHints() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.defaultHints;
    }

    public int getPreloadDuration() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.preloadDuration;
    }

    public int getPreloadFlags() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.preloadFlags;
    }

    public int getPreloadStartTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.preloadStartTime;
    }

    public void setDefaultHints(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.defaultHints = i;
    }

    public void setPreloadDuration(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.preloadDuration = i;
    }

    public void setPreloadFlags(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.preloadFlags = i;
    }

    public void setPreloadStartTime(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.preloadStartTime = i;
    }
}
