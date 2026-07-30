package com.cosmos.photon.push.channel.inner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.cosmos.photon.push.channel.PushContentHelper;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.util.AppContext;
import p149l.ii5;

/* JADX INFO: loaded from: classes.dex */
public class ReceiverChannel extends BroadcastReceiver {
    private static ReceiverChannel sChannelReceiver;

    public static void registerChannelReceiver(String str) {
        unRegisterChannelReceiver();
        MDLog.m7395i(LogTag.CHANNEL, "registerChannelReceiver");
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.setPriority(1000);
        sChannelReceiver = new ReceiverChannel();
        if (Build.VERSION.SDK_INT >= 26) {
            AppContext.getContext().registerReceiver(sChannelReceiver, intentFilter, 2);
        } else {
            ii5.m136342l(AppContext.getContext(), sChannelReceiver, intentFilter);
        }
    }

    public static void sendChannelRequest(String str) {
        String packageName = AppContext.getContext().getPackageName();
        Intent intent = new Intent(str);
        intent.putExtra(ChannelConstant.Keys.KEY_PACKAGE, packageName);
        MDLog.m7396i(LogTag.CHANNEL, "sendBRChannelRequest %s", packageName);
        AppContext.getContext().sendBroadcast(intent);
    }

    public static void unRegisterChannelReceiver() {
        MDLog.m7395i(LogTag.CHANNEL, "unRegisterChannelReceiver");
        if (sChannelReceiver != null) {
            AppContext.getContext().unregisterReceiver(sChannelReceiver);
        }
        sChannelReceiver = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        try {
            stringExtra = intent.getStringExtra(ChannelConstant.Keys.KEY_PACKAGE);
        } catch (Exception unused) {
            stringExtra = "";
        }
        MDLog.m7396i(LogTag.CHANNEL, "BR onReceive packageName:%s", stringExtra);
        Bundle bundle = new Bundle();
        bundle.putString(ChannelConstant.Keys.KEY_PACKAGE, context.getPackageName());
        PushContentHelper.executeAction(stringExtra, ChannelConstant.Action.PROVIDER_CHANNEL_RECEIVE, bundle);
    }
}
