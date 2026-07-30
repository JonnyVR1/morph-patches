package com.p051p1.mobile.putong.core.p058ui.banner.rule;

/* JADX INFO: loaded from: classes9.dex */
public enum PrivilegeType {
    UNKNOWN,
    VIP,
    SVIP,
    VIP_WITH_TERMINATION_CONTRACT,
    SVIP_WITH_TERMINATION_CONTRACT,
    VIP_WITH_TERMINATION_PAY,
    SVIP_WITH_TERMINATION_PAY,
    DIAMOND,
    SVIP_WITH_DIAMOND,
    VIP_WITH_DIAMOND,
    UNPRIVILEGE_WHIT_DIAMOND,
    PLATINUM;

    public boolean isSvip() {
        return SVIP == this || SVIP_WITH_TERMINATION_CONTRACT == this;
    }

    public boolean isVip() {
        return VIP == this || VIP_WITH_TERMINATION_CONTRACT == this || VIP_WITH_TERMINATION_PAY == this;
    }
}
