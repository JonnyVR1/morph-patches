package p009l;

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
import com.p000p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceEndFireProgressView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveSummary;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceEndSparkProgress;
import com.p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.brn0;
import l.hxs;
import l.jbu;
import l.jo2;
import l.mqv;
import l.t100;
import l.vwb;
import l.w8u;
import l.w9j;
import l.wk3;
import l.xdl0;
import v.VDraweeView;
import v.VPagerNoPage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class arn0 extends jo2 {

    /* JADX INFO: renamed from: A */
    public TabLayout f9627A;

    /* JADX INFO: renamed from: B */
    public VPagerNoPage f9628B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f9629C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f9630D;

    /* JADX INFO: renamed from: b */
    public FrameLayout f9631b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f9632c;

    /* JADX INFO: renamed from: d */
    public View f9633d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f9634e;

    /* JADX INFO: renamed from: f */
    public TextView f9635f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f9636g;

    /* JADX INFO: renamed from: h */
    public TextView f9637h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f9638i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f9639j;

    /* JADX INFO: renamed from: k */
    public ImageView f9640k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f9641l;

    /* JADX INFO: renamed from: m */
    public VText f9642m;

    /* JADX INFO: renamed from: n */
    public VText f9643n;

    /* JADX INFO: renamed from: o */
    public VText f9644o;

    /* JADX INFO: renamed from: p */
    public VText f9645p;

    /* JADX INFO: renamed from: q */
    public VText f9646q;

    /* JADX INFO: renamed from: r */
    public VText f9647r;

    /* JADX INFO: renamed from: s */
    public VText f9648s;

    /* JADX INFO: renamed from: t */
    public VText f9649t;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f9650u;

    /* JADX INFO: renamed from: v */
    public TextView f9651v;

    /* JADX INFO: renamed from: w */
    public VoiceEndFireProgressView f9652w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f9653x;

    /* JADX INFO: renamed from: y */
    public RecyclerView f9654y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f9655z;

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ mqv m11600n(mqv mqvVar) {
        return mqvVar;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ mqv m11604u(mqv mqvVar) {
        return mqvVar;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m11606A(BLiveSummary bLiveSummary, View view) {
        ((jo2) this).a.m24440N0(this.f9630D, bLiveSummary.voiceCallId, bLiveSummary.bonusGifts);
    }

    /* JADX INFO: renamed from: B */
    public final void m11607B(final User user, LivingUsers<User> livingUsers) {
        wk3.c(this.f9634e, (mqv) vwb.d(livingUsers, new w9j() { // from class: l.xqn0
            public final Object call(Object obj) {
                return ((DbObject) ((User) ((mqv) obj).a)).id;
            }
        }, new w9j() { // from class: l.yqn0
            public final Object call(Object obj) {
                return arn0.m11600n((mqv) obj);
            }
        }).get(((DbObject) user).id), new w9j() { // from class: l.zqn0
            public final Object call(Object obj) {
                return user.fp().profileSmall().formatted();
            }
        });
        xdl0.M(this.f9631b, true);
        boolean zM24449z0 = ((jo2) this).a.m24449z0();
        VDraweeView vDraweeView = this.f9632c;
        if (zM24449z0) {
            xdl0.M(vDraweeView, false);
        } else {
            xdl0.M(vDraweeView, true);
            hxs.p("context_livingAct", this.f9632c, user.fp().profileSmall().formatted(), 1, 8);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m11608C(final BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress) {
        RelativeLayout relativeLayout = this.f9650u;
        if (bLiveVoiceEndSparkProgress == null) {
            xdl0.M(relativeLayout, false);
            return;
        }
        xdl0.M(relativeLayout, true);
        String strU = w8u.u(R.string.li, Integer.valueOf(bLiveVoiceEndSparkProgress.totalCount - bLiveVoiceEndSparkProgress.currentCount));
        String strValueOf = String.valueOf(bLiveVoiceEndSparkProgress.totalCount - bLiveVoiceEndSparkProgress.currentCount);
        int iIndexOf = strU.indexOf(strValueOf);
        int length = strValueOf.length() + iIndexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strU);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#fe7e1d")), iIndexOf, length, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(t100.f(16)), iIndexOf, length, 33);
        this.f9651v.setText(spannableStringBuilder);
        this.f9650u.setOnClickListener(new View.OnClickListener() { // from class: l.wqn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22283a.m11619x(bLiveVoiceEndSparkProgress, view);
            }
        });
        this.f9652w.m8443b(bLiveVoiceEndSparkProgress.currentCount, bLiveVoiceEndSparkProgress.totalCount);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m11609C0() {
        return ((jo2) this).a.act();
    }

    /* JADX INFO: renamed from: E */
    public final void m11610E(final String str, final String str2, List<BLiveVoiceEndSparkRanking> list, LivingUsers<User> livingUsers) {
        if (vwb.J(list)) {
            xdl0.M(this.f9653x, false);
            xdl0.M(this.f9629C, true);
        } else {
            ArrayList arrayList = new ArrayList();
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            this.f9654y.setLayoutManager(new LinearLayoutManager(((jo2) this).a.act(), 1, false));
            this.f9654y.setAdapter(liveBaseAdapter);
            int size = list.size();
            HashMap mapD = vwb.d(livingUsers, new w9j() { // from class: l.tqn0
                public final Object call(Object obj) {
                    return ((DbObject) ((User) ((mqv) obj).a)).id;
                }
            }, new w9j() { // from class: l.uqn0
                public final Object call(Object obj) {
                    return arn0.m11604u((mqv) obj);
                }
            });
            for (int i = 0; i < size; i++) {
                BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking = list.get(i);
                final mqv mqvVar = (mqv) mapD.get(bLiveVoiceEndSparkRanking.id);
                f4n0 f4n0Var = new f4n0(((jo2) this).a, bLiveVoiceEndSparkRanking, mqvVar, str2, str);
                arrayList.add(f4n0Var);
                f4n0Var.z(new Runnable() { // from class: l.vqn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21747a.m11620y(str, str2, mqvVar);
                    }
                });
            }
            if (arrayList.size() >= 30) {
                arrayList.add(new o4n0());
            }
            liveBaseAdapter.Z(arrayList);
            xdl0.M(this.f9653x, true);
            xdl0.M(this.f9629C, false);
        }
        xdl0.M(this.f9655z, false);
    }

    /* JADX INFO: renamed from: F */
    public final void m11611F(BLiveVoiceRoom bLiveVoiceRoom) {
        boolean zJ = vwb.J(bLiveVoiceRoom.topics);
        TextView textView = this.f9637h;
        if (zJ) {
            xdl0.M(textView, false);
            return;
        }
        xdl0.M(textView, !((jo2) this).a.m24449z0());
        if (TextUtils.isEmpty(((BLiveVoiceTopic) bLiveVoiceRoom.topics.get(0)).name)) {
            xdl0.M(this.f9637h, false);
        }
        this.f9637h.setText(((BLiveVoiceTopic) bLiveVoiceRoom.topics.get(0)).name);
        this.f9635f.setText(((BLiveAbsRoom) bLiveVoiceRoom).title);
    }

    /* JADX INFO: renamed from: G */
    public final void m11612G(final BLiveSummary bLiveSummary) {
        this.f9643n.setText(x8u.m24745c(bLiveSummary.audienceCount));
        this.f9644o.setText(x8u.m24745c(bLiveSummary.newFollowCount));
        this.f9642m.setText(jbu.W(bLiveSummary.duration * 1000));
        this.f9647r.setText(x8u.m24745c(bLiveSummary.receivedGifts));
        this.f9639j.setOnClickListener(new View.OnClickListener() { // from class: l.rqn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19952a.m11621z(view);
            }
        });
        boolean zJ = vwb.J(bLiveSummary.bonusGifts.giftItems);
        AnimEffectPlayer animEffectPlayer = this.f9638i;
        if (zJ) {
            xdl0.M(animEffectPlayer, false);
        } else {
            xdl0.M(animEffectPlayer, true);
            this.f9638i.j("https://auto.tancdn.com/v1/raw/574b190b-2eb2-4226-a8e1-51cded992fe811.so", -1);
            xdl0.E0(this.f9638i, new View.OnClickListener() { // from class: l.sqn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20427a.m11606A(bLiveSummary, view);
                }
            });
        }
        if (((jo2) this).a.m24449z0() && bLiveSummary.rewardPointType.isEmpty()) {
            xdl0.M0(this.f9645p, false);
            xdl0.M0(this.f9648s, false);
        } else {
            boolean zEquals = "pop".equals(bLiveSummary.rewardPointType);
            VText vText = this.f9645p;
            if (zEquals) {
                vText.setText(w8u.t(R.string.ci));
                this.f9648s.setText(x8u.m24745c(bLiveSummary.rewardPoint));
            } else {
                vText.setText(w8u.t(R.string.hi));
                this.f9648s.setText(x8u.m24745c(bLiveSummary.rewardPoint));
            }
        }
        if (((bgv) ypv.m25491l(fld0.f13080f)).m12018n()) {
            this.f9645p.setText(w8u.t(R.string.ii));
        }
        boolean zO7 = ypv.m25490k().o7();
        VText vText2 = this.f9646q;
        if (!zO7) {
            xdl0.M0(vText2, false);
            xdl0.M0(this.f9649t, false);
        } else {
            xdl0.M0(vText2, true);
            xdl0.M0(this.f9649t, true);
            this.f9649t.setText(x8u.m24745c(bLiveSummary.receiveGiftsUserCount));
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m11617i1(won0 won0Var) {
        ((jo2) this).a = won0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m11614c() {
        List<fon0> listM24441O0 = ((jo2) this).a.m24441O0();
        this.f9627A.setupWithViewPager(this.f9628B);
        this.f9627A.addOnTabSelectedListener(new C0768a(listM24441O0));
        this.f9628B.setAdapter(new hon0(listM24441O0));
        xdl0.M(this.f9653x, false);
        xdl0.M(this.f9655z, true);
    }

    public void destroy() {
        AnimEffectPlayer animEffectPlayer = this.f9638i;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m11615e(BLiveVoiceRoom bLiveVoiceRoom, User user, BLiveVoice bLiveVoice, BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress, List<BLiveVoiceEndSparkRanking> list, BLiveSummary bLiveSummary, LivingUsers<User> livingUsers) {
        m11611F(bLiveVoiceRoom);
        m11607B(user, livingUsers);
        m11612G(bLiveSummary);
        m11608C(bLiveVoiceEndSparkProgress);
        if (ypv.m25490k().o7()) {
            d(((BLiveAbsData) bLiveVoice).id, ((BLiveAbsData) bLiveVoice).anchor.id, list, livingUsers);
        } else {
            m11610E(((BLiveAbsData) bLiveVoice).id, ((BLiveAbsData) bLiveVoice).anchor.id, list, livingUsers);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m11616f() {
        xdl0.M(this.f9638i, false);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11618w(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public View m11618w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return brn0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m11619x(BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress, View view) {
        ((jo2) this).a.m24443Q0(bLiveVoiceEndSparkProgress.h5Url);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m11620y(String str, String str2, mqv mqvVar) {
        j(str, str2, mqvVar);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m11621z(View view) {
        ((jo2) this).a.m24438J0();
    }

    /* JADX INFO: renamed from: l.arn0$a */
    public class C0768a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f9656a;

        public C0768a(List list) {
            this.f9656a = list;
        }

        public void onTabSelected(TabLayout.Tab tab) {
            fon0 fon0Var = (fon0) this.f9656a.get(tab.getPosition());
            if (fon0Var != null && fon0Var.m14544m() == 0) {
                ((jo2) arn0.this).a.m24445t0(false, fon0Var);
            }
            arn0.this.f9627A.requestFocus();
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }
}
