package p153l;

import com.p051p1.mobile.putong.data.CommonAssetsSettings;
import com.p051p1.mobile.putong.data.EmojiItem;
import com.p051p1.mobile.putong.data.EmojiType;
import com.tantanapp.common.data.JsonAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hj5 extends jf00<CommonAssetsSettings> {
    @Override // p153l.jf00
    /* JADX INFO: renamed from: i */
    public JsonAdapter<CommonAssetsSettings> mo135323i() {
        return CommonAssetsSettings.JSON_ADAPTER;
    }

    /* JADX INFO: renamed from: m */
    public List<EmojiType> m135324m() {
        return (List) m144644f(new qcj() { // from class: l.gj5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CommonAssetsSettings) obj).emoji;
            }
        }, null);
    }

    /* JADX INFO: renamed from: n */
    public String m135325n(String str) {
        List<EmojiType> listM135324m = m135324m();
        if (listM135324m == null) {
            return "";
        }
        Iterator<EmojiType> it = listM135324m.iterator();
        while (it.hasNext()) {
            for (EmojiItem emojiItem : it.next().items) {
                if (String.valueOf(emojiItem.f39595id).equals(str)) {
                    return emojiItem.url;
                }
            }
        }
        return "";
    }
}
