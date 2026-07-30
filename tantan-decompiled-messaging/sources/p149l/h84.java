package p149l;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class h84 {

    @SerializedName("enable_camera2")
    private int enableCamera2;

    @SerializedName("expo_rate")
    private int expoRate;

    @SerializedName("type")
    private int type;

    public String toString() {
        return "Cam{expoRate=" + this.expoRate + ", type=" + this.type + ", enableCamera2=" + this.enableCamera2 + '}';
    }
}
