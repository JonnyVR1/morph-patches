package com.immomo.hdata.android;

import android.content.Context;
import androidx.annotation.NonNull;
import com.immomo.mmdns.MDDNSEntrance;
import p153l.bej0;
import p153l.kmw;
import p153l.piw;
import p153l.qnk0;
import p153l.rmw;
import p153l.xiw;

/* JADX INFO: loaded from: classes7.dex */
public class MDevice {
    public static volatile Config config;

    public interface Config {
        MDDNSEntrance getDnsInstance();
    }

    public interface MmuidCallBack {
        void onMMUIDGetComplete(String str);

        void onMMUIDGetError(Throwable th);
    }

    public static void collect(String str, String str2, String str3, String str4, String str5, String str6, bej0 bej0Var) {
        qnk0.m177224e(str, str2, str3, str4, str5, str6, bej0Var);
    }

    public static void getMMuidV3(String str, final MmuidCallBack mmuidCallBack) {
        rmw.m182111c(str, new rmw.InterfaceC19876b() { // from class: com.immomo.hdata.android.MDevice.2
            @Override // p153l.rmw.InterfaceC19876b
            public void onMMUIDGetComplete(String str2) {
                mmuidCallBack.onMMUIDGetComplete(str2);
            }

            @Override // p153l.rmw.InterfaceC19876b
            public void onMMUIDGetError(Throwable th) {
                mmuidCallBack.onMMUIDGetError(th);
            }
        });
    }

    @Deprecated
    public static String getmmuid(Context context, String str) {
        try {
            return piw.m172463a(context, str);
        } catch (Exception e) {
            kmw.m150491a(e);
            return null;
        }
    }

    public static void init(@NonNull Context context, @NonNull final Config config2) {
        xiw.m211174e(context);
        config = config2;
        rmw.m182114f(context, new rmw.InterfaceC19875a() { // from class: com.immomo.hdata.android.MDevice.1
            @Override // p153l.rmw.InterfaceC19875a
            public MDDNSEntrance getDnsInstance() {
                return config2.getDnsInstance();
            }
        });
    }

    public static String getMMuidV3(Context context) {
        return rmw.m182110b(context);
    }
}
