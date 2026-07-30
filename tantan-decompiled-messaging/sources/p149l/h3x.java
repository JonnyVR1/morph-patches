package p149l;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class h3x {

    @SerializedName("additionalInfo")
    private a90 additionalInfo;

    @SerializedName("distortionList")
    List<a3x> distortionList;
    private long duration;
    private List<tpe> effectList;
    float faceFacialFeatureScale;
    float faceScale;
    String folderPath;

    @SerializedName("frameRate")
    int frameRate;

    @SerializedName("filterList")
    List<g3w> lookUpFilters;

    @SerializedName("faceMaskList")
    List<a3x> masks;
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
    public mwf0 spectrumSticker;

    @SerializedName("itemList")
    List<mwf0> stickers;
    String warpType;

    /* JADX INFO: renamed from: a */
    public a90 m129179a() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: b */
    public List<a3x> m129180b() {
        return this.distortionList;
    }

    /* JADX INFO: renamed from: c */
    public List<tpe> m129181c() {
        return this.effectList;
    }

    /* JADX INFO: renamed from: d */
    public int m129182d() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: e */
    public List<g3w> m129183e() {
        return this.lookUpFilters;
    }

    /* JADX INFO: renamed from: f */
    public List<a3x> m129184f() {
        return this.masks;
    }

    /* JADX INFO: renamed from: g */
    public String m129185g() {
        return this.sound;
    }

    /* JADX INFO: renamed from: h */
    public List<mwf0> m129186h() {
        return this.stickers;
    }

    /* JADX INFO: renamed from: i */
    public void m129187i(float f) {
        this.faceFacialFeatureScale = f;
    }

    /* JADX INFO: renamed from: j */
    public void m129188j(float f) {
        this.faceScale = f;
    }

    /* JADX INFO: renamed from: k */
    public void m129189k(String str) {
        this.folderPath = str;
    }

    /* JADX INFO: renamed from: l */
    public void m129190l(String str) {
        this.soundPath = str;
    }

    /* JADX INFO: renamed from: m */
    public void m129191m(int i) {
        this.soundPitchMode = i;
    }

    /* JADX INFO: renamed from: n */
    public void m129192n(List<mwf0> list) {
        this.stickers = list;
    }

    /* JADX INFO: renamed from: o */
    public void m129193o(String str) {
        this.warpType = str;
    }
}
