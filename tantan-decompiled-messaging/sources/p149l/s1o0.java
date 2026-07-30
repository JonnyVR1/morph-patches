package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class s1o0 {

    /* JADX INFO: renamed from: f */
    public static int f161919f = 0;

    /* JADX INFO: renamed from: g */
    public static int f161920g = 1;

    /* JADX INFO: renamed from: a */
    public int f161921a;

    /* JADX INFO: renamed from: b */
    public long f161922b = System.currentTimeMillis();

    /* JADX INFO: renamed from: c */
    public String f161923c;

    /* JADX INFO: renamed from: d */
    public List<VoiceMicEmoji.EmojiPlayResult> f161924d;

    /* JADX INFO: renamed from: e */
    public String f161925e;

    public s1o0(List<VoiceMicEmoji.EmojiPlayResult> list, String str, int i, String str2) {
        this.f161924d = list;
        this.f161921a = i;
        this.f161923c = str;
        this.f161925e = str2;
    }

    /* JADX INFO: renamed from: a */
    public long m182011a() {
        return this.f161922b;
    }

    /* JADX INFO: renamed from: b */
    public int m182012b() {
        return this.f161921a;
    }

    /* JADX INFO: renamed from: c */
    public long m182013c() {
        if (this.f161924d.size() <= 0) {
            return 3L;
        }
        int i = this.f161921a;
        int i2 = f161919f;
        List<VoiceMicEmoji.EmojiPlayResult> list = this.f161924d;
        return i == i2 ? list.get(0).getLoadingDurationS() : list.get(0).getResultShowDurationS();
    }

    /* JADX INFO: renamed from: d */
    public List<VoiceMicEmoji.EmojiPlayResult> m182014d() {
        return this.f161924d;
    }

    /* JADX INFO: renamed from: e */
    public String m182015e() {
        return this.f161923c;
    }

    /* JADX INFO: renamed from: f */
    public long m182016f() {
        if (this.f161924d.size() > 0) {
            return this.f161924d.get(0).getResultShowDurationS();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m182017g() {
        return "emojiRandomTripleDice".equals(this.f161923c) && this.f161924d.size() >= 3;
    }

    /* JADX INFO: renamed from: h */
    public boolean m182018h() {
        if (m182017g()) {
            return true;
        }
        return this.f161924d.size() > 0 && !TextUtils.isEmpty(this.f161924d.get(0).getContentPic());
    }

    /* JADX INFO: renamed from: i */
    public void m182019i(long j) {
        this.f161922b = j;
    }

    /* JADX INFO: renamed from: j */
    public void m182020j(int i) {
        this.f161921a = i;
    }

    public String toString() {
        return "VoiceMicEmojiUserInfo{, currentState=" + this.f161921a + ", emojiType='" + this.f161923c + "', emojiResult=" + this.f161924d + '}';
    }
}
