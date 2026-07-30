package p149l;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.C14722f;
import com.xiaomi.push.InterfaceC14777hq;

/* JADX INFO: loaded from: classes2.dex */
public class jvq0 {
    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC14777hq<T, ?>> void m143536a(Context context, qu5 qu5Var) {
        if (qu5Var == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_cr_config");
        intent.putExtra("action_cr_event_switch", qu5Var.m176523g());
        intent.putExtra("action_cr_event_frequency", qu5Var.m176519c());
        intent.putExtra("action_cr_perf_switch", qu5Var.m176524h());
        intent.putExtra("action_cr_perf_frequency", qu5Var.m176521e());
        intent.putExtra("action_cr_event_en", qu5Var.m176522f());
        intent.putExtra("action_cr_max_file_size", qu5Var.m176520d());
        C14722f.m85402h(context).m85431r(intent);
    }
}
