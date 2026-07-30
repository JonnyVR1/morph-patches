package p149l;

import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.EmojiAnimData;
import com.p046p1.mobile.putong.core.data.RecentEmojiData;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class pxe {

    /* JADX INFO: renamed from: a */
    public static volatile pxe f151666a;

    /* JADX INFO: renamed from: b */
    public static int f151667b = t100.m186890d(45.0f);

    /* JADX INFO: renamed from: c */
    public static int f151668c = t100.f167265n;

    /* JADX INFO: renamed from: d */
    public static List<String> f151669d = Arrays.asList("你好", "哈哈", "哈喽", "在干嘛", "在吗", "可爱");

    /* JADX INFO: renamed from: e */
    public static List<String> f151670e = Arrays.asList("你好", "哈喽", "在干嘛", "在吗", "可爱");

    /* JADX INFO: renamed from: f */
    public static List<String> f151671f = Arrays.asList("朕已阅", "嘻嘻", "可爱", "害羞", "你好");

    /* JADX INFO: renamed from: g */
    public static List<String> f151672g = Arrays.asList("你好", "在吗", "hi", "在干嘛", "哈喽");

    /* JADX INFO: renamed from: h */
    public static List<String> f151673h = Arrays.asList("你好", "开心", "hi", "哈喽");

    /* JADX INFO: renamed from: i */
    public static List<String> f151674i = Arrays.asList("你好", "在吗", "在干嘛", "哈喽");

    /* JADX INFO: renamed from: l.pxe$a */
    public class C19360a extends bqd0<EmojiAnimData> {
        public C19360a(String str, EmojiAnimData emojiAnimData) {
            super(str, emojiAnimData);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull EmojiAnimData emojiAnimData, EmojiAnimData emojiAnimData2) {
            return emojiAnimData.equals(emojiAnimData2);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EmojiAnimData copyed(EmojiAnimData emojiAnimData, @NonNull EmojiAnimData emojiAnimData2) {
            return emojiAnimData2.mo223809clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.fpd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public EmojiAnimData retrieveValue() {
            String string = pref().getString(this.f98687id, null);
            T t = this.defaultValue;
            return string == null ? (EmojiAnimData) t : EmojiAnimData.parse(string, (EmojiAnimData) t);
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(EmojiAnimData emojiAnimData) {
            return pref().edit().putString(this.f98687id, emojiAnimData.toJson());
        }
    }

    /* JADX INFO: renamed from: l.pxe$b */
    public class C19361b extends bqd0<RecentEmojiData> {
        public C19361b(String str, RecentEmojiData recentEmojiData) {
            super(str, recentEmojiData);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull RecentEmojiData recentEmojiData, RecentEmojiData recentEmojiData2) {
            return recentEmojiData.equals(recentEmojiData2);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RecentEmojiData copyed(RecentEmojiData recentEmojiData, @NonNull RecentEmojiData recentEmojiData2) {
            return recentEmojiData2.mo223809clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.fpd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public RecentEmojiData retrieveValue() {
            String string = pref().getString(this.f98687id, null);
            T t = this.defaultValue;
            return string == null ? (RecentEmojiData) t : RecentEmojiData.parse(string, (RecentEmojiData) t);
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(RecentEmojiData recentEmojiData) {
            return pref().edit().putString(this.f98687id, recentEmojiData.toJson());
        }
    }

    /* JADX INFO: renamed from: c */
    public static pxe m171835c() {
        if (f151666a == null) {
            synchronized (pxe.class) {
                try {
                    if (f151666a == null) {
                        f151666a = new pxe();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f151666a;
    }

    /* JADX INFO: renamed from: e */
    public static SpannableStringBuilder m171836e(SpannableStringBuilder spannableStringBuilder, int i) {
        Matcher matcher = Pattern.compile("\\[([^\\[\\]]*)]").matcher(spannableStringBuilder);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            int iStart = matcher.start(1);
            int iEnd = matcher.end(1);
            if (kye.f125284i.contains(strGroup)) {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i), iStart - 1, iEnd + 1, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f */
    public static String m171837f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile("\\[([^\\[\\]]*)]").matcher(str);
        boolean z = false;
        String str2 = "";
        boolean z2 = false;
        while (true) {
            if (!matcher.find()) {
                z = z2;
                break;
            }
            String strGroup = matcher.group(1);
            if (kye.f125284i.contains(strGroup)) {
                if (TextUtils.isEmpty(str2)) {
                    z2 = true;
                    str2 = strGroup;
                } else if (!TextUtils.equals(strGroup, str2)) {
                    break;
                }
            }
        }
        return (z && str.contains(String.format("[%s][%s][%s]", str2, str2, str2))) ? str2 : "";
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<kye.C18115a> m171838a() {
        ArrayList<kye.C18115a> arrayList = new ArrayList<>();
        new ArrayList();
        ArrayList<kye.C18115a> arrayList2 = CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? kye.f125280e : kye.f125281f;
        kye.C18115a c18115a = new kye.C18115a("recently_text_tag_type", 0, 0, 0);
        kye.C18115a c18115a2 = new kye.C18115a("all_text_tag_type", 0, 0, 0);
        RecentEmojiData recentEmojiDataM171841g = m171835c().m171841g();
        if (NullChecker.m81303a(recentEmojiDataM171841g) && !vwb.m200296J(recentEmojiDataM171841g.identifierList)) {
            arrayList.add(c18115a);
            if (recentEmojiDataM171841g.identifierList.size() > 7) {
                recentEmojiDataM171841g.identifierList = recentEmojiDataM171841g.identifierList.subList(0, 7);
            }
            Iterator<String> it = recentEmojiDataM171841g.identifierList.iterator();
            while (it.hasNext()) {
                arrayList.add(kye.f125282g.get(it.next()));
            }
            arrayList.add(c18115a2);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public EmojiAnimData m171839b() {
        if (qib0.f154714c0.signedIn_()) {
            User userMe_ = qib0.f154714c0.me_();
            if (NullChecker.m81303a(userMe_)) {
                EmojiAnimData emojiAnimData = m171843i("tantan_emoji_full_screen_anim_data_" + userMe_.f56011id).get();
                if (NullChecker.m81303a(emojiAnimData)) {
                    return emojiAnimData;
                }
            }
        }
        EmojiAnimData emojiAnimDataNew_ = EmojiAnimData.new_();
        emojiAnimDataNew_.emojiAnimCreatedTime = new HashMap();
        return emojiAnimDataNew_;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<kye.C18115a> m171840d() {
        ArrayList<kye.C18115a> arrayList = new ArrayList<>();
        if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            arrayList.addAll(kye.f125280e);
            return arrayList;
        }
        arrayList.addAll(kye.f125281f);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public RecentEmojiData m171841g() {
        if (!qib0.f154714c0.signedIn_()) {
            return null;
        }
        User userMe_ = qib0.f154714c0.me_();
        if (!NullChecker.m81303a(userMe_)) {
            return null;
        }
        return m171842h("tantan_recent_emoji_data_" + userMe_.f56011id).get();
    }

    /* JADX INFO: renamed from: h */
    public final bqd0<RecentEmojiData> m171842h(String str) {
        return new C19361b(str, null);
    }

    /* JADX INFO: renamed from: i */
    public final bqd0<EmojiAnimData> m171843i(String str) {
        return new C19360a(str, null);
    }

    /* JADX INFO: renamed from: j */
    public void m171844j(EmojiAnimData emojiAnimData) {
        if (qib0.f154714c0.signedIn_()) {
            User userMe_ = qib0.f154714c0.me_();
            if (NullChecker.m81303a(userMe_)) {
                if (NullChecker.m81303a(emojiAnimData)) {
                    m171843i("tantan_emoji_full_screen_anim_data_" + userMe_.f56011id).put(emojiAnimData);
                } else {
                    m171843i("tantan_emoji_full_screen_anim_data_" + userMe_.f56011id).clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m171845k(RecentEmojiData recentEmojiData) {
        if (qib0.f154714c0.signedIn_()) {
            User userMe_ = qib0.f154714c0.me_();
            if (NullChecker.m81303a(userMe_)) {
                if (NullChecker.m81303a(recentEmojiData)) {
                    m171842h("tantan_recent_emoji_data_" + userMe_.f56011id).put(recentEmojiData);
                } else {
                    m171842h("tantan_recent_emoji_data_" + userMe_.f56011id).clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m171846l(String str) {
        RecentEmojiData recentEmojiDataM171841g = m171841g();
        if (!NullChecker.m81303a(recentEmojiDataM171841g) || vwb.m200296J(recentEmojiDataM171841g.identifierList)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            RecentEmojiData recentEmojiDataNew_ = RecentEmojiData.new_();
            recentEmojiDataNew_.identifierList = arrayList;
            m171845k(recentEmojiDataNew_);
            return;
        }
        if (recentEmojiDataM171841g.identifierList.contains(str)) {
            recentEmojiDataM171841g.identifierList.remove(str);
        }
        recentEmojiDataM171841g.identifierList.add(0, str);
        if (recentEmojiDataM171841g.identifierList.size() > 7) {
            recentEmojiDataM171841g.identifierList = recentEmojiDataM171841g.identifierList.subList(0, 7);
        }
        m171845k(recentEmojiDataM171841g);
    }
}
