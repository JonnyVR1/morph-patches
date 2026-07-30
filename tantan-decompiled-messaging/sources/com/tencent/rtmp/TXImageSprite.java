package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.basic.datareport.C14026a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.rtmp.p108a.C14407b;
import com.tencent.rtmp.p108a.InterfaceC14406a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TXImageSprite implements InterfaceC14406a {
    private Context mContext;
    private InterfaceC14406a mImageSprite;

    public TXImageSprite(Context context) {
        this.mContext = context.getApplicationContext();
        TXCDRApi.initCrashReport(context);
    }

    @Override // com.tencent.rtmp.p108a.InterfaceC14406a
    public Bitmap getThumbnail(float f) {
        InterfaceC14406a interfaceC14406a = this.mImageSprite;
        if (interfaceC14406a != null) {
            return interfaceC14406a.getThumbnail(f);
        }
        return null;
    }

    @Override // com.tencent.rtmp.p108a.InterfaceC14406a
    public void release() {
        InterfaceC14406a interfaceC14406a = this.mImageSprite;
        if (interfaceC14406a != null) {
            interfaceC14406a.release();
            this.mImageSprite = null;
        }
    }

    @Override // com.tencent.rtmp.p108a.InterfaceC14406a
    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (this.mImageSprite != null) {
            release();
        }
        if (str == null || list == null || list.size() == 0) {
            return;
        }
        TXCDRApi.txReportDAU(this.mContext, C14026a.f58349bC);
        C14407b c14407b = new C14407b();
        this.mImageSprite = c14407b;
        c14407b.setVTTUrlAndImageUrls(str, list);
    }
}
