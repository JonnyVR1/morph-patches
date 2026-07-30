package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C14744gj;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public class rmq0 {

    /* JADX INFO: renamed from: a */
    private static SimpleDateFormat f160113a;

    /* JADX INFO: renamed from: b */
    private static String f160114b;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f160113a = simpleDateFormat;
        f160114b = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: a */
    public static C14744gj m180045a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C14744gj c14744gj = new C14744gj();
        c14744gj.m85632d("category_push_stat");
        c14744gj.m85613a("push_sdk_stat_channel");
        c14744gj.m85612a(1L);
        c14744gj.m85624b(str);
        c14744gj.m85615a(true);
        c14744gj.m85623b(System.currentTimeMillis());
        c14744gj.m85640g(hmq0.m131742d(context).m131748b());
        c14744gj.m85635e("com.xiaomi.xmsf");
        c14744gj.m85638f("");
        c14744gj.m85628c("push_stat");
        return c14744gj;
    }
}
