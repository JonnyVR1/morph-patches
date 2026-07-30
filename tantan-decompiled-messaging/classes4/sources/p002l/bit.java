package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.data.Pagination;
import l.t9u;
import l.uvr;
import l.vb20;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bit {

    /* JADX INFO: renamed from: a */
    public final String f8169a;

    /* JADX INFO: renamed from: b */
    public final String f8170b;

    public bit(String str, String str2) {
        this.f8170b = str;
        this.f8169a = str2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10375a() {
        return uvr.d().G0();
    }

    /* JADX INFO: renamed from: b */
    public c<t9u> m10376b() {
        String str;
        String str2 = this.f8170b;
        int i = LivingNormalApiProvider.f3727b;
        if (TextUtils.isEmpty(this.f8169a)) {
            str = null;
        } else {
            str = "subSource=" + this.f8169a;
        }
        return LivingNormalApiProvider.m4875l5("suggested", str2, "swipe-in-room", i, null, false, str, m10375a());
    }

    /* JADX INFO: renamed from: c */
    public c<t9u> m10377c(t9u t9uVar) {
        String str;
        if (t9uVar == null || !t9uVar.t()) {
            return c.create(new vb20());
        }
        String str2 = this.f8170b;
        int i = LivingNormalApiProvider.f3727b;
        Pagination paginationR = t9uVar.r();
        if (TextUtils.isEmpty(this.f8169a)) {
            str = null;
        } else {
            str = "subSource=" + this.f8169a;
        }
        return LivingNormalApiProvider.m4992y5("suggested", str2, "swipe-in-room", i, paginationR, str, m10375a());
    }
}
