package com.tencent.p106mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p106mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXTextObject implements WXMediaMessage.IMediaObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXTextObject";
    public String text;

    public WXTextObject(String str) {
        this.text = str;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str = this.text;
        if (str != null && str.length() != 0 && this.text.length() <= LENGTH_LIMIT) {
            return true;
        }
        Log.m85358e(TAG, "checkArgs fail, text is invalid");
        return false;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putString("_wxtextobject_text", this.text);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 1;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.text = bundle.getString("_wxtextobject_text");
    }

    public WXTextObject() {
        this(null);
    }
}
