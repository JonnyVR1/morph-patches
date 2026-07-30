package p153l;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.C14870f;
import com.xiaomi.push.InterfaceC14925hq;

/* JADX INFO: loaded from: classes2.dex */
public class p4r0 {
    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC14925hq<T, ?>> void m170576a(Context context, uv5 uv5Var) {
        if (uv5Var == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_cr_config");
        intent.putExtra("action_cr_event_switch", uv5Var.m198246g());
        intent.putExtra("action_cr_event_frequency", uv5Var.m198242c());
        intent.putExtra("action_cr_perf_switch", uv5Var.m198247h());
        intent.putExtra("action_cr_perf_frequency", uv5Var.m198244e());
        intent.putExtra("action_cr_event_en", uv5Var.m198245f());
        intent.putExtra("action_cr_max_file_size", uv5Var.m198243d());
        C14870f.m86573h(context).m86602r(intent);
    }
}
