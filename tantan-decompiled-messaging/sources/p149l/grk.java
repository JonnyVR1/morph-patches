package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class grk {
    /* JADX INFO: renamed from: a */
    public static String m127714a(int i, String str) {
        switch (i) {
            case 1:
                return "你们都叫同一个昵称";
            case 2:
                return "ta和你同天生日";
            case 3:
                return "你们毕业于同所学校";
            case 4:
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return "你们都喜欢" + str;
            case 5:
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return "你们经常出没于：" + str;
            case 6:
                return "ta和你同岁同星座";
            case 7:
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return "你们都来自" + str;
            case 8:
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return "你们都是" + str + "后";
            case 9:
                return "ta和你同个星座";
            case 10:
                return "帅哥/美女这么多可ta偏偏喜欢了你";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m127715b(int i) {
        switch (i) {
            case 1:
                return "问问ta起这个昵称的来由吧～";
            case 2:
                return "问问ta能接受另一半的年龄段～";
            case 3:
                return "和ta聊聊学校里的趣事吧～";
            case 4:
                return "和ta聊聊你们的共同爱好吧～";
            case 5:
                return "快聊聊当地的美食吧～";
            case 6:
                return "百分之一的缘份还不打个招呼～";
            case 7:
                return "问问ta最喜欢吃的当地美食吧～";
            case 8:
                return "聊聊你们的童年趣事吧～";
            case 9:
                return "问问ta具体的生日日期吧～";
            case 10:
                return "快和ta打个招呼吧～";
            default:
                return "";
        }
    }
}
