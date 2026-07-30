package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import p149l.vlq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.y */
/* JADX INFO: loaded from: classes2.dex */
public class C14884y {

    /* JADX INFO: renamed from: a */
    private static Object f63153a = new Object();

    /* JADX INFO: renamed from: a */
    private static Map<String, Queue<String>> f63154a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static boolean m86903a(XMPushService xMPushService, String str, String str2) {
        synchronized (f63153a) {
            try {
                SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
                Queue<String> queue = f63154a.get(str);
                if (queue == null) {
                    String[] strArrSplit = sharedPreferences.getString(str, "").split(Constants.SEPARATOR_COMMA);
                    LinkedList linkedList = new LinkedList();
                    for (String str3 : strArrSplit) {
                        linkedList.add(str3);
                    }
                    f63154a.put(str, linkedList);
                    queue = linkedList;
                }
                if (queue.contains(str2)) {
                    return true;
                }
                queue.add(str2);
                if (queue.size() > 25) {
                    queue.poll();
                }
                String strM198841d = vlq0.m198841d(queue, Constants.SEPARATOR_COMMA);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(str, strM198841d);
                editorEdit.commit();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
