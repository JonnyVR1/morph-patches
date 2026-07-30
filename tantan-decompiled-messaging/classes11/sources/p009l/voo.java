package p009l;

import android.content.Context;
import android.graphics.Color;
import android.util.Pair;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class voo extends uk40 {
    public voo(Context context) {
        super(context);
    }

    @Override // p009l.gce0.InterfaceC0918a
    /* JADX INFO: renamed from: c */
    public int mo14912c() {
        if (NullChecker.a(this.f21884b) && NullChecker.a(((xaj0) this.f21884b).b)) {
            return ((CoreLikers.a) ((xaj0) this.f21884b).b).c;
        }
        return 0;
    }

    @Override // p009l.AbstractC1278w4
    /* JADX INFO: renamed from: m */
    public CharSequence mo15382m() {
        return (!CoreModule.c.u0.x5() || m14910a()) ? (CharSequence) m23566v(mo14913d(), mo14912c(), (User) ((xaj0) this.f21884b).a).second : m23864j().getString(R.string.l6);
    }

    @Override // p009l.AbstractC1278w4
    /* JADX INFO: renamed from: n */
    public CharSequence mo15383n() {
        return CoreModule.c.u0.x5() ? m23568x(mo14913d()) : (CharSequence) m23566v(mo14913d(), mo14912c(), (User) ((xaj0) this.f21884b).a).first;
    }

    /* JADX INFO: renamed from: v */
    public final Pair<String, String> m23566v(int i, int i2, User user) {
        Pair<String, String> pairCreate;
        String strM16108G = i0g0.m16108G(mo14913d());
        if (i == 0) {
            pairCreate = Pair.create(m23864j().getString(R.string.m6), m23864j().getString(R.string.l6));
        } else if (i2 <= 0) {
            if (NullChecker.a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "male")) {
                pairCreate = Pair.create(m23864j().getString(R.string.s6, strM16108G), m23864j().getString(R.string.p6));
            } else {
                pairCreate = (NullChecker.a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "female")) ? Pair.create(m23864j().getString(R.string.r6, strM16108G), m23864j().getString(R.string.o6)) : Pair.create(m23864j().getString(R.string.q6, strM16108G), m23864j().getString(R.string.n6));
            }
        } else if (NullChecker.a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "male")) {
            pairCreate = Pair.create(m23864j().getString(R.string.k6), m23864j().getString(R.string.h6));
        } else {
            pairCreate = (NullChecker.a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "female")) ? Pair.create(m23864j().getString(R.string.j6), m23864j().getString(R.string.g6)) : Pair.create(m23864j().getString(R.string.i6), m23864j().getString(R.string.f6));
        }
        return pairCreate == null ? Pair.create(m23864j().getString(R.string.Eh), m23864j().getString(R.string.Bh)) : pairCreate;
    }

    /* JADX INFO: renamed from: w */
    public CharSequence m23567w(Context context, User user) {
        if (!CoreModule.c.u0.x5()) {
            return yzc0.m25567d((User) ((xaj0) this.f21884b).a, user);
        }
        String strM16144p = i0g0.m16144p(user.location.distance, true);
        boolean zIsFemale = user.isFemale();
        Integer num = user.age;
        return zIsFemale ? i0g0.m16115N(context.getString(R.string.gn, String.valueOf(num), strM16144p), Color.parseColor("#e9ad39"), eqh0.c(2)) : i0g0.m16115N(context.getString(R.string.hn, String.valueOf(num), strM16144p), Color.parseColor("#e9ad39"), eqh0.c(2));
    }

    /* JADX INFO: renamed from: x */
    public final String m23568x(int i) {
        if (i == 0) {
            return m23864j().getString(R.string.m6);
        }
        if (i == 1) {
            return m23864j().getString(R.string.pn);
        }
        return i > 99 ? m23864j().getString(R.string.on, "99+") : m23864j().getString(R.string.on, String.valueOf(i));
    }
}
