package com.heytap.mcssdk;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.callback.MessageCallback;
import com.heytap.mcssdk.callback.PushCallback;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.p034a.AbstractC3457c;
import com.heytap.mcssdk.p035b.InterfaceC3463c;
import com.heytap.mcssdk.utils.LogUtil;
import com.heytap.mcssdk.utils.Utils;

/* JADX INFO: loaded from: classes7.dex */
public class PushParseHelper {
    public static void parseCommandMessage(Context context, CommandMessage commandMessage, PushManager pushManager) {
        if (context == null) {
            LogUtil.m17468e("context is null , please check param of parseCommandMessage(2)");
        }
        if (commandMessage == null) {
            LogUtil.m17468e("message is null , please check param of parseCommandMessage(2)");
            return;
        }
        if (pushManager == null) {
            LogUtil.m17468e("pushManager is null , please check param of parseCommandMessage(2)");
            return;
        }
        if (pushManager.getPushCallback() == null) {
            LogUtil.m17468e("pushManager.getPushCallback() is null , please check param of parseCommandMessage(2)");
            return;
        }
        switch (commandMessage.getCommand()) {
            case CommandMessage.COMMAND_REGISTER /* 12289 */:
                if (commandMessage.getResponseCode() == 0) {
                    pushManager.setRegisterID(commandMessage.getContent());
                }
                pushManager.getPushCallback().onRegister(commandMessage.getResponseCode(), commandMessage.getContent());
                break;
            case CommandMessage.COMMAND_UNREGISTER /* 12290 */:
                pushManager.getPushCallback().onUnRegister(commandMessage.getResponseCode());
                break;
            case CommandMessage.COMMAND_SET_ALIAS /* 12292 */:
                pushManager.getPushCallback().onSetAliases(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "alias", "aliasId", "aliasName"));
                break;
            case CommandMessage.COMMAND_GET_ALIAS /* 12293 */:
                pushManager.getPushCallback().onGetAliases(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "alias", "aliasId", "aliasName"));
                break;
            case CommandMessage.COMMAND_UNSET_ALIAS /* 12294 */:
                pushManager.getPushCallback().onUnsetAliases(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "alias", "aliasId", "aliasName"));
                break;
            case CommandMessage.COMMAND_SET_TAGS /* 12295 */:
                pushManager.getPushCallback().onSetTags(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "tagId", "tagName"));
                break;
            case CommandMessage.COMMAND_GET_TAGS /* 12296 */:
                pushManager.getPushCallback().onGetTags(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "tagId", "tagName"));
                break;
            case CommandMessage.COMMAND_UNSET_TAGS /* 12297 */:
                pushManager.getPushCallback().onUnsetTags(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "tagId", "tagName"));
                break;
            case CommandMessage.COMMAND_SET_PUSH_TIME /* 12298 */:
                pushManager.getPushCallback().onSetPushTime(commandMessage.getResponseCode(), commandMessage.getContent());
                break;
            case CommandMessage.COMMAND_SET_ACCOUNTS /* 12301 */:
                pushManager.getPushCallback().onSetUserAccounts(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "accountId", "accountName"));
                break;
            case CommandMessage.COMMAND_GET_ACCOUNTS /* 12302 */:
                pushManager.getPushCallback().onGetUserAccounts(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "accountId", "accountName"));
                break;
            case CommandMessage.COMMAND_UNSET_ACCOUNTS /* 12303 */:
                pushManager.getPushCallback().onUnsetUserAccounts(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "accountId", "accountName"));
                break;
            case CommandMessage.COMMAND_GET_PUSH_STATUS /* 12306 */:
                pushManager.getPushCallback().onGetPushStatus(commandMessage.getResponseCode(), Utils.parseInt(commandMessage.getContent()));
                break;
            case CommandMessage.COMMAND_GET_NOTIFICATION_STATUS /* 12309 */:
                pushManager.getPushCallback().onGetNotificationStatus(commandMessage.getResponseCode(), Utils.parseInt(commandMessage.getContent()));
                break;
        }
    }

    public static void parseIntent(Context context, Intent intent, MessageCallback messageCallback) {
        String str;
        if (context == null) {
            str = "context is null , please check param of parseIntent()";
        } else if (intent == null) {
            str = "intent is null , please check param of parseIntent()";
        } else {
            if (messageCallback != null) {
                for (Message message : AbstractC3457c.m17462a(context, intent)) {
                    if (message != null) {
                        for (InterfaceC3463c interfaceC3463c : PushManager.getInstance().getProcessors()) {
                            if (interfaceC3463c != null) {
                                interfaceC3463c.mo17463a(context, message, messageCallback);
                            }
                        }
                    }
                }
                return;
            }
            str = "callback is null , please check param of parseIntent()";
        }
        LogUtil.m17468e(str);
    }

    public static void parseCommandMessage(Context context, CommandMessage commandMessage, PushCallback pushCallback) {
        if (context == null) {
            LogUtil.m17468e("context is null , please check param of parseCommandMessage()");
        }
        if (commandMessage == null) {
            LogUtil.m17468e("message is null , please check param of parseCommandMessage()");
            return;
        }
        if (pushCallback == null) {
            LogUtil.m17468e("callback is null , please check param of parseCommandMessage()");
            return;
        }
        switch (commandMessage.getCommand()) {
            case CommandMessage.COMMAND_REGISTER /* 12289 */:
                if (commandMessage.getResponseCode() == 0) {
                    PushManager.getInstance().setRegisterID(commandMessage.getContent());
                }
                pushCallback.onRegister(commandMessage.getResponseCode(), commandMessage.getContent());
                break;
            case CommandMessage.COMMAND_UNREGISTER /* 12290 */:
                pushCallback.onUnRegister(commandMessage.getResponseCode());
                break;
            case CommandMessage.COMMAND_SET_ALIAS /* 12292 */:
                pushCallback.onSetAliases(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "alias", "aliasId", "aliasName"));
                break;
            case CommandMessage.COMMAND_GET_ALIAS /* 12293 */:
                pushCallback.onGetAliases(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "alias", "aliasId", "aliasName"));
                break;
            case CommandMessage.COMMAND_UNSET_ALIAS /* 12294 */:
                pushCallback.onUnsetAliases(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "alias", "aliasId", "aliasName"));
                break;
            case CommandMessage.COMMAND_SET_TAGS /* 12295 */:
                pushCallback.onSetTags(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "tagId", "tagName"));
                break;
            case CommandMessage.COMMAND_GET_TAGS /* 12296 */:
                pushCallback.onGetTags(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "tagId", "tagName"));
                break;
            case CommandMessage.COMMAND_UNSET_TAGS /* 12297 */:
                pushCallback.onUnsetTags(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "tagId", "tagName"));
                break;
            case CommandMessage.COMMAND_SET_PUSH_TIME /* 12298 */:
                pushCallback.onSetPushTime(commandMessage.getResponseCode(), commandMessage.getContent());
                break;
            case CommandMessage.COMMAND_SET_ACCOUNTS /* 12301 */:
                pushCallback.onSetUserAccounts(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "accountId", "accountName"));
                break;
            case CommandMessage.COMMAND_GET_ACCOUNTS /* 12302 */:
                pushCallback.onGetUserAccounts(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "accountId", "accountName"));
                break;
            case CommandMessage.COMMAND_UNSET_ACCOUNTS /* 12303 */:
                pushCallback.onUnsetUserAccounts(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "accountId", "accountName"));
                break;
            case CommandMessage.COMMAND_GET_PUSH_STATUS /* 12306 */:
                pushCallback.onGetPushStatus(commandMessage.getResponseCode(), Utils.parseInt(commandMessage.getContent()));
                break;
            case CommandMessage.COMMAND_GET_NOTIFICATION_STATUS /* 12309 */:
                pushCallback.onGetNotificationStatus(commandMessage.getResponseCode(), Utils.parseInt(commandMessage.getContent()));
                break;
        }
    }
}
