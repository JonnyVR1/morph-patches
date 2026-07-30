package com.tencent.could.huiyansdk.utils;

import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.m */
/* JADX INFO: loaded from: classes12.dex */
public class C14101m extends ArrayList<HuiYanAuthEvent> {
    public C14101m(C14102n c14102n) {
        add(HuiYanAuthEvent.OPEN_MOUTH_CHECK_DONE);
        add(HuiYanAuthEvent.SILENCE_CHECK_DONE);
        add(HuiYanAuthEvent.BLINK_CHECK_DONE);
        add(HuiYanAuthEvent.NOD_HEAD_CHECK_DONE);
        add(HuiYanAuthEvent.SHAKE_HEAD_CHECK_DONE);
    }
}
