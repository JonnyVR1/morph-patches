package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedPersonalizeSuggestGuideView;
import p147v.VText;
import p149l.e30;
import p149l.ijb0;
import p149l.ijh;
import p149l.mkd0;
import p149l.nkg;
import p149l.osi0;
import p149l.roj0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPersonalizeSuggestGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedPersonalizeSuggestGuideView f42441a;

    /* JADX INFO: renamed from: b */
    public VText f42442b;

    /* JADX INFO: renamed from: c */
    public VText f42443c;

    /* JADX INFO: renamed from: d */
    public VText f42444d;

    /* JADX INFO: renamed from: e */
    public boolean f42445e;

    public FeedPersonalizeSuggestGuideView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m65171d(Throwable th) {
    }

    private String getPageId() {
        return nkg.m159904s() ? "p_discover_dating" : OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: e */
    public final void m65172e(View view) {
        ijh.m136609a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m65173f(User user) {
        if (user.settings.getSettingGroup().privacy.personalizeSuggest.booleanValue()) {
            xdl0.m208344M(this.f42441a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m65174g(roj0 roj0Var) {
        xdl0.m208344M(this.f42441a, false);
        osi0.m165783g("个性化推荐已开启");
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m65175h(View view) {
        zvf0.m220396r("e_personality_switch", getPageId());
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.personalizeSuggest = Boolean.TRUE;
        FeedModule.m60222H().patchSettings(settingGroups.subtract(ijb0.m136539C().settings.getSettingGroup())).subscribe(mkd0.m154956H(new e30() { // from class: l.gjh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103039a.m65174g((roj0) obj);
            }
        }, new e30() { // from class: l.hjh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedPersonalizeSuggestGuideView.m65171d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m65176i(Act act) {
        if (!this.f42445e) {
            this.f42445e = true;
            zvf0.m220402x("e_personality_banner", getPageId());
        }
        act.duringCreated(ijb0.m136538B()).subscribe(mkd0.m154955G(new e30() { // from class: l.ejh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91722a.m65173f((User) obj);
            }
        }));
        xdl0.m208329E0(this.f42444d, new View.OnClickListener() { // from class: l.fjh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97778a.m65175h(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65172e(this);
        this.f42442b.setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(xdl0.m208412y0(), 1073741824), i2);
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
