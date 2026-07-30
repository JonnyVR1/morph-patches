package p149l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.EmojiCacheData;
import com.p046p1.mobile.putong.core.data.EmojiCacheItem;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class wwf0 {

    /* JADX INFO: renamed from: b */
    public static volatile wwf0 f188368b;

    /* JADX INFO: renamed from: a */
    public bqd0<EmojiCacheData> f188369a;

    /* JADX INFO: renamed from: l.wwf0$a */
    public class C20985a extends bqd0<EmojiCacheData> {
        public C20985a(String str, EmojiCacheData emojiCacheData) {
            super(str, emojiCacheData);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull EmojiCacheData emojiCacheData, EmojiCacheData emojiCacheData2) {
            return emojiCacheData.equals(emojiCacheData2);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EmojiCacheData copyed(EmojiCacheData emojiCacheData, @NonNull EmojiCacheData emojiCacheData2) {
            return emojiCacheData2.mo223809clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.fpd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public EmojiCacheData retrieveValue() {
            String string = pref().getString(this.f98687id, null);
            T t = this.defaultValue;
            return string == null ? (EmojiCacheData) t : EmojiCacheData.parse(string, (EmojiCacheData) t);
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(EmojiCacheData emojiCacheData) {
            return pref().edit().putString(this.f98687id, emojiCacheData.toJson());
        }
    }

    /* JADX INFO: renamed from: e */
    public static wwf0 m205859e() {
        if (f188368b == null) {
            synchronized (wwf0.class) {
                try {
                    if (f188368b == null) {
                        f188368b = new wwf0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f188368b;
    }

    /* JADX INFO: renamed from: b */
    public final bqd0<EmojiCacheData> m205860b(String str) {
        return new C20985a(str, null);
    }

    /* JADX INFO: renamed from: c */
    public List<Sticker> m205861c(String str) {
        final EmojiCacheData emojiCacheData = m205859e().m205862d().get();
        if (!NullChecker.m81303a(emojiCacheData)) {
            return null;
        }
        EmojiCacheItem emojiCacheItem = emojiCacheData.key.get(str);
        if (!NullChecker.m81303a(emojiCacheItem)) {
            return null;
        }
        emojiCacheItem.useNumber = mqi0.m155944o();
        e51.m114774y(new Runnable() { // from class: l.vwf0
            @Override // java.lang.Runnable
            public final void run() {
                wwf0.m205859e().m205862d().put(emojiCacheData);
            }
        });
        return emojiCacheItem.dataList;
    }

    /* JADX INFO: renamed from: d */
    public bqd0<EmojiCacheData> m205862d() {
        if (this.f188369a == null) {
            this.f188369a = m205860b("emoji_cache_data_v3");
        }
        return this.f188369a;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m205863f(String str, List<Sticker> list) {
        try {
            if (!TextUtils.isEmpty(str) && !vwb.m200296J(list)) {
                EmojiCacheData emojiCacheDataNew_ = m205859e().m205862d().get();
                int i = 0;
                if (list.size() > 8) {
                    list = list.subList(0, 8);
                }
                EmojiCacheItem emojiCacheItemNew_ = EmojiCacheItem.new_();
                emojiCacheItemNew_.dataList = list;
                emojiCacheItemNew_.useNumber = mqi0.m155944o();
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
                m205859e().m205862d().put(emojiCacheDataNew_);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
