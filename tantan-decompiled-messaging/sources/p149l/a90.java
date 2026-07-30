package p149l;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class a90 {

    @SerializedName("animojiDetectEnable")
    private boolean animojiDetectEnable;

    @SerializedName("backTips")
    private C15545a backTip;

    @SerializedName("bodyDetectEnable")
    private boolean bodyDetectEnable = false;

    @SerializedName("bodySegmentDetectEnable")
    private boolean bodySegmentDetectEnable;

    @SerializedName("boogerpickingSwitch")
    private boolean boogerpickingSwitch;

    @SerializedName("cartoonFaceEnable")
    private boolean cartoonFaceEnable;

    @SerializedName("cartoonFaceType")
    private int cartoonFaceType;

    @SerializedName("comic")
    private boolean comic;

    @SerializedName("detectARGift")
    private boolean detectARGift;

    @SerializedName("detectGanCryingFace")
    private boolean detectGanCryingFace;

    @SerializedName("detectQRCode")
    private boolean detectQRCode;

    @SerializedName("engineAr")
    private boolean engineAr;
    private boolean expressionDetectEnable;

    @SerializedName("frontTips")
    private C15545a frontTip;

    @SerializedName("gestureDetectEnable")
    private boolean gestureDetectEnable;

    @SerializedName("handSegmentDetector")
    private boolean handSegmentDetector;

    @SerializedName("heartProgressDetector")
    private boolean heartProgressDetector;

    @SerializedName("makeUpSwitch")
    private boolean makeUpSwitch;

    @SerializedName("multiFaceSwitchEnable")
    private boolean multiFaceSwitchEnable;

    @SerializedName("multiFaces")
    private int multiFaces;

    @SerializedName("objectDetectEnable")
    private boolean objectDetectEnable;

    @SerializedName("stylizeFaceEnable")
    private boolean stylizeFaceEnable;

    /* JADX INFO: renamed from: l.a90$a */
    public static class C15545a {

        @SerializedName("content")
        private String content;

        @SerializedName("isFaceTrack")
        private boolean isFaceTrack;

        @SerializedName("triggerTip")
        private vaj0 triggerTip;
    }

    /* JADX INFO: renamed from: a */
    public boolean m95389a() {
        return this.engineAr;
    }
}
