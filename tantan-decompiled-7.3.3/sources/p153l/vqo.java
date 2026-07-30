package p153l;

import android.content.Context;
import android.graphics.Color;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class vqo extends it40 {
    public vqo(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.lke0.InterfaceC18406a
    /* JADX INFO: renamed from: c */
    public int mo138035c() {
        if (NullChecker.m82486a(this.f177418b) && NullChecker.m82486a(((bkj0) this.f177418b).f77082b)) {
            return ((CoreLikers.C4870a) ((bkj0) this.f177418b).f77082b).f20013c;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC20482u4
    /* JADX INFO: renamed from: m */
    public CharSequence mo119961m() {
        return (!CoreModule.f18264c.f20429u0.m31378B5() || m154643a()) ? (CharSequence) m202441v(mo142015d(), mo138035c(), (User) ((bkj0) this.f177418b).f77081a).second : m194456j().getString(R$string.f19483n6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC20482u4
    /* JADX INFO: renamed from: n */
    public CharSequence mo119962n() {
        return CoreModule.f18264c.f20429u0.m31378B5() ? m202443x(mo142015d()) : (CharSequence) m202441v(mo142015d(), mo138035c(), (User) ((bkj0) this.f177418b).f77081a).first;
    }

    /* JADX INFO: renamed from: v */
    public final Pair<String, String> m202441v(int i, int i2, User user) {
        Pair<String, String> pairCreate;
        String strM175775G = q8g0.m175775G(mo142015d());
        if (i == 0) {
            pairCreate = Pair.create(m194456j().getString(R$string.f19514o6), m194456j().getString(R$string.f19483n6));
        } else if (i2 <= 0) {
            if (NullChecker.m82486a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "male")) {
                pairCreate = Pair.create(m194456j().getString(R$string.f19700u6, strM175775G), m194456j().getString(R$string.f19607r6));
            } else {
                pairCreate = (NullChecker.m82486a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "female")) ? Pair.create(m194456j().getString(R$string.f19669t6, strM175775G), m194456j().getString(R$string.f19576q6)) : Pair.create(m194456j().getString(R$string.f19638s6, strM175775G), m194456j().getString(R$string.f19545p6));
            }
        } else if (NullChecker.m82486a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "male")) {
            pairCreate = Pair.create(m194456j().getString(R$string.f19452m6), m194456j().getString(R$string.f19359j6));
        } else {
            pairCreate = (NullChecker.m82486a(user.settings) && TEnum.equals(user.settings.getLookingFor(), "female")) ? Pair.create(m194456j().getString(R$string.f19421l6), m194456j().getString(R$string.f19330i6)) : Pair.create(m194456j().getString(R$string.f19390k6), m194456j().getString(R$string.f19299h6));
        }
        return pairCreate == null ? Pair.create(m194456j().getString(R$string.f19064Zh), m194456j().getString(R$string.f18974Wh)) : pairCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public CharSequence m202442w(Context context, User user) {
        if (!CoreModule.f18264c.f20429u0.m31378B5()) {
            return b8d0.m102964d((User) ((bkj0) this.f177418b).f77081a, user);
        }
        String strM175811p = q8g0.m175811p(user.location.distance, true);
        boolean zIsFemale = user.isFemale();
        Integer num = user.age;
        return zIsFemale ? q8g0.m175782N(context.getString(R$string.f18371Cn, String.valueOf(num), strM175811p), Color.parseColor("#e9ad39"), lyh0.m156283c(2)) : q8g0.m175782N(context.getString(R$string.f18402Dn, String.valueOf(num), strM175811p), Color.parseColor("#e9ad39"), lyh0.m156283c(2));
    }

    /* JADX INFO: renamed from: x */
    public final String m202443x(int i) {
        if (i == 0) {
            return m194456j().getString(R$string.f19514o6);
        }
        if (i == 1) {
            return m194456j().getString(R$string.f18650Ln);
        }
        return i > 99 ? m194456j().getString(R$string.f18619Kn, "99+") : m194456j().getString(R$string.f18619Kn, String.valueOf(i));
    }
}
