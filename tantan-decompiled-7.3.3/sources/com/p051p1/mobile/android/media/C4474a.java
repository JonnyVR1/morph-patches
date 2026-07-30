package com.p051p1.mobile.android.media;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.p1.mobile.android.media.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4474a {

    /* JADX INFO: renamed from: a */
    public List<a> f16316a;

    /* JADX INFO: renamed from: b */
    public AudioPlayer.State f16317b;

    /* JADX INFO: renamed from: c */
    public int f16318c;

    /* JADX INFO: renamed from: com.p1.mobile.android.media.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        default void m21737a(AudioPlayer.State state, @Nullable String str) {
        }

        /* JADX INFO: renamed from: b */
        void mo21738b(int i, Bundle bundle);

        /* JADX INFO: renamed from: c */
        void mo21739c(AudioPlayer.State state);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.a$b */
    public static final class b {
        private static final C4474a INSTANCE = new C4474a();
    }

    public C4474a() {
        this.f16316a = new ArrayList();
        this.f16317b = AudioPlayer.State.unknown;
        this.f16318c = -1;
    }

    /* JADX INFO: renamed from: a */
    public static C4474a m21730a() {
        return b.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21731b() {
        return this.f16317b == AudioPlayer.State.playing;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21732c() {
        return this.f16318c == 0;
    }

    /* JADX INFO: renamed from: d */
    public void m21733d(AudioPlayer.State state, String str) {
        for (a aVar : this.f16316a) {
            aVar.mo21739c(state);
            aVar.m21737a(state, str);
        }
        this.f16317b = state;
    }

    /* JADX INFO: renamed from: e */
    public void m21734e(int i, Bundle bundle) {
        Iterator<a> it = this.f16316a.iterator();
        while (it.hasNext()) {
            it.next().mo21738b(i, bundle);
        }
        this.f16318c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m21735f(a aVar) {
        this.f16316a.add(aVar);
    }

    /* JADX INFO: renamed from: g */
    public void m21736g(a aVar) {
        this.f16316a.remove(aVar);
    }
}
