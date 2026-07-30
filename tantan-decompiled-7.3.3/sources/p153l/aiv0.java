package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class aiv0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f71583a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f71584b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c */
    public static final Pattern f71585c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d */
    public static final Map f71586d;

    static {
        HashMap map = new HashMap();
        f71586d = map;
        map.put("aliceblue", -984833);
        map.put("antiquewhite", -332841);
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        map.put("azure", -983041);
        map.put("beige", -657956);
        map.put("bisque", -6972);
        map.put("black", Integer.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR));
        map.put("blanchedalmond", -5171);
        map.put(LiveVoiceInternalEntryBean.TYPE_BG_STYLE_BLUE, -16776961);
        map.put("blueviolet", -7722014);
        map.put("brown", -5952982);
        map.put("burlywood", -2180985);
        map.put("cadetblue", -10510688);
        map.put("chartreuse", -8388864);
        map.put("chocolate", -2987746);
        map.put("coral", -32944);
        map.put("cornflowerblue", -10185235);
        map.put("cornsilk", -1828);
        map.put("crimson", -2354116);
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        map.put("darkcyan", -16741493);
        map.put("darkgoldenrod", -4684277);
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        map.put("darkmagenta", -7667573);
        map.put("darkolivegreen", -11179217);
        map.put("darkorange", -29696);
        map.put("darkorchid", -6737204);
        map.put("darkred", -7667712);
        map.put("darksalmon", -1468806);
        map.put("darkseagreen", -7357297);
        map.put("darkslateblue", -12042869);
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        map.put("deeppink", -60269);
        map.put("deepskyblue", -16728065);
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        map.put("floralwhite", -1296);
        map.put("forestgreen", -14513374);
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        map.put("ghostwhite", -460545);
        map.put("gold", -10496);
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        map.put("green", -16744448);
        map.put("greenyellow", -5374161);
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        map.put("hotpink", -38476);
        map.put("indianred", -3318692);
        map.put("indigo", -11861886);
        map.put("ivory", -16);
        map.put("khaki", -989556);
        map.put("lavender", -1644806);
        map.put("lavenderblush", -3851);
        map.put("lawngreen", -8586240);
        map.put("lemonchiffon", -1331);
        map.put("lightblue", -5383962);
        map.put("lightcoral", -1015680);
        map.put("lightcyan", -2031617);
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        map.put("lightpink", -18751);
        map.put("lightsalmon", -24454);
        map.put("lightseagreen", -14634326);
        map.put("lightskyblue", -7876870);
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        map.put("lime", -16711936);
        map.put("limegreen", -13447886);
        map.put("linen", -331546);
        map.put("magenta", -65281);
        map.put("maroon", -8388608);
        map.put("mediumaquamarine", -10039894);
        map.put("mediumblue", -16777011);
        map.put("mediumorchid", -4565549);
        map.put("mediumpurple", -7114533);
        map.put("mediumseagreen", -12799119);
        map.put("mediumslateblue", -8689426);
        map.put("mediumspringgreen", -16713062);
        map.put("mediumturquoise", -12004916);
        map.put("mediumvioletred", -3730043);
        map.put("midnightblue", -15132304);
        map.put("mintcream", -655366);
        map.put("mistyrose", -6943);
        map.put("moccasin", -6987);
        map.put("navajowhite", -8531);
        map.put("navy", -16777088);
        map.put("oldlace", -133658);
        map.put("olive", -8355840);
        map.put("olivedrab", -9728477);
        map.put(LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE, -23296);
        map.put("orangered", -47872);
        map.put("orchid", -2461482);
        map.put("palegoldenrod", -1120086);
        map.put("palegreen", -6751336);
        map.put("paleturquoise", -5247250);
        map.put("palevioletred", -2396013);
        map.put("papayawhip", -4139);
        map.put("peachpuff", -9543);
        map.put("peru", -3308225);
        map.put("pink", -16181);
        map.put("plum", -2252579);
        map.put("powderblue", -5185306);
        map.put("purple", -8388480);
        map.put("rebeccapurple", -10079335);
        map.put("red", -65536);
        map.put("rosybrown", -4419697);
        map.put("royalblue", -12490271);
        map.put("saddlebrown", -7650029);
        map.put("salmon", -360334);
        map.put("sandybrown", -744352);
        map.put("seagreen", -13726889);
        map.put("seashell", -2578);
        map.put("sienna", -6270419);
        map.put("silver", -4144960);
        map.put("skyblue", -7876885);
        map.put("slateblue", -9807155);
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        map.put("steelblue", -12156236);
        map.put("tan", -2968436);
        map.put("teal", -16744320);
        map.put("thistle", -2572328);
        map.put("tomato", -40121);
        map.put("transparent", 0);
        map.put("turquoise", -12525360);
        map.put("violet", -1146130);
        map.put("wheat", -663885);
        map.put("white", -1);
        map.put("whitesmoke", -657931);
        map.put("yellow", -256);
        map.put("yellowgreen", -6632142);
    }

    @ColorInt
    /* JADX INFO: renamed from: a */
    public static int m98157a(String str) {
        return m98159c(str, true);
    }

    @ColorInt
    /* JADX INFO: renamed from: b */
    public static int m98158b(String str) {
        return m98159c(str, false);
    }

    @ColorInt
    /* JADX INFO: renamed from: c */
    public static int m98159c(String str, boolean z) {
        int i;
        lev0.m153956d(!TextUtils.isEmpty(str));
        String strReplace = str.replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            fig0.m125680a();
            return 0;
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? f71585c : f71584b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f71583a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f71586d.get(wnw0.m207228a(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        fig0.m125680a();
        return 0;
    }
}
