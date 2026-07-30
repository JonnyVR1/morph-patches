package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class wao0 {

    /* JADX INFO: renamed from: f */
    public static int f188144f = 0;

    /* JADX INFO: renamed from: g */
    public static int f188145g = 1;

    /* JADX INFO: renamed from: a */
    public int f188146a;

    /* JADX INFO: renamed from: b */
    public long f188147b = System.currentTimeMillis();

    /* JADX INFO: renamed from: c */
    public String f188148c;

    /* JADX INFO: renamed from: d */
    public List<VoiceMicEmoji.EmojiPlayResult> f188149d;

    /* JADX INFO: renamed from: e */
    public String f188150e;

    public wao0(List<VoiceMicEmoji.EmojiPlayResult> list, String str, int i, String str2) {
        this.f188149d = list;
        this.f188146a = i;
        this.f188148c = str;
        this.f188150e = str2;
    }

    /* JADX INFO: renamed from: a */
    public long m205661a() {
        return this.f188147b;
    }

    /* JADX INFO: renamed from: b */
    public int m205662b() {
        return this.f188146a;
    }

    /* JADX INFO: renamed from: c */
    public long m205663c() {
        if (this.f188149d.size() <= 0) {
            return 3L;
        }
        int i = this.f188146a;
        int i2 = f188144f;
        List<VoiceMicEmoji.EmojiPlayResult> list = this.f188149d;
        return i == i2 ? list.get(0).getLoadingDurationS() : list.get(0).getResultShowDurationS();
    }

    /* JADX INFO: renamed from: d */
    public List<VoiceMicEmoji.EmojiPlayResult> m205664d() {
        return this.f188149d;
    }

    /* JADX INFO: renamed from: e */
    public String m205665e() {
        return this.f188148c;
    }

    /* JADX INFO: renamed from: f */
    public long m205666f() {
        if (this.f188149d.size() > 0) {
            return this.f188149d.get(0).getResultShowDurationS();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m205667g() {
        return "emojiRandomTripleDice".equals(this.f188148c) && this.f188149d.size() >= 3;
    }

    /* JADX INFO: renamed from: h */
    public boolean m205668h() {
        if (m205667g()) {
            return true;
        }
        return this.f188149d.size() > 0 && !TextUtils.isEmpty(this.f188149d.get(0).getContentPic());
    }

    /* JADX INFO: renamed from: i */
    public void m205669i(long j) {
        this.f188147b = j;
    }

    /* JADX INFO: renamed from: j */
    public void m205670j(int i) {
        this.f188146a = i;
    }

    public String toString() {
        return "VoiceMicEmojiUserInfo{, currentState=" + this.f188146a + ", emojiType='" + this.f188148c + "', emojiResult=" + this.f188149d + '}';
    }
}
