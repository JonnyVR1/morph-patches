package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"", "", "b", "(Ljava/lang/String;)Z", "MKBusiness_release"}, m88122k = 2, m88123mv = {1, 4, 0})
public final class zj3 {
    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: b */
    public static final boolean m219965b(@NotNull String str) {
        if (i8g0.m139001c(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        Context contextM155971a = lv0.m155971a();
        contextM155971a.getClass();
        List<ResolveInfo> listQueryIntentActivities = contextM155971a.getPackageManager().queryIntentActivities(intent, 32);
        return (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }
}
