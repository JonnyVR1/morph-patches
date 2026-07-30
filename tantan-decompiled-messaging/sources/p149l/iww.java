package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;
import p149l.hww;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iww<P extends hww<?>> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public final Act f115308a;

    /* JADX INFO: renamed from: b */
    public final MarryEditProfileBaseMvpFrag<P, ?> f115309b;

    public iww(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        this.f115308a = act;
        this.f115309b = marryEditProfileBaseMvpFrag;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f115308a;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MarryEditProfileSeriesAct getAct() {
        return (MarryEditProfileSeriesAct) this.f115308a;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo104515b(MarrySeriesType marrySeriesType, User user) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo104516c(MarrySeriesType marrySeriesType);

    /* JADX INFO: renamed from: d */
    public j760<Boolean, String> mo138776d(MarrySeriesType marrySeriesType) {
        return j760.m140076a(Boolean.valueOf(mo104516c(marrySeriesType)), "");
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo104517e(MarrySeriesType marrySeriesType, User user);

    /* JADX INFO: renamed from: f */
    public MarryEditProfileBaseMvpFrag m138777f() {
        return this.f115309b;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo104518i(MarrySeriesType marrySeriesType, User user);

    @Override // p149l.s7m
    public void destroy() {
    }
}
