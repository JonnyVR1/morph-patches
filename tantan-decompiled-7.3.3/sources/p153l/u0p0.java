package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetHouseView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetLimitedTimeHouseView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetTabView;
import java.util.List;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class u0p0 extends LiveMenuDialogHolder<kyo0> {

    /* JADX INFO: renamed from: k */
    public VImage f176921k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetHouseView f176922l;

    /* JADX INFO: renamed from: m */
    public VoiceSweetLimitedTimeHouseView f176923m;

    /* JADX INFO: renamed from: n */
    public VoiceSweetTabView f176924n;

    /* JADX INFO: renamed from: o */
    public VImage f176925o;

    /* JADX INFO: renamed from: p */
    public List<BLiveVoiceCpHouseInfo> f176926p;

    /* JADX INFO: renamed from: q */
    public List<BLiveVoiceSweetLimitHouse> f176927q;

    /* JADX INFO: renamed from: r */
    public String f176928r;

    /* JADX INFO: renamed from: s */
    public kyo0 f176929s;

    public u0p0(Act act, kyo0 kyo0Var) {
        super(yec0.f199313xa, act, kyo0Var, qag0.m175924e(true));
    }

    /* JADX INFO: renamed from: L */
    private void m193860L(int i) {
        bnl0.m105524M(this.f176922l, i == 0);
        bnl0.m105524M(this.f176923m, i == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m193861P(View view) {
        mo73021p();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f176929s.act();
    }

    /* JADX INFO: renamed from: J */
    public final void m193862J(View view) {
        v0p0.m198910a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kyo0 kyo0Var) {
        this.f176929s = kyo0Var;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m193864M(Integer num) {
        if (num.intValue() == 1 && !bnl0.m105529O0(this.f176923m)) {
            ryo0.m183633d();
        }
        m193860L(num.intValue());
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m193865N(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        kyo0 kyo0Var = this.f176929s;
        if (kyo0Var != null) {
            kyo0Var.m152100K4(bLiveVoiceCpHouseInfo, str);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m193866O(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, String str) {
        kyo0 kyo0Var = this.f176929s;
        if (kyo0Var != null) {
            kyo0Var.m152101L4(bLiveVoiceSweetLimitHouse, str);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m193867Q(List<BLiveVoiceCpHouseInfo> list, List<BLiveVoiceSweetLimitHouse> list2, String str) {
        this.f176922l.m79714f(list, str);
        this.f176923m.m79720f(list2, str);
    }

    /* JADX INFO: renamed from: R */
    public void m193868R(List<BLiveVoiceSweetLimitHouse> list, String str) {
        VoiceSweetLimitedTimeHouseView voiceSweetLimitedTimeHouseView = this.f176923m;
        if (voiceSweetLimitedTimeHouseView != null) {
            voiceSweetLimitedTimeHouseView.m79720f(list, str);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m193869S(List<BLiveVoiceCpHouseInfo> list, List<BLiveVoiceSweetLimitHouse> list2, String str, int i) {
        if (list == null || list2 == null) {
            return;
        }
        this.f176926p = list;
        this.f176927q = list2;
        this.f176928r = str;
        m73017E();
        if (this.f176922l != null) {
            m193867Q(list, list2, str);
            if (i < 0 || i >= 2) {
                return;
            }
            this.f176924n.m79738f(i);
            m193860L(i);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m193862J(view);
        this.f176924n.m79739g(R$string.f48090fi, R$string.f48506yh);
        this.f176924n.setMargin(false);
        this.f176924n.setOnTabSelectedListener(new y20() { // from class: l.q0p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155075a.m193864M((Integer) obj);
            }
        });
        this.f176922l.setHouseItemClickListener(new z20() { // from class: l.r0p0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f160662a.m193865N((BLiveVoiceCpHouseInfo) obj, (String) obj2);
            }
        });
        this.f176923m.setHouseItemClickListener(new z20() { // from class: l.s0p0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f165717a.m193866O((BLiveVoiceSweetLimitHouse) obj, (String) obj2);
            }
        });
        List<BLiveVoiceCpHouseInfo> list = this.f176926p;
        if (list != null) {
            m193867Q(list, this.f176927q, this.f176928r);
        }
        bnl0.m105509E0(this.f176925o, new View.OnClickListener() { // from class: l.t0p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f171548a.m193861P(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        kyo0 kyo0Var = this.f176929s;
        if (kyo0Var != null) {
            kyo0Var.m152112W4();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo73025x() {
        super.mo73025x();
        kyo0 kyo0Var = this.f176929s;
        if (kyo0Var != null) {
            kyo0Var.m152111V4();
        }
    }
}
