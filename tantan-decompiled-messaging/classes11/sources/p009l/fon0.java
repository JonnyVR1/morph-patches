package p009l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.df50;
import l.e30;
import l.gon0;
import l.hnc0;
import l.i3c0;
import l.j760;
import l.kvc0;
import l.me50;
import l.mqv;
import l.vwb;
import l.w8u;
import l.w9j;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VLinear;
import v.VText;
import v.smart_refresh.SmartRefreshLayout;
import v.smart_refresh.footer.TTRefreshFooter;
import v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fon0 {

    /* JADX INFO: renamed from: a */
    public VLinear f13115a;

    /* JADX INFO: renamed from: b */
    public VImage f13116b;

    /* JADX INFO: renamed from: c */
    public VText f13117c;

    /* JADX INFO: renamed from: d */
    public VText f13118d;

    /* JADX INFO: renamed from: e */
    public SmartRefreshLayout f13119e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f13120f;

    /* JADX INFO: renamed from: g */
    public ImageView f13121g;

    /* JADX INFO: renamed from: h */
    public TextView f13122h;

    /* JADX INFO: renamed from: i */
    public View f13123i;

    /* JADX INFO: renamed from: j */
    public won0 f13124j;

    /* JADX INFO: renamed from: k */
    public int f13125k;

    /* JADX INFO: renamed from: l */
    public LiveBaseAdapter f13126l;

    public fon0(final won0 won0Var, int i) {
        this.f13124j = won0Var;
        this.f13125k = i;
        this.f13123i = m14540i(won0Var.act().getLayoutInflater(), null);
        this.f13119e.O(new df50() { // from class: l.xnn0
            /* JADX INFO: renamed from: w2 */
            public final void m24952w2(hnc0 hnc0Var) {
                this.f22673a.m14545n(won0Var, hnc0Var);
            }
        });
        this.f13119e.M(new me50() { // from class: l.ynn0
            /* JADX INFO: renamed from: a */
            public final void m25483a(hnc0 hnc0Var) {
                this.f23175a.m14546o(won0Var, hnc0Var);
            }
        });
        this.f13119e.S(new TTRefreshHeader(won0Var.act()));
        this.f13119e.Q(new TTRefreshFooter(won0Var.act()));
        this.f13119e.I(this.f13125k == 0);
        this.f13119e.G(this.f13125k == 0);
        this.f13120f.setLayoutManager(new LinearLayoutManager(won0Var.act(), 1, false));
        this.f13126l = new LiveBaseAdapter();
        xdl0.M(this.f13115a, i == 0);
        this.f13120f.setAdapter(this.f13126l);
        VText vText = this.f13117c;
        fld0<bgv> fld0Var = fld0.f13080f;
        vText.setText(kvc0.d(((bgv) ypv.m25491l(fld0Var)).m12018n() ? R.string.uj : R.string.tj));
        this.f13116b.setBackground(kvc0.b(((bgv) ypv.m25491l(fld0Var)).m12018n() ? i3c0.p9 : i3c0.o9));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ mqv m14534c(mqv mqvVar) {
        return mqvVar;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ mqv m14539h(mqv mqvVar) {
        return mqvVar;
    }

    /* JADX INFO: renamed from: i */
    public View m14540i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gon0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m14541j() {
        this.f13119e.o();
    }

    /* JADX INFO: renamed from: k */
    public void m14542k() {
        this.f13119e.t();
    }

    /* JADX INFO: renamed from: l */
    public View m14543l() {
        return this.f13123i;
    }

    /* JADX INFO: renamed from: m */
    public int m14544m() {
        return this.f13125k;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m14545n(won0 won0Var, hnc0 hnc0Var) {
        won0Var.m24445t0(false, this);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m14546o(won0 won0Var, hnc0 hnc0Var) {
        won0Var.m24445t0(true, this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m14547p(HashMap map, List list, BLiveVoiceUserRecord bLiveVoiceUserRecord) {
        list.add(new snn0(this.f13124j, bLiveVoiceUserRecord, (mqv) map.get(bLiveVoiceUserRecord.userId)));
    }

    /* JADX INFO: renamed from: q */
    public final void m14548q() {
        List listJ = this.f13126l.J();
        xdl0.M(this.f13121g, vwb.J(listJ));
        xdl0.M(this.f13122h, vwb.J(listJ));
        int i = this.f13125k;
        if (i == 0) {
            this.f13122h.setText(w8u.t(R.string.zg));
            xdl0.M(this.f13115a, !vwb.J(listJ));
        } else if (1 == i) {
            this.f13122h.setText(w8u.t(R.string.qj));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m14549r(String str, final String str2, List<BLiveVoiceEndSparkRanking> list, LivingUsers<User> livingUsers) {
        if (vwb.J(list)) {
            m14548q();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        HashMap mapD = vwb.d(livingUsers, new w9j() { // from class: l.znn0
            public final Object call(Object obj) {
                return ((DbObject) ((User) ((mqv) obj).a)).id;
            }
        }, new w9j() { // from class: l.aon0
            public final Object call(Object obj) {
                return fon0.m14534c((mqv) obj);
            }
        });
        int i = 0;
        while (i < size) {
            BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking = list.get(i);
            final mqv mqvVar = (mqv) mapD.get(bLiveVoiceEndSparkRanking.id);
            final String str3 = str;
            f4n0 f4n0Var = new f4n0(this.f13124j, bLiveVoiceEndSparkRanking, mqvVar, str2, str3);
            arrayList.add(f4n0Var);
            f4n0Var.z(new Runnable() { // from class: l.bon0
                @Override // java.lang.Runnable
                public final void run() {
                    zvf0.A("e_follow", "p_anchor_live_end", new j760[]{vwb.Y("anchorId", str2), vwb.Y("liveId", str3), vwb.Y("liveFollow_from", "#live_audio_end"), vwb.Y("liveStatus", "endLive"), vwb.Y("receiver_user_id", ((DbObject) ((User) mqvVar.a)).id)});
                }
            });
            i++;
            str = str3;
        }
        if (arrayList.size() >= 30) {
            arrayList.add(new o4n0());
        }
        this.f13126l.Z(arrayList);
        this.f13126l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: s */
    public void m14550s(List<BLiveVoiceUserRecord> list, LivingUsers<User> livingUsers) {
        if (vwb.J(list)) {
            m14548q();
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final HashMap mapD = vwb.d(livingUsers, new w9j() { // from class: l.con0
            public final Object call(Object obj) {
                return ((DbObject) ((User) ((mqv) obj).a)).id;
            }
        }, new w9j() { // from class: l.don0
            public final Object call(Object obj) {
                return fon0.m14539h((mqv) obj);
            }
        });
        vwb.z(list, new e30() { // from class: l.eon0
            public final void call(Object obj) {
                this.f12633a.m14547p(mapD, arrayList, (BLiveVoiceUserRecord) obj);
            }
        });
        this.f13126l.Z(arrayList);
        this.f13126l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: t */
    public void m14551t(String str) {
        if (TextUtils.isEmpty(str)) {
            xdl0.M(this.f13115a, false);
        } else {
            this.f13118d.setText(x8u.m24745c(Double.parseDouble(str)));
            xdl0.M(this.f13118d, true);
        }
    }
}
