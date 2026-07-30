package p006l;

import com.p1.mobile.putong.data.CommonAssetsSettings;
import com.p1.mobile.putong.data.EmojiItem;
import com.p1.mobile.putong.data.EmojiType;
import com.tantanapp.common.data.JsonAdapter;
import java.util.Iterator;
import java.util.List;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gi5 extends a700<CommonAssetsSettings> {
    @Override // p006l.a700
    /* JADX INFO: renamed from: i */
    public JsonAdapter<CommonAssetsSettings> mo11769i() {
        return CommonAssetsSettings.JSON_ADAPTER;
    }

    /* JADX INFO: renamed from: m */
    public List<EmojiType> m15798m() {
        return (List) m11766f(new w9j() { // from class: l.fi5
            public final Object call(Object obj) {
                return ((CommonAssetsSettings) obj).emoji;
            }
        }, null);
    }

    /* JADX INFO: renamed from: n */
    public String m15799n(String str) {
        List<EmojiType> listM15798m = m15798m();
        if (listM15798m == null) {
            return "";
        }
        Iterator<EmojiType> it = listM15798m.iterator();
        while (it.hasNext()) {
            for (EmojiItem emojiItem : it.next().items) {
                if (String.valueOf(emojiItem.id).equals(str)) {
                    return emojiItem.url;
                }
            }
        }
        return "";
    }
}
