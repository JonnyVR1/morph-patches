package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.account.data.CameraCategory;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import p006l.C1169qi;
import p006l.C1451xs;
import p006l.C1521zh;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMaskMenuView extends LinearLayout implements TabLayout.BaseOnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public View f878a;

    /* JADX INFO: renamed from: b */
    public ImageView f879b;

    /* JADX INFO: renamed from: c */
    public TabLayout f880c;

    /* JADX INFO: renamed from: d */
    public VPager f881d;

    /* JADX INFO: renamed from: e */
    public C1169qi f882e;

    /* JADX INFO: renamed from: f */
    public int f883f;

    /* JADX INFO: renamed from: g */
    public List<CameraCategory> f884g;

    /* JADX INFO: renamed from: h */
    public d30 f885h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMaskMenuView$a */
    public interface InterfaceC0090a {
    }

    public AccountMaskMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    private void m1006e() {
        this.f878a.setOnClickListener(new View.OnClickListener() { // from class: l.vs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24438a.m1008g(view);
            }
        });
        this.f879b.setOnClickListener(new View.OnClickListener() { // from class: l.ws
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25340a.m1009h(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private void m1007f(List<CameraCategory> list) {
        C1169qi c1169qi = new C1169qi(m1011d(), list);
        this.f882e = c1169qi;
        c1169qi.m22107y(null);
        this.f880c.setSelectedTabIndicatorHeight(0);
        this.f880c.addOnTabSelectedListener(this);
        this.f881d.setAdapter(this.f882e);
        this.f880c.setupWithViewPager(this.f881d);
        for (int i = 0; i < this.f880c.getTabCount(); i++) {
            if (NullChecker.b(this.f880c.getTabAt(i))) {
                this.f880c.getTabAt(i).setCustomView(this.f882e.m22100r(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m1008g(View view) {
        if (NullChecker.a(this.f885h)) {
            this.f885h.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m1009h(View view) {
        if (NullChecker.a((Object) null)) {
            throw null;
        }
        if (NullChecker.a(this.f882e)) {
            this.f882e.m22095m(-1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1010c(View view) {
        C1451xs.m27601a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m1011d() {
        return getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1010c(this);
        m1006e();
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabSelected(TabLayout.Tab tab) {
        int position = tab.getPosition();
        this.f883f = position;
        C1169qi c1169qi = this.f882e;
        if (c1169qi == null) {
            return;
        }
        c1169qi.m22106x(position, Color.parseColor("#ffffff"));
        if (NullChecker.a(this.f884g) && this.f883f < this.f884g.size()) {
            CameraCategory cameraCategory = this.f884g.get(this.f883f);
            if (NullChecker.b(cameraCategory)) {
                C1521zh.m28702d().m28706e(cameraCategory.f331id, cameraCategory.cameraUpdateTime);
                this.f882e.m22105w(this.f883f, false);
            }
        }
        this.f882e.m22103u(this.f883f);
    }

    public void onTabUnselected(TabLayout.Tab tab) {
        if (NullChecker.b(this.f882e)) {
            this.f882e.m22106x(this.f883f, Color.parseColor("#80ffffff"));
        }
    }

    public void setCameraCategoryData(@Nullable List<CameraCategory> list) {
        if (!NullChecker.a(list) || list.size() <= 0) {
            return;
        }
        this.f884g = list;
        m1007f(list);
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f885h = d30Var;
    }

    public void setOnFaceResourceSelectListener(InterfaceC0090a interfaceC0090a) {
        if (NullChecker.a(this.f882e)) {
            this.f882e.m22107y(interfaceC0090a);
        }
    }

    public AccountMaskMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMaskMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
