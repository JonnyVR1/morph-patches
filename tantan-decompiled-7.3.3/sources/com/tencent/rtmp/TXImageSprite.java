package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.basic.datareport.C14189a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.rtmp.p113a.C14570b;
import com.tencent.rtmp.p113a.InterfaceC14569a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TXImageSprite implements InterfaceC14569a {
    private Context mContext;
    private InterfaceC14569a mImageSprite;

    public TXImageSprite(Context context) {
        this.mContext = context.getApplicationContext();
        TXCDRApi.initCrashReport(context);
    }

    @Override // com.tencent.rtmp.p113a.InterfaceC14569a
    public Bitmap getThumbnail(float f) {
        InterfaceC14569a interfaceC14569a = this.mImageSprite;
        if (interfaceC14569a != null) {
            return interfaceC14569a.getThumbnail(f);
        }
        return null;
    }

    @Override // com.tencent.rtmp.p113a.InterfaceC14569a
    public void release() {
        InterfaceC14569a interfaceC14569a = this.mImageSprite;
        if (interfaceC14569a != null) {
            interfaceC14569a.release();
            this.mImageSprite = null;
        }
    }

    @Override // com.tencent.rtmp.p113a.InterfaceC14569a
    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (this.mImageSprite != null) {
            release();
        }
        if (str == null || list == null || list.size() == 0) {
            return;
        }
        TXCDRApi.txReportDAU(this.mContext, C14189a.f59197bC);
        C14570b c14570b = new C14570b();
        this.mImageSprite = c14570b;
        c14570b.setVTTUrlAndImageUrls(str, list);
    }
}
