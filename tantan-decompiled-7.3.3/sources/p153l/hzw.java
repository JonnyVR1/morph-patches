package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;
import p153l.gzw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hzw<P extends gzw<?>> implements iam<P> {

    /* JADX INFO: renamed from: a */
    public final Act f112307a;

    /* JADX INFO: renamed from: b */
    public final MarryEditProfileBaseMvpFrag<P, ?> f112308b;

    public hzw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        this.f112307a = act;
        this.f112308b = marryEditProfileBaseMvpFrag;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112307a;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MarryEditProfileSeriesAct getAct() {
        return (MarryEditProfileSeriesAct) this.f112307a;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo95575b(MarrySeriesType marrySeriesType, User user) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo95576c(MarrySeriesType marrySeriesType);

    /* JADX INFO: renamed from: d */
    public pf60<Boolean, String> mo137939d(MarrySeriesType marrySeriesType) {
        return pf60.m172085a(Boolean.valueOf(mo95576c(marrySeriesType)), "");
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo95577e(MarrySeriesType marrySeriesType, User user);

    /* JADX INFO: renamed from: f */
    public MarryEditProfileBaseMvpFrag m137940f() {
        return this.f112308b;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo95578i(MarrySeriesType marrySeriesType, User user);

    @Override // p153l.iam
    public void destroy() {
    }
}
