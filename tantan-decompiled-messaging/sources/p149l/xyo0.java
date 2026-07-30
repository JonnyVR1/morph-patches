package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class xyo0<D extends nnn0> implements s7m<fzo0<D>> {

    /* JADX INFO: renamed from: a */
    public zsn0 f195099a;

    /* JADX INFO: renamed from: b */
    public byr f195100b;

    /* JADX INFO: renamed from: c */
    public fzo0<D> f195101c;

    /* JADX INFO: renamed from: d */
    public final e30<String> f195102d = new C21263a();

    /* JADX INFO: renamed from: l.xyo0$a */
    public class C21263a implements e30<String> {
        public C21263a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            if (NullChecker.m81303a(xyo0.this.f195101c)) {
                xyo0.this.f195101c.m123907J4(str);
            }
            xyo0.this.m211867e();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(fzo0<D> fzo0Var) {
        this.f195101c = fzo0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m211867e() {
        if (isShowing()) {
            this.f195100b.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m211868f(View view) {
        this.f195100b.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m211869i(View view) {
        this.f195100b.dismiss();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return NullChecker.m81303a(this.f195099a) && this.f195100b.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m211870j(List<gzo0> list) {
        if (NullChecker.m81303a(this.f195099a)) {
            zsn0 zsn0Var = this.f195099a;
            fzo0<D> fzo0Var = this.f195101c;
            zsn0Var.m220053h(list, fzo0Var, fzo0Var.f99988m.f135304a.f56011id, this.f195102d);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m211871k(List<gzo0> list) {
        if (this.f195100b == null) {
            this.f195099a = new zsn0(this.f195101c.act());
            this.f195100b = new byr(this.f195101c, this.f195099a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
            xdl0.m208329E0(this.f195099a._empty, new View.OnClickListener() { // from class: l.vyo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183543a.m211868f(view);
                }
            });
            xdl0.m208329E0(this.f195099a._cancel, new View.OnClickListener() { // from class: l.wyo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f188581a.m211869i(view);
                }
            });
        }
        zsn0 zsn0Var = this.f195099a;
        fzo0<D> fzo0Var = this.f195101c;
        zsn0Var.m220053h(list, fzo0Var, fzo0Var.f99988m.f135304a.f56011id, this.f195102d);
        this.f195100b.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
