package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.view.ProfileItemImageView;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowView;
import com.p1.mobile.putong.data.ExtensionGame;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.et4;
import l.f6c0;
import l.mcr;
import l.o7r;
import l.pc8;
import l.pm90;
import l.t100;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import p002l.a1m;
import p002l.ah90;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileGameItemHolder extends ah90 {

    /* JADX INFO: renamed from: z */
    public static final Map<String, Integer> f1813z = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileGameItemHolder.1
        {
            put("王者荣耀", Integer.valueOf(x2c0.hm));
            put("和平精英", Integer.valueOf(x2c0.cm));
            put("蛋仔派对", Integer.valueOf(x2c0.Yl));
            put("原神", Integer.valueOf(x2c0.am));
            put("第五人格", Integer.valueOf(x2c0.Zl));
            put("英雄联盟", Integer.valueOf(x2c0.em));
            put("狼人杀", Integer.valueOf(x2c0.im));
            put("金铲铲之战", Integer.valueOf(x2c0.bm));
            put("其他游戏", Integer.valueOf(x2c0.gm));
        }
    });

    /* JADX INFO: renamed from: u */
    public FlowView f1814u;

    /* JADX INFO: renamed from: v */
    public VLinear f1815v;

    /* JADX INFO: renamed from: w */
    public ProfileItemImageView f1816w;

    /* JADX INFO: renamed from: x */
    public ProfileItemImageView f1817x;

    /* JADX INFO: renamed from: y */
    public ProfileItemImageView f1818y;

    public ProfileGameItemHolder(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public View m3276R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pm90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public final View m3277S(String str, int i) {
        View viewInflate = o7r.a(mo3351O().act()).inflate(f6c0.t9, (ViewGroup) this.f1814u, false);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.u5);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        vDraweeViewFindViewById.setImageResource(i);
        vTextFindViewById.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m3278T() {
        if (NullChecker.a(mo3351O()) && NullChecker.a(mo3351O().mo1517K2()) && NullChecker.a(mo3351O().mo1517K2().profile) && NullChecker.a(mo3351O().mo1517K2().profile.extensions) && NullChecker.a(mo3351O().mo1517K2().profile.extensions.game)) {
            return pc8.u0(mo3351O().mo1517K2().profile.extensions.game.name) || pc8.u0(mo3351O().mo1517K2().profile.extensions.game.together) || pc8.u0(mo3351O().mo1517K2().profile.extensions.game.level) || pc8.u0(mo3351O().mo1517K2().profile.extensions.game.voice) || pc8.u0(mo3351O().mo1517K2().profile.extensions.game.screenshot);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        int iY0 = (xdl0.y0() - t100.d(56.0f)) / 3;
        xdl0.D0(iY0, new View[]{this.f1816w, this.f1817x, this.f1818y});
        xdl0.C0(this.f1816w, iY0);
        xdl0.C0(this.f1817x, iY0);
        xdl0.C0(this.f1818y, iY0);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return !mo3351O().mo1570m0() && m3278T();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m3276R(mo3351O().mo9267H2(), viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        if (mo3351O().mo1517K2().profile.extensions.game == null) {
            mo3351O().mo1517K2().profile.extensions.game = ExtensionGame.new_();
        }
        mo3351O().mo1517K2().profile.extensions.game.nullCheck();
        ArrayList arrayList = new ArrayList();
        for (String str : pc8.q0(mo3351O().mo1517K2().profile.extensions.game.name)) {
            Integer num = f1813z.get(str);
            if (NullChecker.a(num)) {
                View viewM3277S = m3277S(str, num.intValue());
                if (NullChecker.a(viewM3277S)) {
                    arrayList.add(viewM3277S);
                }
            }
        }
        List listQ0 = pc8.q0(mo3351O().mo1517K2().profile.extensions.game.together);
        if (!vwb.J(listQ0)) {
            View viewM3277S2 = m3277S(et4.a("·", listQ0), x2c0.jm);
            if (NullChecker.a(viewM3277S2)) {
                arrayList.add(viewM3277S2);
            }
        }
        List listQ1 = pc8.q0(mo3351O().mo1517K2().profile.extensions.game.level);
        if (!vwb.J(listQ1)) {
            View viewM3277S3 = m3277S((String) listQ1.get(0), x2c0.dm);
            if (NullChecker.a(viewM3277S3)) {
                arrayList.add(viewM3277S3);
            }
        }
        List listQ2 = pc8.q0(mo3351O().mo1517K2().profile.extensions.game.voice);
        if (!vwb.J(listQ2)) {
            View viewM3277S4 = m3277S((String) listQ2.get(0), x2c0.fm);
            if (NullChecker.a(viewM3277S4)) {
                arrayList.add(viewM3277S4);
            }
        }
        this.f1814u.setTags(arrayList);
        int iY0 = (xdl0.y0() - t100.d(56.0f)) / 3;
        xdl0.D0(iY0, new View[]{this.f1816w, this.f1817x, this.f1818y});
        xdl0.C0(this.f1816w, iY0);
        xdl0.C0(this.f1817x, iY0);
        xdl0.C0(this.f1818y, iY0);
        List listQ3 = pc8.q0(mo3351O().mo1517K2().profile.extensions.game.screenshot);
        ArrayList arrayListF0 = vwb.f0(new ProfileItemImageView[]{this.f1816w, this.f1817x, this.f1818y});
        for (int i = 0; i < Math.min(listQ3.size(), 3); i++) {
            String str2 = (String) listQ3.get(i);
            if (!TextUtils.isEmpty(str2)) {
                ((ProfileItemImageView) arrayListF0.get(i)).m3442y(((DbObject) mo3351O().mo1517K2()).id, str2);
                xdl0.M((View) arrayListF0.get(i), true);
                xdl0.M(this.f1815v, true);
            }
        }
    }
}
