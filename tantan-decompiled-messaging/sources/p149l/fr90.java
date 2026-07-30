package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fr90 extends wq90 {

    /* JADX INFO: renamed from: L */
    public FlowView f98907L;

    /* JADX INFO: renamed from: M */
    public FlowView f98908M;

    /* JADX INFO: renamed from: N */
    public FlowView f98909N;

    /* JADX INFO: renamed from: O */
    public FlowView f98910O;

    /* JADX INFO: renamed from: P */
    public FlowView f98911P;

    /* JADX INFO: renamed from: Q */
    public FlowView f98912Q;

    /* JADX INFO: renamed from: R */
    public mq90 f98913R;

    public fr90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f98913R = new mq90();
    }

    @Override // p149l.wq90, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        VText vText = this.f187665v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f187666w.setTypeface(typeface);
        this.f187667x.setTypeface(typeface);
        this.f187668y.setTypeface(typeface);
        this.f187669z.setTypeface(typeface);
        this.f187653A.setTypeface(typeface);
        this.f187654B.setTypeface(typeface);
    }

    @Override // p149l.wq90, p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewM155877a = this.f98913R.m155877a(mo52800O().mo94568H2(), viewGroup);
        mq90 mq90Var = this.f98913R;
        this.f187664u = mq90Var.f135175a;
        this.f187666w = mq90Var.f135179e;
        this.f187667x = mq90Var.f135183i;
        this.f187668y = mq90Var.f135187m;
        this.f187669z = mq90Var.f135191q;
        this.f187653A = mq90Var.f135195u;
        this.f187654B = mq90Var.f135199y;
        this.f187665v = mq90Var.f135176b;
        this.f187656D = (ImageView) viewM155877a.findViewById(u4c0.f174503uc);
        this.f187657E = (ImageView) viewM155877a.findViewById(u4c0.f173759C8);
        this.f187658F = (ImageView) viewM155877a.findViewById(u4c0.f174512v4);
        this.f187659G = (ImageView) viewM155877a.findViewById(u4c0.f173725A8);
        this.f187660H = (ImageView) viewM155877a.findViewById(u4c0.f174227e7);
        this.f187661I = (ImageView) viewM155877a.findViewById(u4c0.f174365ma);
        this.f98907L = (FlowView) viewM155877a.findViewById(u4c0.f174520vc);
        this.f98908M = (FlowView) viewM155877a.findViewById(u4c0.f173776D8);
        this.f98909N = (FlowView) viewM155877a.findViewById(u4c0.f174529w4);
        this.f98910O = (FlowView) viewM155877a.findViewById(u4c0.f173742B8);
        this.f98911P = (FlowView) viewM155877a.findViewById(u4c0.f174244f7);
        this.f98912Q = (FlowView) viewM155877a.findViewById(u4c0.f174382na);
        m96409E(this.f187666w, this.f98913R.f135177c);
        m96409E(this.f187667x, this.f98913R.f135181g);
        m96409E(this.f187668y, this.f98913R.f135185k);
        m96409E(this.f187654B, this.f98913R.f135197w);
        m96409E(this.f187653A, this.f98913R.f135193s);
        m96409E(this.f187669z, this.f98913R.f135189o);
        return viewM155877a;
    }

    @Override // p149l.wq90, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        super.mo52731t();
        User userMo51069K2 = mo52800O().mo51069K2();
        final User userMo52295me = mo52800O().mo52295me();
        if (userMo51069K2 == null || userMo52295me == null) {
            return;
        }
        ArrayList arrayListM200339n = vwb.m200339n(userMo51069K2.profile.tags, new w9j() { // from class: l.yq90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo52295me.profile.tags.contains(tag) && !TextUtils.equals(tag.category, "personality"));
            }
        });
        this.f98913R.f135176b.setTypeface(Typeface.DEFAULT_BOLD);
        if (vwb.m200296J(arrayListM200339n) || mo52800O().mo51075P1()) {
            this.f98913R.f135176b.setText(R$string.f18614il);
        } else {
            this.f98913R.f135176b.setText(mo52800O().act().getString(R$string.f18368al, Integer.valueOf(arrayListM200339n.size())));
        }
        if (mo52800O().mo51075P1()) {
            this.f187656D.setImageResource(x2c0.f190085dn);
            this.f187657E.setImageResource(x2c0.f189368Gm);
            this.f187659G.setImageResource(x2c0.f189304Em);
            this.f187658F.setImageResource(x2c0.f189894Xl);
            this.f187660H.setImageResource(x2c0.f189926Ym);
            this.f187661I.setImageResource(x2c0.f190212hn);
            return;
        }
        boolean zM200296J = vwb.m200296J(vwb.m200339n(userMo51069K2.profile.tags, new w9j() { // from class: l.zq90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo52295me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "sports"));
            }
        }));
        ImageView imageView = this.f187656D;
        if (zM200296J) {
            imageView.setImageResource(x2c0.f190085dn);
        } else {
            imageView.setImageResource(x2c0.f190053cn);
        }
        boolean zM200296J2 = vwb.m200296J(vwb.m200339n(userMo51069K2.profile.tags, new w9j() { // from class: l.ar90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo52295me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "music"));
            }
        }));
        ImageView imageView2 = this.f187657E;
        if (zM200296J2) {
            imageView2.setImageResource(x2c0.f189368Gm);
        } else {
            imageView2.setImageResource(x2c0.f189336Fm);
        }
        boolean zM200296J3 = vwb.m200296J(vwb.m200339n(userMo51069K2.profile.tags, new w9j() { // from class: l.br90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo52295me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "food"));
            }
        }));
        ImageView imageView3 = this.f187658F;
        if (zM200296J3) {
            imageView3.setImageResource(x2c0.f189894Xl);
        } else {
            imageView3.setImageResource(x2c0.f189863Wl);
        }
        boolean zM200296J4 = vwb.m200296J(vwb.m200339n(userMo51069K2.profile.tags, new w9j() { // from class: l.cr90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo52295me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "movies"));
            }
        }));
        ImageView imageView4 = this.f187659G;
        if (zM200296J4) {
            imageView4.setImageResource(x2c0.f189304Em);
        } else {
            imageView4.setImageResource(x2c0.f189272Dm);
        }
        boolean zM200296J5 = vwb.m200296J(vwb.m200339n(userMo51069K2.profile.tags, new w9j() { // from class: l.dr90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo52295me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "literature"));
            }
        }));
        ImageView imageView5 = this.f187660H;
        if (zM200296J5) {
            imageView5.setImageResource(x2c0.f189926Ym);
        } else {
            imageView5.setImageResource(x2c0.f189895Xm);
        }
        boolean zM200296J6 = vwb.m200296J(vwb.m200339n(userMo51069K2.profile.tags, new w9j() { // from class: l.er90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo52295me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "places"));
            }
        }));
        ImageView imageView6 = this.f187661I;
        if (zM200296J6) {
            imageView6.setImageResource(x2c0.f190212hn);
        } else {
            imageView6.setImageResource(x2c0.f190180gn);
        }
    }
}
