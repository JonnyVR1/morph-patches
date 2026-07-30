package p009l;

import android.text.TextUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import l.vwb;
import l.wb50;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ll/cc50;", "", "<init>", "()V", "", "", "urls", "", "isReplace", "c", "(Ljava/util/List;Z)Ljava/lang/String;", "Lkotlin/Lazy;", "Ll/zpd0;", "a", "Lkotlin/Lazy;", "b", "()Lkotlin/Lazy;", "installInfoReportTime", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cc50 {

    @NotNull
    public static final cc50 INSTANCE = new cc50();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy<zpd0> installInfoReportTime = LazyKt__LazyJVMKt.a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.bc50
        public final Object invoke() {
            return cc50.m12476a();
        }
    });

    /* JADX INFO: renamed from: a */
    public static zpd0 m12476a() {
        return new zpd0("oms_app_install_info_report_time", 0L);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Lazy<zpd0> m12477b() {
        return installInfoReportTime;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m12478c(@Nullable List<String> urls, boolean isReplace) {
        List<String> list = urls;
        if (vwb.J(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        urls.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!TextUtils.isEmpty(urls.get(i))) {
                String strF = urls.get(i);
                if (isReplace) {
                    strF = wb50.F(strF);
                    strF.getClass();
                }
                if (sb.length() == 0) {
                    sb.append(strF);
                } else {
                    sb.append(",");
                    sb.append(strF);
                }
            }
        }
        return sb.toString();
    }
}
