package p149l;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class gu2 {

    @SerializedName("scale_bigeye")
    private int scaleBigeye;

    @SerializedName("scale_smoothing")
    private int scaleSmoothing;

    @SerializedName("scale_thinface")
    private double scaleThinface;

    @SerializedName("scale_whiten")
    private double scaleWhiten;

    public String toString() {
        return "BeautifyScale{scaleSmoothing=" + this.scaleSmoothing + ", scaleWhiten=" + this.scaleWhiten + ", scaleBigeye=" + this.scaleBigeye + ", scaleThinface=" + this.scaleThinface + '}';
    }
}
