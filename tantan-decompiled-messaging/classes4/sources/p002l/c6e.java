package p002l;

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
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveDownBoxRewards;
import com.p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import java.util.List;
import l.d30;
import l.e30;
import l.fld0;
import l.ggv;
import l.hxs;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yb2;
import l.ypv;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c6e extends LiveMenuDialogHolder<i6e> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f8498k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f8499l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f8500m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f8501n;

    /* JADX INFO: renamed from: o */
    public TextView f8502o;

    /* JADX INFO: renamed from: p */
    public long f8503p;

    /* JADX INFO: renamed from: q */
    public boolean f8504q;

    /* JADX INFO: renamed from: l.c6e$a */
    public class C0509a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8505a;

        public C0509a(String str) {
            this.f8505a = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m10763a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m10764b(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m10765c(Integer num) {
        }

        public void call() {
            if (c6e.this.f8504q) {
                return;
            }
            ((i6e) c6e.this.f3799b).m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10985w(((ggv) ypv.l(fld0.c)).m(this.f8505a), new e30() { // from class: l.z5e
                public final void call(Object obj) {
                    c6e.C0509a.m10764b((BLiveGivenGiftBrief) obj);
                }
            }, new e30() { // from class: l.a6e
                public final void call(Object obj) {
                    c6e.C0509a.m10763a((Throwable) obj);
                }
            }, new e30() { // from class: l.b6e
                public final void call(Object obj) {
                    c6e.C0509a.m10765c((Integer) obj);
                }
            }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("firstscreen"))));
        }
    }

    public c6e(Act act, i6e i6eVar) {
        super(t6c0.f19862h3, act, i6eVar);
        this.f8504q = false;
        m5207A(17);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m10750G(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m10755O(View view) {
        mo5216p();
    }

    /* JADX INFO: renamed from: S */
    private void m10756S(String str) {
        ((i6e) this.f3799b).m25548F2().GiftDialogEventGroup.reloadGiftWithAction().j(vwb.Y(627, new C0509a(str)));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m10757K(View view) {
        d6e.m11606a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final View m10759N(String str, String str2, String str3, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = t100.d(z ? 1.0f : 7.0f);
        TextView textView = new TextView(((i6e) this.f3799b).act());
        textView.setText(str);
        textView.setTextColor(Color.parseColor(str3));
        textView.setTextSize(14.0f);
        if (TextUtils.isEmpty(str2)) {
            textView.setLayoutParams(layoutParams);
            return textView;
        }
        LinearLayout linearLayout = new LinearLayout(((i6e) this.f3799b).act());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        View vDraweeView = new VDraweeView(((i6e) this.f3799b).act());
        int i = t100.v;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.rightMargin = t100.f;
        vDraweeView.setLayoutParams(layoutParams2);
        hxs.s("context_livingAct", vDraweeView, str2);
        linearLayout.addView(vDraweeView);
        linearLayout.addView(textView);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m10760P(BLiveDownChestRewardInfo bLiveDownChestRewardInfo) {
        m10756S(((BLiveDownBoxRewards) bLiveDownChestRewardInfo.rewards.get(0)).id);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l.ho2] */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m10761Q(boolean z, final BLiveDownChestRewardInfo bLiveDownChestRewardInfo, View view) {
        T t = this.f3799b;
        if (t == 0) {
            return;
        }
        if (z) {
            k6e.m16503c(((i6e) t).mo21430R2(), ((i6e) this.f3799b).m25547E2());
        } else {
            k6e.m16505e(((i6e) t).mo21430R2(), ((i6e) this.f3799b).m25547E2(), ((BLiveDownBoxRewards) bLiveDownChestRewardInfo.rewards.get(0)).id);
        }
        mo5216p();
        if (z) {
            ((i6e) this.f3799b).m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(627).m25610e(bLiveDownChestRewardInfo.jump.schema).m25608c());
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8503p;
        if (jElapsedRealtime < 1000) {
            ((i6e) this.f3799b).m14207z3(jElapsedRealtime, new Runnable() { // from class: l.y5e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22666a.m10760P(bLiveDownChestRewardInfo);
                }
            });
        } else {
            m10756S(((BLiveDownBoxRewards) bLiveDownChestRewardInfo.rewards.get(0)).id);
        }
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r8v6, types: [l.ho2] */
    /* JADX INFO: renamed from: R */
    public void m10762R(final BLiveDownChestRewardInfo bLiveDownChestRewardInfo, String str, final boolean z) {
        List list;
        if (bLiveDownChestRewardInfo == null || bLiveDownChestRewardInfo.contents == null || (list = bLiveDownChestRewardInfo.rewards) == null || list.isEmpty()) {
            return;
        }
        this.f8504q = false;
        this.f8503p = SystemClock.elapsedRealtime();
        this.f8501n.removeAllViews();
        if (!bLiveDownChestRewardInfo.contents.isEmpty()) {
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= bLiveDownChestRewardInfo.contents.size()) {
                    break;
                }
                BLiveCommonViewConfig bLiveCommonViewConfig = (BLiveCommonViewConfig) bLiveDownChestRewardInfo.contents.get(i);
                LinearLayout linearLayout = this.f8501n;
                String str2 = bLiveCommonViewConfig.text;
                String str3 = bLiveCommonViewConfig.icon;
                String str4 = bLiveCommonViewConfig.color;
                i++;
                if (bLiveDownChestRewardInfo.contents.size() <= i || TextUtils.isEmpty(((BLiveCommonViewConfig) bLiveDownChestRewardInfo.contents.get(i)).icon)) {
                    z2 = false;
                }
                linearLayout.addView(m10759N(str2, str3, str4, z2));
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8502o.getLayoutParams();
            List list2 = bLiveDownChestRewardInfo.contents;
            if (TextUtils.isEmpty(((BLiveCommonViewConfig) list2.get(list2.size() - 1)).icon)) {
                layoutParams.topMargin = t100.d(17.0f);
            } else {
                layoutParams.topMargin = t100.d(11.0f);
            }
            this.f8502o.setLayoutParams(layoutParams);
        }
        BLiveDownBoxRewards bLiveDownBoxRewards = (BLiveDownBoxRewards) bLiveDownChestRewardInfo.rewards.get(0);
        hxs.s("context_livingAct", this.f8500m, bLiveDownBoxRewards.icon);
        this.f8502o.setText(bLiveDownChestRewardInfo.jump.text);
        xdl0.E0(this.f8502o, new View.OnClickListener() { // from class: l.x5e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22126a.m10761Q(z, bLiveDownChestRewardInfo, view);
            }
        });
        T t = this.f3799b;
        if (z) {
            k6e.m16504d(((i6e) t).mo21430R2(), ((i6e) this.f3799b).m25547E2());
        } else {
            ((i6e) t).m15030Z3(bLiveDownBoxRewards.id, str);
            k6e.m16506f(((i6e) this.f3799b).mo21430R2(), ((i6e) this.f3799b).m25547E2(), ((BLiveDownBoxRewards) bLiveDownChestRewardInfo.rewards.get(0)).id);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public void destroy() {
        super.destroy();
        this.f8504q = true;
        TextView textView = this.f8502o;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m10757K(view);
        this.f8502o.setBackground(yb2.e(new int[]{-50688, -31446}, GradientDrawable.Orientation.LEFT_RIGHT, t100.d(6.0f), false));
        this.f8498k.setOnClickListener(new View.OnClickListener() { // from class: l.v5e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20978a.m10755O(view2);
            }
        });
        this.f8499l.setOnClickListener(new View.OnClickListener() { // from class: l.w5e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c6e.m10750G(view2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(i6e i6eVar) {
    }
}
