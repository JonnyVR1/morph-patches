package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class ft4 implements z6m {

    /* JADX INFO: renamed from: c */
    public static final z6m f100714c = new ft4();

    /* JADX INFO: renamed from: b */
    public String f100715b = "";

    /* JADX INFO: renamed from: d */
    public static z6m m127293d() {
        return f100714c;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        if (tcu.m190496d().mo95724a(sj6Var, message) || !CoreModule.f18264c.f20384f0.m33916bo(sj6Var.f168927b, sj6Var.f168926a)) {
            return false;
        }
        String strM195688I0 = sj6Var.f168913D.m195688I0(sj6Var.f168927b, sj6Var.f168926a);
        this.f100715b = strM195688I0;
        return !TextUtils.isEmpty(strM195688I0);
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return c17.m107526s0(this.f100715b, TEnum.equals(sj6Var.f168926a.additional.tag.type, "birthday") ? -31301 : -98787);
    }
}
