package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;

/* JADX INFO: loaded from: classes5.dex */
public class rvp implements iam<xup> {

    /* JADX INFO: renamed from: a */
    public itp f165045a;

    /* JADX INFO: renamed from: b */
    public mvp f165046b;

    /* JADX INFO: renamed from: c */
    public btp f165047c;

    /* JADX INFO: renamed from: d */
    public xup f165048d;

    /* JADX INFO: renamed from: e */
    public ltp f165049e;

    public rvp(Act act, xup xupVar) {
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m183297b() {
        itp itpVar = this.f165045a;
        if (itpVar != null && itpVar.isShowing()) {
            return false;
        }
        mvp mvpVar = this.f165046b;
        if (mvpVar != null && mvpVar.isShowing()) {
            return false;
        }
        btp btpVar = this.f165047c;
        return btpVar == null || !btpVar.isShowing();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xup xupVar) {
        this.f165048d = xupVar;
    }

    /* JADX INFO: renamed from: d */
    public void m183299d() {
        mvp mvpVar = this.f165046b;
        if (mvpVar != null) {
            mvpVar.dismiss();
        }
        itp itpVar = this.f165045a;
        if (itpVar != null) {
            itpVar.dismiss();
        }
        btp btpVar = this.f165047c;
        if (btpVar != null) {
            btpVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m183300e(DialogInterface dialogInterface) {
        xup xupVar = this.f165048d;
        xupVar.m213181m4(xupVar.m213174f4(), true);
    }

    /* JADX INFO: renamed from: f */
    public void m183301f(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        mvp mvpVar = this.f165046b;
        if (mvpVar != null && mvpVar.isShowing()) {
            this.f165046b.dismiss();
        }
        itp itpVar = this.f165045a;
        if (itpVar != null && itpVar.isShowing()) {
            this.f165045a.dismiss();
        }
        if (this.f165047c == null) {
            this.f165047c = new btp(this.f165048d);
        }
        this.f165047c.m106371R0(this.f165048d, bLiveVoiceFanBaseDetail);
        if (this.f165047c.isShowing()) {
            return;
        }
        this.f165047c.show();
    }

    /* JADX INFO: renamed from: i */
    public void m183302i(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        btp btpVar = this.f165047c;
        if (btpVar != null && btpVar.isShowing()) {
            this.f165047c.dismiss();
        }
        mvp mvpVar = this.f165046b;
        if (mvpVar != null && mvpVar.isShowing()) {
            this.f165046b.dismiss();
        }
        if (this.f165045a == null) {
            this.f165045a = new itp(this.f165048d);
        }
        this.f165045a.m142073p0(this.f165048d, bLiveVoiceFanBaseDetail);
        if (this.f165045a.isShowing()) {
            return;
        }
        this.f165045a.show();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m183303j(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        if (this.f165049e == null) {
            ltp ltpVar = new ltp(this.f165048d);
            this.f165049e = ltpVar;
            ltpVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qvp
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f159792a.m183300e(dialogInterface);
                }
            });
        }
        this.f165049e.m155806q0(this.f165048d, bLiveVoiceFanBaseDetail);
        this.f165049e.show();
    }

    /* JADX INFO: renamed from: k */
    public void m183304k(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        btp btpVar = this.f165047c;
        if (btpVar != null && btpVar.isShowing()) {
            this.f165047c.dismiss();
        }
        itp itpVar = this.f165045a;
        if (itpVar != null && itpVar.isShowing()) {
            this.f165045a.dismiss();
        }
        if (this.f165046b == null) {
            this.f165046b = new mvp(this.f165048d);
        }
        this.f165046b.m160315w0(this.f165048d, bLiveVoiceFanBaseDetail);
        if (this.f165046b.isShowing()) {
            return;
        }
        this.f165046b.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
