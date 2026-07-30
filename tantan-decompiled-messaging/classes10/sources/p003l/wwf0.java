package p003l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.data.EmojiCacheData;
import com.p000p1.mobile.putong.core.data.EmojiCacheItem;
import com.p000p1.mobile.putong.core.data.Sticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.bqd0;
import l.e51;
import l.fpd0;
import l.mqi0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wwf0 {

    /* JADX INFO: renamed from: b */
    public static volatile wwf0 f8258b;

    /* JADX INFO: renamed from: a */
    public bqd0<EmojiCacheData> f8259a;

    /* JADX INFO: renamed from: l.wwf0$a */
    public class C3468a extends bqd0<EmojiCacheData> {
        public C3468a(String str, EmojiCacheData emojiCacheData) {
            super(str, emojiCacheData);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull EmojiCacheData emojiCacheData, EmojiCacheData emojiCacheData2) {
            return emojiCacheData.equals(emojiCacheData2);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EmojiCacheData copyed(EmojiCacheData emojiCacheData, @NonNull EmojiCacheData emojiCacheData2) {
            return emojiCacheData2.m12644clone();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public EmojiCacheData retrieveValue() {
            String string = pref().getString(((fpd0) this).id, null);
            Object obj = ((fpd0) this).defaultValue;
            return string == null ? (EmojiCacheData) obj : EmojiCacheData.parse(string, (EmojiCacheData) obj);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(EmojiCacheData emojiCacheData) {
            return pref().edit().putString(((fpd0) this).id, emojiCacheData.toJson());
        }
    }

    /* JADX INFO: renamed from: e */
    public static wwf0 m10596e() {
        if (f8258b == null) {
            synchronized (wwf0.class) {
                try {
                    if (f8258b == null) {
                        f8258b = new wwf0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8258b;
    }

    /* JADX INFO: renamed from: b */
    public final bqd0<EmojiCacheData> m10597b(String str) {
        return new C3468a(str, null);
    }

    /* JADX INFO: renamed from: c */
    public List<Sticker> m10598c(String str) {
        final EmojiCacheData emojiCacheData = (EmojiCacheData) m10596e().m10599d().get();
        if (!NullChecker.a(emojiCacheData)) {
            return null;
        }
        EmojiCacheItem emojiCacheItem = emojiCacheData.key.get(str);
        if (!NullChecker.a(emojiCacheItem)) {
            return null;
        }
        emojiCacheItem.useNumber = mqi0.o();
        e51.y(new Runnable() { // from class: l.vwf0
            @Override // java.lang.Runnable
            public final void run() {
                wwf0.m10596e().m10599d().put(emojiCacheData);
            }
        });
        return emojiCacheItem.dataList;
    }

    /* JADX INFO: renamed from: d */
    public bqd0<EmojiCacheData> m10599d() {
        if (this.f8259a == null) {
            this.f8259a = m10597b("emoji_cache_data_v3");
        }
        return this.f8259a;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m10600f(String str, List<Sticker> list) {
        try {
            if (!TextUtils.isEmpty(str) && !vwb.J(list)) {
                EmojiCacheData emojiCacheDataNew_ = (EmojiCacheData) m10596e().m10599d().get();
                int i = 0;
                if (list.size() > 8) {
                    list = list.subList(0, 8);
                }
                EmojiCacheItem emojiCacheItemNew_ = EmojiCacheItem.new_();
                emojiCacheItemNew_.dataList = list;
                emojiCacheItemNew_.useNumber = mqi0.o();
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
                m10596e().m10599d().put(emojiCacheDataNew_);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
