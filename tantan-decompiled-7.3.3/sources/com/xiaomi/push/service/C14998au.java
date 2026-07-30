package com.xiaomi.push.service;

import com.xiaomi.push.C14901gs;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.push.service.au */
/* JADX INFO: loaded from: classes2.dex */
public class C14998au {
    /* JADX INFO: renamed from: a */
    public static C14901gs m87739a(C14901gs c14901gs) {
        Map<String, String> map;
        if (c14901gs != null && (map = c14901gs.f63034b) != null) {
            map.remove("score_info");
        }
        return c14901gs;
    }
}
