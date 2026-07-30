package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.data.GuideBoostMode;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEndSparkProgress;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceEndFireProgressView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151v.VDraweeView;
import p151v.VPagerNoPage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e0o0 extends qo2 {

    /* JADX INFO: renamed from: A */
    public TabLayout f91511A;

    /* JADX INFO: renamed from: B */
    public VPagerNoPage f91512B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f91513C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f91514D;

    /* JADX INFO: renamed from: b */
    public FrameLayout f91515b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f91516c;

    /* JADX INFO: renamed from: d */
    public View f91517d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f91518e;

    /* JADX INFO: renamed from: f */
    public TextView f91519f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f91520g;

    /* JADX INFO: renamed from: h */
    public TextView f91521h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f91522i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f91523j;

    /* JADX INFO: renamed from: k */
    public ImageView f91524k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f91525l;

    /* JADX INFO: renamed from: m */
    public VText f91526m;

    /* JADX INFO: renamed from: n */
    public VText f91527n;

    /* JADX INFO: renamed from: o */
    public VText f91528o;

    /* JADX INFO: renamed from: p */
    public VText f91529p;

    /* JADX INFO: renamed from: q */
    public VText f91530q;

    /* JADX INFO: renamed from: r */
    public VText f91531r;

    /* JADX INFO: renamed from: s */
    public VText f91532s;

    /* JADX INFO: renamed from: t */
    public VText f91533t;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f91534u;

    /* JADX INFO: renamed from: v */
    public TextView f91535v;

    /* JADX INFO: renamed from: w */
    public VoiceEndFireProgressView f91536w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f91537x;

    /* JADX INFO: renamed from: y */
    public RecyclerView f91538y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f91539z;

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ nsv m118896n(nsv nsvVar) {
        return nsvVar;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ nsv m118900u(nsv nsvVar) {
        return nsvVar;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m118902A(BLiveSummary bLiveSummary, View view) {
        this.f158692a.m100903N0(this.f91514D, bLiveSummary.voiceCallId, bLiveSummary.bonusGifts);
    }

    /* JADX INFO: renamed from: B */
    public final void m118903B(final User user, LivingUsers<User> livingUsers) {
        ql3.m176985c(this.f91518e, (nsv) jyb.m147502d(livingUsers, new qcj() { // from class: l.b0o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) ((nsv) obj).f143542a).f56859id;
            }
        }, new qcj() { // from class: l.c0o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return e0o0.m118896n((nsv) obj);
            }
        }).get(user.f56859id), new qcj() { // from class: l.d0o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return user.m61308fp().profileSmall().formatted();
            }
        });
        bnl0.m105524M(this.f91515b, true);
        boolean zM100911z0 = this.f158692a.m100911z0();
        VDraweeView vDraweeView = this.f91516c;
        if (zM100911z0) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            izs.m142865p("context_livingAct", this.f91516c, user.m61308fp().profileSmall().formatted(), 1, 8);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m118904C(final BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress) {
        RelativeLayout relativeLayout = this.f91534u;
        if (bLiveVoiceEndSparkProgress == null) {
            bnl0.m105524M(relativeLayout, false);
            return;
        }
        bnl0.m105524M(relativeLayout, true);
        String strM209911u = xau.m209911u(R$string.f48221li, Integer.valueOf(bLiveVoiceEndSparkProgress.totalCount - bLiveVoiceEndSparkProgress.currentCount));
        String strValueOf = String.valueOf(bLiveVoiceEndSparkProgress.totalCount - bLiveVoiceEndSparkProgress.currentCount);
        int iIndexOf = strM209911u.indexOf(strValueOf);
        int length = strValueOf.length() + iIndexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM209911u);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#fe7e1d")), iIndexOf, length, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(qa00.m175861f(16)), iIndexOf, length, 33);
        this.f91535v.setText(spannableStringBuilder);
        this.f91534u.setOnClickListener(new View.OnClickListener() { // from class: l.a0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67734a.m118913x(bLiveVoiceEndSparkProgress, view);
            }
        });
        this.f91536w.m79437b(bLiveVoiceEndSparkProgress.currentCount, bLiveVoiceEndSparkProgress.totalCount);
    }

    @Override // p153l.qo2, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f158692a.act();
    }

    /* JADX INFO: renamed from: E */
    public final void m118905E(final String str, final String str2, List<BLiveVoiceEndSparkRanking> list, LivingUsers<User> livingUsers) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this.f91537x, false);
            bnl0.m105524M(this.f91513C, true);
        } else {
            ArrayList arrayList = new ArrayList();
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            this.f91538y.setLayoutManager(new LinearLayoutManager(this.f158692a.act(), 1, false));
            this.f91538y.setAdapter(liveBaseAdapter);
            int size = list.size();
            HashMap mapM147502d = jyb.m147502d(livingUsers, new qcj() { // from class: l.xzn0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) ((nsv) obj).f143542a).f56859id;
                }
            }, new qcj() { // from class: l.yzn0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return e0o0.m118900u((nsv) obj);
                }
            });
            for (int i = 0; i < size; i++) {
                BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking = list.get(i);
                final nsv nsvVar = (nsv) mapM147502d.get(bLiveVoiceEndSparkRanking.f45342id);
                jdn0 jdn0Var = new jdn0(this.f158692a, bLiveVoiceEndSparkRanking, nsvVar, str2, str);
                arrayList.add(jdn0Var);
                jdn0Var.m113891z(new Runnable() { // from class: l.zzn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f206727a.m118914y(str, str2, nsvVar);
                    }
                });
            }
            if (arrayList.size() >= 30) {
                arrayList.add(new sdn0());
            }
            liveBaseAdapter.m68554Z(arrayList);
            bnl0.m105524M(this.f91537x, true);
            bnl0.m105524M(this.f91513C, false);
        }
        bnl0.m105524M(this.f91539z, false);
    }

    /* JADX INFO: renamed from: F */
    public final void m118906F(BLiveVoiceRoom bLiveVoiceRoom) {
        boolean zM147479J = jyb.m147479J(bLiveVoiceRoom.topics);
        TextView textView = this.f91521h;
        if (zM147479J) {
            bnl0.m105524M(textView, false);
            return;
        }
        bnl0.m105524M(textView, !this.f158692a.m100911z0());
        if (TextUtils.isEmpty(bLiveVoiceRoom.topics.get(0).name)) {
            bnl0.m105524M(this.f91521h, false);
        }
        this.f91521h.setText(bLiveVoiceRoom.topics.get(0).name);
        this.f91519f.setText(bLiveVoiceRoom.title);
    }

    /* JADX INFO: renamed from: G */
    public final void m118907G(final BLiveSummary bLiveSummary) {
        this.f91527n.setText(yau.m214935c(bLiveSummary.audienceCount));
        this.f91528o.setText(yau.m214935c(bLiveSummary.newFollowCount));
        this.f91526m.setText(kdu.m149278W(bLiveSummary.duration * 1000));
        this.f91531r.setText(yau.m214935c(bLiveSummary.receivedGifts));
        this.f91523j.setOnClickListener(new View.OnClickListener() { // from class: l.vzn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186504a.m118915z(view);
            }
        });
        boolean zM147479J = jyb.m147479J(bLiveSummary.bonusGifts.giftItems);
        AnimEffectPlayer animEffectPlayer = this.f91522i;
        if (zM147479J) {
            bnl0.m105524M(animEffectPlayer, false);
        } else {
            bnl0.m105524M(animEffectPlayer, true);
            this.f91522i.m69683j("https://auto.tancdn.com/v1/raw/574b190b-2eb2-4226-a8e1-51cded992fe811.so", -1);
            bnl0.m105509E0(this.f91522i, new View.OnClickListener() { // from class: l.wzn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191811a.m118902A(bLiveSummary, view);
                }
            });
        }
        if (this.f158692a.m100911z0() && bLiveSummary.rewardPointType.isEmpty()) {
            bnl0.m105525M0(this.f91529p, false);
            bnl0.m105525M0(this.f91532s, false);
        } else {
            boolean zEquals = GuideBoostMode.pop.equals(bLiveSummary.rewardPointType);
            VText vText = this.f91529p;
            if (zEquals) {
                vText.setText(xau.m209910t(R$string.f48024ci));
                this.f91532s.setText(yau.m214935c(bLiveSummary.rewardPoint));
            } else {
                vText.setText(xau.m209910t(R$string.f48134hi));
                this.f91532s.setText(yau.m214935c(bLiveSummary.rewardPoint));
            }
        }
        if (((civ) zrv.m221194l(htd0.f111524f)).m109970n()) {
            this.f91529p.setText(xau.m209910t(R$string.f48155ii));
        }
        boolean zM203693o7 = zrv.m221193k().m203693o7();
        VText vText2 = this.f91530q;
        if (!zM203693o7) {
            bnl0.m105525M0(vText2, false);
            bnl0.m105525M0(this.f91533t, false);
        } else {
            bnl0.m105525M0(vText2, true);
            bnl0.m105525M0(this.f91533t, true);
            this.f91533t.setText(yau.m214935c(bLiveSummary.receiveGiftsUserCount));
        }
    }

    @Override // p153l.qo2, p153l.iam
    /* JADX INFO: renamed from: b */
    public void mo22064i1(ayn0 ayn0Var) {
        this.f158692a = ayn0Var;
    }

    @Override // p153l.qo2
    /* JADX INFO: renamed from: c */
    public void mo118909c() {
        List<jxn0> listM100904O0 = this.f158692a.m100904O0();
        this.f91511A.setupWithViewPager(this.f91512B);
        this.f91511A.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C16676a(listM100904O0));
        this.f91512B.setAdapter(new lxn0(listM100904O0));
        bnl0.m105524M(this.f91537x, false);
        bnl0.m105524M(this.f91539z, true);
    }

    @Override // p153l.qo2, p153l.iam
    public void destroy() {
        AnimEffectPlayer animEffectPlayer = this.f91522i;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
        }
    }

    @Override // p153l.qo2
    /* JADX INFO: renamed from: e */
    public void mo118910e(BLiveVoiceRoom bLiveVoiceRoom, User user, BLiveVoice bLiveVoice, BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress, List<BLiveVoiceEndSparkRanking> list, BLiveSummary bLiveSummary, LivingUsers<User> livingUsers) {
        m118906F(bLiveVoiceRoom);
        m118903B(user, livingUsers);
        m118907G(bLiveSummary);
        m118904C(bLiveVoiceEndSparkProgress);
        if (zrv.m221193k().m203693o7()) {
            m177282d(bLiveVoice.f45171id, bLiveVoice.anchor.f45267id, list, livingUsers);
        } else {
            m118905E(bLiveVoice.f45171id, bLiveVoice.anchor.f45267id, list, livingUsers);
        }
    }

    @Override // p153l.qo2
    /* JADX INFO: renamed from: f */
    public void mo118911f() {
        bnl0.m105524M(this.f91522i, false);
    }

    @Override // p153l.qo2, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m118912w(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public View m118912w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f0o0.m123501b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m118913x(BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress, View view) {
        this.f158692a.m100906Q0(bLiveVoiceEndSparkProgress.h5Url);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m118914y(String str, String str2, nsv nsvVar) {
        m177284j(str, str2, nsvVar);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m118915z(View view) {
        this.f158692a.m100901J0();
    }

    /* JADX INFO: renamed from: l.e0o0$a */
    public class C16676a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f91540a;

        public C16676a(List list) {
            this.f91540a = list;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            jxn0 jxn0Var = (jxn0) this.f91540a.get(tab.getPosition());
            if (jxn0Var != null && jxn0Var.m147380m() == 0) {
                e0o0.this.f158692a.m100907t0(false, jxn0Var);
            }
            e0o0.this.f91511A.requestFocus();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }
}
