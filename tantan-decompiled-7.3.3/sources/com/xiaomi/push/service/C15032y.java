package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import p153l.bvq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.y */
/* JADX INFO: loaded from: classes2.dex */
public class C15032y {

    /* JADX INFO: renamed from: a */
    private static Object f64000a = new Object();

    /* JADX INFO: renamed from: a */
    private static Map<String, Queue<String>> f64001a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static boolean m88074a(XMPushService xMPushService, String str, String str2) {
        synchronized (f64000a) {
            try {
                SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
                Queue<String> queue = f64001a.get(str);
                if (queue == null) {
                    String[] strArrSplit = sharedPreferences.getString(str, "").split(Constants.SEPARATOR_COMMA);
                    LinkedList linkedList = new LinkedList();
                    for (String str3 : strArrSplit) {
                        linkedList.add(str3);
                    }
                    f64001a.put(str, linkedList);
                    queue = linkedList;
                }
                if (queue.contains(str2)) {
                    return true;
                }
                queue.add(str2);
                if (queue.size() > 25) {
                    queue.poll();
                }
                String strM106590d = bvq0.m106590d(queue, Constants.SEPARATOR_COMMA);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(str, strM106590d);
                editorEdit.commit();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
