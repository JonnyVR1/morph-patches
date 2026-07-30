package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.label.CommonTextureFrameLayout;
import l.j760;
import l.t100;
import l.vwb;
import l.zvf0;
import p007l.f3c0;
import p007l.nbq0;
import p007l.qai;
import p007l.tai;
import p007l.vqg;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedWriterLevelView extends CommonTextureFrameLayout implements nbq0 {

    /* JADX INFO: renamed from: k */
    public FrameLayout f3148k;

    /* JADX INFO: renamed from: l */
    public TextView f3149l;

    /* JADX INFO: renamed from: m */
    public String f3150m;

    /* JADX INFO: renamed from: n */
    public int f3151n;

    /* JADX INFO: renamed from: o */
    public boolean f3152o;

    public FeedWriterLevelView(@NonNull Context context, String str) {
        super(context);
        this.f3150m = str;
        m5514o(context);
    }

    private static String getWriterLevelNetLink() {
        return "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/creation/creationLevel/index.html?speed=true&_bid=1002741&%s";
    }

    /* JADX INFO: renamed from: n */
    public static String m5505n(String str) {
        StringBuilder sb = new StringBuilder("showFrom=");
        sb.append(str);
        String.format(getWriterLevelNetLink(), sb.toString());
        return String.format(getWriterLevelNetLink(), sb.toString());
    }

    @Override // p007l.nbq0
    /* JADX INFO: renamed from: a */
    public void mo5506a(User user, int i) {
        m5512l(user, i, false);
    }

    @Override // p007l.nbq0
    /* JADX INFO: renamed from: b */
    public void mo5507b(User user, int i) {
        m5512l(user, i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.nbq0
    public View getView() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    public View m5508h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tai.m14480b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final Act m5509i() {
        return getContext();
    }

    /* JADX INFO: renamed from: j */
    public void m5510j() {
        m5511k(true);
    }

    /* JADX INFO: renamed from: k */
    public void m5511k(boolean z) {
        if (z || !this.f3152o) {
            this.f3152o = true;
            zvf0.A("e_moment_level", vqg.m15485K(this.f3150m, false), new j760[]{vwb.Y("moment_level_id", "Lv" + this.f3151n)});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m5512l(User user, int i, boolean z) {
        int iM13497a = new qai(user).m13497a();
        this.f3151n = iM13497a;
        if (iM13497a < i) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f3149l.setText(String.format("动态Lv%d", Integer.valueOf(this.f3151n)));
        boolean zI4 = FeedModule.m1140H().I4();
        int i2 = this.f3151n;
        if (!zI4) {
            FrameLayout frameLayout = this.f3148k;
            if (i2 == 0) {
                frameLayout.setBackgroundResource(f3c0.f7786d6);
            } else {
                frameLayout.setBackgroundResource(f3c0.f7778c6);
            }
        } else if (i2 == 0) {
            setBackgroundResource(f3c0.f7786d6);
        } else {
            setBackgroundResource(f3c0.f7871o3);
        }
        if (z) {
            m5511k(false);
        }
    }

    /* JADX INFO: renamed from: m */
    public String m5513m(String str) {
        StringBuilder sb = new StringBuilder("showFrom=");
        if ("from_mine_tab_album".equals(str)) {
            sb.append("mine");
        } else if ("p_suggest_users_home_view".equals(str)) {
            sb.append("swipe");
        } else if (OMSDialogPositon.p_suggest_user_profile_info_view.equals(str)) {
            sb.append("profile");
        } else {
            sb.append("feed");
        }
        return String.format(getWriterLevelNetLink(), sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final void m5514o(Context context) {
        if (FeedModule.m1140H().I4()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, t100.d(14.0f));
            layoutParams.gravity = 17;
            View viewM5508h = m5508h(LayoutInflater.from(context), this);
            viewM5508h.setPadding(viewM5508h.getPaddingLeft(), 0, viewM5508h.getPaddingRight(), 0);
            addView(viewM5508h, layoutParams);
            d(true, t100.d(4.0f));
            this.f3149l.setTextSize(8.0f);
        } else {
            addView(m5508h(LayoutInflater.from(context), this));
        }
        m5515p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final void m5515p() {
        setOnClickListener(new View.OnClickListener() { // from class: l.sai
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12862a.m5516q(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m5516q(View view) {
        vqg.m15486K0(m5509i(), m5513m(this.f3150m));
        zvf0.u("e_moment_level", vqg.m15485K(this.f3150m, false), new j760[]{vwb.Y("moment_level_id", "Lv" + this.f3151n)});
    }

    public void setFrom(String str) {
        this.f3150m = str;
    }

    public FeedWriterLevelView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m5514o(context);
    }

    public FeedWriterLevelView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5514o(context);
    }

    public FeedWriterLevelView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m5514o(context);
    }
}
