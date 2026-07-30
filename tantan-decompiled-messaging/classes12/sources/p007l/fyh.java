package p007l;

import com.p000p1.mobile.putong.data.Emotion;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fyh {

    /* JADX INFO: renamed from: a */
    public final boolean f8273a;

    /* JADX INFO: renamed from: b */
    public final Emotion f8274b;

    /* JADX INFO: renamed from: c */
    public final String f8275c;

    public fyh(boolean z, Emotion emotion, String str) {
        this.f8273a = z;
        this.f8274b = emotion;
        this.f8275c = str;
    }

    /* JADX INFO: renamed from: a */
    public String m10327a() {
        return this.f8275c;
    }

    /* JADX INFO: renamed from: b */
    public Emotion m10328b() {
        return this.f8274b;
    }

    /* JADX INFO: renamed from: c */
    public String m10329c() {
        Emotion emotion = this.f8274b;
        return emotion == null ? "" : emotion.emojiUrl;
    }

    /* JADX INFO: renamed from: d */
    public String m10330d() {
        Emotion emotion = this.f8274b;
        return emotion == null ? "" : emotion.text;
    }

    /* JADX INFO: renamed from: e */
    public boolean m10331e() {
        return this.f8273a;
    }
}
