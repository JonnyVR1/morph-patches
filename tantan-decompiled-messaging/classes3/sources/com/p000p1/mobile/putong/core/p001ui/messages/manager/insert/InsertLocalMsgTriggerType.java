package com.p000p1.mobile.putong.core.p001ui.messages.manager.insert;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum InsertLocalMsgTriggerType {
    PAGE_INIT("页面初始化"),
    PAGE_FINISH("页面销毁"),
    CONV_MSG_CHANGE("消息或者会话信息更新");

    private String typeDes;

    InsertLocalMsgTriggerType(String str) {
        this.typeDes = str;
    }
}
