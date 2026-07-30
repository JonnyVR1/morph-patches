package com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import java.util.List;
import l.sxj;
import l.vwb;
import l.xdl0;
import p002l.fsj0;
import p002l.ksj0;
import p002l.lsj0;
import p002l.mtj0;
import p002l.psj0;
import p002l.xsj0;
import p002l.zsj0;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UpgradeGiftContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f6241d;

    /* JADX INFO: renamed from: e */
    public View f6242e;

    /* JADX INFO: renamed from: f */
    public TabLayout f6243f;

    /* JADX INFO: renamed from: g */
    public FixedScrollView f6244g;

    /* JADX INFO: renamed from: h */
    public UnScrollVPager f6245h;

    /* JADX INFO: renamed from: i */
    public View f6246i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f6247j;

    /* JADX INFO: renamed from: k */
    public mtj0 f6248k;

    /* JADX INFO: renamed from: l */
    public zsj0 f6249l;

    /* JADX INFO: renamed from: m */
    public lsj0 f6250m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftContentView$a */
    public class C0426a implements lsj0 {
        public C0426a() {
        }

        @Override // p002l.lsj0
        /* JADX INFO: renamed from: a */
        public void mo7890a(String str) {
            UpgradeGiftContentView.this.f6248k.m18180b4(str);
        }

        @Override // p002l.lsj0
        /* JADX INFO: renamed from: b */
        public void mo7891b(xsj0 xsj0Var) {
            if (UpgradeGiftContentView.this.f6248k != null) {
                UpgradeGiftContentView.this.f6248k.m18170S3(xsj0Var);
            }
        }

        @Override // p002l.lsj0
        /* JADX INFO: renamed from: c */
        public String mo7892c() {
            return UpgradeGiftContentView.this.f6248k.m18172T3();
        }
    }

    public UpgradeGiftContentView(@NonNull Context context) {
        super(context);
        this.f6250m = new C0426a();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m7885k0(View view) {
        psj0.m20653a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7886l0(List<fsj0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TabLayout.Tab tabAt = this.f6243f.getTabAt(i);
            if (tabAt != null) {
                tabAt.setText(list.get(i).f10627b);
            }
        }
        this.f6243f.setSelectedTabIndicatorColor(list.size() > 1 ? -1 : 0);
    }

    /* JADX INFO: renamed from: m0 */
    public void m7887m0(final BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, final mtj0 mtj0Var) {
        this.f6248k = mtj0Var;
        this.f6241d.setOnClickListener(new View.OnClickListener() { // from class: l.nsj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mtj0Var.m18169R3();
            }
        });
        if (bLiveUpgradeGiftInfo == null || vwb.J(bLiveUpgradeGiftInfo.slotGiftInfos)) {
            xdl0.M(this.f6247j, true);
            return;
        }
        if (this.f6249l == null) {
            zsj0 zsj0Var = new zsj0();
            this.f6249l = zsj0Var;
            this.f6245h.setAdapter(zsj0Var);
            this.f6243f.setupWithViewPager(this.f6245h);
        }
        xdl0.M(this.f6246i, true ^ TextUtils.isEmpty(bLiveUpgradeGiftInfo.rule.entrance));
        this.f6246i.setOnClickListener(new View.OnClickListener() { // from class: l.osj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mtj0Var.m18178Z3(bLiveUpgradeGiftInfo.rule.entrance);
            }
        });
        List<fsj0> listM16778e = ksj0.m16778e(bLiveUpgradeGiftInfo, this.f6250m);
        this.f6249l.m18148q(listM16778e);
        m7886l0(listM16778e);
        xdl0.M(this.f6247j, false);
    }

    /* JADX INFO: renamed from: n0 */
    public void m7888n0() {
        xdl0.M(this.f6247j, true);
    }

    /* JADX INFO: renamed from: o0 */
    public void m7889o0(xsj0 xsj0Var) {
        UnScrollVPager unScrollVPager = this.f6245h;
        View viewA = sxj.a(unScrollVPager, unScrollVPager.getCurrentItem());
        if (viewA instanceof UpgradeGiftView) {
            ((UpgradeGiftView) viewA).m7942d(xsj0Var.m26104d());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void onDestroy() {
        int childCount = this.f6245h.getChildCount();
        int i = 0;
        if (childCount >= 1) {
            this.f6245h.setCurrentItem(0);
        }
        while (true) {
            VPager vPager = this.f6245h;
            if (i >= childCount) {
                vPager.removeAllViews();
                this.f6243f.removeAllTabs();
                return;
            } else {
                View childAt = vPager.getChildAt(i);
                if (childAt instanceof UpgradeGiftView) {
                    ((UpgradeGiftView) childAt).m7940b();
                }
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7885k0(this);
        this.f6244g.getLayoutParams().height = (int) (xdl0.w0() * 0.7f);
    }

    public UpgradeGiftContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6250m = new C0426a();
    }

    public UpgradeGiftContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6250m = new C0426a();
    }
}
