package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.data.CameraCategory;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VPager;
import p149l.C19506qi;
import p149l.C21206xs;
import p149l.C21696zh;
import p149l.d30;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMaskMenuView extends LinearLayout implements TabLayout.BaseOnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public View f16889a;

    /* JADX INFO: renamed from: b */
    public ImageView f16890b;

    /* JADX INFO: renamed from: c */
    public TabLayout f16891c;

    /* JADX INFO: renamed from: d */
    public VPager f16892d;

    /* JADX INFO: renamed from: e */
    public C19506qi f16893e;

    /* JADX INFO: renamed from: f */
    public int f16894f;

    /* JADX INFO: renamed from: g */
    public List<CameraCategory> f16895g;

    /* JADX INFO: renamed from: h */
    public d30 f16896h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMaskMenuView$a */
    public interface InterfaceC4664a {
    }

    public AccountMaskMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    private void m29100e() {
        this.f16889a.setOnClickListener(new View.OnClickListener() { // from class: l.vs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182794a.m29102g(view);
            }
        });
        this.f16890b.setOnClickListener(new View.OnClickListener() { // from class: l.ws
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187852a.m29103h(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private void m29101f(List<CameraCategory> list) {
        C19506qi c19506qi = new C19506qi(m29105d(), list);
        this.f16893e = c19506qi;
        c19506qi.m174698y(null);
        this.f16891c.setSelectedTabIndicatorHeight(0);
        this.f16891c.addOnTabSelectedListener(this);
        this.f16892d.setAdapter(this.f16893e);
        this.f16891c.setupWithViewPager(this.f16892d);
        for (int i = 0; i < this.f16891c.getTabCount(); i++) {
            if (NullChecker.m81304b(this.f16891c.getTabAt(i))) {
                this.f16891c.getTabAt(i).setCustomView(this.f16893e.m174691r(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m29102g(View view) {
        if (NullChecker.m81303a(this.f16896h)) {
            this.f16896h.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m29103h(View view) {
        if (NullChecker.m81303a(null)) {
            throw null;
        }
        if (NullChecker.m81303a(this.f16893e)) {
            this.f16893e.m174686m(-1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m29104c(View view) {
        C21206xs.m210729a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m29105d() {
        return (Act) getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29104c(this);
        m29100e();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        int position = tab.getPosition();
        this.f16894f = position;
        C19506qi c19506qi = this.f16893e;
        if (c19506qi == null) {
            return;
        }
        c19506qi.m174697x(position, Color.parseColor("#ffffff"));
        if (NullChecker.m81303a(this.f16895g) && this.f16894f < this.f16895g.size()) {
            CameraCategory cameraCategory = this.f16895g.get(this.f16894f);
            if (NullChecker.m81304b(cameraCategory)) {
                C21696zh.m218749d().m218753e(cameraCategory.f16342id, cameraCategory.cameraUpdateTime);
                this.f16893e.m174696w(this.f16894f, false);
            }
        }
        this.f16893e.m174694u(this.f16894f);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        if (NullChecker.m81304b(this.f16893e)) {
            this.f16893e.m174697x(this.f16894f, Color.parseColor("#80ffffff"));
        }
    }

    public void setCameraCategoryData(@Nullable List<CameraCategory> list) {
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            return;
        }
        this.f16895g = list;
        m29101f(list);
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f16896h = d30Var;
    }

    public void setOnFaceResourceSelectListener(InterfaceC4664a interfaceC4664a) {
        if (NullChecker.m81303a(this.f16893e)) {
            this.f16893e.m174698y(interfaceC4664a);
        }
    }

    public AccountMaskMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMaskMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
