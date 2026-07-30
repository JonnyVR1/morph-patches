package com.tencent.could.huiyansdk.utils;

import android.os.CountDownTimer;
import android.text.TextUtils;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.api.InterfaceC14035b;
import com.tencent.could.huiyansdk.callback.InterfaceC14047c;
import com.tencent.could.huiyansdk.common.C14050a;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.C14056c;
import com.tencent.could.huiyansdk.manager.C14068e;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.k */
/* JADX INFO: loaded from: classes12.dex */
public class C14099k {

    /* JADX INFO: renamed from: a */
    public CountDownTimer f58369a;

    /* JADX INFO: renamed from: b */
    public InterfaceC14047c f58370b;

    /* JADX INFO: renamed from: c */
    public boolean f58371c = false;

    /* JADX INFO: renamed from: d */
    public long f58372d;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.k$a */
    public class a extends CountDownTimer {
        public a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C14099k c14099k = C14099k.this;
            InterfaceC14047c interfaceC14047c = c14099k.f58370b;
            if (interfaceC14047c == null || c14099k.f58371c) {
                return;
            }
            C14056c c14056c = (C14056c) interfaceC14047c;
            CompareResult compareResult = new CompareResult();
            C14043j c14043j = C14043j.a.f58200a;
            if (!c14043j.m83418b().isOpenLongCheck() || !c14056c.f58243a.f58229o || c14056c.f58243a.f58228n) {
                if (c14056c.f58243a.f58227m) {
                    compareResult.setErrorCode(222);
                    compareResult.setErrorMsg(c14056c.f58243a.getResString(C14032R.string.txy_local_check_out_time));
                    C14068e.a.f58293a.m83520a(2, "AuthingFragment", "action time out!");
                } else {
                    compareResult.setErrorCode(223);
                    compareResult.setErrorMsg(c14056c.f58243a.getResString(C14032R.string.txy_prepare_out_time));
                    C14068e.a.f58293a.m83520a(2, "AuthingFragment", "prepare time out!");
                }
                String str = "timeOut code: " + compareResult.getErrorCode();
                InterfaceC14035b interfaceC14035b = c14043j.f58196g;
                if (interfaceC14035b != null) {
                    interfaceC14035b.onBuriedPointCallBack("AuthCheckStage", "AuthLocalFail", str);
                }
                c14056c.f58243a.m83456a((Object) compareResult);
                return;
            }
            compareResult.setErrorCode(287);
            String str2 = C14050a.a.f58212a.f58207b;
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            AuthingFragment authingFragment = c14056c.f58243a;
            if (zIsEmpty) {
                compareResult.setErrorMsg(authingFragment.getResString(C14032R.string.txy_bot_out_time));
            } else {
                compareResult.setErrorMsg(authingFragment.getResString(C14032R.string.txy_bot_out_time) + c14056c.f58243a.getResString(C14032R.string.txy_comma) + str2);
            }
            C14068e.a.f58293a.m83520a(2, "AuthingFragment", "long check time out!");
            String str3 = "timeout code: " + compareResult.getErrorCode();
            InterfaceC14035b interfaceC14035b2 = c14043j.f58196g;
            if (interfaceC14035b2 != null) {
                interfaceC14035b2.onBuriedPointCallBack("BOTCheckStage", "AuthLocalFail", str3);
            }
            c14056c.f58243a.m83456a((Object) compareResult);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C14068e.a.f58293a.m83520a(1, "TimeOutHelper", "on tick: " + j);
            int i = (int) ((j + 1000) / 1000);
            C14099k c14099k = C14099k.this;
            InterfaceC14047c interfaceC14047c = c14099k.f58370b;
            if (interfaceC14047c == null || c14099k.f58371c) {
                return;
            }
            ((C14056c) interfaceC14047c).m83475a(i);
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.k$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C14099k f58374a = new C14099k();
    }

    /* JADX INFO: renamed from: a */
    public void m83594a(long j) {
        C14068e.a.f58293a.m83520a(1, "TimeOutHelper", "start count down: " + j);
        CountDownTimer countDownTimer = this.f58369a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f58372d = j;
        this.f58371c = false;
        if (j > 0) {
            j--;
        }
        a aVar = new a(j, 1000L);
        this.f58369a = aVar;
        aVar.start();
    }
}
