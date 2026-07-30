package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.SettingGroups;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.UserPrivacySettings;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedPersonalizeSuggestGuideView;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.xdl0;
import l.zvf0;
import p007l.ijb0;
import p007l.ijh;
import p007l.nkg;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPersonalizeSuggestGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedPersonalizeSuggestGuideView f3902a;

    /* JADX INFO: renamed from: b */
    public VText f3903b;

    /* JADX INFO: renamed from: c */
    public VText f3904c;

    /* JADX INFO: renamed from: d */
    public VText f3905d;

    /* JADX INFO: renamed from: e */
    public boolean f3906e;

    public FeedPersonalizeSuggestGuideView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6272d(Throwable th) {
    }

    private String getPageId() {
        return nkg.m12263s() ? "p_discover_dating" : OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: e */
    public final void m6273e(View view) {
        ijh.m10940a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m6274f(User user) {
        if (user.settings.getSettingGroup().privacy.personalizeSuggest.booleanValue()) {
            xdl0.M(this.f3902a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m6275g(roj0 roj0Var) {
        xdl0.M(this.f3902a, false);
        osi0.g("个性化推荐已开启");
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m6276h(View view) {
        zvf0.r("e_personality_switch", getPageId());
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.personalizeSuggest = Boolean.TRUE;
        FeedModule.m1140H().patchSettings(settingGroups.subtract(ijb0.m10892C().settings.getSettingGroup())).subscribe(mkd0.H(new e30() { // from class: l.gjh
            public final void call(Object obj) {
                this.f8466a.m6275g((roj0) obj);
            }
        }, new e30() { // from class: l.hjh
            public final void call(Object obj) {
                FeedPersonalizeSuggestGuideView.m6272d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m6277i(Act act) {
        if (!this.f3906e) {
            this.f3906e = true;
            zvf0.x("e_personality_banner", getPageId());
        }
        act.duringCreated(ijb0.m10891B()).subscribe(mkd0.G(new e30() { // from class: l.ejh
            public final void call(Object obj) {
                this.f7403a.m6274f((User) obj);
            }
        }));
        xdl0.E0(this.f3905d, new View.OnClickListener() { // from class: l.fjh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8113a.m6276h(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6273e(this);
        this.f3903b.setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(xdl0.y0(), 1073741824), i2);
    }

    public FeedPersonalizeSuggestGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPersonalizeSuggestGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FeedPersonalizeSuggestGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
