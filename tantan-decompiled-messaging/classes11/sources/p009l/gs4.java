package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gs4 implements j4m {

    /* JADX INFO: renamed from: c */
    public static final j4m f13706c = new gs4();

    /* JADX INFO: renamed from: b */
    public String f13707b = "";

    /* JADX INFO: renamed from: d */
    public static j4m m15223d() {
        return f13706c;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        if (sau.m22015d().mo11180a(pi6Var, message) || !CoreModule.c.f0.bo(pi6Var.f18623b, pi6Var.f18622a)) {
            return false;
        }
        String strM21535I0 = pi6Var.f18609D.m21535I0(pi6Var.f18623b, pi6Var.f18622a);
        this.f13707b = strM21535I0;
        return !TextUtils.isEmpty(strM21535I0);
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return zz6.s0(this.f13707b, TEnum.equals(pi6Var.f18622a.additional.tag.type, "birthday") ? -31301 : -98787);
    }
}
