package p149l;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class a3x {
    private String folder;

    @SerializedName("landmarks")
    public float[] landmarks;

    @SerializedName("swapFacialMask")
    public boolean swapFacialMask;
    private String texturePath;

    @SerializedName("type")
    private String type;

    @SerializedName("triggerType")
    private int triggerType = 0;

    @SerializedName("hidingTriggerType")
    private int hiddenTriggerType = 0;

    @SerializedName("strength")
    private float strength = 0.0f;

    @SerializedName("strengthB")
    private float strengthB = 0.0f;

    /* JADX INFO: renamed from: a */
    public String m94757a() {
        return this.folder;
    }

    /* JADX INFO: renamed from: b */
    public int m94758b() {
        return this.hiddenTriggerType;
    }

    /* JADX INFO: renamed from: c */
    public float m94759c() {
        return this.strength;
    }

    /* JADX INFO: renamed from: d */
    public float m94760d() {
        return this.strengthB;
    }

    /* JADX INFO: renamed from: e */
    public int m94761e() {
        return this.triggerType;
    }

    /* JADX INFO: renamed from: f */
    public String m94762f() {
        return this.type;
    }

    /* JADX INFO: renamed from: g */
    public void m94763g(String str) {
        this.texturePath = str;
    }
}
