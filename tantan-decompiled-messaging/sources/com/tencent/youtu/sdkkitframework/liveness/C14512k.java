package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.k */
/* JADX INFO: loaded from: classes2.dex */
public class C14512k extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f60801a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f60802b;

    public C14512k(NetLivenessReqResultState netLivenessReqResultState, String str, String str2) {
        this.f60801a = str;
        this.f60802b = str2;
        put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.LIVE_DATA_CB);
        put(StateEvent.Name.SELECT_DATA_S, str);
        put(StateEvent.Name.ACTION_DATA_S, str2);
    }
}
