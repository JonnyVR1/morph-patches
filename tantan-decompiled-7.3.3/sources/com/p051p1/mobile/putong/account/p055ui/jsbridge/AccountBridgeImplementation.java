package com.p051p1.mobile.putong.account.p055ui.jsbridge;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.account.p055ui.account.PhoneVerificationAct;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.data.VerifyReason;
import p153l.aqq;
import p153l.bqq;
import p153l.lf2;
import p153l.lkq;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBridgeImplementation extends lf2 {
    /* JADX INFO: renamed from: c */
    public final String m30162c(@NonNull bqq bqqVar) {
        return "[" + ABManager.m30347i() + Constants.AES_SUFFIX;
    }

    @lkq(key = "getABNames")
    public String getABNames(@NonNull aqq aqqVar) {
        return m30162c(aqqVar);
    }

    @lkq(key = "jumpBindPhone")
    public void jumpBindPhone(@NonNull aqq aqqVar) {
        aqqVar.mo99543c().startActivity(PhoneVerificationAct.m29384Z1(aqqVar.mo99543c(), VerifyReason.get(VerifyReason.bind_mobile)));
    }
}
