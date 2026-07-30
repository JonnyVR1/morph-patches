package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.smart_refresh.SmartRefreshLayout;
import p151v.smart_refresh.footer.TTRefreshFooter;
import p151v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes10.dex */
public class jxn0 {

    /* JADX INFO: renamed from: a */
    public VLinear f123051a;

    /* JADX INFO: renamed from: b */
    public VImage f123052b;

    /* JADX INFO: renamed from: c */
    public VText f123053c;

    /* JADX INFO: renamed from: d */
    public VText f123054d;

    /* JADX INFO: renamed from: e */
    public SmartRefreshLayout f123055e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f123056f;

    /* JADX INFO: renamed from: g */
    public ImageView f123057g;

    /* JADX INFO: renamed from: h */
    public TextView f123058h;

    /* JADX INFO: renamed from: i */
    public View f123059i;

    /* JADX INFO: renamed from: j */
    public ayn0 f123060j;

    /* JADX INFO: renamed from: k */
    public int f123061k;

    /* JADX INFO: renamed from: l */
    public LiveBaseAdapter f123062l;

    public jxn0(final ayn0 ayn0Var, int i) {
        this.f123060j = ayn0Var;
        this.f123061k = i;
        this.f123059i = m147376i(ayn0Var.act().getLayoutInflater(), null);
        this.f123055e.mo224405O(new jn50() { // from class: l.bxn0
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                this.f78892a.m147381n(ayn0Var, mvc0Var);
            }
        });
        this.f123055e.mo224404M(new tm50() { // from class: l.cxn0
            @Override // p153l.tm50
            /* JADX INFO: renamed from: a */
            public final void mo79018a(mvc0 mvc0Var) {
                this.f84261a.m147382o(ayn0Var, mvc0Var);
            }
        });
        this.f123055e.mo224409S(new TTRefreshHeader(ayn0Var.act()));
        this.f123055e.mo224407Q(new TTRefreshFooter(ayn0Var.act()));
        this.f123055e.m225003I(this.f123061k == 0);
        this.f123055e.m225001G(this.f123061k == 0);
        this.f123056f.setLayoutManager(new LinearLayoutManager(ayn0Var.act(), 1, false));
        this.f123062l = new LiveBaseAdapter();
        bnl0.m105524M(this.f123051a, i == 0);
        this.f123056f.setAdapter(this.f123062l);
        VText vText = this.f123053c;
        htd0<civ> htd0Var = htd0.f111524f;
        vText.setText(n3d0.m161280d(((civ) zrv.m221194l(htd0Var)).m109970n() ? R$string.f48420uj : R$string.f48398tj));
        this.f123052b.setBackground(n3d0.m161278b(((civ) zrv.m221194l(htd0Var)).m109970n() ? obc0.f146455p9 : obc0.f146443o9));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ nsv m147370c(nsv nsvVar) {
        return nsvVar;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ nsv m147375h(nsv nsvVar) {
        return nsvVar;
    }

    /* JADX INFO: renamed from: i */
    public View m147376i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kxn0.m151841b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m147377j() {
        this.f123055e.m225016o();
    }

    /* JADX INFO: renamed from: k */
    public void m147378k() {
        this.f123055e.m225021t();
    }

    /* JADX INFO: renamed from: l */
    public View m147379l() {
        return this.f123059i;
    }

    /* JADX INFO: renamed from: m */
    public int m147380m() {
        return this.f123061k;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m147381n(ayn0 ayn0Var, mvc0 mvc0Var) {
        ayn0Var.m100907t0(false, this);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m147382o(ayn0 ayn0Var, mvc0 mvc0Var) {
        ayn0Var.m100907t0(true, this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m147383p(HashMap map, List list, BLiveVoiceUserRecord bLiveVoiceUserRecord) {
        list.add(new wwn0(this.f123060j, bLiveVoiceUserRecord, (nsv) map.get(bLiveVoiceUserRecord.userId)));
    }

    /* JADX INFO: renamed from: q */
    public final void m147384q() {
        List<d3q<?>> listM68538J = this.f123062l.m68538J();
        bnl0.m105524M(this.f123057g, jyb.m147479J(listM68538J));
        bnl0.m105524M(this.f123058h, jyb.m147479J(listM68538J));
        int i = this.f123061k;
        if (i == 0) {
            this.f123058h.setText(xau.m209910t(R$string.f48527zg));
            bnl0.m105524M(this.f123051a, !jyb.m147479J(listM68538J));
        } else if (1 == i) {
            this.f123058h.setText(xau.m209910t(R$string.f48332qj));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m147385r(String str, final String str2, List<BLiveVoiceEndSparkRanking> list, LivingUsers<User> livingUsers) {
        if (jyb.m147479J(list)) {
            m147384q();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        HashMap mapM147502d = jyb.m147502d(livingUsers, new qcj() { // from class: l.dxn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) ((nsv) obj).f143542a).f56859id;
            }
        }, new qcj() { // from class: l.exn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jxn0.m147370c((nsv) obj);
            }
        });
        int i = 0;
        while (i < size) {
            BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking = list.get(i);
            final nsv nsvVar = (nsv) mapM147502d.get(bLiveVoiceEndSparkRanking.f45342id);
            final String str3 = str;
            jdn0 jdn0Var = new jdn0(this.f123060j, bLiveVoiceEndSparkRanking, nsvVar, str2, str3);
            arrayList.add(jdn0Var);
            jdn0Var.m113891z(new Runnable() { // from class: l.fxn0
                @Override // java.lang.Runnable
                public final void run() {
                    i4g0.m138492A(MatchScData.ModuleId.mid_e_follow, "p_anchor_live_end", jyb.m147494Y("anchorId", str2), jyb.m147494Y("liveId", str3), jyb.m147494Y("liveFollow_from", "#live_audio_end"), jyb.m147494Y("liveStatus", "endLive"), jyb.m147494Y("receiver_user_id", ((User) nsvVar.f143542a).f56859id));
                }
            });
            i++;
            str = str3;
        }
        if (arrayList.size() >= 30) {
            arrayList.add(new sdn0());
        }
        this.f123062l.m68554Z(arrayList);
        this.f123062l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: s */
    public void m147386s(List<BLiveVoiceUserRecord> list, LivingUsers<User> livingUsers) {
        if (jyb.m147479J(list)) {
            m147384q();
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final HashMap mapM147502d = jyb.m147502d(livingUsers, new qcj() { // from class: l.gxn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) ((nsv) obj).f143542a).f56859id;
            }
        }, new qcj() { // from class: l.hxn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jxn0.m147375h((nsv) obj);
            }
        });
        jyb.m147537z(list, new y20() { // from class: l.ixn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117443a.m147383p(mapM147502d, arrayList, (BLiveVoiceUserRecord) obj);
            }
        });
        this.f123062l.m68554Z(arrayList);
        this.f123062l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: t */
    public void m147387t(String str) {
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(this.f123051a, false);
        } else {
            this.f123054d.setText(yau.m214935c(Double.parseDouble(str)));
            bnl0.m105524M(this.f123054d, true);
        }
    }
}
