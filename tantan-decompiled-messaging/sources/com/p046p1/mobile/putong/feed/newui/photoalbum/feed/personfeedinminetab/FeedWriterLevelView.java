package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.label.CommonTextureFrameLayout;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import p149l.f3c0;
import p149l.nbq0;
import p149l.qai;
import p149l.t100;
import p149l.tai;
import p149l.vqg;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedWriterLevelView extends CommonTextureFrameLayout implements nbq0 {

    /* JADX INFO: renamed from: k */
    public FrameLayout f41687k;

    /* JADX INFO: renamed from: l */
    public TextView f41688l;

    /* JADX INFO: renamed from: m */
    public String f41689m;

    /* JADX INFO: renamed from: n */
    public int f41690n;

    /* JADX INFO: renamed from: o */
    public boolean f41691o;

    public FeedWriterLevelView(@NonNull Context context, String str) {
        super(context);
        this.f41689m = str;
        m64430o(context);
    }

    private static String getWriterLevelNetLink() {
        return "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/creation/creationLevel/index.html?speed=true&_bid=1002741&%s";
    }

    /* JADX INFO: renamed from: n */
    public static String m64421n(String str) {
        StringBuilder sb = new StringBuilder("showFrom=");
        sb.append(str);
        String.format(getWriterLevelNetLink(), sb.toString());
        return String.format(getWriterLevelNetLink(), sb.toString());
    }

    @Override // p149l.nbq0
    /* JADX INFO: renamed from: a */
    public void mo64422a(User user, int i) {
        m64428l(user, i, false);
    }

    @Override // p149l.nbq0
    /* JADX INFO: renamed from: b */
    public void mo64423b(User user, int i) {
        m64428l(user, i, true);
    }

    @Override // p149l.nbq0
    public View getView() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    public View m64424h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tai.m187724b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public final Act m64425i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j */
    public void m64426j() {
        m64427k(true);
    }

    /* JADX INFO: renamed from: k */
    public void m64427k(boolean z) {
        if (z || !this.f41691o) {
            this.f41691o = true;
            zvf0.m220368A("e_moment_level", vqg.m199515K(this.f41689m, false), vwb.m200311Y("moment_level_id", "Lv" + this.f41690n));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m64428l(User user, int i, boolean z) {
        int iM173735a = new qai(user).m173735a();
        this.f41690n = iM173735a;
        if (iM173735a < i) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f41688l.setText(String.format("动态Lv%d", Integer.valueOf(this.f41690n)));
        boolean zMo30692I4 = FeedModule.m60222H().mo30692I4();
        int i2 = this.f41690n;
        if (!zMo30692I4) {
            FrameLayout frameLayout = this.f41687k;
            if (i2 == 0) {
                frameLayout.setBackgroundResource(f3c0.f94503d6);
            } else {
                frameLayout.setBackgroundResource(f3c0.f94495c6);
            }
        } else if (i2 == 0) {
            setBackgroundResource(f3c0.f94503d6);
        } else {
            setBackgroundResource(f3c0.f94588o3);
        }
        if (z) {
            m64427k(false);
        }
    }

    /* JADX INFO: renamed from: m */
    public String m64429m(String str) {
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
    public final void m64430o(Context context) {
        if (FeedModule.m60222H().mo30692I4()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, t100.m186890d(14.0f));
            layoutParams.gravity = 17;
            View viewM64424h = m64424h(LayoutInflater.from(context), this);
            viewM64424h.setPadding(viewM64424h.getPaddingLeft(), 0, viewM64424h.getPaddingRight(), 0);
            addView(viewM64424h, layoutParams);
            m21092d(true, t100.m186890d(4.0f));
            this.f41688l.setTextSize(8.0f);
        } else {
            addView(m64424h(LayoutInflater.from(context), this));
        }
        m64431p();
    }

    /* JADX INFO: renamed from: p */
    public final void m64431p() {
        setOnClickListener(new View.OnClickListener() { // from class: l.sai
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163409a.m64432q(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m64432q(View view) {
        vqg.m199516K0(m64425i(), m64429m(this.f41689m));
        zvf0.m220399u("e_moment_level", vqg.m199515K(this.f41689m, false), vwb.m200311Y("moment_level_id", "Lv" + this.f41690n));
    }

    public void setFrom(String str) {
        this.f41689m = str;
    }

    public FeedWriterLevelView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m64430o(context);
    }

    public FeedWriterLevelView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64430o(context);
    }

    public FeedWriterLevelView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m64430o(context);
    }
}
