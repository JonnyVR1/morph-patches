package com.p046p1.mobile.putong.core.p053ui.messages.manager.insert;

/* JADX INFO: loaded from: classes3.dex */
public enum InsertLocalMsgTriggerType {
    PAGE_INIT("页面初始化"),
    PAGE_FINISH("页面销毁"),
    CONV_MSG_CHANGE("消息或者会话信息更新");

    private String typeDes;

    InsertLocalMsgTriggerType(String str) {
        this.typeDes = str;
    }
}
