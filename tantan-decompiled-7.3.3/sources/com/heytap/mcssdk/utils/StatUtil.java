package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushManager;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.mode.MessageStat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class StatUtil {
    private static final String COUNT = "count";
    private static final int MCS_SUPPORT_VERSION = 1017;
    private static final String STAT_LIST = "list";
    private static final String TYPE = "type";

    private static boolean isSupportStatisticByMcs(Context context) {
        String mcsPackageName = PushManager.getMcsPackageName(context);
        return Utils.isExistPackage(context, mcsPackageName) && Utils.getVersionCode(context, mcsPackageName) >= 1017;
    }

    public static void statisticMessage(Context context, List<MessageStat> list) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        LogUtil.m18542d("isSupportStatisticByMcs:" + isSupportStatisticByMcs(context) + ",list size:" + linkedList.size());
        if (linkedList.size() <= 0 || !isSupportStatisticByMcs(context)) {
            return;
        }
        statisticMessageByMcs(context, linkedList);
    }

    private static void statisticMessageByMcs(Context context, List<MessageStat> list) {
        try {
            Intent intent = new Intent();
            intent.setAction(PushManager.getReceiveSdkAction(context));
            intent.setPackage(PushManager.getMcsPackageName(context));
            intent.putExtra(Message.APP_PACKAGE, context.getPackageName());
            intent.putExtra("type", CommandMessage.COMMAND_STATISTIC);
            intent.putExtra(COUNT, list.size());
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<MessageStat> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toJsonObject());
            }
            intent.putStringArrayListExtra(STAT_LIST, arrayList);
            context.startService(intent);
        } catch (Exception e) {
            LogUtil.m18545e("statisticMessage--Exception" + e.getMessage());
        }
    }

    public static void statisticMessage(Context context, MessageStat messageStat) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(messageStat);
        statisticMessage(context, linkedList);
    }
}
