package p149l;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class yds extends z1s {

    @SerializedName("bottomImageUrl")
    public String bottomImageUrl;

    @SerializedName("bottomText")
    public String bottomText;

    @SerializedName("cornerImages")
    public List<String> cornerImages;

    @SerializedName("cornerText")
    public String cornerText;

    @SerializedName("goAction")
    public LiveGoAction goAction;

    @SerializedName("highlightText")
    public String highLightText;

    @SerializedName("leftImageUrl")
    public String leftImageUrl;

    @SerializedName("midText")
    public String midText;

    @SerializedName("midTextPrefix")
    public String midTextPrefix;

    @SerializedName("topText")
    public String topText;

    @SerializedName("trackData")
    public LiveCardTrackData trackData;
}
