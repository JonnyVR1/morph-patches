package com.squareup.wire;

import java.io.IOException;
import p153l.aqg0;
import p153l.f7b0;

/* JADX INFO: loaded from: classes11.dex */
public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);

    final int value;

    /* JADX INFO: renamed from: com.squareup.wire.FieldEncoding$1 */
    public static /* synthetic */ class C133871 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$wire$FieldEncoding;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            $SwitchMap$com$squareup$wire$FieldEncoding = iArr;
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$squareup$wire$FieldEncoding[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$squareup$wire$FieldEncoding[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$squareup$wire$FieldEncoding[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    FieldEncoding(int i) {
        this.value = i;
    }

    public static FieldEncoding get(int i) throws IOException {
        if (i == 0) {
            return VARINT;
        }
        if (i == 1) {
            return FIXED64;
        }
        if (i == 2) {
            return LENGTH_DELIMITED;
        }
        if (i == 5) {
            return FIXED32;
        }
        f7b0.m124433a("Unexpected FieldEncoding: ", i);
        return null;
    }

    public ProtoAdapter<?> rawProtoAdapter() {
        int i = C133871.$SwitchMap$com$squareup$wire$FieldEncoding[ordinal()];
        if (i == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i == 4) {
            return ProtoAdapter.BYTES;
        }
        aqg0.m99478a();
        return null;
    }
}
