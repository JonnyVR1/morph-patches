package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.group.GroupCreateTypeAct;
import com.tantanapp.common.utils.NullChecker;
import l.l6c0;
import l.s7m;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fdk implements s7m<bdk> {

    /* JADX INFO: renamed from: a */
    public VText f12948a;

    /* JADX INFO: renamed from: b */
    public VLinear f12949b;

    /* JADX INFO: renamed from: c */
    public VLinear f12950c;

    /* JADX INFO: renamed from: d */
    public VImage f12951d;

    /* JADX INFO: renamed from: e */
    public final GroupCreateTypeAct f12952e;

    /* JADX INFO: renamed from: f */
    public bdk f12953f;

    /* JADX INFO: renamed from: l.fdk$a */
    public static class C0896a {
        /* JADX INFO: renamed from: b */
        public static void m14406b(fdk fdkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            fdkVar.f12948a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            fdkVar.f12949b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            fdkVar.f12950c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
            fdkVar.f12951d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m14407c(fdk fdkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.k0, viewGroup, false);
            m14406b(fdkVar, viewInflate);
            return viewInflate;
        }
    }

    public fdk(GroupCreateTypeAct groupCreateTypeAct) {
        this.f12952e = groupCreateTypeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m14397l(View view) {
        this.f12952e.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m14398m(View view) {
        this.f12953f.m11966g0("realname");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m14399n(View view) {
        this.f12953f.m11966g0("anonymous");
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14400C0() {
        return this.f12952e;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m14402j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m14402j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0896a.m14407c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m14401i1(bdk bdkVar) {
        this.f12953f = bdkVar;
    }

    /* JADX INFO: renamed from: r */
    public void m14404r() {
        if (NullChecker.a(this.f12952e.getSupportActionBar())) {
            this.f12952e.getSupportActionBar().m();
        }
        xdl0.E0(this.f12951d, new View.OnClickListener() { // from class: l.cdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10547a.m14397l(view);
            }
        });
        xdl0.E0(this.f12949b, new View.OnClickListener() { // from class: l.ddk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11775a.m14398m(view);
            }
        });
        xdl0.E0(this.f12950c, new View.OnClickListener() { // from class: l.edk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12513a.m14399n(view);
            }
        });
    }

    public void destroy() {
    }
}
