package p153l;

import androidx.datastore.preferences.protobuf.C0330f0;

/* JADX INFO: loaded from: classes.dex */
public final class w130 {

    /* JADX INFO: renamed from: a */
    public static final v130 f186758a = m204379c();

    /* JADX INFO: renamed from: b */
    public static final v130 f186759b = new C0330f0();

    /* JADX INFO: renamed from: a */
    public static v130 m204377a() {
        return f186758a;
    }

    /* JADX INFO: renamed from: b */
    public static v130 m204378b() {
        return f186759b;
    }

    /* JADX INFO: renamed from: c */
    public static v130 m204379c() {
        try {
            return (v130) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
