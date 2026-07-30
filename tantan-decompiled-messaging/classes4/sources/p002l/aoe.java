package p002l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.boe;
import l.mcr;
import l.o6j0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VDraweeView;
import v.VLinear;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class aoe extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText f7803A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f7804B;

    /* JADX INFO: renamed from: C */
    public VText f7805C;

    /* JADX INFO: renamed from: D */
    public ImageView f7806D;

    /* JADX INFO: renamed from: E */
    public VLinear f7807E;

    /* JADX INFO: renamed from: F */
    public VDraweeView f7808F;

    /* JADX INFO: renamed from: G */
    public VDraweeView f7809G;

    /* JADX INFO: renamed from: H */
    public VDraweeView f7810H;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f7811u;

    /* JADX INFO: renamed from: v */
    public VText f7812v;

    /* JADX INFO: renamed from: w */
    public VLinear f7813w;

    /* JADX INFO: renamed from: x */
    public VText f7814x;

    /* JADX INFO: renamed from: y */
    public ImageView f7815y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f7816z;

    public aoe(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m9956T(View view) {
        o6j0.c("e_edit_profile_pet", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.PET);
    }

    /* JADX INFO: renamed from: S */
    public View m9957S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return boe.b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return true;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m9957S(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        List list;
        VText vText = this.f7812v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f7803A.setTypeface(typeface);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f7808F);
        arrayList.add(this.f7809G);
        arrayList.add(this.f7810H);
        User userM9268i2 = mo3351O().m9268i2();
        String str = null;
        if (NullChecker.a(userM9268i2) && NullChecker.a(userM9268i2.profile) && NullChecker.a(userM9268i2.profile.extensions) && NullChecker.a(userM9268i2.profile.extensions.wealth)) {
            list = !vwb.J(userM9268i2.profile.extensions.wealth.petImg) ? userM9268i2.profile.extensions.wealth.petImg : null;
            if (!vwb.J(userM9268i2.profile.extensions.wealth.pet)) {
                str = (String) userM9268i2.profile.extensions.wealth.pet.get(0);
            }
        } else {
            list = null;
        }
        xdl0.M(this.f7813w, false);
        xdl0.M(this.f7816z, true);
        if (!TextUtils.isEmpty(str) && (TextUtils.equals(str, "暂无") || TextUtils.equals(str, "已有宠物"))) {
            xdl0.M(this.f7804B, true);
            this.f7805C.setText(str);
            xdl0.M(this.f7806D, false);
        } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str, "暂不透露")) {
            xdl0.M(this.f7804B, false);
            xdl0.M(this.f7806D, true);
        }
        if (vwb.J(list) || !TextUtils.equals(str, "已有宠物")) {
            xdl0.M(this.f7807E, false);
        } else {
            xdl0.M(this.f7813w, true);
            xdl0.M(this.f7816z, false);
            this.f7814x.setText(str);
            xdl0.M(this.f7807E, true);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xdl0.M((VDraweeView) it.next(), false);
            }
            for (int i = 0; i < Math.min(list.size(), 3); i++) {
                String str2 = (String) list.get(i);
                View view = (VDraweeView) arrayList.get(i);
                xdl0.M(view, true);
                qib0.G.L0(view, str2);
                int iD = (t100.c().widthPixels - t100.d(60.0f)) / 3;
                xdl0.D0(iD, new View[]{view});
                xdl0.C0(view, iD);
            }
        }
        xdl0.E0(this.f7811u, new View.OnClickListener() { // from class: l.zne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f23519a.m9956T(view2);
            }
        });
    }
}
