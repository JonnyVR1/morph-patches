package com.cosmos.photon.push;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.cosmos.photon.push.channel.inner.ClientWorker;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.msg.MoMessage;
import com.cosmos.photon.push.notification.MoNotify;
import com.cosmos.photon.push.statistic.EventLogBody;
import com.cosmos.photon.push.statistic.PushEventStatistic;
import com.cosmos.photon.push.util.AppContext;

/* JADX INFO: loaded from: classes.dex */
public class MoPushProvider extends ContentProvider {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        MoNotify moNotifyFromJson;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!PhotonPushManager.isInit()) {
            try {
                Thread.sleep(100L);
                if (Math.abs(System.currentTimeMillis() - jCurrentTimeMillis) > 3000) {
                    break;
                }
            } catch (InterruptedException unused) {
            }
        }
        MDLog.m7396i(LogTag.CHANNEL, "method:%s arg:%s extras:%s", str, str2, bundle);
        str.getClass();
        switch (str) {
            case "channel_receive":
                if (bundle != null) {
                    try {
                        ClientWorker.onReceiver(bundle.getString(ChannelConstant.Keys.KEY_PACKAGE));
                    } catch (Throwable th) {
                        MDLog.printErrStackTrace(LogTag.CHANNEL, th);
                    }
                }
                return null;
            case "channel_push":
                if (bundle != null) {
                    try {
                        int i = bundle.getInt(ChannelConstant.Keys.KEY_PUSH_DATA_TYPE);
                        if (i == 1) {
                            try {
                                moNotifyFromJson = (MoNotify) bundle.getSerializable(ChannelConstant.Keys.KEY_PUSH_DATA);
                            } catch (Throwable th2) {
                                MDLog.printErrStackTrace(LogTag.CHANNEL, th2);
                                try {
                                    String string = bundle.getString(ChannelConstant.Keys.KEY_PUSH_JSON_DATA, null);
                                    moNotifyFromJson = !TextUtils.isEmpty(string) ? MoNotify.fromJson(string) : null;
                                } catch (Throwable unused2) {
                                    moNotifyFromJson = null;
                                }
                                if (moNotifyFromJson == null) {
                                    return null;
                                }
                            }
                            break;
                        } else if (i == 0) {
                            try {
                                moNotifyFromJson = MoNotify.fromJson(bundle.getString(ChannelConstant.Keys.KEY_PUSH_DATA));
                            } catch (Throwable th3) {
                                MDLog.printErrStackTrace(LogTag.CHANNEL, th3);
                                return null;
                            }
                        } else {
                            moNotifyFromJson = null;
                        }
                        if (moNotifyFromJson != null) {
                            Bundle bundle2 = new Bundle();
                            if (AppContext.getContext() != null) {
                                bundle2.putBoolean(ChannelConstant.Keys.KEY_RESULT, true);
                                if (PhotonPushManager.messageReceiver.onNotificationShow(moNotifyFromJson)) {
                                    EventLogBody.Builder builder = new EventLogBody.Builder();
                                    builder.pushSource("push:self").time(moNotifyFromJson.time).data(moNotifyFromJson.data).uploadType(moNotifyFromJson.logType).type(EventLogBody.TYPE_ARRIVED_NOT_SHOWN).reason(7);
                                    PushEventStatistic.logPushEventInfo(builder.build());
                                } else {
                                    DataProcessor.onPushArrivedInner(moNotifyFromJson);
                                }
                            }
                            return bundle2;
                        }
                    } catch (Throwable th4) {
                        MDLog.printErrStackTrace(LogTag.CHANNEL, th4);
                        return null;
                    }
                }
                return null;
            case "channel_msg":
                if (bundle != null) {
                    try {
                        MoMessage moMessage = (MoMessage) bundle.getSerializable(ChannelConstant.Keys.KEY_MSG_DATA);
                        if (moMessage != null) {
                            Bundle bundle3 = new Bundle();
                            if (AppContext.getContext() == null) {
                                return bundle3;
                            }
                            bundle3.putBoolean(ChannelConstant.Keys.KEY_RESULT, true);
                            DataProcessor.onMsgArrivedInner(moMessage);
                            EventLogBody.Builder builder2 = new EventLogBody.Builder();
                            builder2.pushSource("push:self").time(moMessage.time).data(moMessage.data).uploadType(moMessage.logType).type(EventLogBody.TYPE_ARRIVED);
                            PushEventStatistic.logPushEventInfo(builder2.build());
                            return bundle3;
                        }
                    } catch (Exception e) {
                        MDLog.printErrStackTrace(LogTag.CHANNEL, e);
                        return null;
                    }
                }
                return null;
            default:
                return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
