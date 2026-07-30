package com.p051p1.mobile.putong.core.p058ui.messages.base;

/* JADX INFO: loaded from: classes3.dex */
public enum MedialItemType {
    PICTURE("图片"),
    CAMERA("拍照"),
    VIDEO("视频"),
    LOCATION("位置"),
    VOICE_CALL("语音通话"),
    RED_PACKAGE("红包"),
    CHALLENGE("合拍挑战"),
    EXCLUSIVE_CHAT("专属聊天"),
    AICG("送她魔法照"),
    NEW_PIC("照片新玩法"),
    LOVE_LETTER("情书"),
    SWAP_ANSWER("交换答案");

    public String des;

    MedialItemType(String str) {
        this.des = str;
    }
}
