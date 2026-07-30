package com.facebook.fresco.p027ui.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m87232d2 = {"Lcom/facebook/fresco/ui/common/ImageLoadStatus;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "", "toString", "()Ljava/lang/String;", "I", "getValue", "()I", "Companion", "a", "UNKNOWN", "REQUESTED", "INTERMEDIATE_AVAILABLE", "SUCCESS", "ERROR", "EMPTY_EVENT", "RELEASED", "ui-common_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public enum ImageLoadStatus {
    UNKNOWN(-1),
    REQUESTED(0),
    INTERMEDIATE_AVAILABLE(2),
    SUCCESS(3),
    ERROR(5),
    EMPTY_EVENT(7),
    RELEASED(8);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    @NotNull
    private static final ImageLoadStatus[] VALUES = values();

    /* JADX INFO: renamed from: com.facebook.fresco.ui.common.ImageLoadStatus$b */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C1609b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6413a;

        static {
            int[] iArr = new int[ImageLoadStatus.values().length];
            try {
                iArr[ImageLoadStatus.REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageLoadStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageLoadStatus.INTERMEDIATE_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageLoadStatus.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageLoadStatus.RELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6413a = iArr;
        }
    }

    ImageLoadStatus(int i) {
        this.value = i;
    }

    @NotNull
    public static EnumEntries<ImageLoadStatus> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i = C1609b.f6413a[ordinal()];
        if (i == 1) {
            return "requested";
        }
        if (i == 2) {
            return "success";
        }
        if (i == 3) {
            return "intermediate_available";
        }
        if (i != 4) {
            return i != 5 ? "unknown" : "released";
        }
        return "error";
    }
}
