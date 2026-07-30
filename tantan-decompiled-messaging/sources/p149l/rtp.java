package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;

/* JADX INFO: loaded from: classes5.dex */
public class rtp implements s7m<xsp> {

    /* JADX INFO: renamed from: a */
    public irp f160982a;

    /* JADX INFO: renamed from: b */
    public mtp f160983b;

    /* JADX INFO: renamed from: c */
    public brp f160984c;

    /* JADX INFO: renamed from: d */
    public xsp f160985d;

    /* JADX INFO: renamed from: e */
    public lrp f160986e;

    public rtp(Act act, xsp xspVar) {
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m180820b() {
        irp irpVar = this.f160982a;
        if (irpVar != null && irpVar.isShowing()) {
            return false;
        }
        mtp mtpVar = this.f160983b;
        if (mtpVar != null && mtpVar.isShowing()) {
            return false;
        }
        brp brpVar = this.f160984c;
        return brpVar == null || !brpVar.isShowing();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xsp xspVar) {
        this.f160985d = xspVar;
    }

    /* JADX INFO: renamed from: d */
    public void m180822d() {
        mtp mtpVar = this.f160983b;
        if (mtpVar != null) {
            mtpVar.dismiss();
        }
        irp irpVar = this.f160982a;
        if (irpVar != null) {
            irpVar.dismiss();
        }
        brp brpVar = this.f160984c;
        if (brpVar != null) {
            brpVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m180823e(DialogInterface dialogInterface) {
        xsp xspVar = this.f160985d;
        xspVar.m210828m4(xspVar.m210821f4(), true);
    }

    /* JADX INFO: renamed from: f */
    public void m180824f(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        mtp mtpVar = this.f160983b;
        if (mtpVar != null && mtpVar.isShowing()) {
            this.f160983b.dismiss();
        }
        irp irpVar = this.f160982a;
        if (irpVar != null && irpVar.isShowing()) {
            this.f160982a.dismiss();
        }
        if (this.f160984c == null) {
            this.f160984c = new brp(this.f160985d);
        }
        this.f160984c.m103593R0(this.f160985d, bLiveVoiceFanBaseDetail);
        if (this.f160984c.isShowing()) {
            return;
        }
        this.f160984c.show();
    }

    /* JADX INFO: renamed from: i */
    public void m180825i(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        brp brpVar = this.f160984c;
        if (brpVar != null && brpVar.isShowing()) {
            this.f160984c.dismiss();
        }
        mtp mtpVar = this.f160983b;
        if (mtpVar != null && mtpVar.isShowing()) {
            this.f160983b.dismiss();
        }
        if (this.f160982a == null) {
            this.f160982a = new irp(this.f160985d);
        }
        this.f160982a.m137910p0(this.f160985d, bLiveVoiceFanBaseDetail);
        if (this.f160982a.isShowing()) {
            return;
        }
        this.f160982a.show();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m180826j(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        if (this.f160986e == null) {
            lrp lrpVar = new lrp(this.f160985d);
            this.f160986e = lrpVar;
            lrpVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qtp
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f156376a.m180823e(dialogInterface);
                }
            });
        }
        this.f160986e.m151502q0(this.f160985d, bLiveVoiceFanBaseDetail);
        this.f160986e.show();
    }

    /* JADX INFO: renamed from: k */
    public void m180827k(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        brp brpVar = this.f160984c;
        if (brpVar != null && brpVar.isShowing()) {
            this.f160984c.dismiss();
        }
        irp irpVar = this.f160982a;
        if (irpVar != null && irpVar.isShowing()) {
            this.f160982a.dismiss();
        }
        if (this.f160983b == null) {
            this.f160983b = new mtp(this.f160985d);
        }
        this.f160983b.m156348w0(this.f160985d, bLiveVoiceFanBaseDetail);
        if (this.f160983b.isShowing()) {
            return;
        }
        this.f160983b.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
