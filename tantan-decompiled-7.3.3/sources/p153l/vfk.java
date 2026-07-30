package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateTypeAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class vfk implements iam<rfk> {

    /* JADX INFO: renamed from: a */
    public VText f183946a;

    /* JADX INFO: renamed from: b */
    public VLinear f183947b;

    /* JADX INFO: renamed from: c */
    public VLinear f183948c;

    /* JADX INFO: renamed from: d */
    public VImage f183949d;

    /* JADX INFO: renamed from: e */
    public final GroupCreateTypeAct f183950e;

    /* JADX INFO: renamed from: f */
    public rfk f183951f;

    /* JADX INFO: renamed from: l.vfk$a */
    public static class C20830a {
        /* JADX INFO: renamed from: b */
        public static void m201176b(vfk vfkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            vfkVar.f183946a = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            vfkVar.f183947b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            vfkVar.f183948c = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
            vfkVar.f183949d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m201177c(vfk vfkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157058k0, viewGroup, false);
            m201176b(vfkVar, viewInflate);
            return viewInflate;
        }
    }

    public vfk(GroupCreateTypeAct groupCreateTypeAct) {
        this.f183950e = groupCreateTypeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m201169l(View view) {
        this.f183950e.lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m201170m(View view) {
        this.f183951f.m181228g0("realname");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m201171n(View view) {
        this.f183951f.m181228g0("anonymous");
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f183950e;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m201172j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m201172j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20830a.m201177c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rfk rfkVar) {
        this.f183951f = rfkVar;
    }

    /* JADX INFO: renamed from: r */
    public void m201174r() {
        if (NullChecker.m82486a(this.f183950e.getSupportActionBar())) {
            this.f183950e.getSupportActionBar().mo102186m();
        }
        bnl0.m105509E0(this.f183949d, new View.OnClickListener() { // from class: l.sfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167724a.m201169l(view);
            }
        });
        bnl0.m105509E0(this.f183947b, new View.OnClickListener() { // from class: l.tfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173976a.m201170m(view);
            }
        });
        bnl0.m105509E0(this.f183948c, new View.OnClickListener() { // from class: l.ufk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178781a.m201171n(view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
