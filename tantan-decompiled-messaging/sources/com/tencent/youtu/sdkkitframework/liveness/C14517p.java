package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.p */
/* JADX INFO: loaded from: classes2.dex */
public class C14517p {

    /* JADX INFO: renamed from: a */
    public YtVideoEncoder f60812a = new YtVideoEncoder();

    /* JADX INFO: renamed from: b */
    public final String f60813b;

    /* JADX INFO: renamed from: c */
    public final int f60814c;

    /* JADX INFO: renamed from: d */
    public final int f60815d;

    /* JADX INFO: renamed from: e */
    public final int f60816e;

    /* JADX INFO: renamed from: f */
    public String f60817f;

    /* JADX INFO: renamed from: g */
    public JSONArray f60818g;

    /* JADX INFO: renamed from: h */
    public String f60819h;

    /* JADX INFO: renamed from: i */
    public boolean f60820i;

    /* JADX INFO: renamed from: j */
    public boolean f60821j;

    public C14517p(String str, int i, int i2, int i3, String str2) {
        this.f60817f = str2;
        this.f60813b = str;
        this.f60814c = i;
        this.f60815d = i2;
        this.f60816e = i3;
        this.f60821j = YtVideoEncoder.getMediaCodecInfo() == 0;
    }
}
