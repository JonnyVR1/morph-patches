package p149l;

import android.content.Context;
import android.graphics.Color;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class voo extends uk40 {
    public voo(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.gce0.InterfaceC17057a
    /* JADX INFO: renamed from: c */
    public int mo125496c() {
        if (NullChecker.m81303a(this.f184459b) && NullChecker.m81303a(((xaj0) this.f184459b).f191752b)) {
            return ((CoreLikers.C4719a) ((xaj0) this.f184459b).f191752b).f19271c;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC20796w4
    /* JADX INFO: renamed from: m */
    public CharSequence mo128983m() {
        return (!CoreModule.f17545c.f19687u0.m30489x5() || m125494a()) ? (CharSequence) m199190v(mo125497d(), mo125496c(), (User) ((xaj0) this.f184459b).f191751a).second : m201439j().getString(R$string.f18691l6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC20796w4
    /* JADX INFO: renamed from: n */
    public CharSequence mo128984n() {
        return CoreModule.f17545c.f19687u0.m30489x5() ? m199192x(mo125497d()) : (CharSequence) m199190v(mo125497d(), mo125496c(), (User) ((xaj0) this.f184459b).f191751a).first;
    }

    /* JADX INFO: renamed from: v */
    public final Pair<String, String> m199190v(int i, int i2, User user) {
        Pair<String, String> pairCreate;
        String strM133840G = i0g0.m133840G(mo125497d());
        if (i == 0) {
            pairCreate = Pair.create(m201439j().getString(R$string.f18722m6), m201439j().getString(R$string.f18691l6));
        } else if (i2 <= 0) {
            if (NullChecker.m81303a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "male")) {
                pairCreate = Pair.create(m201439j().getString(R$string.f18905s6, strM133840G), m201439j().getString(R$string.f18815p6));
            } else {
                pairCreate = (NullChecker.m81303a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "female")) ? Pair.create(m201439j().getString(R$string.f18875r6, strM133840G), m201439j().getString(R$string.f18784o6)) : Pair.create(m201439j().getString(R$string.f18845q6, strM133840G), m201439j().getString(R$string.f18753n6));
            }
        } else if (NullChecker.m81303a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "male")) {
            pairCreate = Pair.create(m201439j().getString(R$string.f18660k6), m201439j().getString(R$string.f18569h6));
        } else {
            pairCreate = (NullChecker.m81303a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "female")) ? Pair.create(m201439j().getString(R$string.f18629j6), m201439j().getString(R$string.f18538g6)) : Pair.create(m201439j().getString(R$string.f18600i6), m201439j().getString(R$string.f18507f6));
        }
        return pairCreate == null ? Pair.create(m201439j().getString(R$string.f17704Eh), m201439j().getString(R$string.f17614Bh)) : pairCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public CharSequence m199191w(Context context, User user) {
        if (!CoreModule.f17545c.f19687u0.m30489x5()) {
            return yzc0.m216635d((User) ((xaj0) this.f184459b).f191751a, user);
        }
        String strM133876p = i0g0.m133876p(user.location.distance, true);
        boolean zIsFemale = user.isFemale();
        Integer num = user.age;
        return zIsFemale ? i0g0.m133847N(context.getString(R$string.f18555gn, String.valueOf(num), strM133876p), Color.parseColor("#e9ad39"), eqh0.m117752c(2)) : i0g0.m133847N(context.getString(R$string.f18586hn, String.valueOf(num), strM133876p), Color.parseColor("#e9ad39"), eqh0.m117752c(2));
    }

    /* JADX INFO: renamed from: x */
    public final String m199192x(int i) {
        if (i == 0) {
            return m201439j().getString(R$string.f18722m6);
        }
        if (i == 1) {
            return m201439j().getString(R$string.f18832pn);
        }
        return i > 99 ? m201439j().getString(R$string.f18801on, "99+") : m201439j().getString(R$string.f18801on, String.valueOf(i));
    }
}
