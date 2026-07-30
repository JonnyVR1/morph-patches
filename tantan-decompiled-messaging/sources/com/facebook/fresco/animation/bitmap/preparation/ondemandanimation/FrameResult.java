package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fa5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "", "Ll/fa5;", "Landroid/graphics/Bitmap;", "bitmapRef", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult$FrameType;", "type", "<init>", "(Ll/fa5;Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult$FrameType;)V", "a", "Ll/fa5;", "()Ll/fa5;", "b", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult$FrameType;", "()Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult$FrameType;", "FrameType", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class FrameResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final fa5<Bitmap> bitmapRef;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final FrameType type;

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult$FrameType;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "NEAREST", "MISSING", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public enum FrameType {
        SUCCESS,
        NEAREST,
        MISSING;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<FrameType> getEntries() {
            return $ENTRIES;
        }
    }

    public FrameResult(@Nullable fa5<Bitmap> fa5Var, @NotNull FrameType frameType) {
        frameType.getClass();
        this.bitmapRef = fa5Var;
        this.type = frameType;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final fa5<Bitmap> m8329a() {
        return this.bitmapRef;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FrameType getType() {
        return this.type;
    }
}
