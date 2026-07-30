package com.p003p1.mobile.android.media;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.p1.mobile.android.media.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0235a {

    /* JADX INFO: renamed from: a */
    public List<a> f1296a;

    /* JADX INFO: renamed from: b */
    public AudioPlayer.State f1297b;

    /* JADX INFO: renamed from: c */
    public int f1298c;

    /* JADX INFO: renamed from: com.p1.mobile.android.media.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        default void m1009a(AudioPlayer.State state, @Nullable String str) {
        }

        /* JADX INFO: renamed from: b */
        void m1010b(int i, Bundle bundle);

        /* JADX INFO: renamed from: c */
        void m1011c(AudioPlayer.State state);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.a$b */
    public static final class b {
        private static final C0235a INSTANCE = new C0235a();
    }

    public C0235a() {
        this.f1296a = new ArrayList();
        this.f1297b = AudioPlayer.State.unknown;
        this.f1298c = -1;
    }

    /* JADX INFO: renamed from: a */
    public static C0235a m1002a() {
        return b.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1003b() {
        return this.f1297b == AudioPlayer.State.playing;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1004c() {
        return this.f1298c == 0;
    }

    /* JADX INFO: renamed from: d */
    public void m1005d(AudioPlayer.State state, String str) {
        for (a aVar : this.f1296a) {
            aVar.m1011c(state);
            aVar.m1009a(state, str);
        }
        this.f1297b = state;
    }

    /* JADX INFO: renamed from: e */
    public void m1006e(int i, Bundle bundle) {
        Iterator<a> it = this.f1296a.iterator();
        while (it.hasNext()) {
            it.next().m1010b(i, bundle);
        }
        this.f1298c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m1007f(a aVar) {
        this.f1296a.add(aVar);
    }

    /* JADX INFO: renamed from: g */
    public void m1008g(a aVar) {
        this.f1296a.remove(aVar);
    }
}
