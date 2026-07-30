package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dsv implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f11980b = new dsv();

    /* JADX INFO: renamed from: d */
    public static j4m m13468d() {
        return f11980b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        return !TextUtils.isEmpty(pi6Var.f18622a.localDraft);
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return m16869c(pi6Var.f18645x.getString(R.string.vi));
    }
}
