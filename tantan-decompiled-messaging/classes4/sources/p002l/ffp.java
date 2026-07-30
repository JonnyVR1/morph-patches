package p002l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.gfp;
import l.kfn;
import l.lfn;
import l.m17;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VRecyclerView;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ffp extends m17 {

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f10316g;

    /* JADX INFO: renamed from: h */
    public VImage f10317h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f10318i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f10319j;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f10320k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f10321l;

    /* JADX INFO: renamed from: m */
    public final Act f10322m;

    /* JADX INFO: renamed from: n */
    public kfn f10323n;

    public ffp(Act act) {
        super(act);
        this.f10322m = act;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m13140I(Throwable th) {
    }

    /* JADX INFO: renamed from: O */
    private String m13145O() {
        List list = CoreModule.K().me_().profile.extensions.basic.intlFriendPurposeV2;
        return !vwb.J(list) ? (String) list.get(0) : "";
    }

    /* JADX INFO: renamed from: P */
    private void m13146P() {
        setContentView(m13153N(LayoutInflater.from(this.f10322m), null));
        List<lfn.a> listC = lfn.INSTANCE.c();
        String strM13145O = m13145O();
        for (lfn.a aVar : listC) {
            aVar.g(TextUtils.equals(aVar.c(), strM13145O));
        }
        kfn kfnVar = new kfn(this.f10322m, listC);
        this.f10323n = kfnVar;
        kfnVar.Q(new kfn.a() { // from class: l.afp
            /* JADX INFO: renamed from: a */
            public final void m9612a(boolean z) {
                this.f7536a.m13154Q(z);
            }
        });
        this.f10320k.setAdapter(this.f10323n);
        xdl0.E0(this.f10317h, new View.OnClickListener() { // from class: l.bfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8105a.m13147R(view);
            }
        });
        xdl0.E0(this.f10321l, new View.OnClickListener() { // from class: l.cfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8653a.m13148S(view);
            }
        });
        this.f10321l.setBackgroundResource(!TextUtils.isEmpty(this.f10323n.N()) ? x2c0.M : x2c0.N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m13147R(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m13148S(View view) {
        String strN = this.f10323n.N();
        if (TextUtils.isEmpty(strN)) {
            return;
        }
        m13156U(strN);
    }

    /* JADX INFO: renamed from: C */
    public boolean m13149C() {
        return true;
    }

    /* JADX INFO: renamed from: F */
    public String m13150F() {
        return "p_intl_tribe_verification_pop";
    }

    /* JADX INFO: renamed from: G */
    public View m13151G() {
        return this.f10316g;
    }

    /* JADX INFO: renamed from: H */
    public boolean m13152H() {
        return true;
    }

    /* JADX INFO: renamed from: N */
    public View m13153N(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gfp.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m13154Q(boolean z) {
        this.f10321l.setBackgroundResource(z ? x2c0.M : x2c0.N);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m13155T(roj0 roj0Var) {
        osi0.f(R.string.vo);
        dismiss();
    }

    /* JADX INFO: renamed from: U */
    public final void m13156U(String str) {
        User userClone = CoreModule.c.e0.na().clone();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ProfileExtensionBasic profileExtensionBasic = userClone.profile.extensions.basic;
        profileExtensionBasic.intlFriendPurpose = arrayList;
        profileExtensionBasic.intlFriendPurposeV2 = arrayList;
        User userSubtract = userClone.subtract(CoreModule.c.e0.na());
        if (NullChecker.a(userSubtract)) {
            this.f10322m.duringCreated(CoreModule.c.e0.v9(userSubtract, "updateIntlInterval")).subscribe(mkd0.H(new e30() { // from class: l.dfp
                public final void call(Object obj) {
                    this.f9202a.m13155T((roj0) obj);
                }
            }, new e30() { // from class: l.efp
                public final void call(Object obj) {
                    ffp.m13140I((Throwable) obj);
                }
            }));
        } else {
            dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m13146P();
    }

    /* JADX INFO: renamed from: z */
    public boolean m13157z() {
        return true;
    }
}
