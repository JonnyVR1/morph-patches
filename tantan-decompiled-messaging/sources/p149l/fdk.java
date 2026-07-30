package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateTypeAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class fdk implements s7m<bdk> {

    /* JADX INFO: renamed from: a */
    public VText f97051a;

    /* JADX INFO: renamed from: b */
    public VLinear f97052b;

    /* JADX INFO: renamed from: c */
    public VLinear f97053c;

    /* JADX INFO: renamed from: d */
    public VImage f97054d;

    /* JADX INFO: renamed from: e */
    public final GroupCreateTypeAct f97055e;

    /* JADX INFO: renamed from: f */
    public bdk f97056f;

    /* JADX INFO: renamed from: l.fdk$a */
    public static class C16811a {
        /* JADX INFO: renamed from: b */
        public static void m120996b(fdk fdkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            fdkVar.f97051a = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            fdkVar.f97052b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            fdkVar.f97053c = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
            fdkVar.f97054d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m120997c(fdk fdkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126502k0, viewGroup, false);
            m120996b(fdkVar, viewInflate);
            return viewInflate;
        }
    }

    public fdk(GroupCreateTypeAct groupCreateTypeAct) {
        this.f97055e = groupCreateTypeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m120989l(View view) {
        this.f97055e.lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m120990m(View view) {
        this.f97056f.m101181g0("realname");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m120991n(View view) {
        this.f97056f.m101181g0("anonymous");
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f97055e;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m120992j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m120992j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16811a.m120997c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bdk bdkVar) {
        this.f97056f = bdkVar;
    }

    /* JADX INFO: renamed from: r */
    public void m120994r() {
        if (NullChecker.m81303a(this.f97055e.getSupportActionBar())) {
            this.f97055e.getSupportActionBar().mo134126m();
        }
        xdl0.m208329E0(this.f97054d, new View.OnClickListener() { // from class: l.cdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80373a.m120989l(view);
            }
        });
        xdl0.m208329E0(this.f97052b, new View.OnClickListener() { // from class: l.ddk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85603a.m120990m(view);
            }
        });
        xdl0.m208329E0(this.f97053c, new View.OnClickListener() { // from class: l.edk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90610a.m120991n(view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
