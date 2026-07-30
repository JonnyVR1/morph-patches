package p149l;

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
import com.p046p1.mobile.putong.core.data.GuideBoostMode;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEndSparkProgress;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceEndFireProgressView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p147v.VDraweeView;
import p147v.VPagerNoPage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class arn0 extends jo2 {

    /* JADX INFO: renamed from: A */
    public TabLayout f71303A;

    /* JADX INFO: renamed from: B */
    public VPagerNoPage f71304B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f71305C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f71306D;

    /* JADX INFO: renamed from: b */
    public FrameLayout f71307b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f71308c;

    /* JADX INFO: renamed from: d */
    public View f71309d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f71310e;

    /* JADX INFO: renamed from: f */
    public TextView f71311f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f71312g;

    /* JADX INFO: renamed from: h */
    public TextView f71313h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f71314i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f71315j;

    /* JADX INFO: renamed from: k */
    public ImageView f71316k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f71317l;

    /* JADX INFO: renamed from: m */
    public VText f71318m;

    /* JADX INFO: renamed from: n */
    public VText f71319n;

    /* JADX INFO: renamed from: o */
    public VText f71320o;

    /* JADX INFO: renamed from: p */
    public VText f71321p;

    /* JADX INFO: renamed from: q */
    public VText f71322q;

    /* JADX INFO: renamed from: r */
    public VText f71323r;

    /* JADX INFO: renamed from: s */
    public VText f71324s;

    /* JADX INFO: renamed from: t */
    public VText f71325t;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f71326u;

    /* JADX INFO: renamed from: v */
    public TextView f71327v;

    /* JADX INFO: renamed from: w */
    public VoiceEndFireProgressView f71328w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f71329x;

    /* JADX INFO: renamed from: y */
    public RecyclerView f71330y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f71331z;

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ mqv m98529n(mqv mqvVar) {
        return mqvVar;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ mqv m98533u(mqv mqvVar) {
        return mqvVar;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m98535A(BLiveSummary bLiveSummary, View view) {
        this.f118914a.m204845N0(this.f71306D, bLiveSummary.voiceCallId, bLiveSummary.bonusGifts);
    }

    /* JADX INFO: renamed from: B */
    public final void m98536B(final User user, LivingUsers<User> livingUsers) {
        wk3.m203644c(this.f71310e, (mqv) vwb.m200319d(livingUsers, new w9j() { // from class: l.xqn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) ((mqv) obj).f135304a).f56011id;
            }
        }, new w9j() { // from class: l.yqn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return arn0.m98529n((mqv) obj);
            }
        }).get(user.f56011id), new w9j() { // from class: l.zqn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return user.m60124fp().profileSmall().formatted();
            }
        });
        xdl0.m208344M(this.f71307b, true);
        boolean zM204853z0 = this.f118914a.m204853z0();
        VDraweeView vDraweeView = this.f71308c;
        if (zM204853z0) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            hxs.m133403p("context_livingAct", this.f71308c, user.m60124fp().profileSmall().formatted(), 1, 8);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m98537C(final BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress) {
        RelativeLayout relativeLayout = this.f71326u;
        if (bLiveVoiceEndSparkProgress == null) {
            xdl0.m208344M(relativeLayout, false);
            return;
        }
        xdl0.m208344M(relativeLayout, true);
        String strM202218u = w8u.m202218u(R$string.f47373li, Integer.valueOf(bLiveVoiceEndSparkProgress.totalCount - bLiveVoiceEndSparkProgress.currentCount));
        String strValueOf = String.valueOf(bLiveVoiceEndSparkProgress.totalCount - bLiveVoiceEndSparkProgress.currentCount);
        int iIndexOf = strM202218u.indexOf(strValueOf);
        int length = strValueOf.length() + iIndexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM202218u);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#fe7e1d")), iIndexOf, length, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(t100.m186892f(16)), iIndexOf, length, 33);
        this.f71327v.setText(spannableStringBuilder);
        this.f71326u.setOnClickListener(new View.OnClickListener() { // from class: l.wqn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187710a.m98546x(bLiveVoiceEndSparkProgress, view);
            }
        });
        this.f71328w.m78254b(bLiveVoiceEndSparkProgress.currentCount, bLiveVoiceEndSparkProgress.totalCount);
    }

    @Override // p149l.jo2, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f118914a.act();
    }

    /* JADX INFO: renamed from: E */
    public final void m98538E(final String str, final String str2, List<BLiveVoiceEndSparkRanking> list, LivingUsers<User> livingUsers) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this.f71329x, false);
            xdl0.m208344M(this.f71305C, true);
        } else {
            ArrayList arrayList = new ArrayList();
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            this.f71330y.setLayoutManager(new LinearLayoutManager(this.f118914a.act(), 1, false));
            this.f71330y.setAdapter(liveBaseAdapter);
            int size = list.size();
            HashMap mapM200319d = vwb.m200319d(livingUsers, new w9j() { // from class: l.tqn0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) ((mqv) obj).f135304a).f56011id;
                }
            }, new w9j() { // from class: l.uqn0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return arn0.m98533u((mqv) obj);
                }
            });
            for (int i = 0; i < size; i++) {
                BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking = list.get(i);
                final mqv mqvVar = (mqv) mapM200319d.get(bLiveVoiceEndSparkRanking.f44494id);
                f4n0 f4n0Var = new f4n0(this.f118914a, bLiveVoiceEndSparkRanking, mqvVar, str2, str);
                arrayList.add(f4n0Var);
                f4n0Var.m109673z(new Runnable() { // from class: l.vqn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f182659a.m98547y(str, str2, mqvVar);
                    }
                });
            }
            if (arrayList.size() >= 30) {
                arrayList.add(new o4n0());
            }
            liveBaseAdapter.m67371Z(arrayList);
            xdl0.m208344M(this.f71329x, true);
            xdl0.m208344M(this.f71305C, false);
        }
        xdl0.m208344M(this.f71331z, false);
    }

    /* JADX INFO: renamed from: F */
    public final void m98539F(BLiveVoiceRoom bLiveVoiceRoom) {
        boolean zM200296J = vwb.m200296J(bLiveVoiceRoom.topics);
        TextView textView = this.f71313h;
        if (zM200296J) {
            xdl0.m208344M(textView, false);
            return;
        }
        xdl0.m208344M(textView, !this.f118914a.m204853z0());
        if (TextUtils.isEmpty(bLiveVoiceRoom.topics.get(0).name)) {
            xdl0.m208344M(this.f71313h, false);
        }
        this.f71313h.setText(bLiveVoiceRoom.topics.get(0).name);
        this.f71311f.setText(bLiveVoiceRoom.title);
    }

    /* JADX INFO: renamed from: G */
    public final void m98540G(final BLiveSummary bLiveSummary) {
        this.f71319n.setText(x8u.m207433c(bLiveSummary.audienceCount));
        this.f71320o.setText(x8u.m207433c(bLiveSummary.newFollowCount));
        this.f71318m.setText(jbu.m140815W(bLiveSummary.duration * 1000));
        this.f71323r.setText(x8u.m207433c(bLiveSummary.receivedGifts));
        this.f71315j.setOnClickListener(new View.OnClickListener() { // from class: l.rqn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160672a.m98548z(view);
            }
        });
        boolean zM200296J = vwb.m200296J(bLiveSummary.bonusGifts.giftItems);
        AnimEffectPlayer animEffectPlayer = this.f71314i;
        if (zM200296J) {
            xdl0.m208344M(animEffectPlayer, false);
        } else {
            xdl0.m208344M(animEffectPlayer, true);
            this.f71314i.m68500j("https://auto.tancdn.com/v1/raw/574b190b-2eb2-4226-a8e1-51cded992fe811.so", -1);
            xdl0.m208329E0(this.f71314i, new View.OnClickListener() { // from class: l.sqn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166000a.m98535A(bLiveSummary, view);
                }
            });
        }
        if (this.f118914a.m204853z0() && bLiveSummary.rewardPointType.isEmpty()) {
            xdl0.m208345M0(this.f71321p, false);
            xdl0.m208345M0(this.f71324s, false);
        } else {
            boolean zEquals = GuideBoostMode.pop.equals(bLiveSummary.rewardPointType);
            VText vText = this.f71321p;
            if (zEquals) {
                vText.setText(w8u.m202217t(R$string.f47176ci));
                this.f71324s.setText(x8u.m207433c(bLiveSummary.rewardPoint));
            } else {
                vText.setText(w8u.m202217t(R$string.f47286hi));
                this.f71324s.setText(x8u.m207433c(bLiveSummary.rewardPoint));
            }
        }
        if (((bgv) ypv.m215673l(fld0.f98151f)).m101734n()) {
            this.f71321p.setText(w8u.m202217t(R$string.f47307ii));
        }
        boolean zM195906o7 = ypv.m215672k().m195906o7();
        VText vText2 = this.f71322q;
        if (!zM195906o7) {
            xdl0.m208345M0(vText2, false);
            xdl0.m208345M0(this.f71325t, false);
        } else {
            xdl0.m208345M0(vText2, true);
            xdl0.m208345M0(this.f71325t, true);
            this.f71325t.setText(x8u.m207433c(bLiveSummary.receiveGiftsUserCount));
        }
    }

    @Override // p149l.jo2, p149l.s7m
    /* JADX INFO: renamed from: b */
    public void mo21065i1(won0 won0Var) {
        this.f118914a = won0Var;
    }

    @Override // p149l.jo2
    /* JADX INFO: renamed from: c */
    public void mo98542c() {
        List<fon0> listM204846O0 = this.f118914a.m204846O0();
        this.f71303A.setupWithViewPager(this.f71304B);
        this.f71303A.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C15705a(listM204846O0));
        this.f71304B.setAdapter(new hon0(listM204846O0));
        xdl0.m208344M(this.f71329x, false);
        xdl0.m208344M(this.f71331z, true);
    }

    @Override // p149l.jo2, p149l.s7m
    public void destroy() {
        AnimEffectPlayer animEffectPlayer = this.f71314i;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
        }
    }

    @Override // p149l.jo2
    /* JADX INFO: renamed from: e */
    public void mo98543e(BLiveVoiceRoom bLiveVoiceRoom, User user, BLiveVoice bLiveVoice, BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress, List<BLiveVoiceEndSparkRanking> list, BLiveSummary bLiveSummary, LivingUsers<User> livingUsers) {
        m98539F(bLiveVoiceRoom);
        m98536B(user, livingUsers);
        m98540G(bLiveSummary);
        m98537C(bLiveVoiceEndSparkProgress);
        if (ypv.m215672k().m195906o7()) {
            m142410d(bLiveVoice.f44323id, bLiveVoice.anchor.f44419id, list, livingUsers);
        } else {
            m98538E(bLiveVoice.f44323id, bLiveVoice.anchor.f44419id, list, livingUsers);
        }
    }

    @Override // p149l.jo2
    /* JADX INFO: renamed from: f */
    public void mo98544f() {
        xdl0.m208344M(this.f71314i, false);
    }

    @Override // p149l.jo2, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m98545w(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public View m98545w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return brn0.m103560b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m98546x(BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress, View view) {
        this.f118914a.m204848Q0(bLiveVoiceEndSparkProgress.h5Url);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m98547y(String str, String str2, mqv mqvVar) {
        m142412j(str, str2, mqvVar);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m98548z(View view) {
        this.f118914a.m204843J0();
    }

    /* JADX INFO: renamed from: l.arn0$a */
    public class C15705a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f71332a;

        public C15705a(List list) {
            this.f71332a = list;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            fon0 fon0Var = (fon0) this.f71332a.get(tab.getPosition());
            if (fon0Var != null && fon0Var.m122472m() == 0) {
                arn0.this.f118914a.m204849t0(false, fon0Var);
            }
            arn0.this.f71303A.requestFocus();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }
}
