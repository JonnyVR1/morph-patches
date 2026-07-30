package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14504c extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f60792a;

    public C14504c(ActionLivenessState.C14479j c14479j, String str) {
        this.f60792a = str;
        put(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE, str);
    }
}
