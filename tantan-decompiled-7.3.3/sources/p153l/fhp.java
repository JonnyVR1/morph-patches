package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes4.dex */
public class fhp extends q27 {

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f99088g;

    /* JADX INFO: renamed from: h */
    public VImage f99089h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f99090i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f99091j;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f99092k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f99093l;

    /* JADX INFO: renamed from: m */
    public final Act f99094m;

    /* JADX INFO: renamed from: n */
    public khn f99095n;

    public fhp(Act act) {
        super(act);
        this.f99094m = act;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m125582I(Throwable th) {
    }

    /* JADX INFO: renamed from: O */
    private String m125587O() {
        List<String> list = CoreModule.m30930K().me_().profile.extensions.basic.intlFriendPurposeV2;
        return !jyb.m147479J(list) ? list.get(0) : "";
    }

    /* JADX INFO: renamed from: P */
    private void m125588P() {
        setContentView(m125595N(LayoutInflater.from(this.f99094m), null));
        List<lhn.C18395a> listM154232c = lhn.INSTANCE.m154232c();
        String strM125587O = m125587O();
        for (lhn.C18395a c18395a : listM154232c) {
            c18395a.m154241g(TextUtils.equals(c18395a.getId(), strM125587O));
        }
        khn khnVar = new khn(this.f99094m, listM154232c);
        this.f99095n = khnVar;
        khnVar.m149805Q(new khn.InterfaceC18165a() { // from class: l.ahp
            @Override // p153l.khn.InterfaceC18165a
            /* JADX INFO: renamed from: a */
            public final void mo97883a(boolean z) {
                this.f71390a.m125596Q(z);
            }
        });
        this.f99092k.setAdapter(this.f99095n);
        bnl0.m105509E0(this.f99089h, new View.OnClickListener() { // from class: l.bhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76801a.m125589R(view);
            }
        });
        bnl0.m105509E0(this.f99093l, new View.OnClickListener() { // from class: l.chp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81854a.m125590S(view);
            }
        });
        this.f99093l.setBackgroundResource(!TextUtils.isEmpty(this.f99095n.m149802N()) ? dbc0.f86392N : dbc0.f86424O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m125589R(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m125590S(View view) {
        String strM149802N = this.f99095n.m149802N();
        if (TextUtils.isEmpty(strM149802N)) {
            return;
        }
        m125598U(strM149802N);
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: C */
    public boolean mo125591C() {
        return true;
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: F */
    public String mo125592F() {
        return "p_intl_tribe_verification_pop";
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: G */
    public View mo125593G() {
        return this.f99088g;
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: H */
    public boolean mo125594H() {
        return true;
    }

    /* JADX INFO: renamed from: N */
    public View m125595N(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ghp.m130255b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m125596Q(boolean z) {
        this.f99093l.setBackgroundResource(z ? dbc0.f86392N : dbc0.f86424O);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m125597T(uxj0 uxj0Var) {
        r1j0.m179419f(R$string.f18831Ro);
        dismiss();
    }

    /* JADX INFO: renamed from: U */
    public final void m125598U(String str) {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ProfileExtensionBasic profileExtensionBasic = userMo225055clone.profile.extensions.basic;
        profileExtensionBasic.intlFriendPurpose = arrayList;
        profileExtensionBasic.intlFriendPurposeV2 = arrayList;
        User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116593na());
        if (NullChecker.m82486a(userSubtract)) {
            this.f99094m.duringCreated(CoreModule.f18264c.f20381e0.m116624v9(userSubtract, "updateIntlInterval")).subscribe(psd0.m173597H(new y20() { // from class: l.dhp
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f88547a.m125597T((uxj0) obj);
                }
            }, new y20() { // from class: l.ehp
                @Override // p153l.y20
                public final void call(Object obj) {
                    fhp.m125582I((Throwable) obj);
                }
            }));
        } else {
            dismiss();
        }
    }

    @Override // p153l.q27, com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m125588P();
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: z */
    public boolean mo125599z() {
        return true;
    }
}
