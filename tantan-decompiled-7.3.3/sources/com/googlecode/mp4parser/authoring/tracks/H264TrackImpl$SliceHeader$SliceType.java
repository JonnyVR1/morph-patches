package com.googlecode.mp4parser.authoring.tracks;

/* JADX INFO: loaded from: classes7.dex */
public enum H264TrackImpl$SliceHeader$SliceType {
    P,
    B,
    I,
    SP,
    SI;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static H264TrackImpl$SliceHeader$SliceType[] valuesCustom() {
        H264TrackImpl$SliceHeader$SliceType[] h264TrackImpl$SliceHeader$SliceTypeArrValuesCustom = values();
        int length = h264TrackImpl$SliceHeader$SliceTypeArrValuesCustom.length;
        H264TrackImpl$SliceHeader$SliceType[] h264TrackImpl$SliceHeader$SliceTypeArr = new H264TrackImpl$SliceHeader$SliceType[length];
        System.arraycopy(h264TrackImpl$SliceHeader$SliceTypeArrValuesCustom, 0, h264TrackImpl$SliceHeader$SliceTypeArr, 0, length);
        return h264TrackImpl$SliceHeader$SliceTypeArr;
    }
}
