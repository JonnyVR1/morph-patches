package com.p046p1.mobile.putong.account.p050ui.jsbridge;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.account.p050ui.account.PhoneVerificationAct;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.data.VerifyReason;
import p149l.boq;
import p149l.coq;
import p149l.ef2;
import p149l.liq;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: c */
    public final String m29164c(@NonNull coq coqVar) {
        return "[" + ABManager.m29349i() + Constants.AES_SUFFIX;
    }

    @liq(key = "getABNames")
    public String getABNames(@NonNull boq boqVar) {
        return m29164c(boqVar);
    }

    @liq(key = "jumpBindPhone")
    public void jumpBindPhone(@NonNull boq boqVar) {
        boqVar.mo102961c().startActivity(PhoneVerificationAct.m28385Y1(boqVar.mo102961c(), VerifyReason.get(VerifyReason.bind_mobile)));
    }
}
