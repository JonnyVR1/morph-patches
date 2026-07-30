package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.label.CommonTextureFrameLayout;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import p153l.fci;
import p153l.i4g0;
import p153l.ici;
import p153l.jyb;
import p153l.ksg;
import p153l.lbc0;
import p153l.qa00;
import p153l.skq0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedWriterLevelView extends CommonTextureFrameLayout implements skq0 {

    /* JADX INFO: renamed from: k */
    public FrameLayout f42535k;

    /* JADX INFO: renamed from: l */
    public TextView f42536l;

    /* JADX INFO: renamed from: m */
    public String f42537m;

    /* JADX INFO: renamed from: n */
    public int f42538n;

    /* JADX INFO: renamed from: o */
    public boolean f42539o;

    public FeedWriterLevelView(@NonNull Context context, String str) {
        super(context);
        this.f42537m = str;
        m65613o(context);
    }

    private static String getWriterLevelNetLink() {
        return "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/creation/creationLevel/index.html?speed=true&_bid=1002741&%s";
    }

    /* JADX INFO: renamed from: n */
    public static String m65604n(String str) {
        StringBuilder sb = new StringBuilder("showFrom=");
        sb.append(str);
        String.format(getWriterLevelNetLink(), sb.toString());
        return String.format(getWriterLevelNetLink(), sb.toString());
    }

    @Override // p153l.skq0
    /* JADX INFO: renamed from: a */
    public void mo65605a(User user, int i) {
        m65611l(user, i, false);
    }

    @Override // p153l.skq0
    /* JADX INFO: renamed from: b */
    public void mo65606b(User user, int i) {
        m65611l(user, i, true);
    }

    @Override // p153l.skq0
    public View getView() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    public View m65607h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ici.m139441b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public final Act m65608i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j */
    public void m65609j() {
        m65610k(true);
    }

    /* JADX INFO: renamed from: k */
    public void m65610k(boolean z) {
        if (z || !this.f42539o) {
            this.f42539o = true;
            i4g0.m138492A("e_moment_level", ksg.m151174K(this.f42537m, false), jyb.m147494Y("moment_level_id", "Lv" + this.f42538n));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m65611l(User user, int i, boolean z) {
        int iM125010a = new fci(user).m125010a();
        this.f42538n = iM125010a;
        if (iM125010a < i) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f42536l.setText(String.format("动态Lv%d", Integer.valueOf(this.f42538n)));
        boolean zMo31695I4 = FeedModule.m61406H().mo31695I4();
        int i2 = this.f42538n;
        if (!zMo31695I4) {
            FrameLayout frameLayout = this.f42535k;
            if (i2 == 0) {
                frameLayout.setBackgroundResource(lbc0.f131021d6);
            } else {
                frameLayout.setBackgroundResource(lbc0.f131013c6);
            }
        } else if (i2 == 0) {
            setBackgroundResource(lbc0.f131021d6);
        } else {
            setBackgroundResource(lbc0.f131106o3);
        }
        if (z) {
            m65610k(false);
        }
    }

    /* JADX INFO: renamed from: m */
    public String m65612m(String str) {
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

    /* JADX INFO: renamed from: o */
    public final void m65613o(Context context) {
        if (FeedModule.m61406H().mo31695I4()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, qa00.m175859d(14.0f));
            layoutParams.gravity = 17;
            View viewM65607h = m65607h(LayoutInflater.from(context), this);
            viewM65607h.setPadding(viewM65607h.getPaddingLeft(), 0, viewM65607h.getPaddingRight(), 0);
            addView(viewM65607h, layoutParams);
            m22091d(true, qa00.m175859d(4.0f));
            this.f42536l.setTextSize(8.0f);
        } else {
            addView(m65607h(LayoutInflater.from(context), this));
        }
        m65614p();
    }

    /* JADX INFO: renamed from: p */
    public final void m65614p() {
        setOnClickListener(new View.OnClickListener() { // from class: l.hci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108699a.m65615q(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m65615q(View view) {
        ksg.m151175K0(m65608i(), m65612m(this.f42537m));
        i4g0.m138523u("e_moment_level", ksg.m151174K(this.f42537m, false), jyb.m147494Y("moment_level_id", "Lv" + this.f42538n));
    }

    public void setFrom(String str) {
        this.f42537m = str;
    }

    public FeedWriterLevelView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m65613o(context);
    }

    public FeedWriterLevelView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65613o(context);
    }

    public FeedWriterLevelView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m65613o(context);
    }
}
