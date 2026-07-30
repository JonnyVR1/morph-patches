package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public class dsv implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f87793b = new dsv();

    /* JADX INFO: renamed from: d */
    public static j4m m113497d() {
        return f87793b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        return !TextUtils.isEmpty(pi6Var.f149101a.localDraft);
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return m139684c(pi6Var.f149124x.getString(R$string.f19007vi));
    }
}
