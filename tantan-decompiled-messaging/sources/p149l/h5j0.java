package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\b¨\u0006\u001a"}, m87232d2 = {"Ll/h5j0;", "Ll/rq2;", "<init>", "()V", "Ll/w4j0;", "bean", "", "g", "(Ll/w4j0;)V", "", Constants.KEY_KEY, "", "f", "(Ljava/lang/String;)Z", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "extras", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "describe", "c", "a", "extra", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "h", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class h5j0 extends rq2 {

    @NotNull
    public static final h5j0 INSTANCE = new h5j0();

    /* JADX INFO: renamed from: a */
    public void m129402a(@NotNull String key, @NotNull String describe) {
        key.getClass();
        describe.getClass();
        if (m129407f(key)) {
            e5j0.m114815d(e5j0.INSTANCE, key, describe, null, 4, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m129403b(@NotNull String key, @NotNull String describe, @NotNull String extra) {
        key.getClass();
        describe.getClass();
        extra.getClass();
        if (m129407f(key)) {
            e5j0.INSTANCE.m114816c(key, describe, extra);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m129404c(@NotNull String key, @NotNull String describe) {
        key.getClass();
        describe.getClass();
        if (m129407f(key)) {
            e5j0.INSTANCE.m114817e(key, describe);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m129405d(@NotNull String key) {
        key.getClass();
        if (m129407f(key)) {
            e5j0.INSTANCE.m114818f(key, "");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m129406e(@NotNull String key, @NotNull String extras) {
        key.getClass();
        extras.getClass();
        if (m129407f(key)) {
            e5j0.INSTANCE.m114818f(key, extras);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m129407f(@NotNull String key) {
        key.getClass();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m129408g(@NotNull w4j0 bean) {
        bean.getClass();
        if (m129407f(bean.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String())) {
            m129409h(bean);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m129409h(w4j0 bean) {
        if (bean.m201530c().size() > 6) {
            return;
        }
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.f125900s = "e_live_custom_trace";
        HashMap map = new HashMap();
        map.put("event_key", bean.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
        if (!TextUtils.isEmpty(bean.getExtras())) {
            map.put("extras", bean.getExtras());
        }
        map.put("device_level", Integer.valueOf(pyd.INSTANCE.m172109a()));
        int i = 0;
        for (Object obj : bean.m201530c()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            o3g0 o3g0Var = (o3g0) obj;
            if (i == 0) {
                map.put("total_execute_time", String.valueOf(o3g0Var.getTotalTime()));
            } else if (i == 1) {
                map.put("sub_trace_a_execute_time", String.valueOf(o3g0Var.getTotalTime()));
                map.put("sub_trace_a_current_time", String.valueOf(o3g0Var.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String()));
                map.put("sub_trace_a__describe", o3g0Var.getDescribe());
            } else if (i == 2) {
                map.put("sub_trace_b_execute_time", String.valueOf(o3g0Var.getTotalTime()));
                map.put("sub_trace_b_current_time", String.valueOf(o3g0Var.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String()));
                map.put("sub_trace_b__describe", o3g0Var.getDescribe());
                if (Intrinsics.m87488d(map.get("sub_trace_a__describe"), map.get("sub_trace_b__describe"))) {
                    return;
                }
            } else if (i == 3) {
                map.put("sub_trace_c_execute_time", String.valueOf(o3g0Var.getTotalTime()));
                map.put("sub_trace_c_current_time", String.valueOf(o3g0Var.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String()));
                map.put("sub_trace_c__describe", o3g0Var.getDescribe());
                if (Intrinsics.m87488d(map.get("sub_trace_a__describe"), map.get("sub_trace_c__describe")) || Intrinsics.m87488d(map.get("sub_trace_b__describe"), map.get("sub_trace_c__describe"))) {
                    return;
                }
            } else if (i == 4) {
                map.put("sub_trace_d_execute_time", String.valueOf(o3g0Var.getTotalTime()));
                map.put("sub_trace_d_current_time", String.valueOf(o3g0Var.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String()));
                map.put("sub_trace_d__describe", o3g0Var.getDescribe());
                if (Intrinsics.m87488d(map.get("sub_trace_a__describe"), map.get("sub_trace_d__describe")) || Intrinsics.m87488d(map.get("sub_trace_b__describe"), map.get("sub_trace_d__describe")) || Intrinsics.m87488d(map.get("sub_trace_c__describe"), map.get("sub_trace_d__describe"))) {
                    return;
                }
            } else if (i != 5) {
                continue;
            } else {
                map.put("sub_trace_e_execute_time", String.valueOf(o3g0Var.getTotalTime()));
                map.put("sub_trace_e_current_time", String.valueOf(o3g0Var.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String()));
                map.put("sub_trace_e__describe", o3g0Var.getDescribe());
                if (Intrinsics.m87488d(map.get("sub_trace_a__describe"), map.get("sub_trace_e__describe")) || Intrinsics.m87488d(map.get("sub_trace_b__describe"), map.get("sub_trace_e__describe")) || Intrinsics.m87488d(map.get("sub_trace_c__describe"), map.get("sub_trace_e__describe")) || Intrinsics.m87488d(map.get("sub_trace_d__describe"), map.get("sub_trace_e__describe"))) {
                    return;
                }
            }
            i = i2;
        }
        for (o3g0 o3g0Var2 : bean.m201530c()) {
            bean.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String();
            o3g0Var2.getDescribe();
            o3g0Var2.getTotalTime();
            bean.getExtras();
            pyd.INSTANCE.m172109a();
        }
        zvf0.m220392n(l3fVar, map);
    }
}
