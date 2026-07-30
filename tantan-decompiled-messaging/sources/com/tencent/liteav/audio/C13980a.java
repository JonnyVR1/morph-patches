package com.tencent.liteav.audio;

import com.tencent.liteav.basic.log.TXCLog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.liteav.audio.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13980a {

    /* JADX INFO: renamed from: a */
    private HashMap<String, HashSet<Integer>> f57985a;

    /* JADX INFO: renamed from: com.tencent.liteav.audio.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C13980a f57986a = new C13980a();
    }

    private C13980a() {
        this.f57985a = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public void m82667a(String str, int i) {
        HashSet<Integer> hashSet = this.f57985a.get(str);
        if (hashSet == null) {
            return;
        }
        hashSet.remove(Integer.valueOf(i));
        if (hashSet.isEmpty()) {
            this.f57985a.remove(str);
            TXCAudioEngine.getInstance().stopRemoteAudio(str);
            TXCLog.m82969i("AudioPlayManager", "stopRemoteAudio. tinyId:" + str + ", sessionId:" + i);
            return;
        }
        TXCLog.m82969i("AudioPlayManager", "ignore stopRemoteAudio. because the same user is playing in other session. tinyId:" + str + ", cur sessionId:" + i + ", other sessionId:" + hashSet.iterator().next().intValue());
    }

    /* JADX INFO: renamed from: a */
    public void m82668a(String str, boolean z, int i) {
        HashSet<Integer> hashSet = this.f57985a.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f57985a.put(str, hashSet);
        }
        hashSet.add(Integer.valueOf(i));
        TXCAudioEngine.getInstance().startRemoteAudio(str, z);
        TXCLog.m82969i("AudioPlayManager", "startRemoteAudio tinyId:" + str + ", sessionId:" + i);
    }

    /* JADX INFO: renamed from: a */
    public static C13980a m82665a() {
        return a.f57986a;
    }

    /* JADX INFO: renamed from: a */
    public void m82666a(int i) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, HashSet<Integer>> entry : this.f57985a.entrySet()) {
            String key = entry.getKey();
            HashSet<Integer> value = entry.getValue();
            value.remove(Integer.valueOf(i));
            if (value.isEmpty()) {
                hashSet.add(key);
                TXCAudioEngine.getInstance().stopRemoteAudio(key);
                TXCLog.m82969i("AudioPlayManager", "stopPlay, tinyId:" + key);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f57985a.remove((String) it.next());
        }
    }
}
