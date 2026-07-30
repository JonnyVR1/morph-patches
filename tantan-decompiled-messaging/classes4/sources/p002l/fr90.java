package p002l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowView;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.mcr;
import l.u4c0;
import l.vwb;
import l.w9j;
import l.x2c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fr90 extends wq90 {

    /* JADX INFO: renamed from: L */
    public FlowView f10604L;

    /* JADX INFO: renamed from: M */
    public FlowView f10605M;

    /* JADX INFO: renamed from: N */
    public FlowView f10606N;

    /* JADX INFO: renamed from: O */
    public FlowView f10607O;

    /* JADX INFO: renamed from: P */
    public FlowView f10608P;

    /* JADX INFO: renamed from: Q */
    public FlowView f10609Q;

    /* JADX INFO: renamed from: R */
    public mq90 f10610R;

    public fr90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f10610R = new mq90();
    }

    @Override // p002l.wq90, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        VText vText = this.f21924v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f21925w.setTypeface(typeface);
        this.f21926x.setTypeface(typeface);
        this.f21927y.setTypeface(typeface);
        this.f21928z.setTypeface(typeface);
        this.f21912A.setTypeface(typeface);
        this.f21913B.setTypeface(typeface);
    }

    @Override // p002l.wq90, p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewM18132a = this.f10610R.m18132a(mo3351O().mo9267H2(), viewGroup);
        mq90 mq90Var = this.f10610R;
        this.f21923u = mq90Var.f15561a;
        this.f21925w = mq90Var.f15565e;
        this.f21926x = mq90Var.f15569i;
        this.f21927y = mq90Var.f15573m;
        this.f21928z = mq90Var.f15577q;
        this.f21912A = mq90Var.f15581u;
        this.f21913B = mq90Var.f15585y;
        this.f21924v = mq90Var.f15562b;
        this.f21915D = (ImageView) viewM18132a.findViewById(u4c0.uc);
        this.f21916E = (ImageView) viewM18132a.findViewById(u4c0.C8);
        this.f21917F = (ImageView) viewM18132a.findViewById(u4c0.v4);
        this.f21918G = (ImageView) viewM18132a.findViewById(u4c0.A8);
        this.f21919H = (ImageView) viewM18132a.findViewById(u4c0.e7);
        this.f21920I = (ImageView) viewM18132a.findViewById(u4c0.ma);
        this.f10604L = (FlowView) viewM18132a.findViewById(u4c0.vc);
        this.f10605M = (FlowView) viewM18132a.findViewById(u4c0.D8);
        this.f10606N = (FlowView) viewM18132a.findViewById(u4c0.w4);
        this.f10607O = (FlowView) viewM18132a.findViewById(u4c0.B8);
        this.f10608P = (FlowView) viewM18132a.findViewById(u4c0.f7);
        this.f10609Q = (FlowView) viewM18132a.findViewById(u4c0.na);
        m9640E(this.f21925w, this.f10610R.f15563c);
        m9640E(this.f21926x, this.f10610R.f15567g);
        m9640E(this.f21927y, this.f10610R.f15571k);
        m9640E(this.f21913B, this.f10610R.f15583w);
        m9640E(this.f21912A, this.f10610R.f15579s);
        m9640E(this.f21928z, this.f10610R.f15575o);
        return viewM18132a;
    }

    @Override // p002l.wq90, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        super.mo3282t();
        User userMo1517K2 = mo3351O().mo1517K2();
        final User userMo2827me = mo3351O().mo2827me();
        if (userMo1517K2 == null || userMo2827me == null) {
            return;
        }
        ArrayList arrayListN = vwb.n(userMo1517K2.profile.tags, new w9j() { // from class: l.yq90
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo2827me.profile.tags.contains(tag) && !TextUtils.equals(tag.category, "personality"));
            }
        });
        this.f10610R.f15562b.setTypeface(Typeface.DEFAULT_BOLD);
        if (vwb.J(arrayListN) || mo3351O().mo1523P1()) {
            this.f10610R.f15562b.setText(R.string.il);
        } else {
            this.f10610R.f15562b.setText(mo3351O().act().getString(R.string.al, Integer.valueOf(arrayListN.size())));
        }
        if (mo3351O().mo1523P1()) {
            this.f21915D.setImageResource(x2c0.dn);
            this.f21916E.setImageResource(x2c0.Gm);
            this.f21918G.setImageResource(x2c0.Em);
            this.f21917F.setImageResource(x2c0.Xl);
            this.f21919H.setImageResource(x2c0.Ym);
            this.f21920I.setImageResource(x2c0.hn);
            return;
        }
        boolean zJ = vwb.J(vwb.n(userMo1517K2.profile.tags, new w9j() { // from class: l.zq90
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo2827me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "sports"));
            }
        }));
        ImageView imageView = this.f21915D;
        if (zJ) {
            imageView.setImageResource(x2c0.dn);
        } else {
            imageView.setImageResource(x2c0.cn);
        }
        boolean zJ2 = vwb.J(vwb.n(userMo1517K2.profile.tags, new w9j() { // from class: l.ar90
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo2827me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "music"));
            }
        }));
        ImageView imageView2 = this.f21916E;
        if (zJ2) {
            imageView2.setImageResource(x2c0.Gm);
        } else {
            imageView2.setImageResource(x2c0.Fm);
        }
        boolean zJ3 = vwb.J(vwb.n(userMo1517K2.profile.tags, new w9j() { // from class: l.br90
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo2827me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "food"));
            }
        }));
        ImageView imageView3 = this.f21917F;
        if (zJ3) {
            imageView3.setImageResource(x2c0.Xl);
        } else {
            imageView3.setImageResource(x2c0.Wl);
        }
        boolean zJ4 = vwb.J(vwb.n(userMo1517K2.profile.tags, new w9j() { // from class: l.cr90
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo2827me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "movies"));
            }
        }));
        ImageView imageView4 = this.f21918G;
        if (zJ4) {
            imageView4.setImageResource(x2c0.Em);
        } else {
            imageView4.setImageResource(x2c0.Dm);
        }
        boolean zJ5 = vwb.J(vwb.n(userMo1517K2.profile.tags, new w9j() { // from class: l.dr90
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo2827me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "literature"));
            }
        }));
        ImageView imageView5 = this.f21919H;
        if (zJ5) {
            imageView5.setImageResource(x2c0.Ym);
        } else {
            imageView5.setImageResource(x2c0.Xm);
        }
        boolean zJ6 = vwb.J(vwb.n(userMo1517K2.profile.tags, new w9j() { // from class: l.er90
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo2827me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "places"));
            }
        }));
        ImageView imageView6 = this.f21920I;
        if (zJ6) {
            imageView6.setImageResource(x2c0.hn);
        } else {
            imageView6.setImageResource(x2c0.gn);
        }
    }
}
