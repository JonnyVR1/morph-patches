package p153l;

import com.p051p1.mobile.putong.data.Emotion;

/* JADX INFO: loaded from: classes13.dex */
public class uzh {

    /* JADX INFO: renamed from: a */
    public final boolean f181788a;

    /* JADX INFO: renamed from: b */
    public final Emotion f181789b;

    /* JADX INFO: renamed from: c */
    public final String f181790c;

    public uzh(boolean z, Emotion emotion, String str) {
        this.f181788a = z;
        this.f181789b = emotion;
        this.f181790c = str;
    }

    /* JADX INFO: renamed from: a */
    public String m198833a() {
        return this.f181790c;
    }

    /* JADX INFO: renamed from: b */
    public Emotion m198834b() {
        return this.f181789b;
    }

    /* JADX INFO: renamed from: c */
    public String m198835c() {
        Emotion emotion = this.f181789b;
        return emotion == null ? "" : emotion.emojiUrl;
    }

    /* JADX INFO: renamed from: d */
    public String m198836d() {
        Emotion emotion = this.f181789b;
        return emotion == null ? "" : emotion.text;
    }

    /* JADX INFO: renamed from: e */
    public boolean m198837e() {
        return this.f181788a;
    }
}
