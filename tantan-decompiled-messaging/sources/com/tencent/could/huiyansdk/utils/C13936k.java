package com.tencent.could.huiyansdk.utils;

import android.os.CountDownTimer;
import android.text.TextUtils;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.api.InterfaceC13872b;
import com.tencent.could.huiyansdk.callback.InterfaceC13884c;
import com.tencent.could.huiyansdk.common.C13887a;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.C13893c;
import com.tencent.could.huiyansdk.manager.C13905e;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.k */
/* JADX INFO: loaded from: classes2.dex */
public class C13936k {

    /* JADX INFO: renamed from: a */
    public CountDownTimer f57521a;

    /* JADX INFO: renamed from: b */
    public InterfaceC13884c f57522b;

    /* JADX INFO: renamed from: c */
    public boolean f57523c = false;

    /* JADX INFO: renamed from: d */
    public long f57524d;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.k$a */
    public class a extends CountDownTimer {
        public a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C13936k c13936k = C13936k.this;
            InterfaceC13884c interfaceC13884c = c13936k.f57522b;
            if (interfaceC13884c == null || c13936k.f57523c) {
                return;
            }
            C13893c c13893c = (C13893c) interfaceC13884c;
            CompareResult compareResult = new CompareResult();
            C13880j c13880j = C13880j.a.f57352a;
            if (!c13880j.m82235b().isOpenLongCheck() || !c13893c.f57395a.f57381o || c13893c.f57395a.f57380n) {
                if (c13893c.f57395a.f57379m) {
                    compareResult.setErrorCode(222);
                    compareResult.setErrorMsg(c13893c.f57395a.getResString(C13869R.string.txy_local_check_out_time));
                    C13905e.a.f57445a.m82337a(2, "AuthingFragment", "action time out!");
                } else {
                    compareResult.setErrorCode(223);
                    compareResult.setErrorMsg(c13893c.f57395a.getResString(C13869R.string.txy_prepare_out_time));
                    C13905e.a.f57445a.m82337a(2, "AuthingFragment", "prepare time out!");
                }
                String str = "timeOut code: " + compareResult.getErrorCode();
                InterfaceC13872b interfaceC13872b = c13880j.f57348g;
                if (interfaceC13872b != null) {
                    interfaceC13872b.onBuriedPointCallBack("AuthCheckStage", "AuthLocalFail", str);
                }
                c13893c.f57395a.m82273a((Object) compareResult);
                return;
            }
            compareResult.setErrorCode(287);
            String str2 = C13887a.a.f57364a.f57359b;
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            AuthingFragment authingFragment = c13893c.f57395a;
            if (zIsEmpty) {
                compareResult.setErrorMsg(authingFragment.getResString(C13869R.string.txy_bot_out_time));
            } else {
                compareResult.setErrorMsg(authingFragment.getResString(C13869R.string.txy_bot_out_time) + c13893c.f57395a.getResString(C13869R.string.txy_comma) + str2);
            }
            C13905e.a.f57445a.m82337a(2, "AuthingFragment", "long check time out!");
            String str3 = "timeout code: " + compareResult.getErrorCode();
            InterfaceC13872b interfaceC13872b2 = c13880j.f57348g;
            if (interfaceC13872b2 != null) {
                interfaceC13872b2.onBuriedPointCallBack("BOTCheckStage", "AuthLocalFail", str3);
            }
            c13893c.f57395a.m82273a((Object) compareResult);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C13905e.a.f57445a.m82337a(1, "TimeOutHelper", "on tick: " + j);
            int i = (int) ((j + 1000) / 1000);
            C13936k c13936k = C13936k.this;
            InterfaceC13884c interfaceC13884c = c13936k.f57522b;
            if (interfaceC13884c == null || c13936k.f57523c) {
                return;
            }
            ((C13893c) interfaceC13884c).m82292a(i);
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.k$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C13936k f57526a = new C13936k();
    }

    /* JADX INFO: renamed from: a */
    public void m82411a(long j) {
        C13905e.a.f57445a.m82337a(1, "TimeOutHelper", "start count down: " + j);
        CountDownTimer countDownTimer = this.f57521a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f57524d = j;
        this.f57523c = false;
        if (j > 0) {
            j--;
        }
        a aVar = new a(j, 1000L);
        this.f57521a = aVar;
        aVar.start();
    }
}
