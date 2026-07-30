package p153l;

/* JADX INFO: loaded from: classes12.dex */
public class pu90 {
    /* JADX INFO: renamed from: a */
    public static String m173837a(String str) {
        str.getClass();
        switch (str) {
            case "boldFlavorLover":
                return "重口味爱好者";
            case "vegetarian":
                return "素食主义";
            case "meatLover":
                return "肉食主义";
            case "mildFlavorFan":
                return "清淡饮食";
            case "exoticFlavorLover":
                return "异域风情品鉴家";
            case "chineseFoodLover":
                return "中华料理狂热者";
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m173838b(String str) {
        str.getClass();
        switch (str) {
            case "重口味爱好者":
                return "boldFlavorLover";
            case "清淡饮食":
                return "mildFlavorFan";
            case "素食主义":
                return "vegetarian";
            case "肉食主义":
                return "meatLover";
            case "异域风情品鉴家":
                return "exoticFlavorLover";
            case "中华料理狂热者":
                return "chineseFoodLover";
            default:
                return null;
        }
    }
}
