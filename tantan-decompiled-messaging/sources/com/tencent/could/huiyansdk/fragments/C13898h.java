package com.tencent.could.huiyansdk.fragments;

import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.h */
/* JADX INFO: loaded from: classes2.dex */
public class C13898h implements YtSDKKitFramework.IYTBaseFunctionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f57400a;

    public C13898h(AuthingFragment authingFragment) {
        this.f57400a = authingFragment;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public String base64Encode(byte[] bArr, int i) {
        return null;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public void detectActionDone(int i) {
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public HashMap<String, Integer> getFrameResult(Object obj) {
        return null;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public byte[] getVoiceData() {
        byte[] bArr = null;
        try {
            InputStream inputStreamOpen = this.f57400a.getContextResources().getAssets().open("readnum6098.spx");
            bArr = inputStreamOpen.available() != 0 ? new byte[inputStreamOpen.available()] : null;
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return bArr;
        } catch (Exception e) {
            C13905e.a.f57445a.m82337a(2, "AuthingFragment", "get voice failed " + e.getLocalizedMessage());
            return bArr;
        }
    }
}
