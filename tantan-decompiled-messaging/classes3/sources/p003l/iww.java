package p003l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import l.j760;
import l.s7m;
import p003l.hww;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class iww<P extends hww<?>> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public final Act f4517a;

    /* JADX INFO: renamed from: b */
    public final MarryEditProfileBaseMvpFrag<P, ?> f4518b;

    public iww(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        this.f4517a = act;
        this.f4518b = marryEditProfileBaseMvpFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5253C0() {
        return this.f4517a;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MarryEditProfileSeriesAct act() {
        return this.f4517a;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo3207b(MarrySeriesType marrySeriesType, User user) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo3208c(MarrySeriesType marrySeriesType);

    /* JADX INFO: renamed from: d */
    public j760<Boolean, String> mo5255d(MarrySeriesType marrySeriesType) {
        return j760.a(Boolean.valueOf(mo3208c(marrySeriesType)), "");
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo3209e(MarrySeriesType marrySeriesType, User user);

    /* JADX INFO: renamed from: f */
    public MarryEditProfileBaseMvpFrag m5256f() {
        return this.f4518b;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo3210i(MarrySeriesType marrySeriesType, User user);

    public void destroy() {
    }
}
