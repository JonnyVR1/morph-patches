package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class gs4 implements j4m {

    /* JADX INFO: renamed from: c */
    public static final j4m f104139c = new gs4();

    /* JADX INFO: renamed from: b */
    public String f104140b = "";

    /* JADX INFO: renamed from: d */
    public static j4m m127777d() {
        return f104139c;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        if (sau.m183099d().mo94463a(pi6Var, message) || !CoreModule.f17545c.f19642f0.m32913bo(pi6Var.f149102b, pi6Var.f149101a)) {
            return false;
        }
        String strM178894I0 = pi6Var.f149088D.m178894I0(pi6Var.f149102b, pi6Var.f149101a);
        this.f104140b = strM178894I0;
        return !TextUtils.isEmpty(strM178894I0);
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return zz6.m221002s0(this.f104140b, TEnum.equals(pi6Var.f149101a.additional.tag.type, "birthday") ? -31301 : -98787);
    }
}
