package com.tencent.could.huiyansdk.fragments;

import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.h */
/* JADX INFO: loaded from: classes12.dex */
public class C14061h implements YtSDKKitFramework.IYTBaseFunctionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f58248a;

    public C14061h(AuthingFragment authingFragment) {
        this.f58248a = authingFragment;
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
            InputStream inputStreamOpen = this.f58248a.getContextResources().getAssets().open("readnum6098.spx");
            bArr = inputStreamOpen.available() != 0 ? new byte[inputStreamOpen.available()] : null;
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return bArr;
        } catch (Exception e) {
            C14068e.a.f58293a.m83520a(2, "AuthingFragment", "get voice failed " + e.getLocalizedMessage());
            return bArr;
        }
    }
}
