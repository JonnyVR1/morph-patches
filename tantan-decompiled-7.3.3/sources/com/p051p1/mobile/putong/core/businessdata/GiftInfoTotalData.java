package com.p051p1.mobile.putong.core.businessdata;

import com.p051p1.mobile.putong.core.data.CoreGiftInfo;

/* JADX INFO: loaded from: classes9.dex */
public class GiftInfoTotalData {
    private boolean dynamicReady;
    private CoreGiftInfo giftInfo;
    private int indexOnPage;
    private int pageIndex;
    private int remaining;

    public GiftInfoTotalData(CoreGiftInfo coreGiftInfo) {
        this.giftInfo = coreGiftInfo;
    }

    public int getIndexOnPage() {
        return this.indexOnPage;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public int getRemaining() {
        return this.remaining;
    }

    public CoreGiftInfo giftInfo() {
        return this.giftInfo;
    }

    public boolean isDynamicReady() {
        return this.dynamicReady;
    }

    public void setDynamicReady(boolean z) {
        this.dynamicReady = z;
    }

    public void setIndexOnPage(int i) {
        this.indexOnPage = i;
    }

    public void setPageIndex(int i) {
        this.pageIndex = i;
    }

    public void setRemaining(int i) {
        this.remaining = i;
    }
}
