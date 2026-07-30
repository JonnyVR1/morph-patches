package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.PushMessageCustom;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ImpressSignalCardWrapper {
    private PushMessageCustom broadcastCard;
    public boolean hasShowPrivilegeNotify = false;
    public String userId;

    public ImpressSignalCardWrapper(PushMessageCustom pushMessageCustom) {
        this.broadcastCard = pushMessageCustom;
        this.userId = pushMessageCustom.userId;
    }

    @Nullable
    public PushMessageCustom getPushCustom() {
        return this.broadcastCard;
    }
}
