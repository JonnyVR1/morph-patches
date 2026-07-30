package com.p046p1.mobile.android.media;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.p1.mobile.android.media.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4323a {

    /* JADX INFO: renamed from: a */
    public List<a> f15597a;

    /* JADX INFO: renamed from: b */
    public AudioPlayer.State f15598b;

    /* JADX INFO: renamed from: c */
    public int f15599c;

    /* JADX INFO: renamed from: com.p1.mobile.android.media.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        default void m20738a(AudioPlayer.State state, @Nullable String str) {
        }

        /* JADX INFO: renamed from: b */
        void mo20739b(int i, Bundle bundle);

        /* JADX INFO: renamed from: c */
        void mo20740c(AudioPlayer.State state);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.a$b */
    public static final class b {
        private static final C4323a INSTANCE = new C4323a();
    }

    public C4323a() {
        this.f15597a = new ArrayList();
        this.f15598b = AudioPlayer.State.unknown;
        this.f15599c = -1;
    }

    /* JADX INFO: renamed from: a */
    public static C4323a m20731a() {
        return b.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public boolean m20732b() {
        return this.f15598b == AudioPlayer.State.playing;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20733c() {
        return this.f15599c == 0;
    }

    /* JADX INFO: renamed from: d */
    public void m20734d(AudioPlayer.State state, String str) {
        for (a aVar : this.f15597a) {
            aVar.mo20740c(state);
            aVar.m20738a(state, str);
        }
        this.f15598b = state;
    }

    /* JADX INFO: renamed from: e */
    public void m20735e(int i, Bundle bundle) {
        Iterator<a> it = this.f15597a.iterator();
        while (it.hasNext()) {
            it.next().mo20739b(i, bundle);
        }
        this.f15599c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m20736f(a aVar) {
        this.f15597a.add(aVar);
    }

    /* JADX INFO: renamed from: g */
    public void m20737g(a aVar) {
        this.f15597a.remove(aVar);
    }
}
