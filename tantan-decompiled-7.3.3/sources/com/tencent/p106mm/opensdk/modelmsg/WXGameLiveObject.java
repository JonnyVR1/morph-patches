package com.tencent.p106mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p106mm.opensdk.utils.C14503b;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class WXGameLiveObject implements WXMediaMessage.IMediaObject {
    private static final String TAG = "MicroMsg.SDK.WXGameObject";
    public HashMap<String, String> extraInfoMap = new HashMap<>();

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        return true;
    }

    public String getExtra(String str, String str2) {
        HashMap<String, String> map = this.extraInfoMap;
        if (map == null) {
            return null;
        }
        String str3 = map.get(str);
        return str3 != null ? str3 : str2;
    }

    public void putExtra(String str, String str2) {
        if (this.extraInfoMap == null) {
            this.extraInfoMap = new HashMap<>();
        }
        if (C14503b.m85366b(str)) {
            return;
        }
        this.extraInfoMap.put(str, str2);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        HashMap<String, String> map = this.extraInfoMap;
        if (map != null) {
            bundle.putSerializable("_wxgame_extrainfo", map);
        }
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 70;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.extraInfoMap = (HashMap) bundle.getSerializable("_wxgame_extrainfo");
    }
}
