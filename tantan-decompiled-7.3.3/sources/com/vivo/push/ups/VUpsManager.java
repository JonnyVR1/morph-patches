package com.vivo.push.ups;

import android.content.Context;
import android.os.Bundle;
import com.vivo.push.PushClient;

/* JADX INFO: loaded from: classes2.dex */
public class VUpsManager {

    /* JADX INFO: renamed from: com.vivo.push.ups.VUpsManager$a */
    public static class C14774a {

        /* JADX INFO: renamed from: a */
        private static VUpsManager f61932a = new VUpsManager();
    }

    public static VUpsManager getInstance() {
        return C14774a.f61932a;
    }

    public void onCommandResult(Context context, Bundle bundle) {
    }

    public void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallback uPSRegisterCallback) {
        PushClient.getInstance(context).turnOnPush(new C14775a(this, uPSRegisterCallback, context));
    }

    public void turnOffPush(Context context, UPSTurnCallback uPSTurnCallback) {
        PushClient.getInstance(context).turnOffPush(new C14778d(this, uPSTurnCallback));
    }

    public void turnOnPush(Context context, UPSTurnCallback uPSTurnCallback) {
        PushClient.getInstance(context).turnOnPush(new C14777c(this, uPSTurnCallback));
    }

    public void unRegisterToken(Context context, UPSRegisterCallback uPSRegisterCallback) {
        PushClient.getInstance(context).turnOffPush(new C14776b(this, uPSRegisterCallback));
    }
}
