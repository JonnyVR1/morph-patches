package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes4.dex */
public class ffp extends m17 {

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f97277g;

    /* JADX INFO: renamed from: h */
    public VImage f97278h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f97279i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f97280j;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f97281k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f97282l;

    /* JADX INFO: renamed from: m */
    public final Act f97283m;

    /* JADX INFO: renamed from: n */
    public kfn f97284n;

    public ffp(Act act) {
        super(act);
        this.f97283m = act;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m121164I(Throwable th) {
    }

    /* JADX INFO: renamed from: O */
    private String m121169O() {
        List<String> list = CoreModule.m29932K().me_().profile.extensions.basic.intlFriendPurposeV2;
        return !vwb.m200296J(list) ? list.get(0) : "";
    }

    /* JADX INFO: renamed from: P */
    private void m121170P() {
        setContentView(m121177N(LayoutInflater.from(this.f97283m), null));
        List<lfn.C18216a> listM149728c = lfn.INSTANCE.m149728c();
        String strM121169O = m121169O();
        for (lfn.C18216a c18216a : listM149728c) {
            c18216a.m149737g(TextUtils.equals(c18216a.getId(), strM121169O));
        }
        kfn kfnVar = new kfn(this.f97283m, listM149728c);
        this.f97284n = kfnVar;
        kfnVar.m145872Q(new kfn.InterfaceC18004a() { // from class: l.afp
            @Override // p149l.kfn.InterfaceC18004a
            /* JADX INFO: renamed from: a */
            public final void mo96266a(boolean z) {
                this.f69205a.m121178Q(z);
            }
        });
        this.f97281k.setAdapter(this.f97284n);
        xdl0.m208329E0(this.f97278h, new View.OnClickListener() { // from class: l.bfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75342a.m121171R(view);
            }
        });
        xdl0.m208329E0(this.f97282l, new View.OnClickListener() { // from class: l.cfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80646a.m121172S(view);
            }
        });
        this.f97282l.setBackgroundResource(!TextUtils.isEmpty(this.f97284n.m145869N()) ? x2c0.f189531M : x2c0.f189562N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m121171R(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m121172S(View view) {
        String strM145869N = this.f97284n.m145869N();
        if (TextUtils.isEmpty(strM145869N)) {
            return;
        }
        m121180U(strM145869N);
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: C */
    public boolean mo121173C() {
        return true;
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: F */
    public String mo121174F() {
        return "p_intl_tribe_verification_pop";
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: G */
    public View mo121175G() {
        return this.f97277g;
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: H */
    public boolean mo121176H() {
        return true;
    }

    /* JADX INFO: renamed from: N */
    public View m121177N(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gfp.m125926b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m121178Q(boolean z) {
        this.f97282l.setBackgroundResource(z ? x2c0.f189531M : x2c0.f189562N);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m121179T(roj0 roj0Var) {
        osi0.m165782f(R$string.f19013vo);
        dismiss();
    }

    /* JADX INFO: renamed from: U */
    public final void m121180U(String str) {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ProfileExtensionBasic profileExtensionBasic = userMo223809clone.profile.extensions.basic;
        profileExtensionBasic.intlFriendPurpose = arrayList;
        profileExtensionBasic.intlFriendPurposeV2 = arrayList;
        User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169520na());
        if (NullChecker.m81303a(userSubtract)) {
            this.f97283m.duringCreated(CoreModule.f17545c.f19639e0.m169551v9(userSubtract, "updateIntlInterval")).subscribe(mkd0.m154956H(new e30() { // from class: l.dfp
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f85966a.m121179T((roj0) obj);
                }
            }, new e30() { // from class: l.efp
                @Override // p149l.e30
                public final void call(Object obj) {
                    ffp.m121164I((Throwable) obj);
                }
            }));
        } else {
            dismiss();
        }
    }

    @Override // p149l.m17, com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m121170P();
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: z */
    public boolean mo121181z() {
        return true;
    }
}
