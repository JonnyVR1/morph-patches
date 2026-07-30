package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetHouseView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetLimitedTimeHouseView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetTabView;
import java.util.List;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class qro0 extends LiveMenuDialogHolder<gpo0> {

    /* JADX INFO: renamed from: k */
    public VImage f156013k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetHouseView f156014l;

    /* JADX INFO: renamed from: m */
    public VoiceSweetLimitedTimeHouseView f156015m;

    /* JADX INFO: renamed from: n */
    public VoiceSweetTabView f156016n;

    /* JADX INFO: renamed from: o */
    public VImage f156017o;

    /* JADX INFO: renamed from: p */
    public List<BLiveVoiceCpHouseInfo> f156018p;

    /* JADX INFO: renamed from: q */
    public List<BLiveVoiceSweetLimitHouse> f156019q;

    /* JADX INFO: renamed from: r */
    public String f156020r;

    /* JADX INFO: renamed from: s */
    public gpo0 f156021s;

    public qro0(Act act, gpo0 gpo0Var) {
        super(t6c0.f168581xa, act, gpo0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: renamed from: L */
    private void m176065L(int i) {
        xdl0.m208344M(this.f156014l, i == 0);
        xdl0.m208344M(this.f156015m, i == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m176066P(View view) {
        mo71838p();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f156021s.act();
    }

    /* JADX INFO: renamed from: J */
    public final void m176067J(View view) {
        rro0.m180566a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gpo0 gpo0Var) {
        this.f156021s = gpo0Var;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m176069M(Integer num) {
        if (num.intValue() == 1 && !xdl0.m208349O0(this.f156015m)) {
            npo0.m160532d();
        }
        m176065L(num.intValue());
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m176070N(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        gpo0 gpo0Var = this.f156021s;
        if (gpo0Var != null) {
            gpo0Var.m127453K4(bLiveVoiceCpHouseInfo, str);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m176071O(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, String str) {
        gpo0 gpo0Var = this.f156021s;
        if (gpo0Var != null) {
            gpo0Var.m127454L4(bLiveVoiceSweetLimitHouse, str);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m176072Q(List<BLiveVoiceCpHouseInfo> list, List<BLiveVoiceSweetLimitHouse> list2, String str) {
        this.f156014l.m78531f(list, str);
        this.f156015m.m78537f(list2, str);
    }

    /* JADX INFO: renamed from: R */
    public void m176073R(List<BLiveVoiceSweetLimitHouse> list, String str) {
        VoiceSweetLimitedTimeHouseView voiceSweetLimitedTimeHouseView = this.f156015m;
        if (voiceSweetLimitedTimeHouseView != null) {
            voiceSweetLimitedTimeHouseView.m78537f(list, str);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m176074S(List<BLiveVoiceCpHouseInfo> list, List<BLiveVoiceSweetLimitHouse> list2, String str, int i) {
        if (list == null || list2 == null) {
            return;
        }
        this.f156018p = list;
        this.f156019q = list2;
        this.f156020r = str;
        m71834E();
        if (this.f156014l != null) {
            m176072Q(list, list2, str);
            if (i < 0 || i >= 2) {
                return;
            }
            this.f156016n.m78555f(i);
            m176065L(i);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m176067J(view);
        this.f156016n.m78556g(R$string.f47242fi, R$string.f47658yh);
        this.f156016n.setMargin(false);
        this.f156016n.setOnTabSelectedListener(new e30() { // from class: l.mro0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135395a.m176069M((Integer) obj);
            }
        });
        this.f156014l.setHouseItemClickListener(new f30() { // from class: l.nro0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f140212a.m176070N((BLiveVoiceCpHouseInfo) obj, (String) obj2);
            }
        });
        this.f156015m.setHouseItemClickListener(new f30() { // from class: l.oro0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f145344a.m176071O((BLiveVoiceSweetLimitHouse) obj, (String) obj2);
            }
        });
        List<BLiveVoiceCpHouseInfo> list = this.f156018p;
        if (list != null) {
            m176072Q(list, this.f156019q, this.f156020r);
        }
        xdl0.m208329E0(this.f156017o, new View.OnClickListener() { // from class: l.pro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f150939a.m176066P(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        gpo0 gpo0Var = this.f156021s;
        if (gpo0Var != null) {
            gpo0Var.m127465W4();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo71842x() {
        super.mo71842x();
        gpo0 gpo0Var = this.f156021s;
        if (gpo0Var != null) {
            gpo0Var.m127464V4();
        }
    }
}
