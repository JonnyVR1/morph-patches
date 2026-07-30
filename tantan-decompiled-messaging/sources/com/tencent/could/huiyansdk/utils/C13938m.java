package com.tencent.could.huiyansdk.utils;

import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.m */
/* JADX INFO: loaded from: classes2.dex */
public class C13938m extends ArrayList<HuiYanAuthEvent> {
    public C13938m(C13939n c13939n) {
        add(HuiYanAuthEvent.OPEN_MOUTH_CHECK_DONE);
        add(HuiYanAuthEvent.SILENCE_CHECK_DONE);
        add(HuiYanAuthEvent.BLINK_CHECK_DONE);
        add(HuiYanAuthEvent.NOD_HEAD_CHECK_DONE);
        add(HuiYanAuthEvent.SHAKE_HEAD_CHECK_DONE);
    }
}
