package com.googlecode.mp4parser.authoring.tracks;

/* JADX INFO: loaded from: classes7.dex */
public enum H265TrackImplOld$PARSE_STATE {
    AUD_SEI_SLICE,
    SEI_SLICE,
    SLICE_OES_EOB;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static H265TrackImplOld$PARSE_STATE[] valuesCustom() {
        H265TrackImplOld$PARSE_STATE[] h265TrackImplOld$PARSE_STATEArrValuesCustom = values();
        int length = h265TrackImplOld$PARSE_STATEArrValuesCustom.length;
        H265TrackImplOld$PARSE_STATE[] h265TrackImplOld$PARSE_STATEArr = new H265TrackImplOld$PARSE_STATE[length];
        System.arraycopy(h265TrackImplOld$PARSE_STATEArrValuesCustom, 0, h265TrackImplOld$PARSE_STATEArr, 0, length);
        return h265TrackImplOld$PARSE_STATEArr;
    }
}
