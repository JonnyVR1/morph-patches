package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class epe extends ep90 {

    /* JADX INFO: renamed from: A */
    public VText f95225A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f95226B;

    /* JADX INFO: renamed from: C */
    public VText f95227C;

    /* JADX INFO: renamed from: D */
    public ImageView f95228D;

    /* JADX INFO: renamed from: E */
    public VLinear f95229E;

    /* JADX INFO: renamed from: F */
    public VDraweeView f95230F;

    /* JADX INFO: renamed from: G */
    public VDraweeView f95231G;

    /* JADX INFO: renamed from: H */
    public VDraweeView f95232H;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f95233u;

    /* JADX INFO: renamed from: v */
    public VText f95234v;

    /* JADX INFO: renamed from: w */
    public VLinear f95235w;

    /* JADX INFO: renamed from: x */
    public VText f95236x;

    /* JADX INFO: renamed from: y */
    public ImageView f95237y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f95238z;

    public epe(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m121859T(View view) {
        sfj0.m185596c("e_edit_profile_pet", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.PET);
    }

    /* JADX INFO: renamed from: S */
    public View m121860S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fpe.m126586b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return true;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m121860S(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        List<String> list;
        VText vText = this.f95234v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f95225A.setTypeface(typeface);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f95230F);
        arrayList.add(this.f95231G);
        arrayList.add(this.f95232H);
        User userM189086i2 = mo53983O().m189086i2();
        String str = null;
        if (NullChecker.m82486a(userM189086i2) && NullChecker.m82486a(userM189086i2.profile) && NullChecker.m82486a(userM189086i2.profile.extensions) && NullChecker.m82486a(userM189086i2.profile.extensions.wealth)) {
            list = !jyb.m147479J(userM189086i2.profile.extensions.wealth.petImg) ? userM189086i2.profile.extensions.wealth.petImg : null;
            if (!jyb.m147479J(userM189086i2.profile.extensions.wealth.pet)) {
                str = userM189086i2.profile.extensions.wealth.pet.get(0);
            }
        } else {
            list = null;
        }
        bnl0.m105524M(this.f95235w, false);
        bnl0.m105524M(this.f95238z, true);
        if (!TextUtils.isEmpty(str) && (TextUtils.equals(str, "暂无") || TextUtils.equals(str, "已有宠物"))) {
            bnl0.m105524M(this.f95226B, true);
            this.f95227C.setText(str);
            bnl0.m105524M(this.f95228D, false);
        } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str, "暂不透露")) {
            bnl0.m105524M(this.f95226B, false);
            bnl0.m105524M(this.f95228D, true);
        }
        if (jyb.m147479J(list) || !TextUtils.equals(str, "已有宠物")) {
            bnl0.m105524M(this.f95229E, false);
        } else {
            bnl0.m105524M(this.f95235w, true);
            bnl0.m105524M(this.f95238z, false);
            this.f95236x.setText(str);
            bnl0.m105524M(this.f95229E, true);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bnl0.m105524M((VDraweeView) it.next(), false);
            }
            for (int i = 0; i < Math.min(list.size(), 3); i++) {
                String str2 = list.get(i);
                VDraweeView vDraweeView = (VDraweeView) arrayList.get(i);
                bnl0.m105524M(vDraweeView, true);
                uqb0.f180374G.m127115L0(vDraweeView, str2);
                int iM175859d = (qa00.m175858c().widthPixels - qa00.m175859d(60.0f)) / 3;
                bnl0.m105507D0(iM175859d, vDraweeView);
                bnl0.m105505C0(vDraweeView, iM175859d);
            }
        }
        bnl0.m105509E0(this.f95233u, new View.OnClickListener() { // from class: l.dpe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90045a.m121859T(view);
            }
        });
    }
}
