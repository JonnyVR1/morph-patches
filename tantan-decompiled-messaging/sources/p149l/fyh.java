package p149l;

import com.p046p1.mobile.putong.data.Emotion;

/* JADX INFO: loaded from: classes12.dex */
public class fyh {

    /* JADX INFO: renamed from: a */
    public final boolean f99871a;

    /* JADX INFO: renamed from: b */
    public final Emotion f99872b;

    /* JADX INFO: renamed from: c */
    public final String f99873c;

    public fyh(boolean z, Emotion emotion, String str) {
        this.f99871a = z;
        this.f99872b = emotion;
        this.f99873c = str;
    }

    /* JADX INFO: renamed from: a */
    public String m123766a() {
        return this.f99873c;
    }

    /* JADX INFO: renamed from: b */
    public Emotion m123767b() {
        return this.f99872b;
    }

    /* JADX INFO: renamed from: c */
    public String m123768c() {
        Emotion emotion = this.f99872b;
        return emotion == null ? "" : emotion.emojiUrl;
    }

    /* JADX INFO: renamed from: d */
    public String m123769d() {
        Emotion emotion = this.f99872b;
        return emotion == null ? "" : emotion.text;
    }

    /* JADX INFO: renamed from: e */
    public boolean m123770e() {
        return this.f99871a;
    }
}
