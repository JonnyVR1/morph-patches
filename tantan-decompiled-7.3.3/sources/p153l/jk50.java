package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/jk50;", "", "<init>", "()V", "", "", "urls", "", "isReplace", "c", "(Ljava/util/List;Z)Ljava/lang/String;", "Lkotlin/Lazy;", "Ll/byd0;", "a", "Lkotlin/Lazy;", "b", "()Lkotlin/Lazy;", "installInfoReportTime", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class jk50 {

    @NotNull
    public static final jk50 INSTANCE = new jk50();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy<byd0> installInfoReportTime = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.ik50
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return jk50.m145153a();
        }
    });

    /* JADX INFO: renamed from: a */
    public static byd0 m145153a() {
        return new byd0("oms_app_install_info_report_time", 0L);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Lazy<byd0> m145154b() {
        return installInfoReportTime;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m145155c(@Nullable List<String> urls, boolean isReplace) {
        List<String> list = urls;
        if (jyb.m147479J(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        urls.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!TextUtils.isEmpty(urls.get(i))) {
                String strM116217F = urls.get(i);
                if (isReplace) {
                    strM116217F = dk50.m116217F(strM116217F);
                    strM116217F.getClass();
                }
                if (sb.length() == 0) {
                    sb.append(strM116217F);
                } else {
                    sb.append(Constants.SEPARATOR_COMMA);
                    sb.append(strM116217F);
                }
            }
        }
        return sb.toString();
    }
}
