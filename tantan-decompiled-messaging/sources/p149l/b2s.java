package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.data.OMSResourceType;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class b2s {
    public static final String A_ZONE = "A";
    public static final String B_ZONE = "B";
    public static final String C_ZONE = "C";
    public static final String D_ZONE = "D";
    public static final String E_ZONE = "E";

    @SerializedName(OMSResourceType.background)
    public List<String> background;

    @SerializedName("bgImage")
    public String bgImage;

    @SerializedName("bgImageH")
    public float bgImageH;

    @SerializedName("bgImageW")
    public float bgImageW;

    @SerializedName("fontColor")
    public String fontColor;

    @SerializedName("fontFamily")
    public String fontFamily;

    @SerializedName("icon")
    public String icon;

    @SerializedName("iconH")
    public int iconH;

    @SerializedName("iconW")
    public int iconW;

    @SerializedName("linearGradient")
    public int linearGradient;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    public String name;

    @SerializedName("opacity")
    public float opacity;

    @SerializedName("text")
    public String text;

    @SerializedName("type")
    public String type;
}
