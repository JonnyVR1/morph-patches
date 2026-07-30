package p153l;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class g6x {

    @SerializedName("additionalInfo")
    private w80 additionalInfo;

    @SerializedName("distortionList")
    List<z5x> distortionList;
    private long duration;
    private List<xqe> effectList;
    float faceFacialFeatureScale;
    float faceScale;
    String folderPath;

    @SerializedName("frameRate")
    int frameRate;

    @SerializedName("filterList")
    List<e5w> lookUpFilters;

    @SerializedName("faceMaskList")
    List<z5x> masks;
    private int modelType;

    @SerializedName("pollGroupNum")
    private int pollGroupNum;

    @SerializedName("previewPath")
    String previewPath;

    @SerializedName("sound")
    String sound;
    String soundPath;
    int soundPitchMode = 0;

    @SerializedName("spectrumFilter")
    public w4g0 spectrumSticker;

    @SerializedName("itemList")
    List<w4g0> stickers;
    String warpType;

    /* JADX INFO: renamed from: a */
    public w80 m129285a() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: b */
    public List<z5x> m129286b() {
        return this.distortionList;
    }

    /* JADX INFO: renamed from: c */
    public List<xqe> m129287c() {
        return this.effectList;
    }

    /* JADX INFO: renamed from: d */
    public int m129288d() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: e */
    public List<e5w> m129289e() {
        return this.lookUpFilters;
    }

    /* JADX INFO: renamed from: f */
    public List<z5x> m129290f() {
        return this.masks;
    }

    /* JADX INFO: renamed from: g */
    public String m129291g() {
        return this.sound;
    }

    /* JADX INFO: renamed from: h */
    public List<w4g0> m129292h() {
        return this.stickers;
    }

    /* JADX INFO: renamed from: i */
    public void m129293i(float f) {
        this.faceFacialFeatureScale = f;
    }

    /* JADX INFO: renamed from: j */
    public void m129294j(float f) {
        this.faceScale = f;
    }

    /* JADX INFO: renamed from: k */
    public void m129295k(String str) {
        this.folderPath = str;
    }

    /* JADX INFO: renamed from: l */
    public void m129296l(String str) {
        this.soundPath = str;
    }

    /* JADX INFO: renamed from: m */
    public void m129297m(int i) {
        this.soundPitchMode = i;
    }

    /* JADX INFO: renamed from: n */
    public void m129298n(List<w4g0> list) {
        this.stickers = list;
    }

    /* JADX INFO: renamed from: o */
    public void m129299o(String str) {
        this.warpType = str;
    }
}
