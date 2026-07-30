package p149l;

import com.p046p1.mobile.putong.data.CommonAssetsSettings;
import com.p046p1.mobile.putong.data.EmojiItem;
import com.p046p1.mobile.putong.data.EmojiType;
import com.tantanapp.common.data.JsonAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class gi5 extends a700<CommonAssetsSettings> {
    @Override // p149l.a700
    /* JADX INFO: renamed from: i */
    public JsonAdapter<CommonAssetsSettings> mo95179i() {
        return CommonAssetsSettings.JSON_ADAPTER;
    }

    /* JADX INFO: renamed from: m */
    public List<EmojiType> m126253m() {
        return (List) m95176f(new w9j() { // from class: l.fi5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CommonAssetsSettings) obj).emoji;
            }
        }, null);
    }

    /* JADX INFO: renamed from: n */
    public String m126254n(String str) {
        List<EmojiType> listM126253m = m126253m();
        if (listM126253m == null) {
            return "";
        }
        Iterator<EmojiType> it = listM126253m.iterator();
        while (it.hasNext()) {
            for (EmojiItem emojiItem : it.next().items) {
                if (String.valueOf(emojiItem.f38747id).equals(str)) {
                    return emojiItem.url;
                }
            }
        }
        return "";
    }
}
