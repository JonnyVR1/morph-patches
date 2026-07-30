package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jz90 extends az90 {

    /* JADX INFO: renamed from: L */
    public FlowView f123243L;

    /* JADX INFO: renamed from: M */
    public FlowView f123244M;

    /* JADX INFO: renamed from: N */
    public FlowView f123245N;

    /* JADX INFO: renamed from: O */
    public FlowView f123246O;

    /* JADX INFO: renamed from: P */
    public FlowView f123247P;

    /* JADX INFO: renamed from: Q */
    public FlowView f123248Q;

    /* JADX INFO: renamed from: R */
    public qy90 f123249R;

    public jz90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f123249R = new qy90();
    }

    @Override // p153l.az90, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        VText vText = this.f74115v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f74116w.setTypeface(typeface);
        this.f74117x.setTypeface(typeface);
        this.f74118y.setTypeface(typeface);
        this.f74119z.setTypeface(typeface);
        this.f74103A.setTypeface(typeface);
        this.f74104B.setTypeface(typeface);
    }

    @Override // p153l.az90, p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewM178625a = this.f123249R.m178625a(mo53983O().mo146493H2(), viewGroup);
        qy90 qy90Var = this.f123249R;
        this.f74114u = qy90Var.f160098a;
        this.f74116w = qy90Var.f160102e;
        this.f74117x = qy90Var.f160106i;
        this.f74118y = qy90Var.f160110m;
        this.f74119z = qy90Var.f160114q;
        this.f74103A = qy90Var.f160118u;
        this.f74104B = qy90Var.f160122y;
        this.f74115v = qy90Var.f160099b;
        this.f74106D = (ImageView) viewM178625a.findViewById(adc0.f70628wc);
        this.f74107E = (ImageView) viewM178625a.findViewById(adc0.f69881E8);
        this.f74108F = (ImageView) viewM178625a.findViewById(adc0.f70637x4);
        this.f74109G = (ImageView) viewM178625a.findViewById(adc0.f69847C8);
        this.f74110H = (ImageView) viewM178625a.findViewById(adc0.f70352g7);
        this.f74111I = (ImageView) viewM178625a.findViewById(adc0.f70490oa);
        this.f123243L = (FlowView) viewM178625a.findViewById(adc0.f70645xc);
        this.f123244M = (FlowView) viewM178625a.findViewById(adc0.f69898F8);
        this.f123245N = (FlowView) viewM178625a.findViewById(adc0.f70654y4);
        this.f123246O = (FlowView) viewM178625a.findViewById(adc0.f69864D8);
        this.f123247P = (FlowView) viewM178625a.findViewById(adc0.f70369h7);
        this.f123248Q = (FlowView) viewM178625a.findViewById(adc0.f70507pa);
        m121834E(this.f74116w, this.f123249R.f160100c);
        m121834E(this.f74117x, this.f123249R.f160104g);
        m121834E(this.f74118y, this.f123249R.f160108k);
        m121834E(this.f74104B, this.f123249R.f160120w);
        m121834E(this.f74103A, this.f123249R.f160116s);
        m121834E(this.f74119z, this.f123249R.f160112o);
        return viewM178625a;
    }

    @Override // p153l.az90, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        super.mo53914t();
        User userMo52252K2 = mo53983O().mo52252K2();
        final User userMo53478me = mo53983O().mo53478me();
        if (userMo52252K2 == null || userMo53478me == null) {
            return;
        }
        ArrayList arrayListM147522n = jyb.m147522n(userMo52252K2.profile.tags, new qcj() { // from class: l.cz90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo53478me.profile.tags.contains(tag) && !TextUtils.equals(tag.category, "personality"));
            }
        });
        this.f123249R.f160099b.setTypeface(Typeface.DEFAULT_BOLD);
        if (jyb.m147479J(arrayListM147522n) || mo53983O().mo52258P1()) {
            this.f123249R.f160099b.setText(R$string.f18431El);
        } else {
            this.f123249R.f160099b.setText(mo53983O().act().getString(R$string.f19777wl, Integer.valueOf(arrayListM147522n.size())));
        }
        if (mo53983O().mo52258P1()) {
            this.f74106D.setImageResource(dbc0.f86544Rn);
            this.f74107E.setImageResource(dbc0.f87489un);
            this.f74109G.setImageResource(dbc0.f87423sn);
            this.f74108F.setImageResource(dbc0.f86351Lm);
            this.f74110H.setImageResource(dbc0.f86384Mn);
            this.f74111I.setImageResource(dbc0.f86672Vn);
            return;
        }
        boolean zM147479J = jyb.m147479J(jyb.m147522n(userMo52252K2.profile.tags, new qcj() { // from class: l.dz90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo53478me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "sports"));
            }
        }));
        ImageView imageView = this.f74106D;
        if (zM147479J) {
            imageView.setImageResource(dbc0.f86544Rn);
        } else {
            imageView.setImageResource(dbc0.f86512Qn);
        }
        boolean zM147479J2 = jyb.m147479J(jyb.m147522n(userMo52252K2.profile.tags, new qcj() { // from class: l.ez90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo53478me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "music"));
            }
        }));
        ImageView imageView2 = this.f74107E;
        if (zM147479J2) {
            imageView2.setImageResource(dbc0.f87489un);
        } else {
            imageView2.setImageResource(dbc0.f87456tn);
        }
        boolean zM147479J3 = jyb.m147479J(jyb.m147522n(userMo52252K2.profile.tags, new qcj() { // from class: l.fz90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo53478me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "food"));
            }
        }));
        ImageView imageView3 = this.f74108F;
        if (zM147479J3) {
            imageView3.setImageResource(dbc0.f86351Lm);
        } else {
            imageView3.setImageResource(dbc0.f86319Km);
        }
        boolean zM147479J4 = jyb.m147479J(jyb.m147522n(userMo52252K2.profile.tags, new qcj() { // from class: l.gz90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo53478me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "movies"));
            }
        }));
        ImageView imageView4 = this.f74109G;
        if (zM147479J4) {
            imageView4.setImageResource(dbc0.f87423sn);
        } else {
            imageView4.setImageResource(dbc0.f87390rn);
        }
        boolean zM147479J5 = jyb.m147479J(jyb.m147522n(userMo52252K2.profile.tags, new qcj() { // from class: l.hz90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo53478me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "literature"));
            }
        }));
        ImageView imageView5 = this.f74110H;
        if (zM147479J5) {
            imageView5.setImageResource(dbc0.f86384Mn);
        } else {
            imageView5.setImageResource(dbc0.f86352Ln);
        }
        boolean zM147479J6 = jyb.m147479J(jyb.m147522n(userMo52252K2.profile.tags, new qcj() { // from class: l.iz90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo53478me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "places"));
            }
        }));
        ImageView imageView6 = this.f74111I;
        if (zM147479J6) {
            imageView6.setImageResource(dbc0.f86672Vn);
        } else {
            imageView6.setImageResource(dbc0.f86640Un);
        }
    }
}
