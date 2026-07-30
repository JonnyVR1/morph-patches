package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class aoe extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText f70843A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f70844B;

    /* JADX INFO: renamed from: C */
    public VText f70845C;

    /* JADX INFO: renamed from: D */
    public ImageView f70846D;

    /* JADX INFO: renamed from: E */
    public VLinear f70847E;

    /* JADX INFO: renamed from: F */
    public VDraweeView f70848F;

    /* JADX INFO: renamed from: G */
    public VDraweeView f70849G;

    /* JADX INFO: renamed from: H */
    public VDraweeView f70850H;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f70851u;

    /* JADX INFO: renamed from: v */
    public VText f70852v;

    /* JADX INFO: renamed from: w */
    public VLinear f70853w;

    /* JADX INFO: renamed from: x */
    public VText f70854x;

    /* JADX INFO: renamed from: y */
    public ImageView f70855y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f70856z;

    public aoe(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m97893T(View view) {
        o6j0.m162859c("e_edit_profile_pet", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.PET);
    }

    /* JADX INFO: renamed from: S */
    public View m97894S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return boe.m102942b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m97894S(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        List<String> list;
        VText vText = this.f70852v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f70843A.setTypeface(typeface);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f70848F);
        arrayList.add(this.f70849G);
        arrayList.add(this.f70850H);
        User userM94569i2 = mo52800O().m94569i2();
        String str = null;
        if (NullChecker.m81303a(userM94569i2) && NullChecker.m81303a(userM94569i2.profile) && NullChecker.m81303a(userM94569i2.profile.extensions) && NullChecker.m81303a(userM94569i2.profile.extensions.wealth)) {
            list = !vwb.m200296J(userM94569i2.profile.extensions.wealth.petImg) ? userM94569i2.profile.extensions.wealth.petImg : null;
            if (!vwb.m200296J(userM94569i2.profile.extensions.wealth.pet)) {
                str = userM94569i2.profile.extensions.wealth.pet.get(0);
            }
        } else {
            list = null;
        }
        xdl0.m208344M(this.f70853w, false);
        xdl0.m208344M(this.f70856z, true);
        if (!TextUtils.isEmpty(str) && (TextUtils.equals(str, "暂无") || TextUtils.equals(str, "已有宠物"))) {
            xdl0.m208344M(this.f70844B, true);
            this.f70845C.setText(str);
            xdl0.m208344M(this.f70846D, false);
        } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str, "暂不透露")) {
            xdl0.m208344M(this.f70844B, false);
            xdl0.m208344M(this.f70846D, true);
        }
        if (vwb.m200296J(list) || !TextUtils.equals(str, "已有宠物")) {
            xdl0.m208344M(this.f70847E, false);
        } else {
            xdl0.m208344M(this.f70853w, true);
            xdl0.m208344M(this.f70856z, false);
            this.f70854x.setText(str);
            xdl0.m208344M(this.f70847E, true);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xdl0.m208344M((VDraweeView) it.next(), false);
            }
            for (int i = 0; i < Math.min(list.size(), 3); i++) {
                String str2 = list.get(i);
                VDraweeView vDraweeView = (VDraweeView) arrayList.get(i);
                xdl0.m208344M(vDraweeView, true);
                qib0.f154691G.m102331L0(vDraweeView, str2);
                int iM186890d = (t100.m186889c().widthPixels - t100.m186890d(60.0f)) / 3;
                xdl0.m208327D0(iM186890d, vDraweeView);
                xdl0.m208325C0(vDraweeView, iM186890d);
            }
        }
        xdl0.m208329E0(this.f70851u, new View.OnClickListener() { // from class: l.zne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203977a.m97893T(view);
            }
        });
    }
}
