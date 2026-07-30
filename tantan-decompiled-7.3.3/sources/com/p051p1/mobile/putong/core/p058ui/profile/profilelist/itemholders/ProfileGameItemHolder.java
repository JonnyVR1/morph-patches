package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileItemImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import com.p051p1.mobile.putong.data.ExtensionGame;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.du4;
import p153l.ep90;
import p153l.jyb;
import p153l.kec0;
import p153l.ner;
import p153l.p9r;
import p153l.qa00;
import p153l.t3m;
import p153l.td8;
import p153l.tu90;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileGameItemHolder extends ep90 {

    /* JADX INFO: renamed from: z */
    public static final Map<String, Integer> f34839z = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileGameItemHolder.1
        {
            put("王者荣耀", Integer.valueOf(dbc0.f86671Vm));
            put("和平精英", Integer.valueOf(dbc0.f86511Qm));
            put("蛋仔派对", Integer.valueOf(dbc0.f86383Mm));
            put("原神", Integer.valueOf(dbc0.f86447Om));
            put("第五人格", Integer.valueOf(dbc0.f86415Nm));
            put("英雄联盟", Integer.valueOf(dbc0.f86575Sm));
            put("狼人杀", Integer.valueOf(dbc0.f86703Wm));
            put("金铲铲之战", Integer.valueOf(dbc0.f86479Pm));
            put("其他游戏", Integer.valueOf(dbc0.f86639Um));
        }
    });

    /* JADX INFO: renamed from: u */
    public FlowView f34840u;

    /* JADX INFO: renamed from: v */
    public VLinear f34841v;

    /* JADX INFO: renamed from: w */
    public ProfileItemImageView f34842w;

    /* JADX INFO: renamed from: x */
    public ProfileItemImageView f34843x;

    /* JADX INFO: renamed from: y */
    public ProfileItemImageView f34844y;

    public ProfileGameItemHolder(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: R */
    public View m53908R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tu90.m192740b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public final View m53909S(String str, int i) {
        View viewInflate = p9r.m171370a(mo53983O().act()).inflate(kec0.f125325A9, (ViewGroup) this.f34840u, false);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70621w5);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        vDraweeView.setImageResource(i);
        vText.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m53910T() {
        if (NullChecker.m82486a(mo53983O()) && NullChecker.m82486a(mo53983O().mo52252K2()) && NullChecker.m82486a(mo53983O().mo52252K2().profile) && NullChecker.m82486a(mo53983O().mo52252K2().profile.extensions) && NullChecker.m82486a(mo53983O().mo52252K2().profile.extensions.game)) {
            return td8.m190611u0(mo53983O().mo52252K2().profile.extensions.game.name) || td8.m190611u0(mo53983O().mo52252K2().profile.extensions.game.together) || td8.m190611u0(mo53983O().mo52252K2().profile.extensions.game.level) || td8.m190611u0(mo53983O().mo52252K2().profile.extensions.game.voice) || td8.m190611u0(mo53983O().mo52252K2().profile.extensions.game.screenshot);
        }
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(56.0f)) / 3;
        bnl0.m105507D0(iM105592y0, this.f34842w, this.f34843x, this.f34844y);
        bnl0.m105505C0(this.f34842w, iM105592y0);
        bnl0.m105505C0(this.f34843x, iM105592y0);
        bnl0.m105505C0(this.f34844y, iM105592y0);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return !mo53983O().mo52302m0() && m53910T();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m53908R(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        if (mo53983O().mo52252K2().profile.extensions.game == null) {
            mo53983O().mo52252K2().profile.extensions.game = ExtensionGame.new_();
        }
        mo53983O().mo52252K2().profile.extensions.game.nullCheck();
        ArrayList arrayList = new ArrayList();
        for (String str : td8.m190607q0(mo53983O().mo52252K2().profile.extensions.game.name)) {
            Integer num = f34839z.get(str);
            if (NullChecker.m82486a(num)) {
                View viewM53909S = m53909S(str, num.intValue());
                if (NullChecker.m82486a(viewM53909S)) {
                    arrayList.add(viewM53909S);
                }
            }
        }
        List<String> listM190607q0 = td8.m190607q0(mo53983O().mo52252K2().profile.extensions.game.together);
        if (!jyb.m147479J(listM190607q0)) {
            View viewM53909S2 = m53909S(du4.m118067a("·", listM190607q0), dbc0.f86735Xm);
            if (NullChecker.m82486a(viewM53909S2)) {
                arrayList.add(viewM53909S2);
            }
        }
        List<String> listM190607q1 = td8.m190607q0(mo53983O().mo52252K2().profile.extensions.game.level);
        if (!jyb.m147479J(listM190607q1)) {
            View viewM53909S3 = m53909S(listM190607q1.get(0), dbc0.f86543Rm);
            if (NullChecker.m82486a(viewM53909S3)) {
                arrayList.add(viewM53909S3);
            }
        }
        List<String> listM190607q2 = td8.m190607q0(mo53983O().mo52252K2().profile.extensions.game.voice);
        if (!jyb.m147479J(listM190607q2)) {
            View viewM53909S4 = m53909S(listM190607q2.get(0), dbc0.f86607Tm);
            if (NullChecker.m82486a(viewM53909S4)) {
                arrayList.add(viewM53909S4);
            }
        }
        this.f34840u.setTags(arrayList);
        int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(56.0f)) / 3;
        bnl0.m105507D0(iM105592y0, this.f34842w, this.f34843x, this.f34844y);
        bnl0.m105505C0(this.f34842w, iM105592y0);
        bnl0.m105505C0(this.f34843x, iM105592y0);
        bnl0.m105505C0(this.f34844y, iM105592y0);
        List<String> listM190607q3 = td8.m190607q0(mo53983O().mo52252K2().profile.extensions.game.screenshot);
        ArrayList arrayListM147507f0 = jyb.m147507f0(this.f34842w, this.f34843x, this.f34844y);
        for (int i = 0; i < Math.min(listM190607q3.size(), 3); i++) {
            String str2 = listM190607q3.get(i);
            if (!TextUtils.isEmpty(str2)) {
                ((ProfileItemImageView) arrayListM147507f0.get(i)).m54072y(mo53983O().mo52252K2().f56859id, str2);
                bnl0.m105524M((View) arrayListM147507f0.get(i), true);
                bnl0.m105524M(this.f34841v, true);
            }
        }
    }
}
