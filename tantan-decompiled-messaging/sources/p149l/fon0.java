package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.smart_refresh.SmartRefreshLayout;
import p147v.smart_refresh.footer.TTRefreshFooter;
import p147v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes11.dex */
public class fon0 {

    /* JADX INFO: renamed from: a */
    public VLinear f98581a;

    /* JADX INFO: renamed from: b */
    public VImage f98582b;

    /* JADX INFO: renamed from: c */
    public VText f98583c;

    /* JADX INFO: renamed from: d */
    public VText f98584d;

    /* JADX INFO: renamed from: e */
    public SmartRefreshLayout f98585e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f98586f;

    /* JADX INFO: renamed from: g */
    public ImageView f98587g;

    /* JADX INFO: renamed from: h */
    public TextView f98588h;

    /* JADX INFO: renamed from: i */
    public View f98589i;

    /* JADX INFO: renamed from: j */
    public won0 f98590j;

    /* JADX INFO: renamed from: k */
    public int f98591k;

    /* JADX INFO: renamed from: l */
    public LiveBaseAdapter f98592l;

    public fon0(final won0 won0Var, int i) {
        this.f98590j = won0Var;
        this.f98591k = i;
        this.f98589i = m122468i(won0Var.act().getLayoutInflater(), null);
        this.f98585e.mo223159O(new df50() { // from class: l.xnn0
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                this.f193719a.m122473n(won0Var, hnc0Var);
            }
        });
        this.f98585e.mo223158M(new me50() { // from class: l.ynn0
            @Override // p149l.me50
            /* JADX INFO: renamed from: a */
            public final void mo77835a(hnc0 hnc0Var) {
                this.f199190a.m122474o(won0Var, hnc0Var);
            }
        });
        this.f98585e.mo223163S(new TTRefreshHeader(won0Var.act()));
        this.f98585e.mo223161Q(new TTRefreshFooter(won0Var.act()));
        this.f98585e.m223757I(this.f98591k == 0);
        this.f98585e.m223755G(this.f98591k == 0);
        this.f98586f.setLayoutManager(new LinearLayoutManager(won0Var.act(), 1, false));
        this.f98592l = new LiveBaseAdapter();
        xdl0.m208344M(this.f98581a, i == 0);
        this.f98586f.setAdapter(this.f98592l);
        VText vText = this.f98583c;
        fld0<bgv> fld0Var = fld0.f98151f;
        vText.setText(kvc0.m147355d(((bgv) ypv.m215673l(fld0Var)).m101734n() ? R$string.f47572uj : R$string.f47550tj));
        this.f98582b.setBackground(kvc0.m147353b(((bgv) ypv.m215673l(fld0Var)).m101734n() ? i3c0.f111127p9 : i3c0.f111115o9));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ mqv m122462c(mqv mqvVar) {
        return mqvVar;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ mqv m122467h(mqv mqvVar) {
        return mqvVar;
    }

    /* JADX INFO: renamed from: i */
    public View m122468i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gon0.m127278b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m122469j() {
        this.f98585e.m223770o();
    }

    /* JADX INFO: renamed from: k */
    public void m122470k() {
        this.f98585e.m223775t();
    }

    /* JADX INFO: renamed from: l */
    public View m122471l() {
        return this.f98589i;
    }

    /* JADX INFO: renamed from: m */
    public int m122472m() {
        return this.f98591k;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m122473n(won0 won0Var, hnc0 hnc0Var) {
        won0Var.m204849t0(false, this);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m122474o(won0 won0Var, hnc0 hnc0Var) {
        won0Var.m204849t0(true, this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m122475p(HashMap map, List list, BLiveVoiceUserRecord bLiveVoiceUserRecord) {
        list.add(new snn0(this.f98590j, bLiveVoiceUserRecord, (mqv) map.get(bLiveVoiceUserRecord.userId)));
    }

    /* JADX INFO: renamed from: q */
    public final void m122476q() {
        List<d1q<?>> listM67355J = this.f98592l.m67355J();
        xdl0.m208344M(this.f98587g, vwb.m200296J(listM67355J));
        xdl0.m208344M(this.f98588h, vwb.m200296J(listM67355J));
        int i = this.f98591k;
        if (i == 0) {
            this.f98588h.setText(w8u.m202217t(R$string.f47679zg));
            xdl0.m208344M(this.f98581a, !vwb.m200296J(listM67355J));
        } else if (1 == i) {
            this.f98588h.setText(w8u.m202217t(R$string.f47484qj));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m122477r(String str, final String str2, List<BLiveVoiceEndSparkRanking> list, LivingUsers<User> livingUsers) {
        if (vwb.m200296J(list)) {
            m122476q();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        HashMap mapM200319d = vwb.m200319d(livingUsers, new w9j() { // from class: l.znn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) ((mqv) obj).f135304a).f56011id;
            }
        }, new w9j() { // from class: l.aon0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return fon0.m122462c((mqv) obj);
            }
        });
        int i = 0;
        while (i < size) {
            BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking = list.get(i);
            final mqv mqvVar = (mqv) mapM200319d.get(bLiveVoiceEndSparkRanking.f44494id);
            final String str3 = str;
            f4n0 f4n0Var = new f4n0(this.f98590j, bLiveVoiceEndSparkRanking, mqvVar, str2, str3);
            arrayList.add(f4n0Var);
            f4n0Var.m109673z(new Runnable() { // from class: l.bon0
                @Override // java.lang.Runnable
                public final void run() {
                    zvf0.m220368A(MatchScData.ModuleId.mid_e_follow, "p_anchor_live_end", vwb.m200311Y("anchorId", str2), vwb.m200311Y("liveId", str3), vwb.m200311Y("liveFollow_from", "#live_audio_end"), vwb.m200311Y("liveStatus", "endLive"), vwb.m200311Y("receiver_user_id", ((User) mqvVar.f135304a).f56011id));
                }
            });
            i++;
            str = str3;
        }
        if (arrayList.size() >= 30) {
            arrayList.add(new o4n0());
        }
        this.f98592l.m67371Z(arrayList);
        this.f98592l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: s */
    public void m122478s(List<BLiveVoiceUserRecord> list, LivingUsers<User> livingUsers) {
        if (vwb.m200296J(list)) {
            m122476q();
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final HashMap mapM200319d = vwb.m200319d(livingUsers, new w9j() { // from class: l.con0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) ((mqv) obj).f135304a).f56011id;
            }
        }, new w9j() { // from class: l.don0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return fon0.m122467h((mqv) obj);
            }
        });
        vwb.m200354z(list, new e30() { // from class: l.eon0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92475a.m122475p(mapM200319d, arrayList, (BLiveVoiceUserRecord) obj);
            }
        });
        this.f98592l.m67371Z(arrayList);
        this.f98592l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: t */
    public void m122479t(String str) {
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(this.f98581a, false);
        } else {
            this.f98584d.setText(x8u.m207433c(Double.parseDouble(str)));
            xdl0.m208344M(this.f98584d, true);
        }
    }
}
