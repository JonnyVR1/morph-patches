package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveDownBoxRewards;
import com.p051p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class r7e extends LiveMenuDialogHolder<x7e> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f161604k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f161605l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f161606m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f161607n;

    /* JADX INFO: renamed from: o */
    public TextView f161608o;

    /* JADX INFO: renamed from: p */
    public long f161609p;

    /* JADX INFO: renamed from: q */
    public boolean f161610q;

    /* JADX INFO: renamed from: l.r7e$a */
    public class C19784a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f161611a;

        public C19784a(String str) {
            this.f161611a = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m180126a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m180127b(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m180128c(Integer num) {
        }

        @Override // p153l.x20
        public void call() {
            if (r7e.this.f161610q) {
                return;
            }
            ((x7e) r7e.this.f48605b).m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136086w(((hiv) zrv.m221194l(htd0.f111521c)).m135161m(this.f161611a), new y20() { // from class: l.o7e
                @Override // p153l.y20
                public final void call(Object obj) {
                    r7e.C19784a.m180127b((BLiveGivenGiftBrief) obj);
                }
            }, new y20() { // from class: l.p7e
                @Override // p153l.y20
                public final void call(Object obj) {
                    r7e.C19784a.m180126a((Throwable) obj);
                }
            }, new y20() { // from class: l.q7e
                @Override // p153l.y20
                public final void call(Object obj) {
                    r7e.C19784a.m180128c((Integer) obj);
                }
            }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.firstscreen))));
        }
    }

    public r7e(Act act, x7e x7eVar) {
        super(yec0.f199098h3, act, x7eVar);
        this.f161610q = false;
        m73014A(17);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m180113G(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m180118O(View view) {
        mo73021p();
    }

    /* JADX INFO: renamed from: S */
    private void m180119S(String str) {
        ((x7e) this.f48605b).m213811F2().GiftDialogEventGroup.reloadGiftWithAction().mo199273j(jyb.m147494Y(627, new C19784a(str)));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m180120K(View view) {
        s7e.m185004a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final View m180122N(String str, String str2, String str3, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = qa00.m175859d(z ? 1.0f : 7.0f);
        TextView textView = new TextView(((x7e) this.f48605b).act());
        textView.setText(str);
        textView.setTextColor(Color.parseColor(str3));
        textView.setTextSize(14.0f);
        if (TextUtils.isEmpty(str2)) {
            textView.setLayoutParams(layoutParams);
            return textView;
        }
        LinearLayout linearLayout = new LinearLayout(((x7e) this.f48605b).act());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        VDraweeView vDraweeView = new VDraweeView(((x7e) this.f48605b).act());
        int i = qa00.f156335v;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.rightMargin = qa00.f156319f;
        vDraweeView.setLayoutParams(layoutParams2);
        izs.m142868s("context_livingAct", vDraweeView, str2);
        linearLayout.addView(vDraweeView);
        linearLayout.addView(textView);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m180123P(BLiveDownChestRewardInfo bLiveDownChestRewardInfo) {
        m180119S(bLiveDownChestRewardInfo.rewards.get(0).f45206id);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l.oo2] */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m180124Q(boolean z, final BLiveDownChestRewardInfo bLiveDownChestRewardInfo, View view) {
        T t = this.f48605b;
        if (t == 0) {
            return;
        }
        if (z) {
            z7e.m218885c(((x7e) t).mo78457R2(), ((x7e) this.f48605b).m213810E2());
        } else {
            z7e.m218887e(((x7e) t).mo78457R2(), ((x7e) this.f48605b).m213810E2(), bLiveDownChestRewardInfo.rewards.get(0).f45206id);
        }
        mo73021p();
        if (z) {
            ((x7e) this.f48605b).m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(627).m103154e(bLiveDownChestRewardInfo.jump.schema).m103152c());
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f161609p;
        if (jElapsedRealtime < 1000) {
            ((x7e) this.f48605b).m138879z3(jElapsedRealtime, new Runnable() { // from class: l.n7e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140596a.m180123P(bLiveDownChestRewardInfo);
                }
            });
        } else {
            m180119S(bLiveDownChestRewardInfo.rewards.get(0).f45206id);
        }
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r8v6, types: [l.oo2] */
    /* JADX INFO: renamed from: R */
    public void m180125R(final BLiveDownChestRewardInfo bLiveDownChestRewardInfo, String str, final boolean z) {
        List<BLiveDownBoxRewards> list;
        if (bLiveDownChestRewardInfo == null || bLiveDownChestRewardInfo.contents == null || (list = bLiveDownChestRewardInfo.rewards) == null || list.isEmpty()) {
            return;
        }
        this.f161610q = false;
        this.f161609p = SystemClock.elapsedRealtime();
        this.f161607n.removeAllViews();
        if (!bLiveDownChestRewardInfo.contents.isEmpty()) {
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= bLiveDownChestRewardInfo.contents.size()) {
                    break;
                }
                BLiveCommonViewConfig bLiveCommonViewConfig = bLiveDownChestRewardInfo.contents.get(i);
                LinearLayout linearLayout = this.f161607n;
                String str2 = bLiveCommonViewConfig.text;
                String str3 = bLiveCommonViewConfig.icon;
                String str4 = bLiveCommonViewConfig.color;
                i++;
                if (bLiveDownChestRewardInfo.contents.size() <= i || TextUtils.isEmpty(bLiveDownChestRewardInfo.contents.get(i).icon)) {
                    z2 = false;
                }
                linearLayout.addView(m180122N(str2, str3, str4, z2));
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f161608o.getLayoutParams();
            List<BLiveCommonViewConfig> list2 = bLiveDownChestRewardInfo.contents;
            if (TextUtils.isEmpty(list2.get(list2.size() - 1).icon)) {
                layoutParams.topMargin = qa00.m175859d(17.0f);
            } else {
                layoutParams.topMargin = qa00.m175859d(11.0f);
            }
            this.f161608o.setLayoutParams(layoutParams);
        }
        BLiveDownBoxRewards bLiveDownBoxRewards = bLiveDownChestRewardInfo.rewards.get(0);
        izs.m142868s("context_livingAct", this.f161606m, bLiveDownBoxRewards.icon);
        this.f161608o.setText(bLiveDownChestRewardInfo.jump.text);
        bnl0.m105509E0(this.f161608o, new View.OnClickListener() { // from class: l.m7e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135070a.m180124Q(z, bLiveDownChestRewardInfo, view);
            }
        });
        T t = this.f48605b;
        if (z) {
            z7e.m218886d(((x7e) t).mo78457R2(), ((x7e) this.f48605b).m213810E2());
        } else {
            ((x7e) t).m209580Z3(bLiveDownBoxRewards.f45206id, str);
            z7e.m218888f(((x7e) this.f48605b).mo78457R2(), ((x7e) this.f48605b).m213810E2(), bLiveDownChestRewardInfo.rewards.get(0).f45206id);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        super.destroy();
        this.f161610q = true;
        TextView textView = this.f161608o;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m180120K(view);
        this.f161608o.setBackground(fc2.m124975e(new int[]{-50688, -31446}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.m175859d(6.0f), false));
        this.f161604k.setOnClickListener(new View.OnClickListener() { // from class: l.k7e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f124262a.m180118O(view2);
            }
        });
        this.f161605l.setOnClickListener(new View.OnClickListener() { // from class: l.l7e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                r7e.m180113G(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(x7e x7eVar) {
    }
}
