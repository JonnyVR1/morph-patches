package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14502a extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ActionLivenessState.C14479j f60791a;

    public C14502a(ActionLivenessState.C14479j c14479j) {
        this.f60791a = c14479j;
        put(StateEvent.Name.ACTION_DETECT_DONE_TYPE, Integer.valueOf(ActionLivenessState.this.f60605g));
        put(StateEvent.Name.ACTION_DETECT_DONE_LAST_COUNT, Integer.valueOf(ActionLivenessState.this.f60606h == null ? 0 : ActionLivenessState.this.f60606h.length - (ActionLivenessState.this.f60607i + 1)));
    }
}
