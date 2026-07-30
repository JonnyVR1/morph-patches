package p153l;

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
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\b¨\u0006\u001a"}, m88121d2 = {"Ll/lej0;", "Ll/hr2;", "<init>", "()V", "Ll/aej0;", "bean", "", "g", "(Ll/aej0;)V", "", Constants.KEY_KEY, "", "f", "(Ljava/lang/String;)Z", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "extras", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "describe", "c", "a", "extra", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "h", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class lej0 extends hr2 {

    @NotNull
    public static final lej0 INSTANCE = new lej0();

    /* JADX INFO: renamed from: a */
    public void m153907a(@NotNull String key, @NotNull String describe) {
        key.getClass();
        describe.getClass();
        if (m153912f(key)) {
            iej0.m139619d(iej0.INSTANCE, key, describe, null, 4, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m153908b(@NotNull String key, @NotNull String describe, @NotNull String extra) {
        key.getClass();
        describe.getClass();
        extra.getClass();
        if (m153912f(key)) {
            iej0.INSTANCE.m139620c(key, describe, extra);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m153909c(@NotNull String key, @NotNull String describe) {
        key.getClass();
        describe.getClass();
        if (m153912f(key)) {
            iej0.INSTANCE.m139621e(key, describe);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m153910d(@NotNull String key) {
        key.getClass();
        if (m153912f(key)) {
            iej0.INSTANCE.m139622f(key, "");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m153911e(@NotNull String key, @NotNull String extras) {
        key.getClass();
        extras.getClass();
        if (m153912f(key)) {
            iej0.INSTANCE.m139622f(key, extras);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m153912f(@NotNull String key) {
        key.getClass();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m153913g(@NotNull aej0 bean) {
        bean.getClass();
        if (m153912f(bean.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String())) {
            m153914h(bean);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m153914h(aej0 bean) {
        if (bean.m97251c().size() > 6) {
            return;
        }
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        q4fVar.f155581s = "e_live_custom_trace";
        HashMap map = new HashMap();
        map.put("event_key", bean.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
        if (!TextUtils.isEmpty(bean.getExtras())) {
            map.put("extras", bean.getExtras());
        }
        map.put("device_level", Integer.valueOf(c0e.INSTANCE.m107408a()));
        int i = 0;
        for (Object obj : bean.m97251c()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            vbg0 vbg0Var = (vbg0) obj;
            if (i == 0) {
                map.put("total_execute_time", String.valueOf(vbg0Var.getTotalTime()));
            } else if (i == 1) {
                map.put("sub_trace_a_execute_time", String.valueOf(vbg0Var.getTotalTime()));
                map.put("sub_trace_a_current_time", String.valueOf(vbg0Var.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String()));
                map.put("sub_trace_a__describe", vbg0Var.getDescribe());
            } else if (i == 2) {
                map.put("sub_trace_b_execute_time", String.valueOf(vbg0Var.getTotalTime()));
                map.put("sub_trace_b_current_time", String.valueOf(vbg0Var.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String()));
                map.put("sub_trace_b__describe", vbg0Var.getDescribe());
                if (Intrinsics.m88377d(map.get("sub_trace_a__describe"), map.get("sub_trace_b__describe"))) {
                    return;
                }
            } else if (i == 3) {
                map.put("sub_trace_c_execute_time", String.valueOf(vbg0Var.getTotalTime()));
                map.put("sub_trace_c_current_time", String.valueOf(vbg0Var.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String()));
                map.put("sub_trace_c__describe", vbg0Var.getDescribe());
                if (Intrinsics.m88377d(map.get("sub_trace_a__describe"), map.get("sub_trace_c__describe")) || Intrinsics.m88377d(map.get("sub_trace_b__describe"), map.get("sub_trace_c__describe"))) {
                    return;
                }
            } else if (i == 4) {
                map.put("sub_trace_d_execute_time", String.valueOf(vbg0Var.getTotalTime()));
                map.put("sub_trace_d_current_time", String.valueOf(vbg0Var.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String()));
                map.put("sub_trace_d__describe", vbg0Var.getDescribe());
                if (Intrinsics.m88377d(map.get("sub_trace_a__describe"), map.get("sub_trace_d__describe")) || Intrinsics.m88377d(map.get("sub_trace_b__describe"), map.get("sub_trace_d__describe")) || Intrinsics.m88377d(map.get("sub_trace_c__describe"), map.get("sub_trace_d__describe"))) {
                    return;
                }
            } else if (i != 5) {
                continue;
            } else {
                map.put("sub_trace_e_execute_time", String.valueOf(vbg0Var.getTotalTime()));
                map.put("sub_trace_e_current_time", String.valueOf(vbg0Var.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String()));
                map.put("sub_trace_e__describe", vbg0Var.getDescribe());
                if (Intrinsics.m88377d(map.get("sub_trace_a__describe"), map.get("sub_trace_e__describe")) || Intrinsics.m88377d(map.get("sub_trace_b__describe"), map.get("sub_trace_e__describe")) || Intrinsics.m88377d(map.get("sub_trace_c__describe"), map.get("sub_trace_e__describe")) || Intrinsics.m88377d(map.get("sub_trace_d__describe"), map.get("sub_trace_e__describe"))) {
                    return;
                }
            }
            i = i2;
        }
        for (vbg0 vbg0Var2 : bean.m97251c()) {
            bean.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String();
            vbg0Var2.getDescribe();
            vbg0Var2.getTotalTime();
            bean.getExtras();
            c0e.INSTANCE.m107408a();
        }
        i4g0.m138516n(q4fVar, map);
    }
}
