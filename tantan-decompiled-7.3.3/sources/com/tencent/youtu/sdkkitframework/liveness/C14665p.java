package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.p */
/* JADX INFO: loaded from: classes2.dex */
public class C14665p {

    /* JADX INFO: renamed from: a */
    public YtVideoEncoder f61659a = new YtVideoEncoder();

    /* JADX INFO: renamed from: b */
    public final String f61660b;

    /* JADX INFO: renamed from: c */
    public final int f61661c;

    /* JADX INFO: renamed from: d */
    public final int f61662d;

    /* JADX INFO: renamed from: e */
    public final int f61663e;

    /* JADX INFO: renamed from: f */
    public String f61664f;

    /* JADX INFO: renamed from: g */
    public JSONArray f61665g;

    /* JADX INFO: renamed from: h */
    public String f61666h;

    /* JADX INFO: renamed from: i */
    public boolean f61667i;

    /* JADX INFO: renamed from: j */
    public boolean f61668j;

    public C14665p(String str, int i, int i2, int i3, String str2) {
        this.f61664f = str2;
        this.f61660b = str;
        this.f61661c = i;
        this.f61662d = i2;
        this.f61663e = i3;
        this.f61668j = YtVideoEncoder.getMediaCodecInfo() == 0;
    }
}
