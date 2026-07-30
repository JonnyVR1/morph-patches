package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14650a extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ActionLivenessState.C14627j f61638a;

    public C14650a(ActionLivenessState.C14627j c14627j) {
        this.f61638a = c14627j;
        put(StateEvent.Name.ACTION_DETECT_DONE_TYPE, Integer.valueOf(ActionLivenessState.this.f61452g));
        put(StateEvent.Name.ACTION_DETECT_DONE_LAST_COUNT, Integer.valueOf(ActionLivenessState.this.f61453h == null ? 0 : ActionLivenessState.this.f61453h.length - (ActionLivenessState.this.f61454i + 1)));
    }
}
