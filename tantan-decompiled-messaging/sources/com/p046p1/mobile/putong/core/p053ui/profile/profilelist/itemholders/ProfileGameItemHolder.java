package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileItemImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import com.p046p1.mobile.putong.data.ExtensionGame;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.a1m;
import p149l.ah90;
import p149l.et4;
import p149l.f6c0;
import p149l.mcr;
import p149l.o7r;
import p149l.pc8;
import p149l.pm90;
import p149l.t100;
import p149l.u4c0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileGameItemHolder extends ah90 {

    /* JADX INFO: renamed from: z */
    public static final Map<String, Integer> f33991z = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileGameItemHolder.1
        {
            put("王者荣耀", Integer.valueOf(x2c0.f190211hm));
            put("和平精英", Integer.valueOf(x2c0.f190052cm));
            put("蛋仔派对", Integer.valueOf(x2c0.f189925Yl));
            put("原神", Integer.valueOf(x2c0.f189988am));
            put("第五人格", Integer.valueOf(x2c0.f189956Zl));
            put("英雄联盟", Integer.valueOf(x2c0.f190115em));
            put("狼人杀", Integer.valueOf(x2c0.f190242im));
            put("金铲铲之战", Integer.valueOf(x2c0.f190020bm));
            put("其他游戏", Integer.valueOf(x2c0.f190179gm));
        }
    });

    /* JADX INFO: renamed from: u */
    public FlowView f33992u;

    /* JADX INFO: renamed from: v */
    public VLinear f33993v;

    /* JADX INFO: renamed from: w */
    public ProfileItemImageView f33994w;

    /* JADX INFO: renamed from: x */
    public ProfileItemImageView f33995x;

    /* JADX INFO: renamed from: y */
    public ProfileItemImageView f33996y;

    public ProfileGameItemHolder(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public View m52725R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pm90.m170299b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public final View m52726S(String str, int i) {
        View viewInflate = o7r.m163037a(mo52800O().act()).inflate(f6c0.f96014t9, (ViewGroup) this.f33992u, false);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f174496u5);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        vDraweeView.setImageResource(i);
        vText.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m52727T() {
        if (NullChecker.m81303a(mo52800O()) && NullChecker.m81303a(mo52800O().mo51069K2()) && NullChecker.m81303a(mo52800O().mo51069K2().profile) && NullChecker.m81303a(mo52800O().mo51069K2().profile.extensions) && NullChecker.m81303a(mo52800O().mo51069K2().profile.extensions.game)) {
            return pc8.m168317u0(mo52800O().mo51069K2().profile.extensions.game.name) || pc8.m168317u0(mo52800O().mo51069K2().profile.extensions.game.together) || pc8.m168317u0(mo52800O().mo51069K2().profile.extensions.game.level) || pc8.m168317u0(mo52800O().mo51069K2().profile.extensions.game.voice) || pc8.m168317u0(mo52800O().mo51069K2().profile.extensions.game.screenshot);
        }
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(56.0f)) / 3;
        xdl0.m208327D0(iM208412y0, this.f33994w, this.f33995x, this.f33996y);
        xdl0.m208325C0(this.f33994w, iM208412y0);
        xdl0.m208325C0(this.f33995x, iM208412y0);
        xdl0.m208325C0(this.f33996y, iM208412y0);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return !mo52800O().mo51119m0() && m52727T();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m52725R(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        if (mo52800O().mo51069K2().profile.extensions.game == null) {
            mo52800O().mo51069K2().profile.extensions.game = ExtensionGame.new_();
        }
        mo52800O().mo51069K2().profile.extensions.game.nullCheck();
        ArrayList arrayList = new ArrayList();
        for (String str : pc8.m168313q0(mo52800O().mo51069K2().profile.extensions.game.name)) {
            Integer num = f33991z.get(str);
            if (NullChecker.m81303a(num)) {
                View viewM52726S = m52726S(str, num.intValue());
                if (NullChecker.m81303a(viewM52726S)) {
                    arrayList.add(viewM52726S);
                }
            }
        }
        List<String> listM168313q0 = pc8.m168313q0(mo52800O().mo51069K2().profile.extensions.game.together);
        if (!vwb.m200296J(listM168313q0)) {
            View viewM52726S2 = m52726S(et4.m117971a("·", listM168313q0), x2c0.f190273jm);
            if (NullChecker.m81303a(viewM52726S2)) {
                arrayList.add(viewM52726S2);
            }
        }
        List<String> listM168313q1 = pc8.m168313q0(mo52800O().mo51069K2().profile.extensions.game.level);
        if (!vwb.m200296J(listM168313q1)) {
            View viewM52726S3 = m52726S(listM168313q1.get(0), x2c0.f190084dm);
            if (NullChecker.m81303a(viewM52726S3)) {
                arrayList.add(viewM52726S3);
            }
        }
        List<String> listM168313q2 = pc8.m168313q0(mo52800O().mo51069K2().profile.extensions.game.voice);
        if (!vwb.m200296J(listM168313q2)) {
            View viewM52726S4 = m52726S(listM168313q2.get(0), x2c0.f190147fm);
            if (NullChecker.m81303a(viewM52726S4)) {
                arrayList.add(viewM52726S4);
            }
        }
        this.f33992u.setTags(arrayList);
        int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(56.0f)) / 3;
        xdl0.m208327D0(iM208412y0, this.f33994w, this.f33995x, this.f33996y);
        xdl0.m208325C0(this.f33994w, iM208412y0);
        xdl0.m208325C0(this.f33995x, iM208412y0);
        xdl0.m208325C0(this.f33996y, iM208412y0);
        List<String> listM168313q3 = pc8.m168313q0(mo52800O().mo51069K2().profile.extensions.game.screenshot);
        ArrayList arrayListM200324f0 = vwb.m200324f0(this.f33994w, this.f33995x, this.f33996y);
        for (int i = 0; i < Math.min(listM168313q3.size(), 3); i++) {
            String str2 = listM168313q3.get(i);
            if (!TextUtils.isEmpty(str2)) {
                ((ProfileItemImageView) arrayListM200324f0.get(i)).m52889y(mo52800O().mo51069K2().f56011id, str2);
                xdl0.m208344M((View) arrayListM200324f0.get(i), true);
                xdl0.m208344M(this.f33993v, true);
            }
        }
    }
}
