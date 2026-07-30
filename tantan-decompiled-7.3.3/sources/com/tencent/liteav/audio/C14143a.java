package com.tencent.liteav.audio;

import com.tencent.liteav.basic.log.TXCLog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.liteav.audio.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14143a {

    /* JADX INFO: renamed from: a */
    private HashMap<String, HashSet<Integer>> f58833a;

    /* JADX INFO: renamed from: com.tencent.liteav.audio.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C14143a f58834a = new C14143a();
    }

    private C14143a() {
        this.f58833a = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public void m83850a(String str, int i) {
        HashSet<Integer> hashSet = this.f58833a.get(str);
        if (hashSet == null) {
            return;
        }
        hashSet.remove(Integer.valueOf(i));
        if (hashSet.isEmpty()) {
            this.f58833a.remove(str);
            TXCAudioEngine.getInstance().stopRemoteAudio(str);
            TXCLog.m84152i("AudioPlayManager", "stopRemoteAudio. tinyId:" + str + ", sessionId:" + i);
            return;
        }
        TXCLog.m84152i("AudioPlayManager", "ignore stopRemoteAudio. because the same user is playing in other session. tinyId:" + str + ", cur sessionId:" + i + ", other sessionId:" + hashSet.iterator().next().intValue());
    }

    /* JADX INFO: renamed from: a */
    public void m83851a(String str, boolean z, int i) {
        HashSet<Integer> hashSet = this.f58833a.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f58833a.put(str, hashSet);
        }
        hashSet.add(Integer.valueOf(i));
        TXCAudioEngine.getInstance().startRemoteAudio(str, z);
        TXCLog.m84152i("AudioPlayManager", "startRemoteAudio tinyId:" + str + ", sessionId:" + i);
    }

    /* JADX INFO: renamed from: a */
    public static C14143a m83848a() {
        return a.f58834a;
    }

    /* JADX INFO: renamed from: a */
    public void m83849a(int i) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, HashSet<Integer>> entry : this.f58833a.entrySet()) {
            String key = entry.getKey();
            HashSet<Integer> value = entry.getValue();
            value.remove(Integer.valueOf(i));
            if (value.isEmpty()) {
                hashSet.add(key);
                TXCAudioEngine.getInstance().stopRemoteAudio(key);
                TXCLog.m84152i("AudioPlayManager", "stopPlay, tinyId:" + key);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f58833a.remove((String) it.next());
        }
    }
}
