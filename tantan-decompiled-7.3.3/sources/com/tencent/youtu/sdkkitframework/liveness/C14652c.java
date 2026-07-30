package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14652c extends HashMap<String, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f61639a;

    public C14652c(ActionLivenessState.C14627j c14627j, String str) {
        this.f61639a = str;
        put(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE, str);
    }
}
