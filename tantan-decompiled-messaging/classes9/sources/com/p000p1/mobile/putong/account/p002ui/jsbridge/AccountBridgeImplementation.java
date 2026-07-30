package com.p000p1.mobile.putong.account.p002ui.jsbridge;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.p002ui.account.PhoneVerificationAct;
import com.p000p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.data.VerifyReason;
import l.boq;
import l.coq;
import l.ef2;
import l.liq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: c */
    public final String m1070c(@NonNull coq coqVar) {
        return "[" + ABManager.m1255i() + "]";
    }

    @liq(key = "getABNames")
    public String getABNames(@NonNull boq boqVar) {
        return m1070c(boqVar);
    }

    @liq(key = "jumpBindPhone")
    public void jumpBindPhone(@NonNull boq boqVar) {
        boqVar.c().startActivity(PhoneVerificationAct.m281Y1(boqVar.c(), VerifyReason.get("bind_mobile")));
    }
}
