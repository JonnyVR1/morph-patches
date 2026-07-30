package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveDownBoxRewards;
import com.p046p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class c6e extends LiveMenuDialogHolder<i6e> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f79530k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f79531l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f79532m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f79533n;

    /* JADX INFO: renamed from: o */
    public TextView f79534o;

    /* JADX INFO: renamed from: p */
    public long f79535p;

    /* JADX INFO: renamed from: q */
    public boolean f79536q;

    /* JADX INFO: renamed from: l.c6e$a */
    public class C16086a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f79537a;

        public C16086a(String str) {
            this.f79537a = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m105425a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m105426b(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m105427c(Integer num) {
        }

        @Override // p149l.d30
        public void call() {
            if (c6e.this.f79536q) {
                return;
            }
            ((i6e) c6e.this.f47757b).m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106532w(((ggv) ypv.m215673l(fld0.f98148c)).m126027m(this.f79537a), new e30() { // from class: l.z5e
                @Override // p149l.e30
                public final void call(Object obj) {
                    c6e.C16086a.m105426b((BLiveGivenGiftBrief) obj);
                }
            }, new e30() { // from class: l.a6e
                @Override // p149l.e30
                public final void call(Object obj) {
                    c6e.C16086a.m105425a((Throwable) obj);
                }
            }, new e30() { // from class: l.b6e
                @Override // p149l.e30
                public final void call(Object obj) {
                    c6e.C16086a.m105427c((Integer) obj);
                }
            }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.firstscreen))));
        }
    }

    public c6e(Act act, i6e i6eVar) {
        super(t6c0.f168366h3, act, i6eVar);
        this.f79536q = false;
        m71831A(17);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m105412G(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m105417O(View view) {
        mo71838p();
    }

    /* JADX INFO: renamed from: S */
    private void m105418S(String str) {
        ((i6e) this.f47757b).m206028F2().GiftDialogEventGroup.reloadGiftWithAction().mo172463j(vwb.m200311Y(627, new C16086a(str)));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m105419K(View view) {
        d6e.m110163a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final View m105421N(String str, String str2, String str3, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = t100.m186890d(z ? 1.0f : 7.0f);
        TextView textView = new TextView(((i6e) this.f47757b).act());
        textView.setText(str);
        textView.setTextColor(Color.parseColor(str3));
        textView.setTextSize(14.0f);
        if (TextUtils.isEmpty(str2)) {
            textView.setLayoutParams(layoutParams);
            return textView;
        }
        LinearLayout linearLayout = new LinearLayout(((i6e) this.f47757b).act());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        VDraweeView vDraweeView = new VDraweeView(((i6e) this.f47757b).act());
        int i = t100.f167273v;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.rightMargin = t100.f167257f;
        vDraweeView.setLayoutParams(layoutParams2);
        hxs.m133406s("context_livingAct", vDraweeView, str2);
        linearLayout.addView(vDraweeView);
        linearLayout.addView(textView);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m105422P(BLiveDownChestRewardInfo bLiveDownChestRewardInfo) {
        m105418S(bLiveDownChestRewardInfo.rewards.get(0).f44358id);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l.ho2] */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m105423Q(boolean z, final BLiveDownChestRewardInfo bLiveDownChestRewardInfo, View view) {
        T t = this.f47757b;
        if (t == 0) {
            return;
        }
        if (z) {
            k6e.m144579c(((i6e) t).mo77274R2(), ((i6e) this.f47757b).m206027E2());
        } else {
            k6e.m144581e(((i6e) t).mo77274R2(), ((i6e) this.f47757b).m206027E2(), bLiveDownChestRewardInfo.rewards.get(0).f44358id);
        }
        mo71838p();
        if (z) {
            ((i6e) this.f47757b).m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(627).m206701e(bLiveDownChestRewardInfo.jump.schema).m206699c());
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f79535p;
        if (jElapsedRealtime < 1000) {
            ((i6e) this.f47757b).m129320z3(jElapsedRealtime, new Runnable() { // from class: l.y5e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f196417a.m105422P(bLiveDownChestRewardInfo);
                }
            });
        } else {
            m105418S(bLiveDownChestRewardInfo.rewards.get(0).f44358id);
        }
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r8v6, types: [l.ho2] */
    /* JADX INFO: renamed from: R */
    public void m105424R(final BLiveDownChestRewardInfo bLiveDownChestRewardInfo, String str, final boolean z) {
        List<BLiveDownBoxRewards> list;
        if (bLiveDownChestRewardInfo == null || bLiveDownChestRewardInfo.contents == null || (list = bLiveDownChestRewardInfo.rewards) == null || list.isEmpty()) {
            return;
        }
        this.f79536q = false;
        this.f79535p = SystemClock.elapsedRealtime();
        this.f79533n.removeAllViews();
        if (!bLiveDownChestRewardInfo.contents.isEmpty()) {
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= bLiveDownChestRewardInfo.contents.size()) {
                    break;
                }
                BLiveCommonViewConfig bLiveCommonViewConfig = bLiveDownChestRewardInfo.contents.get(i);
                LinearLayout linearLayout = this.f79533n;
                String str2 = bLiveCommonViewConfig.text;
                String str3 = bLiveCommonViewConfig.icon;
                String str4 = bLiveCommonViewConfig.color;
                i++;
                if (bLiveDownChestRewardInfo.contents.size() <= i || TextUtils.isEmpty(bLiveDownChestRewardInfo.contents.get(i).icon)) {
                    z2 = false;
                }
                linearLayout.addView(m105421N(str2, str3, str4, z2));
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f79534o.getLayoutParams();
            List<BLiveCommonViewConfig> list2 = bLiveDownChestRewardInfo.contents;
            if (TextUtils.isEmpty(list2.get(list2.size() - 1).icon)) {
                layoutParams.topMargin = t100.m186890d(17.0f);
            } else {
                layoutParams.topMargin = t100.m186890d(11.0f);
            }
            this.f79534o.setLayoutParams(layoutParams);
        }
        BLiveDownBoxRewards bLiveDownBoxRewards = bLiveDownChestRewardInfo.rewards.get(0);
        hxs.m133406s("context_livingAct", this.f79532m, bLiveDownBoxRewards.icon);
        this.f79534o.setText(bLiveDownChestRewardInfo.jump.text);
        xdl0.m208329E0(this.f79534o, new View.OnClickListener() { // from class: l.x5e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191129a.m105423Q(z, bLiveDownChestRewardInfo, view);
            }
        });
        T t = this.f47757b;
        if (z) {
            k6e.m144580d(((i6e) t).mo77274R2(), ((i6e) this.f47757b).m206027E2());
        } else {
            ((i6e) t).m134609Z3(bLiveDownBoxRewards.f44358id, str);
            k6e.m144582f(((i6e) this.f47757b).mo77274R2(), ((i6e) this.f47757b).m206027E2(), bLiveDownChestRewardInfo.rewards.get(0).f44358id);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        super.destroy();
        this.f79536q = true;
        TextView textView = this.f79534o;
        if (textView != null) {
            textView.setOnClickListener(null);
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
        m105419K(view);
        this.f79534o.setBackground(yb2.m213880e(new int[]{-50688, -31446}, GradientDrawable.Orientation.LEFT_RIGHT, t100.m186890d(6.0f), false));
        this.f79530k.setOnClickListener(new View.OnClickListener() { // from class: l.v5e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f180022a.m105417O(view2);
            }
        });
        this.f79531l.setOnClickListener(new View.OnClickListener() { // from class: l.w5e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c6e.m105412G(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(i6e i6eVar) {
    }
}
