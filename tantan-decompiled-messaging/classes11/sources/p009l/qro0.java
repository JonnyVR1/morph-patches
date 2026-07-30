package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetHouseView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetLimitedTimeHouseView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetTabView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import l.e30;
import l.f30;
import l.j2g0;
import l.rro0;
import l.t6c0;
import l.xdl0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qro0 extends LiveMenuDialogHolder<gpo0> {

    /* JADX INFO: renamed from: k */
    public VImage f19473k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetHouseView f19474l;

    /* JADX INFO: renamed from: m */
    public VoiceSweetLimitedTimeHouseView f19475m;

    /* JADX INFO: renamed from: n */
    public VoiceSweetTabView f19476n;

    /* JADX INFO: renamed from: o */
    public VImage f19477o;

    /* JADX INFO: renamed from: p */
    public List<BLiveVoiceCpHouseInfo> f19478p;

    /* JADX INFO: renamed from: q */
    public List<BLiveVoiceSweetLimitHouse> f19479q;

    /* JADX INFO: renamed from: r */
    public String f19480r;

    /* JADX INFO: renamed from: s */
    public gpo0 f19481s;

    public qro0(Act act, gpo0 gpo0Var) {
        super(t6c0.xa, act, gpo0Var, j2g0.e(true));
    }

    /* JADX INFO: renamed from: L */
    private void m21199L(int i) {
        xdl0.M(this.f19474l, i == 0);
        xdl0.M(this.f19475m, i == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m21200P(View view) {
        p();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m21201C0() {
        return this.f19481s.act();
    }

    /* JADX INFO: renamed from: J */
    public final void m21202J(View view) {
        rro0.a(this, view);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m21212n(gpo0 gpo0Var) {
        this.f19481s = gpo0Var;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m21204M(Integer num) {
        if (num.intValue() == 1 && !xdl0.O0(this.f19475m)) {
            npo0.m19006d();
        }
        m21199L(num.intValue());
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m21205N(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        gpo0 gpo0Var = this.f19481s;
        if (gpo0Var != null) {
            gpo0Var.m15194K4(bLiveVoiceCpHouseInfo, str);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m21206O(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, String str) {
        gpo0 gpo0Var = this.f19481s;
        if (gpo0Var != null) {
            gpo0Var.m15195L4(bLiveVoiceSweetLimitHouse, str);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m21207Q(List<BLiveVoiceCpHouseInfo> list, List<BLiveVoiceSweetLimitHouse> list2, String str) {
        this.f19474l.m8742f(list, str);
        this.f19475m.m8748f(list2, str);
    }

    /* JADX INFO: renamed from: R */
    public void m21208R(List<BLiveVoiceSweetLimitHouse> list, String str) {
        VoiceSweetLimitedTimeHouseView voiceSweetLimitedTimeHouseView = this.f19475m;
        if (voiceSweetLimitedTimeHouseView != null) {
            voiceSweetLimitedTimeHouseView.m8748f(list, str);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m21209S(List<BLiveVoiceCpHouseInfo> list, List<BLiveVoiceSweetLimitHouse> list2, String str, int i) {
        if (list == null || list2 == null) {
            return;
        }
        this.f19478p = list;
        this.f19479q = list2;
        this.f19480r = str;
        E();
        if (this.f19474l != null) {
            m21207Q(list, list2, str);
            if (i < 0 || i >= 2) {
                return;
            }
            this.f19476n.m8768f(i);
            m21199L(i);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m21211m(View view) {
        super.m(view);
        m21202J(view);
        this.f19476n.m8769g(R.string.fi, R.string.yh);
        this.f19476n.setMargin(false);
        this.f19476n.setOnTabSelectedListener(new e30() { // from class: l.mro0
            public final void call(Object obj) {
                this.f17057a.m21204M((Integer) obj);
            }
        });
        this.f19474l.setHouseItemClickListener(new f30() { // from class: l.nro0
            public final void call(Object obj, Object obj2) {
                this.f17626a.m21205N((BLiveVoiceCpHouseInfo) obj, (String) obj2);
            }
        });
        this.f19475m.setHouseItemClickListener(new f30() { // from class: l.oro0
            public final void call(Object obj, Object obj2) {
                this.f18226a.m21206O((BLiveVoiceSweetLimitHouse) obj, (String) obj2);
            }
        });
        List<BLiveVoiceCpHouseInfo> list = this.f19478p;
        if (list != null) {
            m21207Q(list, this.f19479q, this.f19480r);
        }
        xdl0.E0(this.f19477o, new View.OnClickListener() { // from class: l.pro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f18871a.m21200P(view2);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m21213w() {
        super.w();
        gpo0 gpo0Var = this.f19481s;
        if (gpo0Var != null) {
            gpo0Var.m15206W4();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m21214x() {
        super.x();
        gpo0 gpo0Var = this.f19481s;
        if (gpo0Var != null) {
            gpo0Var.m15205V4();
        }
    }
}
