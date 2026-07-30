package com.immomo.hdata.android;

import android.content.Context;
import androidx.annotation.NonNull;
import com.immomo.mmdns.MDDNSEntrance;
import p149l.kek0;
import p149l.ljw;
import p149l.qgw;
import p149l.sjw;
import p149l.x4j0;
import p149l.ygw;

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

    public static void collect(String str, String str2, String str3, String str4, String str5, String str6, x4j0 x4j0Var) {
        kek0.m145787e(str, str2, str3, str4, str5, str6, x4j0Var);
    }

    public static void getMMuidV3(String str, final MmuidCallBack mmuidCallBack) {
        sjw.m184561c(str, new sjw.InterfaceC19968b() { // from class: com.immomo.hdata.android.MDevice.2
            @Override // p149l.sjw.InterfaceC19968b
            public void onMMUIDGetComplete(String str2) {
                mmuidCallBack.onMMUIDGetComplete(str2);
            }

            @Override // p149l.sjw.InterfaceC19968b
            public void onMMUIDGetError(Throwable th) {
                mmuidCallBack.onMMUIDGetError(th);
            }
        });
    }

    @Deprecated
    public static String getmmuid(Context context, String str) {
        try {
            return qgw.m174462a(context, str);
        } catch (Exception e) {
            ljw.m150044a(e);
            return null;
        }
    }

    public static void init(@NonNull Context context, @NonNull final Config config2) {
        ygw.m214779e(context);
        config = config2;
        sjw.m184564f(context, new sjw.InterfaceC19967a() { // from class: com.immomo.hdata.android.MDevice.1
            @Override // p149l.sjw.InterfaceC19967a
            public MDDNSEntrance getDnsInstance() {
                return config2.getDnsInstance();
            }
        });
    }

    public static String getMMuidV3(Context context) {
        return sjw.m184560b(context);
    }
}
