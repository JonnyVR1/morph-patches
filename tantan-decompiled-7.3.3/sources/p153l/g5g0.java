package p153l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.EmojiCacheData;
import com.p051p1.mobile.putong.core.data.EmojiCacheItem;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class g5g0 {

    /* JADX INFO: renamed from: b */
    public static volatile g5g0 f102326b;

    /* JADX INFO: renamed from: a */
    public dyd0<EmojiCacheData> f102327a;

    /* JADX INFO: renamed from: l.g5g0$a */
    public class C17159a extends dyd0<EmojiCacheData> {
        public C17159a(String str, EmojiCacheData emojiCacheData) {
            super(str, emojiCacheData);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull EmojiCacheData emojiCacheData, EmojiCacheData emojiCacheData2) {
            return emojiCacheData.equals(emojiCacheData2);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EmojiCacheData copyed(EmojiCacheData emojiCacheData, @NonNull EmojiCacheData emojiCacheData2) {
            return emojiCacheData2.mo225055clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.hxd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public EmojiCacheData retrieveValue() {
            String string = pref().getString(this.f111993id, null);
            T t = this.defaultValue;
            return string == null ? (EmojiCacheData) t : EmojiCacheData.parse(string, (EmojiCacheData) t);
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(EmojiCacheData emojiCacheData) {
            return pref().edit().putString(this.f111993id, emojiCacheData.toJson());
        }
    }

    /* JADX INFO: renamed from: e */
    public static g5g0 m129056e() {
        if (f102326b == null) {
            synchronized (g5g0.class) {
                try {
                    if (f102326b == null) {
                        f102326b = new g5g0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f102326b;
    }

    /* JADX INFO: renamed from: b */
    public final dyd0<EmojiCacheData> m129057b(String str) {
        return new C17159a(str, null);
    }

    /* JADX INFO: renamed from: c */
    public List<Sticker> m129058c(String str) {
        final EmojiCacheData emojiCacheData = m129056e().m129059d().get();
        if (!NullChecker.m82486a(emojiCacheData)) {
            return null;
        }
        EmojiCacheItem emojiCacheItem = emojiCacheData.key.get(str);
        if (!NullChecker.m82486a(emojiCacheItem)) {
            return null;
        }
        emojiCacheItem.useNumber = pzi0.m174454o();
        l51.m152919y(new Runnable() { // from class: l.f5g0
            @Override // java.lang.Runnable
            public final void run() {
                g5g0.m129056e().m129059d().put(emojiCacheData);
            }
        });
        return emojiCacheItem.dataList;
    }

    /* JADX INFO: renamed from: d */
    public dyd0<EmojiCacheData> m129059d() {
        if (this.f102327a == null) {
            this.f102327a = m129057b("emoji_cache_data_v3");
        }
        return this.f102327a;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m129060f(String str, List<Sticker> list) {
        try {
            if (!TextUtils.isEmpty(str) && !jyb.m147479J(list)) {
                EmojiCacheData emojiCacheDataNew_ = m129056e().m129059d().get();
                int i = 0;
                if (list.size() > 8) {
                    list = list.subList(0, 8);
                }
                EmojiCacheItem emojiCacheItemNew_ = EmojiCacheItem.new_();
                emojiCacheItemNew_.dataList = list;
                emojiCacheItemNew_.useNumber = pzi0.m174454o();
                if (emojiCacheDataNew_ == null) {
                    emojiCacheDataNew_ = EmojiCacheData.new_();
                    emojiCacheDataNew_.key = new ConcurrentHashMap();
                }
                int size = emojiCacheDataNew_.key.size();
                if (size >= 20) {
                    long[] jArr = new long[size];
                    Iterator<Map.Entry<String, EmojiCacheItem>> it = emojiCacheDataNew_.key.entrySet().iterator();
                    while (it.hasNext()) {
                        jArr[i] = it.next().getValue().useNumber;
                        i++;
                    }
                    Arrays.sort(jArr);
                    long j = jArr[size / 2];
                    Map<String, EmojiCacheItem> map = emojiCacheDataNew_.key;
                    Iterator<Map.Entry<String, EmojiCacheItem>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getValue().useNumber <= j) {
                            it2.remove();
                        }
                    }
                    emojiCacheDataNew_.key = map;
                }
                emojiCacheDataNew_.key.put(str, emojiCacheItemNew_);
                m129056e().m129059d().put(emojiCacheDataNew_);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
